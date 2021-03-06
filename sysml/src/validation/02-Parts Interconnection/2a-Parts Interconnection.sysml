package '2a-Parts Interconnection' {
	import Definitions::*;
	import Usages::*;

	package Definitions {		
		// Port Definitions
		
		port def FuelCmdPort;
		
		port def DrivePwrPort;
		port def ClutchPort;
		
		port def ShaftPort_a;
		port def ShaftPort_b;
		port def ShaftPort_c;
		port def ShaftPort_d;
		
		port def DiffPort;
		port def AxlePort;
		port def AxleToWheelPort;
		port def WheelToAxlePort;
		port def WheelToRoadPort;
		
		/**
		 * A port definition can have nested ports.
		 */
		port def VehicleToRoadPort { 
			port wheelToRoadPort: WheelToRoadPort[2];
		}
	
		// Blocks
	
		part def VehicleA { 
			port fuelCmdPort: FuelCmdPort;
			port vehicleToRoadPort: VehicleToRoadPort;
		}
		
		part def AxleAssembly;		
		part def RearAxleAssembly :> AxleAssembly { 
			port shaftPort_d: ShaftPort_d;
		}
		
		part def Axle;
		part def RearAxle :> Axle;
		
		part def HalfAxle { 
			port axleToDiffPort: AxlePort;
			port axleToWheelPort: AxleToWheelPort;
		}
		
		part def Engine { 
			port fuelCmdPort: FuelCmdPort;
			port drivePwrPort: DrivePwrPort;
		}
	
		part def Transmission { 
			port clutchPort: ClutchPort;
			port shaftPort_a: ShaftPort_a;
		}
		
		part def Driveshaft { 
			port shaftPort_b: ShaftPort_b;
			port shaftPort_c: ShaftPort_c;
		}	
		
		/**
		 * Ports do not have to be defined on part defs.
		 * They can be added directly to their usages.
		 */
		part def Differential;
		part def Wheel;
		
		// Interface Definitions
		
		/**
		 * The ends of an interface definition are always ports.
		 */
		interface def EngineToTransmissionInterface {
			end drivePwrPort: DrivePwrPort;
			end clutchPort: ClutchPort;
		}
		
		interface def DriveshaftInterface {
			end shaftPort_a: ShaftPort_a;
			end shaftPort_d: ShaftPort_d;
			
			/**
			 * 'driveshaft' is a reference to the driveshaft that will
			 * act as the "interface medium" for this interface.
			 */
			ref driveshaft: Driveshaft {
				port shaftPort_b :>> Driveshaft::shaftPort_b;
				port shaftPort_c :>> Driveshaft::shaftPort_c;
			}
			
			/**
			 * The two ends of 'DriveShaftInterface' are always connected
			 * via the referenced 'driveshaft'.
			 */
			connect shaftPort_a to driveshaft::shaftPort_b;
			connect driveshaft::shaftPort_c to shaftPort_d;
		}
		
	}
	
	package Usages {
	
		part vehicle1_c1: VehicleA {
			
			/**
			 * Inherited ports are redefined to provide "local connection points".
			 * ("::>>" is a shorthand for "redefines".)
			 */
			port fuelCmdPort :>> VehicleA::fuelCmdPort;
			
			bind fuelCmdPort = engine::fuelCmdPort;
			
			part engine: Engine {
				port fuelCmdPort :>> Engine::fuelCmdPort;
				port drivePwrPort :>> Engine::drivePwrPort;
			}
			
			/**
			 * A usage of an interface definition connects two ports relative to 
			 * a containing context.
			 */
			interface :EngineToTransmissionInterface
				connect engine::drivePwrPort to transmission::clutchPort;
				
			part transmission: Transmission {
				port clutchPort :>> Transmission::clutchPort;
				port shaftPort_a :>> Transmission::shaftPort_a;	
			}
			
			/**
			 * This 'driveshaft' is the part of 'vehicle1_c1' that will act as the
			 * interface medium in the following 'DriveshaftInterface' usage.
			 */
			part driveshaft: Driveshaft;
			
			interface :DriveshaftInterface
				connect transmission::shaftPort_a to rearAxleAssembly::shaftPort_d {
					/**
					 * The reference property from 'DriveshaftInterface' is redefined
					 * in order to bind it to the appropriate part of 'vehicle1_c1'.
					 */
					ref :>> DriveshaftInterface::driveshaft = vehicle1_c1::driveshaft;
				}
	
			part rearAxleAssembly: RearAxleAssembly {
				port shaftPort_d: ShaftPort_d :>> RearAxleAssembly::shaftPort_d;
	
				bind shaftPort_d = differential::shaftPort_d;
				
				part differential: Differential {
					/**
					 * If the part def has no ports, then they can be defined directly in
					 * a usage of the part def.
					 */
					port shaftPort_d: ShaftPort_d;
					port leftDiffPort: DiffPort;
					port rightDiffPort: DiffPort;
				}
				
				/* TODO: Allow use of "interface" keyword for an unnamed, default-typed interface usage. */
				
				/**
				 * A connection can be to a port that is arbitrarily deeply nested, on either end. 
				 */
				connect differential::leftDiffPort to rearAxle::leftHalfAxle::leftAxleToDiffPort;
				connect differential::rightDiffPort to rearAxle::rightHalfAxle::rightAxleToDiffPort;
		
				part rearAxle: RearAxle {
					part leftHalfAxle: HalfAxle {
						port leftAxleToDiffPort :>> HalfAxle::axleToDiffPort;
						port leftAxleToWheelPort :>> HalfAxle::axleToWheelPort;
					}
					part rightHalfAxle: HalfAxle  {
						port rightAxleToDiffPort :>> HalfAxle::axleToDiffPort;
						port rightAxleToWheelPort :>> HalfAxle::axleToWheelPort;
					}
				}
				
				connect rearAxle::leftHalfAxle::leftAxleToWheelPort to leftWheel::wheelToAxlePort;
				connect rearAxle::rightHalfAxle::rightAxleToWheelPort to rightWheel::wheelToAxlePort;
	
				part rearWheel: Wheel[2] ordered;
				
				/* The two rear wheels of 'rearAxleAssembly' must be given
				 * their own names in order to be referenced in connections.
				 * 
				 * (":>" is a shorthand here for "subsets".)
				 */
				part leftWheel :> rearWheel = rearWheel[1] {
					port wheelToAxlePort: WheelToAxlePort;
					port wheelToRoadPort: WheelToRoadPort;
				}
				
				part rightWheel :> rearWheel = rearWheel[2] {
					port wheelToAxlePort: WheelToAxlePort;
					port wheelToRoadPort: WheelToRoadPort;
				}
				
			}
			
			bind rearAxleAssembly::leftWheel::wheelToRoadPort = 
				 vehicleToRoadPort::leftWheelToRoadPort;
				 
			bind rearAxleAssembly::rightWheel::wheelToRoadPort = 
				 vehicleToRoadPort::rightWheelToRoadPort;
				
			port vehicleToRoadPort redefines VehicleA::vehicleToRoadPort {
				port leftWheelToRoadPort :> wheelToRoadPort = wheelToRoadPort[1];
				port rightWheelToRoadPort :> wheelToRoadPort = wheelToRoadPort[2];
			}
			
		}
	
	}
	
}
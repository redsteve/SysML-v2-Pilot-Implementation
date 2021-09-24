package RequirementMetadataExample {
	import ModelingMetadata::*;
	import RiskMetadata::*;
	import RiskLevelEnum::*;
	
    requirement id '1' vehicleMassRequirement {
        doc /* The total mass of a vehicle shall be less than or equal to the required mass. */
 
        @StatusInfo {
            status = StatusKind::tbd;
            risk = requirement_1_risk;            
            originator = "Bob";
            owner = "Mary";
        }
    }
    
    metadata requirement_1_risk : Risk {
    	totalRisk = H;
    	technicalRisk = M;
    	scheduleRisk = M;
    	costRisk = M;
    }
}
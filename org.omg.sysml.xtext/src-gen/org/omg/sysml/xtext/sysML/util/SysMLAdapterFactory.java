/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.xtext.sysML.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.omg.sysml.xtext.sysML.BasicFeature;
import org.omg.sysml.xtext.sysML.BlockDefinition;
import org.omg.sysml.xtext.sysML.Bound;
import org.omg.sysml.xtext.sysML.ConnectableFeature;
import org.omg.sysml.xtext.sysML.ConnectionDirection;
import org.omg.sysml.xtext.sysML.Connector;
import org.omg.sysml.xtext.sysML.Container;
import org.omg.sysml.xtext.sysML.Definition;
import org.omg.sysml.xtext.sysML.Expression;
import org.omg.sysml.xtext.sysML.Feature;
import org.omg.sysml.xtext.sysML.FeatureReferenceExpression;
import org.omg.sysml.xtext.sysML.Import;
import org.omg.sysml.xtext.sysML.IntegerLiteral;
import org.omg.sysml.xtext.sysML.Member;
import org.omg.sysml.xtext.sysML.Multiplicity;
import org.omg.sysml.xtext.sysML.NumericLiteral;
import org.omg.sysml.xtext.sysML.PackageMember;
import org.omg.sysml.xtext.sysML.Part;
import org.omg.sysml.xtext.sysML.RealLiteral;
import org.omg.sysml.xtext.sysML.Sign;
import org.omg.sysml.xtext.sysML.SysMLPackage;
import org.omg.sysml.xtext.sysML.Units;
import org.omg.sysml.xtext.sysML.UnitsExponent;
import org.omg.sysml.xtext.sysML.UnitsProduct;
import org.omg.sysml.xtext.sysML.UpperBound;
import org.omg.sysml.xtext.sysML.UsageIndex;
import org.omg.sysml.xtext.sysML.ValueTypeDefinition;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.omg.sysml.xtext.sysML.SysMLPackage
 * @generated
 */
public class SysMLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SysMLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SysMLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SysMLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SysMLSwitch<Adapter> modelSwitch =
    new SysMLSwitch<Adapter>()
    {
      @Override
      public Adapter caseContainer(Container object)
      {
        return createContainerAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter casePackage(org.omg.sysml.xtext.sysML.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter casePackageMember(PackageMember object)
      {
        return createPackageMemberAdapter();
      }
      @Override
      public Adapter caseDefinition(Definition object)
      {
        return createDefinitionAdapter();
      }
      @Override
      public Adapter caseValueTypeDefinition(ValueTypeDefinition object)
      {
        return createValueTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseBlockDefinition(BlockDefinition object)
      {
        return createBlockDefinitionAdapter();
      }
      @Override
      public Adapter casePart(Part object)
      {
        return createPartAdapter();
      }
      @Override
      public Adapter caseMember(Member object)
      {
        return createMemberAdapter();
      }
      @Override
      public Adapter caseUsageIndex(UsageIndex object)
      {
        return createUsageIndexAdapter();
      }
      @Override
      public Adapter caseMultiplicity(Multiplicity object)
      {
        return createMultiplicityAdapter();
      }
      @Override
      public Adapter caseBound(Bound object)
      {
        return createBoundAdapter();
      }
      @Override
      public Adapter caseUpperBound(UpperBound object)
      {
        return createUpperBoundAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseBasicFeature(BasicFeature object)
      {
        return createBasicFeatureAdapter();
      }
      @Override
      public Adapter caseConnectableFeature(ConnectableFeature object)
      {
        return createConnectableFeatureAdapter();
      }
      @Override
      public Adapter caseConnectionDirection(ConnectionDirection object)
      {
        return createConnectionDirectionAdapter();
      }
      @Override
      public Adapter caseConnector(Connector object)
      {
        return createConnectorAdapter();
      }
      @Override
      public Adapter caseUnits(Units object)
      {
        return createUnitsAdapter();
      }
      @Override
      public Adapter caseUnitsProduct(UnitsProduct object)
      {
        return createUnitsProductAdapter();
      }
      @Override
      public Adapter caseUnitsExponent(UnitsExponent object)
      {
        return createUnitsExponentAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseFeatureReferenceExpression(FeatureReferenceExpression object)
      {
        return createFeatureReferenceExpressionAdapter();
      }
      @Override
      public Adapter caseNumericLiteral(NumericLiteral object)
      {
        return createNumericLiteralAdapter();
      }
      @Override
      public Adapter caseIntegerLiteral(IntegerLiteral object)
      {
        return createIntegerLiteralAdapter();
      }
      @Override
      public Adapter caseRealLiteral(RealLiteral object)
      {
        return createRealLiteralAdapter();
      }
      @Override
      public Adapter caseSign(Sign object)
      {
        return createSignAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.Container <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.Container
   * @generated
   */
  public Adapter createContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.PackageMember <em>Package Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.PackageMember
   * @generated
   */
  public Adapter createPackageMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.Definition
   * @generated
   */
  public Adapter createDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.ValueTypeDefinition <em>Value Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.ValueTypeDefinition
   * @generated
   */
  public Adapter createValueTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.BlockDefinition <em>Block Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.BlockDefinition
   * @generated
   */
  public Adapter createBlockDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.Part <em>Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.Part
   * @generated
   */
  public Adapter createPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.Member
   * @generated
   */
  public Adapter createMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.UsageIndex <em>Usage Index</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.UsageIndex
   * @generated
   */
  public Adapter createUsageIndexAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.Multiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.Multiplicity
   * @generated
   */
  public Adapter createMultiplicityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.Bound <em>Bound</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.Bound
   * @generated
   */
  public Adapter createBoundAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.UpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.UpperBound
   * @generated
   */
  public Adapter createUpperBoundAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.BasicFeature <em>Basic Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.BasicFeature
   * @generated
   */
  public Adapter createBasicFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.ConnectableFeature <em>Connectable Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.ConnectableFeature
   * @generated
   */
  public Adapter createConnectableFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.ConnectionDirection <em>Connection Direction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.ConnectionDirection
   * @generated
   */
  public Adapter createConnectionDirectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.Connector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.Connector
   * @generated
   */
  public Adapter createConnectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.Units <em>Units</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.Units
   * @generated
   */
  public Adapter createUnitsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.UnitsProduct <em>Units Product</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.UnitsProduct
   * @generated
   */
  public Adapter createUnitsProductAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.UnitsExponent <em>Units Exponent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.UnitsExponent
   * @generated
   */
  public Adapter createUnitsExponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.FeatureReferenceExpression <em>Feature Reference Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.FeatureReferenceExpression
   * @generated
   */
  public Adapter createFeatureReferenceExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.NumericLiteral <em>Numeric Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.NumericLiteral
   * @generated
   */
  public Adapter createNumericLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.IntegerLiteral
   * @generated
   */
  public Adapter createIntegerLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.RealLiteral <em>Real Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.RealLiteral
   * @generated
   */
  public Adapter createRealLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.omg.sysml.xtext.sysML.Sign <em>Sign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.omg.sysml.xtext.sysML.Sign
   * @generated
   */
  public Adapter createSignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SysMLAdapterFactory
/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.usage.sysML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.omg.sysml.usage.sysML.SysMLPackage;
import org.omg.sysml.usage.sysML.Units;
import org.omg.sysml.usage.sysML.UnitsProduct;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Units</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.usage.sysML.impl.UnitsImpl#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link org.omg.sysml.usage.sysML.impl.UnitsImpl#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitsImpl extends MinimalEObjectImpl.Container implements Units
{
  /**
   * The cached value of the '{@link #getNumerator() <em>Numerator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumerator()
   * @generated
   * @ordered
   */
  protected UnitsProduct numerator;

  /**
   * The cached value of the '{@link #getDenominator() <em>Denominator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDenominator()
   * @generated
   * @ordered
   */
  protected UnitsProduct denominator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnitsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SysMLPackage.Literals.UNITS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitsProduct getNumerator()
  {
    return numerator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumerator(UnitsProduct newNumerator, NotificationChain msgs)
  {
    UnitsProduct oldNumerator = numerator;
    numerator = newNumerator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.UNITS__NUMERATOR, oldNumerator, newNumerator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumerator(UnitsProduct newNumerator)
  {
    if (newNumerator != numerator)
    {
      NotificationChain msgs = null;
      if (numerator != null)
        msgs = ((InternalEObject)numerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.UNITS__NUMERATOR, null, msgs);
      if (newNumerator != null)
        msgs = ((InternalEObject)newNumerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.UNITS__NUMERATOR, null, msgs);
      msgs = basicSetNumerator(newNumerator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.UNITS__NUMERATOR, newNumerator, newNumerator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitsProduct getDenominator()
  {
    return denominator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDenominator(UnitsProduct newDenominator, NotificationChain msgs)
  {
    UnitsProduct oldDenominator = denominator;
    denominator = newDenominator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.UNITS__DENOMINATOR, oldDenominator, newDenominator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDenominator(UnitsProduct newDenominator)
  {
    if (newDenominator != denominator)
    {
      NotificationChain msgs = null;
      if (denominator != null)
        msgs = ((InternalEObject)denominator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.UNITS__DENOMINATOR, null, msgs);
      if (newDenominator != null)
        msgs = ((InternalEObject)newDenominator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.UNITS__DENOMINATOR, null, msgs);
      msgs = basicSetDenominator(newDenominator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.UNITS__DENOMINATOR, newDenominator, newDenominator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SysMLPackage.UNITS__NUMERATOR:
        return basicSetNumerator(null, msgs);
      case SysMLPackage.UNITS__DENOMINATOR:
        return basicSetDenominator(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SysMLPackage.UNITS__NUMERATOR:
        return getNumerator();
      case SysMLPackage.UNITS__DENOMINATOR:
        return getDenominator();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SysMLPackage.UNITS__NUMERATOR:
        setNumerator((UnitsProduct)newValue);
        return;
      case SysMLPackage.UNITS__DENOMINATOR:
        setDenominator((UnitsProduct)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SysMLPackage.UNITS__NUMERATOR:
        setNumerator((UnitsProduct)null);
        return;
      case SysMLPackage.UNITS__DENOMINATOR:
        setDenominator((UnitsProduct)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SysMLPackage.UNITS__NUMERATOR:
        return numerator != null;
      case SysMLPackage.UNITS__DENOMINATOR:
        return denominator != null;
    }
    return super.eIsSet(featureID);
  }

} //UnitsImpl
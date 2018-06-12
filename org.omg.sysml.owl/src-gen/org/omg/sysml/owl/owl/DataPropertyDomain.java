/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.owl.owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.owl.owl.DataPropertyDomain#getDataPropertyExpressions <em>Data Property Expressions</em>}</li>
 *   <li>{@link org.omg.sysml.owl.owl.DataPropertyDomain#getClassExpression <em>Class Expression</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.owl.owl.OwlPackage#getDataPropertyDomain()
 * @model
 * @generated
 */
public interface DataPropertyDomain extends DataPropertyAxiom
{
  /**
   * Returns the value of the '<em><b>Data Property Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.omg.sysml.owl.owl.DataPropertyExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Property Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Property Expressions</em>' containment reference list.
   * @see org.omg.sysml.owl.owl.OwlPackage#getDataPropertyDomain_DataPropertyExpressions()
   * @model containment="true"
   * @generated
   */
  EList<DataPropertyExpression> getDataPropertyExpressions();

  /**
   * Returns the value of the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Expression</em>' containment reference.
   * @see #setClassExpression(ClassExpression)
   * @see org.omg.sysml.owl.owl.OwlPackage#getDataPropertyDomain_ClassExpression()
   * @model containment="true"
   * @generated
   */
  ClassExpression getClassExpression();

  /**
   * Sets the value of the '{@link org.omg.sysml.owl.owl.DataPropertyDomain#getClassExpression <em>Class Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Expression</em>' containment reference.
   * @see #getClassExpression()
   * @generated
   */
  void setClassExpression(ClassExpression value);

} // DataPropertyDomain
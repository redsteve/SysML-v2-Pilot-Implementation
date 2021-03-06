/**
 * generated by Xtext 2.18.0.M3
 */
package org.omg.kerml.owl.owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.kerml.owl.owl.DataPropertyAxiom#getAxiomAnnotations <em>Axiom Annotations</em>}</li>
 * </ul>
 *
 * @see org.omg.kerml.owl.owl.OwlPackage#getDataPropertyAxiom()
 * @model
 * @generated
 */
public interface DataPropertyAxiom extends Axiom
{
  /**
   * Returns the value of the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * The list contents are of type {@link org.omg.kerml.owl.owl.Annotation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Axiom Annotations</em>' containment reference list.
   * @see org.omg.kerml.owl.owl.OwlPackage#getDataPropertyAxiom_AxiomAnnotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAxiomAnnotations();

} // DataPropertyAxiom

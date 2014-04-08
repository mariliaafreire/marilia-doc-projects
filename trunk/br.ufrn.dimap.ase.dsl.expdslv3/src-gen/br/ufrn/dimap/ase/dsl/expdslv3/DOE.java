/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DOE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.DOE#getTreatment <em>Treatment</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getDOE()
 * @model
 * @generated
 */
public interface DOE extends EObject
{
  /**
   * Returns the value of the '<em><b>Treatment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Treatment</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Treatment</em>' reference.
   * @see #setTreatment(Factor)
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getDOE_Treatment()
   * @model
   * @generated
   */
  Factor getTreatment();

  /**
   * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.DOE#getTreatment <em>Treatment</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Treatment</em>' reference.
   * @see #getTreatment()
   * @generated
   */
  void setTreatment(Factor value);

} // DOE

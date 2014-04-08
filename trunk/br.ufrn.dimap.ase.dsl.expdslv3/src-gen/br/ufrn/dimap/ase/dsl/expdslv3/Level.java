/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Level#getLev <em>Lev</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getLevel()
 * @model
 * @generated
 */
public interface Level extends EObject
{
  /**
   * Returns the value of the '<em><b>Lev</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lev</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lev</em>' reference.
   * @see #setLev(Range)
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getLevel_Lev()
   * @model
   * @generated
   */
  Range getLev();

  /**
   * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.Level#getLev <em>Lev</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lev</em>' reference.
   * @see #getLev()
   * @generated
   */
  void setLev(Range value);

} // Level

/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.LS#getCol <em>Col</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.LS#getRow <em>Row</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getLS()
 * @model
 * @generated
 */
public interface LS extends DOE
{
  /**
   * Returns the value of the '<em><b>Col</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Col</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Col</em>' reference.
   * @see #setCol(Factor)
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getLS_Col()
   * @model
   * @generated
   */
  Factor getCol();

  /**
   * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.LS#getCol <em>Col</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Col</em>' reference.
   * @see #getCol()
   * @generated
   */
  void setCol(Factor value);

  /**
   * Returns the value of the '<em><b>Row</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Row</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Row</em>' reference.
   * @see #setRow(Factor)
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getLS_Row()
   * @model
   * @generated
   */
  Factor getRow();

  /**
   * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.LS#getRow <em>Row</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Row</em>' reference.
   * @see #getRow()
   * @generated
   */
  void setRow(Factor value);

} // LS

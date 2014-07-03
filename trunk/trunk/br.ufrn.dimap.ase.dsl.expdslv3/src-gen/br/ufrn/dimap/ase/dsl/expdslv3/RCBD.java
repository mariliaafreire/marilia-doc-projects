/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RCBD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.RCBD#getBlockVariable <em>Block Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getRCBD()
 * @model
 * @generated
 */
public interface RCBD extends DOE
{
  /**
	 * Returns the value of the '<em><b>Block Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Variable</em>' reference.
	 * @see #setBlockVariable(Variable)
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getRCBD_BlockVariable()
	 * @model
	 * @generated
	 */
  Variable getBlockVariable();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.RCBD#getBlockVariable <em>Block Variable</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Variable</em>' reference.
	 * @see #getBlockVariable()
	 * @generated
	 */
  void setBlockVariable(Variable value);

} // RCBD

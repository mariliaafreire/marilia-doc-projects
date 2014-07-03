/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Factor#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getFactor()
 * @model
 * @generated
 */
public interface Factor extends EObject
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(Variable)
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getFactor_Name()
	 * @model
	 * @generated
	 */
  Variable getName();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.Factor#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
  void setName(Variable value);

} // Factor

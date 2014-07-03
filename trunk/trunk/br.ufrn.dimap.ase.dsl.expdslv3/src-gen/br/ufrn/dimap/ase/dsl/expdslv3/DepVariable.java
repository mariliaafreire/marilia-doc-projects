/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dep Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.DepVariable#getVariable <em>Variable</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.DepVariable#getRq <em>Rq</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.DepVariable#getRh <em>Rh</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getDepVariable()
 * @model
 * @generated
 */
public interface DepVariable extends EObject
{
  /**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getDepVariable_Variable()
	 * @model
	 * @generated
	 */
  Variable getVariable();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.DepVariable#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
  void setVariable(Variable value);

  /**
	 * Returns the value of the '<em><b>Rq</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rq</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Rq</em>' reference.
	 * @see #setRq(ResearchQuestion)
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getDepVariable_Rq()
	 * @model
	 * @generated
	 */
  ResearchQuestion getRq();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.DepVariable#getRq <em>Rq</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rq</em>' reference.
	 * @see #getRq()
	 * @generated
	 */
  void setRq(ResearchQuestion value);

  /**
	 * Returns the value of the '<em><b>Rh</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rh</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Rh</em>' reference.
	 * @see #setRh(ResearchHypothesis)
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getDepVariable_Rh()
	 * @model
	 * @generated
	 */
  ResearchHypothesis getRh();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.DepVariable#getRh <em>Rh</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rh</em>' reference.
	 * @see #getRh()
	 * @generated
	 */
  void setRh(ResearchHypothesis value);

} // DepVariable

/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hypotheses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getDescription <em>Description</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getType <em>Type</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getFromGoal <em>From Goal</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getSubhypotheses <em>Subhypotheses</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getHypotheses()
 * @model
 * @generated
 */
public interface Hypotheses extends EObject
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getHypotheses_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getHypotheses_Description()
	 * @model
	 * @generated
	 */
  String getDescription();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
  void setDescription(String value);

  /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufrn.dimap.ase.dsl.expDslv2.HypothesisType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.HypothesisType
	 * @see #setType(HypothesisType)
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getHypotheses_Type()
	 * @model
	 * @generated
	 */
  HypothesisType getType();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.HypothesisType
	 * @see #getType()
	 * @generated
	 */
  void setType(HypothesisType value);

  /**
	 * Returns the value of the '<em><b>From Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Goal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>From Goal</em>' reference.
	 * @see #setFromGoal(Goal)
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getHypotheses_FromGoal()
	 * @model
	 * @generated
	 */
  Goal getFromGoal();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getFromGoal <em>From Goal</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Goal</em>' reference.
	 * @see #getFromGoal()
	 * @generated
	 */
  void setFromGoal(Goal value);

  /**
	 * Returns the value of the '<em><b>Subhypotheses</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subhypotheses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Subhypotheses</em>' containment reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getHypotheses_Subhypotheses()
	 * @model containment="true"
	 * @generated
	 */
  EList<Subhypotheses> getSubhypotheses();

} // Hypotheses

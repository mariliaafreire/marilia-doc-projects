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
 * A representation of the model object '<em><b>Experiment Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement#getExperiments <em>Experiments</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement#getProcess <em>Process</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement#getQuestionnaire <em>Questionnaire</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getExperimentElement()
 * @model
 * @generated
 */
public interface ExperimentElement extends EObject
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
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getExperimentElement_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Experiments</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Experiments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiments</em>' containment reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getExperimentElement_Experiments()
	 * @model containment="true"
	 * @generated
	 */
  EList<ExperimentalPlan> getExperiments();

  /**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.Process}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getExperimentElement_Process()
	 * @model containment="true"
	 * @generated
	 */
  EList<br.ufrn.dimap.ase.dsl.expDslv2.Process> getProcess();

  /**
	 * Returns the value of the '<em><b>Metrics</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.Metrics}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metrics</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' containment reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getExperimentElement_Metrics()
	 * @model containment="true"
	 * @generated
	 */
  EList<Metrics> getMetrics();

  /**
	 * Returns the value of the '<em><b>Questionnaire</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Questionnaire</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Questionnaire</em>' containment reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getExperimentElement_Questionnaire()
	 * @model containment="true"
	 * @generated
	 */
  EList<Questionnaire> getQuestionnaire();

} // ExperimentElement

/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3;

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
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement#getDescription <em>Description</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement#getExperiments <em>Experiments</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement#getProcess <em>Process</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement#getQuestionnaire <em>Questionnaire</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getExperimentElement()
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
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getExperimentElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement#getName <em>Name</em>}' attribute.
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
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getExperimentElement_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Experiments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Experiments</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Experiments</em>' containment reference.
   * @see #setExperiments(ExperimentalDesign)
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getExperimentElement_Experiments()
   * @model containment="true"
   * @generated
   */
  ExperimentalDesign getExperiments();

  /**
   * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement#getExperiments <em>Experiments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Experiments</em>' containment reference.
   * @see #getExperiments()
   * @generated
   */
  void setExperiments(ExperimentalDesign value);

  /**
   * Returns the value of the '<em><b>Process</b></em>' containment reference list.
   * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expdslv3.Process}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process</em>' containment reference list.
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getExperimentElement_Process()
   * @model containment="true"
   * @generated
   */
  EList<br.ufrn.dimap.ase.dsl.expdslv3.Process> getProcess();

  /**
   * Returns the value of the '<em><b>Questionnaire</b></em>' containment reference list.
   * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Questionnaire</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Questionnaire</em>' containment reference list.
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getExperimentElement_Questionnaire()
   * @model containment="true"
   * @generated
   */
  EList<Questionnaire> getQuestionnaire();

} // ExperimentElement

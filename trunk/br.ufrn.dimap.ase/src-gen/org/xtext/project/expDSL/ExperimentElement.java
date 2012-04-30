/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.project.expDSL;

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
 *   <li>{@link org.xtext.project.expDSL.ExperimentElement#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.ExperimentElement#getProcess <em>Process</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.ExperimentElement#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.ExperimentElement#getExperiments <em>Experiments</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.ExperimentElement#getQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.project.expDSL.ExpDSLPackage#getExperimentElement()
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
   * @see org.xtext.project.expDSL.ExpDSLPackage#getExperimentElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.project.expDSL.ExperimentElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Process</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.expDSL.Process}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process</em>' containment reference list.
   * @see org.xtext.project.expDSL.ExpDSLPackage#getExperimentElement_Process()
   * @model containment="true"
   * @generated
   */
  EList<org.xtext.project.expDSL.Process> getProcess();

  /**
   * Returns the value of the '<em><b>Metrics</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.expDSL.Metrics}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metrics</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metrics</em>' containment reference list.
   * @see org.xtext.project.expDSL.ExpDSLPackage#getExperimentElement_Metrics()
   * @model containment="true"
   * @generated
   */
  EList<Metrics> getMetrics();

  /**
   * Returns the value of the '<em><b>Experiments</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.expDSL.ExperimentalPlan}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Experiments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Experiments</em>' containment reference list.
   * @see org.xtext.project.expDSL.ExpDSLPackage#getExperimentElement_Experiments()
   * @model containment="true"
   * @generated
   */
  EList<ExperimentalPlan> getExperiments();

  /**
   * Returns the value of the '<em><b>Question</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.expDSL.Questions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Question</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Question</em>' containment reference list.
   * @see org.xtext.project.expDSL.ExpDSLPackage#getExperimentElement_Question()
   * @model containment="true"
   * @generated
   */
  EList<Questions> getQuestion();

} // ExperimentElement

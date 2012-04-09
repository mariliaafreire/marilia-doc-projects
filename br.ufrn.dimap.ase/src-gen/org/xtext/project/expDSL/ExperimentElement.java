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
 *   <li>{@link org.xtext.project.expDSL.ExperimentElement#getProcess <em>Process</em>}</li>
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
	 * The list contents are of type {@link org.xtext.project.expDSL.Question}.
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
  EList<Question> getQuestion();

} // ExperimentElement

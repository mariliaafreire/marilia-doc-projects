/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jpdl31.Questionnaire#getQuestion <em>Question</em>}</li>
 *   <li>{@link jpdl31.Questionnaire#getName <em>Name</em>}</li>
 *   <li>{@link jpdl31.Questionnaire#getType <em>Type</em>}</li>
 *   <li>{@link jpdl31.Questionnaire#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see jpdl31.Jpdl31Package#getQuestionnaire()
 * @model
 * @generated
 */
public interface Questionnaire extends EObject {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getQuestionnaire_Question()
	 * @model containment="true"
	 * @generated
	 */
	EList<Question> getQuestion();

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
	 * @see jpdl31.Jpdl31Package#getQuestionnaire_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link jpdl31.Questionnaire#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link jpdl31.QuestionnaireType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see jpdl31.QuestionnaireType
	 * @see #setType(QuestionnaireType)
	 * @see jpdl31.Jpdl31Package#getQuestionnaire_Type()
	 * @model
	 * @generated
	 */
	QuestionnaireType getType();

	/**
	 * Sets the value of the '{@link jpdl31.Questionnaire#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see jpdl31.QuestionnaireType
	 * @see #getType()
	 * @generated
	 */
	void setType(QuestionnaireType value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' reference.
	 * @see #setProcess(ProcessDefinitionType)
	 * @see jpdl31.Jpdl31Package#getQuestionnaire_Process()
	 * @model
	 * @generated
	 */
	ProcessDefinitionType getProcess();

	/**
	 * Sets the value of the '{@link jpdl31.Questionnaire#getProcess <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(ProcessDefinitionType value);

} // Questionnaire

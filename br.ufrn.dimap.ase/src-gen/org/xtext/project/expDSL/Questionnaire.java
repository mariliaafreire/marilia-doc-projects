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
 * A representation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.project.expDSL.Questionnaire#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Questionnaire#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Questionnaire#getQuestionnaireType <em>Questionnaire Type</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Questionnaire#getQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.project.expDSL.ExpDSLPackage#getQuestionnaire()
 * @model
 * @generated
 */
public interface Questionnaire extends EObject
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
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getQuestionnaire_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.xtext.project.expDSL.Questionnaire#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Relates To</b></em>' reference list.
	 * The list contents are of type {@link org.xtext.project.expDSL.Process}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relates To</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Relates To</em>' reference list.
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getQuestionnaire_RelatesTo()
	 * @model
	 * @generated
	 */
  EList<org.xtext.project.expDSL.Process> getRelatesTo();

  /**
	 * Returns the value of the '<em><b>Questionnaire Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.xtext.project.expDSL.QuestionnaireType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Questionnaire Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Questionnaire Type</em>' attribute.
	 * @see org.xtext.project.expDSL.QuestionnaireType
	 * @see #setQuestionnaireType(QuestionnaireType)
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getQuestionnaire_QuestionnaireType()
	 * @model
	 * @generated
	 */
  QuestionnaireType getQuestionnaireType();

  /**
	 * Sets the value of the '{@link org.xtext.project.expDSL.Questionnaire#getQuestionnaireType <em>Questionnaire Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questionnaire Type</em>' attribute.
	 * @see org.xtext.project.expDSL.QuestionnaireType
	 * @see #getQuestionnaireType()
	 * @generated
	 */
  void setQuestionnaireType(QuestionnaireType value);

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
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getQuestionnaire_Question()
	 * @model containment="true"
	 * @generated
	 */
  EList<Question> getQuestion();

} // Questionnaire

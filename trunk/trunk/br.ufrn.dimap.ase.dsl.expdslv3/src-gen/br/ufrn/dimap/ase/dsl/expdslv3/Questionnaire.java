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
 * A representation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire#getQuestionnaireType <em>Questionnaire Type</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire#getQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getQuestionnaire()
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
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getQuestionnaire_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Relates To</b></em>' reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expdslv3.Process}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relates To</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Relates To</em>' reference list.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getQuestionnaire_RelatesTo()
	 * @model
	 * @generated
	 */
  EList<br.ufrn.dimap.ase.dsl.expdslv3.Process> getRelatesTo();

  /**
	 * Returns the value of the '<em><b>Questionnaire Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufrn.dimap.ase.dsl.expdslv3.QuestionnaireType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Questionnaire Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Questionnaire Type</em>' attribute.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.QuestionnaireType
	 * @see #setQuestionnaireType(QuestionnaireType)
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getQuestionnaire_QuestionnaireType()
	 * @model
	 * @generated
	 */
  QuestionnaireType getQuestionnaireType();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire#getQuestionnaireType <em>Questionnaire Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questionnaire Type</em>' attribute.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.QuestionnaireType
	 * @see #getQuestionnaireType()
	 * @generated
	 */
  void setQuestionnaireType(QuestionnaireType value);

  /**
	 * Returns the value of the '<em><b>Question</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expdslv3.Question}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Question</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' containment reference list.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getQuestionnaire_Question()
	 * @model containment="true"
	 * @generated
	 */
  EList<Question> getQuestion();

} // Questionnaire

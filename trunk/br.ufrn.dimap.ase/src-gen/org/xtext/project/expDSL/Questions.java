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
 * A representation of the model object '<em><b>Questions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.project.expDSL.Questions#getQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.project.expDSL.ExpDSLPackage#getQuestions()
 * @model
 * @generated
 */
public interface Questions extends EObject
{
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
   * @see org.xtext.project.expDSL.ExpDSLPackage#getQuestions_Question()
   * @model containment="true"
   * @generated
   */
  EList<Question> getQuestion();

} // Questions

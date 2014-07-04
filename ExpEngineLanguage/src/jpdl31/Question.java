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
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jpdl31.Question#getDescription <em>Description</em>}</li>
 *   <li>{@link jpdl31.Question#getType <em>Type</em>}</li>
 *   <li>{@link jpdl31.Question#getRequired <em>Required</em>}</li>
 *   <li>{@link jpdl31.Question#getOption <em>Option</em>}</li>
 *   <li>{@link jpdl31.Question#getEReference0 <em>EReference0</em>}</li>
 * </ul>
 * </p>
 *
 * @see jpdl31.Jpdl31Package#getQuestion()
 * @model
 * @generated
 */
public interface Question extends EObject {
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
	 * @see jpdl31.Jpdl31Package#getQuestion_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link jpdl31.Question#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link jpdl31.AnswerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see jpdl31.AnswerType
	 * @see #setType(AnswerType)
	 * @see jpdl31.Jpdl31Package#getQuestion_Type()
	 * @model
	 * @generated
	 */
	AnswerType getType();

	/**
	 * Sets the value of the '{@link jpdl31.Question#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see jpdl31.AnswerType
	 * @see #getType()
	 * @generated
	 */
	void setType(AnswerType value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * The literals are from the enumeration {@link jpdl31.BooleanType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see jpdl31.BooleanType
	 * @see #setRequired(BooleanType)
	 * @see jpdl31.Jpdl31Package#getQuestion_Required()
	 * @model
	 * @generated
	 */
	BooleanType getRequired();

	/**
	 * Sets the value of the '{@link jpdl31.Question#getRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see jpdl31.BooleanType
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(BooleanType value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.Alternative}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getQuestion_Option()
	 * @model containment="true"
	 * @generated
	 */
	EList<Alternative> getOption();

	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(Question)
	 * @see jpdl31.Jpdl31Package#getQuestion_EReference0()
	 * @model
	 * @generated
	 */
	Question getEReference0();

	/**
	 * Sets the value of the '{@link jpdl31.Question#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(Question value);

} // Question

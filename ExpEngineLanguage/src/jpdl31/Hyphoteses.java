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
 * A representation of the model object '<em><b>Hyphoteses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jpdl31.Hyphoteses#getFormalizes <em>Formalizes</em>}</li>
 *   <li>{@link jpdl31.Hyphoteses#getDescription <em>Description</em>}</li>
 *   <li>{@link jpdl31.Hyphoteses#getFromGoal <em>From Goal</em>}</li>
 *   <li>{@link jpdl31.Hyphoteses#getType <em>Type</em>}</li>
 *   <li>{@link jpdl31.Hyphoteses#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see jpdl31.Jpdl31Package#getHyphoteses()
 * @model
 * @generated
 */
public interface Hyphoteses extends EObject {
	/**
	 * Returns the value of the '<em><b>Formalizes</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.Subhypotheses}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formalizes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formalizes</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getHyphoteses_Formalizes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subhypotheses> getFormalizes();

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
	 * @see jpdl31.Jpdl31Package#getHyphoteses_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link jpdl31.Hyphoteses#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see jpdl31.Jpdl31Package#getHyphoteses_FromGoal()
	 * @model required="true"
	 * @generated
	 */
	Goal getFromGoal();

	/**
	 * Sets the value of the '{@link jpdl31.Hyphoteses#getFromGoal <em>From Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Goal</em>' reference.
	 * @see #getFromGoal()
	 * @generated
	 */
	void setFromGoal(Goal value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link jpdl31.HypothesisType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see jpdl31.HypothesisType
	 * @see #setType(HypothesisType)
	 * @see jpdl31.Jpdl31Package#getHyphoteses_Type()
	 * @model
	 * @generated
	 */
	HypothesisType getType();

	/**
	 * Sets the value of the '{@link jpdl31.Hyphoteses#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see jpdl31.HypothesisType
	 * @see #getType()
	 * @generated
	 */
	void setType(HypothesisType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see jpdl31.Jpdl31Package#getHyphoteses_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link jpdl31.Hyphoteses#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Hyphoteses

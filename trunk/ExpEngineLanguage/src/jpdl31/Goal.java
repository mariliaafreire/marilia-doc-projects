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
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jpdl31.Goal#getId <em>Id</em>}</li>
 *   <li>{@link jpdl31.Goal#getDescription <em>Description</em>}</li>
 *   <li>{@link jpdl31.Goal#getHypotheses <em>Hypotheses</em>}</li>
 * </ul>
 * </p>
 *
 * @see jpdl31.Jpdl31Package#getGoal()
 * @model
 * @generated
 */
public interface Goal extends EObject {
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
	 * @see jpdl31.Jpdl31Package#getGoal_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link jpdl31.Goal#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see jpdl31.Jpdl31Package#getGoal_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link jpdl31.Goal#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Hypotheses</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.Hyphotesis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hypotheses</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hypotheses</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getGoal_Hypotheses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hyphotesis> getHypotheses();

} // Goal

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
 * A representation of the model object '<em><b>Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jpdl31.Factor#getLevels <em>Levels</em>}</li>
 *   <li>{@link jpdl31.Factor#getName <em>Name</em>}</li>
 *   <li>{@link jpdl31.Factor#getIsTreament <em>Is Treament</em>}</li>
 * </ul>
 * </p>
 *
 * @see jpdl31.Jpdl31Package#getFactor()
 * @model
 * @generated
 */
public interface Factor extends EObject {
	/**
	 * Returns the value of the '<em><b>Levels</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.Level}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Levels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Levels</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getFactor_Levels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Level> getLevels();

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
	 * @see jpdl31.Jpdl31Package#getFactor_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link jpdl31.Factor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Treament</b></em>' attribute.
	 * The literals are from the enumeration {@link jpdl31.BooleanType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Treament</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Treament</em>' attribute.
	 * @see jpdl31.BooleanType
	 * @see #setIsTreament(BooleanType)
	 * @see jpdl31.Jpdl31Package#getFactor_IsTreament()
	 * @model
	 * @generated
	 */
	BooleanType getIsTreament();

	/**
	 * Sets the value of the '{@link jpdl31.Factor#getIsTreament <em>Is Treament</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Treament</em>' attribute.
	 * @see jpdl31.BooleanType
	 * @see #getIsTreament()
	 * @generated
	 */
	void setIsTreament(BooleanType value);

} // Factor

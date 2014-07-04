/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subhypotheses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jpdl31.Subhypotheses#getRelationOp <em>Relation Op</em>}</li>
 *   <li>{@link jpdl31.Subhypotheses#getTreatment <em>Treatment</em>}</li>
 *   <li>{@link jpdl31.Subhypotheses#getDependentVariable <em>Dependent Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see jpdl31.Jpdl31Package#getSubhypotheses()
 * @model
 * @generated
 */
public interface Subhypotheses extends EObject {
	/**
	 * Returns the value of the '<em><b>Relation Op</b></em>' attribute.
	 * The literals are from the enumeration {@link jpdl31.RelationOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Op</em>' attribute.
	 * @see jpdl31.RelationOperator
	 * @see #setRelationOp(RelationOperator)
	 * @see jpdl31.Jpdl31Package#getSubhypotheses_RelationOp()
	 * @model
	 * @generated
	 */
	RelationOperator getRelationOp();

	/**
	 * Sets the value of the '{@link jpdl31.Subhypotheses#getRelationOp <em>Relation Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Op</em>' attribute.
	 * @see jpdl31.RelationOperator
	 * @see #getRelationOp()
	 * @generated
	 */
	void setRelationOp(RelationOperator value);

	/**
	 * Returns the value of the '<em><b>Treatment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Treatment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treatment</em>' reference.
	 * @see #setTreatment(Level)
	 * @see jpdl31.Jpdl31Package#getSubhypotheses_Treatment()
	 * @model
	 * @generated
	 */
	Level getTreatment();

	/**
	 * Sets the value of the '{@link jpdl31.Subhypotheses#getTreatment <em>Treatment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treatment</em>' reference.
	 * @see #getTreatment()
	 * @generated
	 */
	void setTreatment(Level value);

	/**
	 * Returns the value of the '<em><b>Dependent Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Variable</em>' reference.
	 * @see #setDependentVariable(DependentVariable)
	 * @see jpdl31.Jpdl31Package#getSubhypotheses_DependentVariable()
	 * @model
	 * @generated
	 */
	DependentVariable getDependentVariable();

	/**
	 * Sets the value of the '{@link jpdl31.Subhypotheses#getDependentVariable <em>Dependent Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent Variable</em>' reference.
	 * @see #getDependentVariable()
	 * @generated
	 */
	void setDependentVariable(DependentVariable value);

} // Subhypotheses

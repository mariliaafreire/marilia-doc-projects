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
 * A representation of the model object '<em><b>Hyphotesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jpdl31.Hyphotesis#getFormalizes <em>Formalizes</em>}</li>
 *   <li>{@link jpdl31.Hyphotesis#getDescription <em>Description</em>}</li>
 *   <li>{@link jpdl31.Hyphotesis#getFromGoal <em>From Goal</em>}</li>
 *   <li>{@link jpdl31.Hyphotesis#getType <em>Type</em>}</li>
 *   <li>{@link jpdl31.Hyphotesis#getId <em>Id</em>}</li>
 *   <li>{@link jpdl31.Hyphotesis#getRelationOp <em>Relation Op</em>}</li>
 *   <li>{@link jpdl31.Hyphotesis#getTreatment <em>Treatment</em>}</li>
 *   <li>{@link jpdl31.Hyphotesis#getDependentVariable <em>Dependent Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see jpdl31.Jpdl31Package#getHyphotesis()
 * @model
 * @generated
 */
public interface Hyphotesis extends EObject {
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
	 * @see jpdl31.Jpdl31Package#getHyphotesis_Formalizes()
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
	 * @see jpdl31.Jpdl31Package#getHyphotesis_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link jpdl31.Hyphotesis#getDescription <em>Description</em>}' attribute.
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
	 * @see jpdl31.Jpdl31Package#getHyphotesis_FromGoal()
	 * @model required="true"
	 * @generated
	 */
	Goal getFromGoal();

	/**
	 * Sets the value of the '{@link jpdl31.Hyphotesis#getFromGoal <em>From Goal</em>}' reference.
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
	 * @see jpdl31.Jpdl31Package#getHyphotesis_Type()
	 * @model
	 * @generated
	 */
	HypothesisType getType();

	/**
	 * Sets the value of the '{@link jpdl31.Hyphotesis#getType <em>Type</em>}' attribute.
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
	 * @see jpdl31.Jpdl31Package#getHyphotesis_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link jpdl31.Hyphotesis#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see jpdl31.Jpdl31Package#getHyphotesis_RelationOp()
	 * @model
	 * @generated
	 */
	RelationOperator getRelationOp();

	/**
	 * Sets the value of the '{@link jpdl31.Hyphotesis#getRelationOp <em>Relation Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Op</em>' attribute.
	 * @see jpdl31.RelationOperator
	 * @see #getRelationOp()
	 * @generated
	 */
	void setRelationOp(RelationOperator value);

	/**
	 * Returns the value of the '<em><b>Treatment</b></em>' reference list.
	 * The list contents are of type {@link jpdl31.Level}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Treatment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treatment</em>' reference list.
	 * @see jpdl31.Jpdl31Package#getHyphotesis_Treatment()
	 * @model
	 * @generated
	 */
	EList<Level> getTreatment();

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
	 * @see jpdl31.Jpdl31Package#getHyphotesis_DependentVariable()
	 * @model
	 * @generated
	 */
	DependentVariable getDependentVariable();

	/**
	 * Sets the value of the '{@link jpdl31.Hyphotesis#getDependentVariable <em>Dependent Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent Variable</em>' reference.
	 * @see #getDependentVariable()
	 * @generated
	 */
	void setDependentVariable(DependentVariable value);

} // Hyphotesis

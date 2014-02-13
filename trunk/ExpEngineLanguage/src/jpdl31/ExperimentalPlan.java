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
 * A representation of the model object '<em><b>Experimental Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jpdl31.ExperimentalPlan#getGoals <em>Goals</em>}</li>
 *   <li>{@link jpdl31.ExperimentalPlan#getHypothesis <em>Hypothesis</em>}</li>
 *   <li>{@link jpdl31.ExperimentalPlan#getDesign <em>Design</em>}</li>
 * </ul>
 * </p>
 *
 * @see jpdl31.Jpdl31Package#getExperimentalPlan()
 * @model
 * @generated
 */
public interface ExperimentalPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getExperimentalPlan_Goals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Goal> getGoals();

	/**
	 * Returns the value of the '<em><b>Hypothesis</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.Hyphoteses}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hypothesis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hypothesis</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getExperimentalPlan_Hypothesis()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Hyphoteses> getHypothesis();

	/**
	 * Returns the value of the '<em><b>Design</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design</em>' containment reference.
	 * @see #setDesign(Design)
	 * @see jpdl31.Jpdl31Package#getExperimentalPlan_Design()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Design getDesign();

	/**
	 * Sets the value of the '{@link jpdl31.ExperimentalPlan#getDesign <em>Design</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design</em>' containment reference.
	 * @see #getDesign()
	 * @generated
	 */
	void setDesign(Design value);

} // ExperimentalPlan

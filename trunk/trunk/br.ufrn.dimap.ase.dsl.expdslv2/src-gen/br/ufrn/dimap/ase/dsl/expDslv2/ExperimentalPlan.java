/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2;

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
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getGoal <em>Goal</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getHypotheses <em>Hypotheses</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getType <em>Type</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getParameter <em>Parameter</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getDependentVariable <em>Dependent Variable</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getFactor <em>Factor</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getTosubhypotheses <em>Tosubhypotheses</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getTechnique <em>Technique</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getInternalReplication <em>Internal Replication</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getExperimentalPlan()
 * @model
 * @generated
 */
public interface ExperimentalPlan extends EObject
{
  /**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.Goal}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goal</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getExperimentalPlan_Goal()
	 * @model containment="true"
	 * @generated
	 */
  EList<Goal> getGoal();

  /**
	 * Returns the value of the '<em><b>Hypotheses</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hypotheses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Hypotheses</em>' containment reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getExperimentalPlan_Hypotheses()
	 * @model containment="true"
	 * @generated
	 */
  EList<Hypotheses> getHypotheses();

  /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufrn.dimap.ase.dsl.expDslv2.DesignType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.DesignType
	 * @see #setType(DesignType)
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getExperimentalPlan_Type()
	 * @model
	 * @generated
	 */
  DesignType getType();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.DesignType
	 * @see #getType()
	 * @generated
	 */
  void setType(DesignType value);

  /**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.Parameter}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getExperimentalPlan_Parameter()
	 * @model containment="true"
	 * @generated
	 */
  EList<Parameter> getParameter();

  /**
	 * Returns the value of the '<em><b>Dependent Variable</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.DependentVariable}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependent Variable</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Variable</em>' containment reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getExperimentalPlan_DependentVariable()
	 * @model containment="true"
	 * @generated
	 */
  EList<DependentVariable> getDependentVariable();

  /**
	 * Returns the value of the '<em><b>Factor</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.Factor}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factor</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' containment reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getExperimentalPlan_Factor()
	 * @model containment="true"
	 * @generated
	 */
  EList<Factor> getFactor();

  /**
	 * Returns the value of the '<em><b>Tosubhypotheses</b></em>' reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tosubhypotheses</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Tosubhypotheses</em>' reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getExperimentalPlan_Tosubhypotheses()
	 * @model
	 * @generated
	 */
  EList<Subhypotheses> getTosubhypotheses();

  /**
	 * Returns the value of the '<em><b>Technique</b></em>' attribute list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.AnalysisTechiqueType}.
	 * The literals are from the enumeration {@link br.ufrn.dimap.ase.dsl.expDslv2.AnalysisTechiqueType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Technique</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Technique</em>' attribute list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.AnalysisTechiqueType
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getExperimentalPlan_Technique()
	 * @model unique="false"
	 * @generated
	 */
  EList<AnalysisTechiqueType> getTechnique();

  /**
	 * Returns the value of the '<em><b>Internal Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Internal Replication</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Replication</em>' attribute.
	 * @see #setInternalReplication(int)
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getExperimentalPlan_InternalReplication()
	 * @model
	 * @generated
	 */
  int getInternalReplication();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getInternalReplication <em>Internal Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Replication</em>' attribute.
	 * @see #getInternalReplication()
	 * @generated
	 */
  void setInternalReplication(int value);

} // ExperimentalPlan

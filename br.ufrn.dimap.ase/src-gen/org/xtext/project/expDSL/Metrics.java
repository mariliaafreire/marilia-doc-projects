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
 * A representation of the model object '<em><b>Metrics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.project.expDSL.Metrics#getActivityMetric <em>Activity Metric</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Metrics#getTaskMetric <em>Task Metric</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Metrics#getArtefactMetric <em>Artefact Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.project.expDSL.ExpDSLPackage#getMetrics()
 * @model
 * @generated
 */
public interface Metrics extends EObject
{
  /**
   * Returns the value of the '<em><b>Activity Metric</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.expDSL.ActivityMetric}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activity Metric</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activity Metric</em>' containment reference list.
   * @see org.xtext.project.expDSL.ExpDSLPackage#getMetrics_ActivityMetric()
   * @model containment="true"
   * @generated
   */
  EList<ActivityMetric> getActivityMetric();

  /**
   * Returns the value of the '<em><b>Task Metric</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.expDSL.TaskMetric}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Metric</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Metric</em>' containment reference list.
   * @see org.xtext.project.expDSL.ExpDSLPackage#getMetrics_TaskMetric()
   * @model containment="true"
   * @generated
   */
  EList<TaskMetric> getTaskMetric();

  /**
   * Returns the value of the '<em><b>Artefact Metric</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.expDSL.ArtefactMetric}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artefact Metric</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artefact Metric</em>' containment reference list.
   * @see org.xtext.project.expDSL.ExpDSLPackage#getMetrics_ArtefactMetric()
   * @model containment="true"
   * @generated
   */
  EList<ArtefactMetric> getArtefactMetric();

} // Metrics

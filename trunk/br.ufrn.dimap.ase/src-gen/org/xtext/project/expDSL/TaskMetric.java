/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.project.expDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.project.expDSL.TaskMetric#getActivities <em>Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.project.expDSL.ExpDSLPackage#getTaskMetric()
 * @model
 * @generated
 */
public interface TaskMetric extends Metrics
{
  /**
	 * Returns the value of the '<em><b>Activities</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activities</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' attribute.
	 * @see #setActivities(String)
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getTaskMetric_Activities()
	 * @model
	 * @generated
	 */
  String getActivities();

  /**
	 * Sets the value of the '{@link org.xtext.project.expDSL.TaskMetric#getActivities <em>Activities</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activities</em>' attribute.
	 * @see #getActivities()
	 * @generated
	 */
  void setActivities(String value);

} // TaskMetric

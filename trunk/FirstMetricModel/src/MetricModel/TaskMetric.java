/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MetricModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MetricModel.TaskMetric#getTasksBase <em>Tasks Base</em>}</li>
 * </ul>
 * </p>
 *
 * @see MetricModel.MetricModelPackage#getTaskMetric()
 * @model
 * @generated
 */
public interface TaskMetric extends Metric {
	/**
	 * Returns the value of the '<em><b>Tasks Base</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks Base</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks Base</em>' attribute list.
	 * @see MetricModel.MetricModelPackage#getTaskMetric_TasksBase()
	 * @model
	 * @generated
	 */
	EList<String> getTasksBase();

} // TaskMetric

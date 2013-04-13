/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.project.expDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.project.expDSL.TaskMetric#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.project.expDSL.ExpDSLPackage#getTaskMetric()
 * @model
 * @generated
 */
public interface TaskMetric extends Detail
{
  /**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link org.xtext.project.expDSL.Task}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getTaskMetric_Tasks()
	 * @model
	 * @generated
	 */
  EList<Task> getTasks();

} // TaskMetric

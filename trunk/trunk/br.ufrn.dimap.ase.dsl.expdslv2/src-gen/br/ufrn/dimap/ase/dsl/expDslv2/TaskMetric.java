/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.TaskMetric#getTaskBegin <em>Task Begin</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.TaskMetric#getTaskEnd <em>Task End</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getTaskMetric()
 * @model
 * @generated
 */
public interface TaskMetric extends Detail
{
  /**
	 * Returns the value of the '<em><b>Task Begin</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Begin</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Begin</em>' reference.
	 * @see #setTaskBegin(Task)
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getTaskMetric_TaskBegin()
	 * @model
	 * @generated
	 */
  Task getTaskBegin();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expDslv2.TaskMetric#getTaskBegin <em>Task Begin</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Begin</em>' reference.
	 * @see #getTaskBegin()
	 * @generated
	 */
  void setTaskBegin(Task value);

  /**
	 * Returns the value of the '<em><b>Task End</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task End</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Task End</em>' reference.
	 * @see #setTaskEnd(Task)
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getTaskMetric_TaskEnd()
	 * @model
	 * @generated
	 */
  Task getTaskEnd();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expDslv2.TaskMetric#getTaskEnd <em>Task End</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task End</em>' reference.
	 * @see #getTaskEnd()
	 * @generated
	 */
  void setTaskEnd(Task value);

} // TaskMetric

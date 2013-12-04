/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.ActivityMetric#getActivityBegin <em>Activity Begin</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.ActivityMetric#getActivityEnd <em>Activity End</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getActivityMetric()
 * @model
 * @generated
 */
public interface ActivityMetric extends TimeMetric
{
  /**
	 * Returns the value of the '<em><b>Activity Begin</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activity Begin</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Begin</em>' reference.
	 * @see #setActivityBegin(Activity)
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getActivityMetric_ActivityBegin()
	 * @model
	 * @generated
	 */
  Activity getActivityBegin();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expDslv2.ActivityMetric#getActivityBegin <em>Activity Begin</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Begin</em>' reference.
	 * @see #getActivityBegin()
	 * @generated
	 */
  void setActivityBegin(Activity value);

  /**
	 * Returns the value of the '<em><b>Activity End</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activity End</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity End</em>' reference.
	 * @see #setActivityEnd(Activity)
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getActivityMetric_ActivityEnd()
	 * @model
	 * @generated
	 */
  Activity getActivityEnd();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expDslv2.ActivityMetric#getActivityEnd <em>Activity End</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity End</em>' reference.
	 * @see #getActivityEnd()
	 * @generated
	 */
  void setActivityEnd(Activity value);

} // ActivityMetric

/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.project.expDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.project.expDSL.ActivityMetric#getActivityBegin <em>Activity Begin</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.ActivityMetric#getActivityEnd <em>Activity End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.project.expDSL.ExpDSLPackage#getActivityMetric()
 * @model
 * @generated
 */
public interface ActivityMetric extends EObject
{
  /**
   * Returns the value of the '<em><b>Activity Begin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activity Begin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activity Begin</em>' attribute.
   * @see #setActivityBegin(String)
   * @see org.xtext.project.expDSL.ExpDSLPackage#getActivityMetric_ActivityBegin()
   * @model
   * @generated
   */
  String getActivityBegin();

  /**
   * Sets the value of the '{@link org.xtext.project.expDSL.ActivityMetric#getActivityBegin <em>Activity Begin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Activity Begin</em>' attribute.
   * @see #getActivityBegin()
   * @generated
   */
  void setActivityBegin(String value);

  /**
   * Returns the value of the '<em><b>Activity End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activity End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activity End</em>' attribute.
   * @see #setActivityEnd(String)
   * @see org.xtext.project.expDSL.ExpDSLPackage#getActivityMetric_ActivityEnd()
   * @model
   * @generated
   */
  String getActivityEnd();

  /**
   * Sets the value of the '{@link org.xtext.project.expDSL.ActivityMetric#getActivityEnd <em>Activity End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Activity End</em>' attribute.
   * @see #getActivityEnd()
   * @generated
   */
  void setActivityEnd(String value);

} // ActivityMetric

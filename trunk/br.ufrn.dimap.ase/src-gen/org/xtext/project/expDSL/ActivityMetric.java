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
 *   <li>{@link org.xtext.project.expDSL.ActivityMetric#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.ActivityMetric#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.ActivityMetric#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.ActivityMetric#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.ActivityMetric#getForm <em>Form</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.ActivityMetric#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.ActivityMetric#getUnit <em>Unit</em>}</li>
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
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.project.expDSL.ExpDSLPackage#getActivityMetric_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.project.expDSL.ActivityMetric#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Relates To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relates To</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relates To</em>' reference.
   * @see #setRelatesTo(org.xtext.project.expDSL.Process)
   * @see org.xtext.project.expDSL.ExpDSLPackage#getActivityMetric_RelatesTo()
   * @model
   * @generated
   */
  org.xtext.project.expDSL.Process getRelatesTo();

  /**
   * Sets the value of the '{@link org.xtext.project.expDSL.ActivityMetric#getRelatesTo <em>Relates To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relates To</em>' reference.
   * @see #getRelatesTo()
   * @generated
   */
  void setRelatesTo(org.xtext.project.expDSL.Process value);

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
   * @see org.xtext.project.expDSL.ExpDSLPackage#getActivityMetric_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.project.expDSL.ActivityMetric#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.project.expDSL.MetricType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.xtext.project.expDSL.MetricType
   * @see #setType(MetricType)
   * @see org.xtext.project.expDSL.ExpDSLPackage#getActivityMetric_Type()
   * @model
   * @generated
   */
  MetricType getType();

  /**
   * Sets the value of the '{@link org.xtext.project.expDSL.ActivityMetric#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.xtext.project.expDSL.MetricType
   * @see #getType()
   * @generated
   */
  void setType(MetricType value);

  /**
   * Returns the value of the '<em><b>Form</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.project.expDSL.ColectType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Form</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Form</em>' attribute.
   * @see org.xtext.project.expDSL.ColectType
   * @see #setForm(ColectType)
   * @see org.xtext.project.expDSL.ExpDSLPackage#getActivityMetric_Form()
   * @model
   * @generated
   */
  ColectType getForm();

  /**
   * Sets the value of the '{@link org.xtext.project.expDSL.ActivityMetric#getForm <em>Form</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Form</em>' attribute.
   * @see org.xtext.project.expDSL.ColectType
   * @see #getForm()
   * @generated
   */
  void setForm(ColectType value);

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
   * @see org.xtext.project.expDSL.ExpDSLPackage#getActivityMetric_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.xtext.project.expDSL.ActivityMetric#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.project.expDSL.MetricUnit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see org.xtext.project.expDSL.MetricUnit
   * @see #setUnit(MetricUnit)
   * @see org.xtext.project.expDSL.ExpDSLPackage#getActivityMetric_Unit()
   * @model
   * @generated
   */
  MetricUnit getUnit();

  /**
   * Sets the value of the '{@link org.xtext.project.expDSL.ActivityMetric#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see org.xtext.project.expDSL.MetricUnit
   * @see #getUnit()
   * @generated
   */
  void setUnit(MetricUnit value);

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

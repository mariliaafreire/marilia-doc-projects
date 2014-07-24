/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.project.expDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metrics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.project.expDSL.Metrics#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Metrics#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Metrics#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Metrics#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Metrics#getForm <em>Form</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Metrics#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Metrics#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Metrics#getDetails <em>Details</em>}</li>
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
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.project.expDSL.ExpDSLPackage#getMetrics_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.project.expDSL.Metrics#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.project.expDSL.ExpDSLPackage#getMetrics_RelatesTo()
   * @model
   * @generated
   */
  org.xtext.project.expDSL.Process getRelatesTo();

  /**
   * Sets the value of the '{@link org.xtext.project.expDSL.Metrics#getRelatesTo <em>Relates To</em>}' reference.
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
   * @see org.xtext.project.expDSL.ExpDSLPackage#getMetrics_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.project.expDSL.Metrics#getDescription <em>Description</em>}' attribute.
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
   * @see org.xtext.project.expDSL.ExpDSLPackage#getMetrics_Type()
   * @model
   * @generated
   */
  MetricType getType();

  /**
   * Sets the value of the '{@link org.xtext.project.expDSL.Metrics#getType <em>Type</em>}' attribute.
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
   * @see org.xtext.project.expDSL.ExpDSLPackage#getMetrics_Form()
   * @model
   * @generated
   */
  ColectType getForm();

  /**
   * Sets the value of the '{@link org.xtext.project.expDSL.Metrics#getForm <em>Form</em>}' attribute.
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
   * @see org.xtext.project.expDSL.ExpDSLPackage#getMetrics_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.xtext.project.expDSL.Metrics#getId <em>Id</em>}' attribute.
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
   * @see org.xtext.project.expDSL.ExpDSLPackage#getMetrics_Unit()
   * @model
   * @generated
   */
  MetricUnit getUnit();

  /**
   * Sets the value of the '{@link org.xtext.project.expDSL.Metrics#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see org.xtext.project.expDSL.MetricUnit
   * @see #getUnit()
   * @generated
   */
  void setUnit(MetricUnit value);

  /**
   * Returns the value of the '<em><b>Details</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Details</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Details</em>' containment reference.
   * @see #setDetails(ActivityMetric)
   * @see org.xtext.project.expDSL.ExpDSLPackage#getMetrics_Details()
   * @model containment="true"
   * @generated
   */
  ActivityMetric getDetails();

  /**
   * Sets the value of the '{@link org.xtext.project.expDSL.Metrics#getDetails <em>Details</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Details</em>' containment reference.
   * @see #getDetails()
   * @generated
   */
  void setDetails(ActivityMetric value);

} // Metrics
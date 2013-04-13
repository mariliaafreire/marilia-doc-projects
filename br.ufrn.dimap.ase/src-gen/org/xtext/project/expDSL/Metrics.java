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
 *   <li>{@link org.xtext.project.expDSL.Metrics#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Metrics#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Metrics#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Metrics#getForm <em>Form</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Metrics#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Metrics#getDetail <em>Detail</em>}</li>
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
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.project.expDSL.Detail}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Detail</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference list.
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getMetrics_Detail()
	 * @model containment="true"
	 * @generated
	 */
  EList<Detail> getDetail();

} // Metrics

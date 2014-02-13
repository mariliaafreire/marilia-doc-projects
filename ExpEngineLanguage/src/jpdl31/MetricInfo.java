/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jpdl31.MetricInfo#getName <em>Name</em>}</li>
 *   <li>{@link jpdl31.MetricInfo#getRefName <em>Ref Name</em>}</li>
 *   <li>{@link jpdl31.MetricInfo#getMetricType <em>Metric Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see jpdl31.Jpdl31Package#getMetricInfo()
 * @model
 * @generated
 */
public interface MetricInfo extends EObject {
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
	 * @see jpdl31.Jpdl31Package#getMetricInfo_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link jpdl31.MetricInfo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Name</em>' attribute.
	 * @see #setRefName(String)
	 * @see jpdl31.Jpdl31Package#getMetricInfo_RefName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRefName();

	/**
	 * Sets the value of the '{@link jpdl31.MetricInfo#getRefName <em>Ref Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Name</em>' attribute.
	 * @see #getRefName()
	 * @generated
	 */
	void setRefName(String value);

	/**
	 * Returns the value of the '<em><b>Metric Type</b></em>' attribute.
	 * The literals are from the enumeration {@link jpdl31.MetricType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Type</em>' attribute.
	 * @see jpdl31.MetricType
	 * @see #setMetricType(MetricType)
	 * @see jpdl31.Jpdl31Package#getMetricInfo_MetricType()
	 * @model
	 * @generated
	 */
	MetricType getMetricType();

	/**
	 * Sets the value of the '{@link jpdl31.MetricInfo#getMetricType <em>Metric Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric Type</em>' attribute.
	 * @see jpdl31.MetricType
	 * @see #getMetricType()
	 * @generated
	 */
	void setMetricType(MetricType value);

} // MetricInfo

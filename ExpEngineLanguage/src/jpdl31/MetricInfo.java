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
 *   <li>{@link jpdl31.MetricInfo#getMetricReferenced <em>Metric Referenced</em>}</li>
 *   <li>{@link jpdl31.MetricInfo#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see jpdl31.Jpdl31Package#getMetricInfo()
 * @model
 * @generated
 */
public interface MetricInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Metric Referenced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Referenced</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Referenced</em>' reference.
	 * @see #setMetricReferenced(Metric)
	 * @see jpdl31.Jpdl31Package#getMetricInfo_MetricReferenced()
	 * @model
	 * @generated
	 */
	Metric getMetricReferenced();

	/**
	 * Sets the value of the '{@link jpdl31.MetricInfo#getMetricReferenced <em>Metric Referenced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric Referenced</em>' reference.
	 * @see #getMetricReferenced()
	 * @generated
	 */
	void setMetricReferenced(Metric value);

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
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
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

} // MetricInfo

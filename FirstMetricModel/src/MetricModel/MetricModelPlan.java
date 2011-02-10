/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MetricModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MetricModel.MetricModelPlan#getName <em>Name</em>}</li>
 *   <li>{@link MetricModel.MetricModelPlan#getMetrics <em>Metrics</em>}</li>
 * </ul>
 * </p>
 *
 * @see MetricModel.MetricModelPackage#getMetricModelPlan()
 * @model
 * @generated
 */
public interface MetricModelPlan extends EObject {
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
	 * @see MetricModel.MetricModelPackage#getMetricModelPlan_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MetricModel.MetricModelPlan#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' containment reference list.
	 * The list contents are of type {@link MetricModel.Metric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' containment reference list.
	 * @see MetricModel.MetricModelPackage#getMetricModelPlan_Metrics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metric> getMetrics();

} // MetricModelPlan

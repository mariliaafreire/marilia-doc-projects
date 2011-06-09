/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MetricModel.impl;

import MetricModel.MetricModelPackage;
import MetricModel.TaskMetric;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link MetricModel.impl.TaskMetricImpl#getTasksBase <em>Tasks Base</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskMetricImpl extends MetricImpl implements TaskMetric {
	/**
	 * The cached value of the '{@link #getTasksBase() <em>Tasks Base</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasksBase()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tasksBase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricModelPackage.Literals.TASK_METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTasksBase() {
		if (tasksBase == null) {
			tasksBase = new EDataTypeUniqueEList<String>(String.class, this, MetricModelPackage.TASK_METRIC__TASKS_BASE);
		}
		return tasksBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetricModelPackage.TASK_METRIC__TASKS_BASE:
				return getTasksBase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetricModelPackage.TASK_METRIC__TASKS_BASE:
				getTasksBase().clear();
				getTasksBase().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetricModelPackage.TASK_METRIC__TASKS_BASE:
				getTasksBase().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetricModelPackage.TASK_METRIC__TASKS_BASE:
				return tasksBase != null && !tasksBase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tasksBase: ");
		result.append(tasksBase);
		result.append(')');
		return result.toString();
	}

} //TaskMetricImpl

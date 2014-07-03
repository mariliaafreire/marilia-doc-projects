/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2.impl;

import br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package;
import br.ufrn.dimap.ase.dsl.expDslv2.Task;
import br.ufrn.dimap.ase.dsl.expDslv2.TaskMetric;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.TaskMetricImpl#getTaskBegin <em>Task Begin</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.TaskMetricImpl#getTaskEnd <em>Task End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskMetricImpl extends DetailImpl implements TaskMetric
{
  /**
	 * The cached value of the '{@link #getTaskBegin() <em>Task Begin</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTaskBegin()
	 * @generated
	 * @ordered
	 */
  protected Task taskBegin;

  /**
	 * The cached value of the '{@link #getTaskEnd() <em>Task End</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTaskEnd()
	 * @generated
	 * @ordered
	 */
  protected Task taskEnd;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TaskMetricImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ExpDslv2Package.Literals.TASK_METRIC;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Task getTaskBegin()
  {
		if (taskBegin != null && taskBegin.eIsProxy()) {
			InternalEObject oldTaskBegin = (InternalEObject)taskBegin;
			taskBegin = (Task)eResolveProxy(oldTaskBegin);
			if (taskBegin != oldTaskBegin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpDslv2Package.TASK_METRIC__TASK_BEGIN, oldTaskBegin, taskBegin));
			}
		}
		return taskBegin;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Task basicGetTaskBegin()
  {
		return taskBegin;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTaskBegin(Task newTaskBegin)
  {
		Task oldTaskBegin = taskBegin;
		taskBegin = newTaskBegin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.TASK_METRIC__TASK_BEGIN, oldTaskBegin, taskBegin));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Task getTaskEnd()
  {
		if (taskEnd != null && taskEnd.eIsProxy()) {
			InternalEObject oldTaskEnd = (InternalEObject)taskEnd;
			taskEnd = (Task)eResolveProxy(oldTaskEnd);
			if (taskEnd != oldTaskEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpDslv2Package.TASK_METRIC__TASK_END, oldTaskEnd, taskEnd));
			}
		}
		return taskEnd;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Task basicGetTaskEnd()
  {
		return taskEnd;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTaskEnd(Task newTaskEnd)
  {
		Task oldTaskEnd = taskEnd;
		taskEnd = newTaskEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.TASK_METRIC__TASK_END, oldTaskEnd, taskEnd));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ExpDslv2Package.TASK_METRIC__TASK_BEGIN:
				if (resolve) return getTaskBegin();
				return basicGetTaskBegin();
			case ExpDslv2Package.TASK_METRIC__TASK_END:
				if (resolve) return getTaskEnd();
				return basicGetTaskEnd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ExpDslv2Package.TASK_METRIC__TASK_BEGIN:
				setTaskBegin((Task)newValue);
				return;
			case ExpDslv2Package.TASK_METRIC__TASK_END:
				setTaskEnd((Task)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case ExpDslv2Package.TASK_METRIC__TASK_BEGIN:
				setTaskBegin((Task)null);
				return;
			case ExpDslv2Package.TASK_METRIC__TASK_END:
				setTaskEnd((Task)null);
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case ExpDslv2Package.TASK_METRIC__TASK_BEGIN:
				return taskBegin != null;
			case ExpDslv2Package.TASK_METRIC__TASK_END:
				return taskEnd != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskMetricImpl

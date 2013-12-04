/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2.impl;

import br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package;
import br.ufrn.dimap.ase.dsl.expDslv2.Task;
import br.ufrn.dimap.ase.dsl.expDslv2.TaskMetric;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.TaskMetricImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskMetricImpl extends TimeMetricImpl implements TaskMetric
{
  /**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
  protected EList<Task> tasks;

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
  public EList<Task> getTasks()
  {
		if (tasks == null) {
			tasks = new EObjectResolvingEList<Task>(Task.class, this, ExpDslv2Package.TASK_METRIC__TASKS);
		}
		return tasks;
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
			case ExpDslv2Package.TASK_METRIC__TASKS:
				return getTasks();
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
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ExpDslv2Package.TASK_METRIC__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
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
			case ExpDslv2Package.TASK_METRIC__TASKS:
				getTasks().clear();
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
			case ExpDslv2Package.TASK_METRIC__TASKS:
				return tasks != null && !tasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskMetricImpl

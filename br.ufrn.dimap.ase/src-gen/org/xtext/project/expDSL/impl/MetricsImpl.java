/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.project.expDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.project.expDSL.ActivityMetric;
import org.xtext.project.expDSL.ArtefactMetric;
import org.xtext.project.expDSL.ExpDSLPackage;
import org.xtext.project.expDSL.Metrics;
import org.xtext.project.expDSL.TaskMetric;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metrics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.project.expDSL.impl.MetricsImpl#getActivityMetric <em>Activity Metric</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.impl.MetricsImpl#getTaskMetric <em>Task Metric</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.impl.MetricsImpl#getArtefactMetric <em>Artefact Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetricsImpl extends MinimalEObjectImpl.Container implements Metrics
{
  /**
   * The cached value of the '{@link #getActivityMetric() <em>Activity Metric</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivityMetric()
   * @generated
   * @ordered
   */
  protected EList<ActivityMetric> activityMetric;

  /**
   * The cached value of the '{@link #getTaskMetric() <em>Task Metric</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskMetric()
   * @generated
   * @ordered
   */
  protected EList<TaskMetric> taskMetric;

  /**
   * The cached value of the '{@link #getArtefactMetric() <em>Artefact Metric</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtefactMetric()
   * @generated
   * @ordered
   */
  protected EList<ArtefactMetric> artefactMetric;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetricsImpl()
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
    return ExpDSLPackage.Literals.METRICS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActivityMetric> getActivityMetric()
  {
    if (activityMetric == null)
    {
      activityMetric = new EObjectContainmentEList<ActivityMetric>(ActivityMetric.class, this, ExpDSLPackage.METRICS__ACTIVITY_METRIC);
    }
    return activityMetric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TaskMetric> getTaskMetric()
  {
    if (taskMetric == null)
    {
      taskMetric = new EObjectContainmentEList<TaskMetric>(TaskMetric.class, this, ExpDSLPackage.METRICS__TASK_METRIC);
    }
    return taskMetric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArtefactMetric> getArtefactMetric()
  {
    if (artefactMetric == null)
    {
      artefactMetric = new EObjectContainmentEList<ArtefactMetric>(ArtefactMetric.class, this, ExpDSLPackage.METRICS__ARTEFACT_METRIC);
    }
    return artefactMetric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ExpDSLPackage.METRICS__ACTIVITY_METRIC:
        return ((InternalEList<?>)getActivityMetric()).basicRemove(otherEnd, msgs);
      case ExpDSLPackage.METRICS__TASK_METRIC:
        return ((InternalEList<?>)getTaskMetric()).basicRemove(otherEnd, msgs);
      case ExpDSLPackage.METRICS__ARTEFACT_METRIC:
        return ((InternalEList<?>)getArtefactMetric()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExpDSLPackage.METRICS__ACTIVITY_METRIC:
        return getActivityMetric();
      case ExpDSLPackage.METRICS__TASK_METRIC:
        return getTaskMetric();
      case ExpDSLPackage.METRICS__ARTEFACT_METRIC:
        return getArtefactMetric();
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
    switch (featureID)
    {
      case ExpDSLPackage.METRICS__ACTIVITY_METRIC:
        getActivityMetric().clear();
        getActivityMetric().addAll((Collection<? extends ActivityMetric>)newValue);
        return;
      case ExpDSLPackage.METRICS__TASK_METRIC:
        getTaskMetric().clear();
        getTaskMetric().addAll((Collection<? extends TaskMetric>)newValue);
        return;
      case ExpDSLPackage.METRICS__ARTEFACT_METRIC:
        getArtefactMetric().clear();
        getArtefactMetric().addAll((Collection<? extends ArtefactMetric>)newValue);
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
    switch (featureID)
    {
      case ExpDSLPackage.METRICS__ACTIVITY_METRIC:
        getActivityMetric().clear();
        return;
      case ExpDSLPackage.METRICS__TASK_METRIC:
        getTaskMetric().clear();
        return;
      case ExpDSLPackage.METRICS__ARTEFACT_METRIC:
        getArtefactMetric().clear();
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
    switch (featureID)
    {
      case ExpDSLPackage.METRICS__ACTIVITY_METRIC:
        return activityMetric != null && !activityMetric.isEmpty();
      case ExpDSLPackage.METRICS__TASK_METRIC:
        return taskMetric != null && !taskMetric.isEmpty();
      case ExpDSLPackage.METRICS__ARTEFACT_METRIC:
        return artefactMetric != null && !artefactMetric.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MetricsImpl

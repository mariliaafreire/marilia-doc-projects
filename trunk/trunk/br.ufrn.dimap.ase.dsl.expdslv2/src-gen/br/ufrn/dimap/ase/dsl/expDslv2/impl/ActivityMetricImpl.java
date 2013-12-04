/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2.impl;

import br.ufrn.dimap.ase.dsl.expDslv2.Activity;
import br.ufrn.dimap.ase.dsl.expDslv2.ActivityMetric;
import br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ActivityMetricImpl#getActivityBegin <em>Activity Begin</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ActivityMetricImpl#getActivityEnd <em>Activity End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityMetricImpl extends TimeMetricImpl implements ActivityMetric
{
  /**
	 * The cached value of the '{@link #getActivityBegin() <em>Activity Begin</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getActivityBegin()
	 * @generated
	 * @ordered
	 */
  protected Activity activityBegin;

  /**
	 * The cached value of the '{@link #getActivityEnd() <em>Activity End</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getActivityEnd()
	 * @generated
	 * @ordered
	 */
  protected Activity activityEnd;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ActivityMetricImpl()
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
		return ExpDslv2Package.Literals.ACTIVITY_METRIC;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Activity getActivityBegin()
  {
		if (activityBegin != null && activityBegin.eIsProxy()) {
			InternalEObject oldActivityBegin = (InternalEObject)activityBegin;
			activityBegin = (Activity)eResolveProxy(oldActivityBegin);
			if (activityBegin != oldActivityBegin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpDslv2Package.ACTIVITY_METRIC__ACTIVITY_BEGIN, oldActivityBegin, activityBegin));
			}
		}
		return activityBegin;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Activity basicGetActivityBegin()
  {
		return activityBegin;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setActivityBegin(Activity newActivityBegin)
  {
		Activity oldActivityBegin = activityBegin;
		activityBegin = newActivityBegin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.ACTIVITY_METRIC__ACTIVITY_BEGIN, oldActivityBegin, activityBegin));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Activity getActivityEnd()
  {
		if (activityEnd != null && activityEnd.eIsProxy()) {
			InternalEObject oldActivityEnd = (InternalEObject)activityEnd;
			activityEnd = (Activity)eResolveProxy(oldActivityEnd);
			if (activityEnd != oldActivityEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpDslv2Package.ACTIVITY_METRIC__ACTIVITY_END, oldActivityEnd, activityEnd));
			}
		}
		return activityEnd;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Activity basicGetActivityEnd()
  {
		return activityEnd;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setActivityEnd(Activity newActivityEnd)
  {
		Activity oldActivityEnd = activityEnd;
		activityEnd = newActivityEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.ACTIVITY_METRIC__ACTIVITY_END, oldActivityEnd, activityEnd));
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
			case ExpDslv2Package.ACTIVITY_METRIC__ACTIVITY_BEGIN:
				if (resolve) return getActivityBegin();
				return basicGetActivityBegin();
			case ExpDslv2Package.ACTIVITY_METRIC__ACTIVITY_END:
				if (resolve) return getActivityEnd();
				return basicGetActivityEnd();
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
			case ExpDslv2Package.ACTIVITY_METRIC__ACTIVITY_BEGIN:
				setActivityBegin((Activity)newValue);
				return;
			case ExpDslv2Package.ACTIVITY_METRIC__ACTIVITY_END:
				setActivityEnd((Activity)newValue);
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
			case ExpDslv2Package.ACTIVITY_METRIC__ACTIVITY_BEGIN:
				setActivityBegin((Activity)null);
				return;
			case ExpDslv2Package.ACTIVITY_METRIC__ACTIVITY_END:
				setActivityEnd((Activity)null);
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
			case ExpDslv2Package.ACTIVITY_METRIC__ACTIVITY_BEGIN:
				return activityBegin != null;
			case ExpDslv2Package.ACTIVITY_METRIC__ACTIVITY_END:
				return activityEnd != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityMetricImpl

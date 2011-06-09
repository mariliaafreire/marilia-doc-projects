/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MetricModel.impl;

import MetricModel.ActivityMetric;
import MetricModel.MetricModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link MetricModel.impl.ActivityMetricImpl#getActivityBegin <em>Activity Begin</em>}</li>
 *   <li>{@link MetricModel.impl.ActivityMetricImpl#getActivityEnd <em>Activity End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityMetricImpl extends MetricImpl implements ActivityMetric {
	/**
	 * The default value of the '{@link #getActivityBegin() <em>Activity Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityBegin()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_BEGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivityBegin() <em>Activity Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityBegin()
	 * @generated
	 * @ordered
	 */
	protected String activityBegin = ACTIVITY_BEGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivityEnd() <em>Activity End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivityEnd() <em>Activity End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityEnd()
	 * @generated
	 * @ordered
	 */
	protected String activityEnd = ACTIVITY_END_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricModelPackage.Literals.ACTIVITY_METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivityBegin() {
		return activityBegin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityBegin(String newActivityBegin) {
		String oldActivityBegin = activityBegin;
		activityBegin = newActivityBegin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricModelPackage.ACTIVITY_METRIC__ACTIVITY_BEGIN, oldActivityBegin, activityBegin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivityEnd() {
		return activityEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityEnd(String newActivityEnd) {
		String oldActivityEnd = activityEnd;
		activityEnd = newActivityEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricModelPackage.ACTIVITY_METRIC__ACTIVITY_END, oldActivityEnd, activityEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetricModelPackage.ACTIVITY_METRIC__ACTIVITY_BEGIN:
				return getActivityBegin();
			case MetricModelPackage.ACTIVITY_METRIC__ACTIVITY_END:
				return getActivityEnd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetricModelPackage.ACTIVITY_METRIC__ACTIVITY_BEGIN:
				setActivityBegin((String)newValue);
				return;
			case MetricModelPackage.ACTIVITY_METRIC__ACTIVITY_END:
				setActivityEnd((String)newValue);
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
			case MetricModelPackage.ACTIVITY_METRIC__ACTIVITY_BEGIN:
				setActivityBegin(ACTIVITY_BEGIN_EDEFAULT);
				return;
			case MetricModelPackage.ACTIVITY_METRIC__ACTIVITY_END:
				setActivityEnd(ACTIVITY_END_EDEFAULT);
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
			case MetricModelPackage.ACTIVITY_METRIC__ACTIVITY_BEGIN:
				return ACTIVITY_BEGIN_EDEFAULT == null ? activityBegin != null : !ACTIVITY_BEGIN_EDEFAULT.equals(activityBegin);
			case MetricModelPackage.ACTIVITY_METRIC__ACTIVITY_END:
				return ACTIVITY_END_EDEFAULT == null ? activityEnd != null : !ACTIVITY_END_EDEFAULT.equals(activityEnd);
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
		result.append(" (activityBegin: ");
		result.append(activityBegin);
		result.append(", activityEnd: ");
		result.append(activityEnd);
		result.append(')');
		return result.toString();
	}

} //ActivityMetricImpl

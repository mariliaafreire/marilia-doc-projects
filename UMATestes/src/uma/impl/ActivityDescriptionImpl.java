/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uma.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uma.ActivityDescription;
import uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uma.impl.ActivityDescriptionImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link uma.impl.ActivityDescriptionImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link uma.impl.ActivityDescriptionImpl#getHowtoStaff <em>Howto Staff</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityDescriptionImpl extends BreakdownElementDescriptionImpl implements ActivityDescription {
	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlternatives() <em>Alternatives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternatives()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTERNATIVES_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAlternatives() <em>Alternatives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternatives()
	 * @generated
	 * @ordered
	 */
	protected String alternatives = ALTERNATIVES_EDEFAULT;

	/**
	 * The default value of the '{@link #getHowtoStaff() <em>Howto Staff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHowtoStaff()
	 * @generated
	 * @ordered
	 */
	protected static final String HOWTO_STAFF_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getHowtoStaff() <em>Howto Staff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHowtoStaff()
	 * @generated
	 * @ordered
	 */
	protected String howtoStaff = HOWTO_STAFF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.ACTIVITY_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.ACTIVITY_DESCRIPTION__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlternatives() {
		return alternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternatives(String newAlternatives) {
		String oldAlternatives = alternatives;
		alternatives = newAlternatives;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.ACTIVITY_DESCRIPTION__ALTERNATIVES, oldAlternatives, alternatives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHowtoStaff() {
		return howtoStaff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHowtoStaff(String newHowtoStaff) {
		String oldHowtoStaff = howtoStaff;
		howtoStaff = newHowtoStaff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.ACTIVITY_DESCRIPTION__HOWTO_STAFF, oldHowtoStaff, howtoStaff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.ACTIVITY_DESCRIPTION__PURPOSE:
				return getPurpose();
			case UmaPackage.ACTIVITY_DESCRIPTION__ALTERNATIVES:
				return getAlternatives();
			case UmaPackage.ACTIVITY_DESCRIPTION__HOWTO_STAFF:
				return getHowtoStaff();
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
			case UmaPackage.ACTIVITY_DESCRIPTION__PURPOSE:
				setPurpose((String)newValue);
				return;
			case UmaPackage.ACTIVITY_DESCRIPTION__ALTERNATIVES:
				setAlternatives((String)newValue);
				return;
			case UmaPackage.ACTIVITY_DESCRIPTION__HOWTO_STAFF:
				setHowtoStaff((String)newValue);
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
			case UmaPackage.ACTIVITY_DESCRIPTION__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case UmaPackage.ACTIVITY_DESCRIPTION__ALTERNATIVES:
				setAlternatives(ALTERNATIVES_EDEFAULT);
				return;
			case UmaPackage.ACTIVITY_DESCRIPTION__HOWTO_STAFF:
				setHowtoStaff(HOWTO_STAFF_EDEFAULT);
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
			case UmaPackage.ACTIVITY_DESCRIPTION__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case UmaPackage.ACTIVITY_DESCRIPTION__ALTERNATIVES:
				return ALTERNATIVES_EDEFAULT == null ? alternatives != null : !ALTERNATIVES_EDEFAULT.equals(alternatives);
			case UmaPackage.ACTIVITY_DESCRIPTION__HOWTO_STAFF:
				return HOWTO_STAFF_EDEFAULT == null ? howtoStaff != null : !HOWTO_STAFF_EDEFAULT.equals(howtoStaff);
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
		result.append(" (purpose: ");
		result.append(purpose);
		result.append(", alternatives: ");
		result.append(alternatives);
		result.append(", howtoStaff: ");
		result.append(howtoStaff);
		result.append(')');
		return result.toString();
	}

} //ActivityDescriptionImpl

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

import uma.DescriptorDescription;
import uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Descriptor Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uma.impl.DescriptorDescriptionImpl#getRefinedDescription <em>Refined Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DescriptorDescriptionImpl extends BreakdownElementDescriptionImpl implements DescriptorDescription {
	/**
	 * The default value of the '{@link #getRefinedDescription() <em>Refined Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String REFINED_DESCRIPTION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRefinedDescription() <em>Refined Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedDescription()
	 * @generated
	 * @ordered
	 */
	protected String refinedDescription = REFINED_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptorDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.DESCRIPTOR_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefinedDescription() {
		return refinedDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinedDescription(String newRefinedDescription) {
		String oldRefinedDescription = refinedDescription;
		refinedDescription = newRefinedDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.DESCRIPTOR_DESCRIPTION__REFINED_DESCRIPTION, oldRefinedDescription, refinedDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.DESCRIPTOR_DESCRIPTION__REFINED_DESCRIPTION:
				return getRefinedDescription();
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
			case UmaPackage.DESCRIPTOR_DESCRIPTION__REFINED_DESCRIPTION:
				setRefinedDescription((String)newValue);
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
			case UmaPackage.DESCRIPTOR_DESCRIPTION__REFINED_DESCRIPTION:
				setRefinedDescription(REFINED_DESCRIPTION_EDEFAULT);
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
			case UmaPackage.DESCRIPTOR_DESCRIPTION__REFINED_DESCRIPTION:
				return REFINED_DESCRIPTION_EDEFAULT == null ? refinedDescription != null : !REFINED_DESCRIPTION_EDEFAULT.equals(refinedDescription);
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
		result.append(" (refinedDescription: ");
		result.append(refinedDescription);
		result.append(')');
		return result.toString();
	}

} //DescriptorDescriptionImpl

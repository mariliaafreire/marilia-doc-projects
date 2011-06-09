/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31.impl;

import jpdl31.ConfigTypeType;
import jpdl31.Delegation;
import jpdl31.Jpdl31Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jpdl31.impl.DelegationImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link jpdl31.impl.DelegationImpl#getAny <em>Any</em>}</li>
 *   <li>{@link jpdl31.impl.DelegationImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link jpdl31.impl.DelegationImpl#getConfigType <em>Config Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelegationImpl extends EObjectImpl implements Delegation {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigType() <em>Config Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigType()
	 * @generated
	 * @ordered
	 */
	protected static final ConfigTypeType CONFIG_TYPE_EDEFAULT = ConfigTypeType.FIELD;

	/**
	 * The cached value of the '{@link #getConfigType() <em>Config Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigType()
	 * @generated
	 * @ordered
	 */
	protected ConfigTypeType configType = CONFIG_TYPE_EDEFAULT;

	/**
	 * This is true if the Config Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean configTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jpdl31Package.Literals.DELEGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jpdl31Package.DELEGATION__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jpdl31Package.Literals.DELEGATION__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.DELEGATION__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigTypeType getConfigType() {
		return configType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigType(ConfigTypeType newConfigType) {
		ConfigTypeType oldConfigType = configType;
		configType = newConfigType == null ? CONFIG_TYPE_EDEFAULT : newConfigType;
		boolean oldConfigTypeESet = configTypeESet;
		configTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.DELEGATION__CONFIG_TYPE, oldConfigType, configType, !oldConfigTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConfigType() {
		ConfigTypeType oldConfigType = configType;
		boolean oldConfigTypeESet = configTypeESet;
		configType = CONFIG_TYPE_EDEFAULT;
		configTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jpdl31Package.DELEGATION__CONFIG_TYPE, oldConfigType, CONFIG_TYPE_EDEFAULT, oldConfigTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConfigType() {
		return configTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jpdl31Package.DELEGATION__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.DELEGATION__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Jpdl31Package.DELEGATION__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jpdl31Package.DELEGATION__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case Jpdl31Package.DELEGATION__CLASS:
				return getClass_();
			case Jpdl31Package.DELEGATION__CONFIG_TYPE:
				return getConfigType();
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
			case Jpdl31Package.DELEGATION__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jpdl31Package.DELEGATION__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case Jpdl31Package.DELEGATION__CLASS:
				setClass((String)newValue);
				return;
			case Jpdl31Package.DELEGATION__CONFIG_TYPE:
				setConfigType((ConfigTypeType)newValue);
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
			case Jpdl31Package.DELEGATION__MIXED:
				getMixed().clear();
				return;
			case Jpdl31Package.DELEGATION__ANY:
				getAny().clear();
				return;
			case Jpdl31Package.DELEGATION__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case Jpdl31Package.DELEGATION__CONFIG_TYPE:
				unsetConfigType();
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
			case Jpdl31Package.DELEGATION__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jpdl31Package.DELEGATION__ANY:
				return !getAny().isEmpty();
			case Jpdl31Package.DELEGATION__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case Jpdl31Package.DELEGATION__CONFIG_TYPE:
				return isSetConfigType();
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", class: ");
		result.append(class_);
		result.append(", configType: ");
		if (configTypeESet) result.append(configType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DelegationImpl

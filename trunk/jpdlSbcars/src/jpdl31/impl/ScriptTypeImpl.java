/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31.impl;

import jpdl31.BooleanType;
import jpdl31.Jpdl31Package;
import jpdl31.ScriptType;

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
 * An implementation of the model object '<em><b>Script Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jpdl31.impl.ScriptTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link jpdl31.impl.ScriptTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link jpdl31.impl.ScriptTypeImpl#getAcceptPropagatedEvents <em>Accept Propagated Events</em>}</li>
 *   <li>{@link jpdl31.impl.ScriptTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScriptTypeImpl extends EObjectImpl implements ScriptType {
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
	 * The default value of the '{@link #getAcceptPropagatedEvents() <em>Accept Propagated Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptPropagatedEvents()
	 * @generated
	 * @ordered
	 */
	protected static final BooleanType ACCEPT_PROPAGATED_EVENTS_EDEFAULT = BooleanType.TRUE;

	/**
	 * The cached value of the '{@link #getAcceptPropagatedEvents() <em>Accept Propagated Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptPropagatedEvents()
	 * @generated
	 * @ordered
	 */
	protected BooleanType acceptPropagatedEvents = ACCEPT_PROPAGATED_EVENTS_EDEFAULT;

	/**
	 * This is true if the Accept Propagated Events attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean acceptPropagatedEventsESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jpdl31Package.Literals.SCRIPT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jpdl31Package.SCRIPT_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jpdl31Package.Literals.SCRIPT_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType getAcceptPropagatedEvents() {
		return acceptPropagatedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptPropagatedEvents(BooleanType newAcceptPropagatedEvents) {
		BooleanType oldAcceptPropagatedEvents = acceptPropagatedEvents;
		acceptPropagatedEvents = newAcceptPropagatedEvents == null ? ACCEPT_PROPAGATED_EVENTS_EDEFAULT : newAcceptPropagatedEvents;
		boolean oldAcceptPropagatedEventsESet = acceptPropagatedEventsESet;
		acceptPropagatedEventsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.SCRIPT_TYPE__ACCEPT_PROPAGATED_EVENTS, oldAcceptPropagatedEvents, acceptPropagatedEvents, !oldAcceptPropagatedEventsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAcceptPropagatedEvents() {
		BooleanType oldAcceptPropagatedEvents = acceptPropagatedEvents;
		boolean oldAcceptPropagatedEventsESet = acceptPropagatedEventsESet;
		acceptPropagatedEvents = ACCEPT_PROPAGATED_EVENTS_EDEFAULT;
		acceptPropagatedEventsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jpdl31Package.SCRIPT_TYPE__ACCEPT_PROPAGATED_EVENTS, oldAcceptPropagatedEvents, ACCEPT_PROPAGATED_EVENTS_EDEFAULT, oldAcceptPropagatedEventsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAcceptPropagatedEvents() {
		return acceptPropagatedEventsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.SCRIPT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jpdl31Package.SCRIPT_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.SCRIPT_TYPE__ANY:
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
			case Jpdl31Package.SCRIPT_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jpdl31Package.SCRIPT_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case Jpdl31Package.SCRIPT_TYPE__ACCEPT_PROPAGATED_EVENTS:
				return getAcceptPropagatedEvents();
			case Jpdl31Package.SCRIPT_TYPE__NAME:
				return getName();
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
			case Jpdl31Package.SCRIPT_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jpdl31Package.SCRIPT_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case Jpdl31Package.SCRIPT_TYPE__ACCEPT_PROPAGATED_EVENTS:
				setAcceptPropagatedEvents((BooleanType)newValue);
				return;
			case Jpdl31Package.SCRIPT_TYPE__NAME:
				setName((String)newValue);
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
			case Jpdl31Package.SCRIPT_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jpdl31Package.SCRIPT_TYPE__ANY:
				getAny().clear();
				return;
			case Jpdl31Package.SCRIPT_TYPE__ACCEPT_PROPAGATED_EVENTS:
				unsetAcceptPropagatedEvents();
				return;
			case Jpdl31Package.SCRIPT_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case Jpdl31Package.SCRIPT_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jpdl31Package.SCRIPT_TYPE__ANY:
				return !getAny().isEmpty();
			case Jpdl31Package.SCRIPT_TYPE__ACCEPT_PROPAGATED_EVENTS:
				return isSetAcceptPropagatedEvents();
			case Jpdl31Package.SCRIPT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(", acceptPropagatedEvents: ");
		if (acceptPropagatedEventsESet) result.append(acceptPropagatedEvents); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ScriptTypeImpl

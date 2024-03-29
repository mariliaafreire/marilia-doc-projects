/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31.impl;

import java.util.Collection;

import jpdl31.ActionType;
import jpdl31.CancelTimerType;
import jpdl31.CreateTimerType;
import jpdl31.EventType;
import jpdl31.Jpdl31Package;
import jpdl31.ScriptType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jpdl31.impl.EventTypeImpl#getActionElements <em>Action Elements</em>}</li>
 *   <li>{@link jpdl31.impl.EventTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link jpdl31.impl.EventTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link jpdl31.impl.EventTypeImpl#getCreateTimer <em>Create Timer</em>}</li>
 *   <li>{@link jpdl31.impl.EventTypeImpl#getCancelTimer <em>Cancel Timer</em>}</li>
 *   <li>{@link jpdl31.impl.EventTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventTypeImpl extends EObjectImpl implements EventType {
	/**
	 * The cached value of the '{@link #getActionElements() <em>Action Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionElements()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap actionElements;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Object TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Object type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jpdl31Package.Literals.EVENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getActionElements() {
		if (actionElements == null) {
			actionElements = new BasicFeatureMap(this, Jpdl31Package.EVENT_TYPE__ACTION_ELEMENTS);
		}
		return actionElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionType> getAction() {
		return getActionElements().list(Jpdl31Package.Literals.EVENT_TYPE__ACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScriptType> getScript() {
		return getActionElements().list(Jpdl31Package.Literals.EVENT_TYPE__SCRIPT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreateTimerType> getCreateTimer() {
		return getActionElements().list(Jpdl31Package.Literals.EVENT_TYPE__CREATE_TIMER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CancelTimerType> getCancelTimer() {
		return getActionElements().list(Jpdl31Package.Literals.EVENT_TYPE__CANCEL_TIMER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Object newType) {
		Object oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.EVENT_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jpdl31Package.EVENT_TYPE__ACTION_ELEMENTS:
				return ((InternalEList<?>)getActionElements()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.EVENT_TYPE__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.EVENT_TYPE__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.EVENT_TYPE__CREATE_TIMER:
				return ((InternalEList<?>)getCreateTimer()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.EVENT_TYPE__CANCEL_TIMER:
				return ((InternalEList<?>)getCancelTimer()).basicRemove(otherEnd, msgs);
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
			case Jpdl31Package.EVENT_TYPE__ACTION_ELEMENTS:
				if (coreType) return getActionElements();
				return ((FeatureMap.Internal)getActionElements()).getWrapper();
			case Jpdl31Package.EVENT_TYPE__ACTION:
				return getAction();
			case Jpdl31Package.EVENT_TYPE__SCRIPT:
				return getScript();
			case Jpdl31Package.EVENT_TYPE__CREATE_TIMER:
				return getCreateTimer();
			case Jpdl31Package.EVENT_TYPE__CANCEL_TIMER:
				return getCancelTimer();
			case Jpdl31Package.EVENT_TYPE__TYPE:
				return getType();
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
			case Jpdl31Package.EVENT_TYPE__ACTION_ELEMENTS:
				((FeatureMap.Internal)getActionElements()).set(newValue);
				return;
			case Jpdl31Package.EVENT_TYPE__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends ActionType>)newValue);
				return;
			case Jpdl31Package.EVENT_TYPE__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends ScriptType>)newValue);
				return;
			case Jpdl31Package.EVENT_TYPE__CREATE_TIMER:
				getCreateTimer().clear();
				getCreateTimer().addAll((Collection<? extends CreateTimerType>)newValue);
				return;
			case Jpdl31Package.EVENT_TYPE__CANCEL_TIMER:
				getCancelTimer().clear();
				getCancelTimer().addAll((Collection<? extends CancelTimerType>)newValue);
				return;
			case Jpdl31Package.EVENT_TYPE__TYPE:
				setType(newValue);
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
			case Jpdl31Package.EVENT_TYPE__ACTION_ELEMENTS:
				getActionElements().clear();
				return;
			case Jpdl31Package.EVENT_TYPE__ACTION:
				getAction().clear();
				return;
			case Jpdl31Package.EVENT_TYPE__SCRIPT:
				getScript().clear();
				return;
			case Jpdl31Package.EVENT_TYPE__CREATE_TIMER:
				getCreateTimer().clear();
				return;
			case Jpdl31Package.EVENT_TYPE__CANCEL_TIMER:
				getCancelTimer().clear();
				return;
			case Jpdl31Package.EVENT_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case Jpdl31Package.EVENT_TYPE__ACTION_ELEMENTS:
				return actionElements != null && !actionElements.isEmpty();
			case Jpdl31Package.EVENT_TYPE__ACTION:
				return !getAction().isEmpty();
			case Jpdl31Package.EVENT_TYPE__SCRIPT:
				return !getScript().isEmpty();
			case Jpdl31Package.EVENT_TYPE__CREATE_TIMER:
				return !getCreateTimer().isEmpty();
			case Jpdl31Package.EVENT_TYPE__CANCEL_TIMER:
				return !getCancelTimer().isEmpty();
			case Jpdl31Package.EVENT_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (actionElements: ");
		result.append(actionElements);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //EventTypeImpl

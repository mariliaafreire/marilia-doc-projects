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
import jpdl31.ExceptionHandlerType;
import jpdl31.Jpdl31Package;
import jpdl31.ScriptType;
import jpdl31.TransitionType;

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
 * An implementation of the model object '<em><b>Transition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jpdl31.impl.TransitionTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link jpdl31.impl.TransitionTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link jpdl31.impl.TransitionTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link jpdl31.impl.TransitionTypeImpl#getCreateTimer <em>Create Timer</em>}</li>
 *   <li>{@link jpdl31.impl.TransitionTypeImpl#getCancelTimer <em>Cancel Timer</em>}</li>
 *   <li>{@link jpdl31.impl.TransitionTypeImpl#getExceptionHandler <em>Exception Handler</em>}</li>
 *   <li>{@link jpdl31.impl.TransitionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link jpdl31.impl.TransitionTypeImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionTypeImpl extends EObjectImpl implements TransitionType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected String to = TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jpdl31Package.Literals.TRANSITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Jpdl31Package.TRANSITION_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionType> getAction() {
		return getGroup().list(Jpdl31Package.Literals.TRANSITION_TYPE__ACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScriptType> getScript() {
		return getGroup().list(Jpdl31Package.Literals.TRANSITION_TYPE__SCRIPT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreateTimerType> getCreateTimer() {
		return getGroup().list(Jpdl31Package.Literals.TRANSITION_TYPE__CREATE_TIMER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CancelTimerType> getCancelTimer() {
		return getGroup().list(Jpdl31Package.Literals.TRANSITION_TYPE__CANCEL_TIMER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExceptionHandlerType> getExceptionHandler() {
		return getGroup().list(Jpdl31Package.Literals.TRANSITION_TYPE__EXCEPTION_HANDLER);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.TRANSITION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(String newTo) {
		String oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.TRANSITION_TYPE__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jpdl31Package.TRANSITION_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.TRANSITION_TYPE__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.TRANSITION_TYPE__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.TRANSITION_TYPE__CREATE_TIMER:
				return ((InternalEList<?>)getCreateTimer()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.TRANSITION_TYPE__CANCEL_TIMER:
				return ((InternalEList<?>)getCancelTimer()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.TRANSITION_TYPE__EXCEPTION_HANDLER:
				return ((InternalEList<?>)getExceptionHandler()).basicRemove(otherEnd, msgs);
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
			case Jpdl31Package.TRANSITION_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Jpdl31Package.TRANSITION_TYPE__ACTION:
				return getAction();
			case Jpdl31Package.TRANSITION_TYPE__SCRIPT:
				return getScript();
			case Jpdl31Package.TRANSITION_TYPE__CREATE_TIMER:
				return getCreateTimer();
			case Jpdl31Package.TRANSITION_TYPE__CANCEL_TIMER:
				return getCancelTimer();
			case Jpdl31Package.TRANSITION_TYPE__EXCEPTION_HANDLER:
				return getExceptionHandler();
			case Jpdl31Package.TRANSITION_TYPE__NAME:
				return getName();
			case Jpdl31Package.TRANSITION_TYPE__TO:
				return getTo();
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
			case Jpdl31Package.TRANSITION_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Jpdl31Package.TRANSITION_TYPE__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends ActionType>)newValue);
				return;
			case Jpdl31Package.TRANSITION_TYPE__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends ScriptType>)newValue);
				return;
			case Jpdl31Package.TRANSITION_TYPE__CREATE_TIMER:
				getCreateTimer().clear();
				getCreateTimer().addAll((Collection<? extends CreateTimerType>)newValue);
				return;
			case Jpdl31Package.TRANSITION_TYPE__CANCEL_TIMER:
				getCancelTimer().clear();
				getCancelTimer().addAll((Collection<? extends CancelTimerType>)newValue);
				return;
			case Jpdl31Package.TRANSITION_TYPE__EXCEPTION_HANDLER:
				getExceptionHandler().clear();
				getExceptionHandler().addAll((Collection<? extends ExceptionHandlerType>)newValue);
				return;
			case Jpdl31Package.TRANSITION_TYPE__NAME:
				setName((String)newValue);
				return;
			case Jpdl31Package.TRANSITION_TYPE__TO:
				setTo((String)newValue);
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
			case Jpdl31Package.TRANSITION_TYPE__GROUP:
				getGroup().clear();
				return;
			case Jpdl31Package.TRANSITION_TYPE__ACTION:
				getAction().clear();
				return;
			case Jpdl31Package.TRANSITION_TYPE__SCRIPT:
				getScript().clear();
				return;
			case Jpdl31Package.TRANSITION_TYPE__CREATE_TIMER:
				getCreateTimer().clear();
				return;
			case Jpdl31Package.TRANSITION_TYPE__CANCEL_TIMER:
				getCancelTimer().clear();
				return;
			case Jpdl31Package.TRANSITION_TYPE__EXCEPTION_HANDLER:
				getExceptionHandler().clear();
				return;
			case Jpdl31Package.TRANSITION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Jpdl31Package.TRANSITION_TYPE__TO:
				setTo(TO_EDEFAULT);
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
			case Jpdl31Package.TRANSITION_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Jpdl31Package.TRANSITION_TYPE__ACTION:
				return !getAction().isEmpty();
			case Jpdl31Package.TRANSITION_TYPE__SCRIPT:
				return !getScript().isEmpty();
			case Jpdl31Package.TRANSITION_TYPE__CREATE_TIMER:
				return !getCreateTimer().isEmpty();
			case Jpdl31Package.TRANSITION_TYPE__CANCEL_TIMER:
				return !getCancelTimer().isEmpty();
			case Jpdl31Package.TRANSITION_TYPE__EXCEPTION_HANDLER:
				return !getExceptionHandler().isEmpty();
			case Jpdl31Package.TRANSITION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Jpdl31Package.TRANSITION_TYPE__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", name: ");
		result.append(name);
		result.append(", to: ");
		result.append(to);
		result.append(')');
		return result.toString();
	}

} //TransitionTypeImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31.impl;

import java.util.Collection;

import jpdl31.ActionType;
import jpdl31.ExceptionHandlerType;
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
 * An implementation of the model object '<em><b>Exception Handler Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jpdl31.impl.ExceptionHandlerTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link jpdl31.impl.ExceptionHandlerTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link jpdl31.impl.ExceptionHandlerTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link jpdl31.impl.ExceptionHandlerTypeImpl#getExceptionClass <em>Exception Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExceptionHandlerTypeImpl extends EObjectImpl implements ExceptionHandlerType {
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
	 * The default value of the '{@link #getExceptionClass() <em>Exception Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionClass()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPTION_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionClass() <em>Exception Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionClass()
	 * @generated
	 * @ordered
	 */
	protected String exceptionClass = EXCEPTION_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionHandlerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jpdl31Package.Literals.EXCEPTION_HANDLER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Jpdl31Package.EXCEPTION_HANDLER_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionType> getAction() {
		return getGroup().list(Jpdl31Package.Literals.EXCEPTION_HANDLER_TYPE__ACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScriptType> getScript() {
		return getGroup().list(Jpdl31Package.Literals.EXCEPTION_HANDLER_TYPE__SCRIPT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExceptionClass() {
		return exceptionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionClass(String newExceptionClass) {
		String oldExceptionClass = exceptionClass;
		exceptionClass = newExceptionClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.EXCEPTION_HANDLER_TYPE__EXCEPTION_CLASS, oldExceptionClass, exceptionClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jpdl31Package.EXCEPTION_HANDLER_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.EXCEPTION_HANDLER_TYPE__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.EXCEPTION_HANDLER_TYPE__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
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
			case Jpdl31Package.EXCEPTION_HANDLER_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Jpdl31Package.EXCEPTION_HANDLER_TYPE__ACTION:
				return getAction();
			case Jpdl31Package.EXCEPTION_HANDLER_TYPE__SCRIPT:
				return getScript();
			case Jpdl31Package.EXCEPTION_HANDLER_TYPE__EXCEPTION_CLASS:
				return getExceptionClass();
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
			case Jpdl31Package.EXCEPTION_HANDLER_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Jpdl31Package.EXCEPTION_HANDLER_TYPE__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends ActionType>)newValue);
				return;
			case Jpdl31Package.EXCEPTION_HANDLER_TYPE__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends ScriptType>)newValue);
				return;
			case Jpdl31Package.EXCEPTION_HANDLER_TYPE__EXCEPTION_CLASS:
				setExceptionClass((String)newValue);
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
			case Jpdl31Package.EXCEPTION_HANDLER_TYPE__GROUP:
				getGroup().clear();
				return;
			case Jpdl31Package.EXCEPTION_HANDLER_TYPE__ACTION:
				getAction().clear();
				return;
			case Jpdl31Package.EXCEPTION_HANDLER_TYPE__SCRIPT:
				getScript().clear();
				return;
			case Jpdl31Package.EXCEPTION_HANDLER_TYPE__EXCEPTION_CLASS:
				setExceptionClass(EXCEPTION_CLASS_EDEFAULT);
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
			case Jpdl31Package.EXCEPTION_HANDLER_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Jpdl31Package.EXCEPTION_HANDLER_TYPE__ACTION:
				return !getAction().isEmpty();
			case Jpdl31Package.EXCEPTION_HANDLER_TYPE__SCRIPT:
				return !getScript().isEmpty();
			case Jpdl31Package.EXCEPTION_HANDLER_TYPE__EXCEPTION_CLASS:
				return EXCEPTION_CLASS_EDEFAULT == null ? exceptionClass != null : !EXCEPTION_CLASS_EDEFAULT.equals(exceptionClass);
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
		result.append(", exceptionClass: ");
		result.append(exceptionClass);
		result.append(')');
		return result.toString();
	}

} //ExceptionHandlerTypeImpl

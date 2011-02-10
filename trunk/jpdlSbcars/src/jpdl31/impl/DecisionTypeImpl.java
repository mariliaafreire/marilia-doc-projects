/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31.impl;

import java.util.Collection;

import jpdl31.DecisionType;
import jpdl31.Delegation;
import jpdl31.EventType;
import jpdl31.ExceptionHandlerType;
import jpdl31.Jpdl31Package;
import jpdl31.TransitionType1;

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
 * An implementation of the model object '<em><b>Decision Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jpdl31.impl.DecisionTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link jpdl31.impl.DecisionTypeImpl#getHandler <em>Handler</em>}</li>
 *   <li>{@link jpdl31.impl.DecisionTypeImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link jpdl31.impl.DecisionTypeImpl#getExceptionHandler <em>Exception Handler</em>}</li>
 *   <li>{@link jpdl31.impl.DecisionTypeImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link jpdl31.impl.DecisionTypeImpl#getAsync <em>Async</em>}</li>
 *   <li>{@link jpdl31.impl.DecisionTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link jpdl31.impl.DecisionTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionTypeImpl extends EObjectImpl implements DecisionType {
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
	 * The default value of the '{@link #getAsync() <em>Async</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsync()
	 * @generated
	 * @ordered
	 */
	protected static final String ASYNC_EDEFAULT = "false";

	/**
	 * The cached value of the '{@link #getAsync() <em>Async</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsync()
	 * @generated
	 * @ordered
	 */
	protected String async = ASYNC_EDEFAULT;

	/**
	 * This is true if the Async attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean asyncESet;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

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
	protected DecisionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jpdl31Package.Literals.DECISION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Jpdl31Package.DECISION_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delegation> getHandler() {
		return getGroup().list(Jpdl31Package.Literals.DECISION_TYPE__HANDLER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventType> getEvent() {
		return getGroup().list(Jpdl31Package.Literals.DECISION_TYPE__EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExceptionHandlerType> getExceptionHandler() {
		return getGroup().list(Jpdl31Package.Literals.DECISION_TYPE__EXCEPTION_HANDLER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransitionType1> getTransition() {
		return getGroup().list(Jpdl31Package.Literals.DECISION_TYPE__TRANSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAsync() {
		return async;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsync(String newAsync) {
		String oldAsync = async;
		async = newAsync;
		boolean oldAsyncESet = asyncESet;
		asyncESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.DECISION_TYPE__ASYNC, oldAsync, async, !oldAsyncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAsync() {
		String oldAsync = async;
		boolean oldAsyncESet = asyncESet;
		async = ASYNC_EDEFAULT;
		asyncESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jpdl31Package.DECISION_TYPE__ASYNC, oldAsync, ASYNC_EDEFAULT, oldAsyncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAsync() {
		return asyncESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.DECISION_TYPE__EXPRESSION, oldExpression, expression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.DECISION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jpdl31Package.DECISION_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.DECISION_TYPE__HANDLER:
				return ((InternalEList<?>)getHandler()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.DECISION_TYPE__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.DECISION_TYPE__EXCEPTION_HANDLER:
				return ((InternalEList<?>)getExceptionHandler()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.DECISION_TYPE__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
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
			case Jpdl31Package.DECISION_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Jpdl31Package.DECISION_TYPE__HANDLER:
				return getHandler();
			case Jpdl31Package.DECISION_TYPE__EVENT:
				return getEvent();
			case Jpdl31Package.DECISION_TYPE__EXCEPTION_HANDLER:
				return getExceptionHandler();
			case Jpdl31Package.DECISION_TYPE__TRANSITION:
				return getTransition();
			case Jpdl31Package.DECISION_TYPE__ASYNC:
				return getAsync();
			case Jpdl31Package.DECISION_TYPE__EXPRESSION:
				return getExpression();
			case Jpdl31Package.DECISION_TYPE__NAME:
				return getName();
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
			case Jpdl31Package.DECISION_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Jpdl31Package.DECISION_TYPE__HANDLER:
				getHandler().clear();
				getHandler().addAll((Collection<? extends Delegation>)newValue);
				return;
			case Jpdl31Package.DECISION_TYPE__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EventType>)newValue);
				return;
			case Jpdl31Package.DECISION_TYPE__EXCEPTION_HANDLER:
				getExceptionHandler().clear();
				getExceptionHandler().addAll((Collection<? extends ExceptionHandlerType>)newValue);
				return;
			case Jpdl31Package.DECISION_TYPE__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends TransitionType1>)newValue);
				return;
			case Jpdl31Package.DECISION_TYPE__ASYNC:
				setAsync((String)newValue);
				return;
			case Jpdl31Package.DECISION_TYPE__EXPRESSION:
				setExpression((String)newValue);
				return;
			case Jpdl31Package.DECISION_TYPE__NAME:
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
			case Jpdl31Package.DECISION_TYPE__GROUP:
				getGroup().clear();
				return;
			case Jpdl31Package.DECISION_TYPE__HANDLER:
				getHandler().clear();
				return;
			case Jpdl31Package.DECISION_TYPE__EVENT:
				getEvent().clear();
				return;
			case Jpdl31Package.DECISION_TYPE__EXCEPTION_HANDLER:
				getExceptionHandler().clear();
				return;
			case Jpdl31Package.DECISION_TYPE__TRANSITION:
				getTransition().clear();
				return;
			case Jpdl31Package.DECISION_TYPE__ASYNC:
				unsetAsync();
				return;
			case Jpdl31Package.DECISION_TYPE__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case Jpdl31Package.DECISION_TYPE__NAME:
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
			case Jpdl31Package.DECISION_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Jpdl31Package.DECISION_TYPE__HANDLER:
				return !getHandler().isEmpty();
			case Jpdl31Package.DECISION_TYPE__EVENT:
				return !getEvent().isEmpty();
			case Jpdl31Package.DECISION_TYPE__EXCEPTION_HANDLER:
				return !getExceptionHandler().isEmpty();
			case Jpdl31Package.DECISION_TYPE__TRANSITION:
				return !getTransition().isEmpty();
			case Jpdl31Package.DECISION_TYPE__ASYNC:
				return isSetAsync();
			case Jpdl31Package.DECISION_TYPE__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case Jpdl31Package.DECISION_TYPE__NAME:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", async: ");
		if (asyncESet) result.append(async); else result.append("<unset>");
		result.append(", expression: ");
		result.append(expression);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DecisionTypeImpl

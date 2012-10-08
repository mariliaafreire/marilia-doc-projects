/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31.impl;

import jpdl31.ActionType;
import jpdl31.BooleanType;
import jpdl31.ConfigTypeType1;
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
 * An implementation of the model object '<em><b>Action Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jpdl31.impl.ActionTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link jpdl31.impl.ActionTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link jpdl31.impl.ActionTypeImpl#getAcceptPropagatedEvents <em>Accept Propagated Events</em>}</li>
 *   <li>{@link jpdl31.impl.ActionTypeImpl#getAsync <em>Async</em>}</li>
 *   <li>{@link jpdl31.impl.ActionTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link jpdl31.impl.ActionTypeImpl#getConfigType <em>Config Type</em>}</li>
 *   <li>{@link jpdl31.impl.ActionTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link jpdl31.impl.ActionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link jpdl31.impl.ActionTypeImpl#getRefName <em>Ref Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionTypeImpl extends EObjectImpl implements ActionType {
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
	 * The default value of the '{@link #getAsync() <em>Async</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsync()
	 * @generated
	 * @ordered
	 */
	protected static final String ASYNC_EDEFAULT = null;

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
	protected static final ConfigTypeType1 CONFIG_TYPE_EDEFAULT = ConfigTypeType1.FIELD;

	/**
	 * The cached value of the '{@link #getConfigType() <em>Config Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigType()
	 * @generated
	 * @ordered
	 */
	protected ConfigTypeType1 configType = CONFIG_TYPE_EDEFAULT;

	/**
	 * This is true if the Config Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean configTypeESet;

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
	 * The default value of the '{@link #getRefName() <em>Ref Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefName()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefName() <em>Ref Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefName()
	 * @generated
	 * @ordered
	 */
	protected String refName = REF_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jpdl31Package.Literals.ACTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jpdl31Package.ACTION_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jpdl31Package.Literals.ACTION_TYPE__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.ACTION_TYPE__ACCEPT_PROPAGATED_EVENTS, oldAcceptPropagatedEvents, acceptPropagatedEvents, !oldAcceptPropagatedEventsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jpdl31Package.ACTION_TYPE__ACCEPT_PROPAGATED_EVENTS, oldAcceptPropagatedEvents, ACCEPT_PROPAGATED_EVENTS_EDEFAULT, oldAcceptPropagatedEventsESet));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.ACTION_TYPE__ASYNC, oldAsync, async));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.ACTION_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigTypeType1 getConfigType() {
		return configType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigType(ConfigTypeType1 newConfigType) {
		ConfigTypeType1 oldConfigType = configType;
		configType = newConfigType == null ? CONFIG_TYPE_EDEFAULT : newConfigType;
		boolean oldConfigTypeESet = configTypeESet;
		configTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.ACTION_TYPE__CONFIG_TYPE, oldConfigType, configType, !oldConfigTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConfigType() {
		ConfigTypeType1 oldConfigType = configType;
		boolean oldConfigTypeESet = configTypeESet;
		configType = CONFIG_TYPE_EDEFAULT;
		configTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jpdl31Package.ACTION_TYPE__CONFIG_TYPE, oldConfigType, CONFIG_TYPE_EDEFAULT, oldConfigTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.ACTION_TYPE__EXPRESSION, oldExpression, expression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.ACTION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefName() {
		return refName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefName(String newRefName) {
		String oldRefName = refName;
		refName = newRefName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.ACTION_TYPE__REF_NAME, oldRefName, refName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jpdl31Package.ACTION_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.ACTION_TYPE__ANY:
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
			case Jpdl31Package.ACTION_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jpdl31Package.ACTION_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case Jpdl31Package.ACTION_TYPE__ACCEPT_PROPAGATED_EVENTS:
				return getAcceptPropagatedEvents();
			case Jpdl31Package.ACTION_TYPE__ASYNC:
				return getAsync();
			case Jpdl31Package.ACTION_TYPE__CLASS:
				return getClass_();
			case Jpdl31Package.ACTION_TYPE__CONFIG_TYPE:
				return getConfigType();
			case Jpdl31Package.ACTION_TYPE__EXPRESSION:
				return getExpression();
			case Jpdl31Package.ACTION_TYPE__NAME:
				return getName();
			case Jpdl31Package.ACTION_TYPE__REF_NAME:
				return getRefName();
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
			case Jpdl31Package.ACTION_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jpdl31Package.ACTION_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case Jpdl31Package.ACTION_TYPE__ACCEPT_PROPAGATED_EVENTS:
				setAcceptPropagatedEvents((BooleanType)newValue);
				return;
			case Jpdl31Package.ACTION_TYPE__ASYNC:
				setAsync((String)newValue);
				return;
			case Jpdl31Package.ACTION_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case Jpdl31Package.ACTION_TYPE__CONFIG_TYPE:
				setConfigType((ConfigTypeType1)newValue);
				return;
			case Jpdl31Package.ACTION_TYPE__EXPRESSION:
				setExpression((String)newValue);
				return;
			case Jpdl31Package.ACTION_TYPE__NAME:
				setName((String)newValue);
				return;
			case Jpdl31Package.ACTION_TYPE__REF_NAME:
				setRefName((String)newValue);
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
			case Jpdl31Package.ACTION_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jpdl31Package.ACTION_TYPE__ANY:
				getAny().clear();
				return;
			case Jpdl31Package.ACTION_TYPE__ACCEPT_PROPAGATED_EVENTS:
				unsetAcceptPropagatedEvents();
				return;
			case Jpdl31Package.ACTION_TYPE__ASYNC:
				setAsync(ASYNC_EDEFAULT);
				return;
			case Jpdl31Package.ACTION_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case Jpdl31Package.ACTION_TYPE__CONFIG_TYPE:
				unsetConfigType();
				return;
			case Jpdl31Package.ACTION_TYPE__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case Jpdl31Package.ACTION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Jpdl31Package.ACTION_TYPE__REF_NAME:
				setRefName(REF_NAME_EDEFAULT);
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
			case Jpdl31Package.ACTION_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jpdl31Package.ACTION_TYPE__ANY:
				return !getAny().isEmpty();
			case Jpdl31Package.ACTION_TYPE__ACCEPT_PROPAGATED_EVENTS:
				return isSetAcceptPropagatedEvents();
			case Jpdl31Package.ACTION_TYPE__ASYNC:
				return ASYNC_EDEFAULT == null ? async != null : !ASYNC_EDEFAULT.equals(async);
			case Jpdl31Package.ACTION_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case Jpdl31Package.ACTION_TYPE__CONFIG_TYPE:
				return isSetConfigType();
			case Jpdl31Package.ACTION_TYPE__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case Jpdl31Package.ACTION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Jpdl31Package.ACTION_TYPE__REF_NAME:
				return REF_NAME_EDEFAULT == null ? refName != null : !REF_NAME_EDEFAULT.equals(refName);
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
		result.append(", async: ");
		result.append(async);
		result.append(", class: ");
		result.append(class_);
		result.append(", configType: ");
		if (configTypeESet) result.append(configType); else result.append("<unset>");
		result.append(", expression: ");
		result.append(expression);
		result.append(", name: ");
		result.append(name);
		result.append(", refName: ");
		result.append(refName);
		result.append(')');
		return result.toString();
	}

} //ActionTypeImpl

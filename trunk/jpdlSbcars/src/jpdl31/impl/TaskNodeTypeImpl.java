/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31.impl;

import java.util.Collection;

import jpdl31.BooleanType;
import jpdl31.EventType;
import jpdl31.ExceptionHandlerType;
import jpdl31.Jpdl31Package;
import jpdl31.SignalType;
import jpdl31.TaskNodeType;
import jpdl31.TaskType;
import jpdl31.TimerType;
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
 * An implementation of the model object '<em><b>Task Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jpdl31.impl.TaskNodeTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link jpdl31.impl.TaskNodeTypeImpl#getTask <em>Task</em>}</li>
 *   <li>{@link jpdl31.impl.TaskNodeTypeImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link jpdl31.impl.TaskNodeTypeImpl#getExceptionHandler <em>Exception Handler</em>}</li>
 *   <li>{@link jpdl31.impl.TaskNodeTypeImpl#getTimer <em>Timer</em>}</li>
 *   <li>{@link jpdl31.impl.TaskNodeTypeImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link jpdl31.impl.TaskNodeTypeImpl#getAsync <em>Async</em>}</li>
 *   <li>{@link jpdl31.impl.TaskNodeTypeImpl#getCreateTasks <em>Create Tasks</em>}</li>
 *   <li>{@link jpdl31.impl.TaskNodeTypeImpl#getEndTasks <em>End Tasks</em>}</li>
 *   <li>{@link jpdl31.impl.TaskNodeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link jpdl31.impl.TaskNodeTypeImpl#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskNodeTypeImpl extends EObjectImpl implements TaskNodeType {
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
	 * The default value of the '{@link #getCreateTasks() <em>Create Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateTasks()
	 * @generated
	 * @ordered
	 */
	protected static final BooleanType CREATE_TASKS_EDEFAULT = BooleanType.TRUE;

	/**
	 * The cached value of the '{@link #getCreateTasks() <em>Create Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateTasks()
	 * @generated
	 * @ordered
	 */
	protected BooleanType createTasks = CREATE_TASKS_EDEFAULT;

	/**
	 * This is true if the Create Tasks attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean createTasksESet;

	/**
	 * The default value of the '{@link #getEndTasks() <em>End Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTasks()
	 * @generated
	 * @ordered
	 */
	protected static final BooleanType END_TASKS_EDEFAULT = BooleanType.FALSE;

	/**
	 * The cached value of the '{@link #getEndTasks() <em>End Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTasks()
	 * @generated
	 * @ordered
	 */
	protected BooleanType endTasks = END_TASKS_EDEFAULT;

	/**
	 * This is true if the End Tasks attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endTasksESet;

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
	 * The default value of the '{@link #getSignal() <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal()
	 * @generated
	 * @ordered
	 */
	protected static final SignalType SIGNAL_EDEFAULT = SignalType.LAST;

	/**
	 * The cached value of the '{@link #getSignal() <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal()
	 * @generated
	 * @ordered
	 */
	protected SignalType signal = SIGNAL_EDEFAULT;

	/**
	 * This is true if the Signal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean signalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskNodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jpdl31Package.Literals.TASK_NODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Jpdl31Package.TASK_NODE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskType> getTask() {
		return getGroup().list(Jpdl31Package.Literals.TASK_NODE_TYPE__TASK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventType> getEvent() {
		return getGroup().list(Jpdl31Package.Literals.TASK_NODE_TYPE__EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExceptionHandlerType> getExceptionHandler() {
		return getGroup().list(Jpdl31Package.Literals.TASK_NODE_TYPE__EXCEPTION_HANDLER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimerType> getTimer() {
		return getGroup().list(Jpdl31Package.Literals.TASK_NODE_TYPE__TIMER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransitionType> getTransition() {
		return getGroup().list(Jpdl31Package.Literals.TASK_NODE_TYPE__TRANSITION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.TASK_NODE_TYPE__ASYNC, oldAsync, async, !oldAsyncESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jpdl31Package.TASK_NODE_TYPE__ASYNC, oldAsync, ASYNC_EDEFAULT, oldAsyncESet));
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
	public BooleanType getCreateTasks() {
		return createTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateTasks(BooleanType newCreateTasks) {
		BooleanType oldCreateTasks = createTasks;
		createTasks = newCreateTasks == null ? CREATE_TASKS_EDEFAULT : newCreateTasks;
		boolean oldCreateTasksESet = createTasksESet;
		createTasksESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.TASK_NODE_TYPE__CREATE_TASKS, oldCreateTasks, createTasks, !oldCreateTasksESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCreateTasks() {
		BooleanType oldCreateTasks = createTasks;
		boolean oldCreateTasksESet = createTasksESet;
		createTasks = CREATE_TASKS_EDEFAULT;
		createTasksESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jpdl31Package.TASK_NODE_TYPE__CREATE_TASKS, oldCreateTasks, CREATE_TASKS_EDEFAULT, oldCreateTasksESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCreateTasks() {
		return createTasksESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType getEndTasks() {
		return endTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTasks(BooleanType newEndTasks) {
		BooleanType oldEndTasks = endTasks;
		endTasks = newEndTasks == null ? END_TASKS_EDEFAULT : newEndTasks;
		boolean oldEndTasksESet = endTasksESet;
		endTasksESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.TASK_NODE_TYPE__END_TASKS, oldEndTasks, endTasks, !oldEndTasksESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndTasks() {
		BooleanType oldEndTasks = endTasks;
		boolean oldEndTasksESet = endTasksESet;
		endTasks = END_TASKS_EDEFAULT;
		endTasksESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jpdl31Package.TASK_NODE_TYPE__END_TASKS, oldEndTasks, END_TASKS_EDEFAULT, oldEndTasksESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndTasks() {
		return endTasksESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.TASK_NODE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalType getSignal() {
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal(SignalType newSignal) {
		SignalType oldSignal = signal;
		signal = newSignal == null ? SIGNAL_EDEFAULT : newSignal;
		boolean oldSignalESet = signalESet;
		signalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.TASK_NODE_TYPE__SIGNAL, oldSignal, signal, !oldSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSignal() {
		SignalType oldSignal = signal;
		boolean oldSignalESet = signalESet;
		signal = SIGNAL_EDEFAULT;
		signalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jpdl31Package.TASK_NODE_TYPE__SIGNAL, oldSignal, SIGNAL_EDEFAULT, oldSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSignal() {
		return signalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jpdl31Package.TASK_NODE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.TASK_NODE_TYPE__TASK:
				return ((InternalEList<?>)getTask()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.TASK_NODE_TYPE__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.TASK_NODE_TYPE__EXCEPTION_HANDLER:
				return ((InternalEList<?>)getExceptionHandler()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.TASK_NODE_TYPE__TIMER:
				return ((InternalEList<?>)getTimer()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.TASK_NODE_TYPE__TRANSITION:
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
			case Jpdl31Package.TASK_NODE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Jpdl31Package.TASK_NODE_TYPE__TASK:
				return getTask();
			case Jpdl31Package.TASK_NODE_TYPE__EVENT:
				return getEvent();
			case Jpdl31Package.TASK_NODE_TYPE__EXCEPTION_HANDLER:
				return getExceptionHandler();
			case Jpdl31Package.TASK_NODE_TYPE__TIMER:
				return getTimer();
			case Jpdl31Package.TASK_NODE_TYPE__TRANSITION:
				return getTransition();
			case Jpdl31Package.TASK_NODE_TYPE__ASYNC:
				return getAsync();
			case Jpdl31Package.TASK_NODE_TYPE__CREATE_TASKS:
				return getCreateTasks();
			case Jpdl31Package.TASK_NODE_TYPE__END_TASKS:
				return getEndTasks();
			case Jpdl31Package.TASK_NODE_TYPE__NAME:
				return getName();
			case Jpdl31Package.TASK_NODE_TYPE__SIGNAL:
				return getSignal();
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
			case Jpdl31Package.TASK_NODE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Jpdl31Package.TASK_NODE_TYPE__TASK:
				getTask().clear();
				getTask().addAll((Collection<? extends TaskType>)newValue);
				return;
			case Jpdl31Package.TASK_NODE_TYPE__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EventType>)newValue);
				return;
			case Jpdl31Package.TASK_NODE_TYPE__EXCEPTION_HANDLER:
				getExceptionHandler().clear();
				getExceptionHandler().addAll((Collection<? extends ExceptionHandlerType>)newValue);
				return;
			case Jpdl31Package.TASK_NODE_TYPE__TIMER:
				getTimer().clear();
				getTimer().addAll((Collection<? extends TimerType>)newValue);
				return;
			case Jpdl31Package.TASK_NODE_TYPE__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends TransitionType>)newValue);
				return;
			case Jpdl31Package.TASK_NODE_TYPE__ASYNC:
				setAsync((String)newValue);
				return;
			case Jpdl31Package.TASK_NODE_TYPE__CREATE_TASKS:
				setCreateTasks((BooleanType)newValue);
				return;
			case Jpdl31Package.TASK_NODE_TYPE__END_TASKS:
				setEndTasks((BooleanType)newValue);
				return;
			case Jpdl31Package.TASK_NODE_TYPE__NAME:
				setName((String)newValue);
				return;
			case Jpdl31Package.TASK_NODE_TYPE__SIGNAL:
				setSignal((SignalType)newValue);
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
			case Jpdl31Package.TASK_NODE_TYPE__GROUP:
				getGroup().clear();
				return;
			case Jpdl31Package.TASK_NODE_TYPE__TASK:
				getTask().clear();
				return;
			case Jpdl31Package.TASK_NODE_TYPE__EVENT:
				getEvent().clear();
				return;
			case Jpdl31Package.TASK_NODE_TYPE__EXCEPTION_HANDLER:
				getExceptionHandler().clear();
				return;
			case Jpdl31Package.TASK_NODE_TYPE__TIMER:
				getTimer().clear();
				return;
			case Jpdl31Package.TASK_NODE_TYPE__TRANSITION:
				getTransition().clear();
				return;
			case Jpdl31Package.TASK_NODE_TYPE__ASYNC:
				unsetAsync();
				return;
			case Jpdl31Package.TASK_NODE_TYPE__CREATE_TASKS:
				unsetCreateTasks();
				return;
			case Jpdl31Package.TASK_NODE_TYPE__END_TASKS:
				unsetEndTasks();
				return;
			case Jpdl31Package.TASK_NODE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Jpdl31Package.TASK_NODE_TYPE__SIGNAL:
				unsetSignal();
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
			case Jpdl31Package.TASK_NODE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Jpdl31Package.TASK_NODE_TYPE__TASK:
				return !getTask().isEmpty();
			case Jpdl31Package.TASK_NODE_TYPE__EVENT:
				return !getEvent().isEmpty();
			case Jpdl31Package.TASK_NODE_TYPE__EXCEPTION_HANDLER:
				return !getExceptionHandler().isEmpty();
			case Jpdl31Package.TASK_NODE_TYPE__TIMER:
				return !getTimer().isEmpty();
			case Jpdl31Package.TASK_NODE_TYPE__TRANSITION:
				return !getTransition().isEmpty();
			case Jpdl31Package.TASK_NODE_TYPE__ASYNC:
				return isSetAsync();
			case Jpdl31Package.TASK_NODE_TYPE__CREATE_TASKS:
				return isSetCreateTasks();
			case Jpdl31Package.TASK_NODE_TYPE__END_TASKS:
				return isSetEndTasks();
			case Jpdl31Package.TASK_NODE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Jpdl31Package.TASK_NODE_TYPE__SIGNAL:
				return isSetSignal();
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
		result.append(", createTasks: ");
		if (createTasksESet) result.append(createTasks); else result.append("<unset>");
		result.append(", endTasks: ");
		if (endTasksESet) result.append(endTasks); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", signal: ");
		if (signalESet) result.append(signal); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TaskNodeTypeImpl

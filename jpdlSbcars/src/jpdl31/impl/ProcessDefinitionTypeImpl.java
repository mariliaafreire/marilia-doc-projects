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
import jpdl31.DecisionType;
import jpdl31.EndStateType;
import jpdl31.EventType;
import jpdl31.ExceptionHandlerType;
import jpdl31.ForkType;
import jpdl31.JoinType;
import jpdl31.Jpdl31Package;
import jpdl31.NodeType;
import jpdl31.ProcessDefinitionType;
import jpdl31.ProcessStateType;
import jpdl31.ScriptType;
import jpdl31.StartStateType;
import jpdl31.StateType;
import jpdl31.SuperStateType;
import jpdl31.SwimlaneType;
import jpdl31.TaskNodeType;
import jpdl31.TaskType;

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
 * An implementation of the model object '<em><b>Process Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jpdl31.impl.ProcessDefinitionTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link jpdl31.impl.ProcessDefinitionTypeImpl#getSwimlane <em>Swimlane</em>}</li>
 *   <li>{@link jpdl31.impl.ProcessDefinitionTypeImpl#getStartState <em>Start State</em>}</li>
 *   <li>{@link jpdl31.impl.ProcessDefinitionTypeImpl#getNode <em>Node</em>}</li>
 *   <li>{@link jpdl31.impl.ProcessDefinitionTypeImpl#getState <em>State</em>}</li>
 *   <li>{@link jpdl31.impl.ProcessDefinitionTypeImpl#getTaskNode <em>Task Node</em>}</li>
 *   <li>{@link jpdl31.impl.ProcessDefinitionTypeImpl#getSuperState <em>Super State</em>}</li>
 *   <li>{@link jpdl31.impl.ProcessDefinitionTypeImpl#getProcessState <em>Process State</em>}</li>
 *   <li>{@link jpdl31.impl.ProcessDefinitionTypeImpl#getFork <em>Fork</em>}</li>
 *   <li>{@link jpdl31.impl.ProcessDefinitionTypeImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link jpdl31.impl.ProcessDefinitionTypeImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link jpdl31.impl.ProcessDefinitionTypeImpl#getEndState <em>End State</em>}</li>
 *   <li>{@link jpdl31.impl.ProcessDefinitionTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link jpdl31.impl.ProcessDefinitionTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link jpdl31.impl.ProcessDefinitionTypeImpl#getCreateTimer <em>Create Timer</em>}</li>
 *   <li>{@link jpdl31.impl.ProcessDefinitionTypeImpl#getCancelTimer <em>Cancel Timer</em>}</li>
 *   <li>{@link jpdl31.impl.ProcessDefinitionTypeImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link jpdl31.impl.ProcessDefinitionTypeImpl#getExceptionHandler <em>Exception Handler</em>}</li>
 *   <li>{@link jpdl31.impl.ProcessDefinitionTypeImpl#getTask <em>Task</em>}</li>
 *   <li>{@link jpdl31.impl.ProcessDefinitionTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessDefinitionTypeImpl extends EObjectImpl implements ProcessDefinitionType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessDefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jpdl31Package.Literals.PROCESS_DEFINITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Jpdl31Package.PROCESS_DEFINITION_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwimlaneType> getSwimlane() {
		return getGroup().list(Jpdl31Package.Literals.PROCESS_DEFINITION_TYPE__SWIMLANE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StartStateType> getStartState() {
		return getGroup().list(Jpdl31Package.Literals.PROCESS_DEFINITION_TYPE__START_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeType> getNode() {
		return getGroup().list(Jpdl31Package.Literals.PROCESS_DEFINITION_TYPE__NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateType> getState() {
		return getGroup().list(Jpdl31Package.Literals.PROCESS_DEFINITION_TYPE__STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskNodeType> getTaskNode() {
		return getGroup().list(Jpdl31Package.Literals.PROCESS_DEFINITION_TYPE__TASK_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SuperStateType> getSuperState() {
		return getGroup().list(Jpdl31Package.Literals.PROCESS_DEFINITION_TYPE__SUPER_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessStateType> getProcessState() {
		return getGroup().list(Jpdl31Package.Literals.PROCESS_DEFINITION_TYPE__PROCESS_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForkType> getFork() {
		return getGroup().list(Jpdl31Package.Literals.PROCESS_DEFINITION_TYPE__FORK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinType> getJoin() {
		return getGroup().list(Jpdl31Package.Literals.PROCESS_DEFINITION_TYPE__JOIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionType> getDecision() {
		return getGroup().list(Jpdl31Package.Literals.PROCESS_DEFINITION_TYPE__DECISION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndStateType> getEndState() {
		return getGroup().list(Jpdl31Package.Literals.PROCESS_DEFINITION_TYPE__END_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionType> getAction() {
		return getGroup().list(Jpdl31Package.Literals.PROCESS_DEFINITION_TYPE__ACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScriptType> getScript() {
		return getGroup().list(Jpdl31Package.Literals.PROCESS_DEFINITION_TYPE__SCRIPT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreateTimerType> getCreateTimer() {
		return getGroup().list(Jpdl31Package.Literals.PROCESS_DEFINITION_TYPE__CREATE_TIMER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CancelTimerType> getCancelTimer() {
		return getGroup().list(Jpdl31Package.Literals.PROCESS_DEFINITION_TYPE__CANCEL_TIMER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventType> getEvent() {
		return getGroup().list(Jpdl31Package.Literals.PROCESS_DEFINITION_TYPE__EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExceptionHandlerType> getExceptionHandler() {
		return getGroup().list(Jpdl31Package.Literals.PROCESS_DEFINITION_TYPE__EXCEPTION_HANDLER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskType> getTask() {
		return getGroup().list(Jpdl31Package.Literals.PROCESS_DEFINITION_TYPE__TASK);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.PROCESS_DEFINITION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__SWIMLANE:
				return ((InternalEList<?>)getSwimlane()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__START_STATE:
				return ((InternalEList<?>)getStartState()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__TASK_NODE:
				return ((InternalEList<?>)getTaskNode()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__SUPER_STATE:
				return ((InternalEList<?>)getSuperState()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__PROCESS_STATE:
				return ((InternalEList<?>)getProcessState()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__FORK:
				return ((InternalEList<?>)getFork()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__JOIN:
				return ((InternalEList<?>)getJoin()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__DECISION:
				return ((InternalEList<?>)getDecision()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__END_STATE:
				return ((InternalEList<?>)getEndState()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__CREATE_TIMER:
				return ((InternalEList<?>)getCreateTimer()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__CANCEL_TIMER:
				return ((InternalEList<?>)getCancelTimer()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__EXCEPTION_HANDLER:
				return ((InternalEList<?>)getExceptionHandler()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__TASK:
				return ((InternalEList<?>)getTask()).basicRemove(otherEnd, msgs);
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
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__SWIMLANE:
				return getSwimlane();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__START_STATE:
				return getStartState();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__NODE:
				return getNode();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__STATE:
				return getState();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__TASK_NODE:
				return getTaskNode();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__SUPER_STATE:
				return getSuperState();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__PROCESS_STATE:
				return getProcessState();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__FORK:
				return getFork();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__JOIN:
				return getJoin();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__DECISION:
				return getDecision();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__END_STATE:
				return getEndState();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__ACTION:
				return getAction();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__SCRIPT:
				return getScript();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__CREATE_TIMER:
				return getCreateTimer();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__CANCEL_TIMER:
				return getCancelTimer();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__EVENT:
				return getEvent();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__EXCEPTION_HANDLER:
				return getExceptionHandler();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__TASK:
				return getTask();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__NAME:
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
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__SWIMLANE:
				getSwimlane().clear();
				getSwimlane().addAll((Collection<? extends SwimlaneType>)newValue);
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__START_STATE:
				getStartState().clear();
				getStartState().addAll((Collection<? extends StartStateType>)newValue);
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends NodeType>)newValue);
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__STATE:
				getState().clear();
				getState().addAll((Collection<? extends StateType>)newValue);
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__TASK_NODE:
				getTaskNode().clear();
				getTaskNode().addAll((Collection<? extends TaskNodeType>)newValue);
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__SUPER_STATE:
				getSuperState().clear();
				getSuperState().addAll((Collection<? extends SuperStateType>)newValue);
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__PROCESS_STATE:
				getProcessState().clear();
				getProcessState().addAll((Collection<? extends ProcessStateType>)newValue);
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__FORK:
				getFork().clear();
				getFork().addAll((Collection<? extends ForkType>)newValue);
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__JOIN:
				getJoin().clear();
				getJoin().addAll((Collection<? extends JoinType>)newValue);
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__DECISION:
				getDecision().clear();
				getDecision().addAll((Collection<? extends DecisionType>)newValue);
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__END_STATE:
				getEndState().clear();
				getEndState().addAll((Collection<? extends EndStateType>)newValue);
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends ActionType>)newValue);
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends ScriptType>)newValue);
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__CREATE_TIMER:
				getCreateTimer().clear();
				getCreateTimer().addAll((Collection<? extends CreateTimerType>)newValue);
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__CANCEL_TIMER:
				getCancelTimer().clear();
				getCancelTimer().addAll((Collection<? extends CancelTimerType>)newValue);
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EventType>)newValue);
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__EXCEPTION_HANDLER:
				getExceptionHandler().clear();
				getExceptionHandler().addAll((Collection<? extends ExceptionHandlerType>)newValue);
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__TASK:
				getTask().clear();
				getTask().addAll((Collection<? extends TaskType>)newValue);
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__NAME:
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
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__GROUP:
				getGroup().clear();
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__SWIMLANE:
				getSwimlane().clear();
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__START_STATE:
				getStartState().clear();
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__NODE:
				getNode().clear();
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__STATE:
				getState().clear();
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__TASK_NODE:
				getTaskNode().clear();
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__SUPER_STATE:
				getSuperState().clear();
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__PROCESS_STATE:
				getProcessState().clear();
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__FORK:
				getFork().clear();
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__JOIN:
				getJoin().clear();
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__DECISION:
				getDecision().clear();
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__END_STATE:
				getEndState().clear();
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__ACTION:
				getAction().clear();
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__SCRIPT:
				getScript().clear();
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__CREATE_TIMER:
				getCreateTimer().clear();
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__CANCEL_TIMER:
				getCancelTimer().clear();
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__EVENT:
				getEvent().clear();
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__EXCEPTION_HANDLER:
				getExceptionHandler().clear();
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__TASK:
				getTask().clear();
				return;
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__NAME:
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
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__SWIMLANE:
				return !getSwimlane().isEmpty();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__START_STATE:
				return !getStartState().isEmpty();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__NODE:
				return !getNode().isEmpty();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__STATE:
				return !getState().isEmpty();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__TASK_NODE:
				return !getTaskNode().isEmpty();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__SUPER_STATE:
				return !getSuperState().isEmpty();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__PROCESS_STATE:
				return !getProcessState().isEmpty();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__FORK:
				return !getFork().isEmpty();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__JOIN:
				return !getJoin().isEmpty();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__DECISION:
				return !getDecision().isEmpty();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__END_STATE:
				return !getEndState().isEmpty();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__ACTION:
				return !getAction().isEmpty();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__SCRIPT:
				return !getScript().isEmpty();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__CREATE_TIMER:
				return !getCreateTimer().isEmpty();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__CANCEL_TIMER:
				return !getCancelTimer().isEmpty();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__EVENT:
				return !getEvent().isEmpty();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__EXCEPTION_HANDLER:
				return !getExceptionHandler().isEmpty();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__TASK:
				return !getTask().isEmpty();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE__NAME:
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProcessDefinitionTypeImpl

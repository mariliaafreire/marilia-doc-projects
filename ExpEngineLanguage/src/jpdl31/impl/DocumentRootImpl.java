/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31.impl;

import java.util.Collection;
import jpdl31.ActionType;
import jpdl31.AssignmentType;
import jpdl31.CancelTimerType;
import jpdl31.CreateTimerType;
import jpdl31.DecisionType;
import jpdl31.Delegation;
import jpdl31.DocumentRoot;
import jpdl31.EndStateType;
import jpdl31.EventType;
import jpdl31.ExceptionHandlerType;
import jpdl31.ExperimentalPlan;
import jpdl31.ForkType;
import jpdl31.JoinType;
import jpdl31.Jpdl31Package;
import jpdl31.Metric;
import jpdl31.NodeType;
import jpdl31.ProcessDefinitionType;
import jpdl31.ProcessStateType;
import jpdl31.Questionnaire;
import jpdl31.ScriptType;
import jpdl31.StartStateType;
import jpdl31.StateType;
import jpdl31.SuperStateType;
import jpdl31.SwimlaneType;
import jpdl31.TaskNodeType;
import jpdl31.TaskType;
import jpdl31.TimerType;
import jpdl31.TransitionType;
import jpdl31.VariableType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getAction <em>Action</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getCancelTimer <em>Cancel Timer</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getController <em>Controller</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getCreateTimer <em>Create Timer</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getEndState <em>End State</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getExceptionHandler <em>Exception Handler</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getFork <em>Fork</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getNode <em>Node</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getProcessDefinition <em>Process Definition</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getProcessState <em>Process State</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getScript <em>Script</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getStartState <em>Start State</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getState <em>State</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getSuperState <em>Super State</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getSwimlane <em>Swimlane</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getTask <em>Task</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getTaskNode <em>Task Node</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getTimer <em>Timer</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getQuestionnaires <em>Questionnaires</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getPlan <em>Plan</em>}</li>
 *   <li>{@link jpdl31.impl.DocumentRootImpl#getMetrics <em>Metrics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
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
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The cached value of the '{@link #getQuestionnaires() <em>Questionnaires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaires()
	 * @generated
	 * @ordered
	 */
	protected EList<Questionnaire> questionnaires;

	/**
	 * The cached value of the '{@link #getPlan() <em>Plan</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlan()
	 * @generated
	 * @ordered
	 */
	protected EList<ExperimentalPlan> plan;

	/**
	 * The cached value of the '{@link #getMetrics() <em>Metrics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
	protected EList<Metric> metrics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jpdl31Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jpdl31Package.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Jpdl31Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Jpdl31Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType getAction() {
		return (ActionType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(ActionType newAction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__ACTION, newAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(ActionType newAction) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__ACTION, newAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentType getAssignment() {
		return (AssignmentType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__ASSIGNMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignment(AssignmentType newAssignment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__ASSIGNMENT, newAssignment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignment(AssignmentType newAssignment) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__ASSIGNMENT, newAssignment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelTimerType getCancelTimer() {
		return (CancelTimerType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__CANCEL_TIMER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCancelTimer(CancelTimerType newCancelTimer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__CANCEL_TIMER, newCancelTimer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancelTimer(CancelTimerType newCancelTimer) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__CANCEL_TIMER, newCancelTimer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delegation getController() {
		return (Delegation)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__CONTROLLER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetController(Delegation newController, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__CONTROLLER, newController, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setController(Delegation newController) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__CONTROLLER, newController);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateTimerType getCreateTimer() {
		return (CreateTimerType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__CREATE_TIMER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateTimer(CreateTimerType newCreateTimer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__CREATE_TIMER, newCreateTimer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateTimer(CreateTimerType newCreateTimer) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__CREATE_TIMER, newCreateTimer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionType getDecision() {
		return (DecisionType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__DECISION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecision(DecisionType newDecision, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__DECISION, newDecision, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecision(DecisionType newDecision) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__DECISION, newDecision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndStateType getEndState() {
		return (EndStateType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__END_STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndState(EndStateType newEndState, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__END_STATE, newEndState, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndState(EndStateType newEndState) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__END_STATE, newEndState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType getEvent() {
		return (EventType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(EventType newEvent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__EVENT, newEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(EventType newEvent) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__EVENT, newEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionHandlerType getExceptionHandler() {
		return (ExceptionHandlerType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__EXCEPTION_HANDLER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExceptionHandler(ExceptionHandlerType newExceptionHandler, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__EXCEPTION_HANDLER, newExceptionHandler, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionHandler(ExceptionHandlerType newExceptionHandler) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__EXCEPTION_HANDLER, newExceptionHandler);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkType getFork() {
		return (ForkType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__FORK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFork(ForkType newFork, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__FORK, newFork, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFork(ForkType newFork) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__FORK, newFork);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinType getJoin() {
		return (JoinType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__JOIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoin(JoinType newJoin, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__JOIN, newJoin, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoin(JoinType newJoin) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__JOIN, newJoin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType getNode() {
		return (NodeType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__NODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(NodeType newNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__NODE, newNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(NodeType newNode) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__NODE, newNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessDefinitionType> getProcessDefinition() {
		return getMixed().list(Jpdl31Package.Literals.DOCUMENT_ROOT__PROCESS_DEFINITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessStateType getProcessState() {
		return (ProcessStateType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__PROCESS_STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessState(ProcessStateType newProcessState, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__PROCESS_STATE, newProcessState, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessState(ProcessStateType newProcessState) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__PROCESS_STATE, newProcessState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptType getScript() {
		return (ScriptType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__SCRIPT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScript(ScriptType newScript, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__SCRIPT, newScript, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(ScriptType newScript) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__SCRIPT, newScript);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartStateType getStartState() {
		return (StartStateType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__START_STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartState(StartStateType newStartState, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__START_STATE, newStartState, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartState(StartStateType newStartState) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__START_STATE, newStartState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType getState() {
		return (StateType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(StateType newState, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__STATE, newState, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(StateType newState) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__STATE, newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperStateType getSuperState() {
		return (SuperStateType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__SUPER_STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperState(SuperStateType newSuperState, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__SUPER_STATE, newSuperState, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperState(SuperStateType newSuperState) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__SUPER_STATE, newSuperState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwimlaneType getSwimlane() {
		return (SwimlaneType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__SWIMLANE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwimlane(SwimlaneType newSwimlane, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__SWIMLANE, newSwimlane, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwimlane(SwimlaneType newSwimlane) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__SWIMLANE, newSwimlane);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType getTask() {
		return (TaskType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__TASK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(TaskType newTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__TASK, newTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(TaskType newTask) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__TASK, newTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskNodeType getTaskNode() {
		return (TaskNodeType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__TASK_NODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskNode(TaskNodeType newTaskNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__TASK_NODE, newTaskNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskNode(TaskNodeType newTaskNode) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__TASK_NODE, newTaskNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerType getTimer() {
		return (TimerType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__TIMER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimer(TimerType newTimer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__TIMER, newTimer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer(TimerType newTimer) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__TIMER, newTimer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType getTransition() {
		return (TransitionType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__TRANSITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransition(TransitionType newTransition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__TRANSITION, newTransition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(TransitionType newTransition) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__TRANSITION, newTransition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType getVariable() {
		return (VariableType)getMixed().get(Jpdl31Package.Literals.DOCUMENT_ROOT__VARIABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(VariableType newVariable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Jpdl31Package.Literals.DOCUMENT_ROOT__VARIABLE, newVariable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(VariableType newVariable) {
		((FeatureMap.Internal)getMixed()).set(Jpdl31Package.Literals.DOCUMENT_ROOT__VARIABLE, newVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Questionnaire> getQuestionnaires() {
		if (questionnaires == null) {
			questionnaires = new EObjectContainmentEList<Questionnaire>(Questionnaire.class, this, Jpdl31Package.DOCUMENT_ROOT__QUESTIONNAIRES);
		}
		return questionnaires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExperimentalPlan> getPlan() {
		if (plan == null) {
			plan = new EObjectContainmentEList<ExperimentalPlan>(ExperimentalPlan.class, this, Jpdl31Package.DOCUMENT_ROOT__PLAN);
		}
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metric> getMetrics() {
		if (metrics == null) {
			metrics = new EObjectContainmentEList<Metric>(Metric.class, this, Jpdl31Package.DOCUMENT_ROOT__METRICS);
		}
		return metrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jpdl31Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__ACTION:
				return basicSetAction(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__ASSIGNMENT:
				return basicSetAssignment(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__CANCEL_TIMER:
				return basicSetCancelTimer(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__CONTROLLER:
				return basicSetController(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__CREATE_TIMER:
				return basicSetCreateTimer(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__DECISION:
				return basicSetDecision(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__END_STATE:
				return basicSetEndState(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__EVENT:
				return basicSetEvent(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__EXCEPTION_HANDLER:
				return basicSetExceptionHandler(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__FORK:
				return basicSetFork(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__JOIN:
				return basicSetJoin(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__NODE:
				return basicSetNode(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__PROCESS_DEFINITION:
				return ((InternalEList<?>)getProcessDefinition()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__PROCESS_STATE:
				return basicSetProcessState(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__SCRIPT:
				return basicSetScript(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__START_STATE:
				return basicSetStartState(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__STATE:
				return basicSetState(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__SUPER_STATE:
				return basicSetSuperState(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__SWIMLANE:
				return basicSetSwimlane(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__TASK:
				return basicSetTask(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__TASK_NODE:
				return basicSetTaskNode(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__TIMER:
				return basicSetTimer(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__TRANSITION:
				return basicSetTransition(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__VARIABLE:
				return basicSetVariable(null, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__QUESTIONNAIRES:
				return ((InternalEList<?>)getQuestionnaires()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__PLAN:
				return ((InternalEList<?>)getPlan()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.DOCUMENT_ROOT__METRICS:
				return ((InternalEList<?>)getMetrics()).basicRemove(otherEnd, msgs);
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
			case Jpdl31Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jpdl31Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case Jpdl31Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case Jpdl31Package.DOCUMENT_ROOT__ACTION:
				return getAction();
			case Jpdl31Package.DOCUMENT_ROOT__ASSIGNMENT:
				return getAssignment();
			case Jpdl31Package.DOCUMENT_ROOT__CANCEL_TIMER:
				return getCancelTimer();
			case Jpdl31Package.DOCUMENT_ROOT__CONTROLLER:
				return getController();
			case Jpdl31Package.DOCUMENT_ROOT__CREATE_TIMER:
				return getCreateTimer();
			case Jpdl31Package.DOCUMENT_ROOT__DECISION:
				return getDecision();
			case Jpdl31Package.DOCUMENT_ROOT__END_STATE:
				return getEndState();
			case Jpdl31Package.DOCUMENT_ROOT__EVENT:
				return getEvent();
			case Jpdl31Package.DOCUMENT_ROOT__EXCEPTION_HANDLER:
				return getExceptionHandler();
			case Jpdl31Package.DOCUMENT_ROOT__FORK:
				return getFork();
			case Jpdl31Package.DOCUMENT_ROOT__JOIN:
				return getJoin();
			case Jpdl31Package.DOCUMENT_ROOT__NODE:
				return getNode();
			case Jpdl31Package.DOCUMENT_ROOT__PROCESS_DEFINITION:
				return getProcessDefinition();
			case Jpdl31Package.DOCUMENT_ROOT__PROCESS_STATE:
				return getProcessState();
			case Jpdl31Package.DOCUMENT_ROOT__SCRIPT:
				return getScript();
			case Jpdl31Package.DOCUMENT_ROOT__START_STATE:
				return getStartState();
			case Jpdl31Package.DOCUMENT_ROOT__STATE:
				return getState();
			case Jpdl31Package.DOCUMENT_ROOT__SUPER_STATE:
				return getSuperState();
			case Jpdl31Package.DOCUMENT_ROOT__SWIMLANE:
				return getSwimlane();
			case Jpdl31Package.DOCUMENT_ROOT__TASK:
				return getTask();
			case Jpdl31Package.DOCUMENT_ROOT__TASK_NODE:
				return getTaskNode();
			case Jpdl31Package.DOCUMENT_ROOT__TIMER:
				return getTimer();
			case Jpdl31Package.DOCUMENT_ROOT__TRANSITION:
				return getTransition();
			case Jpdl31Package.DOCUMENT_ROOT__VARIABLE:
				return getVariable();
			case Jpdl31Package.DOCUMENT_ROOT__QUESTIONNAIRES:
				return getQuestionnaires();
			case Jpdl31Package.DOCUMENT_ROOT__PLAN:
				return getPlan();
			case Jpdl31Package.DOCUMENT_ROOT__METRICS:
				return getMetrics();
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
			case Jpdl31Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__ACTION:
				setAction((ActionType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__ASSIGNMENT:
				setAssignment((AssignmentType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__CANCEL_TIMER:
				setCancelTimer((CancelTimerType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__CONTROLLER:
				setController((Delegation)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__CREATE_TIMER:
				setCreateTimer((CreateTimerType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__DECISION:
				setDecision((DecisionType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__END_STATE:
				setEndState((EndStateType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__EVENT:
				setEvent((EventType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__EXCEPTION_HANDLER:
				setExceptionHandler((ExceptionHandlerType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__FORK:
				setFork((ForkType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__JOIN:
				setJoin((JoinType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__NODE:
				setNode((NodeType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__PROCESS_DEFINITION:
				getProcessDefinition().clear();
				getProcessDefinition().addAll((Collection<? extends ProcessDefinitionType>)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__PROCESS_STATE:
				setProcessState((ProcessStateType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__SCRIPT:
				setScript((ScriptType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__START_STATE:
				setStartState((StartStateType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__STATE:
				setState((StateType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__SUPER_STATE:
				setSuperState((SuperStateType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__SWIMLANE:
				setSwimlane((SwimlaneType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__TASK:
				setTask((TaskType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__TASK_NODE:
				setTaskNode((TaskNodeType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__TIMER:
				setTimer((TimerType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__TRANSITION:
				setTransition((TransitionType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__VARIABLE:
				setVariable((VariableType)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__QUESTIONNAIRES:
				getQuestionnaires().clear();
				getQuestionnaires().addAll((Collection<? extends Questionnaire>)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__PLAN:
				getPlan().clear();
				getPlan().addAll((Collection<? extends ExperimentalPlan>)newValue);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__METRICS:
				getMetrics().clear();
				getMetrics().addAll((Collection<? extends Metric>)newValue);
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
			case Jpdl31Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case Jpdl31Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case Jpdl31Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case Jpdl31Package.DOCUMENT_ROOT__ACTION:
				setAction((ActionType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__ASSIGNMENT:
				setAssignment((AssignmentType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__CANCEL_TIMER:
				setCancelTimer((CancelTimerType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__CONTROLLER:
				setController((Delegation)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__CREATE_TIMER:
				setCreateTimer((CreateTimerType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__DECISION:
				setDecision((DecisionType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__END_STATE:
				setEndState((EndStateType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__EVENT:
				setEvent((EventType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__EXCEPTION_HANDLER:
				setExceptionHandler((ExceptionHandlerType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__FORK:
				setFork((ForkType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__JOIN:
				setJoin((JoinType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__NODE:
				setNode((NodeType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__PROCESS_DEFINITION:
				getProcessDefinition().clear();
				return;
			case Jpdl31Package.DOCUMENT_ROOT__PROCESS_STATE:
				setProcessState((ProcessStateType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__SCRIPT:
				setScript((ScriptType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__START_STATE:
				setStartState((StartStateType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__STATE:
				setState((StateType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__SUPER_STATE:
				setSuperState((SuperStateType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__SWIMLANE:
				setSwimlane((SwimlaneType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__TASK:
				setTask((TaskType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__TASK_NODE:
				setTaskNode((TaskNodeType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__TIMER:
				setTimer((TimerType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__TRANSITION:
				setTransition((TransitionType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__VARIABLE:
				setVariable((VariableType)null);
				return;
			case Jpdl31Package.DOCUMENT_ROOT__QUESTIONNAIRES:
				getQuestionnaires().clear();
				return;
			case Jpdl31Package.DOCUMENT_ROOT__PLAN:
				getPlan().clear();
				return;
			case Jpdl31Package.DOCUMENT_ROOT__METRICS:
				getMetrics().clear();
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
			case Jpdl31Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jpdl31Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case Jpdl31Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case Jpdl31Package.DOCUMENT_ROOT__ACTION:
				return getAction() != null;
			case Jpdl31Package.DOCUMENT_ROOT__ASSIGNMENT:
				return getAssignment() != null;
			case Jpdl31Package.DOCUMENT_ROOT__CANCEL_TIMER:
				return getCancelTimer() != null;
			case Jpdl31Package.DOCUMENT_ROOT__CONTROLLER:
				return getController() != null;
			case Jpdl31Package.DOCUMENT_ROOT__CREATE_TIMER:
				return getCreateTimer() != null;
			case Jpdl31Package.DOCUMENT_ROOT__DECISION:
				return getDecision() != null;
			case Jpdl31Package.DOCUMENT_ROOT__END_STATE:
				return getEndState() != null;
			case Jpdl31Package.DOCUMENT_ROOT__EVENT:
				return getEvent() != null;
			case Jpdl31Package.DOCUMENT_ROOT__EXCEPTION_HANDLER:
				return getExceptionHandler() != null;
			case Jpdl31Package.DOCUMENT_ROOT__FORK:
				return getFork() != null;
			case Jpdl31Package.DOCUMENT_ROOT__JOIN:
				return getJoin() != null;
			case Jpdl31Package.DOCUMENT_ROOT__NODE:
				return getNode() != null;
			case Jpdl31Package.DOCUMENT_ROOT__PROCESS_DEFINITION:
				return !getProcessDefinition().isEmpty();
			case Jpdl31Package.DOCUMENT_ROOT__PROCESS_STATE:
				return getProcessState() != null;
			case Jpdl31Package.DOCUMENT_ROOT__SCRIPT:
				return getScript() != null;
			case Jpdl31Package.DOCUMENT_ROOT__START_STATE:
				return getStartState() != null;
			case Jpdl31Package.DOCUMENT_ROOT__STATE:
				return getState() != null;
			case Jpdl31Package.DOCUMENT_ROOT__SUPER_STATE:
				return getSuperState() != null;
			case Jpdl31Package.DOCUMENT_ROOT__SWIMLANE:
				return getSwimlane() != null;
			case Jpdl31Package.DOCUMENT_ROOT__TASK:
				return getTask() != null;
			case Jpdl31Package.DOCUMENT_ROOT__TASK_NODE:
				return getTaskNode() != null;
			case Jpdl31Package.DOCUMENT_ROOT__TIMER:
				return getTimer() != null;
			case Jpdl31Package.DOCUMENT_ROOT__TRANSITION:
				return getTransition() != null;
			case Jpdl31Package.DOCUMENT_ROOT__VARIABLE:
				return getVariable() != null;
			case Jpdl31Package.DOCUMENT_ROOT__QUESTIONNAIRES:
				return questionnaires != null && !questionnaires.isEmpty();
			case Jpdl31Package.DOCUMENT_ROOT__PLAN:
				return plan != null && !plan.isEmpty();
			case Jpdl31Package.DOCUMENT_ROOT__METRICS:
				return metrics != null && !metrics.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl

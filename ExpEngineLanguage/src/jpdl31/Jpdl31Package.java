/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jpdl31.Jpdl31Factory
 * @model kind="package"
 * @generated
 */
public interface Jpdl31Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jpdl31";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:jbpm.org:jpdl-3.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "expl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Jpdl31Package eINSTANCE = jpdl31.impl.Jpdl31PackageImpl.init();

	/**
	 * The meta object id for the '{@link jpdl31.impl.ActionTypeImpl <em>Action Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.ActionTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Accept Propagated Events</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__ACCEPT_PROPAGATED_EVENTS = 2;

	/**
	 * The feature id for the '<em><b>Async</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__ASYNC = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Config Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__CONFIG_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__NAME = 7;

	/**
	 * The feature id for the '<em><b>Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__REF_NAME = 8;

	/**
	 * The number of structural features of the '<em>Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link jpdl31.impl.DelegationImpl <em>Delegation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.DelegationImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getDelegation()
	 * @generated
	 */
	int DELEGATION = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__ANY = 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__CLASS = 2;

	/**
	 * The feature id for the '<em><b>Config Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__CONFIG_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Delegation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link jpdl31.impl.AssignmentTypeImpl <em>Assignment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.AssignmentTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getAssignmentType()
	 * @generated
	 */
	int ASSIGNMENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__MIXED = DELEGATION__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__ANY = DELEGATION__ANY;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__CLASS = DELEGATION__CLASS;

	/**
	 * The feature id for the '<em><b>Config Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__CONFIG_TYPE = DELEGATION__CONFIG_TYPE;

	/**
	 * The feature id for the '<em><b>Actor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__ACTOR_ID = DELEGATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__EXPRESSION = DELEGATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pooled Actors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__POOLED_ACTORS = DELEGATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assignment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE_FEATURE_COUNT = DELEGATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link jpdl31.impl.CancelTimerTypeImpl <em>Cancel Timer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.CancelTimerTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getCancelTimerType()
	 * @generated
	 */
	int CANCEL_TIMER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_TIMER_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Cancel Timer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_TIMER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link jpdl31.impl.ConditionTypeImpl <em>Condition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.ConditionTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getConditionType()
	 * @generated
	 */
	int CONDITION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>Condition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link jpdl31.impl.CreateTimerTypeImpl <em>Create Timer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.CreateTimerTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getCreateTimerType()
	 * @generated
	 */
	int CREATE_TIMER_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TIMER_TYPE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TIMER_TYPE__SCRIPT = 1;

	/**
	 * The feature id for the '<em><b>Duedate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TIMER_TYPE__DUEDATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TIMER_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TIMER_TYPE__REPEAT = 4;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TIMER_TYPE__TRANSITION = 5;

	/**
	 * The number of structural features of the '<em>Create Timer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TIMER_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link jpdl31.impl.DecisionTypeImpl <em>Decision Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.DecisionTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getDecisionType()
	 * @generated
	 */
	int DECISION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TYPE__HANDLER = 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TYPE__EVENT = 2;

	/**
	 * The feature id for the '<em><b>Exception Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TYPE__EXCEPTION_HANDLER = 3;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TYPE__TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Async</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TYPE__ASYNC = 5;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TYPE__EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TYPE__NAME = 7;

	/**
	 * The number of structural features of the '<em>Decision Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link jpdl31.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.DocumentRootImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACTION = 3;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSIGNMENT = 4;

	/**
	 * The feature id for the '<em><b>Cancel Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CANCEL_TIMER = 5;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTROLLER = 6;

	/**
	 * The feature id for the '<em><b>Create Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREATE_TIMER = 7;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DECISION = 8;

	/**
	 * The feature id for the '<em><b>End State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_STATE = 9;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EVENT = 10;

	/**
	 * The feature id for the '<em><b>Exception Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXCEPTION_HANDLER = 11;

	/**
	 * The feature id for the '<em><b>Fork</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORK = 12;

	/**
	 * The feature id for the '<em><b>Join</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JOIN = 13;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NODE = 14;

	/**
	 * The feature id for the '<em><b>Process Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROCESS_DEFINITION = 15;

	/**
	 * The feature id for the '<em><b>Process State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROCESS_STATE = 16;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCRIPT = 17;

	/**
	 * The feature id for the '<em><b>Start State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_STATE = 18;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STATE = 19;

	/**
	 * The feature id for the '<em><b>Super State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUPER_STATE = 20;

	/**
	 * The feature id for the '<em><b>Swimlane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SWIMLANE = 21;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TASK = 22;

	/**
	 * The feature id for the '<em><b>Task Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TASK_NODE = 23;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIMER = 24;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSITION = 25;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VARIABLE = 26;

	/**
	 * The feature id for the '<em><b>Questionnaires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__QUESTIONNAIRES = 27;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLAN = 28;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METRICS = 29;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 30;

	/**
	 * The meta object id for the '{@link jpdl31.impl.EndStateTypeImpl <em>End State Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.EndStateTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getEndStateType()
	 * @generated
	 */
	int END_STATE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE_TYPE__EVENT = 1;

	/**
	 * The feature id for the '<em><b>Exception Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE_TYPE__EXCEPTION_HANDLER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE_TYPE__NAME = 3;

	/**
	 * The number of structural features of the '<em>End State Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link jpdl31.impl.EventTypeImpl <em>Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.EventTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Action Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__ACTION_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__SCRIPT = 2;

	/**
	 * The feature id for the '<em><b>Create Timer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__CREATE_TIMER = 3;

	/**
	 * The feature id for the '<em><b>Cancel Timer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__CANCEL_TIMER = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link jpdl31.impl.ExceptionHandlerTypeImpl <em>Exception Handler Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.ExceptionHandlerTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getExceptionHandlerType()
	 * @generated
	 */
	int EXCEPTION_HANDLER_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER_TYPE__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER_TYPE__SCRIPT = 2;

	/**
	 * The feature id for the '<em><b>Exception Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER_TYPE__EXCEPTION_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Exception Handler Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link jpdl31.impl.ForkTypeImpl <em>Fork Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.ForkTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getForkType()
	 * @generated
	 */
	int FORK_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE__SCRIPT = 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE__EVENT = 2;

	/**
	 * The feature id for the '<em><b>Exception Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE__EXCEPTION_HANDLER = 3;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE__TIMER = 4;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE__TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Async</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE__ASYNC = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE__NAME = 7;

	/**
	 * The number of structural features of the '<em>Fork Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link jpdl31.impl.JoinTypeImpl <em>Join Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.JoinTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getJoinType()
	 * @generated
	 */
	int JOIN_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Node Content Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__NODE_CONTENT_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__EVENT = 1;

	/**
	 * The feature id for the '<em><b>Exception Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__EXCEPTION_HANDLER = 2;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__TIMER = 3;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Async</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__ASYNC = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__NAME = 6;

	/**
	 * The number of structural features of the '<em>Join Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link jpdl31.impl.NodeTypeImpl <em>Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.NodeTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getNodeType()
	 * @generated
	 */
	int NODE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__SCRIPT = 1;

	/**
	 * The feature id for the '<em><b>Create Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__CREATE_TIMER = 2;

	/**
	 * The feature id for the '<em><b>Cancel Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__CANCEL_TIMER = 3;

	/**
	 * The feature id for the '<em><b>Node Content Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__NODE_CONTENT_ELEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__EVENT = 5;

	/**
	 * The feature id for the '<em><b>Exception Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__EXCEPTION_HANDLER = 6;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__TIMER = 7;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__TRANSITION = 8;

	/**
	 * The feature id for the '<em><b>Async</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__ASYNC = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__NAME = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__DESCRIPTION = 11;

	/**
	 * The number of structural features of the '<em>Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link jpdl31.impl.ProcessDefinitionTypeImpl <em>Process Definition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.ProcessDefinitionTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getProcessDefinitionType()
	 * @generated
	 */
	int PROCESS_DEFINITION_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Swimlane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE__SWIMLANE = 1;

	/**
	 * The feature id for the '<em><b>Start State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE__START_STATE = 2;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE__NODE = 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE__STATE = 4;

	/**
	 * The feature id for the '<em><b>Task Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE__TASK_NODE = 5;

	/**
	 * The feature id for the '<em><b>Super State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE__SUPER_STATE = 6;

	/**
	 * The feature id for the '<em><b>Process State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE__PROCESS_STATE = 7;

	/**
	 * The feature id for the '<em><b>Fork</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE__FORK = 8;

	/**
	 * The feature id for the '<em><b>Join</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE__JOIN = 9;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE__DECISION = 10;

	/**
	 * The feature id for the '<em><b>End State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE__END_STATE = 11;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE__ACTION = 12;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE__SCRIPT = 13;

	/**
	 * The feature id for the '<em><b>Create Timer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE__CREATE_TIMER = 14;

	/**
	 * The feature id for the '<em><b>Cancel Timer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE__CANCEL_TIMER = 15;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE__EVENT = 16;

	/**
	 * The feature id for the '<em><b>Exception Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE__EXCEPTION_HANDLER = 17;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE__TASK = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE__NAME = 19;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE__QUANTITY = 20;

	/**
	 * The number of structural features of the '<em>Process Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_TYPE_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link jpdl31.impl.ProcessStateTypeImpl <em>Process State Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.ProcessStateTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getProcessStateType()
	 * @generated
	 */
	int PROCESS_STATE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Sub Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATE_TYPE__SUB_PROCESS = 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATE_TYPE__VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATE_TYPE__EVENT = 3;

	/**
	 * The feature id for the '<em><b>Exception Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATE_TYPE__EXCEPTION_HANDLER = 4;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATE_TYPE__TIMER = 5;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATE_TYPE__TRANSITION = 6;

	/**
	 * The feature id for the '<em><b>Async</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATE_TYPE__ASYNC = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATE_TYPE__NAME = 8;

	/**
	 * The number of structural features of the '<em>Process State Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link jpdl31.impl.ScriptTypeImpl <em>Script Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.ScriptTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getScriptType()
	 * @generated
	 */
	int SCRIPT_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Accept Propagated Events</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE__ACCEPT_PROPAGATED_EVENTS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Script Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link jpdl31.impl.StartStateTypeImpl <em>Start State Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.StartStateTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getStartStateType()
	 * @generated
	 */
	int START_STATE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STATE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STATE_TYPE__TASK = 1;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STATE_TYPE__TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STATE_TYPE__EVENT = 3;

	/**
	 * The feature id for the '<em><b>Exception Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STATE_TYPE__EXCEPTION_HANDLER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STATE_TYPE__NAME = 5;

	/**
	 * The number of structural features of the '<em>Start State Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STATE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link jpdl31.impl.StateTypeImpl <em>State Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.StateTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getStateType()
	 * @generated
	 */
	int STATE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Node Content Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TYPE__NODE_CONTENT_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TYPE__EVENT = 1;

	/**
	 * The feature id for the '<em><b>Exception Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TYPE__EXCEPTION_HANDLER = 2;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TYPE__TIMER = 3;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TYPE__TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Async</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TYPE__ASYNC = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TYPE__NAME = 6;

	/**
	 * The number of structural features of the '<em>State Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link jpdl31.impl.SubProcessTypeImpl <em>Sub Process Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.SubProcessTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getSubProcessType()
	 * @generated
	 */
	int SUB_PROCESS_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS_TYPE__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Sub Process Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link jpdl31.impl.SuperStateTypeImpl <em>Super State Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.SuperStateTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getSuperStateType()
	 * @generated
	 */
	int SUPER_STATE_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_TYPE__NODE = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_TYPE__STATE = 2;

	/**
	 * The feature id for the '<em><b>Task Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_TYPE__TASK_NODE = 3;

	/**
	 * The feature id for the '<em><b>Super State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_TYPE__SUPER_STATE = 4;

	/**
	 * The feature id for the '<em><b>Process State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_TYPE__PROCESS_STATE = 5;

	/**
	 * The feature id for the '<em><b>Fork</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_TYPE__FORK = 6;

	/**
	 * The feature id for the '<em><b>Join</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_TYPE__JOIN = 7;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_TYPE__DECISION = 8;

	/**
	 * The feature id for the '<em><b>End State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_TYPE__END_STATE = 9;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_TYPE__EVENT = 10;

	/**
	 * The feature id for the '<em><b>Exception Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_TYPE__EXCEPTION_HANDLER = 11;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_TYPE__TIMER = 12;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_TYPE__TRANSITION = 13;

	/**
	 * The feature id for the '<em><b>Async</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_TYPE__ASYNC = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_TYPE__NAME = 15;

	/**
	 * The number of structural features of the '<em>Super State Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_TYPE_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link jpdl31.impl.SwimlaneTypeImpl <em>Swimlane Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.SwimlaneTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getSwimlaneType()
	 * @generated
	 */
	int SWIMLANE_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE_TYPE__ASSIGNMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Swimlane Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link jpdl31.impl.TaskNodeTypeImpl <em>Task Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.TaskNodeTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getTaskNodeType()
	 * @generated
	 */
	int TASK_NODE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NODE_TYPE__TASK = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NODE_TYPE__EVENT = 1;

	/**
	 * The feature id for the '<em><b>Exception Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NODE_TYPE__EXCEPTION_HANDLER = 2;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NODE_TYPE__TIMER = 3;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NODE_TYPE__TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Async</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NODE_TYPE__ASYNC = 5;

	/**
	 * The feature id for the '<em><b>Create Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NODE_TYPE__CREATE_TASKS = 6;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NODE_TYPE__GROUP = 7;

	/**
	 * The feature id for the '<em><b>End Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NODE_TYPE__END_TASKS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NODE_TYPE__NAME = 9;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NODE_TYPE__SIGNAL = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NODE_TYPE__DESCRIPTION = 11;

	/**
	 * The feature id for the '<em><b>Artefacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NODE_TYPE__ARTEFACTS = 12;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NODE_TYPE__METRICS = 13;

	/**
	 * The number of structural features of the '<em>Task Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NODE_TYPE_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link jpdl31.impl.TaskTypeImpl <em>Task Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.TaskTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getTaskType()
	 * @generated
	 */
	int TASK_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ASSIGNMENT = 1;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__CONTROLLER = 2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__EVENT = 3;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__TIMER = 4;

	/**
	 * The feature id for the '<em><b>Blocking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__BLOCKING = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Duedate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__DUEDATE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__NAME = 8;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__PRIORITY = 9;

	/**
	 * The feature id for the '<em><b>Signalling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__SIGNALLING = 10;

	/**
	 * The feature id for the '<em><b>Swimlane</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__SWIMLANE = 11;

	/**
	 * The feature id for the '<em><b>Artefacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ARTEFACTS = 12;

	/**
	 * The feature id for the '<em><b>Metric Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__METRIC_INFO = 13;

	/**
	 * The number of structural features of the '<em>Task Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link jpdl31.impl.TimerTypeImpl <em>Timer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.TimerTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getTimerType()
	 * @generated
	 */
	int TIMER_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_TYPE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_TYPE__SCRIPT = 1;

	/**
	 * The feature id for the '<em><b>Duedate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_TYPE__DUEDATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_TYPE__REPEAT = 4;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_TYPE__TRANSITION = 5;

	/**
	 * The number of structural features of the '<em>Timer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link jpdl31.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.TransitionTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getTransitionType()
	 * @generated
	 */
	int TRANSITION_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__SCRIPT = 2;

	/**
	 * The feature id for the '<em><b>Create Timer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__CREATE_TIMER = 3;

	/**
	 * The feature id for the '<em><b>Cancel Timer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__CANCEL_TIMER = 4;

	/**
	 * The feature id for the '<em><b>Exception Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__EXCEPTION_HANDLER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__NAME = 6;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__TO = 7;

	/**
	 * The number of structural features of the '<em>Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link jpdl31.impl.TransitionType1Impl <em>Transition Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.TransitionType1Impl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getTransitionType1()
	 * @generated
	 */
	int TRANSITION_TYPE1 = 26;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1__ACTION = 2;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1__SCRIPT = 3;

	/**
	 * The feature id for the '<em><b>Create Timer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1__CREATE_TIMER = 4;

	/**
	 * The feature id for the '<em><b>Cancel Timer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1__CANCEL_TIMER = 5;

	/**
	 * The feature id for the '<em><b>Exception Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1__EXCEPTION_HANDLER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1__NAME = 7;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1__TO = 8;

	/**
	 * The number of structural features of the '<em>Transition Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link jpdl31.impl.VariableTypeImpl <em>Variable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.VariableTypeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__ACCESS = 1;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__MAPPED_NAME = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Variable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link jpdl31.impl.ArtefactImpl <em>Artefact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.ArtefactImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getArtefact()
	 * @generated
	 */
	int ARTEFACT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link jpdl31.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.ModelImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 29;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link jpdl31.impl.MetricInfoImpl <em>Metric Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.MetricInfoImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getMetricInfo()
	 * @generated
	 */
	int METRIC_INFO = 30;

	/**
	 * The feature id for the '<em><b>Metric Referenced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_INFO__METRIC_REFERENCED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_INFO__NAME = 1;

	/**
	 * The number of structural features of the '<em>Metric Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_INFO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link jpdl31.impl.HyphotesisImpl <em>Hyphotesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.HyphotesisImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getHyphotesis()
	 * @generated
	 */
	int HYPHOTESIS = 31;

	/**
	 * The feature id for the '<em><b>Formalizes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPHOTESIS__FORMALIZES = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPHOTESIS__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>From Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPHOTESIS__FROM_GOAL = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPHOTESIS__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPHOTESIS__ID = 4;

	/**
	 * The feature id for the '<em><b>Relation Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPHOTESIS__RELATION_OP = 5;

	/**
	 * The feature id for the '<em><b>Treatment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPHOTESIS__TREATMENT = 6;

	/**
	 * The feature id for the '<em><b>Dependent Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPHOTESIS__DEPENDENT_VARIABLE = 7;

	/**
	 * The number of structural features of the '<em>Hyphotesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPHOTESIS_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link jpdl31.impl.SubhypothesesImpl <em>Subhypotheses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.SubhypothesesImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getSubhypotheses()
	 * @generated
	 */
	int SUBHYPOTHESES = 32;

	/**
	 * The feature id for the '<em><b>Relation Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBHYPOTHESES__RELATION_OP = 0;

	/**
	 * The feature id for the '<em><b>Treatment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBHYPOTHESES__TREATMENT = 1;

	/**
	 * The feature id for the '<em><b>Dependent Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBHYPOTHESES__DEPENDENT_VARIABLE = 2;

	/**
	 * The number of structural features of the '<em>Subhypotheses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBHYPOTHESES_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link jpdl31.impl.DependentVariableImpl <em>Dependent Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.DependentVariableImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getDependentVariable()
	 * @generated
	 */
	int DEPENDENT_VARIABLE = 33;

	/**
	 * The feature id for the '<em><b>Measure By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_VARIABLE__MEASURE_BY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_VARIABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_VARIABLE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Dependent Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link jpdl31.impl.FactorImpl <em>Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.FactorImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getFactor()
	 * @generated
	 */
	int FACTOR = 34;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__LEVELS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Treament</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__IS_TREAMENT = 2;

	/**
	 * The number of structural features of the '<em>Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link jpdl31.impl.LevelImpl <em>Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.LevelImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link jpdl31.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.MetricImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Relates To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__RELATES_TO = 3;

	/**
	 * The feature id for the '<em><b>Refname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__REFNAME = 4;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link jpdl31.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.QuestionnaireImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getQuestionnaire()
	 * @generated
	 */
	int QUESTIONNAIRE = 37;

	/**
	 * The feature id for the '<em><b>Question</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__QUESTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__PROCESSES = 3;

	/**
	 * The number of structural features of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link jpdl31.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.QuestionImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 38;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__REQUIRED = 2;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__OPTION = 3;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__EREFERENCE0 = 4;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link jpdl31.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.AlternativeImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getAlternative()
	 * @generated
	 */
	int ALTERNATIVE = 39;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link jpdl31.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.GoalImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Hypotheses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__HYPOTHESES = 2;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link jpdl31.impl.ExperimentalPlanImpl <em>Experimental Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.ExperimentalPlanImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getExperimentalPlan()
	 * @generated
	 */
	int EXPERIMENTAL_PLAN = 41;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_PLAN__GOALS = 0;

	/**
	 * The feature id for the '<em><b>Hypothesis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_PLAN__HYPOTHESIS = 1;

	/**
	 * The feature id for the '<em><b>Design</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_PLAN__DESIGN = 2;

	/**
	 * The number of structural features of the '<em>Experimental Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_PLAN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link jpdl31.impl.DesignImpl <em>Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.DesignImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getDesign()
	 * @generated
	 */
	int DESIGN = 42;

	/**
	 * The feature id for the '<em><b>Factors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__FACTORS = 0;

	/**
	 * The feature id for the '<em><b>Do E</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__DO_E = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__TEST = 3;

	/**
	 * The feature id for the '<em><b>Dep Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__DEP_VARIABLE = 4;

	/**
	 * The number of structural features of the '<em>Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link jpdl31.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.ParameterImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 43;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link jpdl31.impl.StatisticalTestImpl <em>Statistical Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.StatisticalTestImpl
	 * @see jpdl31.impl.Jpdl31PackageImpl#getStatisticalTest()
	 * @generated
	 */
	int STATISTICAL_TEST = 44;

	/**
	 * The number of structural features of the '<em>Statistical Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_TEST_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link jpdl31.BooleanType <em>Boolean Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.BooleanType
	 * @see jpdl31.impl.Jpdl31PackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 45;

	/**
	 * The meta object id for the '{@link jpdl31.ConfigType <em>Config Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.ConfigType
	 * @see jpdl31.impl.Jpdl31PackageImpl#getConfigType()
	 * @generated
	 */
	int CONFIG_TYPE = 46;

	/**
	 * The meta object id for the '{@link jpdl31.ConfigTypeType <em>Config Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.ConfigTypeType
	 * @see jpdl31.impl.Jpdl31PackageImpl#getConfigTypeType()
	 * @generated
	 */
	int CONFIG_TYPE_TYPE = 47;

	/**
	 * The meta object id for the '{@link jpdl31.ConfigTypeType1 <em>Config Type Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.ConfigTypeType1
	 * @see jpdl31.impl.Jpdl31PackageImpl#getConfigTypeType1()
	 * @generated
	 */
	int CONFIG_TYPE_TYPE1 = 48;

	/**
	 * The meta object id for the '{@link jpdl31.PriorityTypeMember0 <em>Priority Type Member0</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.PriorityTypeMember0
	 * @see jpdl31.impl.Jpdl31PackageImpl#getPriorityTypeMember0()
	 * @generated
	 */
	int PRIORITY_TYPE_MEMBER0 = 49;

	/**
	 * The meta object id for the '{@link jpdl31.SignalType <em>Signal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.SignalType
	 * @see jpdl31.impl.Jpdl31PackageImpl#getSignalType()
	 * @generated
	 */
	int SIGNAL_TYPE = 50;

	/**
	 * The meta object id for the '{@link jpdl31.TypeTypeMember1 <em>Type Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.TypeTypeMember1
	 * @see jpdl31.impl.Jpdl31PackageImpl#getTypeTypeMember1()
	 * @generated
	 */
	int TYPE_TYPE_MEMBER1 = 51;

	/**
	 * The meta object id for the '{@link jpdl31.ArtefactType <em>Artefact Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.ArtefactType
	 * @see jpdl31.impl.Jpdl31PackageImpl#getArtefactType()
	 * @generated
	 */
	int ARTEFACT_TYPE = 52;

	/**
	 * The meta object id for the '{@link jpdl31.MetricType <em>Metric Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.MetricType
	 * @see jpdl31.impl.Jpdl31PackageImpl#getMetricType()
	 * @generated
	 */
	int METRIC_TYPE = 53;

	/**
	 * The meta object id for the '{@link jpdl31.RelationOperator <em>Relation Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.RelationOperator
	 * @see jpdl31.impl.Jpdl31PackageImpl#getRelationOperator()
	 * @generated
	 */
	int RELATION_OPERATOR = 54;

	/**
	 * The meta object id for the '{@link jpdl31.AnswerType <em>Answer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.AnswerType
	 * @see jpdl31.impl.Jpdl31PackageImpl#getAnswerType()
	 * @generated
	 */
	int ANSWER_TYPE = 55;

	/**
	 * The meta object id for the '{@link jpdl31.DoEType <em>Do EType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.DoEType
	 * @see jpdl31.impl.Jpdl31PackageImpl#getDoEType()
	 * @generated
	 */
	int DO_ETYPE = 56;

	/**
	 * The meta object id for the '{@link jpdl31.HypothesisType <em>Hypothesis Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.HypothesisType
	 * @see jpdl31.impl.Jpdl31PackageImpl#getHypothesisType()
	 * @generated
	 */
	int HYPOTHESIS_TYPE = 57;

	/**
	 * The meta object id for the '{@link jpdl31.QuestionnaireType <em>Questionnaire Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.QuestionnaireType
	 * @see jpdl31.impl.Jpdl31PackageImpl#getQuestionnaireType()
	 * @generated
	 */
	int QUESTIONNAIRE_TYPE = 58;

	/**
	 * The meta object id for the '<em>Boolean Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.BooleanType
	 * @see jpdl31.impl.Jpdl31PackageImpl#getBooleanTypeObject()
	 * @generated
	 */
	int BOOLEAN_TYPE_OBJECT = 59;

	/**
	 * The meta object id for the '<em>Config Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.ConfigType
	 * @see jpdl31.impl.Jpdl31PackageImpl#getConfigTypeObject()
	 * @generated
	 */
	int CONFIG_TYPE_OBJECT = 60;

	/**
	 * The meta object id for the '<em>Config Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.ConfigTypeType
	 * @see jpdl31.impl.Jpdl31PackageImpl#getConfigTypeTypeObject()
	 * @generated
	 */
	int CONFIG_TYPE_TYPE_OBJECT = 61;

	/**
	 * The meta object id for the '<em>Config Type Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.ConfigTypeType1
	 * @see jpdl31.impl.Jpdl31PackageImpl#getConfigTypeTypeObject1()
	 * @generated
	 */
	int CONFIG_TYPE_TYPE_OBJECT1 = 62;

	/**
	 * The meta object id for the '<em>Priority Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see jpdl31.impl.Jpdl31PackageImpl#getPriorityType()
	 * @generated
	 */
	int PRIORITY_TYPE = 63;

	/**
	 * The meta object id for the '<em>Priority Type Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.PriorityTypeMember0
	 * @see jpdl31.impl.Jpdl31PackageImpl#getPriorityTypeMember0Object()
	 * @generated
	 */
	int PRIORITY_TYPE_MEMBER0_OBJECT = 64;

	/**
	 * The meta object id for the '<em>Priority Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.impl.Jpdl31PackageImpl#getPriorityTypeMember1()
	 * @generated
	 */
	int PRIORITY_TYPE_MEMBER1 = 65;

	/**
	 * The meta object id for the '<em>Priority Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see jpdl31.impl.Jpdl31PackageImpl#getPriorityTypeMember1Object()
	 * @generated
	 */
	int PRIORITY_TYPE_MEMBER1_OBJECT = 66;

	/**
	 * The meta object id for the '<em>Signal Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.SignalType
	 * @see jpdl31.impl.Jpdl31PackageImpl#getSignalTypeObject()
	 * @generated
	 */
	int SIGNAL_TYPE_OBJECT = 67;

	/**
	 * The meta object id for the '<em>Type Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see jpdl31.impl.Jpdl31PackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 68;

	/**
	 * The meta object id for the '<em>Type Type Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jpdl31.impl.Jpdl31PackageImpl#getTypeTypeMember0()
	 * @generated
	 */
	int TYPE_TYPE_MEMBER0 = 69;

	/**
	 * The meta object id for the '<em>Type Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpdl31.TypeTypeMember1
	 * @see jpdl31.impl.Jpdl31PackageImpl#getTypeTypeMember1Object()
	 * @generated
	 */
	int TYPE_TYPE_MEMBER1_OBJECT = 70;


	/**
	 * Returns the meta object for class '{@link jpdl31.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Type</em>'.
	 * @see jpdl31.ActionType
	 * @generated
	 */
	EClass getActionType();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.ActionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see jpdl31.ActionType#getMixed()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.ActionType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see jpdl31.ActionType#getAny()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_Any();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.ActionType#getAcceptPropagatedEvents <em>Accept Propagated Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accept Propagated Events</em>'.
	 * @see jpdl31.ActionType#getAcceptPropagatedEvents()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_AcceptPropagatedEvents();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.ActionType#getAsync <em>Async</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Async</em>'.
	 * @see jpdl31.ActionType#getAsync()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_Async();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.ActionType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see jpdl31.ActionType#getClass_()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_Class();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.ActionType#getConfigType <em>Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Type</em>'.
	 * @see jpdl31.ActionType#getConfigType()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_ConfigType();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.ActionType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see jpdl31.ActionType#getExpression()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_Expression();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.ActionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.ActionType#getName()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_Name();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.ActionType#getRefName <em>Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Name</em>'.
	 * @see jpdl31.ActionType#getRefName()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_RefName();

	/**
	 * Returns the meta object for class '{@link jpdl31.AssignmentType <em>Assignment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Type</em>'.
	 * @see jpdl31.AssignmentType
	 * @generated
	 */
	EClass getAssignmentType();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.AssignmentType#getActorId <em>Actor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor Id</em>'.
	 * @see jpdl31.AssignmentType#getActorId()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_ActorId();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.AssignmentType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see jpdl31.AssignmentType#getExpression()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_Expression();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.AssignmentType#getPooledActors <em>Pooled Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pooled Actors</em>'.
	 * @see jpdl31.AssignmentType#getPooledActors()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_PooledActors();

	/**
	 * Returns the meta object for class '{@link jpdl31.CancelTimerType <em>Cancel Timer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cancel Timer Type</em>'.
	 * @see jpdl31.CancelTimerType
	 * @generated
	 */
	EClass getCancelTimerType();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.CancelTimerType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.CancelTimerType#getName()
	 * @see #getCancelTimerType()
	 * @generated
	 */
	EAttribute getCancelTimerType_Name();

	/**
	 * Returns the meta object for class '{@link jpdl31.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Type</em>'.
	 * @see jpdl31.ConditionType
	 * @generated
	 */
	EClass getConditionType();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.ConditionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see jpdl31.ConditionType#getMixed()
	 * @see #getConditionType()
	 * @generated
	 */
	EAttribute getConditionType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.ConditionType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see jpdl31.ConditionType#getGroup()
	 * @see #getConditionType()
	 * @generated
	 */
	EAttribute getConditionType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.ConditionType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see jpdl31.ConditionType#getAny()
	 * @see #getConditionType()
	 * @generated
	 */
	EAttribute getConditionType_Any();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.ConditionType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see jpdl31.ConditionType#getExpression()
	 * @see #getConditionType()
	 * @generated
	 */
	EAttribute getConditionType_Expression();

	/**
	 * Returns the meta object for class '{@link jpdl31.CreateTimerType <em>Create Timer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Timer Type</em>'.
	 * @see jpdl31.CreateTimerType
	 * @generated
	 */
	EClass getCreateTimerType();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.CreateTimerType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see jpdl31.CreateTimerType#getAction()
	 * @see #getCreateTimerType()
	 * @generated
	 */
	EReference getCreateTimerType_Action();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.CreateTimerType#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script</em>'.
	 * @see jpdl31.CreateTimerType#getScript()
	 * @see #getCreateTimerType()
	 * @generated
	 */
	EReference getCreateTimerType_Script();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.CreateTimerType#getDuedate <em>Duedate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duedate</em>'.
	 * @see jpdl31.CreateTimerType#getDuedate()
	 * @see #getCreateTimerType()
	 * @generated
	 */
	EAttribute getCreateTimerType_Duedate();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.CreateTimerType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.CreateTimerType#getName()
	 * @see #getCreateTimerType()
	 * @generated
	 */
	EAttribute getCreateTimerType_Name();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.CreateTimerType#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat</em>'.
	 * @see jpdl31.CreateTimerType#getRepeat()
	 * @see #getCreateTimerType()
	 * @generated
	 */
	EAttribute getCreateTimerType_Repeat();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.CreateTimerType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition</em>'.
	 * @see jpdl31.CreateTimerType#getTransition()
	 * @see #getCreateTimerType()
	 * @generated
	 */
	EAttribute getCreateTimerType_Transition();

	/**
	 * Returns the meta object for class '{@link jpdl31.DecisionType <em>Decision Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Type</em>'.
	 * @see jpdl31.DecisionType
	 * @generated
	 */
	EClass getDecisionType();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.DecisionType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see jpdl31.DecisionType#getGroup()
	 * @see #getDecisionType()
	 * @generated
	 */
	EAttribute getDecisionType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.DecisionType#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handler</em>'.
	 * @see jpdl31.DecisionType#getHandler()
	 * @see #getDecisionType()
	 * @generated
	 */
	EReference getDecisionType_Handler();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.DecisionType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see jpdl31.DecisionType#getEvent()
	 * @see #getDecisionType()
	 * @generated
	 */
	EReference getDecisionType_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.DecisionType#getExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Handler</em>'.
	 * @see jpdl31.DecisionType#getExceptionHandler()
	 * @see #getDecisionType()
	 * @generated
	 */
	EReference getDecisionType_ExceptionHandler();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.DecisionType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see jpdl31.DecisionType#getTransition()
	 * @see #getDecisionType()
	 * @generated
	 */
	EReference getDecisionType_Transition();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.DecisionType#getAsync <em>Async</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Async</em>'.
	 * @see jpdl31.DecisionType#getAsync()
	 * @see #getDecisionType()
	 * @generated
	 */
	EAttribute getDecisionType_Async();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.DecisionType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see jpdl31.DecisionType#getExpression()
	 * @see #getDecisionType()
	 * @generated
	 */
	EAttribute getDecisionType_Expression();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.DecisionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.DecisionType#getName()
	 * @see #getDecisionType()
	 * @generated
	 */
	EAttribute getDecisionType_Name();

	/**
	 * Returns the meta object for class '{@link jpdl31.Delegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation</em>'.
	 * @see jpdl31.Delegation
	 * @generated
	 */
	EClass getDelegation();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.Delegation#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see jpdl31.Delegation#getMixed()
	 * @see #getDelegation()
	 * @generated
	 */
	EAttribute getDelegation_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.Delegation#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see jpdl31.Delegation#getAny()
	 * @see #getDelegation()
	 * @generated
	 */
	EAttribute getDelegation_Any();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Delegation#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see jpdl31.Delegation#getClass_()
	 * @see #getDelegation()
	 * @generated
	 */
	EAttribute getDelegation_Class();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Delegation#getConfigType <em>Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Type</em>'.
	 * @see jpdl31.Delegation#getConfigType()
	 * @see #getDelegation()
	 * @generated
	 */
	EAttribute getDelegation_ConfigType();

	/**
	 * Returns the meta object for class '{@link jpdl31.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see jpdl31.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see jpdl31.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link jpdl31.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see jpdl31.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link jpdl31.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see jpdl31.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see jpdl31.DocumentRoot#getAction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Action();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assignment</em>'.
	 * @see jpdl31.DocumentRoot#getAssignment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Assignment();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getCancelTimer <em>Cancel Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cancel Timer</em>'.
	 * @see jpdl31.DocumentRoot#getCancelTimer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CancelTimer();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Controller</em>'.
	 * @see jpdl31.DocumentRoot#getController()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Controller();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getCreateTimer <em>Create Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create Timer</em>'.
	 * @see jpdl31.DocumentRoot#getCreateTimer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CreateTimer();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decision</em>'.
	 * @see jpdl31.DocumentRoot#getDecision()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Decision();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getEndState <em>End State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End State</em>'.
	 * @see jpdl31.DocumentRoot#getEndState()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EndState();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see jpdl31.DocumentRoot#getEvent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Event();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception Handler</em>'.
	 * @see jpdl31.DocumentRoot#getExceptionHandler()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExceptionHandler();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getFork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fork</em>'.
	 * @see jpdl31.DocumentRoot#getFork()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Fork();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join</em>'.
	 * @see jpdl31.DocumentRoot#getJoin()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Join();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node</em>'.
	 * @see jpdl31.DocumentRoot#getNode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.DocumentRoot#getProcessDefinition <em>Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Definition</em>'.
	 * @see jpdl31.DocumentRoot#getProcessDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ProcessDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getProcessState <em>Process State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process State</em>'.
	 * @see jpdl31.DocumentRoot#getProcessState()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ProcessState();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script</em>'.
	 * @see jpdl31.DocumentRoot#getScript()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Script();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getStartState <em>Start State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start State</em>'.
	 * @see jpdl31.DocumentRoot#getStartState()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StartState();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see jpdl31.DocumentRoot#getState()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_State();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getSuperState <em>Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Super State</em>'.
	 * @see jpdl31.DocumentRoot#getSuperState()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SuperState();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getSwimlane <em>Swimlane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Swimlane</em>'.
	 * @see jpdl31.DocumentRoot#getSwimlane()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Swimlane();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task</em>'.
	 * @see jpdl31.DocumentRoot#getTask()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Task();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getTaskNode <em>Task Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Node</em>'.
	 * @see jpdl31.DocumentRoot#getTaskNode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TaskNode();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timer</em>'.
	 * @see jpdl31.DocumentRoot#getTimer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Timer();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition</em>'.
	 * @see jpdl31.DocumentRoot#getTransition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Transition();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.DocumentRoot#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see jpdl31.DocumentRoot#getVariable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.DocumentRoot#getQuestionnaires <em>Questionnaires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questionnaires</em>'.
	 * @see jpdl31.DocumentRoot#getQuestionnaires()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Questionnaires();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.DocumentRoot#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plan</em>'.
	 * @see jpdl31.DocumentRoot#getPlan()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Plan();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.DocumentRoot#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics</em>'.
	 * @see jpdl31.DocumentRoot#getMetrics()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Metrics();

	/**
	 * Returns the meta object for class '{@link jpdl31.EndStateType <em>End State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End State Type</em>'.
	 * @see jpdl31.EndStateType
	 * @generated
	 */
	EClass getEndStateType();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.EndStateType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see jpdl31.EndStateType#getGroup()
	 * @see #getEndStateType()
	 * @generated
	 */
	EAttribute getEndStateType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.EndStateType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see jpdl31.EndStateType#getEvent()
	 * @see #getEndStateType()
	 * @generated
	 */
	EReference getEndStateType_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.EndStateType#getExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Handler</em>'.
	 * @see jpdl31.EndStateType#getExceptionHandler()
	 * @see #getEndStateType()
	 * @generated
	 */
	EReference getEndStateType_ExceptionHandler();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.EndStateType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.EndStateType#getName()
	 * @see #getEndStateType()
	 * @generated
	 */
	EAttribute getEndStateType_Name();

	/**
	 * Returns the meta object for class '{@link jpdl31.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Type</em>'.
	 * @see jpdl31.EventType
	 * @generated
	 */
	EClass getEventType();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.EventType#getActionElements <em>Action Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Action Elements</em>'.
	 * @see jpdl31.EventType#getActionElements()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_ActionElements();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.EventType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see jpdl31.EventType#getAction()
	 * @see #getEventType()
	 * @generated
	 */
	EReference getEventType_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.EventType#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script</em>'.
	 * @see jpdl31.EventType#getScript()
	 * @see #getEventType()
	 * @generated
	 */
	EReference getEventType_Script();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.EventType#getCreateTimer <em>Create Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Create Timer</em>'.
	 * @see jpdl31.EventType#getCreateTimer()
	 * @see #getEventType()
	 * @generated
	 */
	EReference getEventType_CreateTimer();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.EventType#getCancelTimer <em>Cancel Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cancel Timer</em>'.
	 * @see jpdl31.EventType#getCancelTimer()
	 * @see #getEventType()
	 * @generated
	 */
	EReference getEventType_CancelTimer();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.EventType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see jpdl31.EventType#getType()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_Type();

	/**
	 * Returns the meta object for class '{@link jpdl31.ExceptionHandlerType <em>Exception Handler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Handler Type</em>'.
	 * @see jpdl31.ExceptionHandlerType
	 * @generated
	 */
	EClass getExceptionHandlerType();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.ExceptionHandlerType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see jpdl31.ExceptionHandlerType#getGroup()
	 * @see #getExceptionHandlerType()
	 * @generated
	 */
	EAttribute getExceptionHandlerType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ExceptionHandlerType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see jpdl31.ExceptionHandlerType#getAction()
	 * @see #getExceptionHandlerType()
	 * @generated
	 */
	EReference getExceptionHandlerType_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ExceptionHandlerType#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script</em>'.
	 * @see jpdl31.ExceptionHandlerType#getScript()
	 * @see #getExceptionHandlerType()
	 * @generated
	 */
	EReference getExceptionHandlerType_Script();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.ExceptionHandlerType#getExceptionClass <em>Exception Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Class</em>'.
	 * @see jpdl31.ExceptionHandlerType#getExceptionClass()
	 * @see #getExceptionHandlerType()
	 * @generated
	 */
	EAttribute getExceptionHandlerType_ExceptionClass();

	/**
	 * Returns the meta object for class '{@link jpdl31.ForkType <em>Fork Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Type</em>'.
	 * @see jpdl31.ForkType
	 * @generated
	 */
	EClass getForkType();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.ForkType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see jpdl31.ForkType#getGroup()
	 * @see #getForkType()
	 * @generated
	 */
	EAttribute getForkType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ForkType#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script</em>'.
	 * @see jpdl31.ForkType#getScript()
	 * @see #getForkType()
	 * @generated
	 */
	EReference getForkType_Script();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ForkType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see jpdl31.ForkType#getEvent()
	 * @see #getForkType()
	 * @generated
	 */
	EReference getForkType_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ForkType#getExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Handler</em>'.
	 * @see jpdl31.ForkType#getExceptionHandler()
	 * @see #getForkType()
	 * @generated
	 */
	EReference getForkType_ExceptionHandler();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ForkType#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timer</em>'.
	 * @see jpdl31.ForkType#getTimer()
	 * @see #getForkType()
	 * @generated
	 */
	EReference getForkType_Timer();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ForkType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see jpdl31.ForkType#getTransition()
	 * @see #getForkType()
	 * @generated
	 */
	EReference getForkType_Transition();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.ForkType#getAsync <em>Async</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Async</em>'.
	 * @see jpdl31.ForkType#getAsync()
	 * @see #getForkType()
	 * @generated
	 */
	EAttribute getForkType_Async();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.ForkType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.ForkType#getName()
	 * @see #getForkType()
	 * @generated
	 */
	EAttribute getForkType_Name();

	/**
	 * Returns the meta object for class '{@link jpdl31.JoinType <em>Join Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Type</em>'.
	 * @see jpdl31.JoinType
	 * @generated
	 */
	EClass getJoinType();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.JoinType#getNodeContentElements <em>Node Content Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Node Content Elements</em>'.
	 * @see jpdl31.JoinType#getNodeContentElements()
	 * @see #getJoinType()
	 * @generated
	 */
	EAttribute getJoinType_NodeContentElements();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.JoinType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see jpdl31.JoinType#getEvent()
	 * @see #getJoinType()
	 * @generated
	 */
	EReference getJoinType_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.JoinType#getExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Handler</em>'.
	 * @see jpdl31.JoinType#getExceptionHandler()
	 * @see #getJoinType()
	 * @generated
	 */
	EReference getJoinType_ExceptionHandler();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.JoinType#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timer</em>'.
	 * @see jpdl31.JoinType#getTimer()
	 * @see #getJoinType()
	 * @generated
	 */
	EReference getJoinType_Timer();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.JoinType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see jpdl31.JoinType#getTransition()
	 * @see #getJoinType()
	 * @generated
	 */
	EReference getJoinType_Transition();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.JoinType#getAsync <em>Async</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Async</em>'.
	 * @see jpdl31.JoinType#getAsync()
	 * @see #getJoinType()
	 * @generated
	 */
	EAttribute getJoinType_Async();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.JoinType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.JoinType#getName()
	 * @see #getJoinType()
	 * @generated
	 */
	EAttribute getJoinType_Name();

	/**
	 * Returns the meta object for class '{@link jpdl31.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Type</em>'.
	 * @see jpdl31.NodeType
	 * @generated
	 */
	EClass getNodeType();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.NodeType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see jpdl31.NodeType#getAction()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_Action();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.NodeType#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script</em>'.
	 * @see jpdl31.NodeType#getScript()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_Script();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.NodeType#getCreateTimer <em>Create Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create Timer</em>'.
	 * @see jpdl31.NodeType#getCreateTimer()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_CreateTimer();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.NodeType#getCancelTimer <em>Cancel Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cancel Timer</em>'.
	 * @see jpdl31.NodeType#getCancelTimer()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_CancelTimer();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.NodeType#getNodeContentElements <em>Node Content Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Node Content Elements</em>'.
	 * @see jpdl31.NodeType#getNodeContentElements()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_NodeContentElements();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.NodeType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see jpdl31.NodeType#getEvent()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.NodeType#getExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Handler</em>'.
	 * @see jpdl31.NodeType#getExceptionHandler()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_ExceptionHandler();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.NodeType#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timer</em>'.
	 * @see jpdl31.NodeType#getTimer()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_Timer();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.NodeType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see jpdl31.NodeType#getTransition()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_Transition();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.NodeType#getAsync <em>Async</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Async</em>'.
	 * @see jpdl31.NodeType#getAsync()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_Async();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.NodeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.NodeType#getName()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.NodeType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see jpdl31.NodeType#getDescription()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_Description();

	/**
	 * Returns the meta object for class '{@link jpdl31.ProcessDefinitionType <em>Process Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Definition Type</em>'.
	 * @see jpdl31.ProcessDefinitionType
	 * @generated
	 */
	EClass getProcessDefinitionType();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.ProcessDefinitionType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see jpdl31.ProcessDefinitionType#getGroup()
	 * @see #getProcessDefinitionType()
	 * @generated
	 */
	EAttribute getProcessDefinitionType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessDefinitionType#getSwimlane <em>Swimlane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Swimlane</em>'.
	 * @see jpdl31.ProcessDefinitionType#getSwimlane()
	 * @see #getProcessDefinitionType()
	 * @generated
	 */
	EReference getProcessDefinitionType_Swimlane();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessDefinitionType#getStartState <em>Start State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Start State</em>'.
	 * @see jpdl31.ProcessDefinitionType#getStartState()
	 * @see #getProcessDefinitionType()
	 * @generated
	 */
	EReference getProcessDefinitionType_StartState();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessDefinitionType#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see jpdl31.ProcessDefinitionType#getNode()
	 * @see #getProcessDefinitionType()
	 * @generated
	 */
	EReference getProcessDefinitionType_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessDefinitionType#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see jpdl31.ProcessDefinitionType#getState()
	 * @see #getProcessDefinitionType()
	 * @generated
	 */
	EReference getProcessDefinitionType_State();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessDefinitionType#getTaskNode <em>Task Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Node</em>'.
	 * @see jpdl31.ProcessDefinitionType#getTaskNode()
	 * @see #getProcessDefinitionType()
	 * @generated
	 */
	EReference getProcessDefinitionType_TaskNode();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessDefinitionType#getSuperState <em>Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Super State</em>'.
	 * @see jpdl31.ProcessDefinitionType#getSuperState()
	 * @see #getProcessDefinitionType()
	 * @generated
	 */
	EReference getProcessDefinitionType_SuperState();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessDefinitionType#getProcessState <em>Process State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process State</em>'.
	 * @see jpdl31.ProcessDefinitionType#getProcessState()
	 * @see #getProcessDefinitionType()
	 * @generated
	 */
	EReference getProcessDefinitionType_ProcessState();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessDefinitionType#getFork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fork</em>'.
	 * @see jpdl31.ProcessDefinitionType#getFork()
	 * @see #getProcessDefinitionType()
	 * @generated
	 */
	EReference getProcessDefinitionType_Fork();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessDefinitionType#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join</em>'.
	 * @see jpdl31.ProcessDefinitionType#getJoin()
	 * @see #getProcessDefinitionType()
	 * @generated
	 */
	EReference getProcessDefinitionType_Join();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessDefinitionType#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision</em>'.
	 * @see jpdl31.ProcessDefinitionType#getDecision()
	 * @see #getProcessDefinitionType()
	 * @generated
	 */
	EReference getProcessDefinitionType_Decision();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessDefinitionType#getEndState <em>End State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End State</em>'.
	 * @see jpdl31.ProcessDefinitionType#getEndState()
	 * @see #getProcessDefinitionType()
	 * @generated
	 */
	EReference getProcessDefinitionType_EndState();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessDefinitionType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see jpdl31.ProcessDefinitionType#getAction()
	 * @see #getProcessDefinitionType()
	 * @generated
	 */
	EReference getProcessDefinitionType_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessDefinitionType#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script</em>'.
	 * @see jpdl31.ProcessDefinitionType#getScript()
	 * @see #getProcessDefinitionType()
	 * @generated
	 */
	EReference getProcessDefinitionType_Script();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessDefinitionType#getCreateTimer <em>Create Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Create Timer</em>'.
	 * @see jpdl31.ProcessDefinitionType#getCreateTimer()
	 * @see #getProcessDefinitionType()
	 * @generated
	 */
	EReference getProcessDefinitionType_CreateTimer();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessDefinitionType#getCancelTimer <em>Cancel Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cancel Timer</em>'.
	 * @see jpdl31.ProcessDefinitionType#getCancelTimer()
	 * @see #getProcessDefinitionType()
	 * @generated
	 */
	EReference getProcessDefinitionType_CancelTimer();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessDefinitionType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see jpdl31.ProcessDefinitionType#getEvent()
	 * @see #getProcessDefinitionType()
	 * @generated
	 */
	EReference getProcessDefinitionType_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessDefinitionType#getExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Handler</em>'.
	 * @see jpdl31.ProcessDefinitionType#getExceptionHandler()
	 * @see #getProcessDefinitionType()
	 * @generated
	 */
	EReference getProcessDefinitionType_ExceptionHandler();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessDefinitionType#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see jpdl31.ProcessDefinitionType#getTask()
	 * @see #getProcessDefinitionType()
	 * @generated
	 */
	EReference getProcessDefinitionType_Task();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.ProcessDefinitionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.ProcessDefinitionType#getName()
	 * @see #getProcessDefinitionType()
	 * @generated
	 */
	EAttribute getProcessDefinitionType_Name();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.ProcessDefinitionType#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see jpdl31.ProcessDefinitionType#getQuantity()
	 * @see #getProcessDefinitionType()
	 * @generated
	 */
	EAttribute getProcessDefinitionType_Quantity();

	/**
	 * Returns the meta object for class '{@link jpdl31.ProcessStateType <em>Process State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process State Type</em>'.
	 * @see jpdl31.ProcessStateType
	 * @generated
	 */
	EClass getProcessStateType();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.ProcessStateType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see jpdl31.ProcessStateType#getGroup()
	 * @see #getProcessStateType()
	 * @generated
	 */
	EAttribute getProcessStateType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessStateType#getSubProcess <em>Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Process</em>'.
	 * @see jpdl31.ProcessStateType#getSubProcess()
	 * @see #getProcessStateType()
	 * @generated
	 */
	EReference getProcessStateType_SubProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessStateType#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see jpdl31.ProcessStateType#getVariable()
	 * @see #getProcessStateType()
	 * @generated
	 */
	EReference getProcessStateType_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessStateType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see jpdl31.ProcessStateType#getEvent()
	 * @see #getProcessStateType()
	 * @generated
	 */
	EReference getProcessStateType_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessStateType#getExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Handler</em>'.
	 * @see jpdl31.ProcessStateType#getExceptionHandler()
	 * @see #getProcessStateType()
	 * @generated
	 */
	EReference getProcessStateType_ExceptionHandler();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessStateType#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timer</em>'.
	 * @see jpdl31.ProcessStateType#getTimer()
	 * @see #getProcessStateType()
	 * @generated
	 */
	EReference getProcessStateType_Timer();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ProcessStateType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see jpdl31.ProcessStateType#getTransition()
	 * @see #getProcessStateType()
	 * @generated
	 */
	EReference getProcessStateType_Transition();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.ProcessStateType#getAsync <em>Async</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Async</em>'.
	 * @see jpdl31.ProcessStateType#getAsync()
	 * @see #getProcessStateType()
	 * @generated
	 */
	EAttribute getProcessStateType_Async();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.ProcessStateType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.ProcessStateType#getName()
	 * @see #getProcessStateType()
	 * @generated
	 */
	EAttribute getProcessStateType_Name();

	/**
	 * Returns the meta object for class '{@link jpdl31.ScriptType <em>Script Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Type</em>'.
	 * @see jpdl31.ScriptType
	 * @generated
	 */
	EClass getScriptType();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.ScriptType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see jpdl31.ScriptType#getMixed()
	 * @see #getScriptType()
	 * @generated
	 */
	EAttribute getScriptType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.ScriptType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see jpdl31.ScriptType#getAny()
	 * @see #getScriptType()
	 * @generated
	 */
	EAttribute getScriptType_Any();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.ScriptType#getAcceptPropagatedEvents <em>Accept Propagated Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accept Propagated Events</em>'.
	 * @see jpdl31.ScriptType#getAcceptPropagatedEvents()
	 * @see #getScriptType()
	 * @generated
	 */
	EAttribute getScriptType_AcceptPropagatedEvents();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.ScriptType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.ScriptType#getName()
	 * @see #getScriptType()
	 * @generated
	 */
	EAttribute getScriptType_Name();

	/**
	 * Returns the meta object for class '{@link jpdl31.StartStateType <em>Start State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start State Type</em>'.
	 * @see jpdl31.StartStateType
	 * @generated
	 */
	EClass getStartStateType();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.StartStateType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see jpdl31.StartStateType#getGroup()
	 * @see #getStartStateType()
	 * @generated
	 */
	EAttribute getStartStateType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.StartStateType#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see jpdl31.StartStateType#getTask()
	 * @see #getStartStateType()
	 * @generated
	 */
	EReference getStartStateType_Task();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.StartStateType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see jpdl31.StartStateType#getTransition()
	 * @see #getStartStateType()
	 * @generated
	 */
	EReference getStartStateType_Transition();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.StartStateType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see jpdl31.StartStateType#getEvent()
	 * @see #getStartStateType()
	 * @generated
	 */
	EReference getStartStateType_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.StartStateType#getExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Handler</em>'.
	 * @see jpdl31.StartStateType#getExceptionHandler()
	 * @see #getStartStateType()
	 * @generated
	 */
	EReference getStartStateType_ExceptionHandler();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.StartStateType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.StartStateType#getName()
	 * @see #getStartStateType()
	 * @generated
	 */
	EAttribute getStartStateType_Name();

	/**
	 * Returns the meta object for class '{@link jpdl31.StateType <em>State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Type</em>'.
	 * @see jpdl31.StateType
	 * @generated
	 */
	EClass getStateType();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.StateType#getNodeContentElements <em>Node Content Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Node Content Elements</em>'.
	 * @see jpdl31.StateType#getNodeContentElements()
	 * @see #getStateType()
	 * @generated
	 */
	EAttribute getStateType_NodeContentElements();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.StateType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see jpdl31.StateType#getEvent()
	 * @see #getStateType()
	 * @generated
	 */
	EReference getStateType_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.StateType#getExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Handler</em>'.
	 * @see jpdl31.StateType#getExceptionHandler()
	 * @see #getStateType()
	 * @generated
	 */
	EReference getStateType_ExceptionHandler();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.StateType#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timer</em>'.
	 * @see jpdl31.StateType#getTimer()
	 * @see #getStateType()
	 * @generated
	 */
	EReference getStateType_Timer();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.StateType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see jpdl31.StateType#getTransition()
	 * @see #getStateType()
	 * @generated
	 */
	EReference getStateType_Transition();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.StateType#getAsync <em>Async</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Async</em>'.
	 * @see jpdl31.StateType#getAsync()
	 * @see #getStateType()
	 * @generated
	 */
	EAttribute getStateType_Async();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.StateType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.StateType#getName()
	 * @see #getStateType()
	 * @generated
	 */
	EAttribute getStateType_Name();

	/**
	 * Returns the meta object for class '{@link jpdl31.SubProcessType <em>Sub Process Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Process Type</em>'.
	 * @see jpdl31.SubProcessType
	 * @generated
	 */
	EClass getSubProcessType();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.SubProcessType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.SubProcessType#getName()
	 * @see #getSubProcessType()
	 * @generated
	 */
	EAttribute getSubProcessType_Name();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.SubProcessType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see jpdl31.SubProcessType#getVersion()
	 * @see #getSubProcessType()
	 * @generated
	 */
	EAttribute getSubProcessType_Version();

	/**
	 * Returns the meta object for class '{@link jpdl31.SuperStateType <em>Super State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super State Type</em>'.
	 * @see jpdl31.SuperStateType
	 * @generated
	 */
	EClass getSuperStateType();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.SuperStateType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see jpdl31.SuperStateType#getGroup()
	 * @see #getSuperStateType()
	 * @generated
	 */
	EAttribute getSuperStateType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.SuperStateType#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see jpdl31.SuperStateType#getNode()
	 * @see #getSuperStateType()
	 * @generated
	 */
	EReference getSuperStateType_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.SuperStateType#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see jpdl31.SuperStateType#getState()
	 * @see #getSuperStateType()
	 * @generated
	 */
	EReference getSuperStateType_State();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.SuperStateType#getTaskNode <em>Task Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Node</em>'.
	 * @see jpdl31.SuperStateType#getTaskNode()
	 * @see #getSuperStateType()
	 * @generated
	 */
	EReference getSuperStateType_TaskNode();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.SuperStateType#getSuperState <em>Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Super State</em>'.
	 * @see jpdl31.SuperStateType#getSuperState()
	 * @see #getSuperStateType()
	 * @generated
	 */
	EReference getSuperStateType_SuperState();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.SuperStateType#getProcessState <em>Process State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process State</em>'.
	 * @see jpdl31.SuperStateType#getProcessState()
	 * @see #getSuperStateType()
	 * @generated
	 */
	EReference getSuperStateType_ProcessState();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.SuperStateType#getFork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fork</em>'.
	 * @see jpdl31.SuperStateType#getFork()
	 * @see #getSuperStateType()
	 * @generated
	 */
	EReference getSuperStateType_Fork();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.SuperStateType#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join</em>'.
	 * @see jpdl31.SuperStateType#getJoin()
	 * @see #getSuperStateType()
	 * @generated
	 */
	EReference getSuperStateType_Join();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.SuperStateType#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision</em>'.
	 * @see jpdl31.SuperStateType#getDecision()
	 * @see #getSuperStateType()
	 * @generated
	 */
	EReference getSuperStateType_Decision();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.SuperStateType#getEndState <em>End State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End State</em>'.
	 * @see jpdl31.SuperStateType#getEndState()
	 * @see #getSuperStateType()
	 * @generated
	 */
	EReference getSuperStateType_EndState();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.SuperStateType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see jpdl31.SuperStateType#getEvent()
	 * @see #getSuperStateType()
	 * @generated
	 */
	EReference getSuperStateType_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.SuperStateType#getExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Handler</em>'.
	 * @see jpdl31.SuperStateType#getExceptionHandler()
	 * @see #getSuperStateType()
	 * @generated
	 */
	EReference getSuperStateType_ExceptionHandler();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.SuperStateType#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timer</em>'.
	 * @see jpdl31.SuperStateType#getTimer()
	 * @see #getSuperStateType()
	 * @generated
	 */
	EReference getSuperStateType_Timer();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.SuperStateType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see jpdl31.SuperStateType#getTransition()
	 * @see #getSuperStateType()
	 * @generated
	 */
	EReference getSuperStateType_Transition();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.SuperStateType#getAsync <em>Async</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Async</em>'.
	 * @see jpdl31.SuperStateType#getAsync()
	 * @see #getSuperStateType()
	 * @generated
	 */
	EAttribute getSuperStateType_Async();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.SuperStateType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.SuperStateType#getName()
	 * @see #getSuperStateType()
	 * @generated
	 */
	EAttribute getSuperStateType_Name();

	/**
	 * Returns the meta object for class '{@link jpdl31.SwimlaneType <em>Swimlane Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swimlane Type</em>'.
	 * @see jpdl31.SwimlaneType
	 * @generated
	 */
	EClass getSwimlaneType();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.SwimlaneType#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assignment</em>'.
	 * @see jpdl31.SwimlaneType#getAssignment()
	 * @see #getSwimlaneType()
	 * @generated
	 */
	EReference getSwimlaneType_Assignment();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.SwimlaneType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.SwimlaneType#getName()
	 * @see #getSwimlaneType()
	 * @generated
	 */
	EAttribute getSwimlaneType_Name();

	/**
	 * Returns the meta object for class '{@link jpdl31.TaskNodeType <em>Task Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Node Type</em>'.
	 * @see jpdl31.TaskNodeType
	 * @generated
	 */
	EClass getTaskNodeType();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.TaskNodeType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see jpdl31.TaskNodeType#getGroup()
	 * @see #getTaskNodeType()
	 * @generated
	 */
	EAttribute getTaskNodeType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TaskNodeType#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see jpdl31.TaskNodeType#getTask()
	 * @see #getTaskNodeType()
	 * @generated
	 */
	EReference getTaskNodeType_Task();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TaskNodeType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see jpdl31.TaskNodeType#getEvent()
	 * @see #getTaskNodeType()
	 * @generated
	 */
	EReference getTaskNodeType_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TaskNodeType#getExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Handler</em>'.
	 * @see jpdl31.TaskNodeType#getExceptionHandler()
	 * @see #getTaskNodeType()
	 * @generated
	 */
	EReference getTaskNodeType_ExceptionHandler();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TaskNodeType#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timer</em>'.
	 * @see jpdl31.TaskNodeType#getTimer()
	 * @see #getTaskNodeType()
	 * @generated
	 */
	EReference getTaskNodeType_Timer();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TaskNodeType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see jpdl31.TaskNodeType#getTransition()
	 * @see #getTaskNodeType()
	 * @generated
	 */
	EReference getTaskNodeType_Transition();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.TaskNodeType#getAsync <em>Async</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Async</em>'.
	 * @see jpdl31.TaskNodeType#getAsync()
	 * @see #getTaskNodeType()
	 * @generated
	 */
	EAttribute getTaskNodeType_Async();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.TaskNodeType#getCreateTasks <em>Create Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Tasks</em>'.
	 * @see jpdl31.TaskNodeType#getCreateTasks()
	 * @see #getTaskNodeType()
	 * @generated
	 */
	EAttribute getTaskNodeType_CreateTasks();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.TaskNodeType#getEndTasks <em>End Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Tasks</em>'.
	 * @see jpdl31.TaskNodeType#getEndTasks()
	 * @see #getTaskNodeType()
	 * @generated
	 */
	EAttribute getTaskNodeType_EndTasks();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.TaskNodeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.TaskNodeType#getName()
	 * @see #getTaskNodeType()
	 * @generated
	 */
	EAttribute getTaskNodeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.TaskNodeType#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal</em>'.
	 * @see jpdl31.TaskNodeType#getSignal()
	 * @see #getTaskNodeType()
	 * @generated
	 */
	EAttribute getTaskNodeType_Signal();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.TaskNodeType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see jpdl31.TaskNodeType#getDescription()
	 * @see #getTaskNodeType()
	 * @generated
	 */
	EAttribute getTaskNodeType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TaskNodeType#getArtefacts <em>Artefacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artefacts</em>'.
	 * @see jpdl31.TaskNodeType#getArtefacts()
	 * @see #getTaskNodeType()
	 * @generated
	 */
	EReference getTaskNodeType_Artefacts();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TaskNodeType#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics</em>'.
	 * @see jpdl31.TaskNodeType#getMetrics()
	 * @see #getTaskNodeType()
	 * @generated
	 */
	EReference getTaskNodeType_Metrics();

	/**
	 * Returns the meta object for class '{@link jpdl31.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Type</em>'.
	 * @see jpdl31.TaskType
	 * @generated
	 */
	EClass getTaskType();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.TaskType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see jpdl31.TaskType#getGroup()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TaskType#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignment</em>'.
	 * @see jpdl31.TaskType#getAssignment()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_Assignment();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TaskType#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controller</em>'.
	 * @see jpdl31.TaskType#getController()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_Controller();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TaskType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see jpdl31.TaskType#getEvent()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TaskType#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timer</em>'.
	 * @see jpdl31.TaskType#getTimer()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_Timer();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.TaskType#getBlocking <em>Blocking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocking</em>'.
	 * @see jpdl31.TaskType#getBlocking()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Blocking();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.TaskType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see jpdl31.TaskType#getDescription()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Description();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.TaskType#getDuedate <em>Duedate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duedate</em>'.
	 * @see jpdl31.TaskType#getDuedate()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Duedate();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.TaskType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.TaskType#getName()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Name();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.TaskType#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see jpdl31.TaskType#getPriority()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Priority();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.TaskType#getSignalling <em>Signalling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signalling</em>'.
	 * @see jpdl31.TaskType#getSignalling()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Signalling();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.TaskType#getSwimlane <em>Swimlane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swimlane</em>'.
	 * @see jpdl31.TaskType#getSwimlane()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Swimlane();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TaskType#getArtefacts <em>Artefacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artefacts</em>'.
	 * @see jpdl31.TaskType#getArtefacts()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_Artefacts();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TaskType#getMetricInfo <em>Metric Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Info</em>'.
	 * @see jpdl31.TaskType#getMetricInfo()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_MetricInfo();

	/**
	 * Returns the meta object for class '{@link jpdl31.TimerType <em>Timer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer Type</em>'.
	 * @see jpdl31.TimerType
	 * @generated
	 */
	EClass getTimerType();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.TimerType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see jpdl31.TimerType#getAction()
	 * @see #getTimerType()
	 * @generated
	 */
	EReference getTimerType_Action();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.TimerType#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script</em>'.
	 * @see jpdl31.TimerType#getScript()
	 * @see #getTimerType()
	 * @generated
	 */
	EReference getTimerType_Script();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.TimerType#getDuedate <em>Duedate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duedate</em>'.
	 * @see jpdl31.TimerType#getDuedate()
	 * @see #getTimerType()
	 * @generated
	 */
	EAttribute getTimerType_Duedate();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.TimerType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.TimerType#getName()
	 * @see #getTimerType()
	 * @generated
	 */
	EAttribute getTimerType_Name();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.TimerType#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat</em>'.
	 * @see jpdl31.TimerType#getRepeat()
	 * @see #getTimerType()
	 * @generated
	 */
	EAttribute getTimerType_Repeat();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.TimerType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition</em>'.
	 * @see jpdl31.TimerType#getTransition()
	 * @see #getTimerType()
	 * @generated
	 */
	EAttribute getTimerType_Transition();

	/**
	 * Returns the meta object for class '{@link jpdl31.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Type</em>'.
	 * @see jpdl31.TransitionType
	 * @generated
	 */
	EClass getTransitionType();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.TransitionType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see jpdl31.TransitionType#getGroup()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TransitionType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see jpdl31.TransitionType#getAction()
	 * @see #getTransitionType()
	 * @generated
	 */
	EReference getTransitionType_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TransitionType#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script</em>'.
	 * @see jpdl31.TransitionType#getScript()
	 * @see #getTransitionType()
	 * @generated
	 */
	EReference getTransitionType_Script();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TransitionType#getCreateTimer <em>Create Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Create Timer</em>'.
	 * @see jpdl31.TransitionType#getCreateTimer()
	 * @see #getTransitionType()
	 * @generated
	 */
	EReference getTransitionType_CreateTimer();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TransitionType#getCancelTimer <em>Cancel Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cancel Timer</em>'.
	 * @see jpdl31.TransitionType#getCancelTimer()
	 * @see #getTransitionType()
	 * @generated
	 */
	EReference getTransitionType_CancelTimer();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TransitionType#getExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Handler</em>'.
	 * @see jpdl31.TransitionType#getExceptionHandler()
	 * @see #getTransitionType()
	 * @generated
	 */
	EReference getTransitionType_ExceptionHandler();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.TransitionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.TransitionType#getName()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_Name();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.TransitionType#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see jpdl31.TransitionType#getTo()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_To();

	/**
	 * Returns the meta object for class '{@link jpdl31.TransitionType1 <em>Transition Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Type1</em>'.
	 * @see jpdl31.TransitionType1
	 * @generated
	 */
	EClass getTransitionType1();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.TransitionType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see jpdl31.TransitionType1#getGroup()
	 * @see #getTransitionType1()
	 * @generated
	 */
	EAttribute getTransitionType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TransitionType1#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see jpdl31.TransitionType1#getCondition()
	 * @see #getTransitionType1()
	 * @generated
	 */
	EReference getTransitionType1_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TransitionType1#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see jpdl31.TransitionType1#getAction()
	 * @see #getTransitionType1()
	 * @generated
	 */
	EReference getTransitionType1_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TransitionType1#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script</em>'.
	 * @see jpdl31.TransitionType1#getScript()
	 * @see #getTransitionType1()
	 * @generated
	 */
	EReference getTransitionType1_Script();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TransitionType1#getCreateTimer <em>Create Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Create Timer</em>'.
	 * @see jpdl31.TransitionType1#getCreateTimer()
	 * @see #getTransitionType1()
	 * @generated
	 */
	EReference getTransitionType1_CreateTimer();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TransitionType1#getCancelTimer <em>Cancel Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cancel Timer</em>'.
	 * @see jpdl31.TransitionType1#getCancelTimer()
	 * @see #getTransitionType1()
	 * @generated
	 */
	EReference getTransitionType1_CancelTimer();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.TransitionType1#getExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Handler</em>'.
	 * @see jpdl31.TransitionType1#getExceptionHandler()
	 * @see #getTransitionType1()
	 * @generated
	 */
	EReference getTransitionType1_ExceptionHandler();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.TransitionType1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.TransitionType1#getName()
	 * @see #getTransitionType1()
	 * @generated
	 */
	EAttribute getTransitionType1_Name();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.TransitionType1#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see jpdl31.TransitionType1#getTo()
	 * @see #getTransitionType1()
	 * @generated
	 */
	EAttribute getTransitionType1_To();

	/**
	 * Returns the meta object for class '{@link jpdl31.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Type</em>'.
	 * @see jpdl31.VariableType
	 * @generated
	 */
	EClass getVariableType();

	/**
	 * Returns the meta object for the attribute list '{@link jpdl31.VariableType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see jpdl31.VariableType#getAny()
	 * @see #getVariableType()
	 * @generated
	 */
	EAttribute getVariableType_Any();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.VariableType#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see jpdl31.VariableType#getAccess()
	 * @see #getVariableType()
	 * @generated
	 */
	EAttribute getVariableType_Access();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.VariableType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped Name</em>'.
	 * @see jpdl31.VariableType#getMappedName()
	 * @see #getVariableType()
	 * @generated
	 */
	EAttribute getVariableType_MappedName();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.VariableType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.VariableType#getName()
	 * @see #getVariableType()
	 * @generated
	 */
	EAttribute getVariableType_Name();

	/**
	 * Returns the meta object for class '{@link jpdl31.Artefact <em>Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artefact</em>'.
	 * @see jpdl31.Artefact
	 * @generated
	 */
	EClass getArtefact();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Artefact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.Artefact#getName()
	 * @see #getArtefact()
	 * @generated
	 */
	EAttribute getArtefact_Name();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Artefact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see jpdl31.Artefact#getType()
	 * @see #getArtefact()
	 * @generated
	 */
	EAttribute getArtefact_Type();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Artefact#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see jpdl31.Artefact#getDescription()
	 * @see #getArtefact()
	 * @generated
	 */
	EAttribute getArtefact_Description();

	/**
	 * Returns the meta object for class '{@link jpdl31.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see jpdl31.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see jpdl31.Model#getElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Elements();

	/**
	 * Returns the meta object for class '{@link jpdl31.MetricInfo <em>Metric Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric Info</em>'.
	 * @see jpdl31.MetricInfo
	 * @generated
	 */
	EClass getMetricInfo();

	/**
	 * Returns the meta object for the reference '{@link jpdl31.MetricInfo#getMetricReferenced <em>Metric Referenced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric Referenced</em>'.
	 * @see jpdl31.MetricInfo#getMetricReferenced()
	 * @see #getMetricInfo()
	 * @generated
	 */
	EReference getMetricInfo_MetricReferenced();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.MetricInfo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.MetricInfo#getName()
	 * @see #getMetricInfo()
	 * @generated
	 */
	EAttribute getMetricInfo_Name();

	/**
	 * Returns the meta object for class '{@link jpdl31.Hyphotesis <em>Hyphotesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hyphotesis</em>'.
	 * @see jpdl31.Hyphotesis
	 * @generated
	 */
	EClass getHyphotesis();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.Hyphotesis#getFormalizes <em>Formalizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formalizes</em>'.
	 * @see jpdl31.Hyphotesis#getFormalizes()
	 * @see #getHyphotesis()
	 * @generated
	 */
	EReference getHyphotesis_Formalizes();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Hyphotesis#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see jpdl31.Hyphotesis#getDescription()
	 * @see #getHyphotesis()
	 * @generated
	 */
	EAttribute getHyphotesis_Description();

	/**
	 * Returns the meta object for the reference '{@link jpdl31.Hyphotesis#getFromGoal <em>From Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Goal</em>'.
	 * @see jpdl31.Hyphotesis#getFromGoal()
	 * @see #getHyphotesis()
	 * @generated
	 */
	EReference getHyphotesis_FromGoal();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Hyphotesis#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see jpdl31.Hyphotesis#getType()
	 * @see #getHyphotesis()
	 * @generated
	 */
	EAttribute getHyphotesis_Type();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Hyphotesis#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see jpdl31.Hyphotesis#getId()
	 * @see #getHyphotesis()
	 * @generated
	 */
	EAttribute getHyphotesis_Id();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Hyphotesis#getRelationOp <em>Relation Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Op</em>'.
	 * @see jpdl31.Hyphotesis#getRelationOp()
	 * @see #getHyphotesis()
	 * @generated
	 */
	EAttribute getHyphotesis_RelationOp();

	/**
	 * Returns the meta object for the reference list '{@link jpdl31.Hyphotesis#getTreatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Treatment</em>'.
	 * @see jpdl31.Hyphotesis#getTreatment()
	 * @see #getHyphotesis()
	 * @generated
	 */
	EReference getHyphotesis_Treatment();

	/**
	 * Returns the meta object for the reference '{@link jpdl31.Hyphotesis#getDependentVariable <em>Dependent Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependent Variable</em>'.
	 * @see jpdl31.Hyphotesis#getDependentVariable()
	 * @see #getHyphotesis()
	 * @generated
	 */
	EReference getHyphotesis_DependentVariable();

	/**
	 * Returns the meta object for class '{@link jpdl31.Subhypotheses <em>Subhypotheses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subhypotheses</em>'.
	 * @see jpdl31.Subhypotheses
	 * @generated
	 */
	EClass getSubhypotheses();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Subhypotheses#getRelationOp <em>Relation Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Op</em>'.
	 * @see jpdl31.Subhypotheses#getRelationOp()
	 * @see #getSubhypotheses()
	 * @generated
	 */
	EAttribute getSubhypotheses_RelationOp();

	/**
	 * Returns the meta object for the reference '{@link jpdl31.Subhypotheses#getTreatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Treatment</em>'.
	 * @see jpdl31.Subhypotheses#getTreatment()
	 * @see #getSubhypotheses()
	 * @generated
	 */
	EReference getSubhypotheses_Treatment();

	/**
	 * Returns the meta object for the reference '{@link jpdl31.Subhypotheses#getDependentVariable <em>Dependent Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependent Variable</em>'.
	 * @see jpdl31.Subhypotheses#getDependentVariable()
	 * @see #getSubhypotheses()
	 * @generated
	 */
	EReference getSubhypotheses_DependentVariable();

	/**
	 * Returns the meta object for class '{@link jpdl31.DependentVariable <em>Dependent Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Variable</em>'.
	 * @see jpdl31.DependentVariable
	 * @generated
	 */
	EClass getDependentVariable();

	/**
	 * Returns the meta object for the reference list '{@link jpdl31.DependentVariable#getMeasureBy <em>Measure By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measure By</em>'.
	 * @see jpdl31.DependentVariable#getMeasureBy()
	 * @see #getDependentVariable()
	 * @generated
	 */
	EReference getDependentVariable_MeasureBy();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.DependentVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.DependentVariable#getName()
	 * @see #getDependentVariable()
	 * @generated
	 */
	EAttribute getDependentVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.DependentVariable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see jpdl31.DependentVariable#getDescription()
	 * @see #getDependentVariable()
	 * @generated
	 */
	EAttribute getDependentVariable_Description();

	/**
	 * Returns the meta object for class '{@link jpdl31.Factor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factor</em>'.
	 * @see jpdl31.Factor
	 * @generated
	 */
	EClass getFactor();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.Factor#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Levels</em>'.
	 * @see jpdl31.Factor#getLevels()
	 * @see #getFactor()
	 * @generated
	 */
	EReference getFactor_Levels();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Factor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.Factor#getName()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_Name();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Factor#getIsTreament <em>Is Treament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Treament</em>'.
	 * @see jpdl31.Factor#getIsTreament()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_IsTreament();

	/**
	 * Returns the meta object for class '{@link jpdl31.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level</em>'.
	 * @see jpdl31.Level
	 * @generated
	 */
	EClass getLevel();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Level#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.Level#getName()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_Name();

	/**
	 * Returns the meta object for class '{@link jpdl31.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see jpdl31.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Metric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.Metric#getName()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Name();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Metric#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see jpdl31.Metric#getDescription()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Description();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Metric#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see jpdl31.Metric#getType()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Type();

	/**
	 * Returns the meta object for the reference list '{@link jpdl31.Metric#getRelatesTo <em>Relates To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relates To</em>'.
	 * @see jpdl31.Metric#getRelatesTo()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_RelatesTo();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Metric#getRefname <em>Refname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refname</em>'.
	 * @see jpdl31.Metric#getRefname()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Refname();

	/**
	 * Returns the meta object for class '{@link jpdl31.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnaire</em>'.
	 * @see jpdl31.Questionnaire
	 * @generated
	 */
	EClass getQuestionnaire();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.Questionnaire#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question</em>'.
	 * @see jpdl31.Questionnaire#getQuestion()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Question();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Questionnaire#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpdl31.Questionnaire#getName()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_Name();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Questionnaire#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see jpdl31.Questionnaire#getType()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_Type();

	/**
	 * Returns the meta object for the reference list '{@link jpdl31.Questionnaire#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processes</em>'.
	 * @see jpdl31.Questionnaire#getProcesses()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Processes();

	/**
	 * Returns the meta object for class '{@link jpdl31.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see jpdl31.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Question#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see jpdl31.Question#getDescription()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Description();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Question#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see jpdl31.Question#getType()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Type();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Question#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see jpdl31.Question#getRequired()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Required();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.Question#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option</em>'.
	 * @see jpdl31.Question#getOption()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Option();

	/**
	 * Returns the meta object for the reference '{@link jpdl31.Question#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see jpdl31.Question#getEReference0()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_EReference0();

	/**
	 * Returns the meta object for class '{@link jpdl31.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative</em>'.
	 * @see jpdl31.Alternative
	 * @generated
	 */
	EClass getAlternative();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Alternative#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see jpdl31.Alternative#getDescription()
	 * @see #getAlternative()
	 * @generated
	 */
	EAttribute getAlternative_Description();

	/**
	 * Returns the meta object for class '{@link jpdl31.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see jpdl31.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Goal#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see jpdl31.Goal#getId()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Id();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Goal#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see jpdl31.Goal#getDescription()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.Goal#getHypotheses <em>Hypotheses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hypotheses</em>'.
	 * @see jpdl31.Goal#getHypotheses()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Hypotheses();

	/**
	 * Returns the meta object for class '{@link jpdl31.ExperimentalPlan <em>Experimental Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experimental Plan</em>'.
	 * @see jpdl31.ExperimentalPlan
	 * @generated
	 */
	EClass getExperimentalPlan();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ExperimentalPlan#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goals</em>'.
	 * @see jpdl31.ExperimentalPlan#getGoals()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
	EReference getExperimentalPlan_Goals();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.ExperimentalPlan#getHypothesis <em>Hypothesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hypothesis</em>'.
	 * @see jpdl31.ExperimentalPlan#getHypothesis()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
	EReference getExperimentalPlan_Hypothesis();

	/**
	 * Returns the meta object for the containment reference '{@link jpdl31.ExperimentalPlan#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Design</em>'.
	 * @see jpdl31.ExperimentalPlan#getDesign()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
	EReference getExperimentalPlan_Design();

	/**
	 * Returns the meta object for class '{@link jpdl31.Design <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design</em>'.
	 * @see jpdl31.Design
	 * @generated
	 */
	EClass getDesign();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.Design#getFactors <em>Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Factors</em>'.
	 * @see jpdl31.Design#getFactors()
	 * @see #getDesign()
	 * @generated
	 */
	EReference getDesign_Factors();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Design#getDoE <em>Do E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do E</em>'.
	 * @see jpdl31.Design#getDoE()
	 * @see #getDesign()
	 * @generated
	 */
	EAttribute getDesign_DoE();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.Design#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see jpdl31.Design#getParameters()
	 * @see #getDesign()
	 * @generated
	 */
	EReference getDesign_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link jpdl31.Design#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Test</em>'.
	 * @see jpdl31.Design#getTest()
	 * @see #getDesign()
	 * @generated
	 */
	EReference getDesign_Test();

	/**
	 * Returns the meta object for the containment reference list '{@link jpdl31.Design#getDepVariable <em>Dep Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dep Variable</em>'.
	 * @see jpdl31.Design#getDepVariable()
	 * @see #getDesign()
	 * @generated
	 */
	EReference getDesign_DepVariable();

	/**
	 * Returns the meta object for class '{@link jpdl31.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see jpdl31.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Parameter#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see jpdl31.Parameter#getKey()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Key();

	/**
	 * Returns the meta object for the attribute '{@link jpdl31.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jpdl31.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link jpdl31.StatisticalTest <em>Statistical Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistical Test</em>'.
	 * @see jpdl31.StatisticalTest
	 * @generated
	 */
	EClass getStatisticalTest();

	/**
	 * Returns the meta object for enum '{@link jpdl31.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Type</em>'.
	 * @see jpdl31.BooleanType
	 * @generated
	 */
	EEnum getBooleanType();

	/**
	 * Returns the meta object for enum '{@link jpdl31.ConfigType <em>Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Config Type</em>'.
	 * @see jpdl31.ConfigType
	 * @generated
	 */
	EEnum getConfigType();

	/**
	 * Returns the meta object for enum '{@link jpdl31.ConfigTypeType <em>Config Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Config Type Type</em>'.
	 * @see jpdl31.ConfigTypeType
	 * @generated
	 */
	EEnum getConfigTypeType();

	/**
	 * Returns the meta object for enum '{@link jpdl31.ConfigTypeType1 <em>Config Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Config Type Type1</em>'.
	 * @see jpdl31.ConfigTypeType1
	 * @generated
	 */
	EEnum getConfigTypeType1();

	/**
	 * Returns the meta object for enum '{@link jpdl31.PriorityTypeMember0 <em>Priority Type Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Priority Type Member0</em>'.
	 * @see jpdl31.PriorityTypeMember0
	 * @generated
	 */
	EEnum getPriorityTypeMember0();

	/**
	 * Returns the meta object for enum '{@link jpdl31.SignalType <em>Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Type</em>'.
	 * @see jpdl31.SignalType
	 * @generated
	 */
	EEnum getSignalType();

	/**
	 * Returns the meta object for enum '{@link jpdl31.TypeTypeMember1 <em>Type Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type Member1</em>'.
	 * @see jpdl31.TypeTypeMember1
	 * @generated
	 */
	EEnum getTypeTypeMember1();

	/**
	 * Returns the meta object for enum '{@link jpdl31.ArtefactType <em>Artefact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Artefact Type</em>'.
	 * @see jpdl31.ArtefactType
	 * @generated
	 */
	EEnum getArtefactType();

	/**
	 * Returns the meta object for enum '{@link jpdl31.MetricType <em>Metric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metric Type</em>'.
	 * @see jpdl31.MetricType
	 * @generated
	 */
	EEnum getMetricType();

	/**
	 * Returns the meta object for enum '{@link jpdl31.RelationOperator <em>Relation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Operator</em>'.
	 * @see jpdl31.RelationOperator
	 * @generated
	 */
	EEnum getRelationOperator();

	/**
	 * Returns the meta object for enum '{@link jpdl31.AnswerType <em>Answer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Answer Type</em>'.
	 * @see jpdl31.AnswerType
	 * @generated
	 */
	EEnum getAnswerType();

	/**
	 * Returns the meta object for enum '{@link jpdl31.DoEType <em>Do EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Do EType</em>'.
	 * @see jpdl31.DoEType
	 * @generated
	 */
	EEnum getDoEType();

	/**
	 * Returns the meta object for enum '{@link jpdl31.HypothesisType <em>Hypothesis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hypothesis Type</em>'.
	 * @see jpdl31.HypothesisType
	 * @generated
	 */
	EEnum getHypothesisType();

	/**
	 * Returns the meta object for enum '{@link jpdl31.QuestionnaireType <em>Questionnaire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Questionnaire Type</em>'.
	 * @see jpdl31.QuestionnaireType
	 * @generated
	 */
	EEnum getQuestionnaireType();

	/**
	 * Returns the meta object for data type '{@link jpdl31.BooleanType <em>Boolean Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean Type Object</em>'.
	 * @see jpdl31.BooleanType
	 * @model instanceClass="jpdl31.BooleanType"
	 *        extendedMetaData="name='booleanType:Object' baseType='booleanType'"
	 * @generated
	 */
	EDataType getBooleanTypeObject();

	/**
	 * Returns the meta object for data type '{@link jpdl31.ConfigType <em>Config Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Config Type Object</em>'.
	 * @see jpdl31.ConfigType
	 * @model instanceClass="jpdl31.ConfigType"
	 *        extendedMetaData="name='configType:Object' baseType='configType'"
	 * @generated
	 */
	EDataType getConfigTypeObject();

	/**
	 * Returns the meta object for data type '{@link jpdl31.ConfigTypeType <em>Config Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Config Type Type Object</em>'.
	 * @see jpdl31.ConfigTypeType
	 * @model instanceClass="jpdl31.ConfigTypeType"
	 *        extendedMetaData="name='config-type_._1_._type:Object' baseType='config-type_._1_._type'"
	 * @generated
	 */
	EDataType getConfigTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link jpdl31.ConfigTypeType1 <em>Config Type Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Config Type Type Object1</em>'.
	 * @see jpdl31.ConfigTypeType1
	 * @model instanceClass="jpdl31.ConfigTypeType1"
	 *        extendedMetaData="name='config-type_._type:Object' baseType='config-type_._type'"
	 * @generated
	 */
	EDataType getConfigTypeTypeObject1();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Priority Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Priority Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='priorityType' memberTypes='priorityType_._member_._0 priorityType_._member_._1'"
	 * @generated
	 */
	EDataType getPriorityType();

	/**
	 * Returns the meta object for data type '{@link jpdl31.PriorityTypeMember0 <em>Priority Type Member0 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Priority Type Member0 Object</em>'.
	 * @see jpdl31.PriorityTypeMember0
	 * @model instanceClass="jpdl31.PriorityTypeMember0"
	 *        extendedMetaData="name='priorityType_._member_._0:Object' baseType='priorityType_._member_._0'"
	 * @generated
	 */
	EDataType getPriorityTypeMember0Object();

	/**
	 * Returns the meta object for data type '<em>Priority Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Priority Type Member1</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='priorityType_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#int'"
	 * @generated
	 */
	EDataType getPriorityTypeMember1();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Priority Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Priority Type Member1 Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='priorityType_._member_._1:Object' baseType='priorityType_._member_._1'"
	 * @generated
	 */
	EDataType getPriorityTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link jpdl31.SignalType <em>Signal Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signal Type Object</em>'.
	 * @see jpdl31.SignalType
	 * @model instanceClass="jpdl31.SignalType"
	 *        extendedMetaData="name='signal_._type:Object' baseType='signal_._type'"
	 * @generated
	 */
	EDataType getSignalTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='type_._type' memberTypes='type_._type_._member_._0 type_._type_._member_._1'"
	 * @generated
	 */
	EDataType getTypeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Type Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Member0</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='type_._type_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getTypeTypeMember0();

	/**
	 * Returns the meta object for data type '{@link jpdl31.TypeTypeMember1 <em>Type Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Member1 Object</em>'.
	 * @see jpdl31.TypeTypeMember1
	 * @model instanceClass="jpdl31.TypeTypeMember1"
	 *        extendedMetaData="name='type_._type_._member_._1:Object' baseType='type_._type_._member_._1'"
	 * @generated
	 */
	EDataType getTypeTypeMember1Object();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Jpdl31Factory getJpdl31Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link jpdl31.impl.ActionTypeImpl <em>Action Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.ActionTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getActionType()
		 * @generated
		 */
		EClass ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_TYPE__MIXED = eINSTANCE.getActionType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_TYPE__ANY = eINSTANCE.getActionType_Any();

		/**
		 * The meta object literal for the '<em><b>Accept Propagated Events</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_TYPE__ACCEPT_PROPAGATED_EVENTS = eINSTANCE.getActionType_AcceptPropagatedEvents();

		/**
		 * The meta object literal for the '<em><b>Async</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_TYPE__ASYNC = eINSTANCE.getActionType_Async();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_TYPE__CLASS = eINSTANCE.getActionType_Class();

		/**
		 * The meta object literal for the '<em><b>Config Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_TYPE__CONFIG_TYPE = eINSTANCE.getActionType_ConfigType();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_TYPE__EXPRESSION = eINSTANCE.getActionType_Expression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_TYPE__NAME = eINSTANCE.getActionType_Name();

		/**
		 * The meta object literal for the '<em><b>Ref Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_TYPE__REF_NAME = eINSTANCE.getActionType_RefName();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.AssignmentTypeImpl <em>Assignment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.AssignmentTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getAssignmentType()
		 * @generated
		 */
		EClass ASSIGNMENT_TYPE = eINSTANCE.getAssignmentType();

		/**
		 * The meta object literal for the '<em><b>Actor Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__ACTOR_ID = eINSTANCE.getAssignmentType_ActorId();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__EXPRESSION = eINSTANCE.getAssignmentType_Expression();

		/**
		 * The meta object literal for the '<em><b>Pooled Actors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__POOLED_ACTORS = eINSTANCE.getAssignmentType_PooledActors();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.CancelTimerTypeImpl <em>Cancel Timer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.CancelTimerTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getCancelTimerType()
		 * @generated
		 */
		EClass CANCEL_TIMER_TYPE = eINSTANCE.getCancelTimerType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANCEL_TIMER_TYPE__NAME = eINSTANCE.getCancelTimerType_Name();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.ConditionTypeImpl <em>Condition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.ConditionTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getConditionType()
		 * @generated
		 */
		EClass CONDITION_TYPE = eINSTANCE.getConditionType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_TYPE__MIXED = eINSTANCE.getConditionType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_TYPE__GROUP = eINSTANCE.getConditionType_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_TYPE__ANY = eINSTANCE.getConditionType_Any();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_TYPE__EXPRESSION = eINSTANCE.getConditionType_Expression();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.CreateTimerTypeImpl <em>Create Timer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.CreateTimerTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getCreateTimerType()
		 * @generated
		 */
		EClass CREATE_TIMER_TYPE = eINSTANCE.getCreateTimerType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_TIMER_TYPE__ACTION = eINSTANCE.getCreateTimerType_Action();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_TIMER_TYPE__SCRIPT = eINSTANCE.getCreateTimerType_Script();

		/**
		 * The meta object literal for the '<em><b>Duedate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TIMER_TYPE__DUEDATE = eINSTANCE.getCreateTimerType_Duedate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TIMER_TYPE__NAME = eINSTANCE.getCreateTimerType_Name();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TIMER_TYPE__REPEAT = eINSTANCE.getCreateTimerType_Repeat();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TIMER_TYPE__TRANSITION = eINSTANCE.getCreateTimerType_Transition();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.DecisionTypeImpl <em>Decision Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.DecisionTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getDecisionType()
		 * @generated
		 */
		EClass DECISION_TYPE = eINSTANCE.getDecisionType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_TYPE__GROUP = eINSTANCE.getDecisionType_Group();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_TYPE__HANDLER = eINSTANCE.getDecisionType_Handler();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_TYPE__EVENT = eINSTANCE.getDecisionType_Event();

		/**
		 * The meta object literal for the '<em><b>Exception Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_TYPE__EXCEPTION_HANDLER = eINSTANCE.getDecisionType_ExceptionHandler();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_TYPE__TRANSITION = eINSTANCE.getDecisionType_Transition();

		/**
		 * The meta object literal for the '<em><b>Async</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_TYPE__ASYNC = eINSTANCE.getDecisionType_Async();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_TYPE__EXPRESSION = eINSTANCE.getDecisionType_Expression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_TYPE__NAME = eINSTANCE.getDecisionType_Name();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.DelegationImpl <em>Delegation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.DelegationImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getDelegation()
		 * @generated
		 */
		EClass DELEGATION = eINSTANCE.getDelegation();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATION__MIXED = eINSTANCE.getDelegation_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATION__ANY = eINSTANCE.getDelegation_Any();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATION__CLASS = eINSTANCE.getDelegation_Class();

		/**
		 * The meta object literal for the '<em><b>Config Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATION__CONFIG_TYPE = eINSTANCE.getDelegation_ConfigType();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.DocumentRootImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACTION = eINSTANCE.getDocumentRoot_Action();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSIGNMENT = eINSTANCE.getDocumentRoot_Assignment();

		/**
		 * The meta object literal for the '<em><b>Cancel Timer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CANCEL_TIMER = eINSTANCE.getDocumentRoot_CancelTimer();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONTROLLER = eINSTANCE.getDocumentRoot_Controller();

		/**
		 * The meta object literal for the '<em><b>Create Timer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CREATE_TIMER = eINSTANCE.getDocumentRoot_CreateTimer();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DECISION = eINSTANCE.getDocumentRoot_Decision();

		/**
		 * The meta object literal for the '<em><b>End State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__END_STATE = eINSTANCE.getDocumentRoot_EndState();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EVENT = eINSTANCE.getDocumentRoot_Event();

		/**
		 * The meta object literal for the '<em><b>Exception Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXCEPTION_HANDLER = eINSTANCE.getDocumentRoot_ExceptionHandler();

		/**
		 * The meta object literal for the '<em><b>Fork</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FORK = eINSTANCE.getDocumentRoot_Fork();

		/**
		 * The meta object literal for the '<em><b>Join</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__JOIN = eINSTANCE.getDocumentRoot_Join();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NODE = eINSTANCE.getDocumentRoot_Node();

		/**
		 * The meta object literal for the '<em><b>Process Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROCESS_DEFINITION = eINSTANCE.getDocumentRoot_ProcessDefinition();

		/**
		 * The meta object literal for the '<em><b>Process State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROCESS_STATE = eINSTANCE.getDocumentRoot_ProcessState();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCRIPT = eINSTANCE.getDocumentRoot_Script();

		/**
		 * The meta object literal for the '<em><b>Start State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__START_STATE = eINSTANCE.getDocumentRoot_StartState();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STATE = eINSTANCE.getDocumentRoot_State();

		/**
		 * The meta object literal for the '<em><b>Super State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUPER_STATE = eINSTANCE.getDocumentRoot_SuperState();

		/**
		 * The meta object literal for the '<em><b>Swimlane</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SWIMLANE = eINSTANCE.getDocumentRoot_Swimlane();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TASK = eINSTANCE.getDocumentRoot_Task();

		/**
		 * The meta object literal for the '<em><b>Task Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TASK_NODE = eINSTANCE.getDocumentRoot_TaskNode();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TIMER = eINSTANCE.getDocumentRoot_Timer();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSITION = eINSTANCE.getDocumentRoot_Transition();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VARIABLE = eINSTANCE.getDocumentRoot_Variable();

		/**
		 * The meta object literal for the '<em><b>Questionnaires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__QUESTIONNAIRES = eINSTANCE.getDocumentRoot_Questionnaires();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PLAN = eINSTANCE.getDocumentRoot_Plan();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__METRICS = eINSTANCE.getDocumentRoot_Metrics();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.EndStateTypeImpl <em>End State Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.EndStateTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getEndStateType()
		 * @generated
		 */
		EClass END_STATE_TYPE = eINSTANCE.getEndStateType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_STATE_TYPE__GROUP = eINSTANCE.getEndStateType_Group();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_STATE_TYPE__EVENT = eINSTANCE.getEndStateType_Event();

		/**
		 * The meta object literal for the '<em><b>Exception Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_STATE_TYPE__EXCEPTION_HANDLER = eINSTANCE.getEndStateType_ExceptionHandler();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_STATE_TYPE__NAME = eINSTANCE.getEndStateType_Name();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.EventTypeImpl <em>Event Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.EventTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getEventType()
		 * @generated
		 */
		EClass EVENT_TYPE = eINSTANCE.getEventType();

		/**
		 * The meta object literal for the '<em><b>Action Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_TYPE__ACTION_ELEMENTS = eINSTANCE.getEventType_ActionElements();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TYPE__ACTION = eINSTANCE.getEventType_Action();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TYPE__SCRIPT = eINSTANCE.getEventType_Script();

		/**
		 * The meta object literal for the '<em><b>Create Timer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TYPE__CREATE_TIMER = eINSTANCE.getEventType_CreateTimer();

		/**
		 * The meta object literal for the '<em><b>Cancel Timer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TYPE__CANCEL_TIMER = eINSTANCE.getEventType_CancelTimer();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_TYPE__TYPE = eINSTANCE.getEventType_Type();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.ExceptionHandlerTypeImpl <em>Exception Handler Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.ExceptionHandlerTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getExceptionHandlerType()
		 * @generated
		 */
		EClass EXCEPTION_HANDLER_TYPE = eINSTANCE.getExceptionHandlerType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_HANDLER_TYPE__GROUP = eINSTANCE.getExceptionHandlerType_Group();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_HANDLER_TYPE__ACTION = eINSTANCE.getExceptionHandlerType_Action();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_HANDLER_TYPE__SCRIPT = eINSTANCE.getExceptionHandlerType_Script();

		/**
		 * The meta object literal for the '<em><b>Exception Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_HANDLER_TYPE__EXCEPTION_CLASS = eINSTANCE.getExceptionHandlerType_ExceptionClass();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.ForkTypeImpl <em>Fork Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.ForkTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getForkType()
		 * @generated
		 */
		EClass FORK_TYPE = eINSTANCE.getForkType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORK_TYPE__GROUP = eINSTANCE.getForkType_Group();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK_TYPE__SCRIPT = eINSTANCE.getForkType_Script();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK_TYPE__EVENT = eINSTANCE.getForkType_Event();

		/**
		 * The meta object literal for the '<em><b>Exception Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK_TYPE__EXCEPTION_HANDLER = eINSTANCE.getForkType_ExceptionHandler();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK_TYPE__TIMER = eINSTANCE.getForkType_Timer();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK_TYPE__TRANSITION = eINSTANCE.getForkType_Transition();

		/**
		 * The meta object literal for the '<em><b>Async</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORK_TYPE__ASYNC = eINSTANCE.getForkType_Async();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORK_TYPE__NAME = eINSTANCE.getForkType_Name();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.JoinTypeImpl <em>Join Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.JoinTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getJoinType()
		 * @generated
		 */
		EClass JOIN_TYPE = eINSTANCE.getJoinType();

		/**
		 * The meta object literal for the '<em><b>Node Content Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_TYPE__NODE_CONTENT_ELEMENTS = eINSTANCE.getJoinType_NodeContentElements();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_TYPE__EVENT = eINSTANCE.getJoinType_Event();

		/**
		 * The meta object literal for the '<em><b>Exception Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_TYPE__EXCEPTION_HANDLER = eINSTANCE.getJoinType_ExceptionHandler();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_TYPE__TIMER = eINSTANCE.getJoinType_Timer();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_TYPE__TRANSITION = eINSTANCE.getJoinType_Transition();

		/**
		 * The meta object literal for the '<em><b>Async</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_TYPE__ASYNC = eINSTANCE.getJoinType_Async();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_TYPE__NAME = eINSTANCE.getJoinType_Name();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.NodeTypeImpl <em>Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.NodeTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getNodeType()
		 * @generated
		 */
		EClass NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__ACTION = eINSTANCE.getNodeType_Action();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__SCRIPT = eINSTANCE.getNodeType_Script();

		/**
		 * The meta object literal for the '<em><b>Create Timer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__CREATE_TIMER = eINSTANCE.getNodeType_CreateTimer();

		/**
		 * The meta object literal for the '<em><b>Cancel Timer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__CANCEL_TIMER = eINSTANCE.getNodeType_CancelTimer();

		/**
		 * The meta object literal for the '<em><b>Node Content Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__NODE_CONTENT_ELEMENTS = eINSTANCE.getNodeType_NodeContentElements();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__EVENT = eINSTANCE.getNodeType_Event();

		/**
		 * The meta object literal for the '<em><b>Exception Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__EXCEPTION_HANDLER = eINSTANCE.getNodeType_ExceptionHandler();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__TIMER = eINSTANCE.getNodeType_Timer();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__TRANSITION = eINSTANCE.getNodeType_Transition();

		/**
		 * The meta object literal for the '<em><b>Async</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__ASYNC = eINSTANCE.getNodeType_Async();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__NAME = eINSTANCE.getNodeType_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__DESCRIPTION = eINSTANCE.getNodeType_Description();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.ProcessDefinitionTypeImpl <em>Process Definition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.ProcessDefinitionTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getProcessDefinitionType()
		 * @generated
		 */
		EClass PROCESS_DEFINITION_TYPE = eINSTANCE.getProcessDefinitionType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION_TYPE__GROUP = eINSTANCE.getProcessDefinitionType_Group();

		/**
		 * The meta object literal for the '<em><b>Swimlane</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION_TYPE__SWIMLANE = eINSTANCE.getProcessDefinitionType_Swimlane();

		/**
		 * The meta object literal for the '<em><b>Start State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION_TYPE__START_STATE = eINSTANCE.getProcessDefinitionType_StartState();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION_TYPE__NODE = eINSTANCE.getProcessDefinitionType_Node();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION_TYPE__STATE = eINSTANCE.getProcessDefinitionType_State();

		/**
		 * The meta object literal for the '<em><b>Task Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION_TYPE__TASK_NODE = eINSTANCE.getProcessDefinitionType_TaskNode();

		/**
		 * The meta object literal for the '<em><b>Super State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION_TYPE__SUPER_STATE = eINSTANCE.getProcessDefinitionType_SuperState();

		/**
		 * The meta object literal for the '<em><b>Process State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION_TYPE__PROCESS_STATE = eINSTANCE.getProcessDefinitionType_ProcessState();

		/**
		 * The meta object literal for the '<em><b>Fork</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION_TYPE__FORK = eINSTANCE.getProcessDefinitionType_Fork();

		/**
		 * The meta object literal for the '<em><b>Join</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION_TYPE__JOIN = eINSTANCE.getProcessDefinitionType_Join();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION_TYPE__DECISION = eINSTANCE.getProcessDefinitionType_Decision();

		/**
		 * The meta object literal for the '<em><b>End State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION_TYPE__END_STATE = eINSTANCE.getProcessDefinitionType_EndState();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION_TYPE__ACTION = eINSTANCE.getProcessDefinitionType_Action();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION_TYPE__SCRIPT = eINSTANCE.getProcessDefinitionType_Script();

		/**
		 * The meta object literal for the '<em><b>Create Timer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION_TYPE__CREATE_TIMER = eINSTANCE.getProcessDefinitionType_CreateTimer();

		/**
		 * The meta object literal for the '<em><b>Cancel Timer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION_TYPE__CANCEL_TIMER = eINSTANCE.getProcessDefinitionType_CancelTimer();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION_TYPE__EVENT = eINSTANCE.getProcessDefinitionType_Event();

		/**
		 * The meta object literal for the '<em><b>Exception Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION_TYPE__EXCEPTION_HANDLER = eINSTANCE.getProcessDefinitionType_ExceptionHandler();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION_TYPE__TASK = eINSTANCE.getProcessDefinitionType_Task();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION_TYPE__NAME = eINSTANCE.getProcessDefinitionType_Name();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION_TYPE__QUANTITY = eINSTANCE.getProcessDefinitionType_Quantity();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.ProcessStateTypeImpl <em>Process State Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.ProcessStateTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getProcessStateType()
		 * @generated
		 */
		EClass PROCESS_STATE_TYPE = eINSTANCE.getProcessStateType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_STATE_TYPE__GROUP = eINSTANCE.getProcessStateType_Group();

		/**
		 * The meta object literal for the '<em><b>Sub Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STATE_TYPE__SUB_PROCESS = eINSTANCE.getProcessStateType_SubProcess();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STATE_TYPE__VARIABLE = eINSTANCE.getProcessStateType_Variable();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STATE_TYPE__EVENT = eINSTANCE.getProcessStateType_Event();

		/**
		 * The meta object literal for the '<em><b>Exception Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STATE_TYPE__EXCEPTION_HANDLER = eINSTANCE.getProcessStateType_ExceptionHandler();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STATE_TYPE__TIMER = eINSTANCE.getProcessStateType_Timer();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STATE_TYPE__TRANSITION = eINSTANCE.getProcessStateType_Transition();

		/**
		 * The meta object literal for the '<em><b>Async</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_STATE_TYPE__ASYNC = eINSTANCE.getProcessStateType_Async();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_STATE_TYPE__NAME = eINSTANCE.getProcessStateType_Name();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.ScriptTypeImpl <em>Script Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.ScriptTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getScriptType()
		 * @generated
		 */
		EClass SCRIPT_TYPE = eINSTANCE.getScriptType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_TYPE__MIXED = eINSTANCE.getScriptType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_TYPE__ANY = eINSTANCE.getScriptType_Any();

		/**
		 * The meta object literal for the '<em><b>Accept Propagated Events</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_TYPE__ACCEPT_PROPAGATED_EVENTS = eINSTANCE.getScriptType_AcceptPropagatedEvents();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_TYPE__NAME = eINSTANCE.getScriptType_Name();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.StartStateTypeImpl <em>Start State Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.StartStateTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getStartStateType()
		 * @generated
		 */
		EClass START_STATE_TYPE = eINSTANCE.getStartStateType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_STATE_TYPE__GROUP = eINSTANCE.getStartStateType_Group();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_STATE_TYPE__TASK = eINSTANCE.getStartStateType_Task();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_STATE_TYPE__TRANSITION = eINSTANCE.getStartStateType_Transition();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_STATE_TYPE__EVENT = eINSTANCE.getStartStateType_Event();

		/**
		 * The meta object literal for the '<em><b>Exception Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_STATE_TYPE__EXCEPTION_HANDLER = eINSTANCE.getStartStateType_ExceptionHandler();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_STATE_TYPE__NAME = eINSTANCE.getStartStateType_Name();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.StateTypeImpl <em>State Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.StateTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getStateType()
		 * @generated
		 */
		EClass STATE_TYPE = eINSTANCE.getStateType();

		/**
		 * The meta object literal for the '<em><b>Node Content Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_TYPE__NODE_CONTENT_ELEMENTS = eINSTANCE.getStateType_NodeContentElements();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_TYPE__EVENT = eINSTANCE.getStateType_Event();

		/**
		 * The meta object literal for the '<em><b>Exception Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_TYPE__EXCEPTION_HANDLER = eINSTANCE.getStateType_ExceptionHandler();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_TYPE__TIMER = eINSTANCE.getStateType_Timer();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_TYPE__TRANSITION = eINSTANCE.getStateType_Transition();

		/**
		 * The meta object literal for the '<em><b>Async</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_TYPE__ASYNC = eINSTANCE.getStateType_Async();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_TYPE__NAME = eINSTANCE.getStateType_Name();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.SubProcessTypeImpl <em>Sub Process Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.SubProcessTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getSubProcessType()
		 * @generated
		 */
		EClass SUB_PROCESS_TYPE = eINSTANCE.getSubProcessType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_PROCESS_TYPE__NAME = eINSTANCE.getSubProcessType_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_PROCESS_TYPE__VERSION = eINSTANCE.getSubProcessType_Version();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.SuperStateTypeImpl <em>Super State Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.SuperStateTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getSuperStateType()
		 * @generated
		 */
		EClass SUPER_STATE_TYPE = eINSTANCE.getSuperStateType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_STATE_TYPE__GROUP = eINSTANCE.getSuperStateType_Group();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_STATE_TYPE__NODE = eINSTANCE.getSuperStateType_Node();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_STATE_TYPE__STATE = eINSTANCE.getSuperStateType_State();

		/**
		 * The meta object literal for the '<em><b>Task Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_STATE_TYPE__TASK_NODE = eINSTANCE.getSuperStateType_TaskNode();

		/**
		 * The meta object literal for the '<em><b>Super State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_STATE_TYPE__SUPER_STATE = eINSTANCE.getSuperStateType_SuperState();

		/**
		 * The meta object literal for the '<em><b>Process State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_STATE_TYPE__PROCESS_STATE = eINSTANCE.getSuperStateType_ProcessState();

		/**
		 * The meta object literal for the '<em><b>Fork</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_STATE_TYPE__FORK = eINSTANCE.getSuperStateType_Fork();

		/**
		 * The meta object literal for the '<em><b>Join</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_STATE_TYPE__JOIN = eINSTANCE.getSuperStateType_Join();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_STATE_TYPE__DECISION = eINSTANCE.getSuperStateType_Decision();

		/**
		 * The meta object literal for the '<em><b>End State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_STATE_TYPE__END_STATE = eINSTANCE.getSuperStateType_EndState();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_STATE_TYPE__EVENT = eINSTANCE.getSuperStateType_Event();

		/**
		 * The meta object literal for the '<em><b>Exception Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_STATE_TYPE__EXCEPTION_HANDLER = eINSTANCE.getSuperStateType_ExceptionHandler();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_STATE_TYPE__TIMER = eINSTANCE.getSuperStateType_Timer();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_STATE_TYPE__TRANSITION = eINSTANCE.getSuperStateType_Transition();

		/**
		 * The meta object literal for the '<em><b>Async</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_STATE_TYPE__ASYNC = eINSTANCE.getSuperStateType_Async();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_STATE_TYPE__NAME = eINSTANCE.getSuperStateType_Name();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.SwimlaneTypeImpl <em>Swimlane Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.SwimlaneTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getSwimlaneType()
		 * @generated
		 */
		EClass SWIMLANE_TYPE = eINSTANCE.getSwimlaneType();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWIMLANE_TYPE__ASSIGNMENT = eINSTANCE.getSwimlaneType_Assignment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWIMLANE_TYPE__NAME = eINSTANCE.getSwimlaneType_Name();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.TaskNodeTypeImpl <em>Task Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.TaskNodeTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getTaskNodeType()
		 * @generated
		 */
		EClass TASK_NODE_TYPE = eINSTANCE.getTaskNodeType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_NODE_TYPE__GROUP = eINSTANCE.getTaskNodeType_Group();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_NODE_TYPE__TASK = eINSTANCE.getTaskNodeType_Task();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_NODE_TYPE__EVENT = eINSTANCE.getTaskNodeType_Event();

		/**
		 * The meta object literal for the '<em><b>Exception Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_NODE_TYPE__EXCEPTION_HANDLER = eINSTANCE.getTaskNodeType_ExceptionHandler();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_NODE_TYPE__TIMER = eINSTANCE.getTaskNodeType_Timer();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_NODE_TYPE__TRANSITION = eINSTANCE.getTaskNodeType_Transition();

		/**
		 * The meta object literal for the '<em><b>Async</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_NODE_TYPE__ASYNC = eINSTANCE.getTaskNodeType_Async();

		/**
		 * The meta object literal for the '<em><b>Create Tasks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_NODE_TYPE__CREATE_TASKS = eINSTANCE.getTaskNodeType_CreateTasks();

		/**
		 * The meta object literal for the '<em><b>End Tasks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_NODE_TYPE__END_TASKS = eINSTANCE.getTaskNodeType_EndTasks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_NODE_TYPE__NAME = eINSTANCE.getTaskNodeType_Name();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_NODE_TYPE__SIGNAL = eINSTANCE.getTaskNodeType_Signal();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_NODE_TYPE__DESCRIPTION = eINSTANCE.getTaskNodeType_Description();

		/**
		 * The meta object literal for the '<em><b>Artefacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_NODE_TYPE__ARTEFACTS = eINSTANCE.getTaskNodeType_Artefacts();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_NODE_TYPE__METRICS = eINSTANCE.getTaskNodeType_Metrics();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.TaskTypeImpl <em>Task Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.TaskTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getTaskType()
		 * @generated
		 */
		EClass TASK_TYPE = eINSTANCE.getTaskType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__GROUP = eINSTANCE.getTaskType_Group();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__ASSIGNMENT = eINSTANCE.getTaskType_Assignment();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__CONTROLLER = eINSTANCE.getTaskType_Controller();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__EVENT = eINSTANCE.getTaskType_Event();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__TIMER = eINSTANCE.getTaskType_Timer();

		/**
		 * The meta object literal for the '<em><b>Blocking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__BLOCKING = eINSTANCE.getTaskType_Blocking();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__DESCRIPTION = eINSTANCE.getTaskType_Description();

		/**
		 * The meta object literal for the '<em><b>Duedate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__DUEDATE = eINSTANCE.getTaskType_Duedate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__NAME = eINSTANCE.getTaskType_Name();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__PRIORITY = eINSTANCE.getTaskType_Priority();

		/**
		 * The meta object literal for the '<em><b>Signalling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__SIGNALLING = eINSTANCE.getTaskType_Signalling();

		/**
		 * The meta object literal for the '<em><b>Swimlane</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__SWIMLANE = eINSTANCE.getTaskType_Swimlane();

		/**
		 * The meta object literal for the '<em><b>Artefacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__ARTEFACTS = eINSTANCE.getTaskType_Artefacts();

		/**
		 * The meta object literal for the '<em><b>Metric Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__METRIC_INFO = eINSTANCE.getTaskType_MetricInfo();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.TimerTypeImpl <em>Timer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.TimerTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getTimerType()
		 * @generated
		 */
		EClass TIMER_TYPE = eINSTANCE.getTimerType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER_TYPE__ACTION = eINSTANCE.getTimerType_Action();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER_TYPE__SCRIPT = eINSTANCE.getTimerType_Script();

		/**
		 * The meta object literal for the '<em><b>Duedate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER_TYPE__DUEDATE = eINSTANCE.getTimerType_Duedate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER_TYPE__NAME = eINSTANCE.getTimerType_Name();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER_TYPE__REPEAT = eINSTANCE.getTimerType_Repeat();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER_TYPE__TRANSITION = eINSTANCE.getTimerType_Transition();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.TransitionTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getTransitionType()
		 * @generated
		 */
		EClass TRANSITION_TYPE = eINSTANCE.getTransitionType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__GROUP = eINSTANCE.getTransitionType_Group();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE__ACTION = eINSTANCE.getTransitionType_Action();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE__SCRIPT = eINSTANCE.getTransitionType_Script();

		/**
		 * The meta object literal for the '<em><b>Create Timer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE__CREATE_TIMER = eINSTANCE.getTransitionType_CreateTimer();

		/**
		 * The meta object literal for the '<em><b>Cancel Timer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE__CANCEL_TIMER = eINSTANCE.getTransitionType_CancelTimer();

		/**
		 * The meta object literal for the '<em><b>Exception Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE__EXCEPTION_HANDLER = eINSTANCE.getTransitionType_ExceptionHandler();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__NAME = eINSTANCE.getTransitionType_Name();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__TO = eINSTANCE.getTransitionType_To();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.TransitionType1Impl <em>Transition Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.TransitionType1Impl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getTransitionType1()
		 * @generated
		 */
		EClass TRANSITION_TYPE1 = eINSTANCE.getTransitionType1();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE1__GROUP = eINSTANCE.getTransitionType1_Group();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE1__CONDITION = eINSTANCE.getTransitionType1_Condition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE1__ACTION = eINSTANCE.getTransitionType1_Action();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE1__SCRIPT = eINSTANCE.getTransitionType1_Script();

		/**
		 * The meta object literal for the '<em><b>Create Timer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE1__CREATE_TIMER = eINSTANCE.getTransitionType1_CreateTimer();

		/**
		 * The meta object literal for the '<em><b>Cancel Timer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE1__CANCEL_TIMER = eINSTANCE.getTransitionType1_CancelTimer();

		/**
		 * The meta object literal for the '<em><b>Exception Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE1__EXCEPTION_HANDLER = eINSTANCE.getTransitionType1_ExceptionHandler();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE1__NAME = eINSTANCE.getTransitionType1_Name();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE1__TO = eINSTANCE.getTransitionType1_To();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.VariableTypeImpl <em>Variable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.VariableTypeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getVariableType()
		 * @generated
		 */
		EClass VARIABLE_TYPE = eINSTANCE.getVariableType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_TYPE__ANY = eINSTANCE.getVariableType_Any();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_TYPE__ACCESS = eINSTANCE.getVariableType_Access();

		/**
		 * The meta object literal for the '<em><b>Mapped Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_TYPE__MAPPED_NAME = eINSTANCE.getVariableType_MappedName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_TYPE__NAME = eINSTANCE.getVariableType_Name();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.ArtefactImpl <em>Artefact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.ArtefactImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getArtefact()
		 * @generated
		 */
		EClass ARTEFACT = eINSTANCE.getArtefact();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTEFACT__NAME = eINSTANCE.getArtefact_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTEFACT__TYPE = eINSTANCE.getArtefact_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTEFACT__DESCRIPTION = eINSTANCE.getArtefact_Description();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.ModelImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.MetricInfoImpl <em>Metric Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.MetricInfoImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getMetricInfo()
		 * @generated
		 */
		EClass METRIC_INFO = eINSTANCE.getMetricInfo();

		/**
		 * The meta object literal for the '<em><b>Metric Referenced</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_INFO__METRIC_REFERENCED = eINSTANCE.getMetricInfo_MetricReferenced();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC_INFO__NAME = eINSTANCE.getMetricInfo_Name();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.HyphotesisImpl <em>Hyphotesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.HyphotesisImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getHyphotesis()
		 * @generated
		 */
		EClass HYPHOTESIS = eINSTANCE.getHyphotesis();

		/**
		 * The meta object literal for the '<em><b>Formalizes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPHOTESIS__FORMALIZES = eINSTANCE.getHyphotesis_Formalizes();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPHOTESIS__DESCRIPTION = eINSTANCE.getHyphotesis_Description();

		/**
		 * The meta object literal for the '<em><b>From Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPHOTESIS__FROM_GOAL = eINSTANCE.getHyphotesis_FromGoal();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPHOTESIS__TYPE = eINSTANCE.getHyphotesis_Type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPHOTESIS__ID = eINSTANCE.getHyphotesis_Id();

		/**
		 * The meta object literal for the '<em><b>Relation Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPHOTESIS__RELATION_OP = eINSTANCE.getHyphotesis_RelationOp();

		/**
		 * The meta object literal for the '<em><b>Treatment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPHOTESIS__TREATMENT = eINSTANCE.getHyphotesis_Treatment();

		/**
		 * The meta object literal for the '<em><b>Dependent Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPHOTESIS__DEPENDENT_VARIABLE = eINSTANCE.getHyphotesis_DependentVariable();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.SubhypothesesImpl <em>Subhypotheses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.SubhypothesesImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getSubhypotheses()
		 * @generated
		 */
		EClass SUBHYPOTHESES = eINSTANCE.getSubhypotheses();

		/**
		 * The meta object literal for the '<em><b>Relation Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBHYPOTHESES__RELATION_OP = eINSTANCE.getSubhypotheses_RelationOp();

		/**
		 * The meta object literal for the '<em><b>Treatment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBHYPOTHESES__TREATMENT = eINSTANCE.getSubhypotheses_Treatment();

		/**
		 * The meta object literal for the '<em><b>Dependent Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBHYPOTHESES__DEPENDENT_VARIABLE = eINSTANCE.getSubhypotheses_DependentVariable();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.DependentVariableImpl <em>Dependent Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.DependentVariableImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getDependentVariable()
		 * @generated
		 */
		EClass DEPENDENT_VARIABLE = eINSTANCE.getDependentVariable();

		/**
		 * The meta object literal for the '<em><b>Measure By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENT_VARIABLE__MEASURE_BY = eINSTANCE.getDependentVariable_MeasureBy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENT_VARIABLE__NAME = eINSTANCE.getDependentVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENT_VARIABLE__DESCRIPTION = eINSTANCE.getDependentVariable_Description();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.FactorImpl <em>Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.FactorImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getFactor()
		 * @generated
		 */
		EClass FACTOR = eINSTANCE.getFactor();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTOR__LEVELS = eINSTANCE.getFactor_Levels();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTOR__NAME = eINSTANCE.getFactor_Name();

		/**
		 * The meta object literal for the '<em><b>Is Treament</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTOR__IS_TREAMENT = eINSTANCE.getFactor_IsTreament();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.LevelImpl <em>Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.LevelImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getLevel()
		 * @generated
		 */
		EClass LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__NAME = eINSTANCE.getLevel_Name();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.MetricImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__NAME = eINSTANCE.getMetric_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__DESCRIPTION = eINSTANCE.getMetric_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__TYPE = eINSTANCE.getMetric_Type();

		/**
		 * The meta object literal for the '<em><b>Relates To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__RELATES_TO = eINSTANCE.getMetric_RelatesTo();

		/**
		 * The meta object literal for the '<em><b>Refname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__REFNAME = eINSTANCE.getMetric_Refname();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.QuestionnaireImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getQuestionnaire()
		 * @generated
		 */
		EClass QUESTIONNAIRE = eINSTANCE.getQuestionnaire();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__QUESTION = eINSTANCE.getQuestionnaire_Question();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__NAME = eINSTANCE.getQuestionnaire_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__TYPE = eINSTANCE.getQuestionnaire_Type();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__PROCESSES = eINSTANCE.getQuestionnaire_Processes();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.QuestionImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__DESCRIPTION = eINSTANCE.getQuestion_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__TYPE = eINSTANCE.getQuestion_Type();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__REQUIRED = eINSTANCE.getQuestion_Required();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__OPTION = eINSTANCE.getQuestion_Option();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__EREFERENCE0 = eINSTANCE.getQuestion_EReference0();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.AlternativeImpl <em>Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.AlternativeImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getAlternative()
		 * @generated
		 */
		EClass ALTERNATIVE = eINSTANCE.getAlternative();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTERNATIVE__DESCRIPTION = eINSTANCE.getAlternative_Description();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.GoalImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__ID = eINSTANCE.getGoal_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__DESCRIPTION = eINSTANCE.getGoal_Description();

		/**
		 * The meta object literal for the '<em><b>Hypotheses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__HYPOTHESES = eINSTANCE.getGoal_Hypotheses();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.ExperimentalPlanImpl <em>Experimental Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.ExperimentalPlanImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getExperimentalPlan()
		 * @generated
		 */
		EClass EXPERIMENTAL_PLAN = eINSTANCE.getExperimentalPlan();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENTAL_PLAN__GOALS = eINSTANCE.getExperimentalPlan_Goals();

		/**
		 * The meta object literal for the '<em><b>Hypothesis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENTAL_PLAN__HYPOTHESIS = eINSTANCE.getExperimentalPlan_Hypothesis();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENTAL_PLAN__DESIGN = eINSTANCE.getExperimentalPlan_Design();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.DesignImpl <em>Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.DesignImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getDesign()
		 * @generated
		 */
		EClass DESIGN = eINSTANCE.getDesign();

		/**
		 * The meta object literal for the '<em><b>Factors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN__FACTORS = eINSTANCE.getDesign_Factors();

		/**
		 * The meta object literal for the '<em><b>Do E</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN__DO_E = eINSTANCE.getDesign_DoE();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN__PARAMETERS = eINSTANCE.getDesign_Parameters();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN__TEST = eINSTANCE.getDesign_Test();

		/**
		 * The meta object literal for the '<em><b>Dep Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN__DEP_VARIABLE = eINSTANCE.getDesign_DepVariable();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.ParameterImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__KEY = eINSTANCE.getParameter_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link jpdl31.impl.StatisticalTestImpl <em>Statistical Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.StatisticalTestImpl
		 * @see jpdl31.impl.Jpdl31PackageImpl#getStatisticalTest()
		 * @generated
		 */
		EClass STATISTICAL_TEST = eINSTANCE.getStatisticalTest();

		/**
		 * The meta object literal for the '{@link jpdl31.BooleanType <em>Boolean Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.BooleanType
		 * @see jpdl31.impl.Jpdl31PackageImpl#getBooleanType()
		 * @generated
		 */
		EEnum BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '{@link jpdl31.ConfigType <em>Config Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.ConfigType
		 * @see jpdl31.impl.Jpdl31PackageImpl#getConfigType()
		 * @generated
		 */
		EEnum CONFIG_TYPE = eINSTANCE.getConfigType();

		/**
		 * The meta object literal for the '{@link jpdl31.ConfigTypeType <em>Config Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.ConfigTypeType
		 * @see jpdl31.impl.Jpdl31PackageImpl#getConfigTypeType()
		 * @generated
		 */
		EEnum CONFIG_TYPE_TYPE = eINSTANCE.getConfigTypeType();

		/**
		 * The meta object literal for the '{@link jpdl31.ConfigTypeType1 <em>Config Type Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.ConfigTypeType1
		 * @see jpdl31.impl.Jpdl31PackageImpl#getConfigTypeType1()
		 * @generated
		 */
		EEnum CONFIG_TYPE_TYPE1 = eINSTANCE.getConfigTypeType1();

		/**
		 * The meta object literal for the '{@link jpdl31.PriorityTypeMember0 <em>Priority Type Member0</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.PriorityTypeMember0
		 * @see jpdl31.impl.Jpdl31PackageImpl#getPriorityTypeMember0()
		 * @generated
		 */
		EEnum PRIORITY_TYPE_MEMBER0 = eINSTANCE.getPriorityTypeMember0();

		/**
		 * The meta object literal for the '{@link jpdl31.SignalType <em>Signal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.SignalType
		 * @see jpdl31.impl.Jpdl31PackageImpl#getSignalType()
		 * @generated
		 */
		EEnum SIGNAL_TYPE = eINSTANCE.getSignalType();

		/**
		 * The meta object literal for the '{@link jpdl31.TypeTypeMember1 <em>Type Type Member1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.TypeTypeMember1
		 * @see jpdl31.impl.Jpdl31PackageImpl#getTypeTypeMember1()
		 * @generated
		 */
		EEnum TYPE_TYPE_MEMBER1 = eINSTANCE.getTypeTypeMember1();

		/**
		 * The meta object literal for the '{@link jpdl31.ArtefactType <em>Artefact Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.ArtefactType
		 * @see jpdl31.impl.Jpdl31PackageImpl#getArtefactType()
		 * @generated
		 */
		EEnum ARTEFACT_TYPE = eINSTANCE.getArtefactType();

		/**
		 * The meta object literal for the '{@link jpdl31.MetricType <em>Metric Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.MetricType
		 * @see jpdl31.impl.Jpdl31PackageImpl#getMetricType()
		 * @generated
		 */
		EEnum METRIC_TYPE = eINSTANCE.getMetricType();

		/**
		 * The meta object literal for the '{@link jpdl31.RelationOperator <em>Relation Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.RelationOperator
		 * @see jpdl31.impl.Jpdl31PackageImpl#getRelationOperator()
		 * @generated
		 */
		EEnum RELATION_OPERATOR = eINSTANCE.getRelationOperator();

		/**
		 * The meta object literal for the '{@link jpdl31.AnswerType <em>Answer Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.AnswerType
		 * @see jpdl31.impl.Jpdl31PackageImpl#getAnswerType()
		 * @generated
		 */
		EEnum ANSWER_TYPE = eINSTANCE.getAnswerType();

		/**
		 * The meta object literal for the '{@link jpdl31.DoEType <em>Do EType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.DoEType
		 * @see jpdl31.impl.Jpdl31PackageImpl#getDoEType()
		 * @generated
		 */
		EEnum DO_ETYPE = eINSTANCE.getDoEType();

		/**
		 * The meta object literal for the '{@link jpdl31.HypothesisType <em>Hypothesis Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.HypothesisType
		 * @see jpdl31.impl.Jpdl31PackageImpl#getHypothesisType()
		 * @generated
		 */
		EEnum HYPOTHESIS_TYPE = eINSTANCE.getHypothesisType();

		/**
		 * The meta object literal for the '{@link jpdl31.QuestionnaireType <em>Questionnaire Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.QuestionnaireType
		 * @see jpdl31.impl.Jpdl31PackageImpl#getQuestionnaireType()
		 * @generated
		 */
		EEnum QUESTIONNAIRE_TYPE = eINSTANCE.getQuestionnaireType();

		/**
		 * The meta object literal for the '<em>Boolean Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.BooleanType
		 * @see jpdl31.impl.Jpdl31PackageImpl#getBooleanTypeObject()
		 * @generated
		 */
		EDataType BOOLEAN_TYPE_OBJECT = eINSTANCE.getBooleanTypeObject();

		/**
		 * The meta object literal for the '<em>Config Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.ConfigType
		 * @see jpdl31.impl.Jpdl31PackageImpl#getConfigTypeObject()
		 * @generated
		 */
		EDataType CONFIG_TYPE_OBJECT = eINSTANCE.getConfigTypeObject();

		/**
		 * The meta object literal for the '<em>Config Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.ConfigTypeType
		 * @see jpdl31.impl.Jpdl31PackageImpl#getConfigTypeTypeObject()
		 * @generated
		 */
		EDataType CONFIG_TYPE_TYPE_OBJECT = eINSTANCE.getConfigTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Config Type Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.ConfigTypeType1
		 * @see jpdl31.impl.Jpdl31PackageImpl#getConfigTypeTypeObject1()
		 * @generated
		 */
		EDataType CONFIG_TYPE_TYPE_OBJECT1 = eINSTANCE.getConfigTypeTypeObject1();

		/**
		 * The meta object literal for the '<em>Priority Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see jpdl31.impl.Jpdl31PackageImpl#getPriorityType()
		 * @generated
		 */
		EDataType PRIORITY_TYPE = eINSTANCE.getPriorityType();

		/**
		 * The meta object literal for the '<em>Priority Type Member0 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.PriorityTypeMember0
		 * @see jpdl31.impl.Jpdl31PackageImpl#getPriorityTypeMember0Object()
		 * @generated
		 */
		EDataType PRIORITY_TYPE_MEMBER0_OBJECT = eINSTANCE.getPriorityTypeMember0Object();

		/**
		 * The meta object literal for the '<em>Priority Type Member1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.impl.Jpdl31PackageImpl#getPriorityTypeMember1()
		 * @generated
		 */
		EDataType PRIORITY_TYPE_MEMBER1 = eINSTANCE.getPriorityTypeMember1();

		/**
		 * The meta object literal for the '<em>Priority Type Member1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see jpdl31.impl.Jpdl31PackageImpl#getPriorityTypeMember1Object()
		 * @generated
		 */
		EDataType PRIORITY_TYPE_MEMBER1_OBJECT = eINSTANCE.getPriorityTypeMember1Object();

		/**
		 * The meta object literal for the '<em>Signal Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.SignalType
		 * @see jpdl31.impl.Jpdl31PackageImpl#getSignalTypeObject()
		 * @generated
		 */
		EDataType SIGNAL_TYPE_OBJECT = eINSTANCE.getSignalTypeObject();

		/**
		 * The meta object literal for the '<em>Type Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see jpdl31.impl.Jpdl31PackageImpl#getTypeType()
		 * @generated
		 */
		EDataType TYPE_TYPE = eINSTANCE.getTypeType();

		/**
		 * The meta object literal for the '<em>Type Type Member0</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see jpdl31.impl.Jpdl31PackageImpl#getTypeTypeMember0()
		 * @generated
		 */
		EDataType TYPE_TYPE_MEMBER0 = eINSTANCE.getTypeTypeMember0();

		/**
		 * The meta object literal for the '<em>Type Type Member1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jpdl31.TypeTypeMember1
		 * @see jpdl31.impl.Jpdl31PackageImpl#getTypeTypeMember1Object()
		 * @generated
		 */
		EDataType TYPE_TYPE_MEMBER1_OBJECT = eINSTANCE.getTypeTypeMember1Object();

	}

} //Jpdl31Package

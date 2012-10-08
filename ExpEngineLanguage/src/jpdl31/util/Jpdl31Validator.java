/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31.util;

import java.util.Map;

import jpdl31.*;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see jpdl31.Jpdl31Package
 * @generated
 */
public class Jpdl31Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Jpdl31Validator INSTANCE = new Jpdl31Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "jpdl31";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jpdl31Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Jpdl31Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Jpdl31Package.ACTION_TYPE:
				return validateActionType((ActionType)value, diagnostics, context);
			case Jpdl31Package.ASSIGNMENT_TYPE:
				return validateAssignmentType((AssignmentType)value, diagnostics, context);
			case Jpdl31Package.CANCEL_TIMER_TYPE:
				return validateCancelTimerType((CancelTimerType)value, diagnostics, context);
			case Jpdl31Package.CONDITION_TYPE:
				return validateConditionType((ConditionType)value, diagnostics, context);
			case Jpdl31Package.CREATE_TIMER_TYPE:
				return validateCreateTimerType((CreateTimerType)value, diagnostics, context);
			case Jpdl31Package.DECISION_TYPE:
				return validateDecisionType((DecisionType)value, diagnostics, context);
			case Jpdl31Package.DELEGATION:
				return validateDelegation((Delegation)value, diagnostics, context);
			case Jpdl31Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case Jpdl31Package.END_STATE_TYPE:
				return validateEndStateType((EndStateType)value, diagnostics, context);
			case Jpdl31Package.EVENT_TYPE:
				return validateEventType((EventType)value, diagnostics, context);
			case Jpdl31Package.EXCEPTION_HANDLER_TYPE:
				return validateExceptionHandlerType((ExceptionHandlerType)value, diagnostics, context);
			case Jpdl31Package.FORK_TYPE:
				return validateForkType((ForkType)value, diagnostics, context);
			case Jpdl31Package.JOIN_TYPE:
				return validateJoinType((JoinType)value, diagnostics, context);
			case Jpdl31Package.NODE_TYPE:
				return validateNodeType((NodeType)value, diagnostics, context);
			case Jpdl31Package.PROCESS_DEFINITION_TYPE:
				return validateProcessDefinitionType((ProcessDefinitionType)value, diagnostics, context);
			case Jpdl31Package.PROCESS_STATE_TYPE:
				return validateProcessStateType((ProcessStateType)value, diagnostics, context);
			case Jpdl31Package.SCRIPT_TYPE:
				return validateScriptType((ScriptType)value, diagnostics, context);
			case Jpdl31Package.START_STATE_TYPE:
				return validateStartStateType((StartStateType)value, diagnostics, context);
			case Jpdl31Package.STATE_TYPE:
				return validateStateType((StateType)value, diagnostics, context);
			case Jpdl31Package.SUB_PROCESS_TYPE:
				return validateSubProcessType((SubProcessType)value, diagnostics, context);
			case Jpdl31Package.SUPER_STATE_TYPE:
				return validateSuperStateType((SuperStateType)value, diagnostics, context);
			case Jpdl31Package.SWIMLANE_TYPE:
				return validateSwimlaneType((SwimlaneType)value, diagnostics, context);
			case Jpdl31Package.TASK_NODE_TYPE:
				return validateTaskNodeType((TaskNodeType)value, diagnostics, context);
			case Jpdl31Package.TASK_TYPE:
				return validateTaskType((TaskType)value, diagnostics, context);
			case Jpdl31Package.TIMER_TYPE:
				return validateTimerType((TimerType)value, diagnostics, context);
			case Jpdl31Package.TRANSITION_TYPE:
				return validateTransitionType((TransitionType)value, diagnostics, context);
			case Jpdl31Package.TRANSITION_TYPE1:
				return validateTransitionType1((TransitionType1)value, diagnostics, context);
			case Jpdl31Package.VARIABLE_TYPE:
				return validateVariableType((VariableType)value, diagnostics, context);
			case Jpdl31Package.ARTEFACT:
				return validateArtefact((Artefact)value, diagnostics, context);
			case Jpdl31Package.MODEL:
				return validateModel((Model)value, diagnostics, context);
			case Jpdl31Package.BOOLEAN_TYPE:
				return validateBooleanType((BooleanType)value, diagnostics, context);
			case Jpdl31Package.CONFIG_TYPE:
				return validateConfigType((ConfigType)value, diagnostics, context);
			case Jpdl31Package.CONFIG_TYPE_TYPE:
				return validateConfigTypeType((ConfigTypeType)value, diagnostics, context);
			case Jpdl31Package.CONFIG_TYPE_TYPE1:
				return validateConfigTypeType1((ConfigTypeType1)value, diagnostics, context);
			case Jpdl31Package.PRIORITY_TYPE_MEMBER0:
				return validatePriorityTypeMember0((PriorityTypeMember0)value, diagnostics, context);
			case Jpdl31Package.SIGNAL_TYPE:
				return validateSignalType((SignalType)value, diagnostics, context);
			case Jpdl31Package.TYPE_TYPE_MEMBER1:
				return validateTypeTypeMember1((TypeTypeMember1)value, diagnostics, context);
			case Jpdl31Package.ARTEFACT_TYPE:
				return validateArtefactType((ArtefactType)value, diagnostics, context);
			case Jpdl31Package.BOOLEAN_TYPE_OBJECT:
				return validateBooleanTypeObject((BooleanType)value, diagnostics, context);
			case Jpdl31Package.CONFIG_TYPE_OBJECT:
				return validateConfigTypeObject((ConfigType)value, diagnostics, context);
			case Jpdl31Package.CONFIG_TYPE_TYPE_OBJECT:
				return validateConfigTypeTypeObject((ConfigTypeType)value, diagnostics, context);
			case Jpdl31Package.CONFIG_TYPE_TYPE_OBJECT1:
				return validateConfigTypeTypeObject1((ConfigTypeType1)value, diagnostics, context);
			case Jpdl31Package.PRIORITY_TYPE:
				return validatePriorityType(value, diagnostics, context);
			case Jpdl31Package.PRIORITY_TYPE_MEMBER0_OBJECT:
				return validatePriorityTypeMember0Object((PriorityTypeMember0)value, diagnostics, context);
			case Jpdl31Package.PRIORITY_TYPE_MEMBER1:
				return validatePriorityTypeMember1((Integer)value, diagnostics, context);
			case Jpdl31Package.PRIORITY_TYPE_MEMBER1_OBJECT:
				return validatePriorityTypeMember1Object((Integer)value, diagnostics, context);
			case Jpdl31Package.SIGNAL_TYPE_OBJECT:
				return validateSignalTypeObject((SignalType)value, diagnostics, context);
			case Jpdl31Package.TYPE_TYPE:
				return validateTypeType(value, diagnostics, context);
			case Jpdl31Package.TYPE_TYPE_MEMBER0:
				return validateTypeTypeMember0((String)value, diagnostics, context);
			case Jpdl31Package.TYPE_TYPE_MEMBER1_OBJECT:
				return validateTypeTypeMember1Object((TypeTypeMember1)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionType(ActionType actionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignmentType(AssignmentType assignmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assignmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCancelTimerType(CancelTimerType cancelTimerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cancelTimerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionType(ConditionType conditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateTimerType(CreateTimerType createTimerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(createTimerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionType(DecisionType decisionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decisionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegation(Delegation delegation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delegation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndStateType(EndStateType endStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endStateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventType(EventType eventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExceptionHandlerType(ExceptionHandlerType exceptionHandlerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exceptionHandlerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForkType(ForkType forkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(forkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoinType(JoinType joinType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(joinType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeType(NodeType nodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessDefinitionType(ProcessDefinitionType processDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessStateType(ProcessStateType processStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processStateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScriptType(ScriptType scriptType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scriptType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartStateType(StartStateType startStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(startStateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateType(StateType stateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubProcessType(SubProcessType subProcessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subProcessType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuperStateType(SuperStateType superStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(superStateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSwimlaneType(SwimlaneType swimlaneType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(swimlaneType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskNodeType(TaskNodeType taskNodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskNodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskType(TaskType taskType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimerType(TimerType timerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionType(TransitionType transitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionType1(TransitionType1 transitionType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transitionType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableType(VariableType variableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtefact(Artefact artefact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(artefact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(model, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanType(BooleanType booleanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigType(ConfigType configType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigTypeType(ConfigTypeType configTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigTypeType1(ConfigTypeType1 configTypeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityTypeMember0(PriorityTypeMember0 priorityTypeMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalType(SignalType signalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeMember1(TypeTypeMember1 typeTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtefactType(ArtefactType artefactType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanTypeObject(BooleanType booleanTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigTypeObject(ConfigType configTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigTypeTypeObject(ConfigTypeType configTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigTypeTypeObject1(ConfigTypeType1 configTypeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityType(Object priorityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePriorityType_MemberTypes(priorityType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Priority Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityType_MemberTypes(Object priorityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Jpdl31Package.Literals.PRIORITY_TYPE_MEMBER0.isInstance(priorityType)) {
				if (validatePriorityTypeMember0((PriorityTypeMember0)priorityType, tempDiagnostics, context)) return true;
			}
			if (Jpdl31Package.Literals.PRIORITY_TYPE_MEMBER1.isInstance(priorityType)) {
				if (validatePriorityTypeMember1((Integer)priorityType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Jpdl31Package.Literals.PRIORITY_TYPE_MEMBER0.isInstance(priorityType)) {
				if (validatePriorityTypeMember0((PriorityTypeMember0)priorityType, null, context)) return true;
			}
			if (Jpdl31Package.Literals.PRIORITY_TYPE_MEMBER1.isInstance(priorityType)) {
				if (validatePriorityTypeMember1((Integer)priorityType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityTypeMember0Object(PriorityTypeMember0 priorityTypeMember0Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityTypeMember1(int priorityTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityTypeMember1Object(Integer priorityTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalTypeObject(SignalType signalTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(Object typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeType_MemberTypes(typeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType_MemberTypes(Object typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Jpdl31Package.Literals.TYPE_TYPE_MEMBER0.isInstance(typeType)) {
				if (validateTypeTypeMember0((String)typeType, tempDiagnostics, context)) return true;
			}
			if (Jpdl31Package.Literals.TYPE_TYPE_MEMBER1.isInstance(typeType)) {
				if (validateTypeTypeMember1((TypeTypeMember1)typeType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Jpdl31Package.Literals.TYPE_TYPE_MEMBER0.isInstance(typeType)) {
				if (validateTypeTypeMember0((String)typeType, null, context)) return true;
			}
			if (Jpdl31Package.Literals.TYPE_TYPE_MEMBER1.isInstance(typeType)) {
				if (validateTypeTypeMember1((TypeTypeMember1)typeType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeMember0(String typeTypeMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeMember1Object(TypeTypeMember1 typeTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Jpdl31Validator

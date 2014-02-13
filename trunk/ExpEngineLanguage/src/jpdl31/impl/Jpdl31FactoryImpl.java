/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31.impl;

import jpdl31.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Jpdl31FactoryImpl extends EFactoryImpl implements Jpdl31Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Jpdl31Factory init() {
		try {
			Jpdl31Factory theJpdl31Factory = (Jpdl31Factory)EPackage.Registry.INSTANCE.getEFactory("urn:jbpm.org:jpdl-3.1"); 
			if (theJpdl31Factory != null) {
				return theJpdl31Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Jpdl31FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jpdl31FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Jpdl31Package.ACTION_TYPE: return createActionType();
			case Jpdl31Package.ASSIGNMENT_TYPE: return createAssignmentType();
			case Jpdl31Package.CANCEL_TIMER_TYPE: return createCancelTimerType();
			case Jpdl31Package.CONDITION_TYPE: return createConditionType();
			case Jpdl31Package.CREATE_TIMER_TYPE: return createCreateTimerType();
			case Jpdl31Package.DECISION_TYPE: return createDecisionType();
			case Jpdl31Package.DELEGATION: return createDelegation();
			case Jpdl31Package.DOCUMENT_ROOT: return createDocumentRoot();
			case Jpdl31Package.END_STATE_TYPE: return createEndStateType();
			case Jpdl31Package.EVENT_TYPE: return createEventType();
			case Jpdl31Package.EXCEPTION_HANDLER_TYPE: return createExceptionHandlerType();
			case Jpdl31Package.FORK_TYPE: return createForkType();
			case Jpdl31Package.JOIN_TYPE: return createJoinType();
			case Jpdl31Package.NODE_TYPE: return createNodeType();
			case Jpdl31Package.PROCESS_DEFINITION_TYPE: return createProcessDefinitionType();
			case Jpdl31Package.PROCESS_STATE_TYPE: return createProcessStateType();
			case Jpdl31Package.SCRIPT_TYPE: return createScriptType();
			case Jpdl31Package.START_STATE_TYPE: return createStartStateType();
			case Jpdl31Package.STATE_TYPE: return createStateType();
			case Jpdl31Package.SUB_PROCESS_TYPE: return createSubProcessType();
			case Jpdl31Package.SUPER_STATE_TYPE: return createSuperStateType();
			case Jpdl31Package.SWIMLANE_TYPE: return createSwimlaneType();
			case Jpdl31Package.TASK_NODE_TYPE: return createTaskNodeType();
			case Jpdl31Package.TASK_TYPE: return createTaskType();
			case Jpdl31Package.TIMER_TYPE: return createTimerType();
			case Jpdl31Package.TRANSITION_TYPE: return createTransitionType();
			case Jpdl31Package.TRANSITION_TYPE1: return createTransitionType1();
			case Jpdl31Package.VARIABLE_TYPE: return createVariableType();
			case Jpdl31Package.ARTEFACT: return createArtefact();
			case Jpdl31Package.MODEL: return createModel();
			case Jpdl31Package.METRIC_INFO: return createMetricInfo();
			case Jpdl31Package.HYPHOTESES: return createHyphoteses();
			case Jpdl31Package.SUBHYPOTHESES: return createSubhypotheses();
			case Jpdl31Package.DEPENDENT_VARIABLE: return createDependentVariable();
			case Jpdl31Package.FACTOR: return createFactor();
			case Jpdl31Package.LEVEL: return createLevel();
			case Jpdl31Package.METRIC: return createMetric();
			case Jpdl31Package.QUESTIONNAIRE: return createQuestionnaire();
			case Jpdl31Package.QUESTION: return createQuestion();
			case Jpdl31Package.ALTERNATIVE: return createAlternative();
			case Jpdl31Package.GOAL: return createGoal();
			case Jpdl31Package.EXPERIMENTAL_PLAN: return createExperimentalPlan();
			case Jpdl31Package.DESIGN: return createDesign();
			case Jpdl31Package.PARAMETER: return createParameter();
			case Jpdl31Package.STATISTICAL_TEST: return createStatisticalTest();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Jpdl31Package.BOOLEAN_TYPE:
				return createBooleanTypeFromString(eDataType, initialValue);
			case Jpdl31Package.CONFIG_TYPE:
				return createConfigTypeFromString(eDataType, initialValue);
			case Jpdl31Package.CONFIG_TYPE_TYPE:
				return createConfigTypeTypeFromString(eDataType, initialValue);
			case Jpdl31Package.CONFIG_TYPE_TYPE1:
				return createConfigTypeType1FromString(eDataType, initialValue);
			case Jpdl31Package.PRIORITY_TYPE_MEMBER0:
				return createPriorityTypeMember0FromString(eDataType, initialValue);
			case Jpdl31Package.SIGNAL_TYPE:
				return createSignalTypeFromString(eDataType, initialValue);
			case Jpdl31Package.TYPE_TYPE_MEMBER1:
				return createTypeTypeMember1FromString(eDataType, initialValue);
			case Jpdl31Package.ARTEFACT_TYPE:
				return createArtefactTypeFromString(eDataType, initialValue);
			case Jpdl31Package.METRIC_TYPE:
				return createMetricTypeFromString(eDataType, initialValue);
			case Jpdl31Package.RELATION_OPERATOR:
				return createRelationOperatorFromString(eDataType, initialValue);
			case Jpdl31Package.ANSWER_TYPE:
				return createAnswerTypeFromString(eDataType, initialValue);
			case Jpdl31Package.DO_ETYPE:
				return createDoETypeFromString(eDataType, initialValue);
			case Jpdl31Package.HYPOTHESIS_TYPE:
				return createHypothesisTypeFromString(eDataType, initialValue);
			case Jpdl31Package.QUESTIONNAIRE_TYPE:
				return createQuestionnaireTypeFromString(eDataType, initialValue);
			case Jpdl31Package.BOOLEAN_TYPE_OBJECT:
				return createBooleanTypeObjectFromString(eDataType, initialValue);
			case Jpdl31Package.CONFIG_TYPE_OBJECT:
				return createConfigTypeObjectFromString(eDataType, initialValue);
			case Jpdl31Package.CONFIG_TYPE_TYPE_OBJECT:
				return createConfigTypeTypeObjectFromString(eDataType, initialValue);
			case Jpdl31Package.CONFIG_TYPE_TYPE_OBJECT1:
				return createConfigTypeTypeObject1FromString(eDataType, initialValue);
			case Jpdl31Package.PRIORITY_TYPE:
				return createPriorityTypeFromString(eDataType, initialValue);
			case Jpdl31Package.PRIORITY_TYPE_MEMBER0_OBJECT:
				return createPriorityTypeMember0ObjectFromString(eDataType, initialValue);
			case Jpdl31Package.PRIORITY_TYPE_MEMBER1:
				return createPriorityTypeMember1FromString(eDataType, initialValue);
			case Jpdl31Package.PRIORITY_TYPE_MEMBER1_OBJECT:
				return createPriorityTypeMember1ObjectFromString(eDataType, initialValue);
			case Jpdl31Package.SIGNAL_TYPE_OBJECT:
				return createSignalTypeObjectFromString(eDataType, initialValue);
			case Jpdl31Package.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case Jpdl31Package.TYPE_TYPE_MEMBER0:
				return createTypeTypeMember0FromString(eDataType, initialValue);
			case Jpdl31Package.TYPE_TYPE_MEMBER1_OBJECT:
				return createTypeTypeMember1ObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Jpdl31Package.BOOLEAN_TYPE:
				return convertBooleanTypeToString(eDataType, instanceValue);
			case Jpdl31Package.CONFIG_TYPE:
				return convertConfigTypeToString(eDataType, instanceValue);
			case Jpdl31Package.CONFIG_TYPE_TYPE:
				return convertConfigTypeTypeToString(eDataType, instanceValue);
			case Jpdl31Package.CONFIG_TYPE_TYPE1:
				return convertConfigTypeType1ToString(eDataType, instanceValue);
			case Jpdl31Package.PRIORITY_TYPE_MEMBER0:
				return convertPriorityTypeMember0ToString(eDataType, instanceValue);
			case Jpdl31Package.SIGNAL_TYPE:
				return convertSignalTypeToString(eDataType, instanceValue);
			case Jpdl31Package.TYPE_TYPE_MEMBER1:
				return convertTypeTypeMember1ToString(eDataType, instanceValue);
			case Jpdl31Package.ARTEFACT_TYPE:
				return convertArtefactTypeToString(eDataType, instanceValue);
			case Jpdl31Package.METRIC_TYPE:
				return convertMetricTypeToString(eDataType, instanceValue);
			case Jpdl31Package.RELATION_OPERATOR:
				return convertRelationOperatorToString(eDataType, instanceValue);
			case Jpdl31Package.ANSWER_TYPE:
				return convertAnswerTypeToString(eDataType, instanceValue);
			case Jpdl31Package.DO_ETYPE:
				return convertDoETypeToString(eDataType, instanceValue);
			case Jpdl31Package.HYPOTHESIS_TYPE:
				return convertHypothesisTypeToString(eDataType, instanceValue);
			case Jpdl31Package.QUESTIONNAIRE_TYPE:
				return convertQuestionnaireTypeToString(eDataType, instanceValue);
			case Jpdl31Package.BOOLEAN_TYPE_OBJECT:
				return convertBooleanTypeObjectToString(eDataType, instanceValue);
			case Jpdl31Package.CONFIG_TYPE_OBJECT:
				return convertConfigTypeObjectToString(eDataType, instanceValue);
			case Jpdl31Package.CONFIG_TYPE_TYPE_OBJECT:
				return convertConfigTypeTypeObjectToString(eDataType, instanceValue);
			case Jpdl31Package.CONFIG_TYPE_TYPE_OBJECT1:
				return convertConfigTypeTypeObject1ToString(eDataType, instanceValue);
			case Jpdl31Package.PRIORITY_TYPE:
				return convertPriorityTypeToString(eDataType, instanceValue);
			case Jpdl31Package.PRIORITY_TYPE_MEMBER0_OBJECT:
				return convertPriorityTypeMember0ObjectToString(eDataType, instanceValue);
			case Jpdl31Package.PRIORITY_TYPE_MEMBER1:
				return convertPriorityTypeMember1ToString(eDataType, instanceValue);
			case Jpdl31Package.PRIORITY_TYPE_MEMBER1_OBJECT:
				return convertPriorityTypeMember1ObjectToString(eDataType, instanceValue);
			case Jpdl31Package.SIGNAL_TYPE_OBJECT:
				return convertSignalTypeObjectToString(eDataType, instanceValue);
			case Jpdl31Package.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case Jpdl31Package.TYPE_TYPE_MEMBER0:
				return convertTypeTypeMember0ToString(eDataType, instanceValue);
			case Jpdl31Package.TYPE_TYPE_MEMBER1_OBJECT:
				return convertTypeTypeMember1ObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionType() {
		ActionTypeImpl actionType = new ActionTypeImpl();
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentType createAssignmentType() {
		AssignmentTypeImpl assignmentType = new AssignmentTypeImpl();
		return assignmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelTimerType createCancelTimerType() {
		CancelTimerTypeImpl cancelTimerType = new CancelTimerTypeImpl();
		return cancelTimerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionType createConditionType() {
		ConditionTypeImpl conditionType = new ConditionTypeImpl();
		return conditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateTimerType createCreateTimerType() {
		CreateTimerTypeImpl createTimerType = new CreateTimerTypeImpl();
		return createTimerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionType createDecisionType() {
		DecisionTypeImpl decisionType = new DecisionTypeImpl();
		return decisionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delegation createDelegation() {
		DelegationImpl delegation = new DelegationImpl();
		return delegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndStateType createEndStateType() {
		EndStateTypeImpl endStateType = new EndStateTypeImpl();
		return endStateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventType() {
		EventTypeImpl eventType = new EventTypeImpl();
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionHandlerType createExceptionHandlerType() {
		ExceptionHandlerTypeImpl exceptionHandlerType = new ExceptionHandlerTypeImpl();
		return exceptionHandlerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkType createForkType() {
		ForkTypeImpl forkType = new ForkTypeImpl();
		return forkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinType createJoinType() {
		JoinTypeImpl joinType = new JoinTypeImpl();
		return joinType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeType() {
		NodeTypeImpl nodeType = new NodeTypeImpl();
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessDefinitionType createProcessDefinitionType() {
		ProcessDefinitionTypeImpl processDefinitionType = new ProcessDefinitionTypeImpl();
		return processDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessStateType createProcessStateType() {
		ProcessStateTypeImpl processStateType = new ProcessStateTypeImpl();
		return processStateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptType createScriptType() {
		ScriptTypeImpl scriptType = new ScriptTypeImpl();
		return scriptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartStateType createStartStateType() {
		StartStateTypeImpl startStateType = new StartStateTypeImpl();
		return startStateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType createStateType() {
		StateTypeImpl stateType = new StateTypeImpl();
		return stateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubProcessType createSubProcessType() {
		SubProcessTypeImpl subProcessType = new SubProcessTypeImpl();
		return subProcessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperStateType createSuperStateType() {
		SuperStateTypeImpl superStateType = new SuperStateTypeImpl();
		return superStateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwimlaneType createSwimlaneType() {
		SwimlaneTypeImpl swimlaneType = new SwimlaneTypeImpl();
		return swimlaneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskNodeType createTaskNodeType() {
		TaskNodeTypeImpl taskNodeType = new TaskNodeTypeImpl();
		return taskNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType createTaskType() {
		TaskTypeImpl taskType = new TaskTypeImpl();
		return taskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerType createTimerType() {
		TimerTypeImpl timerType = new TimerTypeImpl();
		return timerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType createTransitionType() {
		TransitionTypeImpl transitionType = new TransitionTypeImpl();
		return transitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType1 createTransitionType1() {
		TransitionType1Impl transitionType1 = new TransitionType1Impl();
		return transitionType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType createVariableType() {
		VariableTypeImpl variableType = new VariableTypeImpl();
		return variableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artefact createArtefact() {
		ArtefactImpl artefact = new ArtefactImpl();
		return artefact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricInfo createMetricInfo() {
		MetricInfoImpl metricInfo = new MetricInfoImpl();
		return metricInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hyphoteses createHyphoteses() {
		HyphotesesImpl hyphoteses = new HyphotesesImpl();
		return hyphoteses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subhypotheses createSubhypotheses() {
		SubhypothesesImpl subhypotheses = new SubhypothesesImpl();
		return subhypotheses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependentVariable createDependentVariable() {
		DependentVariableImpl dependentVariable = new DependentVariableImpl();
		return dependentVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factor createFactor() {
		FactorImpl factor = new FactorImpl();
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level createLevel() {
		LevelImpl level = new LevelImpl();
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric createMetric() {
		MetricImpl metric = new MetricImpl();
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire createQuestionnaire() {
		QuestionnaireImpl questionnaire = new QuestionnaireImpl();
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alternative createAlternative() {
		AlternativeImpl alternative = new AlternativeImpl();
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentalPlan createExperimentalPlan() {
		ExperimentalPlanImpl experimentalPlan = new ExperimentalPlanImpl();
		return experimentalPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Design createDesign() {
		DesignImpl design = new DesignImpl();
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticalTest createStatisticalTest() {
		StatisticalTestImpl statisticalTest = new StatisticalTestImpl();
		return statisticalTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType createBooleanTypeFromString(EDataType eDataType, String initialValue) {
		BooleanType result = BooleanType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigType createConfigTypeFromString(EDataType eDataType, String initialValue) {
		ConfigType result = ConfigType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfigTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigTypeType createConfigTypeTypeFromString(EDataType eDataType, String initialValue) {
		ConfigTypeType result = ConfigTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfigTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigTypeType1 createConfigTypeType1FromString(EDataType eDataType, String initialValue) {
		ConfigTypeType1 result = ConfigTypeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfigTypeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityTypeMember0 createPriorityTypeMember0FromString(EDataType eDataType, String initialValue) {
		PriorityTypeMember0 result = PriorityTypeMember0.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorityTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalType createSignalTypeFromString(EDataType eDataType, String initialValue) {
		SignalType result = SignalType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeTypeMember1 createTypeTypeMember1FromString(EDataType eDataType, String initialValue) {
		TypeTypeMember1 result = TypeTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtefactType createArtefactTypeFromString(EDataType eDataType, String initialValue) {
		ArtefactType result = ArtefactType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtefactTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricType createMetricTypeFromString(EDataType eDataType, String initialValue) {
		MetricType result = MetricType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetricTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationOperator createRelationOperatorFromString(EDataType eDataType, String initialValue) {
		RelationOperator result = RelationOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerType createAnswerTypeFromString(EDataType eDataType, String initialValue) {
		AnswerType result = AnswerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnswerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoEType createDoETypeFromString(EDataType eDataType, String initialValue) {
		DoEType result = DoEType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoETypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypothesisType createHypothesisTypeFromString(EDataType eDataType, String initialValue) {
		HypothesisType result = HypothesisType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHypothesisTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireType createQuestionnaireTypeFromString(EDataType eDataType, String initialValue) {
		QuestionnaireType result = QuestionnaireType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType createBooleanTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBooleanTypeFromString(Jpdl31Package.Literals.BOOLEAN_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBooleanTypeToString(Jpdl31Package.Literals.BOOLEAN_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigType createConfigTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createConfigTypeFromString(Jpdl31Package.Literals.CONFIG_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfigTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConfigTypeToString(Jpdl31Package.Literals.CONFIG_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigTypeType createConfigTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createConfigTypeTypeFromString(Jpdl31Package.Literals.CONFIG_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfigTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConfigTypeTypeToString(Jpdl31Package.Literals.CONFIG_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigTypeType1 createConfigTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createConfigTypeType1FromString(Jpdl31Package.Literals.CONFIG_TYPE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfigTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertConfigTypeType1ToString(Jpdl31Package.Literals.CONFIG_TYPE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createPriorityTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createPriorityTypeMember0FromString(Jpdl31Package.Literals.PRIORITY_TYPE_MEMBER0, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createPriorityTypeMember1FromString(Jpdl31Package.Literals.PRIORITY_TYPE_MEMBER1, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorityTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Jpdl31Package.Literals.PRIORITY_TYPE_MEMBER0.isInstance(instanceValue)) {
			try {
				String value = convertPriorityTypeMember0ToString(Jpdl31Package.Literals.PRIORITY_TYPE_MEMBER0, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Jpdl31Package.Literals.PRIORITY_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertPriorityTypeMember1ToString(Jpdl31Package.Literals.PRIORITY_TYPE_MEMBER1, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityTypeMember0 createPriorityTypeMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createPriorityTypeMember0FromString(Jpdl31Package.Literals.PRIORITY_TYPE_MEMBER0, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorityTypeMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPriorityTypeMember0ToString(Jpdl31Package.Literals.PRIORITY_TYPE_MEMBER0, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createPriorityTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorityTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createPriorityTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createPriorityTypeMember1FromString(Jpdl31Package.Literals.PRIORITY_TYPE_MEMBER1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorityTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPriorityTypeMember1ToString(Jpdl31Package.Literals.PRIORITY_TYPE_MEMBER1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalType createSignalTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSignalTypeFromString(Jpdl31Package.Literals.SIGNAL_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignalTypeToString(Jpdl31Package.Literals.SIGNAL_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTypeTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTypeTypeMember0FromString(Jpdl31Package.Literals.TYPE_TYPE_MEMBER0, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTypeTypeMember1FromString(Jpdl31Package.Literals.TYPE_TYPE_MEMBER1, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Jpdl31Package.Literals.TYPE_TYPE_MEMBER0.isInstance(instanceValue)) {
			try {
				String value = convertTypeTypeMember0ToString(Jpdl31Package.Literals.TYPE_TYPE_MEMBER0, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Jpdl31Package.Literals.TYPE_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertTypeTypeMember1ToString(Jpdl31Package.Literals.TYPE_TYPE_MEMBER1, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeTypeMember0FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeTypeMember1 createTypeTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeTypeMember1FromString(Jpdl31Package.Literals.TYPE_TYPE_MEMBER1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeMember1ToString(Jpdl31Package.Literals.TYPE_TYPE_MEMBER1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jpdl31Package getJpdl31Package() {
		return (Jpdl31Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Jpdl31Package getPackage() {
		return Jpdl31Package.eINSTANCE;
	}

} //Jpdl31FactoryImpl

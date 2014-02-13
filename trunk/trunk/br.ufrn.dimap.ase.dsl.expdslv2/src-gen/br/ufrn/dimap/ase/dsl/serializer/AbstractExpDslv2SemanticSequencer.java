package br.ufrn.dimap.ase.dsl.serializer;

import br.ufrn.dimap.ase.dsl.expDslv2.Activity;
import br.ufrn.dimap.ase.dsl.expDslv2.ActivityMetric;
import br.ufrn.dimap.ase.dsl.expDslv2.Alternatives;
import br.ufrn.dimap.ase.dsl.expDslv2.Artefact;
import br.ufrn.dimap.ase.dsl.expDslv2.CollectedData;
import br.ufrn.dimap.ase.dsl.expDslv2.DataMetric;
import br.ufrn.dimap.ase.dsl.expDslv2.DependentVariable;
import br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package;
import br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement;
import br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan;
import br.ufrn.dimap.ase.dsl.expDslv2.Factor;
import br.ufrn.dimap.ase.dsl.expDslv2.Goal;
import br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses;
import br.ufrn.dimap.ase.dsl.expDslv2.Levels;
import br.ufrn.dimap.ase.dsl.expDslv2.Metrics;
import br.ufrn.dimap.ase.dsl.expDslv2.Model;
import br.ufrn.dimap.ase.dsl.expDslv2.Parameter;
import br.ufrn.dimap.ase.dsl.expDslv2.Question;
import br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire;
import br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses;
import br.ufrn.dimap.ase.dsl.expDslv2.Task;
import br.ufrn.dimap.ase.dsl.expDslv2.TaskMetric;
import br.ufrn.dimap.ase.dsl.services.ExpDslv2GrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractExpDslv2SemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected ExpDslv2GrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ExpDslv2Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExpDslv2Package.ACTIVITY:
				if(context == grammarAccess.getActivityRule()) {
					sequence_Activity(context, (Activity) semanticObject); 
					return; 
				}
				else break;
			case ExpDslv2Package.ACTIVITY_METRIC:
				if(context == grammarAccess.getActivityMetricRule() ||
				   context == grammarAccess.getDetailRule() ||
				   context == grammarAccess.getTimeMetricRule()) {
					sequence_ActivityMetric(context, (ActivityMetric) semanticObject); 
					return; 
				}
				else break;
			case ExpDslv2Package.ALTERNATIVES:
				if(context == grammarAccess.getAlternativesRule()) {
					sequence_Alternatives(context, (Alternatives) semanticObject); 
					return; 
				}
				else break;
			case ExpDslv2Package.ARTEFACT:
				if(context == grammarAccess.getArtefactRule()) {
					sequence_Artefact(context, (Artefact) semanticObject); 
					return; 
				}
				else break;
			case ExpDslv2Package.COLLECTED_DATA:
				if(context == grammarAccess.getCollectedDataRule()) {
					sequence_CollectedData(context, (CollectedData) semanticObject); 
					return; 
				}
				else break;
			case ExpDslv2Package.DATA_METRIC:
				if(context == grammarAccess.getDataMetricRule() ||
				   context == grammarAccess.getDetailRule()) {
					sequence_DataMetric(context, (DataMetric) semanticObject); 
					return; 
				}
				else break;
			case ExpDslv2Package.DEPENDENT_VARIABLE:
				if(context == grammarAccess.getDependentVariableRule()) {
					sequence_DependentVariable(context, (DependentVariable) semanticObject); 
					return; 
				}
				else break;
			case ExpDslv2Package.EXPERIMENT_ELEMENT:
				if(context == grammarAccess.getExperimentElementRule()) {
					sequence_ExperimentElement(context, (ExperimentElement) semanticObject); 
					return; 
				}
				else break;
			case ExpDslv2Package.EXPERIMENTAL_PLAN:
				if(context == grammarAccess.getExperimentalPlanRule()) {
					sequence_ExperimentalPlan(context, (ExperimentalPlan) semanticObject); 
					return; 
				}
				else break;
			case ExpDslv2Package.FACTOR:
				if(context == grammarAccess.getFactorRule()) {
					sequence_Factor(context, (Factor) semanticObject); 
					return; 
				}
				else break;
			case ExpDslv2Package.GOAL:
				if(context == grammarAccess.getGoalRule()) {
					sequence_Goal(context, (Goal) semanticObject); 
					return; 
				}
				else break;
			case ExpDslv2Package.HYPOTHESES:
				if(context == grammarAccess.getHypothesesRule()) {
					sequence_Hypotheses(context, (Hypotheses) semanticObject); 
					return; 
				}
				else break;
			case ExpDslv2Package.LEVELS:
				if(context == grammarAccess.getLevelsRule()) {
					sequence_Levels(context, (Levels) semanticObject); 
					return; 
				}
				else break;
			case ExpDslv2Package.METRICS:
				if(context == grammarAccess.getMetricsRule()) {
					sequence_Metrics(context, (Metrics) semanticObject); 
					return; 
				}
				else break;
			case ExpDslv2Package.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ExpDslv2Package.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case ExpDslv2Package.PROCESS:
				if(context == grammarAccess.getProcessRule()) {
					sequence_Process(context, (br.ufrn.dimap.ase.dsl.expDslv2.Process) semanticObject); 
					return; 
				}
				else break;
			case ExpDslv2Package.QUESTION:
				if(context == grammarAccess.getQuestionRule()) {
					sequence_Question(context, (Question) semanticObject); 
					return; 
				}
				else break;
			case ExpDslv2Package.QUESTIONNAIRE:
				if(context == grammarAccess.getQuestionnaireRule()) {
					sequence_Questionnaire(context, (Questionnaire) semanticObject); 
					return; 
				}
				else break;
			case ExpDslv2Package.SUBHYPOTHESES:
				if(context == grammarAccess.getSubhypothesesRule()) {
					sequence_Subhypotheses(context, (Subhypotheses) semanticObject); 
					return; 
				}
				else break;
			case ExpDslv2Package.TASK:
				if(context == grammarAccess.getTaskRule()) {
					sequence_Task(context, (Task) semanticObject); 
					return; 
				}
				else break;
			case ExpDslv2Package.TASK_METRIC:
				if(context == grammarAccess.getDetailRule() ||
				   context == grammarAccess.getTaskMetricRule() ||
				   context == grammarAccess.getTimeMetricRule()) {
					sequence_TaskMetric(context, (TaskMetric) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (activityBegin=[Activity|QualifiedName] activityEnd=[Activity|QualifiedName]?)
	 *
	 * Features:
	 *    activityBegin[1, 1]
	 *    activityEnd[0, 1]
	 */
	protected void sequence_ActivityMetric(EObject context, ActivityMetric semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING 
	 *         next+=[Activity|QualifiedName]* 
	 *         role+=RoleType* 
	 *         collectData+=[CollectedData|QualifiedName]* 
	 *         artefacts+=Artefact* 
	 *         questionnaire+=[Questionnaire|QualifiedName]* 
	 *         tasks+=Task*
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    description[1, 1]
	 *    next[0, *]
	 *    role[0, *]
	 *    collectData[0, *]
	 *    artefacts[0, *]
	 *    questionnaire[0, *]
	 *    tasks[0, *]
	 */
	protected void sequence_Activity(EObject context, Activity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     description=STRING
	 *
	 * Features:
	 *    description[1, 1]
	 */
	protected void sequence_Alternatives(EObject context, Alternatives semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpDslv2Package.Literals.ALTERNATIVES__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpDslv2Package.Literals.ALTERNATIVES__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlternativesAccess().getDescriptionSTRINGTerminalRuleCall_1_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING type=ArtefactType)
	 *
	 * Features:
	 *    name[1, 1]
	 *    description[1, 1]
	 *    type[1, 1]
	 */
	protected void sequence_Artefact(EObject context, Artefact semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpDslv2Package.Literals.ARTEFACT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpDslv2Package.Literals.ARTEFACT__NAME));
			if(transientValues.isValueTransient(semanticObject, ExpDslv2Package.Literals.ARTEFACT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpDslv2Package.Literals.ARTEFACT__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, ExpDslv2Package.Literals.ARTEFACT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpDslv2Package.Literals.ARTEFACT__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArtefactAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getArtefactAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getArtefactAccess().getTypeArtefactTypeEnumRuleCall_4_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_CollectedData(EObject context, CollectedData semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpDslv2Package.Literals.COLLECTED_DATA__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpDslv2Package.Literals.COLLECTED_DATA__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCollectedDataAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((collectedData+=CollectedData* dataType+=DataType)? artefacts+=[Artefact|QualifiedName]* questionnaires+=[Questionnaire|QualifiedName]*)
	 *
	 * Features:
	 *    collectedData[0, *]
	 *         EXCLUDE_IF_UNSET dataType
	 *    dataType[0, 1]
	 *         MANDATORY_IF_SET collectedData
	 *    artefacts[0, *]
	 *    questionnaires[0, *]
	 */
	protected void sequence_DataMetric(EObject context, DataMetric semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING metrics+=[Metrics|QualifiedName]*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    description[1, 1]
	 *    metrics[0, *]
	 */
	protected void sequence_DependentVariable(EObject context, DependentVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING process+=Process* metrics+=Metrics* experiments+=ExperimentalPlan* questionnaire+=Questionnaire*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    process[0, *]
	 *    metrics[0, *]
	 *    experiments[0, *]
	 *    questionnaire[0, *]
	 */
	protected void sequence_ExperimentElement(EObject context, ExperimentElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         goal+=Goal* 
	 *         hypotheses+=Hypotheses* 
	 *         type=DesignType 
	 *         parameter+=Parameter* 
	 *         dependentVariable+=DependentVariable* 
	 *         factor+=Factor* 
	 *         (tosubhypotheses+=[Subhypotheses|QualifiedName]* Technique+=AnalysisTechiqueType*)* 
	 *         internalReplication=INT
	 *     )
	 *
	 * Features:
	 *    goal[0, *]
	 *    hypotheses[0, *]
	 *    type[1, 1]
	 *    parameter[0, *]
	 *    dependentVariable[0, *]
	 *    factor[0, *]
	 *    tosubhypotheses[0, *]
	 *    Technique[0, *]
	 *    internalReplication[1, 1]
	 */
	protected void sequence_ExperimentalPlan(EObject context, ExperimentalPlan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (isDesiredVariation='True' | isDesiredVariation='False') level+=Levels*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    isDesiredVariation[0, 2]
	 *    level[0, *]
	 */
	protected void sequence_Factor(EObject context, Factor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING)
	 *
	 * Features:
	 *    name[1, 1]
	 *    description[1, 1]
	 */
	protected void sequence_Goal(EObject context, Goal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpDslv2Package.Literals.GOAL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpDslv2Package.Literals.GOAL__NAME));
			if(transientValues.isValueTransient(semanticObject, ExpDslv2Package.Literals.GOAL__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpDslv2Package.Literals.GOAL__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGoalAccess().getDescriptionSTRINGTerminalRuleCall_1_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING type=HypothesisType fromGoal=[Goal|QualifiedName] subhypotheses+=Subhypotheses*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    description[1, 1]
	 *    type[1, 1]
	 *    fromGoal[1, 1]
	 *    subhypotheses[0, *]
	 */
	protected void sequence_Hypotheses(EObject context, Hypotheses semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_Levels(EObject context, Levels semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpDslv2Package.Literals.LEVELS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpDslv2Package.Literals.LEVELS__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLevelsAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID relatesTo=[Process|ID] description=STRING detail+=Detail)
	 *
	 * Features:
	 *    name[1, 1]
	 *    relatesTo[1, 1]
	 *    description[1, 1]
	 *    detail[1, 1]
	 */
	protected void sequence_Metrics(EObject context, Metrics semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=ExperimentElement*
	 *
	 * Features:
	 *    elements[0, *]
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=ID value=STRING)
	 *
	 * Features:
	 *    variable[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpDslv2Package.Literals.PARAMETER__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpDslv2Package.Literals.PARAMETER__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, ExpDslv2Package.Literals.PARAMETER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpDslv2Package.Literals.PARAMETER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getVariableIDTerminalRuleCall_1_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getParameterAccess().getValueSTRINGTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID treatment+=[Levels|QualifiedName]* role+=RoleType* activities+=Activity*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    treatment[0, *]
	 *    role[0, *]
	 *    activities[0, *]
	 */
	protected void sequence_Process(EObject context, br.ufrn.dimap.ase.dsl.expDslv2.Process semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING type=AnswerType req=INT? alternatives+=Alternatives*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    description[1, 1]
	 *    type[1, 1]
	 *    req[0, 1]
	 *    alternatives[0, *]
	 */
	protected void sequence_Question(EObject context, Question semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID relatesTo+=[Process|ID]* questionnaireType=QuestionnaireType? question+=Question*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    relatesTo[0, *]
	 *    questionnaireType[0, 1]
	 *    question[0, *]
	 */
	protected void sequence_Questionnaire(EObject context, Questionnaire semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             name=ID 
	 *             dependentVariable+=[DependentVariable|QualifiedName] 
	 *             levels+=[Levels|QualifiedName]* 
	 *             operator=OperatorType 
	 *             dependentVariable+=[DependentVariable|QualifiedName] 
	 *             levels+=[Levels|QualifiedName]*
	 *         ) | 
	 *         (name=ID dependentVariable+=[DependentVariable|QualifiedName] relation=RelationType factor+=[Factor|QualifiedName]*)
	 *     )
	 *
	 * Features:
	 *    name[0, 2]
	 *    dependentVariable[0, 3]
	 *    levels[0, *]
	 *         EXCLUDE_IF_UNSET name
	 *         EXCLUDE_IF_UNSET dependentVariable
	 *         EXCLUDE_IF_UNSET operator
	 *         EXCLUDE_IF_UNSET dependentVariable
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dependentVariable
	 *         EXCLUDE_IF_SET relation
	 *         EXCLUDE_IF_SET factor
	 *    operator[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_UNSET dependentVariable
	 *         MANDATORY_IF_SET dependentVariable
	 *         MANDATORY_IF_SET levels
	 *         EXCLUDE_IF_UNSET dependentVariable
	 *         MANDATORY_IF_SET dependentVariable
	 *         MANDATORY_IF_SET levels
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dependentVariable
	 *         EXCLUDE_IF_SET relation
	 *         EXCLUDE_IF_SET factor
	 *    relation[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_UNSET dependentVariable
	 *         MANDATORY_IF_SET dependentVariable
	 *         MANDATORY_IF_SET factor
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dependentVariable
	 *         EXCLUDE_IF_SET levels
	 *         EXCLUDE_IF_SET operator
	 *         EXCLUDE_IF_SET dependentVariable
	 *         EXCLUDE_IF_SET levels
	 *    factor[0, *]
	 *         EXCLUDE_IF_UNSET name
	 *         EXCLUDE_IF_UNSET dependentVariable
	 *         EXCLUDE_IF_UNSET relation
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dependentVariable
	 *         EXCLUDE_IF_SET levels
	 *         EXCLUDE_IF_SET operator
	 *         EXCLUDE_IF_SET dependentVariable
	 *         EXCLUDE_IF_SET levels
	 */
	protected void sequence_Subhypotheses(EObject context, Subhypotheses semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tasks+=[Task|QualifiedName]*)
	 *
	 * Features:
	 *    tasks[0, *]
	 */
	protected void sequence_TaskMetric(EObject context, TaskMetric semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING var+=[CollectedData|QualifiedName]* artefacts+=Artefact* questionnaire+=[Questionnaire|QualifiedName]*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    description[1, 1]
	 *    var[0, *]
	 *    artefacts[0, *]
	 *    questionnaire[0, *]
	 */
	protected void sequence_Task(EObject context, Task semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

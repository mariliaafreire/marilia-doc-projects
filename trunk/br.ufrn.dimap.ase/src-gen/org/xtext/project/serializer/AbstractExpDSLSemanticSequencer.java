package org.xtext.project.serializer;

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
import org.xtext.project.expDSL.Activity;
import org.xtext.project.expDSL.ActivityMetric;
import org.xtext.project.expDSL.Alternatives;
import org.xtext.project.expDSL.Artefact;
import org.xtext.project.expDSL.ArtefactMetric;
import org.xtext.project.expDSL.ExpDSLPackage;
import org.xtext.project.expDSL.ExperimentElement;
import org.xtext.project.expDSL.ExperimentalPlan;
import org.xtext.project.expDSL.Factor;
import org.xtext.project.expDSL.Levels;
import org.xtext.project.expDSL.Link;
import org.xtext.project.expDSL.Metrics;
import org.xtext.project.expDSL.Model;
import org.xtext.project.expDSL.Parameter;
import org.xtext.project.expDSL.Question;
import org.xtext.project.expDSL.Questionnaire;
import org.xtext.project.expDSL.Role;
import org.xtext.project.expDSL.Task;
import org.xtext.project.expDSL.TaskMetric;
import org.xtext.project.services.ExpDSLGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractExpDSLSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected ExpDSLGrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == ExpDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExpDSLPackage.ACTIVITY:
				if(context == grammarAccess.getActivityRule()) {
					sequence_Activity(context, (Activity) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.ACTIVITY_METRIC:
				if(context == grammarAccess.getActivityMetricRule() ||
				   context == grammarAccess.getDetailRule()) {
					sequence_ActivityMetric(context, (ActivityMetric) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.ALTERNATIVES:
				if(context == grammarAccess.getAlternativesRule()) {
					sequence_Alternatives(context, (Alternatives) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.ARTEFACT:
				if(context == grammarAccess.getArtefactRule()) {
					sequence_Artefact(context, (Artefact) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.ARTEFACT_METRIC:
				if(context == grammarAccess.getArtefactMetricRule() ||
				   context == grammarAccess.getDetailRule()) {
					sequence_ArtefactMetric(context, (ArtefactMetric) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.EXPERIMENT_ELEMENT:
				if(context == grammarAccess.getExperimentElementRule()) {
					sequence_ExperimentElement(context, (ExperimentElement) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.EXPERIMENTAL_PLAN:
				if(context == grammarAccess.getExperimentalPlanRule()) {
					sequence_ExperimentalPlan(context, (ExperimentalPlan) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.FACTOR:
				if(context == grammarAccess.getFactorRule()) {
					sequence_Factor(context, (Factor) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.LEVELS:
				if(context == grammarAccess.getLevelsRule()) {
					sequence_Levels(context, (Levels) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.LINK:
				if(context == grammarAccess.getLinkRule()) {
					sequence_Link(context, (Link) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.METRICS:
				if(context == grammarAccess.getMetricsRule()) {
					sequence_Metrics(context, (Metrics) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.PROCESS:
				if(context == grammarAccess.getProcessRule()) {
					sequence_Process(context, (org.xtext.project.expDSL.Process) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.QUESTION:
				if(context == grammarAccess.getQuestionRule()) {
					sequence_Question(context, (Question) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.QUESTIONNAIRE:
				if(context == grammarAccess.getQuestionnaireRule()) {
					sequence_Questionnaire(context, (Questionnaire) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.ROLE:
				if(context == grammarAccess.getRoleRule()) {
					sequence_Role(context, (Role) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.TASK:
				if(context == grammarAccess.getTaskRule()) {
					sequence_Task(context, (Task) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.TASK_METRIC:
				if(context == grammarAccess.getDetailRule() ||
				   context == grammarAccess.getTaskMetricRule()) {
					sequence_TaskMetric(context, (TaskMetric) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (activityBegin=[Activity|STRING] activityEnd=[Activity|STRING]?)
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
	 *         name=STRING 
	 *         description=STRING 
	 *         next+=[Activity|STRING]? 
	 *         artefacts+=Artefact? 
	 *         role+=Role? 
	 *         tasks+=Task*
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    description[1, 1]
	 *    next[0, 1]
	 *    artefacts[0, 1]
	 *    role[0, 1]
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
			if(transientValues.isValueTransient(semanticObject, ExpDSLPackage.Literals.ALTERNATIVES__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpDSLPackage.Literals.ALTERNATIVES__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlternativesAccess().getDescriptionSTRINGTerminalRuleCall_1_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING artefacts=[Artefact|STRING]*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    artefacts[0, *]
	 */
	protected void sequence_ArtefactMetric(EObject context, ArtefactMetric semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING description=STRING type=ArtefactType)
	 *
	 * Features:
	 *    name[1, 1]
	 *    description[1, 1]
	 *    type[1, 1]
	 */
	protected void sequence_Artefact(EObject context, Artefact semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpDSLPackage.Literals.ARTEFACT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpDSLPackage.Literals.ARTEFACT__NAME));
			if(transientValues.isValueTransient(semanticObject, ExpDSLPackage.Literals.ARTEFACT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpDSLPackage.Literals.ARTEFACT__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, ExpDSLPackage.Literals.ARTEFACT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpDSLPackage.Literals.ARTEFACT__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArtefactAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getArtefactAccess().getDescriptionSTRINGTerminalRuleCall_3_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getArtefactAccess().getTypeArtefactTypeEnumRuleCall_5_0(), semanticObject.getType());
		feeder.finish();
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
	 *         name=STRING 
	 *         type=DesignType 
	 *         parameter+=Parameter* 
	 *         factor+=Factor* 
	 *         internalReplication=INT 
	 *         link+=Link*
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 *    parameter[0, *]
	 *    factor[0, *]
	 *    internalReplication[1, 1]
	 *    link[0, *]
	 */
	protected void sequence_ExperimentalPlan(EObject context, ExperimentalPlan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING (isDesiredVariation='True' | isDesiredVariation='False') level+=Levels*)
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
	 *     name=STRING
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_Levels(EObject context, Levels semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpDSLPackage.Literals.LEVELS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpDSLPackage.Literals.LEVELS__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLevelsAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (procedure+=[Process|STRING] treatment+=[Levels|STRING]*)
	 *
	 * Features:
	 *    procedure[1, 1]
	 *    treatment[0, *]
	 */
	protected void sequence_Link(EObject context, Link semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         relatesTo=[Process|STRING] 
	 *         description=STRING 
	 *         form=ColectType? 
	 *         unit=MetricUnit? 
	 *         detail+=Detail
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    relatesTo[1, 1]
	 *    description[1, 1]
	 *    form[0, 1]
	 *    unit[0, 1]
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
	 *     (variable=STRING value=STRING)
	 *
	 * Features:
	 *    variable[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpDSLPackage.Literals.PARAMETER__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpDSLPackage.Literals.PARAMETER__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, ExpDSLPackage.Literals.PARAMETER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpDSLPackage.Literals.PARAMETER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getVariableSTRINGTerminalRuleCall_1_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getParameterAccess().getValueSTRINGTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING activities+=Activity*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    activities[0, *]
	 */
	protected void sequence_Process(EObject context, org.xtext.project.expDSL.Process semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING description=STRING type=AnswerType req=INT? alternatives+=Alternatives*)
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
	 *     (name=STRING relatesTo+=[Process|STRING]* questionnaireType=QuestionnaireType question+=Question*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    relatesTo[0, *]
	 *    questionnaireType[1, 1]
	 *    question[0, *]
	 */
	protected void sequence_Questionnaire(EObject context, Questionnaire semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_Role(EObject context, Role semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpDSLPackage.Literals.ROLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpDSLPackage.Literals.ROLE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRoleAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     tasks+=[Task|STRING]+
	 *
	 * Features:
	 *    tasks[1, *]
	 */
	protected void sequence_TaskMetric(EObject context, TaskMetric semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING description=STRING artefacts+=Artefact* role+=Role?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    description[1, 1]
	 *    artefacts[0, *]
	 *    role[0, 1]
	 */
	protected void sequence_Task(EObject context, Task semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

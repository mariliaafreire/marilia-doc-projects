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
import org.xtext.project.expDSL.ExpDSLPackage;
import org.xtext.project.expDSL.ExperimentElement;
import org.xtext.project.expDSL.ExperimentalPlan;
import org.xtext.project.expDSL.Factor;
import org.xtext.project.expDSL.Levels;
import org.xtext.project.expDSL.Model;
import org.xtext.project.expDSL.Question;
import org.xtext.project.expDSL.Questions;
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
					sequence_Activity_Activity(context, (Activity) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.ACTIVITY_METRIC:
				if(context == grammarAccess.getMetricsRule() ||
				   context == grammarAccess.getActivityMetricRule()) {
					sequence_ActivityMetric_ActivityMetric(context, (ActivityMetric) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.ALTERNATIVES:
				if(context == grammarAccess.getAlternativesRule()) {
					sequence_Alternatives_Alternatives(context, (Alternatives) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.EXPERIMENT_ELEMENT:
				if(context == grammarAccess.getExperimentElementRule()) {
					sequence_ExperimentElement_ExperimentElement(context, (ExperimentElement) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.EXPERIMENTAL_PLAN:
				if(context == grammarAccess.getExperimentalPlanRule()) {
					sequence_ExperimentalPlan_ExperimentalPlan(context, (ExperimentalPlan) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.FACTOR:
				if(context == grammarAccess.getFactorRule()) {
					sequence_Factor_Factor(context, (Factor) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.LEVELS:
				if(context == grammarAccess.getLevelsRule()) {
					sequence_Levels_Levels(context, (Levels) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.PROCESS:
				if(context == grammarAccess.getProcessRule()) {
					sequence_Process_Process(context, (org.xtext.project.expDSL.Process) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.QUESTION:
				if(context == grammarAccess.getQuestionRule()) {
					sequence_Question_Question(context, (Question) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.QUESTIONS:
				if(context == grammarAccess.getQuestionsRule()) {
					sequence_Questions_Questions(context, (Questions) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.ROLE:
				if(context == grammarAccess.getRoleRule()) {
					sequence_Role_Role(context, (Role) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.TASK:
				if(context == grammarAccess.getTaskRule()) {
					sequence_Task_Task(context, (Task) semanticObject); 
					return; 
				}
				else break;
			case ExpDSLPackage.TASK_METRIC:
				if(context == grammarAccess.getMetricsRule() ||
				   context == grammarAccess.getTaskMetricRule()) {
					sequence_TaskMetric_TaskMetric(context, (TaskMetric) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         processName+=STRING* 
	 *         description=STRING 
	 *         type=MetricType 
	 *         form=ColectType? 
	 *         id=STRING 
	 *         unit=MetricUnit? 
	 *         activityBegin=STRING 
	 *         activityEnd=STRING
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    processName[0, *]
	 *    description[1, 1]
	 *    type[1, 1]
	 *    form[0, 1]
	 *    id[1, 1]
	 *    unit[0, 1]
	 *    activityBegin[1, 1]
	 *    activityEnd[1, 1]
	 */
	protected void sequence_ActivityMetric_ActivityMetric(EObject context, ActivityMetric semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID name=STRING next+=ID? role+=Role* tasks+=Task*)
	 *
	 * Features:
	 *    id[1, 1]
	 *    name[1, 1]
	 *    next[0, 1]
	 *    role[0, *]
	 *    tasks[0, *]
	 */
	protected void sequence_Activity_Activity(EObject context, Activity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     description=STRING
	 *
	 * Features:
	 *    description[1, 1]
	 */
	protected void sequence_Alternatives_Alternatives(EObject context, Alternatives semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpDSLPackage.Literals.ALTERNATIVES__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpDSLPackage.Literals.ALTERNATIVES__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlternativesAccess().getDescriptionSTRINGTerminalRuleCall_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (process+=Process* experiments+=ExperimentalPlan* question+=Question*)
	 *
	 * Features:
	 *    process[0, *]
	 *    experiments[0, *]
	 *    question[0, *]
	 */
	protected void sequence_ExperimentElement_ExperimentElement(EObject context, ExperimentElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING type=DesignType factor+=Factor*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 *    factor[0, *]
	 */
	protected void sequence_ExperimentalPlan_ExperimentalPlan(EObject context, ExperimentalPlan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING level+=Levels*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    level[0, *]
	 */
	protected void sequence_Factor_Factor(EObject context, Factor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_Levels_Levels(EObject context, Levels semanticObject) {
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
	 *     elements+=ExperimentElement*
	 *
	 * Features:
	 *    elements[0, *]
	 */
	protected void sequence_Model_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING activities+=Activity* metrics+=Metrics* question+=Question*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    activities[0, *]
	 *    metrics[0, *]
	 *    question[0, *]
	 */
	protected void sequence_Process_Process(EObject context, org.xtext.project.expDSL.Process semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         description=STRING 
	 *         type=AnswerType 
	 *         id=ID 
	 *         req=INT? 
	 *         alternatives+=Alternatives*
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    description[1, 1]
	 *    type[1, 1]
	 *    id[1, 1]
	 *    req[0, 1]
	 *    alternatives[0, *]
	 */
	protected void sequence_Question_Question(EObject context, Question semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     question+=Question*
	 *
	 * Features:
	 *    question[0, *]
	 */
	protected void sequence_Questions_Questions(EObject context, Questions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_Role_Role(EObject context, Role semanticObject) {
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
	 *     (
	 *         name=STRING 
	 *         processName+=STRING* 
	 *         description=STRING 
	 *         type=MetricType 
	 *         form=ColectType? 
	 *         id=STRING 
	 *         unit=MetricUnit? 
	 *         activities=STRING
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    processName[0, *]
	 *    description[1, 1]
	 *    type[1, 1]
	 *    form[0, 1]
	 *    id[1, 1]
	 *    unit[0, 1]
	 *    activities[1, 1]
	 */
	protected void sequence_TaskMetric_TaskMetric(EObject context, TaskMetric semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_Task_Task(EObject context, Task semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpDSLPackage.Literals.TASK__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpDSLPackage.Literals.TASK__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTaskAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
}

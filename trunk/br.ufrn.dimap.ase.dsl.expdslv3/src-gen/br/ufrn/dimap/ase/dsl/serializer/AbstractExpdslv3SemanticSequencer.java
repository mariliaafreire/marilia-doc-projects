package br.ufrn.dimap.ase.dsl.serializer;

import br.ufrn.dimap.ase.dsl.expdslv3.Alternatives;
import br.ufrn.dimap.ase.dsl.expdslv3.Artefact;
import br.ufrn.dimap.ase.dsl.expdslv3.Author;
import br.ufrn.dimap.ase.dsl.expdslv3.CRB;
import br.ufrn.dimap.ase.dsl.expdslv3.DepVariable;
import br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package;
import br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement;
import br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign;
import br.ufrn.dimap.ase.dsl.expdslv3.Factor;
import br.ufrn.dimap.ase.dsl.expdslv3.Keyword;
import br.ufrn.dimap.ase.dsl.expdslv3.LS;
import br.ufrn.dimap.ase.dsl.expdslv3.Metric;
import br.ufrn.dimap.ase.dsl.expdslv3.Model;
import br.ufrn.dimap.ase.dsl.expdslv3.Parameter;
import br.ufrn.dimap.ase.dsl.expdslv3.Question;
import br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire;
import br.ufrn.dimap.ase.dsl.expdslv3.RCBD;
import br.ufrn.dimap.ase.dsl.expdslv3.Range;
import br.ufrn.dimap.ase.dsl.expdslv3.ResearchHypothesis;
import br.ufrn.dimap.ase.dsl.expdslv3.ResearchQuestion;
import br.ufrn.dimap.ase.dsl.expdslv3.SimpleAbstract;
import br.ufrn.dimap.ase.dsl.expdslv3.SimpleGoal;
import br.ufrn.dimap.ase.dsl.expdslv3.StructuredAbstract;
import br.ufrn.dimap.ase.dsl.expdslv3.StructuredGoal;
import br.ufrn.dimap.ase.dsl.expdslv3.Task;
import br.ufrn.dimap.ase.dsl.expdslv3.Variable;
import br.ufrn.dimap.ase.dsl.services.Expdslv3GrammarAccess;
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
public class AbstractExpdslv3SemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected Expdslv3GrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == Expdslv3Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Expdslv3Package.ALTERNATIVES:
				if(context == grammarAccess.getAlternativesRule()) {
					sequence_Alternatives(context, (Alternatives) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.ARTEFACT:
				if(context == grammarAccess.getArtefactRule()) {
					sequence_Artefact(context, (Artefact) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.AUTHOR:
				if(context == grammarAccess.getAuthorRule()) {
					sequence_Author(context, (Author) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.CRB:
				if(context == grammarAccess.getCRBRule() ||
				   context == grammarAccess.getDOERule()) {
					sequence_CRB(context, (CRB) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.DEP_VARIABLE:
				if(context == grammarAccess.getDepVariableRule()) {
					sequence_DepVariable(context, (DepVariable) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.EXPERIMENT_ELEMENT:
				if(context == grammarAccess.getExperimentElementRule()) {
					sequence_ExperimentElement(context, (ExperimentElement) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.EXPERIMENTAL_DESIGN:
				if(context == grammarAccess.getExperimentalDesignRule()) {
					sequence_ExperimentalDesign(context, (ExperimentalDesign) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.FACTOR:
				if(context == grammarAccess.getFactorRule()) {
					sequence_Factor(context, (Factor) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.KEYWORD:
				if(context == grammarAccess.getKeywordRule()) {
					sequence_Keyword(context, (Keyword) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.LS:
				if(context == grammarAccess.getDOERule() ||
				   context == grammarAccess.getLSRule()) {
					sequence_LS(context, (LS) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.METRIC:
				if(context == grammarAccess.getMetricRule()) {
					sequence_Metric(context, (Metric) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.PROCESS:
				if(context == grammarAccess.getProcessRule()) {
					sequence_Process(context, (br.ufrn.dimap.ase.dsl.expdslv3.Process) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.QUESTION:
				if(context == grammarAccess.getQuestionRule()) {
					sequence_Question(context, (Question) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.QUESTIONNAIRE:
				if(context == grammarAccess.getQuestionnaireRule()) {
					sequence_Questionnaire(context, (Questionnaire) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.RCBD:
				if(context == grammarAccess.getDOERule() ||
				   context == grammarAccess.getRCBDRule()) {
					sequence_RCBD(context, (RCBD) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.RANGE:
				if(context == grammarAccess.getRangeRule()) {
					sequence_Range(context, (Range) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.RESEARCH_HYPOTHESIS:
				if(context == grammarAccess.getResearchHypothesisRule()) {
					sequence_ResearchHypothesis(context, (ResearchHypothesis) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.RESEARCH_QUESTION:
				if(context == grammarAccess.getResearchQuestionRule()) {
					sequence_ResearchQuestion(context, (ResearchQuestion) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.SIMPLE_ABSTRACT:
				if(context == grammarAccess.getAbstractRule() ||
				   context == grammarAccess.getSimpleAbstractRule()) {
					sequence_SimpleAbstract(context, (SimpleAbstract) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.SIMPLE_GOAL:
				if(context == grammarAccess.getGoalRule() ||
				   context == grammarAccess.getSimpleGoalRule()) {
					sequence_SimpleGoal(context, (SimpleGoal) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.STRUCTURED_ABSTRACT:
				if(context == grammarAccess.getAbstractRule() ||
				   context == grammarAccess.getStructuredAbstractRule()) {
					sequence_StructuredAbstract(context, (StructuredAbstract) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.STRUCTURED_GOAL:
				if(context == grammarAccess.getGoalRule() ||
				   context == grammarAccess.getStructuredGoalRule()) {
					sequence_StructuredGoal(context, (StructuredGoal) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.TASK:
				if(context == grammarAccess.getTaskRule()) {
					sequence_Task(context, (Task) semanticObject); 
					return; 
				}
				else break;
			case Expdslv3Package.VARIABLE:
				if(context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
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
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.ALTERNATIVES__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.ALTERNATIVES__DESCRIPTION));
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
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.ARTEFACT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.ARTEFACT__NAME));
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.ARTEFACT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.ARTEFACT__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.ARTEFACT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.ARTEFACT__TYPE));
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
	 *     (identifier=ID name=STRING)
	 *
	 * Features:
	 *    identifier[1, 1]
	 *    name[1, 1]
	 */
	protected void sequence_Author(EObject context, Author semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.AUTHOR__IDENTIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.AUTHOR__IDENTIFIER));
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.AUTHOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.AUTHOR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAuthorAccess().getIdentifierIDTerminalRuleCall_0_0(), semanticObject.getIdentifier());
		feeder.accept(grammarAccess.getAuthorAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     treatment=[Variable|QualifiedName]
	 *
	 * Features:
	 *    treatment[1, 1]
	 */
	protected void sequence_CRB(EObject context, CRB semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.DOE__TREATMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.DOE__TREATMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCRBAccess().getTreatmentVariableQualifiedNameParserRuleCall_2_0_1(), semanticObject.getTreatment());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variable=[Variable|QualifiedName] (rq=[ResearchQuestion|QualifiedName] | rh=[ResearchHypothesis|QualifiedName]))
	 *
	 * Features:
	 *    variable[1, 1]
	 *    rq[0, 1]
	 *         EXCLUDE_IF_SET rh
	 *    rh[0, 1]
	 *         EXCLUDE_IF_SET rq
	 */
	protected void sequence_DepVariable(EObject context, DepVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING experiments=ExperimentalDesign process+=Process* questionnaire+=Questionnaire*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    description[1, 1]
	 *    experiments[1, 1]
	 *    process[0, *]
	 *    questionnaire[0, *]
	 */
	protected void sequence_ExperimentElement(EObject context, ExperimentElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         author+=Author* 
	 *         abstract=Abstract? 
	 *         keyword+=Keyword* 
	 *         goal+=Goal* 
	 *         researchQuestion+=ResearchQuestion* 
	 *         researchHypothesis+=ResearchHypothesis* 
	 *         variable+=Variable* 
	 *         depVar+=DepVariable* 
	 *         factor+=Factor* 
	 *         type=DesignType 
	 *         doe=DOE 
	 *         parameter+=Parameter* 
	 *         replication=INT?
	 *     )
	 *
	 * Features:
	 *    author[0, *]
	 *    abstract[0, 1]
	 *    keyword[0, *]
	 *    goal[0, *]
	 *    researchQuestion[0, *]
	 *    researchHypothesis[0, *]
	 *    variable[0, *]
	 *    depVar[0, *]
	 *    factor[0, *]
	 *    type[1, 1]
	 *    doe[1, 1]
	 *    parameter[0, *]
	 *    replication[0, 1]
	 */
	protected void sequence_ExperimentalDesign(EObject context, ExperimentalDesign semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=[Variable|QualifiedName]
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_Factor(EObject context, Factor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.FACTOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.FACTOR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFactorAccess().getNameVariableQualifiedNameParserRuleCall_0_1(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     description=STRING
	 *
	 * Features:
	 *    description[1, 1]
	 */
	protected void sequence_Keyword(EObject context, Keyword semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.KEYWORD__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.KEYWORD__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getKeywordAccess().getDescriptionSTRINGTerminalRuleCall_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (col=[Variable|QualifiedName] row=[Variable|QualifiedName] treatment=[Variable|QualifiedName])
	 *
	 * Features:
	 *    treatment[1, 1]
	 *    col[1, 1]
	 *    row[1, 1]
	 */
	protected void sequence_LS(EObject context, LS semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.DOE__TREATMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.DOE__TREATMENT));
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.LS__COL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.LS__COL));
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.LS__ROW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.LS__ROW));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLSAccess().getColVariableQualifiedNameParserRuleCall_2_0_1(), semanticObject.getCol());
		feeder.accept(grammarAccess.getLSAccess().getRowVariableQualifiedNameParserRuleCall_5_0_1(), semanticObject.getRow());
		feeder.accept(grammarAccess.getLSAccess().getTreatmentVariableQualifiedNameParserRuleCall_8_0_1(), semanticObject.getTreatment());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=[Variable|QualifiedName] type=MetricType? varname=ID?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[0, 1]
	 *    varname[0, 1]
	 */
	protected void sequence_Metric(EObject context, Metric semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=ExperimentElement
	 *
	 * Features:
	 *    elements[1, 1]
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     variable=[Variable|QualifiedName]
	 *
	 * Features:
	 *    variable[1, 1]
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.PARAMETER__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.PARAMETER__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getVariableVariableQualifiedNameParserRuleCall_0_1(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID treatment+=[Range|QualifiedName]* role+=RoleType* task+=Task*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    treatment[0, *]
	 *    role[0, *]
	 *    task[0, *]
	 */
	protected void sequence_Process(EObject context, br.ufrn.dimap.ase.dsl.expdslv3.Process semanticObject) {
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
	 *     (blockVariable=[Variable|QualifiedName] treatment=[Variable|QualifiedName])
	 *
	 * Features:
	 *    treatment[1, 1]
	 *    blockVariable[1, 1]
	 */
	protected void sequence_RCBD(EObject context, RCBD semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.DOE__TREATMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.DOE__TREATMENT));
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.RCBD__BLOCK_VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.RCBD__BLOCK_VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRCBDAccess().getBlockVariableVariableQualifiedNameParserRuleCall_2_0_1(), semanticObject.getBlockVariable());
		feeder.accept(grammarAccess.getRCBDAccess().getTreatmentVariableQualifiedNameParserRuleCall_5_0_1(), semanticObject.getTreatment());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_Range(EObject context, Range semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.RANGE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.RANGE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRangeAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING goal=[Goal|QualifiedName])
	 *
	 * Features:
	 *    name[1, 1]
	 *    description[1, 1]
	 *    goal[1, 1]
	 */
	protected void sequence_ResearchHypothesis(EObject context, ResearchHypothesis semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.RESEARCH_HYPOTHESIS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.RESEARCH_HYPOTHESIS__NAME));
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.RESEARCH_HYPOTHESIS__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.RESEARCH_HYPOTHESIS__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.RESEARCH_HYPOTHESIS__GOAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.RESEARCH_HYPOTHESIS__GOAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getResearchHypothesisAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getResearchHypothesisAccess().getDescriptionSTRINGTerminalRuleCall_1_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getResearchHypothesisAccess().getGoalGoalQualifiedNameParserRuleCall_3_0_1(), semanticObject.getGoal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING goal=[Goal|QualifiedName])
	 *
	 * Features:
	 *    name[1, 1]
	 *    description[1, 1]
	 *    goal[1, 1]
	 */
	protected void sequence_ResearchQuestion(EObject context, ResearchQuestion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.RESEARCH_QUESTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.RESEARCH_QUESTION__NAME));
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.RESEARCH_QUESTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.RESEARCH_QUESTION__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.RESEARCH_QUESTION__GOAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.RESEARCH_QUESTION__GOAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getResearchQuestionAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getResearchQuestionAccess().getDescriptionSTRINGTerminalRuleCall_1_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getResearchQuestionAccess().getGoalGoalQualifiedNameParserRuleCall_3_0_1(), semanticObject.getGoal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     description=STRING
	 *
	 * Features:
	 *    description[1, 1]
	 */
	protected void sequence_SimpleAbstract(EObject context, SimpleAbstract semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.SIMPLE_ABSTRACT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.SIMPLE_ABSTRACT__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimpleAbstractAccess().getDescriptionSTRINGTerminalRuleCall_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    description[0, 1]
	 */
	protected void sequence_SimpleGoal(EObject context, SimpleGoal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         background=STRING? 
	 *         objective=STRING? 
	 *         methods=STRING? 
	 *         results=STRING? 
	 *         limitations=STRING? 
	 *         conclusions=STRING?
	 *     )
	 *
	 * Features:
	 *    background[0, 1]
	 *    objective[0, 1]
	 *    methods[0, 1]
	 *    results[0, 1]
	 *    limitations[0, 1]
	 *    conclusions[0, 1]
	 */
	protected void sequence_StructuredAbstract(EObject context, StructuredAbstract semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (object=STRING technique=STRING quality=STRING ptView=STRING contextOf=STRING)
	 *
	 * Features:
	 *    object[1, 1]
	 *    technique[1, 1]
	 *    quality[1, 1]
	 *    ptView[1, 1]
	 *    contextOf[1, 1]
	 */
	protected void sequence_StructuredGoal(EObject context, StructuredGoal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.STRUCTURED_GOAL__OBJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.STRUCTURED_GOAL__OBJECT));
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.STRUCTURED_GOAL__TECHNIQUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.STRUCTURED_GOAL__TECHNIQUE));
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.STRUCTURED_GOAL__QUALITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.STRUCTURED_GOAL__QUALITY));
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.STRUCTURED_GOAL__PT_VIEW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.STRUCTURED_GOAL__PT_VIEW));
			if(transientValues.isValueTransient(semanticObject, Expdslv3Package.Literals.STRUCTURED_GOAL__CONTEXT_OF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Expdslv3Package.Literals.STRUCTURED_GOAL__CONTEXT_OF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStructuredGoalAccess().getObjectSTRINGTerminalRuleCall_1_0(), semanticObject.getObject());
		feeder.accept(grammarAccess.getStructuredGoalAccess().getTechniqueSTRINGTerminalRuleCall_3_0(), semanticObject.getTechnique());
		feeder.accept(grammarAccess.getStructuredGoalAccess().getQualitySTRINGTerminalRuleCall_5_0(), semanticObject.getQuality());
		feeder.accept(grammarAccess.getStructuredGoalAccess().getPtViewSTRINGTerminalRuleCall_7_0(), semanticObject.getPtView());
		feeder.accept(grammarAccess.getStructuredGoalAccess().getContextOfSTRINGTerminalRuleCall_9_0(), semanticObject.getContextOf());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING 
	 *         next+=[Task|QualifiedName]* 
	 *         role+=RoleType* 
	 *         artefacts+=Artefact* 
	 *         metric+=Metric*
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    description[1, 1]
	 *    next[0, *]
	 *    role[0, *]
	 *    artefacts[0, *]
	 *    metric[0, *]
	 */
	protected void sequence_Task(EObject context, Task semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING scaleType=ScaleType? range+=Range*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    description[1, 1]
	 *    scaleType[0, 1]
	 *    range[0, *]
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3.impl;

import br.ufrn.dimap.ase.dsl.expdslv3.Abstract;
import br.ufrn.dimap.ase.dsl.expdslv3.Alternatives;
import br.ufrn.dimap.ase.dsl.expdslv3.AnswerType;
import br.ufrn.dimap.ase.dsl.expdslv3.Artefact;
import br.ufrn.dimap.ase.dsl.expdslv3.ArtefactType;
import br.ufrn.dimap.ase.dsl.expdslv3.Author;
import br.ufrn.dimap.ase.dsl.expdslv3.CRB;
import br.ufrn.dimap.ase.dsl.expdslv3.DOE;
import br.ufrn.dimap.ase.dsl.expdslv3.DepVariable;
import br.ufrn.dimap.ase.dsl.expdslv3.DesignType;
import br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Factory;
import br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package;
import br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement;
import br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign;
import br.ufrn.dimap.ase.dsl.expdslv3.Factor;
import br.ufrn.dimap.ase.dsl.expdslv3.Goal;
import br.ufrn.dimap.ase.dsl.expdslv3.Keyword;
import br.ufrn.dimap.ase.dsl.expdslv3.LS;
import br.ufrn.dimap.ase.dsl.expdslv3.Metric;
import br.ufrn.dimap.ase.dsl.expdslv3.MetricType;
import br.ufrn.dimap.ase.dsl.expdslv3.Model;
import br.ufrn.dimap.ase.dsl.expdslv3.Parameter;
import br.ufrn.dimap.ase.dsl.expdslv3.Question;
import br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire;
import br.ufrn.dimap.ase.dsl.expdslv3.QuestionnaireType;
import br.ufrn.dimap.ase.dsl.expdslv3.RCBD;
import br.ufrn.dimap.ase.dsl.expdslv3.Range;
import br.ufrn.dimap.ase.dsl.expdslv3.ResearchHypothesis;
import br.ufrn.dimap.ase.dsl.expdslv3.ResearchQuestion;
import br.ufrn.dimap.ase.dsl.expdslv3.RoleType;
import br.ufrn.dimap.ase.dsl.expdslv3.ScaleType;
import br.ufrn.dimap.ase.dsl.expdslv3.SimpleAbstract;
import br.ufrn.dimap.ase.dsl.expdslv3.SimpleGoal;
import br.ufrn.dimap.ase.dsl.expdslv3.StructuredAbstract;
import br.ufrn.dimap.ase.dsl.expdslv3.StructuredGoal;
import br.ufrn.dimap.ase.dsl.expdslv3.Task;
import br.ufrn.dimap.ase.dsl.expdslv3.Variable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Expdslv3FactoryImpl extends EFactoryImpl implements Expdslv3Factory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Expdslv3Factory init()
  {
		try {
			Expdslv3Factory theExpdslv3Factory = (Expdslv3Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.ufrn.br/dimap/ase/dsl/Expdslv3"); 
			if (theExpdslv3Factory != null) {
				return theExpdslv3Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Expdslv3FactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Expdslv3FactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case Expdslv3Package.MODEL: return createModel();
			case Expdslv3Package.EXPERIMENT_ELEMENT: return createExperimentElement();
			case Expdslv3Package.EXPERIMENTAL_DESIGN: return createExperimentalDesign();
			case Expdslv3Package.AUTHOR: return createAuthor();
			case Expdslv3Package.ABSTRACT: return createAbstract();
			case Expdslv3Package.SIMPLE_ABSTRACT: return createSimpleAbstract();
			case Expdslv3Package.STRUCTURED_ABSTRACT: return createStructuredAbstract();
			case Expdslv3Package.KEYWORD: return createKeyword();
			case Expdslv3Package.GOAL: return createGoal();
			case Expdslv3Package.SIMPLE_GOAL: return createSimpleGoal();
			case Expdslv3Package.STRUCTURED_GOAL: return createStructuredGoal();
			case Expdslv3Package.RESEARCH_QUESTION: return createResearchQuestion();
			case Expdslv3Package.RESEARCH_HYPOTHESIS: return createResearchHypothesis();
			case Expdslv3Package.VARIABLE: return createVariable();
			case Expdslv3Package.RANGE: return createRange();
			case Expdslv3Package.DEP_VARIABLE: return createDepVariable();
			case Expdslv3Package.FACTOR: return createFactor();
			case Expdslv3Package.DOE: return createDOE();
			case Expdslv3Package.LS: return createLS();
			case Expdslv3Package.RCBD: return createRCBD();
			case Expdslv3Package.CRB: return createCRB();
			case Expdslv3Package.PARAMETER: return createParameter();
			case Expdslv3Package.PROCESS: return createProcess();
			case Expdslv3Package.TASK: return createTask();
			case Expdslv3Package.ARTEFACT: return createArtefact();
			case Expdslv3Package.METRIC: return createMetric();
			case Expdslv3Package.QUESTIONNAIRE: return createQuestionnaire();
			case Expdslv3Package.QUESTION: return createQuestion();
			case Expdslv3Package.ALTERNATIVES: return createAlternatives();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case Expdslv3Package.SCALE_TYPE:
				return createScaleTypeFromString(eDataType, initialValue);
			case Expdslv3Package.DESIGN_TYPE:
				return createDesignTypeFromString(eDataType, initialValue);
			case Expdslv3Package.ROLE_TYPE:
				return createRoleTypeFromString(eDataType, initialValue);
			case Expdslv3Package.ARTEFACT_TYPE:
				return createArtefactTypeFromString(eDataType, initialValue);
			case Expdslv3Package.METRIC_TYPE:
				return createMetricTypeFromString(eDataType, initialValue);
			case Expdslv3Package.QUESTIONNAIRE_TYPE:
				return createQuestionnaireTypeFromString(eDataType, initialValue);
			case Expdslv3Package.ANSWER_TYPE:
				return createAnswerTypeFromString(eDataType, initialValue);
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case Expdslv3Package.SCALE_TYPE:
				return convertScaleTypeToString(eDataType, instanceValue);
			case Expdslv3Package.DESIGN_TYPE:
				return convertDesignTypeToString(eDataType, instanceValue);
			case Expdslv3Package.ROLE_TYPE:
				return convertRoleTypeToString(eDataType, instanceValue);
			case Expdslv3Package.ARTEFACT_TYPE:
				return convertArtefactTypeToString(eDataType, instanceValue);
			case Expdslv3Package.METRIC_TYPE:
				return convertMetricTypeToString(eDataType, instanceValue);
			case Expdslv3Package.QUESTIONNAIRE_TYPE:
				return convertQuestionnaireTypeToString(eDataType, instanceValue);
			case Expdslv3Package.ANSWER_TYPE:
				return convertAnswerTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Model createModel()
  {
		ModelImpl model = new ModelImpl();
		return model;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ExperimentElement createExperimentElement()
  {
		ExperimentElementImpl experimentElement = new ExperimentElementImpl();
		return experimentElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ExperimentalDesign createExperimentalDesign()
  {
		ExperimentalDesignImpl experimentalDesign = new ExperimentalDesignImpl();
		return experimentalDesign;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Author createAuthor()
  {
		AuthorImpl author = new AuthorImpl();
		return author;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Abstract createAbstract()
  {
		AbstractImpl abstract_ = new AbstractImpl();
		return abstract_;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SimpleAbstract createSimpleAbstract()
  {
		SimpleAbstractImpl simpleAbstract = new SimpleAbstractImpl();
		return simpleAbstract;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public StructuredAbstract createStructuredAbstract()
  {
		StructuredAbstractImpl structuredAbstract = new StructuredAbstractImpl();
		return structuredAbstract;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Keyword createKeyword()
  {
		KeywordImpl keyword = new KeywordImpl();
		return keyword;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Goal createGoal()
  {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SimpleGoal createSimpleGoal()
  {
		SimpleGoalImpl simpleGoal = new SimpleGoalImpl();
		return simpleGoal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public StructuredGoal createStructuredGoal()
  {
		StructuredGoalImpl structuredGoal = new StructuredGoalImpl();
		return structuredGoal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ResearchQuestion createResearchQuestion()
  {
		ResearchQuestionImpl researchQuestion = new ResearchQuestionImpl();
		return researchQuestion;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ResearchHypothesis createResearchHypothesis()
  {
		ResearchHypothesisImpl researchHypothesis = new ResearchHypothesisImpl();
		return researchHypothesis;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Variable createVariable()
  {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Range createRange()
  {
		RangeImpl range = new RangeImpl();
		return range;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DepVariable createDepVariable()
  {
		DepVariableImpl depVariable = new DepVariableImpl();
		return depVariable;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Factor createFactor()
  {
		FactorImpl factor = new FactorImpl();
		return factor;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DOE createDOE()
  {
		DOEImpl doe = new DOEImpl();
		return doe;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LS createLS()
  {
		LSImpl ls = new LSImpl();
		return ls;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RCBD createRCBD()
  {
		RCBDImpl rcbd = new RCBDImpl();
		return rcbd;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CRB createCRB()
  {
		CRBImpl crb = new CRBImpl();
		return crb;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Parameter createParameter()
  {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public br.ufrn.dimap.ase.dsl.expdslv3.Process createProcess()
  {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Task createTask()
  {
		TaskImpl task = new TaskImpl();
		return task;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Artefact createArtefact()
  {
		ArtefactImpl artefact = new ArtefactImpl();
		return artefact;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Metric createMetric()
  {
		MetricImpl metric = new MetricImpl();
		return metric;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Questionnaire createQuestionnaire()
  {
		QuestionnaireImpl questionnaire = new QuestionnaireImpl();
		return questionnaire;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Question createQuestion()
  {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Alternatives createAlternatives()
  {
		AlternativesImpl alternatives = new AlternativesImpl();
		return alternatives;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ScaleType createScaleTypeFromString(EDataType eDataType, String initialValue)
  {
		ScaleType result = ScaleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertScaleTypeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DesignType createDesignTypeFromString(EDataType eDataType, String initialValue)
  {
		DesignType result = DesignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertDesignTypeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RoleType createRoleTypeFromString(EDataType eDataType, String initialValue)
  {
		RoleType result = RoleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertRoleTypeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ArtefactType createArtefactTypeFromString(EDataType eDataType, String initialValue)
  {
		ArtefactType result = ArtefactType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertArtefactTypeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MetricType createMetricTypeFromString(EDataType eDataType, String initialValue)
  {
		MetricType result = MetricType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertMetricTypeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public QuestionnaireType createQuestionnaireTypeFromString(EDataType eDataType, String initialValue)
  {
		QuestionnaireType result = QuestionnaireType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertQuestionnaireTypeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AnswerType createAnswerTypeFromString(EDataType eDataType, String initialValue)
  {
		AnswerType result = AnswerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertAnswerTypeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Expdslv3Package getExpdslv3Package()
  {
		return (Expdslv3Package)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static Expdslv3Package getPackage()
  {
		return Expdslv3Package.eINSTANCE;
	}

} //Expdslv3FactoryImpl

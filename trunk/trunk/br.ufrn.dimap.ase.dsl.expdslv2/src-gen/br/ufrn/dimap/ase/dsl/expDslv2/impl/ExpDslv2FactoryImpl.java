/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2.impl;

import br.ufrn.dimap.ase.dsl.expDslv2.Activity;
import br.ufrn.dimap.ase.dsl.expDslv2.ActivityMetric;
import br.ufrn.dimap.ase.dsl.expDslv2.Alternatives;
import br.ufrn.dimap.ase.dsl.expDslv2.AnalysisTechiqueType;
import br.ufrn.dimap.ase.dsl.expDslv2.AnswerType;
import br.ufrn.dimap.ase.dsl.expDslv2.Artefact;
import br.ufrn.dimap.ase.dsl.expDslv2.ArtefactType;
import br.ufrn.dimap.ase.dsl.expDslv2.CollectedData;
import br.ufrn.dimap.ase.dsl.expDslv2.DataMetric;
import br.ufrn.dimap.ase.dsl.expDslv2.DataType;
import br.ufrn.dimap.ase.dsl.expDslv2.DependentVariable;
import br.ufrn.dimap.ase.dsl.expDslv2.DesignType;
import br.ufrn.dimap.ase.dsl.expDslv2.Detail;
import br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Factory;
import br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package;
import br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement;
import br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan;
import br.ufrn.dimap.ase.dsl.expDslv2.Factor;
import br.ufrn.dimap.ase.dsl.expDslv2.Goal;
import br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses;
import br.ufrn.dimap.ase.dsl.expDslv2.HypothesisType;
import br.ufrn.dimap.ase.dsl.expDslv2.Levels;
import br.ufrn.dimap.ase.dsl.expDslv2.Metrics;
import br.ufrn.dimap.ase.dsl.expDslv2.Model;
import br.ufrn.dimap.ase.dsl.expDslv2.OperatorType;
import br.ufrn.dimap.ase.dsl.expDslv2.Parameter;
import br.ufrn.dimap.ase.dsl.expDslv2.Question;
import br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire;
import br.ufrn.dimap.ase.dsl.expDslv2.QuestionnaireType;
import br.ufrn.dimap.ase.dsl.expDslv2.RelationType;
import br.ufrn.dimap.ase.dsl.expDslv2.RoleType;
import br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses;
import br.ufrn.dimap.ase.dsl.expDslv2.Task;
import br.ufrn.dimap.ase.dsl.expDslv2.TaskMetric;
import br.ufrn.dimap.ase.dsl.expDslv2.TimeMetric;

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
public class ExpDslv2FactoryImpl extends EFactoryImpl implements ExpDslv2Factory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ExpDslv2Factory init()
  {
		try {
			ExpDslv2Factory theExpDslv2Factory = (ExpDslv2Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.ufrn.br/dimap/ase/dsl/ExpDslv2"); 
			if (theExpDslv2Factory != null) {
				return theExpDslv2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExpDslv2FactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ExpDslv2FactoryImpl()
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
			case ExpDslv2Package.MODEL: return createModel();
			case ExpDslv2Package.EXPERIMENT_ELEMENT: return createExperimentElement();
			case ExpDslv2Package.PROCESS: return createProcess();
			case ExpDslv2Package.ACTIVITY: return createActivity();
			case ExpDslv2Package.TASK: return createTask();
			case ExpDslv2Package.ARTEFACT: return createArtefact();
			case ExpDslv2Package.METRICS: return createMetrics();
			case ExpDslv2Package.DETAIL: return createDetail();
			case ExpDslv2Package.TIME_METRIC: return createTimeMetric();
			case ExpDslv2Package.ACTIVITY_METRIC: return createActivityMetric();
			case ExpDslv2Package.TASK_METRIC: return createTaskMetric();
			case ExpDslv2Package.DATA_METRIC: return createDataMetric();
			case ExpDslv2Package.COLLECTED_DATA: return createCollectedData();
			case ExpDslv2Package.EXPERIMENTAL_PLAN: return createExperimentalPlan();
			case ExpDslv2Package.GOAL: return createGoal();
			case ExpDslv2Package.HYPOTHESES: return createHypotheses();
			case ExpDslv2Package.SUBHYPOTHESES: return createSubhypotheses();
			case ExpDslv2Package.PARAMETER: return createParameter();
			case ExpDslv2Package.DEPENDENT_VARIABLE: return createDependentVariable();
			case ExpDslv2Package.FACTOR: return createFactor();
			case ExpDslv2Package.LEVELS: return createLevels();
			case ExpDslv2Package.QUESTIONNAIRE: return createQuestionnaire();
			case ExpDslv2Package.QUESTION: return createQuestion();
			case ExpDslv2Package.ALTERNATIVES: return createAlternatives();
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
			case ExpDslv2Package.ROLE_TYPE:
				return createRoleTypeFromString(eDataType, initialValue);
			case ExpDslv2Package.ARTEFACT_TYPE:
				return createArtefactTypeFromString(eDataType, initialValue);
			case ExpDslv2Package.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
			case ExpDslv2Package.RELATION_TYPE:
				return createRelationTypeFromString(eDataType, initialValue);
			case ExpDslv2Package.OPERATOR_TYPE:
				return createOperatorTypeFromString(eDataType, initialValue);
			case ExpDslv2Package.HYPOTHESIS_TYPE:
				return createHypothesisTypeFromString(eDataType, initialValue);
			case ExpDslv2Package.DESIGN_TYPE:
				return createDesignTypeFromString(eDataType, initialValue);
			case ExpDslv2Package.ANALYSIS_TECHIQUE_TYPE:
				return createAnalysisTechiqueTypeFromString(eDataType, initialValue);
			case ExpDslv2Package.QUESTIONNAIRE_TYPE:
				return createQuestionnaireTypeFromString(eDataType, initialValue);
			case ExpDslv2Package.ANSWER_TYPE:
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
			case ExpDslv2Package.ROLE_TYPE:
				return convertRoleTypeToString(eDataType, instanceValue);
			case ExpDslv2Package.ARTEFACT_TYPE:
				return convertArtefactTypeToString(eDataType, instanceValue);
			case ExpDslv2Package.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
			case ExpDslv2Package.RELATION_TYPE:
				return convertRelationTypeToString(eDataType, instanceValue);
			case ExpDslv2Package.OPERATOR_TYPE:
				return convertOperatorTypeToString(eDataType, instanceValue);
			case ExpDslv2Package.HYPOTHESIS_TYPE:
				return convertHypothesisTypeToString(eDataType, instanceValue);
			case ExpDslv2Package.DESIGN_TYPE:
				return convertDesignTypeToString(eDataType, instanceValue);
			case ExpDslv2Package.ANALYSIS_TECHIQUE_TYPE:
				return convertAnalysisTechiqueTypeToString(eDataType, instanceValue);
			case ExpDslv2Package.QUESTIONNAIRE_TYPE:
				return convertQuestionnaireTypeToString(eDataType, instanceValue);
			case ExpDslv2Package.ANSWER_TYPE:
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
  public br.ufrn.dimap.ase.dsl.expDslv2.Process createProcess()
  {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Activity createActivity()
  {
		ActivityImpl activity = new ActivityImpl();
		return activity;
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
  public Metrics createMetrics()
  {
		MetricsImpl metrics = new MetricsImpl();
		return metrics;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Detail createDetail()
  {
		DetailImpl detail = new DetailImpl();
		return detail;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TimeMetric createTimeMetric()
  {
		TimeMetricImpl timeMetric = new TimeMetricImpl();
		return timeMetric;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ActivityMetric createActivityMetric()
  {
		ActivityMetricImpl activityMetric = new ActivityMetricImpl();
		return activityMetric;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TaskMetric createTaskMetric()
  {
		TaskMetricImpl taskMetric = new TaskMetricImpl();
		return taskMetric;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DataMetric createDataMetric()
  {
		DataMetricImpl dataMetric = new DataMetricImpl();
		return dataMetric;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CollectedData createCollectedData()
  {
		CollectedDataImpl collectedData = new CollectedDataImpl();
		return collectedData;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ExperimentalPlan createExperimentalPlan()
  {
		ExperimentalPlanImpl experimentalPlan = new ExperimentalPlanImpl();
		return experimentalPlan;
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
  public Hypotheses createHypotheses()
  {
		HypothesesImpl hypotheses = new HypothesesImpl();
		return hypotheses;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Subhypotheses createSubhypotheses()
  {
		SubhypothesesImpl subhypotheses = new SubhypothesesImpl();
		return subhypotheses;
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
  public DependentVariable createDependentVariable()
  {
		DependentVariableImpl dependentVariable = new DependentVariableImpl();
		return dependentVariable;
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
  public Levels createLevels()
  {
		LevelsImpl levels = new LevelsImpl();
		return levels;
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
  public DataType createDataTypeFromString(EDataType eDataType, String initialValue)
  {
		DataType result = DataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertDataTypeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RelationType createRelationTypeFromString(EDataType eDataType, String initialValue)
  {
		RelationType result = RelationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertRelationTypeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperatorType createOperatorTypeFromString(EDataType eDataType, String initialValue)
  {
		OperatorType result = OperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertOperatorTypeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HypothesisType createHypothesisTypeFromString(EDataType eDataType, String initialValue)
  {
		HypothesisType result = HypothesisType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertHypothesisTypeToString(EDataType eDataType, Object instanceValue)
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
  public AnalysisTechiqueType createAnalysisTechiqueTypeFromString(EDataType eDataType, String initialValue)
  {
		AnalysisTechiqueType result = AnalysisTechiqueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertAnalysisTechiqueTypeToString(EDataType eDataType, Object instanceValue)
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
  public ExpDslv2Package getExpDslv2Package()
  {
		return (ExpDslv2Package)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ExpDslv2Package getPackage()
  {
		return ExpDslv2Package.eINSTANCE;
	}

} //ExpDslv2FactoryImpl

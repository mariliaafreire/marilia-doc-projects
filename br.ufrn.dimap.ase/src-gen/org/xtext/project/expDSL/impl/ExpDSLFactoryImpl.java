/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.project.expDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.project.expDSL.Activity;
import org.xtext.project.expDSL.ActivityMetric;
import org.xtext.project.expDSL.Alternatives;
import org.xtext.project.expDSL.AnswerType;
import org.xtext.project.expDSL.Artefact;
import org.xtext.project.expDSL.ArtefactMetric;
import org.xtext.project.expDSL.ArtefactType;
import org.xtext.project.expDSL.ColectType;
import org.xtext.project.expDSL.DesignType;
import org.xtext.project.expDSL.Detail;
import org.xtext.project.expDSL.ExpDSLFactory;
import org.xtext.project.expDSL.ExpDSLPackage;
import org.xtext.project.expDSL.ExperimentElement;
import org.xtext.project.expDSL.ExperimentalPlan;
import org.xtext.project.expDSL.Factor;
import org.xtext.project.expDSL.Levels;
import org.xtext.project.expDSL.Link;
import org.xtext.project.expDSL.MetricUnit;
import org.xtext.project.expDSL.Metrics;
import org.xtext.project.expDSL.Model;
import org.xtext.project.expDSL.Parameter;
import org.xtext.project.expDSL.Question;
import org.xtext.project.expDSL.Questionnaire;
import org.xtext.project.expDSL.QuestionnaireType;
import org.xtext.project.expDSL.Role;
import org.xtext.project.expDSL.Task;
import org.xtext.project.expDSL.TaskMetric;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpDSLFactoryImpl extends EFactoryImpl implements ExpDSLFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ExpDSLFactory init()
  {
		try {
			ExpDSLFactory theExpDSLFactory = (ExpDSLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/project/ExpDSL"); 
			if (theExpDSLFactory != null) {
				return theExpDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExpDSLFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ExpDSLFactoryImpl()
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
			case ExpDSLPackage.MODEL: return createModel();
			case ExpDSLPackage.EXPERIMENT_ELEMENT: return createExperimentElement();
			case ExpDSLPackage.PROCESS: return createProcess();
			case ExpDSLPackage.ACTIVITY: return createActivity();
			case ExpDSLPackage.TASK: return createTask();
			case ExpDSLPackage.ROLE: return createRole();
			case ExpDSLPackage.ARTEFACT: return createArtefact();
			case ExpDSLPackage.METRICS: return createMetrics();
			case ExpDSLPackage.DETAIL: return createDetail();
			case ExpDSLPackage.ACTIVITY_METRIC: return createActivityMetric();
			case ExpDSLPackage.TASK_METRIC: return createTaskMetric();
			case ExpDSLPackage.ARTEFACT_METRIC: return createArtefactMetric();
			case ExpDSLPackage.EXPERIMENTAL_PLAN: return createExperimentalPlan();
			case ExpDSLPackage.PARAMETER: return createParameter();
			case ExpDSLPackage.FACTOR: return createFactor();
			case ExpDSLPackage.LEVELS: return createLevels();
			case ExpDSLPackage.LINK: return createLink();
			case ExpDSLPackage.QUESTIONNAIRE: return createQuestionnaire();
			case ExpDSLPackage.QUESTION: return createQuestion();
			case ExpDSLPackage.ALTERNATIVES: return createAlternatives();
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
			case ExpDSLPackage.ARTEFACT_TYPE:
				return createArtefactTypeFromString(eDataType, initialValue);
			case ExpDSLPackage.COLECT_TYPE:
				return createColectTypeFromString(eDataType, initialValue);
			case ExpDSLPackage.METRIC_UNIT:
				return createMetricUnitFromString(eDataType, initialValue);
			case ExpDSLPackage.DESIGN_TYPE:
				return createDesignTypeFromString(eDataType, initialValue);
			case ExpDSLPackage.QUESTIONNAIRE_TYPE:
				return createQuestionnaireTypeFromString(eDataType, initialValue);
			case ExpDSLPackage.ANSWER_TYPE:
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
			case ExpDSLPackage.ARTEFACT_TYPE:
				return convertArtefactTypeToString(eDataType, instanceValue);
			case ExpDSLPackage.COLECT_TYPE:
				return convertColectTypeToString(eDataType, instanceValue);
			case ExpDSLPackage.METRIC_UNIT:
				return convertMetricUnitToString(eDataType, instanceValue);
			case ExpDSLPackage.DESIGN_TYPE:
				return convertDesignTypeToString(eDataType, instanceValue);
			case ExpDSLPackage.QUESTIONNAIRE_TYPE:
				return convertQuestionnaireTypeToString(eDataType, instanceValue);
			case ExpDSLPackage.ANSWER_TYPE:
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
  public org.xtext.project.expDSL.Process createProcess()
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
  public Role createRole()
  {
		RoleImpl role = new RoleImpl();
		return role;
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
  public ArtefactMetric createArtefactMetric()
  {
		ArtefactMetricImpl artefactMetric = new ArtefactMetricImpl();
		return artefactMetric;
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
  public Link createLink()
  {
		LinkImpl link = new LinkImpl();
		return link;
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
  public ColectType createColectTypeFromString(EDataType eDataType, String initialValue)
  {
		ColectType result = ColectType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertColectTypeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MetricUnit createMetricUnitFromString(EDataType eDataType, String initialValue)
  {
		MetricUnit result = MetricUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertMetricUnitToString(EDataType eDataType, Object instanceValue)
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
  public ExpDSLPackage getExpDSLPackage()
  {
		return (ExpDSLPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ExpDSLPackage getPackage()
  {
		return ExpDSLPackage.eINSTANCE;
	}

} //ExpDSLFactoryImpl

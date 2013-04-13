/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.project.expDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.xtext.project.expDSL.ExpDSLFactory
 * @model kind="package"
 * @generated
 */
public interface ExpDSLPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "expDSL";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.xtext.org/project/ExpDSL";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "expDSL";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ExpDSLPackage eINSTANCE = org.xtext.project.expDSL.impl.ExpDSLPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.impl.ModelImpl
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getModel()
	 * @generated
	 */
  int MODEL = 0;

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
	 * The meta object id for the '{@link org.xtext.project.expDSL.impl.ExperimentElementImpl <em>Experiment Element</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.impl.ExperimentElementImpl
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getExperimentElement()
	 * @generated
	 */
  int EXPERIMENT_ELEMENT = 1;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENT_ELEMENT__NAME = 0;

  /**
	 * The feature id for the '<em><b>Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENT_ELEMENT__PROCESS = 1;

  /**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENT_ELEMENT__METRICS = 2;

  /**
	 * The feature id for the '<em><b>Experiments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENT_ELEMENT__EXPERIMENTS = 3;

  /**
	 * The feature id for the '<em><b>Questionnaire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENT_ELEMENT__QUESTIONNAIRE = 4;

  /**
	 * The number of structural features of the '<em>Experiment Element</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENT_ELEMENT_FEATURE_COUNT = 5;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.impl.ProcessImpl
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getProcess()
	 * @generated
	 */
  int PROCESS = 2;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROCESS__NAME = 0;

  /**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROCESS__ACTIVITIES = 1;

  /**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROCESS_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.impl.ActivityImpl
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getActivity()
	 * @generated
	 */
  int ACTIVITY = 3;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY__NAME = 0;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY__DESCRIPTION = 1;

  /**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY__NEXT = 2;

  /**
	 * The feature id for the '<em><b>Artefacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY__ARTEFACTS = 3;

  /**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY__ROLE = 4;

  /**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY__TASKS = 5;

  /**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY_FEATURE_COUNT = 6;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.impl.TaskImpl
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getTask()
	 * @generated
	 */
  int TASK = 4;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK__NAME = 0;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK__DESCRIPTION = 1;

  /**
	 * The feature id for the '<em><b>Artefacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK__ARTEFACTS = 2;

  /**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK__ROLE = 3;

  /**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.impl.RoleImpl
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getRole()
	 * @generated
	 */
  int ROLE = 5;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROLE__NAME = 0;

  /**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROLE_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.impl.ArtefactImpl <em>Artefact</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.impl.ArtefactImpl
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getArtefact()
	 * @generated
	 */
  int ARTEFACT = 6;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ARTEFACT__NAME = 0;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ARTEFACT__DESCRIPTION = 1;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ARTEFACT__TYPE = 2;

  /**
	 * The number of structural features of the '<em>Artefact</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ARTEFACT_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.impl.MetricsImpl <em>Metrics</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.impl.MetricsImpl
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getMetrics()
	 * @generated
	 */
  int METRICS = 7;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int METRICS__NAME = 0;

  /**
	 * The feature id for the '<em><b>Relates To</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int METRICS__RELATES_TO = 1;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int METRICS__DESCRIPTION = 2;

  /**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int METRICS__FORM = 3;

  /**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int METRICS__UNIT = 4;

  /**
	 * The feature id for the '<em><b>Detail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int METRICS__DETAIL = 5;

  /**
	 * The number of structural features of the '<em>Metrics</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int METRICS_FEATURE_COUNT = 6;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.impl.DetailImpl <em>Detail</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.impl.DetailImpl
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getDetail()
	 * @generated
	 */
  int DETAIL = 8;

  /**
	 * The number of structural features of the '<em>Detail</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DETAIL_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.impl.ActivityMetricImpl <em>Activity Metric</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.impl.ActivityMetricImpl
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getActivityMetric()
	 * @generated
	 */
  int ACTIVITY_METRIC = 9;

  /**
	 * The feature id for the '<em><b>Activity Begin</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY_METRIC__ACTIVITY_BEGIN = DETAIL_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Activity End</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY_METRIC__ACTIVITY_END = DETAIL_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Activity Metric</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY_METRIC_FEATURE_COUNT = DETAIL_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.impl.TaskMetricImpl <em>Task Metric</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.impl.TaskMetricImpl
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getTaskMetric()
	 * @generated
	 */
  int TASK_METRIC = 10;

  /**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK_METRIC__TASKS = DETAIL_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Task Metric</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK_METRIC_FEATURE_COUNT = DETAIL_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.impl.ArtefactMetricImpl <em>Artefact Metric</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.impl.ArtefactMetricImpl
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getArtefactMetric()
	 * @generated
	 */
  int ARTEFACT_METRIC = 11;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ARTEFACT_METRIC__NAME = DETAIL_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Artefacts</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ARTEFACT_METRIC__ARTEFACTS = DETAIL_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Artefact Metric</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ARTEFACT_METRIC_FEATURE_COUNT = DETAIL_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.impl.ExperimentalPlanImpl <em>Experimental Plan</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.impl.ExperimentalPlanImpl
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getExperimentalPlan()
	 * @generated
	 */
  int EXPERIMENTAL_PLAN = 12;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_PLAN__NAME = 0;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_PLAN__TYPE = 1;

  /**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_PLAN__PARAMETER = 2;

  /**
	 * The feature id for the '<em><b>Factor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_PLAN__FACTOR = 3;

  /**
	 * The feature id for the '<em><b>Internal Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_PLAN__INTERNAL_REPLICATION = 4;

  /**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_PLAN__LINK = 5;

  /**
	 * The number of structural features of the '<em>Experimental Plan</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_PLAN_FEATURE_COUNT = 6;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.impl.ParameterImpl
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getParameter()
	 * @generated
	 */
  int PARAMETER = 13;

  /**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PARAMETER__VARIABLE = 0;

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
	 * The meta object id for the '{@link org.xtext.project.expDSL.impl.FactorImpl <em>Factor</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.impl.FactorImpl
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getFactor()
	 * @generated
	 */
  int FACTOR = 14;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FACTOR__NAME = 0;

  /**
	 * The feature id for the '<em><b>Is Desired Variation</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FACTOR__IS_DESIRED_VARIATION = 1;

  /**
	 * The feature id for the '<em><b>Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FACTOR__LEVEL = 2;

  /**
	 * The number of structural features of the '<em>Factor</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FACTOR_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.impl.LevelsImpl <em>Levels</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.impl.LevelsImpl
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getLevels()
	 * @generated
	 */
  int LEVELS = 15;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LEVELS__NAME = 0;

  /**
	 * The number of structural features of the '<em>Levels</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LEVELS_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.impl.LinkImpl
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getLink()
	 * @generated
	 */
  int LINK = 16;

  /**
	 * The feature id for the '<em><b>Procedure</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINK__PROCEDURE = 0;

  /**
	 * The feature id for the '<em><b>Treatment</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINK__TREATMENT = 1;

  /**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINK_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.impl.QuestionnaireImpl
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getQuestionnaire()
	 * @generated
	 */
  int QUESTIONNAIRE = 17;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int QUESTIONNAIRE__NAME = 0;

  /**
	 * The feature id for the '<em><b>Relates To</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int QUESTIONNAIRE__RELATES_TO = 1;

  /**
	 * The feature id for the '<em><b>Questionnaire Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int QUESTIONNAIRE__QUESTIONNAIRE_TYPE = 2;

  /**
	 * The feature id for the '<em><b>Question</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int QUESTIONNAIRE__QUESTION = 3;

  /**
	 * The number of structural features of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int QUESTIONNAIRE_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.impl.QuestionImpl
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getQuestion()
	 * @generated
	 */
  int QUESTION = 18;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int QUESTION__NAME = 0;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int QUESTION__DESCRIPTION = 1;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int QUESTION__TYPE = 2;

  /**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int QUESTION__REQ = 3;

  /**
	 * The feature id for the '<em><b>Alternatives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int QUESTION__ALTERNATIVES = 4;

  /**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int QUESTION_FEATURE_COUNT = 5;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.impl.AlternativesImpl <em>Alternatives</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.impl.AlternativesImpl
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getAlternatives()
	 * @generated
	 */
  int ALTERNATIVES = 19;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ALTERNATIVES__DESCRIPTION = 0;

  /**
	 * The number of structural features of the '<em>Alternatives</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ALTERNATIVES_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.ArtefactType <em>Artefact Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.ArtefactType
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getArtefactType()
	 * @generated
	 */
  int ARTEFACT_TYPE = 20;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.ColectType <em>Colect Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.ColectType
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getColectType()
	 * @generated
	 */
  int COLECT_TYPE = 21;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.MetricUnit <em>Metric Unit</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.MetricUnit
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getMetricUnit()
	 * @generated
	 */
  int METRIC_UNIT = 22;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.DesignType <em>Design Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.DesignType
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getDesignType()
	 * @generated
	 */
  int DESIGN_TYPE = 23;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.QuestionnaireType <em>Questionnaire Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.QuestionnaireType
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getQuestionnaireType()
	 * @generated
	 */
  int QUESTIONNAIRE_TYPE = 24;

  /**
	 * The meta object id for the '{@link org.xtext.project.expDSL.AnswerType <em>Answer Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.project.expDSL.AnswerType
	 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getAnswerType()
	 * @generated
	 */
  int ANSWER_TYPE = 25;


  /**
	 * Returns the meta object for class '{@link org.xtext.project.expDSL.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.xtext.project.expDSL.Model
	 * @generated
	 */
  EClass getModel();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.project.expDSL.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.xtext.project.expDSL.Model#getElements()
	 * @see #getModel()
	 * @generated
	 */
  EReference getModel_Elements();

  /**
	 * Returns the meta object for class '{@link org.xtext.project.expDSL.ExperimentElement <em>Experiment Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Element</em>'.
	 * @see org.xtext.project.expDSL.ExperimentElement
	 * @generated
	 */
  EClass getExperimentElement();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.ExperimentElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.project.expDSL.ExperimentElement#getName()
	 * @see #getExperimentElement()
	 * @generated
	 */
  EAttribute getExperimentElement_Name();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.project.expDSL.ExperimentElement#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process</em>'.
	 * @see org.xtext.project.expDSL.ExperimentElement#getProcess()
	 * @see #getExperimentElement()
	 * @generated
	 */
  EReference getExperimentElement_Process();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.project.expDSL.ExperimentElement#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics</em>'.
	 * @see org.xtext.project.expDSL.ExperimentElement#getMetrics()
	 * @see #getExperimentElement()
	 * @generated
	 */
  EReference getExperimentElement_Metrics();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.project.expDSL.ExperimentElement#getExperiments <em>Experiments</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Experiments</em>'.
	 * @see org.xtext.project.expDSL.ExperimentElement#getExperiments()
	 * @see #getExperimentElement()
	 * @generated
	 */
  EReference getExperimentElement_Experiments();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.project.expDSL.ExperimentElement#getQuestionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questionnaire</em>'.
	 * @see org.xtext.project.expDSL.ExperimentElement#getQuestionnaire()
	 * @see #getExperimentElement()
	 * @generated
	 */
  EReference getExperimentElement_Questionnaire();

  /**
	 * Returns the meta object for class '{@link org.xtext.project.expDSL.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see org.xtext.project.expDSL.Process
	 * @generated
	 */
  EClass getProcess();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.project.expDSL.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
  EAttribute getProcess_Name();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.project.expDSL.Process#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see org.xtext.project.expDSL.Process#getActivities()
	 * @see #getProcess()
	 * @generated
	 */
  EReference getProcess_Activities();

  /**
	 * Returns the meta object for class '{@link org.xtext.project.expDSL.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.xtext.project.expDSL.Activity
	 * @generated
	 */
  EClass getActivity();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.project.expDSL.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
  EAttribute getActivity_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Activity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.xtext.project.expDSL.Activity#getDescription()
	 * @see #getActivity()
	 * @generated
	 */
  EAttribute getActivity_Description();

  /**
	 * Returns the meta object for the reference list '{@link org.xtext.project.expDSL.Activity#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next</em>'.
	 * @see org.xtext.project.expDSL.Activity#getNext()
	 * @see #getActivity()
	 * @generated
	 */
  EReference getActivity_Next();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.project.expDSL.Activity#getArtefacts <em>Artefacts</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artefacts</em>'.
	 * @see org.xtext.project.expDSL.Activity#getArtefacts()
	 * @see #getActivity()
	 * @generated
	 */
  EReference getActivity_Artefacts();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.project.expDSL.Activity#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see org.xtext.project.expDSL.Activity#getRole()
	 * @see #getActivity()
	 * @generated
	 */
  EReference getActivity_Role();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.project.expDSL.Activity#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see org.xtext.project.expDSL.Activity#getTasks()
	 * @see #getActivity()
	 * @generated
	 */
  EReference getActivity_Tasks();

  /**
	 * Returns the meta object for class '{@link org.xtext.project.expDSL.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.xtext.project.expDSL.Task
	 * @generated
	 */
  EClass getTask();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.project.expDSL.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
  EAttribute getTask_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.xtext.project.expDSL.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
  EAttribute getTask_Description();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.project.expDSL.Task#getArtefacts <em>Artefacts</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artefacts</em>'.
	 * @see org.xtext.project.expDSL.Task#getArtefacts()
	 * @see #getTask()
	 * @generated
	 */
  EReference getTask_Artefacts();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.project.expDSL.Task#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see org.xtext.project.expDSL.Task#getRole()
	 * @see #getTask()
	 * @generated
	 */
  EReference getTask_Role();

  /**
	 * Returns the meta object for class '{@link org.xtext.project.expDSL.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.xtext.project.expDSL.Role
	 * @generated
	 */
  EClass getRole();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.project.expDSL.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
  EAttribute getRole_Name();

  /**
	 * Returns the meta object for class '{@link org.xtext.project.expDSL.Artefact <em>Artefact</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artefact</em>'.
	 * @see org.xtext.project.expDSL.Artefact
	 * @generated
	 */
  EClass getArtefact();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Artefact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.project.expDSL.Artefact#getName()
	 * @see #getArtefact()
	 * @generated
	 */
  EAttribute getArtefact_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Artefact#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.xtext.project.expDSL.Artefact#getDescription()
	 * @see #getArtefact()
	 * @generated
	 */
  EAttribute getArtefact_Description();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Artefact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.xtext.project.expDSL.Artefact#getType()
	 * @see #getArtefact()
	 * @generated
	 */
  EAttribute getArtefact_Type();

  /**
	 * Returns the meta object for class '{@link org.xtext.project.expDSL.Metrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metrics</em>'.
	 * @see org.xtext.project.expDSL.Metrics
	 * @generated
	 */
  EClass getMetrics();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Metrics#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.project.expDSL.Metrics#getName()
	 * @see #getMetrics()
	 * @generated
	 */
  EAttribute getMetrics_Name();

  /**
	 * Returns the meta object for the reference '{@link org.xtext.project.expDSL.Metrics#getRelatesTo <em>Relates To</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relates To</em>'.
	 * @see org.xtext.project.expDSL.Metrics#getRelatesTo()
	 * @see #getMetrics()
	 * @generated
	 */
  EReference getMetrics_RelatesTo();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Metrics#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.xtext.project.expDSL.Metrics#getDescription()
	 * @see #getMetrics()
	 * @generated
	 */
  EAttribute getMetrics_Description();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Metrics#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form</em>'.
	 * @see org.xtext.project.expDSL.Metrics#getForm()
	 * @see #getMetrics()
	 * @generated
	 */
  EAttribute getMetrics_Form();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Metrics#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.xtext.project.expDSL.Metrics#getUnit()
	 * @see #getMetrics()
	 * @generated
	 */
  EAttribute getMetrics_Unit();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.project.expDSL.Metrics#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Detail</em>'.
	 * @see org.xtext.project.expDSL.Metrics#getDetail()
	 * @see #getMetrics()
	 * @generated
	 */
  EReference getMetrics_Detail();

  /**
	 * Returns the meta object for class '{@link org.xtext.project.expDSL.Detail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detail</em>'.
	 * @see org.xtext.project.expDSL.Detail
	 * @generated
	 */
  EClass getDetail();

  /**
	 * Returns the meta object for class '{@link org.xtext.project.expDSL.ActivityMetric <em>Activity Metric</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Metric</em>'.
	 * @see org.xtext.project.expDSL.ActivityMetric
	 * @generated
	 */
  EClass getActivityMetric();

  /**
	 * Returns the meta object for the reference '{@link org.xtext.project.expDSL.ActivityMetric#getActivityBegin <em>Activity Begin</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity Begin</em>'.
	 * @see org.xtext.project.expDSL.ActivityMetric#getActivityBegin()
	 * @see #getActivityMetric()
	 * @generated
	 */
  EReference getActivityMetric_ActivityBegin();

  /**
	 * Returns the meta object for the reference '{@link org.xtext.project.expDSL.ActivityMetric#getActivityEnd <em>Activity End</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity End</em>'.
	 * @see org.xtext.project.expDSL.ActivityMetric#getActivityEnd()
	 * @see #getActivityMetric()
	 * @generated
	 */
  EReference getActivityMetric_ActivityEnd();

  /**
	 * Returns the meta object for class '{@link org.xtext.project.expDSL.TaskMetric <em>Task Metric</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Metric</em>'.
	 * @see org.xtext.project.expDSL.TaskMetric
	 * @generated
	 */
  EClass getTaskMetric();

  /**
	 * Returns the meta object for the reference list '{@link org.xtext.project.expDSL.TaskMetric#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see org.xtext.project.expDSL.TaskMetric#getTasks()
	 * @see #getTaskMetric()
	 * @generated
	 */
  EReference getTaskMetric_Tasks();

  /**
	 * Returns the meta object for class '{@link org.xtext.project.expDSL.ArtefactMetric <em>Artefact Metric</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artefact Metric</em>'.
	 * @see org.xtext.project.expDSL.ArtefactMetric
	 * @generated
	 */
  EClass getArtefactMetric();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.ArtefactMetric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.project.expDSL.ArtefactMetric#getName()
	 * @see #getArtefactMetric()
	 * @generated
	 */
  EAttribute getArtefactMetric_Name();

  /**
	 * Returns the meta object for the reference '{@link org.xtext.project.expDSL.ArtefactMetric#getArtefacts <em>Artefacts</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Artefacts</em>'.
	 * @see org.xtext.project.expDSL.ArtefactMetric#getArtefacts()
	 * @see #getArtefactMetric()
	 * @generated
	 */
  EReference getArtefactMetric_Artefacts();

  /**
	 * Returns the meta object for class '{@link org.xtext.project.expDSL.ExperimentalPlan <em>Experimental Plan</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experimental Plan</em>'.
	 * @see org.xtext.project.expDSL.ExperimentalPlan
	 * @generated
	 */
  EClass getExperimentalPlan();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.ExperimentalPlan#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.project.expDSL.ExperimentalPlan#getName()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
  EAttribute getExperimentalPlan_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.ExperimentalPlan#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.xtext.project.expDSL.ExperimentalPlan#getType()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
  EAttribute getExperimentalPlan_Type();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.project.expDSL.ExperimentalPlan#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see org.xtext.project.expDSL.ExperimentalPlan#getParameter()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
  EReference getExperimentalPlan_Parameter();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.project.expDSL.ExperimentalPlan#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Factor</em>'.
	 * @see org.xtext.project.expDSL.ExperimentalPlan#getFactor()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
  EReference getExperimentalPlan_Factor();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.ExperimentalPlan#getInternalReplication <em>Internal Replication</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Replication</em>'.
	 * @see org.xtext.project.expDSL.ExperimentalPlan#getInternalReplication()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
  EAttribute getExperimentalPlan_InternalReplication();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.project.expDSL.ExperimentalPlan#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see org.xtext.project.expDSL.ExperimentalPlan#getLink()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
  EReference getExperimentalPlan_Link();

  /**
	 * Returns the meta object for class '{@link org.xtext.project.expDSL.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.xtext.project.expDSL.Parameter
	 * @generated
	 */
  EClass getParameter();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Parameter#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.xtext.project.expDSL.Parameter#getVariable()
	 * @see #getParameter()
	 * @generated
	 */
  EAttribute getParameter_Variable();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.xtext.project.expDSL.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
  EAttribute getParameter_Value();

  /**
	 * Returns the meta object for class '{@link org.xtext.project.expDSL.Factor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factor</em>'.
	 * @see org.xtext.project.expDSL.Factor
	 * @generated
	 */
  EClass getFactor();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Factor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.project.expDSL.Factor#getName()
	 * @see #getFactor()
	 * @generated
	 */
  EAttribute getFactor_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Factor#getIsDesiredVariation <em>Is Desired Variation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Desired Variation</em>'.
	 * @see org.xtext.project.expDSL.Factor#getIsDesiredVariation()
	 * @see #getFactor()
	 * @generated
	 */
  EAttribute getFactor_IsDesiredVariation();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.project.expDSL.Factor#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level</em>'.
	 * @see org.xtext.project.expDSL.Factor#getLevel()
	 * @see #getFactor()
	 * @generated
	 */
  EReference getFactor_Level();

  /**
	 * Returns the meta object for class '{@link org.xtext.project.expDSL.Levels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Levels</em>'.
	 * @see org.xtext.project.expDSL.Levels
	 * @generated
	 */
  EClass getLevels();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Levels#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.project.expDSL.Levels#getName()
	 * @see #getLevels()
	 * @generated
	 */
  EAttribute getLevels_Name();

  /**
	 * Returns the meta object for class '{@link org.xtext.project.expDSL.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.xtext.project.expDSL.Link
	 * @generated
	 */
  EClass getLink();

  /**
	 * Returns the meta object for the reference list '{@link org.xtext.project.expDSL.Link#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedure</em>'.
	 * @see org.xtext.project.expDSL.Link#getProcedure()
	 * @see #getLink()
	 * @generated
	 */
  EReference getLink_Procedure();

  /**
	 * Returns the meta object for the reference list '{@link org.xtext.project.expDSL.Link#getTreatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Treatment</em>'.
	 * @see org.xtext.project.expDSL.Link#getTreatment()
	 * @see #getLink()
	 * @generated
	 */
  EReference getLink_Treatment();

  /**
	 * Returns the meta object for class '{@link org.xtext.project.expDSL.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnaire</em>'.
	 * @see org.xtext.project.expDSL.Questionnaire
	 * @generated
	 */
  EClass getQuestionnaire();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Questionnaire#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.project.expDSL.Questionnaire#getName()
	 * @see #getQuestionnaire()
	 * @generated
	 */
  EAttribute getQuestionnaire_Name();

  /**
	 * Returns the meta object for the reference list '{@link org.xtext.project.expDSL.Questionnaire#getRelatesTo <em>Relates To</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relates To</em>'.
	 * @see org.xtext.project.expDSL.Questionnaire#getRelatesTo()
	 * @see #getQuestionnaire()
	 * @generated
	 */
  EReference getQuestionnaire_RelatesTo();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Questionnaire#getQuestionnaireType <em>Questionnaire Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Questionnaire Type</em>'.
	 * @see org.xtext.project.expDSL.Questionnaire#getQuestionnaireType()
	 * @see #getQuestionnaire()
	 * @generated
	 */
  EAttribute getQuestionnaire_QuestionnaireType();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.project.expDSL.Questionnaire#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question</em>'.
	 * @see org.xtext.project.expDSL.Questionnaire#getQuestion()
	 * @see #getQuestionnaire()
	 * @generated
	 */
  EReference getQuestionnaire_Question();

  /**
	 * Returns the meta object for class '{@link org.xtext.project.expDSL.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see org.xtext.project.expDSL.Question
	 * @generated
	 */
  EClass getQuestion();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Question#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.project.expDSL.Question#getName()
	 * @see #getQuestion()
	 * @generated
	 */
  EAttribute getQuestion_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Question#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.xtext.project.expDSL.Question#getDescription()
	 * @see #getQuestion()
	 * @generated
	 */
  EAttribute getQuestion_Description();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Question#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.xtext.project.expDSL.Question#getType()
	 * @see #getQuestion()
	 * @generated
	 */
  EAttribute getQuestion_Type();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Question#getReq <em>Req</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req</em>'.
	 * @see org.xtext.project.expDSL.Question#getReq()
	 * @see #getQuestion()
	 * @generated
	 */
  EAttribute getQuestion_Req();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.project.expDSL.Question#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternatives</em>'.
	 * @see org.xtext.project.expDSL.Question#getAlternatives()
	 * @see #getQuestion()
	 * @generated
	 */
  EReference getQuestion_Alternatives();

  /**
	 * Returns the meta object for class '{@link org.xtext.project.expDSL.Alternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternatives</em>'.
	 * @see org.xtext.project.expDSL.Alternatives
	 * @generated
	 */
  EClass getAlternatives();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.project.expDSL.Alternatives#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.xtext.project.expDSL.Alternatives#getDescription()
	 * @see #getAlternatives()
	 * @generated
	 */
  EAttribute getAlternatives_Description();

  /**
	 * Returns the meta object for enum '{@link org.xtext.project.expDSL.ArtefactType <em>Artefact Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Artefact Type</em>'.
	 * @see org.xtext.project.expDSL.ArtefactType
	 * @generated
	 */
  EEnum getArtefactType();

  /**
	 * Returns the meta object for enum '{@link org.xtext.project.expDSL.ColectType <em>Colect Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Colect Type</em>'.
	 * @see org.xtext.project.expDSL.ColectType
	 * @generated
	 */
  EEnum getColectType();

  /**
	 * Returns the meta object for enum '{@link org.xtext.project.expDSL.MetricUnit <em>Metric Unit</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metric Unit</em>'.
	 * @see org.xtext.project.expDSL.MetricUnit
	 * @generated
	 */
  EEnum getMetricUnit();

  /**
	 * Returns the meta object for enum '{@link org.xtext.project.expDSL.DesignType <em>Design Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Design Type</em>'.
	 * @see org.xtext.project.expDSL.DesignType
	 * @generated
	 */
  EEnum getDesignType();

  /**
	 * Returns the meta object for enum '{@link org.xtext.project.expDSL.QuestionnaireType <em>Questionnaire Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Questionnaire Type</em>'.
	 * @see org.xtext.project.expDSL.QuestionnaireType
	 * @generated
	 */
  EEnum getQuestionnaireType();

  /**
	 * Returns the meta object for enum '{@link org.xtext.project.expDSL.AnswerType <em>Answer Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Answer Type</em>'.
	 * @see org.xtext.project.expDSL.AnswerType
	 * @generated
	 */
  EEnum getAnswerType();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  ExpDSLFactory getExpDSLFactory();

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
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.impl.ModelImpl
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getModel()
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
		 * The meta object literal for the '{@link org.xtext.project.expDSL.impl.ExperimentElementImpl <em>Experiment Element</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.impl.ExperimentElementImpl
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getExperimentElement()
		 * @generated
		 */
    EClass EXPERIMENT_ELEMENT = eINSTANCE.getExperimentElement();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EXPERIMENT_ELEMENT__NAME = eINSTANCE.getExperimentElement_Name();

    /**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENT_ELEMENT__PROCESS = eINSTANCE.getExperimentElement_Process();

    /**
		 * The meta object literal for the '<em><b>Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENT_ELEMENT__METRICS = eINSTANCE.getExperimentElement_Metrics();

    /**
		 * The meta object literal for the '<em><b>Experiments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENT_ELEMENT__EXPERIMENTS = eINSTANCE.getExperimentElement_Experiments();

    /**
		 * The meta object literal for the '<em><b>Questionnaire</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENT_ELEMENT__QUESTIONNAIRE = eINSTANCE.getExperimentElement_Questionnaire();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.impl.ProcessImpl
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getProcess()
		 * @generated
		 */
    EClass PROCESS = eINSTANCE.getProcess();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

    /**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference PROCESS__ACTIVITIES = eINSTANCE.getProcess_Activities();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.impl.ActivityImpl
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getActivity()
		 * @generated
		 */
    EClass ACTIVITY = eINSTANCE.getActivity();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ACTIVITY__DESCRIPTION = eINSTANCE.getActivity_Description();

    /**
		 * The meta object literal for the '<em><b>Next</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ACTIVITY__NEXT = eINSTANCE.getActivity_Next();

    /**
		 * The meta object literal for the '<em><b>Artefacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ACTIVITY__ARTEFACTS = eINSTANCE.getActivity_Artefacts();

    /**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ACTIVITY__ROLE = eINSTANCE.getActivity_Role();

    /**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ACTIVITY__TASKS = eINSTANCE.getActivity_Tasks();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.impl.TaskImpl
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getTask()
		 * @generated
		 */
    EClass TASK = eINSTANCE.getTask();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TASK__NAME = eINSTANCE.getTask_Name();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

    /**
		 * The meta object literal for the '<em><b>Artefacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TASK__ARTEFACTS = eINSTANCE.getTask_Artefacts();

    /**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TASK__ROLE = eINSTANCE.getTask_Role();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.impl.RoleImpl
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getRole()
		 * @generated
		 */
    EClass ROLE = eINSTANCE.getRole();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.impl.ArtefactImpl <em>Artefact</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.impl.ArtefactImpl
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getArtefact()
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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ARTEFACT__DESCRIPTION = eINSTANCE.getArtefact_Description();

    /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ARTEFACT__TYPE = eINSTANCE.getArtefact_Type();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.impl.MetricsImpl <em>Metrics</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.impl.MetricsImpl
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getMetrics()
		 * @generated
		 */
    EClass METRICS = eINSTANCE.getMetrics();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute METRICS__NAME = eINSTANCE.getMetrics_Name();

    /**
		 * The meta object literal for the '<em><b>Relates To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference METRICS__RELATES_TO = eINSTANCE.getMetrics_RelatesTo();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute METRICS__DESCRIPTION = eINSTANCE.getMetrics_Description();

    /**
		 * The meta object literal for the '<em><b>Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute METRICS__FORM = eINSTANCE.getMetrics_Form();

    /**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute METRICS__UNIT = eINSTANCE.getMetrics_Unit();

    /**
		 * The meta object literal for the '<em><b>Detail</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference METRICS__DETAIL = eINSTANCE.getMetrics_Detail();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.impl.DetailImpl <em>Detail</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.impl.DetailImpl
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getDetail()
		 * @generated
		 */
    EClass DETAIL = eINSTANCE.getDetail();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.impl.ActivityMetricImpl <em>Activity Metric</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.impl.ActivityMetricImpl
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getActivityMetric()
		 * @generated
		 */
    EClass ACTIVITY_METRIC = eINSTANCE.getActivityMetric();

    /**
		 * The meta object literal for the '<em><b>Activity Begin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ACTIVITY_METRIC__ACTIVITY_BEGIN = eINSTANCE.getActivityMetric_ActivityBegin();

    /**
		 * The meta object literal for the '<em><b>Activity End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ACTIVITY_METRIC__ACTIVITY_END = eINSTANCE.getActivityMetric_ActivityEnd();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.impl.TaskMetricImpl <em>Task Metric</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.impl.TaskMetricImpl
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getTaskMetric()
		 * @generated
		 */
    EClass TASK_METRIC = eINSTANCE.getTaskMetric();

    /**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TASK_METRIC__TASKS = eINSTANCE.getTaskMetric_Tasks();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.impl.ArtefactMetricImpl <em>Artefact Metric</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.impl.ArtefactMetricImpl
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getArtefactMetric()
		 * @generated
		 */
    EClass ARTEFACT_METRIC = eINSTANCE.getArtefactMetric();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ARTEFACT_METRIC__NAME = eINSTANCE.getArtefactMetric_Name();

    /**
		 * The meta object literal for the '<em><b>Artefacts</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ARTEFACT_METRIC__ARTEFACTS = eINSTANCE.getArtefactMetric_Artefacts();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.impl.ExperimentalPlanImpl <em>Experimental Plan</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.impl.ExperimentalPlanImpl
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getExperimentalPlan()
		 * @generated
		 */
    EClass EXPERIMENTAL_PLAN = eINSTANCE.getExperimentalPlan();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EXPERIMENTAL_PLAN__NAME = eINSTANCE.getExperimentalPlan_Name();

    /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EXPERIMENTAL_PLAN__TYPE = eINSTANCE.getExperimentalPlan_Type();

    /**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENTAL_PLAN__PARAMETER = eINSTANCE.getExperimentalPlan_Parameter();

    /**
		 * The meta object literal for the '<em><b>Factor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENTAL_PLAN__FACTOR = eINSTANCE.getExperimentalPlan_Factor();

    /**
		 * The meta object literal for the '<em><b>Internal Replication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EXPERIMENTAL_PLAN__INTERNAL_REPLICATION = eINSTANCE.getExperimentalPlan_InternalReplication();

    /**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENTAL_PLAN__LINK = eINSTANCE.getExperimentalPlan_Link();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.impl.ParameterImpl
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getParameter()
		 * @generated
		 */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PARAMETER__VARIABLE = eINSTANCE.getParameter_Variable();

    /**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.impl.FactorImpl <em>Factor</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.impl.FactorImpl
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getFactor()
		 * @generated
		 */
    EClass FACTOR = eINSTANCE.getFactor();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FACTOR__NAME = eINSTANCE.getFactor_Name();

    /**
		 * The meta object literal for the '<em><b>Is Desired Variation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FACTOR__IS_DESIRED_VARIATION = eINSTANCE.getFactor_IsDesiredVariation();

    /**
		 * The meta object literal for the '<em><b>Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference FACTOR__LEVEL = eINSTANCE.getFactor_Level();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.impl.LevelsImpl <em>Levels</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.impl.LevelsImpl
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getLevels()
		 * @generated
		 */
    EClass LEVELS = eINSTANCE.getLevels();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LEVELS__NAME = eINSTANCE.getLevels_Name();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.impl.LinkImpl
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getLink()
		 * @generated
		 */
    EClass LINK = eINSTANCE.getLink();

    /**
		 * The meta object literal for the '<em><b>Procedure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LINK__PROCEDURE = eINSTANCE.getLink_Procedure();

    /**
		 * The meta object literal for the '<em><b>Treatment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LINK__TREATMENT = eINSTANCE.getLink_Treatment();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.impl.QuestionnaireImpl
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getQuestionnaire()
		 * @generated
		 */
    EClass QUESTIONNAIRE = eINSTANCE.getQuestionnaire();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute QUESTIONNAIRE__NAME = eINSTANCE.getQuestionnaire_Name();

    /**
		 * The meta object literal for the '<em><b>Relates To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference QUESTIONNAIRE__RELATES_TO = eINSTANCE.getQuestionnaire_RelatesTo();

    /**
		 * The meta object literal for the '<em><b>Questionnaire Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute QUESTIONNAIRE__QUESTIONNAIRE_TYPE = eINSTANCE.getQuestionnaire_QuestionnaireType();

    /**
		 * The meta object literal for the '<em><b>Question</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference QUESTIONNAIRE__QUESTION = eINSTANCE.getQuestionnaire_Question();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.impl.QuestionImpl
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getQuestion()
		 * @generated
		 */
    EClass QUESTION = eINSTANCE.getQuestion();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute QUESTION__NAME = eINSTANCE.getQuestion_Name();

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
		 * The meta object literal for the '<em><b>Req</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute QUESTION__REQ = eINSTANCE.getQuestion_Req();

    /**
		 * The meta object literal for the '<em><b>Alternatives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference QUESTION__ALTERNATIVES = eINSTANCE.getQuestion_Alternatives();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.impl.AlternativesImpl <em>Alternatives</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.impl.AlternativesImpl
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getAlternatives()
		 * @generated
		 */
    EClass ALTERNATIVES = eINSTANCE.getAlternatives();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ALTERNATIVES__DESCRIPTION = eINSTANCE.getAlternatives_Description();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.ArtefactType <em>Artefact Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.ArtefactType
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getArtefactType()
		 * @generated
		 */
    EEnum ARTEFACT_TYPE = eINSTANCE.getArtefactType();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.ColectType <em>Colect Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.ColectType
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getColectType()
		 * @generated
		 */
    EEnum COLECT_TYPE = eINSTANCE.getColectType();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.MetricUnit <em>Metric Unit</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.MetricUnit
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getMetricUnit()
		 * @generated
		 */
    EEnum METRIC_UNIT = eINSTANCE.getMetricUnit();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.DesignType <em>Design Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.DesignType
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getDesignType()
		 * @generated
		 */
    EEnum DESIGN_TYPE = eINSTANCE.getDesignType();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.QuestionnaireType <em>Questionnaire Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.QuestionnaireType
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getQuestionnaireType()
		 * @generated
		 */
    EEnum QUESTIONNAIRE_TYPE = eINSTANCE.getQuestionnaireType();

    /**
		 * The meta object literal for the '{@link org.xtext.project.expDSL.AnswerType <em>Answer Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.project.expDSL.AnswerType
		 * @see org.xtext.project.expDSL.impl.ExpDSLPackageImpl#getAnswerType()
		 * @generated
		 */
    EEnum ANSWER_TYPE = eINSTANCE.getAnswerType();

  }

} //ExpDSLPackage

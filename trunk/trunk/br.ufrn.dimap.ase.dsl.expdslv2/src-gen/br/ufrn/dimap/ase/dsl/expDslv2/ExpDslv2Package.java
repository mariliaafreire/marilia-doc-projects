/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2;

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
 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Factory
 * @model kind="package"
 * @generated
 */
public interface ExpDslv2Package extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "expDslv2";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.ufrn.br/dimap/ase/dsl/ExpDslv2";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "expDslv2";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ExpDslv2Package eINSTANCE = br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl.init();

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ModelImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getModel()
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
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ExperimentElementImpl <em>Experiment Element</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExperimentElementImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getExperimentElement()
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
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ProcessImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getProcess()
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
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROCESS__ROLE = 1;

  /**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROCESS__ACTIVITIES = 2;

  /**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROCESS_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ActivityImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getActivity()
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
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY__ROLE = 3;

  /**
	 * The feature id for the '<em><b>Collect Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY__COLLECT_DATA = 4;

  /**
	 * The feature id for the '<em><b>Artefacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY__ARTEFACTS = 5;

  /**
	 * The feature id for the '<em><b>Questionnaire</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY__QUESTIONNAIRE = 6;

  /**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY__TASKS = 7;

  /**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY_FEATURE_COUNT = 8;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.TaskImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getTask()
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
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK__VAR = 2;

  /**
	 * The feature id for the '<em><b>Artefacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK__ARTEFACTS = 3;

  /**
	 * The feature id for the '<em><b>Questionnaire</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK__QUESTIONNAIRE = 4;

  /**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK_FEATURE_COUNT = 5;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.RoleImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getRole()
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
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ArtefactImpl <em>Artefact</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ArtefactImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getArtefact()
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
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.MetricsImpl <em>Metrics</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.MetricsImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getMetrics()
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
	 * The feature id for the '<em><b>Detail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int METRICS__DETAIL = 3;

  /**
	 * The number of structural features of the '<em>Metrics</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int METRICS_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.DetailImpl <em>Detail</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.DetailImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getDetail()
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
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.TimeMetricImpl <em>Time Metric</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.TimeMetricImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getTimeMetric()
	 * @generated
	 */
  int TIME_METRIC = 9;

  /**
	 * The number of structural features of the '<em>Time Metric</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIME_METRIC_FEATURE_COUNT = DETAIL_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ActivityMetricImpl <em>Activity Metric</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ActivityMetricImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getActivityMetric()
	 * @generated
	 */
  int ACTIVITY_METRIC = 10;

  /**
	 * The feature id for the '<em><b>Activity Begin</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY_METRIC__ACTIVITY_BEGIN = TIME_METRIC_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Activity End</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY_METRIC__ACTIVITY_END = TIME_METRIC_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Activity Metric</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY_METRIC_FEATURE_COUNT = TIME_METRIC_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.TaskMetricImpl <em>Task Metric</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.TaskMetricImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getTaskMetric()
	 * @generated
	 */
  int TASK_METRIC = 11;

  /**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK_METRIC__TASKS = TIME_METRIC_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Task Metric</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK_METRIC_FEATURE_COUNT = TIME_METRIC_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.DataMetricImpl <em>Data Metric</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.DataMetricImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getDataMetric()
	 * @generated
	 */
  int DATA_METRIC = 12;

  /**
	 * The feature id for the '<em><b>Collected Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATA_METRIC__COLLECTED_DATA = DETAIL_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATA_METRIC__DATA_TYPE = DETAIL_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Artefacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATA_METRIC__ARTEFACTS = DETAIL_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Questionnaires</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATA_METRIC__QUESTIONNAIRES = DETAIL_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Data Metric</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATA_METRIC_FEATURE_COUNT = DETAIL_FEATURE_COUNT + 4;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.CollectedDataImpl <em>Collected Data</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.CollectedDataImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getCollectedData()
	 * @generated
	 */
  int COLLECTED_DATA = 13;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTED_DATA__NAME = 0;

  /**
	 * The number of structural features of the '<em>Collected Data</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTED_DATA_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ExperimentalPlanImpl <em>Experimental Plan</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExperimentalPlanImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getExperimentalPlan()
	 * @generated
	 */
  int EXPERIMENTAL_PLAN = 14;

  /**
	 * The feature id for the '<em><b>Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_PLAN__GOAL = 0;

  /**
	 * The feature id for the '<em><b>Hypotheses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_PLAN__HYPOTHESES = 1;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_PLAN__TYPE = 2;

  /**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_PLAN__PARAMETER = 3;

  /**
	 * The feature id for the '<em><b>Dependent Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_PLAN__DEPENDENT_VARIABLE = 4;

  /**
	 * The feature id for the '<em><b>Factor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_PLAN__FACTOR = 5;

  /**
	 * The feature id for the '<em><b>Technique</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_PLAN__TECHNIQUE = 6;

  /**
	 * The feature id for the '<em><b>Internal Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_PLAN__INTERNAL_REPLICATION = 7;

  /**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_PLAN__LINK = 8;

  /**
	 * The number of structural features of the '<em>Experimental Plan</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_PLAN_FEATURE_COUNT = 9;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.GoalImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getGoal()
	 * @generated
	 */
  int GOAL = 15;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GOAL__NAME = 0;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GOAL__DESCRIPTION = 1;

  /**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GOAL_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.HypothesesImpl <em>Hypotheses</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.HypothesesImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getHypotheses()
	 * @generated
	 */
  int HYPOTHESES = 16;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HYPOTHESES__NAME = 0;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HYPOTHESES__DESCRIPTION = 1;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HYPOTHESES__TYPE = 2;

  /**
	 * The feature id for the '<em><b>From Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HYPOTHESES__FROM_GOAL = 3;

  /**
	 * The feature id for the '<em><b>Subhypotheses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HYPOTHESES__SUBHYPOTHESES = 4;

  /**
	 * The number of structural features of the '<em>Hypotheses</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HYPOTHESES_FEATURE_COUNT = 5;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.SubhypothesesImpl <em>Subhypotheses</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.SubhypothesesImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getSubhypotheses()
	 * @generated
	 */
  int SUBHYPOTHESES = 17;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBHYPOTHESES__NAME = 0;

  /**
	 * The feature id for the '<em><b>Dependent Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBHYPOTHESES__DEPENDENT_VARIABLE = 1;

  /**
	 * The feature id for the '<em><b>Levels</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBHYPOTHESES__LEVELS = 2;

  /**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBHYPOTHESES__OPERATOR = 3;

  /**
	 * The feature id for the '<em><b>Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBHYPOTHESES__RELATION = 4;

  /**
	 * The feature id for the '<em><b>Factor</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBHYPOTHESES__FACTOR = 5;

  /**
	 * The number of structural features of the '<em>Subhypotheses</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBHYPOTHESES_FEATURE_COUNT = 6;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ParameterImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getParameter()
	 * @generated
	 */
  int PARAMETER = 18;

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
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.DependentVariableImpl <em>Dependent Variable</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.DependentVariableImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getDependentVariable()
	 * @generated
	 */
  int DEPENDENT_VARIABLE = 19;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEPENDENT_VARIABLE__NAME = 0;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEPENDENT_VARIABLE__DESCRIPTION = 1;

  /**
	 * The feature id for the '<em><b>Metrics</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEPENDENT_VARIABLE__METRICS = 2;

  /**
	 * The number of structural features of the '<em>Dependent Variable</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEPENDENT_VARIABLE_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.FactorImpl <em>Factor</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.FactorImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getFactor()
	 * @generated
	 */
  int FACTOR = 20;

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
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.LevelsImpl <em>Levels</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.LevelsImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getLevels()
	 * @generated
	 */
  int LEVELS = 21;

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
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.LinkImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getLink()
	 * @generated
	 */
  int LINK = 22;

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
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.QuestionnaireImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getQuestionnaire()
	 * @generated
	 */
  int QUESTIONNAIRE = 23;

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
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.QuestionImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getQuestion()
	 * @generated
	 */
  int QUESTION = 24;

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
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.AlternativesImpl <em>Alternatives</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.AlternativesImpl
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getAlternatives()
	 * @generated
	 */
  int ALTERNATIVES = 25;

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
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.ArtefactType <em>Artefact Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ArtefactType
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getArtefactType()
	 * @generated
	 */
  int ARTEFACT_TYPE = 26;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.DataType
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getDataType()
	 * @generated
	 */
  int DATA_TYPE = 27;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.RelationType <em>Relation Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.RelationType
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getRelationType()
	 * @generated
	 */
  int RELATION_TYPE = 28;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.OperatorType <em>Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.OperatorType
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getOperatorType()
	 * @generated
	 */
  int OPERATOR_TYPE = 29;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.HypothesisType <em>Hypothesis Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.HypothesisType
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getHypothesisType()
	 * @generated
	 */
  int HYPOTHESIS_TYPE = 30;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.DesignType <em>Design Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.DesignType
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getDesignType()
	 * @generated
	 */
  int DESIGN_TYPE = 31;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.AnalysisTechiqueType <em>Analysis Techique Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.AnalysisTechiqueType
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getAnalysisTechiqueType()
	 * @generated
	 */
  int ANALYSIS_TECHIQUE_TYPE = 32;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.QuestionnaireType <em>Questionnaire Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.QuestionnaireType
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getQuestionnaireType()
	 * @generated
	 */
  int QUESTIONNAIRE_TYPE = 33;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.AnswerType <em>Answer Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.AnswerType
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getAnswerType()
	 * @generated
	 */
  int ANSWER_TYPE = 34;


  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Model
	 * @generated
	 */
  EClass getModel();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Model#getElements()
	 * @see #getModel()
	 * @generated
	 */
  EReference getModel_Elements();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement <em>Experiment Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Element</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement
	 * @generated
	 */
  EClass getExperimentElement();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement#getName()
	 * @see #getExperimentElement()
	 * @generated
	 */
  EAttribute getExperimentElement_Name();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement#getProcess()
	 * @see #getExperimentElement()
	 * @generated
	 */
  EReference getExperimentElement_Process();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement#getMetrics()
	 * @see #getExperimentElement()
	 * @generated
	 */
  EReference getExperimentElement_Metrics();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement#getExperiments <em>Experiments</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Experiments</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement#getExperiments()
	 * @see #getExperimentElement()
	 * @generated
	 */
  EReference getExperimentElement_Experiments();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement#getQuestionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questionnaire</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement#getQuestionnaire()
	 * @see #getExperimentElement()
	 * @generated
	 */
  EReference getExperimentElement_Questionnaire();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Process
	 * @generated
	 */
  EClass getProcess();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
  EAttribute getProcess_Name();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Process#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Process#getRole()
	 * @see #getProcess()
	 * @generated
	 */
  EReference getProcess_Role();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Process#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Process#getActivities()
	 * @see #getProcess()
	 * @generated
	 */
  EReference getProcess_Activities();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Activity
	 * @generated
	 */
  EClass getActivity();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
  EAttribute getActivity_Name();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Activity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Activity#getDescription()
	 * @see #getActivity()
	 * @generated
	 */
  EAttribute getActivity_Description();

  /**
	 * Returns the meta object for the reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Activity#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Activity#getNext()
	 * @see #getActivity()
	 * @generated
	 */
  EReference getActivity_Next();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Activity#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Activity#getRole()
	 * @see #getActivity()
	 * @generated
	 */
  EReference getActivity_Role();

  /**
	 * Returns the meta object for the reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Activity#getCollectData <em>Collect Data</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Collect Data</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Activity#getCollectData()
	 * @see #getActivity()
	 * @generated
	 */
  EReference getActivity_CollectData();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Activity#getArtefacts <em>Artefacts</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artefacts</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Activity#getArtefacts()
	 * @see #getActivity()
	 * @generated
	 */
  EReference getActivity_Artefacts();

  /**
	 * Returns the meta object for the reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Activity#getQuestionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Questionnaire</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Activity#getQuestionnaire()
	 * @see #getActivity()
	 * @generated
	 */
  EReference getActivity_Questionnaire();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Activity#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Activity#getTasks()
	 * @see #getActivity()
	 * @generated
	 */
  EReference getActivity_Tasks();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Task
	 * @generated
	 */
  EClass getTask();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
  EAttribute getTask_Name();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
  EAttribute getTask_Description();

  /**
	 * Returns the meta object for the reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Task#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Var</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Task#getVar()
	 * @see #getTask()
	 * @generated
	 */
  EReference getTask_Var();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Task#getArtefacts <em>Artefacts</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artefacts</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Task#getArtefacts()
	 * @see #getTask()
	 * @generated
	 */
  EReference getTask_Artefacts();

  /**
	 * Returns the meta object for the reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Task#getQuestionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Questionnaire</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Task#getQuestionnaire()
	 * @see #getTask()
	 * @generated
	 */
  EReference getTask_Questionnaire();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Role
	 * @generated
	 */
  EClass getRole();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
  EAttribute getRole_Name();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Artefact <em>Artefact</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artefact</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Artefact
	 * @generated
	 */
  EClass getArtefact();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Artefact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Artefact#getName()
	 * @see #getArtefact()
	 * @generated
	 */
  EAttribute getArtefact_Name();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Artefact#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Artefact#getDescription()
	 * @see #getArtefact()
	 * @generated
	 */
  EAttribute getArtefact_Description();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Artefact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Artefact#getType()
	 * @see #getArtefact()
	 * @generated
	 */
  EAttribute getArtefact_Type();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Metrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metrics</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Metrics
	 * @generated
	 */
  EClass getMetrics();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Metrics#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Metrics#getName()
	 * @see #getMetrics()
	 * @generated
	 */
  EAttribute getMetrics_Name();

  /**
	 * Returns the meta object for the reference '{@link br.ufrn.dimap.ase.dsl.expDslv2.Metrics#getRelatesTo <em>Relates To</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relates To</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Metrics#getRelatesTo()
	 * @see #getMetrics()
	 * @generated
	 */
  EReference getMetrics_RelatesTo();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Metrics#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Metrics#getDescription()
	 * @see #getMetrics()
	 * @generated
	 */
  EAttribute getMetrics_Description();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Metrics#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Detail</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Metrics#getDetail()
	 * @see #getMetrics()
	 * @generated
	 */
  EReference getMetrics_Detail();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Detail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detail</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Detail
	 * @generated
	 */
  EClass getDetail();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.TimeMetric <em>Time Metric</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Metric</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.TimeMetric
	 * @generated
	 */
  EClass getTimeMetric();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.ActivityMetric <em>Activity Metric</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Metric</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ActivityMetric
	 * @generated
	 */
  EClass getActivityMetric();

  /**
	 * Returns the meta object for the reference '{@link br.ufrn.dimap.ase.dsl.expDslv2.ActivityMetric#getActivityBegin <em>Activity Begin</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity Begin</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ActivityMetric#getActivityBegin()
	 * @see #getActivityMetric()
	 * @generated
	 */
  EReference getActivityMetric_ActivityBegin();

  /**
	 * Returns the meta object for the reference '{@link br.ufrn.dimap.ase.dsl.expDslv2.ActivityMetric#getActivityEnd <em>Activity End</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity End</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ActivityMetric#getActivityEnd()
	 * @see #getActivityMetric()
	 * @generated
	 */
  EReference getActivityMetric_ActivityEnd();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.TaskMetric <em>Task Metric</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Metric</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.TaskMetric
	 * @generated
	 */
  EClass getTaskMetric();

  /**
	 * Returns the meta object for the reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.TaskMetric#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.TaskMetric#getTasks()
	 * @see #getTaskMetric()
	 * @generated
	 */
  EReference getTaskMetric_Tasks();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.DataMetric <em>Data Metric</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Metric</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.DataMetric
	 * @generated
	 */
  EClass getDataMetric();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.DataMetric#getCollectedData <em>Collected Data</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collected Data</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.DataMetric#getCollectedData()
	 * @see #getDataMetric()
	 * @generated
	 */
  EReference getDataMetric_CollectedData();

  /**
	 * Returns the meta object for the attribute list '{@link br.ufrn.dimap.ase.dsl.expDslv2.DataMetric#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.DataMetric#getDataType()
	 * @see #getDataMetric()
	 * @generated
	 */
  EAttribute getDataMetric_DataType();

  /**
	 * Returns the meta object for the reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.DataMetric#getArtefacts <em>Artefacts</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Artefacts</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.DataMetric#getArtefacts()
	 * @see #getDataMetric()
	 * @generated
	 */
  EReference getDataMetric_Artefacts();

  /**
	 * Returns the meta object for the reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.DataMetric#getQuestionnaires <em>Questionnaires</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Questionnaires</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.DataMetric#getQuestionnaires()
	 * @see #getDataMetric()
	 * @generated
	 */
  EReference getDataMetric_Questionnaires();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.CollectedData <em>Collected Data</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collected Data</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.CollectedData
	 * @generated
	 */
  EClass getCollectedData();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.CollectedData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.CollectedData#getName()
	 * @see #getCollectedData()
	 * @generated
	 */
  EAttribute getCollectedData_Name();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan <em>Experimental Plan</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experimental Plan</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan
	 * @generated
	 */
  EClass getExperimentalPlan();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goal</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getGoal()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
  EReference getExperimentalPlan_Goal();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getHypotheses <em>Hypotheses</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hypotheses</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getHypotheses()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
  EReference getExperimentalPlan_Hypotheses();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getType()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
  EAttribute getExperimentalPlan_Type();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getParameter()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
  EReference getExperimentalPlan_Parameter();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getDependentVariable <em>Dependent Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependent Variable</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getDependentVariable()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
  EReference getExperimentalPlan_DependentVariable();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Factor</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getFactor()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
  EReference getExperimentalPlan_Factor();

  /**
	 * Returns the meta object for the attribute list '{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getTechnique <em>Technique</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Technique</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getTechnique()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
  EAttribute getExperimentalPlan_Technique();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getInternalReplication <em>Internal Replication</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Replication</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getInternalReplication()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
  EAttribute getExperimentalPlan_InternalReplication();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan#getLink()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
  EReference getExperimentalPlan_Link();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Goal
	 * @generated
	 */
  EClass getGoal();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Goal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Goal#getName()
	 * @see #getGoal()
	 * @generated
	 */
  EAttribute getGoal_Name();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Goal#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Goal#getDescription()
	 * @see #getGoal()
	 * @generated
	 */
  EAttribute getGoal_Description();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses <em>Hypotheses</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hypotheses</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses
	 * @generated
	 */
  EClass getHypotheses();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getName()
	 * @see #getHypotheses()
	 * @generated
	 */
  EAttribute getHypotheses_Name();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getDescription()
	 * @see #getHypotheses()
	 * @generated
	 */
  EAttribute getHypotheses_Description();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getType()
	 * @see #getHypotheses()
	 * @generated
	 */
  EAttribute getHypotheses_Type();

  /**
	 * Returns the meta object for the reference '{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getFromGoal <em>From Goal</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Goal</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getFromGoal()
	 * @see #getHypotheses()
	 * @generated
	 */
  EReference getHypotheses_FromGoal();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getSubhypotheses <em>Subhypotheses</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subhypotheses</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getSubhypotheses()
	 * @see #getHypotheses()
	 * @generated
	 */
  EReference getHypotheses_Subhypotheses();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses <em>Subhypotheses</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subhypotheses</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses
	 * @generated
	 */
  EClass getSubhypotheses();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses#getName()
	 * @see #getSubhypotheses()
	 * @generated
	 */
  EAttribute getSubhypotheses_Name();

  /**
	 * Returns the meta object for the reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses#getDependentVariable <em>Dependent Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependent Variable</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses#getDependentVariable()
	 * @see #getSubhypotheses()
	 * @generated
	 */
  EReference getSubhypotheses_DependentVariable();

  /**
	 * Returns the meta object for the reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Levels</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses#getLevels()
	 * @see #getSubhypotheses()
	 * @generated
	 */
  EReference getSubhypotheses_Levels();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses#getOperator()
	 * @see #getSubhypotheses()
	 * @generated
	 */
  EAttribute getSubhypotheses_Operator();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses#getRelation()
	 * @see #getSubhypotheses()
	 * @generated
	 */
  EAttribute getSubhypotheses_Relation();

  /**
	 * Returns the meta object for the reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Factor</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses#getFactor()
	 * @see #getSubhypotheses()
	 * @generated
	 */
  EReference getSubhypotheses_Factor();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Parameter
	 * @generated
	 */
  EClass getParameter();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Parameter#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Parameter#getVariable()
	 * @see #getParameter()
	 * @generated
	 */
  EAttribute getParameter_Variable();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
  EAttribute getParameter_Value();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.DependentVariable <em>Dependent Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Variable</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.DependentVariable
	 * @generated
	 */
  EClass getDependentVariable();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.DependentVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.DependentVariable#getName()
	 * @see #getDependentVariable()
	 * @generated
	 */
  EAttribute getDependentVariable_Name();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.DependentVariable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.DependentVariable#getDescription()
	 * @see #getDependentVariable()
	 * @generated
	 */
  EAttribute getDependentVariable_Description();

  /**
	 * Returns the meta object for the reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.DependentVariable#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metrics</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.DependentVariable#getMetrics()
	 * @see #getDependentVariable()
	 * @generated
	 */
  EReference getDependentVariable_Metrics();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Factor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factor</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Factor
	 * @generated
	 */
  EClass getFactor();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Factor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Factor#getName()
	 * @see #getFactor()
	 * @generated
	 */
  EAttribute getFactor_Name();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Factor#getIsDesiredVariation <em>Is Desired Variation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Desired Variation</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Factor#getIsDesiredVariation()
	 * @see #getFactor()
	 * @generated
	 */
  EAttribute getFactor_IsDesiredVariation();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Factor#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Factor#getLevel()
	 * @see #getFactor()
	 * @generated
	 */
  EReference getFactor_Level();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Levels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Levels</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Levels
	 * @generated
	 */
  EClass getLevels();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Levels#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Levels#getName()
	 * @see #getLevels()
	 * @generated
	 */
  EAttribute getLevels_Name();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Link
	 * @generated
	 */
  EClass getLink();

  /**
	 * Returns the meta object for the reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Link#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedure</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Link#getProcedure()
	 * @see #getLink()
	 * @generated
	 */
  EReference getLink_Procedure();

  /**
	 * Returns the meta object for the reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Link#getTreatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Treatment</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Link#getTreatment()
	 * @see #getLink()
	 * @generated
	 */
  EReference getLink_Treatment();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnaire</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire
	 * @generated
	 */
  EClass getQuestionnaire();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire#getName()
	 * @see #getQuestionnaire()
	 * @generated
	 */
  EAttribute getQuestionnaire_Name();

  /**
	 * Returns the meta object for the reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire#getRelatesTo <em>Relates To</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relates To</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire#getRelatesTo()
	 * @see #getQuestionnaire()
	 * @generated
	 */
  EReference getQuestionnaire_RelatesTo();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire#getQuestionnaireType <em>Questionnaire Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Questionnaire Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire#getQuestionnaireType()
	 * @see #getQuestionnaire()
	 * @generated
	 */
  EAttribute getQuestionnaire_QuestionnaireType();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire#getQuestion()
	 * @see #getQuestionnaire()
	 * @generated
	 */
  EReference getQuestionnaire_Question();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Question
	 * @generated
	 */
  EClass getQuestion();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Question#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Question#getName()
	 * @see #getQuestion()
	 * @generated
	 */
  EAttribute getQuestion_Name();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Question#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Question#getDescription()
	 * @see #getQuestion()
	 * @generated
	 */
  EAttribute getQuestion_Description();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Question#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Question#getType()
	 * @see #getQuestion()
	 * @generated
	 */
  EAttribute getQuestion_Type();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Question#getReq <em>Req</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Question#getReq()
	 * @see #getQuestion()
	 * @generated
	 */
  EAttribute getQuestion_Req();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expDslv2.Question#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternatives</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Question#getAlternatives()
	 * @see #getQuestion()
	 * @generated
	 */
  EReference getQuestion_Alternatives();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Alternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternatives</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Alternatives
	 * @generated
	 */
  EClass getAlternatives();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expDslv2.Alternatives#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Alternatives#getDescription()
	 * @see #getAlternatives()
	 * @generated
	 */
  EAttribute getAlternatives_Description();

  /**
	 * Returns the meta object for enum '{@link br.ufrn.dimap.ase.dsl.expDslv2.ArtefactType <em>Artefact Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Artefact Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ArtefactType
	 * @generated
	 */
  EEnum getArtefactType();

  /**
	 * Returns the meta object for enum '{@link br.ufrn.dimap.ase.dsl.expDslv2.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.DataType
	 * @generated
	 */
  EEnum getDataType();

  /**
	 * Returns the meta object for enum '{@link br.ufrn.dimap.ase.dsl.expDslv2.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.RelationType
	 * @generated
	 */
  EEnum getRelationType();

  /**
	 * Returns the meta object for enum '{@link br.ufrn.dimap.ase.dsl.expDslv2.OperatorType <em>Operator Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.OperatorType
	 * @generated
	 */
  EEnum getOperatorType();

  /**
	 * Returns the meta object for enum '{@link br.ufrn.dimap.ase.dsl.expDslv2.HypothesisType <em>Hypothesis Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hypothesis Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.HypothesisType
	 * @generated
	 */
  EEnum getHypothesisType();

  /**
	 * Returns the meta object for enum '{@link br.ufrn.dimap.ase.dsl.expDslv2.DesignType <em>Design Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Design Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.DesignType
	 * @generated
	 */
  EEnum getDesignType();

  /**
	 * Returns the meta object for enum '{@link br.ufrn.dimap.ase.dsl.expDslv2.AnalysisTechiqueType <em>Analysis Techique Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Analysis Techique Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.AnalysisTechiqueType
	 * @generated
	 */
  EEnum getAnalysisTechiqueType();

  /**
	 * Returns the meta object for enum '{@link br.ufrn.dimap.ase.dsl.expDslv2.QuestionnaireType <em>Questionnaire Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Questionnaire Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.QuestionnaireType
	 * @generated
	 */
  EEnum getQuestionnaireType();

  /**
	 * Returns the meta object for enum '{@link br.ufrn.dimap.ase.dsl.expDslv2.AnswerType <em>Answer Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Answer Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.AnswerType
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
  ExpDslv2Factory getExpDslv2Factory();

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
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ModelImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getModel()
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
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ExperimentElementImpl <em>Experiment Element</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExperimentElementImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getExperimentElement()
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
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ProcessImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getProcess()
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
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference PROCESS__ROLE = eINSTANCE.getProcess_Role();

    /**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference PROCESS__ACTIVITIES = eINSTANCE.getProcess_Activities();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ActivityImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getActivity()
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
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ACTIVITY__ROLE = eINSTANCE.getActivity_Role();

    /**
		 * The meta object literal for the '<em><b>Collect Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ACTIVITY__COLLECT_DATA = eINSTANCE.getActivity_CollectData();

    /**
		 * The meta object literal for the '<em><b>Artefacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ACTIVITY__ARTEFACTS = eINSTANCE.getActivity_Artefacts();

    /**
		 * The meta object literal for the '<em><b>Questionnaire</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ACTIVITY__QUESTIONNAIRE = eINSTANCE.getActivity_Questionnaire();

    /**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ACTIVITY__TASKS = eINSTANCE.getActivity_Tasks();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.TaskImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getTask()
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
		 * The meta object literal for the '<em><b>Var</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TASK__VAR = eINSTANCE.getTask_Var();

    /**
		 * The meta object literal for the '<em><b>Artefacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TASK__ARTEFACTS = eINSTANCE.getTask_Artefacts();

    /**
		 * The meta object literal for the '<em><b>Questionnaire</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TASK__QUESTIONNAIRE = eINSTANCE.getTask_Questionnaire();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.RoleImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getRole()
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
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ArtefactImpl <em>Artefact</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ArtefactImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getArtefact()
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
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.MetricsImpl <em>Metrics</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.MetricsImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getMetrics()
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
		 * The meta object literal for the '<em><b>Detail</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference METRICS__DETAIL = eINSTANCE.getMetrics_Detail();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.DetailImpl <em>Detail</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.DetailImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getDetail()
		 * @generated
		 */
    EClass DETAIL = eINSTANCE.getDetail();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.TimeMetricImpl <em>Time Metric</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.TimeMetricImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getTimeMetric()
		 * @generated
		 */
    EClass TIME_METRIC = eINSTANCE.getTimeMetric();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ActivityMetricImpl <em>Activity Metric</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ActivityMetricImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getActivityMetric()
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
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.TaskMetricImpl <em>Task Metric</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.TaskMetricImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getTaskMetric()
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
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.DataMetricImpl <em>Data Metric</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.DataMetricImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getDataMetric()
		 * @generated
		 */
    EClass DATA_METRIC = eINSTANCE.getDataMetric();

    /**
		 * The meta object literal for the '<em><b>Collected Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DATA_METRIC__COLLECTED_DATA = eINSTANCE.getDataMetric_CollectedData();

    /**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DATA_METRIC__DATA_TYPE = eINSTANCE.getDataMetric_DataType();

    /**
		 * The meta object literal for the '<em><b>Artefacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DATA_METRIC__ARTEFACTS = eINSTANCE.getDataMetric_Artefacts();

    /**
		 * The meta object literal for the '<em><b>Questionnaires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DATA_METRIC__QUESTIONNAIRES = eINSTANCE.getDataMetric_Questionnaires();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.CollectedDataImpl <em>Collected Data</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.CollectedDataImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getCollectedData()
		 * @generated
		 */
    EClass COLLECTED_DATA = eINSTANCE.getCollectedData();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute COLLECTED_DATA__NAME = eINSTANCE.getCollectedData_Name();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ExperimentalPlanImpl <em>Experimental Plan</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExperimentalPlanImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getExperimentalPlan()
		 * @generated
		 */
    EClass EXPERIMENTAL_PLAN = eINSTANCE.getExperimentalPlan();

    /**
		 * The meta object literal for the '<em><b>Goal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENTAL_PLAN__GOAL = eINSTANCE.getExperimentalPlan_Goal();

    /**
		 * The meta object literal for the '<em><b>Hypotheses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENTAL_PLAN__HYPOTHESES = eINSTANCE.getExperimentalPlan_Hypotheses();

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
		 * The meta object literal for the '<em><b>Dependent Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENTAL_PLAN__DEPENDENT_VARIABLE = eINSTANCE.getExperimentalPlan_DependentVariable();

    /**
		 * The meta object literal for the '<em><b>Factor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENTAL_PLAN__FACTOR = eINSTANCE.getExperimentalPlan_Factor();

    /**
		 * The meta object literal for the '<em><b>Technique</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EXPERIMENTAL_PLAN__TECHNIQUE = eINSTANCE.getExperimentalPlan_Technique();

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
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.GoalImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getGoal()
		 * @generated
		 */
    EClass GOAL = eINSTANCE.getGoal();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GOAL__NAME = eINSTANCE.getGoal_Name();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GOAL__DESCRIPTION = eINSTANCE.getGoal_Description();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.HypothesesImpl <em>Hypotheses</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.HypothesesImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getHypotheses()
		 * @generated
		 */
    EClass HYPOTHESES = eINSTANCE.getHypotheses();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute HYPOTHESES__NAME = eINSTANCE.getHypotheses_Name();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute HYPOTHESES__DESCRIPTION = eINSTANCE.getHypotheses_Description();

    /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute HYPOTHESES__TYPE = eINSTANCE.getHypotheses_Type();

    /**
		 * The meta object literal for the '<em><b>From Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference HYPOTHESES__FROM_GOAL = eINSTANCE.getHypotheses_FromGoal();

    /**
		 * The meta object literal for the '<em><b>Subhypotheses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference HYPOTHESES__SUBHYPOTHESES = eINSTANCE.getHypotheses_Subhypotheses();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.SubhypothesesImpl <em>Subhypotheses</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.SubhypothesesImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getSubhypotheses()
		 * @generated
		 */
    EClass SUBHYPOTHESES = eINSTANCE.getSubhypotheses();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SUBHYPOTHESES__NAME = eINSTANCE.getSubhypotheses_Name();

    /**
		 * The meta object literal for the '<em><b>Dependent Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SUBHYPOTHESES__DEPENDENT_VARIABLE = eINSTANCE.getSubhypotheses_DependentVariable();

    /**
		 * The meta object literal for the '<em><b>Levels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SUBHYPOTHESES__LEVELS = eINSTANCE.getSubhypotheses_Levels();

    /**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SUBHYPOTHESES__OPERATOR = eINSTANCE.getSubhypotheses_Operator();

    /**
		 * The meta object literal for the '<em><b>Relation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SUBHYPOTHESES__RELATION = eINSTANCE.getSubhypotheses_Relation();

    /**
		 * The meta object literal for the '<em><b>Factor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SUBHYPOTHESES__FACTOR = eINSTANCE.getSubhypotheses_Factor();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ParameterImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getParameter()
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
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.DependentVariableImpl <em>Dependent Variable</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.DependentVariableImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getDependentVariable()
		 * @generated
		 */
    EClass DEPENDENT_VARIABLE = eINSTANCE.getDependentVariable();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DEPENDENT_VARIABLE__NAME = eINSTANCE.getDependentVariable_Name();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DEPENDENT_VARIABLE__DESCRIPTION = eINSTANCE.getDependentVariable_Description();

    /**
		 * The meta object literal for the '<em><b>Metrics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DEPENDENT_VARIABLE__METRICS = eINSTANCE.getDependentVariable_Metrics();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.FactorImpl <em>Factor</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.FactorImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getFactor()
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
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.LevelsImpl <em>Levels</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.LevelsImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getLevels()
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
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.LinkImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getLink()
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
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.QuestionnaireImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getQuestionnaire()
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
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.QuestionImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getQuestion()
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
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.AlternativesImpl <em>Alternatives</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.AlternativesImpl
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getAlternatives()
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
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.ArtefactType <em>Artefact Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.ArtefactType
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getArtefactType()
		 * @generated
		 */
    EEnum ARTEFACT_TYPE = eINSTANCE.getArtefactType();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.DataType
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getDataType()
		 * @generated
		 */
    EEnum DATA_TYPE = eINSTANCE.getDataType();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.RelationType <em>Relation Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.RelationType
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getRelationType()
		 * @generated
		 */
    EEnum RELATION_TYPE = eINSTANCE.getRelationType();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.OperatorType <em>Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.OperatorType
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getOperatorType()
		 * @generated
		 */
    EEnum OPERATOR_TYPE = eINSTANCE.getOperatorType();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.HypothesisType <em>Hypothesis Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.HypothesisType
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getHypothesisType()
		 * @generated
		 */
    EEnum HYPOTHESIS_TYPE = eINSTANCE.getHypothesisType();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.DesignType <em>Design Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.DesignType
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getDesignType()
		 * @generated
		 */
    EEnum DESIGN_TYPE = eINSTANCE.getDesignType();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.AnalysisTechiqueType <em>Analysis Techique Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.AnalysisTechiqueType
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getAnalysisTechiqueType()
		 * @generated
		 */
    EEnum ANALYSIS_TECHIQUE_TYPE = eINSTANCE.getAnalysisTechiqueType();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.QuestionnaireType <em>Questionnaire Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.QuestionnaireType
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getQuestionnaireType()
		 * @generated
		 */
    EEnum QUESTIONNAIRE_TYPE = eINSTANCE.getQuestionnaireType();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expDslv2.AnswerType <em>Answer Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.AnswerType
		 * @see br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2PackageImpl#getAnswerType()
		 * @generated
		 */
    EEnum ANSWER_TYPE = eINSTANCE.getAnswerType();

  }

} //ExpDslv2Package

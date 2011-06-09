/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MetricModel;

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
 * @see MetricModel.MetricModelFactory
 * @model kind="package"
 * @generated
 */
public interface MetricModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MetricModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Metrica";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Metrica";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetricModelPackage eINSTANCE = MetricModel.impl.MetricModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link MetricModel.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetricModel.impl.MetricImpl
	 * @see MetricModel.impl.MetricModelPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__FORM = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__ID = 4;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__UNIT = 5;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link MetricModel.impl.ActivityMetricImpl <em>Activity Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetricModel.impl.ActivityMetricImpl
	 * @see MetricModel.impl.MetricModelPackageImpl#getActivityMetric()
	 * @generated
	 */
	int ACTIVITY_METRIC = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_METRIC__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_METRIC__DESCRIPTION = METRIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_METRIC__TYPE = METRIC__TYPE;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_METRIC__FORM = METRIC__FORM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_METRIC__ID = METRIC__ID;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_METRIC__UNIT = METRIC__UNIT;

	/**
	 * The feature id for the '<em><b>Activity Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_METRIC__ACTIVITY_BEGIN = METRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_METRIC__ACTIVITY_END = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_METRIC_FEATURE_COUNT = METRIC_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link MetricModel.impl.TaskMetricImpl <em>Task Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetricModel.impl.TaskMetricImpl
	 * @see MetricModel.impl.MetricModelPackageImpl#getTaskMetric()
	 * @generated
	 */
	int TASK_METRIC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_METRIC__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_METRIC__DESCRIPTION = METRIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_METRIC__TYPE = METRIC__TYPE;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_METRIC__FORM = METRIC__FORM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_METRIC__ID = METRIC__ID;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_METRIC__UNIT = METRIC__UNIT;

	/**
	 * The feature id for the '<em><b>Tasks Base</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_METRIC__TASKS_BASE = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_METRIC_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link MetricModel.impl.MetricPlanModelImpl <em>Metric Plan Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetricModel.impl.MetricPlanModelImpl
	 * @see MetricModel.impl.MetricModelPackageImpl#getMetricPlanModel()
	 * @generated
	 */
	int METRIC_PLAN_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_PLAN_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_PLAN_MODEL__METRICS = 1;

	/**
	 * The number of structural features of the '<em>Metric Plan Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_PLAN_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link MetricModel.MetricType <em>Metric Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetricModel.MetricType
	 * @see MetricModel.impl.MetricModelPackageImpl#getMetricType()
	 * @generated
	 */
	int METRIC_TYPE = 4;

	/**
	 * The meta object id for the '{@link MetricModel.BaseElement <em>Base Element</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetricModel.BaseElement
	 * @see MetricModel.impl.MetricModelPackageImpl#getBaseElement()
	 * @generated
	 */
	int BASE_ELEMENT = 5;

	/**
	 * The meta object id for the '{@link MetricModel.ColectType <em>Colect Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetricModel.ColectType
	 * @see MetricModel.impl.MetricModelPackageImpl#getColectType()
	 * @generated
	 */
	int COLECT_TYPE = 6;

	/**
	 * The meta object id for the '{@link MetricModel.MetricUnit <em>Metric Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetricModel.MetricUnit
	 * @see MetricModel.impl.MetricModelPackageImpl#getMetricUnit()
	 * @generated
	 */
	int METRIC_UNIT = 7;


	/**
	 * Returns the meta object for class '{@link MetricModel.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see MetricModel.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the attribute '{@link MetricModel.Metric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetricModel.Metric#getName()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetricModel.Metric#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MetricModel.Metric#getDescription()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Description();

	/**
	 * Returns the meta object for the attribute '{@link MetricModel.Metric#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MetricModel.Metric#getType()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Type();

	/**
	 * Returns the meta object for the attribute '{@link MetricModel.Metric#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form</em>'.
	 * @see MetricModel.Metric#getForm()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Form();

	/**
	 * Returns the meta object for the attribute '{@link MetricModel.Metric#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetricModel.Metric#getId()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetricModel.Metric#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MetricModel.Metric#getUnit()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Unit();

	/**
	 * Returns the meta object for class '{@link MetricModel.ActivityMetric <em>Activity Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Metric</em>'.
	 * @see MetricModel.ActivityMetric
	 * @generated
	 */
	EClass getActivityMetric();

	/**
	 * Returns the meta object for the attribute '{@link MetricModel.ActivityMetric#getActivityBegin <em>Activity Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Begin</em>'.
	 * @see MetricModel.ActivityMetric#getActivityBegin()
	 * @see #getActivityMetric()
	 * @generated
	 */
	EAttribute getActivityMetric_ActivityBegin();

	/**
	 * Returns the meta object for the attribute '{@link MetricModel.ActivityMetric#getActivityEnd <em>Activity End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity End</em>'.
	 * @see MetricModel.ActivityMetric#getActivityEnd()
	 * @see #getActivityMetric()
	 * @generated
	 */
	EAttribute getActivityMetric_ActivityEnd();

	/**
	 * Returns the meta object for class '{@link MetricModel.TaskMetric <em>Task Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Metric</em>'.
	 * @see MetricModel.TaskMetric
	 * @generated
	 */
	EClass getTaskMetric();

	/**
	 * Returns the meta object for the attribute list '{@link MetricModel.TaskMetric#getTasksBase <em>Tasks Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tasks Base</em>'.
	 * @see MetricModel.TaskMetric#getTasksBase()
	 * @see #getTaskMetric()
	 * @generated
	 */
	EAttribute getTaskMetric_TasksBase();

	/**
	 * Returns the meta object for class '{@link MetricModel.MetricPlanModel <em>Metric Plan Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric Plan Model</em>'.
	 * @see MetricModel.MetricPlanModel
	 * @generated
	 */
	EClass getMetricPlanModel();

	/**
	 * Returns the meta object for the attribute '{@link MetricModel.MetricPlanModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetricModel.MetricPlanModel#getName()
	 * @see #getMetricPlanModel()
	 * @generated
	 */
	EAttribute getMetricPlanModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link MetricModel.MetricPlanModel#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics</em>'.
	 * @see MetricModel.MetricPlanModel#getMetrics()
	 * @see #getMetricPlanModel()
	 * @generated
	 */
	EReference getMetricPlanModel_Metrics();

	/**
	 * Returns the meta object for enum '{@link MetricModel.MetricType <em>Metric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metric Type</em>'.
	 * @see MetricModel.MetricType
	 * @generated
	 */
	EEnum getMetricType();

	/**
	 * Returns the meta object for enum '{@link MetricModel.BaseElement <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Base Element</em>'.
	 * @see MetricModel.BaseElement
	 * @generated
	 */
	EEnum getBaseElement();

	/**
	 * Returns the meta object for enum '{@link MetricModel.ColectType <em>Colect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Colect Type</em>'.
	 * @see MetricModel.ColectType
	 * @generated
	 */
	EEnum getColectType();

	/**
	 * Returns the meta object for enum '{@link MetricModel.MetricUnit <em>Metric Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metric Unit</em>'.
	 * @see MetricModel.MetricUnit
	 * @generated
	 */
	EEnum getMetricUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetricModelFactory getMetricModelFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link MetricModel.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetricModel.impl.MetricImpl
		 * @see MetricModel.impl.MetricModelPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__NAME = eINSTANCE.getMetric_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__DESCRIPTION = eINSTANCE.getMetric_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__TYPE = eINSTANCE.getMetric_Type();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__FORM = eINSTANCE.getMetric_Form();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__ID = eINSTANCE.getMetric_Id();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__UNIT = eINSTANCE.getMetric_Unit();

		/**
		 * The meta object literal for the '{@link MetricModel.impl.ActivityMetricImpl <em>Activity Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetricModel.impl.ActivityMetricImpl
		 * @see MetricModel.impl.MetricModelPackageImpl#getActivityMetric()
		 * @generated
		 */
		EClass ACTIVITY_METRIC = eINSTANCE.getActivityMetric();

		/**
		 * The meta object literal for the '<em><b>Activity Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_METRIC__ACTIVITY_BEGIN = eINSTANCE.getActivityMetric_ActivityBegin();

		/**
		 * The meta object literal for the '<em><b>Activity End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_METRIC__ACTIVITY_END = eINSTANCE.getActivityMetric_ActivityEnd();

		/**
		 * The meta object literal for the '{@link MetricModel.impl.TaskMetricImpl <em>Task Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetricModel.impl.TaskMetricImpl
		 * @see MetricModel.impl.MetricModelPackageImpl#getTaskMetric()
		 * @generated
		 */
		EClass TASK_METRIC = eINSTANCE.getTaskMetric();

		/**
		 * The meta object literal for the '<em><b>Tasks Base</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_METRIC__TASKS_BASE = eINSTANCE.getTaskMetric_TasksBase();

		/**
		 * The meta object literal for the '{@link MetricModel.impl.MetricPlanModelImpl <em>Metric Plan Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetricModel.impl.MetricPlanModelImpl
		 * @see MetricModel.impl.MetricModelPackageImpl#getMetricPlanModel()
		 * @generated
		 */
		EClass METRIC_PLAN_MODEL = eINSTANCE.getMetricPlanModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC_PLAN_MODEL__NAME = eINSTANCE.getMetricPlanModel_Name();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_PLAN_MODEL__METRICS = eINSTANCE.getMetricPlanModel_Metrics();

		/**
		 * The meta object literal for the '{@link MetricModel.MetricType <em>Metric Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetricModel.MetricType
		 * @see MetricModel.impl.MetricModelPackageImpl#getMetricType()
		 * @generated
		 */
		EEnum METRIC_TYPE = eINSTANCE.getMetricType();

		/**
		 * The meta object literal for the '{@link MetricModel.BaseElement <em>Base Element</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetricModel.BaseElement
		 * @see MetricModel.impl.MetricModelPackageImpl#getBaseElement()
		 * @generated
		 */
		EEnum BASE_ELEMENT = eINSTANCE.getBaseElement();

		/**
		 * The meta object literal for the '{@link MetricModel.ColectType <em>Colect Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetricModel.ColectType
		 * @see MetricModel.impl.MetricModelPackageImpl#getColectType()
		 * @generated
		 */
		EEnum COLECT_TYPE = eINSTANCE.getColectType();

		/**
		 * The meta object literal for the '{@link MetricModel.MetricUnit <em>Metric Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetricModel.MetricUnit
		 * @see MetricModel.impl.MetricModelPackageImpl#getMetricUnit()
		 * @generated
		 */
		EEnum METRIC_UNIT = eINSTANCE.getMetricUnit();

	}

} //MetricModelPackage

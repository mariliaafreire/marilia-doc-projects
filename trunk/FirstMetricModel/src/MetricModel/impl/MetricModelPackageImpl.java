/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MetricModel.impl;

import MetricModel.ActivityMetric;
import MetricModel.BaseElement;
import MetricModel.ColectType;
import MetricModel.Metric;
import MetricModel.MetricModelFactory;
import MetricModel.MetricModelPackage;
import MetricModel.MetricModelPlan;
import MetricModel.MetricType;
import MetricModel.MetricUnit;
import MetricModel.TaskMetric;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetricModelPackageImpl extends EPackageImpl implements MetricModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricModelPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metricTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum baseElementEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colectTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metricUnitEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see MetricModel.MetricModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetricModelPackageImpl() {
		super(eNS_URI, MetricModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MetricModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetricModelPackage init() {
		if (isInited) return (MetricModelPackage)EPackage.Registry.INSTANCE.getEPackage(MetricModelPackage.eNS_URI);

		// Obtain or create and register package
		MetricModelPackageImpl theMetricModelPackage = (MetricModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MetricModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MetricModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMetricModelPackage.createPackageContents();

		// Initialize created meta-data
		theMetricModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetricModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetricModelPackage.eNS_URI, theMetricModelPackage);
		return theMetricModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Name() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Description() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Type() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Form() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Id() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Unit() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityMetric() {
		return activityMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityMetric_ActivityBegin() {
		return (EAttribute)activityMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityMetric_ActivityEnd() {
		return (EAttribute)activityMetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskMetric() {
		return taskMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskMetric_TasksBase() {
		return (EAttribute)taskMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricModelPlan() {
		return metricModelPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricModelPlan_Name() {
		return (EAttribute)metricModelPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModelPlan_Metrics() {
		return (EReference)metricModelPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMetricType() {
		return metricTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBaseElement() {
		return baseElementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColectType() {
		return colectTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMetricUnit() {
		return metricUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricModelFactory getMetricModelFactory() {
		return (MetricModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		metricEClass = createEClass(METRIC);
		createEAttribute(metricEClass, METRIC__NAME);
		createEAttribute(metricEClass, METRIC__DESCRIPTION);
		createEAttribute(metricEClass, METRIC__TYPE);
		createEAttribute(metricEClass, METRIC__FORM);
		createEAttribute(metricEClass, METRIC__ID);
		createEAttribute(metricEClass, METRIC__UNIT);

		activityMetricEClass = createEClass(ACTIVITY_METRIC);
		createEAttribute(activityMetricEClass, ACTIVITY_METRIC__ACTIVITY_BEGIN);
		createEAttribute(activityMetricEClass, ACTIVITY_METRIC__ACTIVITY_END);

		taskMetricEClass = createEClass(TASK_METRIC);
		createEAttribute(taskMetricEClass, TASK_METRIC__TASKS_BASE);

		metricModelPlanEClass = createEClass(METRIC_MODEL_PLAN);
		createEAttribute(metricModelPlanEClass, METRIC_MODEL_PLAN__NAME);
		createEReference(metricModelPlanEClass, METRIC_MODEL_PLAN__METRICS);

		// Create enums
		metricTypeEEnum = createEEnum(METRIC_TYPE);
		baseElementEEnum = createEEnum(BASE_ELEMENT);
		colectTypeEEnum = createEEnum(COLECT_TYPE);
		metricUnitEEnum = createEEnum(METRIC_UNIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activityMetricEClass.getESuperTypes().add(this.getMetric());
		taskMetricEClass.getESuperTypes().add(this.getMetric());

		// Initialize classes and features; add operations and parameters
		initEClass(metricEClass, Metric.class, "Metric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetric_Name(), ecorePackage.getEString(), "name", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_Description(), ecorePackage.getEString(), "description", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_Type(), this.getMetricType(), "type", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_Form(), this.getColectType(), "form", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_Unit(), this.getMetricUnit(), "unit", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityMetricEClass, ActivityMetric.class, "ActivityMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityMetric_ActivityBegin(), ecorePackage.getEString(), "activityBegin", null, 0, 1, ActivityMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityMetric_ActivityEnd(), ecorePackage.getEString(), "activityEnd", null, 0, 1, ActivityMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskMetricEClass, TaskMetric.class, "TaskMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskMetric_TasksBase(), ecorePackage.getEString(), "tasksBase", null, 0, -1, TaskMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricModelPlanEClass, MetricModelPlan.class, "MetricModelPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetricModelPlan_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetricModelPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModelPlan_Metrics(), this.getMetric(), null, "metrics", null, 0, -1, MetricModelPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(metricTypeEEnum, MetricType.class, "MetricType");
		addEEnumLiteral(metricTypeEEnum, MetricType.HARD_DATA);
		addEEnumLiteral(metricTypeEEnum, MetricType.SOFT_DATA);
		addEEnumLiteral(metricTypeEEnum, MetricType.NORMALIZED_DATA);

		initEEnum(baseElementEEnum, BaseElement.class, "BaseElement");
		addEEnumLiteral(baseElementEEnum, BaseElement.TASK);
		addEEnumLiteral(baseElementEEnum, BaseElement.ACTIVITY);

		initEEnum(colectTypeEEnum, ColectType.class, "ColectType");
		addEEnumLiteral(colectTypeEEnum, ColectType.CONTINUOUS);
		addEEnumLiteral(colectTypeEEnum, ColectType.INTERCALATED);

		initEEnum(metricUnitEEnum, MetricUnit.class, "MetricUnit");
		addEEnumLiteral(metricUnitEEnum, MetricUnit.HOURS);
		addEEnumLiteral(metricUnitEEnum, MetricUnit.CDU);

		// Create resource
		createResource(eNS_URI);
	}

} //MetricModelPackageImpl

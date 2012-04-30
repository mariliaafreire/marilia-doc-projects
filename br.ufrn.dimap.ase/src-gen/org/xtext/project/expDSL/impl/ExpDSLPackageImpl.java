/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.project.expDSL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.project.expDSL.Activity;
import org.xtext.project.expDSL.ActivityMetric;
import org.xtext.project.expDSL.Alternatives;
import org.xtext.project.expDSL.AnswerType;
import org.xtext.project.expDSL.Artefact;
import org.xtext.project.expDSL.ArtefactMetric;
import org.xtext.project.expDSL.ColectType;
import org.xtext.project.expDSL.DesignType;
import org.xtext.project.expDSL.ExpDSLFactory;
import org.xtext.project.expDSL.ExpDSLPackage;
import org.xtext.project.expDSL.ExperimentElement;
import org.xtext.project.expDSL.ExperimentalPlan;
import org.xtext.project.expDSL.Factor;
import org.xtext.project.expDSL.Levels;
import org.xtext.project.expDSL.MetricType;
import org.xtext.project.expDSL.MetricUnit;
import org.xtext.project.expDSL.Metrics;
import org.xtext.project.expDSL.Model;
import org.xtext.project.expDSL.Questions;
import org.xtext.project.expDSL.Role;
import org.xtext.project.expDSL.Task;
import org.xtext.project.expDSL.TaskMetric;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpDSLPackageImpl extends EPackageImpl implements ExpDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass experimentElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass artefactEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass experimentalPlanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass factorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass levelsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metricsEClass = null;

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
  private EClass artefactMetricEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass questionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alternativesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum designTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum answerTypeEEnum = null;

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
   * @see org.xtext.project.expDSL.ExpDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ExpDSLPackageImpl()
  {
    super(eNS_URI, ExpDSLFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ExpDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ExpDSLPackage init()
  {
    if (isInited) return (ExpDSLPackage)EPackage.Registry.INSTANCE.getEPackage(ExpDSLPackage.eNS_URI);

    // Obtain or create and register package
    ExpDSLPackageImpl theExpDSLPackage = (ExpDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExpDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExpDSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theExpDSLPackage.createPackageContents();

    // Initialize created meta-data
    theExpDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theExpDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ExpDSLPackage.eNS_URI, theExpDSLPackage);
    return theExpDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Elements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExperimentElement()
  {
    return experimentElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExperimentElement_Name()
  {
    return (EAttribute)experimentElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExperimentElement_Process()
  {
    return (EReference)experimentElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExperimentElement_Metrics()
  {
    return (EReference)experimentElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExperimentElement_Experiments()
  {
    return (EReference)experimentElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExperimentElement_Question()
  {
    return (EReference)experimentElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcess()
  {
    return processEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcess_Name()
  {
    return (EAttribute)processEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcess_Activities()
  {
    return (EReference)processEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivity()
  {
    return activityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActivity_Id()
  {
    return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActivity_Artefacts()
  {
    return (EReference)activityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActivity_Name()
  {
    return (EAttribute)activityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActivity_Next()
  {
    return (EAttribute)activityEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActivity_Role()
  {
    return (EReference)activityEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActivity_Tasks()
  {
    return (EReference)activityEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArtefact()
  {
    return artefactEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArtefact_Name()
  {
    return (EAttribute)artefactEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTask()
  {
    return taskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_Name()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRole()
  {
    return roleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRole_Name()
  {
    return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExperimentalPlan()
  {
    return experimentalPlanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExperimentalPlan_Name()
  {
    return (EAttribute)experimentalPlanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExperimentalPlan_Type()
  {
    return (EAttribute)experimentalPlanEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExperimentalPlan_Factor()
  {
    return (EReference)experimentalPlanEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFactor()
  {
    return factorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFactor_Name()
  {
    return (EAttribute)factorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFactor_Level()
  {
    return (EReference)factorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLevels()
  {
    return levelsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLevels_Name()
  {
    return (EAttribute)levelsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetrics()
  {
    return metricsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetrics_Name()
  {
    return (EAttribute)metricsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetrics_RelatesTo()
  {
    return (EReference)metricsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetrics_Description()
  {
    return (EAttribute)metricsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetrics_Type()
  {
    return (EAttribute)metricsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetrics_Form()
  {
    return (EAttribute)metricsEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetrics_Id()
  {
    return (EAttribute)metricsEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetrics_Unit()
  {
    return (EAttribute)metricsEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetrics_Details()
  {
    return (EReference)metricsEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityMetric()
  {
    return activityMetricEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActivityMetric_ActivityBegin()
  {
    return (EAttribute)activityMetricEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActivityMetric_ActivityEnd()
  {
    return (EAttribute)activityMetricEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskMetric()
  {
    return taskMetricEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskMetric_Activities()
  {
    return (EAttribute)taskMetricEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArtefactMetric()
  {
    return artefactMetricEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtefactMetric_Artefact()
  {
    return (EReference)artefactMetricEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuestions()
  {
    return questionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestions_Name()
  {
    return (EAttribute)questionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestions_Description()
  {
    return (EAttribute)questionsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestions_Type()
  {
    return (EAttribute)questionsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestions_Id()
  {
    return (EAttribute)questionsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestions_Req()
  {
    return (EAttribute)questionsEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuestions_Alternatives()
  {
    return (EReference)questionsEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlternatives()
  {
    return alternativesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlternatives_Description()
  {
    return (EAttribute)alternativesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDesignType()
  {
    return designTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAnswerType()
  {
    return answerTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMetricType()
  {
    return metricTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getColectType()
  {
    return colectTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMetricUnit()
  {
    return metricUnitEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpDSLFactory getExpDSLFactory()
  {
    return (ExpDSLFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__ELEMENTS);

    experimentElementEClass = createEClass(EXPERIMENT_ELEMENT);
    createEAttribute(experimentElementEClass, EXPERIMENT_ELEMENT__NAME);
    createEReference(experimentElementEClass, EXPERIMENT_ELEMENT__PROCESS);
    createEReference(experimentElementEClass, EXPERIMENT_ELEMENT__METRICS);
    createEReference(experimentElementEClass, EXPERIMENT_ELEMENT__EXPERIMENTS);
    createEReference(experimentElementEClass, EXPERIMENT_ELEMENT__QUESTION);

    processEClass = createEClass(PROCESS);
    createEAttribute(processEClass, PROCESS__NAME);
    createEReference(processEClass, PROCESS__ACTIVITIES);

    activityEClass = createEClass(ACTIVITY);
    createEAttribute(activityEClass, ACTIVITY__ID);
    createEReference(activityEClass, ACTIVITY__ARTEFACTS);
    createEAttribute(activityEClass, ACTIVITY__NAME);
    createEAttribute(activityEClass, ACTIVITY__NEXT);
    createEReference(activityEClass, ACTIVITY__ROLE);
    createEReference(activityEClass, ACTIVITY__TASKS);

    artefactEClass = createEClass(ARTEFACT);
    createEAttribute(artefactEClass, ARTEFACT__NAME);

    taskEClass = createEClass(TASK);
    createEAttribute(taskEClass, TASK__NAME);

    roleEClass = createEClass(ROLE);
    createEAttribute(roleEClass, ROLE__NAME);

    experimentalPlanEClass = createEClass(EXPERIMENTAL_PLAN);
    createEAttribute(experimentalPlanEClass, EXPERIMENTAL_PLAN__NAME);
    createEAttribute(experimentalPlanEClass, EXPERIMENTAL_PLAN__TYPE);
    createEReference(experimentalPlanEClass, EXPERIMENTAL_PLAN__FACTOR);

    factorEClass = createEClass(FACTOR);
    createEAttribute(factorEClass, FACTOR__NAME);
    createEReference(factorEClass, FACTOR__LEVEL);

    levelsEClass = createEClass(LEVELS);
    createEAttribute(levelsEClass, LEVELS__NAME);

    metricsEClass = createEClass(METRICS);
    createEAttribute(metricsEClass, METRICS__NAME);
    createEReference(metricsEClass, METRICS__RELATES_TO);
    createEAttribute(metricsEClass, METRICS__DESCRIPTION);
    createEAttribute(metricsEClass, METRICS__TYPE);
    createEAttribute(metricsEClass, METRICS__FORM);
    createEAttribute(metricsEClass, METRICS__ID);
    createEAttribute(metricsEClass, METRICS__UNIT);
    createEReference(metricsEClass, METRICS__DETAILS);

    activityMetricEClass = createEClass(ACTIVITY_METRIC);
    createEAttribute(activityMetricEClass, ACTIVITY_METRIC__ACTIVITY_BEGIN);
    createEAttribute(activityMetricEClass, ACTIVITY_METRIC__ACTIVITY_END);

    taskMetricEClass = createEClass(TASK_METRIC);
    createEAttribute(taskMetricEClass, TASK_METRIC__ACTIVITIES);

    artefactMetricEClass = createEClass(ARTEFACT_METRIC);
    createEReference(artefactMetricEClass, ARTEFACT_METRIC__ARTEFACT);

    questionsEClass = createEClass(QUESTIONS);
    createEAttribute(questionsEClass, QUESTIONS__NAME);
    createEAttribute(questionsEClass, QUESTIONS__DESCRIPTION);
    createEAttribute(questionsEClass, QUESTIONS__TYPE);
    createEAttribute(questionsEClass, QUESTIONS__ID);
    createEAttribute(questionsEClass, QUESTIONS__REQ);
    createEReference(questionsEClass, QUESTIONS__ALTERNATIVES);

    alternativesEClass = createEClass(ALTERNATIVES);
    createEAttribute(alternativesEClass, ALTERNATIVES__DESCRIPTION);

    // Create enums
    designTypeEEnum = createEEnum(DESIGN_TYPE);
    answerTypeEEnum = createEEnum(ANSWER_TYPE);
    metricTypeEEnum = createEEnum(METRIC_TYPE);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    taskMetricEClass.getESuperTypes().add(this.getMetrics());
    artefactMetricEClass.getESuperTypes().add(this.getMetrics());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Elements(), this.getExperimentElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(experimentElementEClass, ExperimentElement.class, "ExperimentElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExperimentElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExperimentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExperimentElement_Process(), this.getProcess(), null, "process", null, 0, -1, ExperimentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExperimentElement_Metrics(), this.getMetrics(), null, "metrics", null, 0, -1, ExperimentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExperimentElement_Experiments(), this.getExperimentalPlan(), null, "experiments", null, 0, -1, ExperimentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExperimentElement_Question(), this.getQuestions(), null, "question", null, 0, -1, ExperimentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processEClass, org.xtext.project.expDSL.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcess_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.xtext.project.expDSL.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcess_Activities(), this.getActivity(), null, "activities", null, 0, -1, org.xtext.project.expDSL.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActivity_Id(), ecorePackage.getEString(), "id", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActivity_Artefacts(), this.getArtefact(), null, "artefacts", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActivity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActivity_Next(), ecorePackage.getEString(), "next", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActivity_Role(), this.getRole(), null, "role", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActivity_Tasks(), this.getTask(), null, "tasks", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(artefactEClass, Artefact.class, "Artefact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArtefact_Name(), ecorePackage.getEString(), "name", null, 0, 1, Artefact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(experimentalPlanEClass, ExperimentalPlan.class, "ExperimentalPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExperimentalPlan_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExperimentalPlan_Type(), this.getDesignType(), "type", null, 0, 1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExperimentalPlan_Factor(), this.getFactor(), null, "factor", null, 0, -1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(factorEClass, Factor.class, "Factor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFactor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFactor_Level(), this.getLevels(), null, "level", null, 0, -1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(levelsEClass, Levels.class, "Levels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLevels_Name(), ecorePackage.getEString(), "name", null, 0, 1, Levels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metricsEClass, Metrics.class, "Metrics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetrics_Name(), ecorePackage.getEString(), "name", null, 0, 1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetrics_RelatesTo(), this.getProcess(), null, "relatesTo", null, 0, 1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetrics_Description(), ecorePackage.getEString(), "description", null, 0, 1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetrics_Type(), this.getMetricType(), "type", null, 0, 1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetrics_Form(), this.getColectType(), "form", null, 0, 1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetrics_Id(), ecorePackage.getEString(), "id", null, 0, 1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetrics_Unit(), this.getMetricUnit(), "unit", null, 0, 1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetrics_Details(), this.getActivityMetric(), null, "details", null, 0, 1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(activityMetricEClass, ActivityMetric.class, "ActivityMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActivityMetric_ActivityBegin(), ecorePackage.getEString(), "activityBegin", null, 0, 1, ActivityMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActivityMetric_ActivityEnd(), ecorePackage.getEString(), "activityEnd", null, 0, 1, ActivityMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskMetricEClass, TaskMetric.class, "TaskMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTaskMetric_Activities(), ecorePackage.getEString(), "activities", null, 0, 1, TaskMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(artefactMetricEClass, ArtefactMetric.class, "ArtefactMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArtefactMetric_Artefact(), this.getArtefact(), null, "artefact", null, 0, 1, ArtefactMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(questionsEClass, Questions.class, "Questions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuestions_Name(), ecorePackage.getEString(), "name", null, 0, 1, Questions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuestions_Description(), ecorePackage.getEString(), "description", null, 0, 1, Questions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuestions_Type(), this.getAnswerType(), "type", null, 0, 1, Questions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuestions_Id(), ecorePackage.getEString(), "id", null, 0, 1, Questions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuestions_Req(), ecorePackage.getEInt(), "req", null, 0, 1, Questions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuestions_Alternatives(), this.getAlternatives(), null, "alternatives", null, 0, -1, Questions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alternativesEClass, Alternatives.class, "Alternatives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAlternatives_Description(), ecorePackage.getEString(), "description", null, 0, 1, Alternatives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(designTypeEEnum, DesignType.class, "DesignType");
    addEEnumLiteral(designTypeEEnum, DesignType.CDR);
    addEEnumLiteral(designTypeEEnum, DesignType.RCDB);
    addEEnumLiteral(designTypeEEnum, DesignType.LS);

    initEEnum(answerTypeEEnum, AnswerType.class, "AnswerType");
    addEEnumLiteral(answerTypeEEnum, AnswerType.COMBO_BOX);
    addEEnumLiteral(answerTypeEEnum, AnswerType.CHECK_BOXES);
    addEEnumLiteral(answerTypeEEnum, AnswerType.OPTION_BUTTONS);

    initEEnum(metricTypeEEnum, MetricType.class, "MetricType");
    addEEnumLiteral(metricTypeEEnum, MetricType.HARD_DATA);
    addEEnumLiteral(metricTypeEEnum, MetricType.SOFT_DATA);
    addEEnumLiteral(metricTypeEEnum, MetricType.NORMALIZED_DATA);

    initEEnum(colectTypeEEnum, ColectType.class, "ColectType");
    addEEnumLiteral(colectTypeEEnum, ColectType.CONTINUOUS);
    addEEnumLiteral(colectTypeEEnum, ColectType.INTERCALATED);

    initEEnum(metricUnitEEnum, MetricUnit.class, "MetricUnit");
    addEEnumLiteral(metricUnitEEnum, MetricUnit.MINUTES);
    addEEnumLiteral(metricUnitEEnum, MetricUnit.UC);

    // Create resource
    createResource(eNS_URI);
  }

} //ExpDSLPackageImpl

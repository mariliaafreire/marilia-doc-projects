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
  private EClass artefactEClass = null;

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
  private EClass detailEClass = null;

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
  private EClass experimentalPlanEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass parameterEClass = null;

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
  private EClass linkEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass questionnaireEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass questionEClass = null;

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
  private EEnum artefactTypeEEnum = null;

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
  private EEnum questionnaireTypeEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum answerTypeEEnum = null;

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
  public EReference getExperimentElement_Questionnaire()
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
  public EAttribute getActivity_Name()
  {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getActivity_Description()
  {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getActivity_Next()
  {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getActivity_Artefacts()
  {
		return (EReference)activityEClass.getEStructuralFeatures().get(3);
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
  public EAttribute getTask_Description()
  {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTask_Artefacts()
  {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTask_Role()
  {
		return (EReference)taskEClass.getEStructuralFeatures().get(3);
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
  public EAttribute getArtefact_Description()
  {
		return (EAttribute)artefactEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getArtefact_Type()
  {
		return (EAttribute)artefactEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getMetrics_Form()
  {
		return (EAttribute)metricsEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMetrics_Unit()
  {
		return (EAttribute)metricsEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMetrics_Detail()
  {
		return (EReference)metricsEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDetail()
  {
		return detailEClass;
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
  public EReference getActivityMetric_ActivityBegin()
  {
		return (EReference)activityMetricEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getActivityMetric_ActivityEnd()
  {
		return (EReference)activityMetricEClass.getEStructuralFeatures().get(1);
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
  public EReference getTaskMetric_Tasks()
  {
		return (EReference)taskMetricEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getArtefactMetric_Name()
  {
		return (EAttribute)artefactMetricEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getArtefactMetric_Artefacts()
  {
		return (EReference)artefactMetricEClass.getEStructuralFeatures().get(1);
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
  public EReference getExperimentalPlan_Parameter()
  {
		return (EReference)experimentalPlanEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExperimentalPlan_Factor()
  {
		return (EReference)experimentalPlanEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getExperimentalPlan_InternalReplication()
  {
		return (EAttribute)experimentalPlanEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExperimentalPlan_Link()
  {
		return (EReference)experimentalPlanEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getParameter()
  {
		return parameterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getParameter_Variable()
  {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getParameter_Value()
  {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getFactor_IsDesiredVariation()
  {
		return (EAttribute)factorEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getFactor_Level()
  {
		return (EReference)factorEClass.getEStructuralFeatures().get(2);
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
  public EClass getLink()
  {
		return linkEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLink_Procedure()
  {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLink_Treatment()
  {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getQuestionnaire()
  {
		return questionnaireEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getQuestionnaire_Name()
  {
		return (EAttribute)questionnaireEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getQuestionnaire_RelatesTo()
  {
		return (EReference)questionnaireEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getQuestionnaire_QuestionnaireType()
  {
		return (EAttribute)questionnaireEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getQuestionnaire_Question()
  {
		return (EReference)questionnaireEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getQuestion()
  {
		return questionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getQuestion_Name()
  {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getQuestion_Description()
  {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getQuestion_Type()
  {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getQuestion_Req()
  {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getQuestion_Alternatives()
  {
		return (EReference)questionEClass.getEStructuralFeatures().get(4);
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
  public EEnum getArtefactType()
  {
		return artefactTypeEEnum;
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
  public EEnum getDesignType()
  {
		return designTypeEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getQuestionnaireType()
  {
		return questionnaireTypeEEnum;
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
		createEReference(experimentElementEClass, EXPERIMENT_ELEMENT__QUESTIONNAIRE);

		processEClass = createEClass(PROCESS);
		createEAttribute(processEClass, PROCESS__NAME);
		createEReference(processEClass, PROCESS__ACTIVITIES);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__NAME);
		createEAttribute(activityEClass, ACTIVITY__DESCRIPTION);
		createEReference(activityEClass, ACTIVITY__NEXT);
		createEReference(activityEClass, ACTIVITY__ARTEFACTS);
		createEReference(activityEClass, ACTIVITY__ROLE);
		createEReference(activityEClass, ACTIVITY__TASKS);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__NAME);
		createEAttribute(taskEClass, TASK__DESCRIPTION);
		createEReference(taskEClass, TASK__ARTEFACTS);
		createEReference(taskEClass, TASK__ROLE);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__NAME);

		artefactEClass = createEClass(ARTEFACT);
		createEAttribute(artefactEClass, ARTEFACT__NAME);
		createEAttribute(artefactEClass, ARTEFACT__DESCRIPTION);
		createEAttribute(artefactEClass, ARTEFACT__TYPE);

		metricsEClass = createEClass(METRICS);
		createEAttribute(metricsEClass, METRICS__NAME);
		createEReference(metricsEClass, METRICS__RELATES_TO);
		createEAttribute(metricsEClass, METRICS__DESCRIPTION);
		createEAttribute(metricsEClass, METRICS__FORM);
		createEAttribute(metricsEClass, METRICS__UNIT);
		createEReference(metricsEClass, METRICS__DETAIL);

		detailEClass = createEClass(DETAIL);

		activityMetricEClass = createEClass(ACTIVITY_METRIC);
		createEReference(activityMetricEClass, ACTIVITY_METRIC__ACTIVITY_BEGIN);
		createEReference(activityMetricEClass, ACTIVITY_METRIC__ACTIVITY_END);

		taskMetricEClass = createEClass(TASK_METRIC);
		createEReference(taskMetricEClass, TASK_METRIC__TASKS);

		artefactMetricEClass = createEClass(ARTEFACT_METRIC);
		createEAttribute(artefactMetricEClass, ARTEFACT_METRIC__NAME);
		createEReference(artefactMetricEClass, ARTEFACT_METRIC__ARTEFACTS);

		experimentalPlanEClass = createEClass(EXPERIMENTAL_PLAN);
		createEAttribute(experimentalPlanEClass, EXPERIMENTAL_PLAN__NAME);
		createEAttribute(experimentalPlanEClass, EXPERIMENTAL_PLAN__TYPE);
		createEReference(experimentalPlanEClass, EXPERIMENTAL_PLAN__PARAMETER);
		createEReference(experimentalPlanEClass, EXPERIMENTAL_PLAN__FACTOR);
		createEAttribute(experimentalPlanEClass, EXPERIMENTAL_PLAN__INTERNAL_REPLICATION);
		createEReference(experimentalPlanEClass, EXPERIMENTAL_PLAN__LINK);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__VARIABLE);
		createEAttribute(parameterEClass, PARAMETER__VALUE);

		factorEClass = createEClass(FACTOR);
		createEAttribute(factorEClass, FACTOR__NAME);
		createEAttribute(factorEClass, FACTOR__IS_DESIRED_VARIATION);
		createEReference(factorEClass, FACTOR__LEVEL);

		levelsEClass = createEClass(LEVELS);
		createEAttribute(levelsEClass, LEVELS__NAME);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__PROCEDURE);
		createEReference(linkEClass, LINK__TREATMENT);

		questionnaireEClass = createEClass(QUESTIONNAIRE);
		createEAttribute(questionnaireEClass, QUESTIONNAIRE__NAME);
		createEReference(questionnaireEClass, QUESTIONNAIRE__RELATES_TO);
		createEAttribute(questionnaireEClass, QUESTIONNAIRE__QUESTIONNAIRE_TYPE);
		createEReference(questionnaireEClass, QUESTIONNAIRE__QUESTION);

		questionEClass = createEClass(QUESTION);
		createEAttribute(questionEClass, QUESTION__NAME);
		createEAttribute(questionEClass, QUESTION__DESCRIPTION);
		createEAttribute(questionEClass, QUESTION__TYPE);
		createEAttribute(questionEClass, QUESTION__REQ);
		createEReference(questionEClass, QUESTION__ALTERNATIVES);

		alternativesEClass = createEClass(ALTERNATIVES);
		createEAttribute(alternativesEClass, ALTERNATIVES__DESCRIPTION);

		// Create enums
		artefactTypeEEnum = createEEnum(ARTEFACT_TYPE);
		colectTypeEEnum = createEEnum(COLECT_TYPE);
		metricUnitEEnum = createEEnum(METRIC_UNIT);
		designTypeEEnum = createEEnum(DESIGN_TYPE);
		questionnaireTypeEEnum = createEEnum(QUESTIONNAIRE_TYPE);
		answerTypeEEnum = createEEnum(ANSWER_TYPE);
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
		activityMetricEClass.getESuperTypes().add(this.getDetail());
		taskMetricEClass.getESuperTypes().add(this.getDetail());
		artefactMetricEClass.getESuperTypes().add(this.getDetail());

		// Initialize classes and features; add operations and parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Elements(), this.getExperimentElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(experimentElementEClass, ExperimentElement.class, "ExperimentElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExperimentElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExperimentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentElement_Process(), this.getProcess(), null, "process", null, 0, -1, ExperimentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentElement_Metrics(), this.getMetrics(), null, "metrics", null, 0, -1, ExperimentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentElement_Experiments(), this.getExperimentalPlan(), null, "experiments", null, 0, -1, ExperimentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentElement_Questionnaire(), this.getQuestionnaire(), null, "questionnaire", null, 0, -1, ExperimentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, org.xtext.project.expDSL.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcess_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.xtext.project.expDSL.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Activities(), this.getActivity(), null, "activities", null, 0, -1, org.xtext.project.expDSL.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Description(), ecorePackage.getEString(), "description", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Next(), this.getActivity(), null, "next", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Artefacts(), this.getArtefact(), null, "artefacts", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Role(), this.getRole(), null, "role", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Tasks(), this.getTask(), null, "tasks", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Description(), ecorePackage.getEString(), "description", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Artefacts(), this.getArtefact(), null, "artefacts", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Role(), this.getRole(), null, "role", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artefactEClass, Artefact.class, "Artefact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtefact_Name(), ecorePackage.getEString(), "name", null, 0, 1, Artefact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtefact_Description(), ecorePackage.getEString(), "description", null, 0, 1, Artefact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtefact_Type(), this.getArtefactType(), "type", null, 0, 1, Artefact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricsEClass, Metrics.class, "Metrics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetrics_Name(), ecorePackage.getEString(), "name", null, 0, 1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetrics_RelatesTo(), this.getProcess(), null, "relatesTo", null, 0, 1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetrics_Description(), ecorePackage.getEString(), "description", null, 0, 1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetrics_Form(), this.getColectType(), "form", null, 0, 1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetrics_Unit(), this.getMetricUnit(), "unit", null, 0, 1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetrics_Detail(), this.getDetail(), null, "detail", null, 0, -1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(detailEClass, Detail.class, "Detail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityMetricEClass, ActivityMetric.class, "ActivityMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityMetric_ActivityBegin(), this.getActivity(), null, "activityBegin", null, 0, 1, ActivityMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityMetric_ActivityEnd(), this.getActivity(), null, "activityEnd", null, 0, 1, ActivityMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskMetricEClass, TaskMetric.class, "TaskMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskMetric_Tasks(), this.getTask(), null, "tasks", null, 0, -1, TaskMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artefactMetricEClass, ArtefactMetric.class, "ArtefactMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtefactMetric_Name(), ecorePackage.getEString(), "name", null, 0, 1, ArtefactMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtefactMetric_Artefacts(), this.getArtefact(), null, "artefacts", null, 0, 1, ArtefactMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(experimentalPlanEClass, ExperimentalPlan.class, "ExperimentalPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExperimentalPlan_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentalPlan_Type(), this.getDesignType(), "type", null, 0, 1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalPlan_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalPlan_Factor(), this.getFactor(), null, "factor", null, 0, -1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentalPlan_InternalReplication(), ecorePackage.getEInt(), "internalReplication", null, 0, 1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalPlan_Link(), this.getLink(), null, "link", null, 0, -1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factorEClass, Factor.class, "Factor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFactor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactor_IsDesiredVariation(), ecorePackage.getEString(), "isDesiredVariation", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactor_Level(), this.getLevels(), null, "level", null, 0, -1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(levelsEClass, Levels.class, "Levels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLevels_Name(), ecorePackage.getEString(), "name", null, 0, 1, Levels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Procedure(), this.getProcess(), null, "procedure", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Treatment(), this.getLevels(), null, "treatment", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionnaireEClass, Questionnaire.class, "Questionnaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestionnaire_Name(), ecorePackage.getEString(), "name", null, 0, 1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnaire_RelatesTo(), this.getProcess(), null, "relatesTo", null, 0, -1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionnaire_QuestionnaireType(), this.getQuestionnaireType(), "questionnaireType", null, 0, 1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnaire_Question(), this.getQuestion(), null, "question", null, 0, -1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Description(), ecorePackage.getEString(), "description", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Type(), this.getAnswerType(), "type", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Req(), ecorePackage.getEInt(), "req", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_Alternatives(), this.getAlternatives(), null, "alternatives", null, 0, -1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativesEClass, Alternatives.class, "Alternatives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlternatives_Description(), ecorePackage.getEString(), "description", null, 0, 1, Alternatives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(artefactTypeEEnum, ArtefactType.class, "ArtefactType");
		addEEnumLiteral(artefactTypeEEnum, ArtefactType.IN_);
		addEEnumLiteral(artefactTypeEEnum, ArtefactType.OUT_);
		addEEnumLiteral(artefactTypeEEnum, ArtefactType.INOUT_);

		initEEnum(colectTypeEEnum, ColectType.class, "ColectType");
		addEEnumLiteral(colectTypeEEnum, ColectType.CONTINUOUS);
		addEEnumLiteral(colectTypeEEnum, ColectType.INTERCALATED);

		initEEnum(metricUnitEEnum, MetricUnit.class, "MetricUnit");
		addEEnumLiteral(metricUnitEEnum, MetricUnit.MINUTES);
		addEEnumLiteral(metricUnitEEnum, MetricUnit.UC);

		initEEnum(designTypeEEnum, DesignType.class, "DesignType");
		addEEnumLiteral(designTypeEEnum, DesignType.CDR);
		addEEnumLiteral(designTypeEEnum, DesignType.RCBD);
		addEEnumLiteral(designTypeEEnum, DesignType.LS);

		initEEnum(questionnaireTypeEEnum, QuestionnaireType.class, "QuestionnaireType");
		addEEnumLiteral(questionnaireTypeEEnum, QuestionnaireType.PRE);
		addEEnumLiteral(questionnaireTypeEEnum, QuestionnaireType.POS);

		initEEnum(answerTypeEEnum, AnswerType.class, "AnswerType");
		addEEnumLiteral(answerTypeEEnum, AnswerType.TEXT);
		addEEnumLiteral(answerTypeEEnum, AnswerType.PARAGRAPH_TEXT);
		addEEnumLiteral(answerTypeEEnum, AnswerType.MULTIPLE_CHOICE);
		addEEnumLiteral(answerTypeEEnum, AnswerType.COMBO_BOX);
		addEEnumLiteral(answerTypeEEnum, AnswerType.CHECK_BOXES);
		addEEnumLiteral(answerTypeEEnum, AnswerType.SCALE);
		addEEnumLiteral(answerTypeEEnum, AnswerType.GRID);

		// Create resource
		createResource(eNS_URI);
	}

} //ExpDSLPackageImpl

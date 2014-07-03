/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2.impl;

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
import br.ufrn.dimap.ase.dsl.expDslv2.Task;
import br.ufrn.dimap.ase.dsl.expDslv2.TaskMetric;

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
public class ExpDslv2PackageImpl extends EPackageImpl implements ExpDslv2Package
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
  private EClass experimentalPlanEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass goalEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass hypothesesEClass = null;

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
  private EClass dependentVariableEClass = null;

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
  private EClass processEClass = null;

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
  private EClass taskMetricEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass dataMetricEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass collectedDataEClass = null;

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
  private EEnum relationTypeEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum operatorTypeEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum hypothesisTypeEEnum = null;

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
  private EEnum analysisTechiqueTypeEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum roleTypeEEnum = null;

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
  private EEnum dataTypeEEnum = null;

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
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ExpDslv2PackageImpl()
  {
		super(eNS_URI, ExpDslv2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExpDslv2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ExpDslv2Package init()
  {
		if (isInited) return (ExpDslv2Package)EPackage.Registry.INSTANCE.getEPackage(ExpDslv2Package.eNS_URI);

		// Obtain or create and register package
		ExpDslv2PackageImpl theExpDslv2Package = (ExpDslv2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExpDslv2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExpDslv2PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theExpDslv2Package.createPackageContents();

		// Initialize created meta-data
		theExpDslv2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpDslv2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExpDslv2Package.eNS_URI, theExpDslv2Package);
		return theExpDslv2Package;
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
  public EReference getExperimentElement_Experiments()
  {
		return (EReference)experimentElementEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExperimentElement_Process()
  {
		return (EReference)experimentElementEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExperimentElement_Metrics()
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
  public EClass getExperimentalPlan()
  {
		return experimentalPlanEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExperimentalPlan_Goal()
  {
		return (EReference)experimentalPlanEClass.getEStructuralFeatures().get(0);
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
  public EReference getExperimentalPlan_DependentVariable()
  {
		return (EReference)experimentalPlanEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExperimentalPlan_Factor()
  {
		return (EReference)experimentalPlanEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExperimentalPlan_Tohypotheses()
  {
		return (EReference)experimentalPlanEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getExperimentalPlan_Technique()
  {
		return (EAttribute)experimentalPlanEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getExperimentalPlan_InternalReplication()
  {
		return (EAttribute)experimentalPlanEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getGoal()
  {
		return goalEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGoal_Name()
  {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGoal_Description()
  {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getGoal_Hypotheses()
  {
		return (EReference)goalEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getHypotheses()
  {
		return hypothesesEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getHypotheses_Name()
  {
		return (EAttribute)hypothesesEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getHypotheses_Description()
  {
		return (EAttribute)hypothesesEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getHypotheses_Type()
  {
		return (EAttribute)hypothesesEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getHypotheses_DependentVariable()
  {
		return (EReference)hypothesesEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getHypotheses_Levels()
  {
		return (EReference)hypothesesEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getHypotheses_Operator()
  {
		return (EAttribute)hypothesesEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getHypotheses_Relation()
  {
		return (EAttribute)hypothesesEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getHypotheses_Factor()
  {
		return (EReference)hypothesesEClass.getEStructuralFeatures().get(7);
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
  public EClass getDependentVariable()
  {
		return dependentVariableEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDependentVariable_Name()
  {
		return (EAttribute)dependentVariableEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDependentVariable_Description()
  {
		return (EAttribute)dependentVariableEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDependentVariable_Metrics()
  {
		return (EReference)dependentVariableEClass.getEStructuralFeatures().get(2);
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
  public EReference getProcess_Treatment()
  {
		return (EReference)processEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getProcess_Role()
  {
		return (EAttribute)processEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getProcess_Task()
  {
		return (EReference)processEClass.getEStructuralFeatures().get(3);
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
  public EReference getTask_Next()
  {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTask_Role()
  {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTask_CollectData()
  {
		return (EReference)taskEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTask_Artefacts()
  {
		return (EReference)taskEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTask_Questionnaire()
  {
		return (EReference)taskEClass.getEStructuralFeatures().get(6);
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
  public EReference getMetrics_Detail()
  {
		return (EReference)metricsEClass.getEStructuralFeatures().get(3);
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
  public EClass getTaskMetric()
  {
		return taskMetricEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTaskMetric_TaskBegin()
  {
		return (EReference)taskMetricEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTaskMetric_TaskEnd()
  {
		return (EReference)taskMetricEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDataMetric()
  {
		return dataMetricEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDataMetric_CollectedData()
  {
		return (EReference)dataMetricEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDataMetric_DataType()
  {
		return (EAttribute)dataMetricEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDataMetric_Artefacts()
  {
		return (EReference)dataMetricEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDataMetric_Questionnaires()
  {
		return (EReference)dataMetricEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCollectedData()
  {
		return collectedDataEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getCollectedData_Name()
  {
		return (EAttribute)collectedDataEClass.getEStructuralFeatures().get(0);
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
  public EEnum getRelationType()
  {
		return relationTypeEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getOperatorType()
  {
		return operatorTypeEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getHypothesisType()
  {
		return hypothesisTypeEEnum;
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
  public EEnum getAnalysisTechiqueType()
  {
		return analysisTechiqueTypeEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getRoleType()
  {
		return roleTypeEEnum;
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
  public EEnum getDataType()
  {
		return dataTypeEEnum;
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
  public ExpDslv2Factory getExpDslv2Factory()
  {
		return (ExpDslv2Factory)getEFactoryInstance();
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
		createEReference(experimentElementEClass, EXPERIMENT_ELEMENT__EXPERIMENTS);
		createEReference(experimentElementEClass, EXPERIMENT_ELEMENT__PROCESS);
		createEReference(experimentElementEClass, EXPERIMENT_ELEMENT__METRICS);
		createEReference(experimentElementEClass, EXPERIMENT_ELEMENT__QUESTIONNAIRE);

		experimentalPlanEClass = createEClass(EXPERIMENTAL_PLAN);
		createEReference(experimentalPlanEClass, EXPERIMENTAL_PLAN__GOAL);
		createEAttribute(experimentalPlanEClass, EXPERIMENTAL_PLAN__TYPE);
		createEReference(experimentalPlanEClass, EXPERIMENTAL_PLAN__PARAMETER);
		createEReference(experimentalPlanEClass, EXPERIMENTAL_PLAN__DEPENDENT_VARIABLE);
		createEReference(experimentalPlanEClass, EXPERIMENTAL_PLAN__FACTOR);
		createEReference(experimentalPlanEClass, EXPERIMENTAL_PLAN__TOHYPOTHESES);
		createEAttribute(experimentalPlanEClass, EXPERIMENTAL_PLAN__TECHNIQUE);
		createEAttribute(experimentalPlanEClass, EXPERIMENTAL_PLAN__INTERNAL_REPLICATION);

		goalEClass = createEClass(GOAL);
		createEAttribute(goalEClass, GOAL__NAME);
		createEAttribute(goalEClass, GOAL__DESCRIPTION);
		createEReference(goalEClass, GOAL__HYPOTHESES);

		hypothesesEClass = createEClass(HYPOTHESES);
		createEAttribute(hypothesesEClass, HYPOTHESES__NAME);
		createEAttribute(hypothesesEClass, HYPOTHESES__DESCRIPTION);
		createEAttribute(hypothesesEClass, HYPOTHESES__TYPE);
		createEReference(hypothesesEClass, HYPOTHESES__DEPENDENT_VARIABLE);
		createEReference(hypothesesEClass, HYPOTHESES__LEVELS);
		createEAttribute(hypothesesEClass, HYPOTHESES__OPERATOR);
		createEAttribute(hypothesesEClass, HYPOTHESES__RELATION);
		createEReference(hypothesesEClass, HYPOTHESES__FACTOR);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__VARIABLE);
		createEAttribute(parameterEClass, PARAMETER__VALUE);

		dependentVariableEClass = createEClass(DEPENDENT_VARIABLE);
		createEAttribute(dependentVariableEClass, DEPENDENT_VARIABLE__NAME);
		createEAttribute(dependentVariableEClass, DEPENDENT_VARIABLE__DESCRIPTION);
		createEReference(dependentVariableEClass, DEPENDENT_VARIABLE__METRICS);

		factorEClass = createEClass(FACTOR);
		createEAttribute(factorEClass, FACTOR__NAME);
		createEAttribute(factorEClass, FACTOR__IS_DESIRED_VARIATION);
		createEReference(factorEClass, FACTOR__LEVEL);

		levelsEClass = createEClass(LEVELS);
		createEAttribute(levelsEClass, LEVELS__NAME);

		processEClass = createEClass(PROCESS);
		createEAttribute(processEClass, PROCESS__NAME);
		createEReference(processEClass, PROCESS__TREATMENT);
		createEAttribute(processEClass, PROCESS__ROLE);
		createEReference(processEClass, PROCESS__TASK);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__NAME);
		createEAttribute(taskEClass, TASK__DESCRIPTION);
		createEReference(taskEClass, TASK__NEXT);
		createEAttribute(taskEClass, TASK__ROLE);
		createEReference(taskEClass, TASK__COLLECT_DATA);
		createEReference(taskEClass, TASK__ARTEFACTS);
		createEReference(taskEClass, TASK__QUESTIONNAIRE);

		artefactEClass = createEClass(ARTEFACT);
		createEAttribute(artefactEClass, ARTEFACT__NAME);
		createEAttribute(artefactEClass, ARTEFACT__DESCRIPTION);
		createEAttribute(artefactEClass, ARTEFACT__TYPE);

		metricsEClass = createEClass(METRICS);
		createEAttribute(metricsEClass, METRICS__NAME);
		createEReference(metricsEClass, METRICS__RELATES_TO);
		createEAttribute(metricsEClass, METRICS__DESCRIPTION);
		createEReference(metricsEClass, METRICS__DETAIL);

		detailEClass = createEClass(DETAIL);

		taskMetricEClass = createEClass(TASK_METRIC);
		createEReference(taskMetricEClass, TASK_METRIC__TASK_BEGIN);
		createEReference(taskMetricEClass, TASK_METRIC__TASK_END);

		dataMetricEClass = createEClass(DATA_METRIC);
		createEReference(dataMetricEClass, DATA_METRIC__COLLECTED_DATA);
		createEAttribute(dataMetricEClass, DATA_METRIC__DATA_TYPE);
		createEReference(dataMetricEClass, DATA_METRIC__ARTEFACTS);
		createEReference(dataMetricEClass, DATA_METRIC__QUESTIONNAIRES);

		collectedDataEClass = createEClass(COLLECTED_DATA);
		createEAttribute(collectedDataEClass, COLLECTED_DATA__NAME);

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
		relationTypeEEnum = createEEnum(RELATION_TYPE);
		operatorTypeEEnum = createEEnum(OPERATOR_TYPE);
		hypothesisTypeEEnum = createEEnum(HYPOTHESIS_TYPE);
		designTypeEEnum = createEEnum(DESIGN_TYPE);
		analysisTechiqueTypeEEnum = createEEnum(ANALYSIS_TECHIQUE_TYPE);
		roleTypeEEnum = createEEnum(ROLE_TYPE);
		artefactTypeEEnum = createEEnum(ARTEFACT_TYPE);
		dataTypeEEnum = createEEnum(DATA_TYPE);
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
		taskMetricEClass.getESuperTypes().add(this.getDetail());
		dataMetricEClass.getESuperTypes().add(this.getDetail());

		// Initialize classes and features; add operations and parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Elements(), this.getExperimentElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(experimentElementEClass, ExperimentElement.class, "ExperimentElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExperimentElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExperimentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentElement_Experiments(), this.getExperimentalPlan(), null, "experiments", null, 0, -1, ExperimentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentElement_Process(), this.getProcess(), null, "process", null, 0, -1, ExperimentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentElement_Metrics(), this.getMetrics(), null, "metrics", null, 0, -1, ExperimentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentElement_Questionnaire(), this.getQuestionnaire(), null, "questionnaire", null, 0, -1, ExperimentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(experimentalPlanEClass, ExperimentalPlan.class, "ExperimentalPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExperimentalPlan_Goal(), this.getGoal(), null, "goal", null, 0, -1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentalPlan_Type(), this.getDesignType(), "type", null, 0, 1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalPlan_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalPlan_DependentVariable(), this.getDependentVariable(), null, "dependentVariable", null, 0, -1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalPlan_Factor(), this.getFactor(), null, "factor", null, 0, -1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalPlan_Tohypotheses(), this.getHypotheses(), null, "tohypotheses", null, 0, -1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentalPlan_Technique(), this.getAnalysisTechiqueType(), "Technique", null, 0, -1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentalPlan_InternalReplication(), ecorePackage.getEInt(), "internalReplication", null, 0, 1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoal_Name(), ecorePackage.getEString(), "name", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoal_Description(), ecorePackage.getEString(), "description", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_Hypotheses(), this.getHypotheses(), null, "hypotheses", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hypothesesEClass, Hypotheses.class, "Hypotheses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHypotheses_Name(), ecorePackage.getEString(), "name", null, 0, 1, Hypotheses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypotheses_Description(), ecorePackage.getEString(), "description", null, 0, 1, Hypotheses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypotheses_Type(), this.getHypothesisType(), "type", null, 0, 1, Hypotheses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypotheses_DependentVariable(), this.getDependentVariable(), null, "dependentVariable", null, 0, -1, Hypotheses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypotheses_Levels(), this.getLevels(), null, "levels", null, 0, -1, Hypotheses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypotheses_Operator(), this.getOperatorType(), "operator", null, 0, 1, Hypotheses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypotheses_Relation(), this.getRelationType(), "relation", null, 0, 1, Hypotheses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypotheses_Factor(), this.getFactor(), null, "factor", null, 0, -1, Hypotheses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependentVariableEClass, DependentVariable.class, "DependentVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependentVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, DependentVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependentVariable_Description(), ecorePackage.getEString(), "description", null, 0, 1, DependentVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependentVariable_Metrics(), this.getMetrics(), null, "metrics", null, 0, -1, DependentVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factorEClass, Factor.class, "Factor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFactor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactor_IsDesiredVariation(), ecorePackage.getEString(), "isDesiredVariation", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactor_Level(), this.getLevels(), null, "level", null, 0, -1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(levelsEClass, Levels.class, "Levels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLevels_Name(), ecorePackage.getEString(), "name", null, 0, 1, Levels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, br.ufrn.dimap.ase.dsl.expDslv2.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcess_Name(), ecorePackage.getEString(), "name", null, 0, 1, br.ufrn.dimap.ase.dsl.expDslv2.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Treatment(), this.getLevels(), null, "treatment", null, 0, -1, br.ufrn.dimap.ase.dsl.expDslv2.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_Role(), this.getRoleType(), "role", null, 0, -1, br.ufrn.dimap.ase.dsl.expDslv2.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Task(), this.getTask(), null, "task", null, 0, -1, br.ufrn.dimap.ase.dsl.expDslv2.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Description(), ecorePackage.getEString(), "description", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Next(), this.getTask(), null, "next", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Role(), this.getRoleType(), "role", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_CollectData(), this.getCollectedData(), null, "collectData", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Artefacts(), this.getArtefact(), null, "artefacts", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Questionnaire(), this.getQuestionnaire(), null, "questionnaire", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artefactEClass, Artefact.class, "Artefact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtefact_Name(), ecorePackage.getEString(), "name", null, 0, 1, Artefact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtefact_Description(), ecorePackage.getEString(), "description", null, 0, 1, Artefact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtefact_Type(), this.getArtefactType(), "type", null, 0, 1, Artefact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricsEClass, Metrics.class, "Metrics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetrics_Name(), ecorePackage.getEString(), "name", null, 0, 1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetrics_RelatesTo(), this.getProcess(), null, "relatesTo", null, 0, 1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetrics_Description(), ecorePackage.getEString(), "description", null, 0, 1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetrics_Detail(), this.getDetail(), null, "detail", null, 0, 1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(detailEClass, Detail.class, "Detail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskMetricEClass, TaskMetric.class, "TaskMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskMetric_TaskBegin(), this.getTask(), null, "taskBegin", null, 0, 1, TaskMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskMetric_TaskEnd(), this.getTask(), null, "taskEnd", null, 0, 1, TaskMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataMetricEClass, DataMetric.class, "DataMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataMetric_CollectedData(), this.getCollectedData(), null, "collectedData", null, 0, -1, DataMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataMetric_DataType(), this.getDataType(), "dataType", null, 0, -1, DataMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataMetric_Artefacts(), this.getArtefact(), null, "artefacts", null, 0, -1, DataMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataMetric_Questionnaires(), this.getQuestionnaire(), null, "questionnaires", null, 0, -1, DataMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectedDataEClass, CollectedData.class, "CollectedData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectedData_Name(), ecorePackage.getEString(), "name", null, 0, 1, CollectedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEEnum(relationTypeEEnum, RelationType.class, "RelationType");
		addEEnumLiteral(relationTypeEEnum, RelationType.IS_RELATED);
		addEEnumLiteral(relationTypeEEnum, RelationType.IS_NOT_RELATED);

		initEEnum(operatorTypeEEnum, OperatorType.class, "OperatorType");
		addEEnumLiteral(operatorTypeEEnum, OperatorType.EQUAL);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.DIFFERENT);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.MORE);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.LESS);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.MORE_EQUAL);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.LESS_EQUAL);

		initEEnum(hypothesisTypeEEnum, HypothesisType.class, "HypothesisType");
		addEEnumLiteral(hypothesisTypeEEnum, HypothesisType.NULL_);
		addEEnumLiteral(hypothesisTypeEEnum, HypothesisType.ALTERNATIVE);

		initEEnum(designTypeEEnum, DesignType.class, "DesignType");
		addEEnumLiteral(designTypeEEnum, DesignType.CDR);
		addEEnumLiteral(designTypeEEnum, DesignType.RCBD);
		addEEnumLiteral(designTypeEEnum, DesignType.LS);
		addEEnumLiteral(designTypeEEnum, DesignType.OTHER);

		initEEnum(analysisTechiqueTypeEEnum, AnalysisTechiqueType.class, "AnalysisTechiqueType");
		addEEnumLiteral(analysisTechiqueTypeEEnum, AnalysisTechiqueType.CHI2);
		addEEnumLiteral(analysisTechiqueTypeEEnum, AnalysisTechiqueType.BINOMIAL_TEST);
		addEEnumLiteral(analysisTechiqueTypeEEnum, AnalysisTechiqueType.TTEST);
		addEEnumLiteral(analysisTechiqueTypeEEnum, AnalysisTechiqueType.FTEST);
		addEEnumLiteral(analysisTechiqueTypeEEnum, AnalysisTechiqueType.MC_NEMAR_TEST);
		addEEnumLiteral(analysisTechiqueTypeEEnum, AnalysisTechiqueType.MANN_WHITNEY);
		addEEnumLiteral(analysisTechiqueTypeEEnum, AnalysisTechiqueType.PAIRED);
		addEEnumLiteral(analysisTechiqueTypeEEnum, AnalysisTechiqueType.WILCOXON);
		addEEnumLiteral(analysisTechiqueTypeEEnum, AnalysisTechiqueType.SIGN_TEST);
		addEEnumLiteral(analysisTechiqueTypeEEnum, AnalysisTechiqueType.ANOVA);
		addEEnumLiteral(analysisTechiqueTypeEEnum, AnalysisTechiqueType.KRUSKAL_WALLIS);
		addEEnumLiteral(analysisTechiqueTypeEEnum, AnalysisTechiqueType.OTHERS);

		initEEnum(roleTypeEEnum, RoleType.class, "RoleType");
		addEEnumLiteral(roleTypeEEnum, RoleType.PARTICIPANT);
		addEEnumLiteral(roleTypeEEnum, RoleType.RESEARCHER);

		initEEnum(artefactTypeEEnum, ArtefactType.class, "ArtefactType");
		addEEnumLiteral(artefactTypeEEnum, ArtefactType.IN_);
		addEEnumLiteral(artefactTypeEEnum, ArtefactType.OUT_);
		addEEnumLiteral(artefactTypeEEnum, ArtefactType.INOUT_);

		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.NUM);
		addEEnumLiteral(dataTypeEEnum, DataType.TEXT);

		initEEnum(questionnaireTypeEEnum, QuestionnaireType.class, "QuestionnaireType");
		addEEnumLiteral(questionnaireTypeEEnum, QuestionnaireType.PRE);
		addEEnumLiteral(questionnaireTypeEEnum, QuestionnaireType.POST);

		initEEnum(answerTypeEEnum, AnswerType.class, "AnswerType");
		addEEnumLiteral(answerTypeEEnum, AnswerType.TEXT);
		addEEnumLiteral(answerTypeEEnum, AnswerType.PARAGRAPH_TEXT);
		addEEnumLiteral(answerTypeEEnum, AnswerType.MULTIPLE_CHOICE);
		addEEnumLiteral(answerTypeEEnum, AnswerType.SINGLE_CHOICE);
		addEEnumLiteral(answerTypeEEnum, AnswerType.SCALE);
		addEEnumLiteral(answerTypeEEnum, AnswerType.GRID);

		// Create resource
		createResource(eNS_URI);
	}

} //ExpDslv2PackageImpl

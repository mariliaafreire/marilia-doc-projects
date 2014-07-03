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
import br.ufrn.dimap.ase.dsl.expdslv3.DepVariable;
import br.ufrn.dimap.ase.dsl.expdslv3.DesignType;
import br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Factory;
import br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package;
import br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement;
import br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign;
import br.ufrn.dimap.ase.dsl.expdslv3.Factor;
import br.ufrn.dimap.ase.dsl.expdslv3.Goal;
import br.ufrn.dimap.ase.dsl.expdslv3.Keyword;
import br.ufrn.dimap.ase.dsl.expdslv3.Metric;
import br.ufrn.dimap.ase.dsl.expdslv3.MetricType;
import br.ufrn.dimap.ase.dsl.expdslv3.Model;
import br.ufrn.dimap.ase.dsl.expdslv3.Parameter;
import br.ufrn.dimap.ase.dsl.expdslv3.Question;
import br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire;
import br.ufrn.dimap.ase.dsl.expdslv3.QuestionnaireType;
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
public class Expdslv3PackageImpl extends EPackageImpl implements Expdslv3Package
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
  private EClass experimentalDesignEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass authorEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass simpleAbstractEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass structuredAbstractEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass keywordEClass = null;

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
  private EClass simpleGoalEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass structuredGoalEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass researchQuestionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass researchHypothesisEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass variableEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass rangeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass depVariableEClass = null;

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
  private EClass doeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass lsEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass rcbdEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass crbEClass = null;

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
  private EClass metricEClass = null;

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
  private EEnum scaleTypeEEnum = null;

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
  private EEnum metricTypeEEnum = null;

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
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private Expdslv3PackageImpl()
  {
		super(eNS_URI, Expdslv3Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Expdslv3Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static Expdslv3Package init()
  {
		if (isInited) return (Expdslv3Package)EPackage.Registry.INSTANCE.getEPackage(Expdslv3Package.eNS_URI);

		// Obtain or create and register package
		Expdslv3PackageImpl theExpdslv3Package = (Expdslv3PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Expdslv3PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Expdslv3PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theExpdslv3Package.createPackageContents();

		// Initialize created meta-data
		theExpdslv3Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpdslv3Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Expdslv3Package.eNS_URI, theExpdslv3Package);
		return theExpdslv3Package;
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
  public EAttribute getExperimentElement_Description()
  {
		return (EAttribute)experimentElementEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExperimentElement_Experiments()
  {
		return (EReference)experimentElementEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExperimentElement_Process()
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
  public EClass getExperimentalDesign()
  {
		return experimentalDesignEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExperimentalDesign_Author()
  {
		return (EReference)experimentalDesignEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExperimentalDesign_Abstract()
  {
		return (EReference)experimentalDesignEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExperimentalDesign_Keyword()
  {
		return (EReference)experimentalDesignEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExperimentalDesign_Goal()
  {
		return (EReference)experimentalDesignEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExperimentalDesign_ResearchQuestion()
  {
		return (EReference)experimentalDesignEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExperimentalDesign_ResearchHypothesis()
  {
		return (EReference)experimentalDesignEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExperimentalDesign_Variable()
  {
		return (EReference)experimentalDesignEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExperimentalDesign_DepVar()
  {
		return (EReference)experimentalDesignEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExperimentalDesign_Factor()
  {
		return (EReference)experimentalDesignEClass.getEStructuralFeatures().get(8);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getExperimentalDesign_Type()
  {
		return (EAttribute)experimentalDesignEClass.getEStructuralFeatures().get(9);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExperimentalDesign_Doe()
  {
		return (EReference)experimentalDesignEClass.getEStructuralFeatures().get(10);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExperimentalDesign_Parameter()
  {
		return (EReference)experimentalDesignEClass.getEStructuralFeatures().get(11);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getExperimentalDesign_Replication()
  {
		return (EAttribute)experimentalDesignEClass.getEStructuralFeatures().get(12);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAuthor()
  {
		return authorEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAuthor_Identifier()
  {
		return (EAttribute)authorEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAuthor_Name()
  {
		return (EAttribute)authorEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstract()
  {
		return abstractEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSimpleAbstract()
  {
		return simpleAbstractEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getSimpleAbstract_Description()
  {
		return (EAttribute)simpleAbstractEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getStructuredAbstract()
  {
		return structuredAbstractEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getStructuredAbstract_Background()
  {
		return (EAttribute)structuredAbstractEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getStructuredAbstract_Objective()
  {
		return (EAttribute)structuredAbstractEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getStructuredAbstract_Methods()
  {
		return (EAttribute)structuredAbstractEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getStructuredAbstract_Results()
  {
		return (EAttribute)structuredAbstractEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getStructuredAbstract_Limitations()
  {
		return (EAttribute)structuredAbstractEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getStructuredAbstract_Conclusions()
  {
		return (EAttribute)structuredAbstractEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getKeyword()
  {
		return keywordEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getKeyword_Description()
  {
		return (EAttribute)keywordEClass.getEStructuralFeatures().get(0);
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
  public EClass getSimpleGoal()
  {
		return simpleGoalEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getSimpleGoal_Name()
  {
		return (EAttribute)simpleGoalEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getSimpleGoal_Description()
  {
		return (EAttribute)simpleGoalEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getStructuredGoal()
  {
		return structuredGoalEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getStructuredGoal_Object()
  {
		return (EAttribute)structuredGoalEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getStructuredGoal_Technique()
  {
		return (EAttribute)structuredGoalEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getStructuredGoal_Quality()
  {
		return (EAttribute)structuredGoalEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getStructuredGoal_PtView()
  {
		return (EAttribute)structuredGoalEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getStructuredGoal_ContextOf()
  {
		return (EAttribute)structuredGoalEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getResearchQuestion()
  {
		return researchQuestionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getResearchQuestion_Name()
  {
		return (EAttribute)researchQuestionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getResearchQuestion_Description()
  {
		return (EAttribute)researchQuestionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getResearchQuestion_Goal()
  {
		return (EReference)researchQuestionEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getResearchHypothesis()
  {
		return researchHypothesisEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getResearchHypothesis_Name()
  {
		return (EAttribute)researchHypothesisEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getResearchHypothesis_Description()
  {
		return (EAttribute)researchHypothesisEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getResearchHypothesis_Goal()
  {
		return (EReference)researchHypothesisEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getVariable()
  {
		return variableEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getVariable_Name()
  {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getVariable_Description()
  {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getVariable_ScaleType()
  {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariable_Range()
  {
		return (EReference)variableEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRange()
  {
		return rangeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRange_Name()
  {
		return (EAttribute)rangeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDepVariable()
  {
		return depVariableEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDepVariable_Variable()
  {
		return (EReference)depVariableEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDepVariable_Rq()
  {
		return (EReference)depVariableEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDepVariable_Rh()
  {
		return (EReference)depVariableEClass.getEStructuralFeatures().get(2);
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
  public EReference getFactor_Name()
  {
		return (EReference)factorEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDOE()
  {
		return doeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDOE_Treatment()
  {
		return (EReference)doeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLS()
  {
		return lsEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLS_Col()
  {
		return (EReference)lsEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLS_Row()
  {
		return (EReference)lsEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRCBD()
  {
		return rcbdEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRCBD_BlockVariable()
  {
		return (EReference)rcbdEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCRB()
  {
		return crbEClass;
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
  public EReference getParameter_Variable()
  {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
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
  public EReference getTask_Artefacts()
  {
		return (EReference)taskEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTask_Metric()
  {
		return (EReference)taskEClass.getEStructuralFeatures().get(5);
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
  public EClass getMetric()
  {
		return metricEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMetric_Name()
  {
		return (EReference)metricEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMetric_Type()
  {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMetric_Varname()
  {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(2);
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
  public EEnum getScaleType()
  {
		return scaleTypeEEnum;
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
  public EEnum getMetricType()
  {
		return metricTypeEEnum;
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
  public Expdslv3Factory getExpdslv3Factory()
  {
		return (Expdslv3Factory)getEFactoryInstance();
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
		createEAttribute(experimentElementEClass, EXPERIMENT_ELEMENT__DESCRIPTION);
		createEReference(experimentElementEClass, EXPERIMENT_ELEMENT__EXPERIMENTS);
		createEReference(experimentElementEClass, EXPERIMENT_ELEMENT__PROCESS);
		createEReference(experimentElementEClass, EXPERIMENT_ELEMENT__QUESTIONNAIRE);

		experimentalDesignEClass = createEClass(EXPERIMENTAL_DESIGN);
		createEReference(experimentalDesignEClass, EXPERIMENTAL_DESIGN__AUTHOR);
		createEReference(experimentalDesignEClass, EXPERIMENTAL_DESIGN__ABSTRACT);
		createEReference(experimentalDesignEClass, EXPERIMENTAL_DESIGN__KEYWORD);
		createEReference(experimentalDesignEClass, EXPERIMENTAL_DESIGN__GOAL);
		createEReference(experimentalDesignEClass, EXPERIMENTAL_DESIGN__RESEARCH_QUESTION);
		createEReference(experimentalDesignEClass, EXPERIMENTAL_DESIGN__RESEARCH_HYPOTHESIS);
		createEReference(experimentalDesignEClass, EXPERIMENTAL_DESIGN__VARIABLE);
		createEReference(experimentalDesignEClass, EXPERIMENTAL_DESIGN__DEP_VAR);
		createEReference(experimentalDesignEClass, EXPERIMENTAL_DESIGN__FACTOR);
		createEAttribute(experimentalDesignEClass, EXPERIMENTAL_DESIGN__TYPE);
		createEReference(experimentalDesignEClass, EXPERIMENTAL_DESIGN__DOE);
		createEReference(experimentalDesignEClass, EXPERIMENTAL_DESIGN__PARAMETER);
		createEAttribute(experimentalDesignEClass, EXPERIMENTAL_DESIGN__REPLICATION);

		authorEClass = createEClass(AUTHOR);
		createEAttribute(authorEClass, AUTHOR__IDENTIFIER);
		createEAttribute(authorEClass, AUTHOR__NAME);

		abstractEClass = createEClass(ABSTRACT);

		simpleAbstractEClass = createEClass(SIMPLE_ABSTRACT);
		createEAttribute(simpleAbstractEClass, SIMPLE_ABSTRACT__DESCRIPTION);

		structuredAbstractEClass = createEClass(STRUCTURED_ABSTRACT);
		createEAttribute(structuredAbstractEClass, STRUCTURED_ABSTRACT__BACKGROUND);
		createEAttribute(structuredAbstractEClass, STRUCTURED_ABSTRACT__OBJECTIVE);
		createEAttribute(structuredAbstractEClass, STRUCTURED_ABSTRACT__METHODS);
		createEAttribute(structuredAbstractEClass, STRUCTURED_ABSTRACT__RESULTS);
		createEAttribute(structuredAbstractEClass, STRUCTURED_ABSTRACT__LIMITATIONS);
		createEAttribute(structuredAbstractEClass, STRUCTURED_ABSTRACT__CONCLUSIONS);

		keywordEClass = createEClass(KEYWORD);
		createEAttribute(keywordEClass, KEYWORD__DESCRIPTION);

		goalEClass = createEClass(GOAL);

		simpleGoalEClass = createEClass(SIMPLE_GOAL);
		createEAttribute(simpleGoalEClass, SIMPLE_GOAL__NAME);
		createEAttribute(simpleGoalEClass, SIMPLE_GOAL__DESCRIPTION);

		structuredGoalEClass = createEClass(STRUCTURED_GOAL);
		createEAttribute(structuredGoalEClass, STRUCTURED_GOAL__OBJECT);
		createEAttribute(structuredGoalEClass, STRUCTURED_GOAL__TECHNIQUE);
		createEAttribute(structuredGoalEClass, STRUCTURED_GOAL__QUALITY);
		createEAttribute(structuredGoalEClass, STRUCTURED_GOAL__PT_VIEW);
		createEAttribute(structuredGoalEClass, STRUCTURED_GOAL__CONTEXT_OF);

		researchQuestionEClass = createEClass(RESEARCH_QUESTION);
		createEAttribute(researchQuestionEClass, RESEARCH_QUESTION__NAME);
		createEAttribute(researchQuestionEClass, RESEARCH_QUESTION__DESCRIPTION);
		createEReference(researchQuestionEClass, RESEARCH_QUESTION__GOAL);

		researchHypothesisEClass = createEClass(RESEARCH_HYPOTHESIS);
		createEAttribute(researchHypothesisEClass, RESEARCH_HYPOTHESIS__NAME);
		createEAttribute(researchHypothesisEClass, RESEARCH_HYPOTHESIS__DESCRIPTION);
		createEReference(researchHypothesisEClass, RESEARCH_HYPOTHESIS__GOAL);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__DESCRIPTION);
		createEAttribute(variableEClass, VARIABLE__SCALE_TYPE);
		createEReference(variableEClass, VARIABLE__RANGE);

		rangeEClass = createEClass(RANGE);
		createEAttribute(rangeEClass, RANGE__NAME);

		depVariableEClass = createEClass(DEP_VARIABLE);
		createEReference(depVariableEClass, DEP_VARIABLE__VARIABLE);
		createEReference(depVariableEClass, DEP_VARIABLE__RQ);
		createEReference(depVariableEClass, DEP_VARIABLE__RH);

		factorEClass = createEClass(FACTOR);
		createEReference(factorEClass, FACTOR__NAME);

		doeEClass = createEClass(DOE);
		createEReference(doeEClass, DOE__TREATMENT);

		lsEClass = createEClass(LS);
		createEReference(lsEClass, LS__COL);
		createEReference(lsEClass, LS__ROW);

		rcbdEClass = createEClass(RCBD);
		createEReference(rcbdEClass, RCBD__BLOCK_VARIABLE);

		crbEClass = createEClass(CRB);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__VARIABLE);

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
		createEReference(taskEClass, TASK__ARTEFACTS);
		createEReference(taskEClass, TASK__METRIC);

		artefactEClass = createEClass(ARTEFACT);
		createEAttribute(artefactEClass, ARTEFACT__NAME);
		createEAttribute(artefactEClass, ARTEFACT__DESCRIPTION);
		createEAttribute(artefactEClass, ARTEFACT__TYPE);

		metricEClass = createEClass(METRIC);
		createEReference(metricEClass, METRIC__NAME);
		createEAttribute(metricEClass, METRIC__TYPE);
		createEAttribute(metricEClass, METRIC__VARNAME);

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
		scaleTypeEEnum = createEEnum(SCALE_TYPE);
		designTypeEEnum = createEEnum(DESIGN_TYPE);
		roleTypeEEnum = createEEnum(ROLE_TYPE);
		artefactTypeEEnum = createEEnum(ARTEFACT_TYPE);
		metricTypeEEnum = createEEnum(METRIC_TYPE);
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
		simpleAbstractEClass.getESuperTypes().add(this.getAbstract());
		structuredAbstractEClass.getESuperTypes().add(this.getAbstract());
		simpleGoalEClass.getESuperTypes().add(this.getGoal());
		structuredGoalEClass.getESuperTypes().add(this.getGoal());
		lsEClass.getESuperTypes().add(this.getDOE());
		rcbdEClass.getESuperTypes().add(this.getDOE());
		crbEClass.getESuperTypes().add(this.getDOE());

		// Initialize classes and features; add operations and parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Elements(), this.getExperimentElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(experimentElementEClass, ExperimentElement.class, "ExperimentElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExperimentElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExperimentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, ExperimentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentElement_Experiments(), this.getExperimentalDesign(), null, "experiments", null, 0, 1, ExperimentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentElement_Process(), this.getProcess(), null, "process", null, 0, -1, ExperimentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentElement_Questionnaire(), this.getQuestionnaire(), null, "questionnaire", null, 0, -1, ExperimentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(experimentalDesignEClass, ExperimentalDesign.class, "ExperimentalDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExperimentalDesign_Author(), this.getAuthor(), null, "author", null, 0, -1, ExperimentalDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalDesign_Abstract(), this.getAbstract(), null, "abstract", null, 0, 1, ExperimentalDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalDesign_Keyword(), this.getKeyword(), null, "keyword", null, 0, -1, ExperimentalDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalDesign_Goal(), this.getGoal(), null, "goal", null, 0, -1, ExperimentalDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalDesign_ResearchQuestion(), this.getResearchQuestion(), null, "researchQuestion", null, 0, -1, ExperimentalDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalDesign_ResearchHypothesis(), this.getResearchHypothesis(), null, "researchHypothesis", null, 0, -1, ExperimentalDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalDesign_Variable(), this.getVariable(), null, "variable", null, 0, -1, ExperimentalDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalDesign_DepVar(), this.getDepVariable(), null, "depVar", null, 0, -1, ExperimentalDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalDesign_Factor(), this.getFactor(), null, "factor", null, 0, -1, ExperimentalDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentalDesign_Type(), this.getDesignType(), "type", null, 0, 1, ExperimentalDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalDesign_Doe(), this.getDOE(), null, "doe", null, 0, 1, ExperimentalDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalDesign_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, ExperimentalDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentalDesign_Replication(), ecorePackage.getEInt(), "replication", null, 0, 1, ExperimentalDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorEClass, Author.class, "Author", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthor_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractEClass, Abstract.class, "Abstract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleAbstractEClass, SimpleAbstract.class, "SimpleAbstract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleAbstract_Description(), ecorePackage.getEString(), "description", null, 0, 1, SimpleAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredAbstractEClass, StructuredAbstract.class, "StructuredAbstract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuredAbstract_Background(), ecorePackage.getEString(), "background", null, 0, 1, StructuredAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructuredAbstract_Objective(), ecorePackage.getEString(), "objective", null, 0, 1, StructuredAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructuredAbstract_Methods(), ecorePackage.getEString(), "methods", null, 0, 1, StructuredAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructuredAbstract_Results(), ecorePackage.getEString(), "results", null, 0, 1, StructuredAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructuredAbstract_Limitations(), ecorePackage.getEString(), "limitations", null, 0, 1, StructuredAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructuredAbstract_Conclusions(), ecorePackage.getEString(), "conclusions", null, 0, 1, StructuredAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keywordEClass, Keyword.class, "Keyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyword_Description(), ecorePackage.getEString(), "description", null, 0, 1, Keyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleGoalEClass, SimpleGoal.class, "SimpleGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleGoal_Name(), ecorePackage.getEString(), "name", null, 0, 1, SimpleGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleGoal_Description(), ecorePackage.getEString(), "description", null, 0, 1, SimpleGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredGoalEClass, StructuredGoal.class, "StructuredGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuredGoal_Object(), ecorePackage.getEString(), "object", null, 0, 1, StructuredGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructuredGoal_Technique(), ecorePackage.getEString(), "technique", null, 0, 1, StructuredGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructuredGoal_Quality(), ecorePackage.getEString(), "quality", null, 0, 1, StructuredGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructuredGoal_PtView(), ecorePackage.getEString(), "ptView", null, 0, 1, StructuredGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructuredGoal_ContextOf(), ecorePackage.getEString(), "contextOf", null, 0, 1, StructuredGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(researchQuestionEClass, ResearchQuestion.class, "ResearchQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResearchQuestion_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResearchQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResearchQuestion_Description(), ecorePackage.getEString(), "description", null, 0, 1, ResearchQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResearchQuestion_Goal(), this.getGoal(), null, "goal", null, 0, 1, ResearchQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(researchHypothesisEClass, ResearchHypothesis.class, "ResearchHypothesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResearchHypothesis_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResearchHypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResearchHypothesis_Description(), ecorePackage.getEString(), "description", null, 0, 1, ResearchHypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResearchHypothesis_Goal(), this.getGoal(), null, "goal", null, 0, 1, ResearchHypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Description(), ecorePackage.getEString(), "description", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_ScaleType(), this.getScaleType(), "scaleType", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_Range(), this.getRange(), null, "range", null, 0, -1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeEClass, Range.class, "Range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRange_Name(), ecorePackage.getEString(), "name", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(depVariableEClass, DepVariable.class, "DepVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDepVariable_Variable(), this.getVariable(), null, "variable", null, 0, 1, DepVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepVariable_Rq(), this.getResearchQuestion(), null, "rq", null, 0, 1, DepVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepVariable_Rh(), this.getResearchHypothesis(), null, "rh", null, 0, 1, DepVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factorEClass, Factor.class, "Factor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFactor_Name(), this.getVariable(), null, "name", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doeEClass, br.ufrn.dimap.ase.dsl.expdslv3.DOE.class, "DOE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDOE_Treatment(), this.getVariable(), null, "treatment", null, 0, 1, br.ufrn.dimap.ase.dsl.expdslv3.DOE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lsEClass, br.ufrn.dimap.ase.dsl.expdslv3.LS.class, "LS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLS_Col(), this.getVariable(), null, "col", null, 0, 1, br.ufrn.dimap.ase.dsl.expdslv3.LS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLS_Row(), this.getVariable(), null, "row", null, 0, 1, br.ufrn.dimap.ase.dsl.expdslv3.LS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rcbdEClass, br.ufrn.dimap.ase.dsl.expdslv3.RCBD.class, "RCBD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRCBD_BlockVariable(), this.getVariable(), null, "blockVariable", null, 0, 1, br.ufrn.dimap.ase.dsl.expdslv3.RCBD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crbEClass, br.ufrn.dimap.ase.dsl.expdslv3.CRB.class, "CRB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Variable(), this.getVariable(), null, "variable", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, br.ufrn.dimap.ase.dsl.expdslv3.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcess_Name(), ecorePackage.getEString(), "name", null, 0, 1, br.ufrn.dimap.ase.dsl.expdslv3.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Treatment(), this.getRange(), null, "treatment", null, 0, -1, br.ufrn.dimap.ase.dsl.expdslv3.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_Role(), this.getRoleType(), "role", null, 0, -1, br.ufrn.dimap.ase.dsl.expdslv3.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Task(), this.getTask(), null, "task", null, 0, -1, br.ufrn.dimap.ase.dsl.expdslv3.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Description(), ecorePackage.getEString(), "description", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Next(), this.getTask(), null, "next", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Role(), this.getRoleType(), "role", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Artefacts(), this.getArtefact(), null, "artefacts", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Metric(), this.getMetric(), null, "metric", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artefactEClass, Artefact.class, "Artefact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtefact_Name(), ecorePackage.getEString(), "name", null, 0, 1, Artefact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtefact_Description(), ecorePackage.getEString(), "description", null, 0, 1, Artefact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtefact_Type(), this.getArtefactType(), "type", null, 0, 1, Artefact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricEClass, Metric.class, "Metric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetric_Name(), this.getVariable(), null, "name", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_Type(), this.getMetricType(), "type", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_Varname(), ecorePackage.getEString(), "varname", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEEnum(scaleTypeEEnum, ScaleType.class, "ScaleType");
		addEEnumLiteral(scaleTypeEEnum, ScaleType.NUMERICIAL);
		addEEnumLiteral(scaleTypeEEnum, ScaleType.RATIO);
		addEEnumLiteral(scaleTypeEEnum, ScaleType.ORDINAL);
		addEEnumLiteral(scaleTypeEEnum, ScaleType.NOMINAL);

		initEEnum(designTypeEEnum, DesignType.class, "DesignType");
		addEEnumLiteral(designTypeEEnum, DesignType.CDR);
		addEEnumLiteral(designTypeEEnum, DesignType.RCBD);
		addEEnumLiteral(designTypeEEnum, DesignType.LS);
		addEEnumLiteral(designTypeEEnum, DesignType.OTHER);

		initEEnum(roleTypeEEnum, RoleType.class, "RoleType");
		addEEnumLiteral(roleTypeEEnum, RoleType.PARTICIPANT);
		addEEnumLiteral(roleTypeEEnum, RoleType.RESEARCHER);

		initEEnum(artefactTypeEEnum, ArtefactType.class, "ArtefactType");
		addEEnumLiteral(artefactTypeEEnum, ArtefactType.IN_);
		addEEnumLiteral(artefactTypeEEnum, ArtefactType.OUT_);
		addEEnumLiteral(artefactTypeEEnum, ArtefactType.INOUT_);

		initEEnum(metricTypeEEnum, MetricType.class, "MetricType");
		addEEnumLiteral(metricTypeEEnum, MetricType.AUTOTIME);

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

} //Expdslv3PackageImpl

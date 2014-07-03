/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3;

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
 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Factory
 * @model kind="package"
 * @generated
 */
public interface Expdslv3Package extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "expdslv3";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.ufrn.br/dimap/ase/dsl/Expdslv3";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "expdslv3";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  Expdslv3Package eINSTANCE = br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl.init();

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.ModelImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getModel()
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
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentElementImpl <em>Experiment Element</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentElementImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getExperimentElement()
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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENT_ELEMENT__DESCRIPTION = 1;

  /**
	 * The feature id for the '<em><b>Experiments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENT_ELEMENT__EXPERIMENTS = 2;

  /**
	 * The feature id for the '<em><b>Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENT_ELEMENT__PROCESS = 3;

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
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentalDesignImpl <em>Experimental Design</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentalDesignImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getExperimentalDesign()
	 * @generated
	 */
  int EXPERIMENTAL_DESIGN = 2;

  /**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_DESIGN__AUTHOR = 0;

  /**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_DESIGN__ABSTRACT = 1;

  /**
	 * The feature id for the '<em><b>Keyword</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_DESIGN__KEYWORD = 2;

  /**
	 * The feature id for the '<em><b>Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_DESIGN__GOAL = 3;

  /**
	 * The feature id for the '<em><b>Research Question</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_DESIGN__RESEARCH_QUESTION = 4;

  /**
	 * The feature id for the '<em><b>Research Hypothesis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_DESIGN__RESEARCH_HYPOTHESIS = 5;

  /**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_DESIGN__VARIABLE = 6;

  /**
	 * The feature id for the '<em><b>Dep Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_DESIGN__DEP_VAR = 7;

  /**
	 * The feature id for the '<em><b>Factor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_DESIGN__FACTOR = 8;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_DESIGN__TYPE = 9;

  /**
	 * The feature id for the '<em><b>Doe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_DESIGN__DOE = 10;

  /**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_DESIGN__PARAMETER = 11;

  /**
	 * The feature id for the '<em><b>Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_DESIGN__REPLICATION = 12;

  /**
	 * The number of structural features of the '<em>Experimental Design</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPERIMENTAL_DESIGN_FEATURE_COUNT = 13;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.AuthorImpl <em>Author</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.AuthorImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getAuthor()
	 * @generated
	 */
  int AUTHOR = 3;

  /**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AUTHOR__IDENTIFIER = 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AUTHOR__NAME = 1;

  /**
	 * The number of structural features of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AUTHOR_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.AbstractImpl <em>Abstract</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.AbstractImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getAbstract()
	 * @generated
	 */
  int ABSTRACT = 4;

  /**
	 * The number of structural features of the '<em>Abstract</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.SimpleAbstractImpl <em>Simple Abstract</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.SimpleAbstractImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getSimpleAbstract()
	 * @generated
	 */
  int SIMPLE_ABSTRACT = 5;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SIMPLE_ABSTRACT__DESCRIPTION = ABSTRACT_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Simple Abstract</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SIMPLE_ABSTRACT_FEATURE_COUNT = ABSTRACT_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.StructuredAbstractImpl <em>Structured Abstract</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.StructuredAbstractImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getStructuredAbstract()
	 * @generated
	 */
  int STRUCTURED_ABSTRACT = 6;

  /**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRUCTURED_ABSTRACT__BACKGROUND = ABSTRACT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRUCTURED_ABSTRACT__OBJECTIVE = ABSTRACT_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRUCTURED_ABSTRACT__METHODS = ABSTRACT_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRUCTURED_ABSTRACT__RESULTS = ABSTRACT_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Limitations</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRUCTURED_ABSTRACT__LIMITATIONS = ABSTRACT_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Conclusions</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRUCTURED_ABSTRACT__CONCLUSIONS = ABSTRACT_FEATURE_COUNT + 5;

  /**
	 * The number of structural features of the '<em>Structured Abstract</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRUCTURED_ABSTRACT_FEATURE_COUNT = ABSTRACT_FEATURE_COUNT + 6;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.KeywordImpl <em>Keyword</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.KeywordImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getKeyword()
	 * @generated
	 */
  int KEYWORD = 7;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int KEYWORD__DESCRIPTION = 0;

  /**
	 * The number of structural features of the '<em>Keyword</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int KEYWORD_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.GoalImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getGoal()
	 * @generated
	 */
  int GOAL = 8;

  /**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GOAL_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.SimpleGoalImpl <em>Simple Goal</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.SimpleGoalImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getSimpleGoal()
	 * @generated
	 */
  int SIMPLE_GOAL = 9;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SIMPLE_GOAL__NAME = GOAL_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SIMPLE_GOAL__DESCRIPTION = GOAL_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Simple Goal</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SIMPLE_GOAL_FEATURE_COUNT = GOAL_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.StructuredGoalImpl <em>Structured Goal</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.StructuredGoalImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getStructuredGoal()
	 * @generated
	 */
  int STRUCTURED_GOAL = 10;

  /**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRUCTURED_GOAL__OBJECT = GOAL_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Technique</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRUCTURED_GOAL__TECHNIQUE = GOAL_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRUCTURED_GOAL__QUALITY = GOAL_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Pt View</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRUCTURED_GOAL__PT_VIEW = GOAL_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Context Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRUCTURED_GOAL__CONTEXT_OF = GOAL_FEATURE_COUNT + 4;

  /**
	 * The number of structural features of the '<em>Structured Goal</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRUCTURED_GOAL_FEATURE_COUNT = GOAL_FEATURE_COUNT + 5;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ResearchQuestionImpl <em>Research Question</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.ResearchQuestionImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getResearchQuestion()
	 * @generated
	 */
  int RESEARCH_QUESTION = 11;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESEARCH_QUESTION__NAME = 0;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESEARCH_QUESTION__DESCRIPTION = 1;

  /**
	 * The feature id for the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESEARCH_QUESTION__GOAL = 2;

  /**
	 * The number of structural features of the '<em>Research Question</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESEARCH_QUESTION_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ResearchHypothesisImpl <em>Research Hypothesis</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.ResearchHypothesisImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getResearchHypothesis()
	 * @generated
	 */
  int RESEARCH_HYPOTHESIS = 12;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESEARCH_HYPOTHESIS__NAME = 0;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESEARCH_HYPOTHESIS__DESCRIPTION = 1;

  /**
	 * The feature id for the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESEARCH_HYPOTHESIS__GOAL = 2;

  /**
	 * The number of structural features of the '<em>Research Hypothesis</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESEARCH_HYPOTHESIS_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.VariableImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getVariable()
	 * @generated
	 */
  int VARIABLE = 13;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE__NAME = 0;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE__DESCRIPTION = 1;

  /**
	 * The feature id for the '<em><b>Scale Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE__SCALE_TYPE = 2;

  /**
	 * The feature id for the '<em><b>Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE__RANGE = 3;

  /**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.RangeImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getRange()
	 * @generated
	 */
  int RANGE = 14;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RANGE__NAME = 0;

  /**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RANGE_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.DepVariableImpl <em>Dep Variable</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.DepVariableImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getDepVariable()
	 * @generated
	 */
  int DEP_VARIABLE = 15;

  /**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEP_VARIABLE__VARIABLE = 0;

  /**
	 * The feature id for the '<em><b>Rq</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEP_VARIABLE__RQ = 1;

  /**
	 * The feature id for the '<em><b>Rh</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEP_VARIABLE__RH = 2;

  /**
	 * The number of structural features of the '<em>Dep Variable</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEP_VARIABLE_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.FactorImpl <em>Factor</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.FactorImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getFactor()
	 * @generated
	 */
  int FACTOR = 16;

  /**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FACTOR__NAME = 0;

  /**
	 * The number of structural features of the '<em>Factor</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FACTOR_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.DOEImpl <em>DOE</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.DOEImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getDOE()
	 * @generated
	 */
  int DOE = 17;

  /**
	 * The feature id for the '<em><b>Treatment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOE__TREATMENT = 0;

  /**
	 * The number of structural features of the '<em>DOE</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOE_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.LSImpl <em>LS</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.LSImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getLS()
	 * @generated
	 */
  int LS = 18;

  /**
	 * The feature id for the '<em><b>Treatment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LS__TREATMENT = DOE__TREATMENT;

  /**
	 * The feature id for the '<em><b>Col</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LS__COL = DOE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Row</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LS__ROW = DOE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>LS</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LS_FEATURE_COUNT = DOE_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.RCBDImpl <em>RCBD</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.RCBDImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getRCBD()
	 * @generated
	 */
  int RCBD = 19;

  /**
	 * The feature id for the '<em><b>Treatment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RCBD__TREATMENT = DOE__TREATMENT;

  /**
	 * The feature id for the '<em><b>Block Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RCBD__BLOCK_VARIABLE = DOE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>RCBD</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RCBD_FEATURE_COUNT = DOE_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.CRBImpl <em>CRB</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.CRBImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getCRB()
	 * @generated
	 */
  int CRB = 20;

  /**
	 * The feature id for the '<em><b>Treatment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CRB__TREATMENT = DOE__TREATMENT;

  /**
	 * The number of structural features of the '<em>CRB</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CRB_FEATURE_COUNT = DOE_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.ParameterImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getParameter()
	 * @generated
	 */
  int PARAMETER = 21;

  /**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PARAMETER__VARIABLE = 0;

  /**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PARAMETER_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.ProcessImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getProcess()
	 * @generated
	 */
  int PROCESS = 22;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROCESS__NAME = 0;

  /**
	 * The feature id for the '<em><b>Treatment</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROCESS__TREATMENT = 1;

  /**
	 * The feature id for the '<em><b>Role</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROCESS__ROLE = 2;

  /**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROCESS__TASK = 3;

  /**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROCESS_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.TaskImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getTask()
	 * @generated
	 */
  int TASK = 23;

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
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK__NEXT = 2;

  /**
	 * The feature id for the '<em><b>Role</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK__ROLE = 3;

  /**
	 * The feature id for the '<em><b>Artefacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK__ARTEFACTS = 4;

  /**
	 * The feature id for the '<em><b>Metric</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK__METRIC = 5;

  /**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK_FEATURE_COUNT = 6;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ArtefactImpl <em>Artefact</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.ArtefactImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getArtefact()
	 * @generated
	 */
  int ARTEFACT = 24;

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
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.MetricImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getMetric()
	 * @generated
	 */
  int METRIC = 25;

  /**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int METRIC__NAME = 0;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int METRIC__TYPE = 1;

  /**
	 * The feature id for the '<em><b>Varname</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int METRIC__VARNAME = 2;

  /**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int METRIC_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.QuestionnaireImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getQuestionnaire()
	 * @generated
	 */
  int QUESTIONNAIRE = 26;

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
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.QuestionImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getQuestion()
	 * @generated
	 */
  int QUESTION = 27;

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
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.AlternativesImpl <em>Alternatives</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.AlternativesImpl
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getAlternatives()
	 * @generated
	 */
  int ALTERNATIVES = 28;

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
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.ScaleType <em>Scale Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ScaleType
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getScaleType()
	 * @generated
	 */
  int SCALE_TYPE = 29;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.DesignType <em>Design Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.DesignType
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getDesignType()
	 * @generated
	 */
  int DESIGN_TYPE = 30;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.RoleType <em>Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.RoleType
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getRoleType()
	 * @generated
	 */
  int ROLE_TYPE = 31;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.ArtefactType <em>Artefact Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ArtefactType
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getArtefactType()
	 * @generated
	 */
  int ARTEFACT_TYPE = 32;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.MetricType <em>Metric Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.MetricType
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getMetricType()
	 * @generated
	 */
  int METRIC_TYPE = 33;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.QuestionnaireType <em>Questionnaire Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.QuestionnaireType
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getQuestionnaireType()
	 * @generated
	 */
  int QUESTIONNAIRE_TYPE = 34;

  /**
	 * The meta object id for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.AnswerType <em>Answer Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.AnswerType
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getAnswerType()
	 * @generated
	 */
  int ANSWER_TYPE = 35;


  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Model
	 * @generated
	 */
  EClass getModel();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expdslv3.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Model#getElements()
	 * @see #getModel()
	 * @generated
	 */
  EReference getModel_Elements();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement <em>Experiment Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Element</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement
	 * @generated
	 */
  EClass getExperimentElement();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement#getName()
	 * @see #getExperimentElement()
	 * @generated
	 */
  EAttribute getExperimentElement_Name();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement#getDescription()
	 * @see #getExperimentElement()
	 * @generated
	 */
  EAttribute getExperimentElement_Description();

  /**
	 * Returns the meta object for the containment reference '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement#getExperiments <em>Experiments</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Experiments</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement#getExperiments()
	 * @see #getExperimentElement()
	 * @generated
	 */
  EReference getExperimentElement_Experiments();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement#getProcess()
	 * @see #getExperimentElement()
	 * @generated
	 */
  EReference getExperimentElement_Process();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement#getQuestionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questionnaire</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement#getQuestionnaire()
	 * @see #getExperimentElement()
	 * @generated
	 */
  EReference getExperimentElement_Questionnaire();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign <em>Experimental Design</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experimental Design</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign
	 * @generated
	 */
  EClass getExperimentalDesign();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Author</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getAuthor()
	 * @see #getExperimentalDesign()
	 * @generated
	 */
  EReference getExperimentalDesign_Author();

  /**
	 * Returns the meta object for the containment reference '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getAbstract()
	 * @see #getExperimentalDesign()
	 * @generated
	 */
  EReference getExperimentalDesign_Abstract();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keyword</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getKeyword()
	 * @see #getExperimentalDesign()
	 * @generated
	 */
  EReference getExperimentalDesign_Keyword();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goal</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getGoal()
	 * @see #getExperimentalDesign()
	 * @generated
	 */
  EReference getExperimentalDesign_Goal();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getResearchQuestion <em>Research Question</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Research Question</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getResearchQuestion()
	 * @see #getExperimentalDesign()
	 * @generated
	 */
  EReference getExperimentalDesign_ResearchQuestion();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getResearchHypothesis <em>Research Hypothesis</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Research Hypothesis</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getResearchHypothesis()
	 * @see #getExperimentalDesign()
	 * @generated
	 */
  EReference getExperimentalDesign_ResearchHypothesis();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getVariable()
	 * @see #getExperimentalDesign()
	 * @generated
	 */
  EReference getExperimentalDesign_Variable();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getDepVar <em>Dep Var</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dep Var</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getDepVar()
	 * @see #getExperimentalDesign()
	 * @generated
	 */
  EReference getExperimentalDesign_DepVar();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Factor</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getFactor()
	 * @see #getExperimentalDesign()
	 * @generated
	 */
  EReference getExperimentalDesign_Factor();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getType()
	 * @see #getExperimentalDesign()
	 * @generated
	 */
  EAttribute getExperimentalDesign_Type();

  /**
	 * Returns the meta object for the containment reference '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getDoe <em>Doe</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doe</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getDoe()
	 * @see #getExperimentalDesign()
	 * @generated
	 */
  EReference getExperimentalDesign_Doe();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getParameter()
	 * @see #getExperimentalDesign()
	 * @generated
	 */
  EReference getExperimentalDesign_Parameter();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getReplication <em>Replication</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replication</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getReplication()
	 * @see #getExperimentalDesign()
	 * @generated
	 */
  EAttribute getExperimentalDesign_Replication();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Author
	 * @generated
	 */
  EClass getAuthor();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Author#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Author#getIdentifier()
	 * @see #getAuthor()
	 * @generated
	 */
  EAttribute getAuthor_Identifier();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Author#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Author#getName()
	 * @see #getAuthor()
	 * @generated
	 */
  EAttribute getAuthor_Name();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Abstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Abstract
	 * @generated
	 */
  EClass getAbstract();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.SimpleAbstract <em>Simple Abstract</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Abstract</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.SimpleAbstract
	 * @generated
	 */
  EClass getSimpleAbstract();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.SimpleAbstract#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.SimpleAbstract#getDescription()
	 * @see #getSimpleAbstract()
	 * @generated
	 */
  EAttribute getSimpleAbstract_Description();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.StructuredAbstract <em>Structured Abstract</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Abstract</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.StructuredAbstract
	 * @generated
	 */
  EClass getStructuredAbstract();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.StructuredAbstract#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.StructuredAbstract#getBackground()
	 * @see #getStructuredAbstract()
	 * @generated
	 */
  EAttribute getStructuredAbstract_Background();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.StructuredAbstract#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objective</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.StructuredAbstract#getObjective()
	 * @see #getStructuredAbstract()
	 * @generated
	 */
  EAttribute getStructuredAbstract_Objective();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.StructuredAbstract#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Methods</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.StructuredAbstract#getMethods()
	 * @see #getStructuredAbstract()
	 * @generated
	 */
  EAttribute getStructuredAbstract_Methods();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.StructuredAbstract#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Results</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.StructuredAbstract#getResults()
	 * @see #getStructuredAbstract()
	 * @generated
	 */
  EAttribute getStructuredAbstract_Results();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.StructuredAbstract#getLimitations <em>Limitations</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limitations</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.StructuredAbstract#getLimitations()
	 * @see #getStructuredAbstract()
	 * @generated
	 */
  EAttribute getStructuredAbstract_Limitations();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.StructuredAbstract#getConclusions <em>Conclusions</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conclusions</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.StructuredAbstract#getConclusions()
	 * @see #getStructuredAbstract()
	 * @generated
	 */
  EAttribute getStructuredAbstract_Conclusions();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Keyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Keyword
	 * @generated
	 */
  EClass getKeyword();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Keyword#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Keyword#getDescription()
	 * @see #getKeyword()
	 * @generated
	 */
  EAttribute getKeyword_Description();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Goal
	 * @generated
	 */
  EClass getGoal();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.SimpleGoal <em>Simple Goal</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Goal</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.SimpleGoal
	 * @generated
	 */
  EClass getSimpleGoal();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.SimpleGoal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.SimpleGoal#getName()
	 * @see #getSimpleGoal()
	 * @generated
	 */
  EAttribute getSimpleGoal_Name();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.SimpleGoal#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.SimpleGoal#getDescription()
	 * @see #getSimpleGoal()
	 * @generated
	 */
  EAttribute getSimpleGoal_Description();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.StructuredGoal <em>Structured Goal</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Goal</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.StructuredGoal
	 * @generated
	 */
  EClass getStructuredGoal();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.StructuredGoal#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.StructuredGoal#getObject()
	 * @see #getStructuredGoal()
	 * @generated
	 */
  EAttribute getStructuredGoal_Object();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.StructuredGoal#getTechnique <em>Technique</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technique</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.StructuredGoal#getTechnique()
	 * @see #getStructuredGoal()
	 * @generated
	 */
  EAttribute getStructuredGoal_Technique();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.StructuredGoal#getQuality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.StructuredGoal#getQuality()
	 * @see #getStructuredGoal()
	 * @generated
	 */
  EAttribute getStructuredGoal_Quality();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.StructuredGoal#getPtView <em>Pt View</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pt View</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.StructuredGoal#getPtView()
	 * @see #getStructuredGoal()
	 * @generated
	 */
  EAttribute getStructuredGoal_PtView();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.StructuredGoal#getContextOf <em>Context Of</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Of</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.StructuredGoal#getContextOf()
	 * @see #getStructuredGoal()
	 * @generated
	 */
  EAttribute getStructuredGoal_ContextOf();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.ResearchQuestion <em>Research Question</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Research Question</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ResearchQuestion
	 * @generated
	 */
  EClass getResearchQuestion();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.ResearchQuestion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ResearchQuestion#getName()
	 * @see #getResearchQuestion()
	 * @generated
	 */
  EAttribute getResearchQuestion_Name();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.ResearchQuestion#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ResearchQuestion#getDescription()
	 * @see #getResearchQuestion()
	 * @generated
	 */
  EAttribute getResearchQuestion_Description();

  /**
	 * Returns the meta object for the reference '{@link br.ufrn.dimap.ase.dsl.expdslv3.ResearchQuestion#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ResearchQuestion#getGoal()
	 * @see #getResearchQuestion()
	 * @generated
	 */
  EReference getResearchQuestion_Goal();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.ResearchHypothesis <em>Research Hypothesis</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Research Hypothesis</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ResearchHypothesis
	 * @generated
	 */
  EClass getResearchHypothesis();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.ResearchHypothesis#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ResearchHypothesis#getName()
	 * @see #getResearchHypothesis()
	 * @generated
	 */
  EAttribute getResearchHypothesis_Name();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.ResearchHypothesis#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ResearchHypothesis#getDescription()
	 * @see #getResearchHypothesis()
	 * @generated
	 */
  EAttribute getResearchHypothesis_Description();

  /**
	 * Returns the meta object for the reference '{@link br.ufrn.dimap.ase.dsl.expdslv3.ResearchHypothesis#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ResearchHypothesis#getGoal()
	 * @see #getResearchHypothesis()
	 * @generated
	 */
  EReference getResearchHypothesis_Goal();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Variable
	 * @generated
	 */
  EClass getVariable();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
  EAttribute getVariable_Name();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Variable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Variable#getDescription()
	 * @see #getVariable()
	 * @generated
	 */
  EAttribute getVariable_Description();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Variable#getScaleType <em>Scale Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Variable#getScaleType()
	 * @see #getVariable()
	 * @generated
	 */
  EAttribute getVariable_ScaleType();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expdslv3.Variable#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Range</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Variable#getRange()
	 * @see #getVariable()
	 * @generated
	 */
  EReference getVariable_Range();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Range
	 * @generated
	 */
  EClass getRange();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Range#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Range#getName()
	 * @see #getRange()
	 * @generated
	 */
  EAttribute getRange_Name();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.DepVariable <em>Dep Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dep Variable</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.DepVariable
	 * @generated
	 */
  EClass getDepVariable();

  /**
	 * Returns the meta object for the reference '{@link br.ufrn.dimap.ase.dsl.expdslv3.DepVariable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.DepVariable#getVariable()
	 * @see #getDepVariable()
	 * @generated
	 */
  EReference getDepVariable_Variable();

  /**
	 * Returns the meta object for the reference '{@link br.ufrn.dimap.ase.dsl.expdslv3.DepVariable#getRq <em>Rq</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rq</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.DepVariable#getRq()
	 * @see #getDepVariable()
	 * @generated
	 */
  EReference getDepVariable_Rq();

  /**
	 * Returns the meta object for the reference '{@link br.ufrn.dimap.ase.dsl.expdslv3.DepVariable#getRh <em>Rh</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rh</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.DepVariable#getRh()
	 * @see #getDepVariable()
	 * @generated
	 */
  EReference getDepVariable_Rh();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Factor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factor</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Factor
	 * @generated
	 */
  EClass getFactor();

  /**
	 * Returns the meta object for the reference '{@link br.ufrn.dimap.ase.dsl.expdslv3.Factor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Factor#getName()
	 * @see #getFactor()
	 * @generated
	 */
  EReference getFactor_Name();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.DOE <em>DOE</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DOE</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.DOE
	 * @generated
	 */
  EClass getDOE();

  /**
	 * Returns the meta object for the reference '{@link br.ufrn.dimap.ase.dsl.expdslv3.DOE#getTreatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Treatment</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.DOE#getTreatment()
	 * @see #getDOE()
	 * @generated
	 */
  EReference getDOE_Treatment();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.LS <em>LS</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LS</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.LS
	 * @generated
	 */
  EClass getLS();

  /**
	 * Returns the meta object for the reference '{@link br.ufrn.dimap.ase.dsl.expdslv3.LS#getCol <em>Col</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Col</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.LS#getCol()
	 * @see #getLS()
	 * @generated
	 */
  EReference getLS_Col();

  /**
	 * Returns the meta object for the reference '{@link br.ufrn.dimap.ase.dsl.expdslv3.LS#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Row</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.LS#getRow()
	 * @see #getLS()
	 * @generated
	 */
  EReference getLS_Row();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.RCBD <em>RCBD</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RCBD</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.RCBD
	 * @generated
	 */
  EClass getRCBD();

  /**
	 * Returns the meta object for the reference '{@link br.ufrn.dimap.ase.dsl.expdslv3.RCBD#getBlockVariable <em>Block Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Block Variable</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.RCBD#getBlockVariable()
	 * @see #getRCBD()
	 * @generated
	 */
  EReference getRCBD_BlockVariable();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.CRB <em>CRB</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CRB</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.CRB
	 * @generated
	 */
  EClass getCRB();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Parameter
	 * @generated
	 */
  EClass getParameter();

  /**
	 * Returns the meta object for the reference '{@link br.ufrn.dimap.ase.dsl.expdslv3.Parameter#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Parameter#getVariable()
	 * @see #getParameter()
	 * @generated
	 */
  EReference getParameter_Variable();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Process
	 * @generated
	 */
  EClass getProcess();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
  EAttribute getProcess_Name();

  /**
	 * Returns the meta object for the reference list '{@link br.ufrn.dimap.ase.dsl.expdslv3.Process#getTreatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Treatment</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Process#getTreatment()
	 * @see #getProcess()
	 * @generated
	 */
  EReference getProcess_Treatment();

  /**
	 * Returns the meta object for the attribute list '{@link br.ufrn.dimap.ase.dsl.expdslv3.Process#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Role</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Process#getRole()
	 * @see #getProcess()
	 * @generated
	 */
  EAttribute getProcess_Role();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expdslv3.Process#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Process#getTask()
	 * @see #getProcess()
	 * @generated
	 */
  EReference getProcess_Task();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Task
	 * @generated
	 */
  EClass getTask();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
  EAttribute getTask_Name();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
  EAttribute getTask_Description();

  /**
	 * Returns the meta object for the reference list '{@link br.ufrn.dimap.ase.dsl.expdslv3.Task#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Task#getNext()
	 * @see #getTask()
	 * @generated
	 */
  EReference getTask_Next();

  /**
	 * Returns the meta object for the attribute list '{@link br.ufrn.dimap.ase.dsl.expdslv3.Task#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Role</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Task#getRole()
	 * @see #getTask()
	 * @generated
	 */
  EAttribute getTask_Role();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expdslv3.Task#getArtefacts <em>Artefacts</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artefacts</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Task#getArtefacts()
	 * @see #getTask()
	 * @generated
	 */
  EReference getTask_Artefacts();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expdslv3.Task#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Task#getMetric()
	 * @see #getTask()
	 * @generated
	 */
  EReference getTask_Metric();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Artefact <em>Artefact</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artefact</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Artefact
	 * @generated
	 */
  EClass getArtefact();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Artefact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Artefact#getName()
	 * @see #getArtefact()
	 * @generated
	 */
  EAttribute getArtefact_Name();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Artefact#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Artefact#getDescription()
	 * @see #getArtefact()
	 * @generated
	 */
  EAttribute getArtefact_Description();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Artefact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Artefact#getType()
	 * @see #getArtefact()
	 * @generated
	 */
  EAttribute getArtefact_Type();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Metric
	 * @generated
	 */
  EClass getMetric();

  /**
	 * Returns the meta object for the reference '{@link br.ufrn.dimap.ase.dsl.expdslv3.Metric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Metric#getName()
	 * @see #getMetric()
	 * @generated
	 */
  EReference getMetric_Name();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Metric#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Metric#getType()
	 * @see #getMetric()
	 * @generated
	 */
  EAttribute getMetric_Type();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Metric#getVarname <em>Varname</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Varname</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Metric#getVarname()
	 * @see #getMetric()
	 * @generated
	 */
  EAttribute getMetric_Varname();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnaire</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire
	 * @generated
	 */
  EClass getQuestionnaire();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire#getName()
	 * @see #getQuestionnaire()
	 * @generated
	 */
  EAttribute getQuestionnaire_Name();

  /**
	 * Returns the meta object for the reference list '{@link br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire#getRelatesTo <em>Relates To</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relates To</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire#getRelatesTo()
	 * @see #getQuestionnaire()
	 * @generated
	 */
  EReference getQuestionnaire_RelatesTo();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire#getQuestionnaireType <em>Questionnaire Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Questionnaire Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire#getQuestionnaireType()
	 * @see #getQuestionnaire()
	 * @generated
	 */
  EAttribute getQuestionnaire_QuestionnaireType();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire#getQuestion()
	 * @see #getQuestionnaire()
	 * @generated
	 */
  EReference getQuestionnaire_Question();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Question
	 * @generated
	 */
  EClass getQuestion();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Question#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Question#getName()
	 * @see #getQuestion()
	 * @generated
	 */
  EAttribute getQuestion_Name();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Question#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Question#getDescription()
	 * @see #getQuestion()
	 * @generated
	 */
  EAttribute getQuestion_Description();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Question#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Question#getType()
	 * @see #getQuestion()
	 * @generated
	 */
  EAttribute getQuestion_Type();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Question#getReq <em>Req</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Question#getReq()
	 * @see #getQuestion()
	 * @generated
	 */
  EAttribute getQuestion_Req();

  /**
	 * Returns the meta object for the containment reference list '{@link br.ufrn.dimap.ase.dsl.expdslv3.Question#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternatives</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Question#getAlternatives()
	 * @see #getQuestion()
	 * @generated
	 */
  EReference getQuestion_Alternatives();

  /**
	 * Returns the meta object for class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Alternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternatives</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Alternatives
	 * @generated
	 */
  EClass getAlternatives();

  /**
	 * Returns the meta object for the attribute '{@link br.ufrn.dimap.ase.dsl.expdslv3.Alternatives#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Alternatives#getDescription()
	 * @see #getAlternatives()
	 * @generated
	 */
  EAttribute getAlternatives_Description();

  /**
	 * Returns the meta object for enum '{@link br.ufrn.dimap.ase.dsl.expdslv3.ScaleType <em>Scale Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scale Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ScaleType
	 * @generated
	 */
  EEnum getScaleType();

  /**
	 * Returns the meta object for enum '{@link br.ufrn.dimap.ase.dsl.expdslv3.DesignType <em>Design Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Design Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.DesignType
	 * @generated
	 */
  EEnum getDesignType();

  /**
	 * Returns the meta object for enum '{@link br.ufrn.dimap.ase.dsl.expdslv3.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.RoleType
	 * @generated
	 */
  EEnum getRoleType();

  /**
	 * Returns the meta object for enum '{@link br.ufrn.dimap.ase.dsl.expdslv3.ArtefactType <em>Artefact Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Artefact Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ArtefactType
	 * @generated
	 */
  EEnum getArtefactType();

  /**
	 * Returns the meta object for enum '{@link br.ufrn.dimap.ase.dsl.expdslv3.MetricType <em>Metric Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metric Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.MetricType
	 * @generated
	 */
  EEnum getMetricType();

  /**
	 * Returns the meta object for enum '{@link br.ufrn.dimap.ase.dsl.expdslv3.QuestionnaireType <em>Questionnaire Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Questionnaire Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.QuestionnaireType
	 * @generated
	 */
  EEnum getQuestionnaireType();

  /**
	 * Returns the meta object for enum '{@link br.ufrn.dimap.ase.dsl.expdslv3.AnswerType <em>Answer Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Answer Type</em>'.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.AnswerType
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
  Expdslv3Factory getExpdslv3Factory();

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
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.ModelImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getModel()
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
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentElementImpl <em>Experiment Element</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentElementImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getExperimentElement()
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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EXPERIMENT_ELEMENT__DESCRIPTION = eINSTANCE.getExperimentElement_Description();

    /**
		 * The meta object literal for the '<em><b>Experiments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENT_ELEMENT__EXPERIMENTS = eINSTANCE.getExperimentElement_Experiments();

    /**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENT_ELEMENT__PROCESS = eINSTANCE.getExperimentElement_Process();

    /**
		 * The meta object literal for the '<em><b>Questionnaire</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENT_ELEMENT__QUESTIONNAIRE = eINSTANCE.getExperimentElement_Questionnaire();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentalDesignImpl <em>Experimental Design</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentalDesignImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getExperimentalDesign()
		 * @generated
		 */
    EClass EXPERIMENTAL_DESIGN = eINSTANCE.getExperimentalDesign();

    /**
		 * The meta object literal for the '<em><b>Author</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENTAL_DESIGN__AUTHOR = eINSTANCE.getExperimentalDesign_Author();

    /**
		 * The meta object literal for the '<em><b>Abstract</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENTAL_DESIGN__ABSTRACT = eINSTANCE.getExperimentalDesign_Abstract();

    /**
		 * The meta object literal for the '<em><b>Keyword</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENTAL_DESIGN__KEYWORD = eINSTANCE.getExperimentalDesign_Keyword();

    /**
		 * The meta object literal for the '<em><b>Goal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENTAL_DESIGN__GOAL = eINSTANCE.getExperimentalDesign_Goal();

    /**
		 * The meta object literal for the '<em><b>Research Question</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENTAL_DESIGN__RESEARCH_QUESTION = eINSTANCE.getExperimentalDesign_ResearchQuestion();

    /**
		 * The meta object literal for the '<em><b>Research Hypothesis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENTAL_DESIGN__RESEARCH_HYPOTHESIS = eINSTANCE.getExperimentalDesign_ResearchHypothesis();

    /**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENTAL_DESIGN__VARIABLE = eINSTANCE.getExperimentalDesign_Variable();

    /**
		 * The meta object literal for the '<em><b>Dep Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENTAL_DESIGN__DEP_VAR = eINSTANCE.getExperimentalDesign_DepVar();

    /**
		 * The meta object literal for the '<em><b>Factor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENTAL_DESIGN__FACTOR = eINSTANCE.getExperimentalDesign_Factor();

    /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EXPERIMENTAL_DESIGN__TYPE = eINSTANCE.getExperimentalDesign_Type();

    /**
		 * The meta object literal for the '<em><b>Doe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENTAL_DESIGN__DOE = eINSTANCE.getExperimentalDesign_Doe();

    /**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPERIMENTAL_DESIGN__PARAMETER = eINSTANCE.getExperimentalDesign_Parameter();

    /**
		 * The meta object literal for the '<em><b>Replication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EXPERIMENTAL_DESIGN__REPLICATION = eINSTANCE.getExperimentalDesign_Replication();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.AuthorImpl <em>Author</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.AuthorImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getAuthor()
		 * @generated
		 */
    EClass AUTHOR = eINSTANCE.getAuthor();

    /**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute AUTHOR__IDENTIFIER = eINSTANCE.getAuthor_Identifier();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute AUTHOR__NAME = eINSTANCE.getAuthor_Name();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.AbstractImpl <em>Abstract</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.AbstractImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getAbstract()
		 * @generated
		 */
    EClass ABSTRACT = eINSTANCE.getAbstract();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.SimpleAbstractImpl <em>Simple Abstract</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.SimpleAbstractImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getSimpleAbstract()
		 * @generated
		 */
    EClass SIMPLE_ABSTRACT = eINSTANCE.getSimpleAbstract();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SIMPLE_ABSTRACT__DESCRIPTION = eINSTANCE.getSimpleAbstract_Description();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.StructuredAbstractImpl <em>Structured Abstract</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.StructuredAbstractImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getStructuredAbstract()
		 * @generated
		 */
    EClass STRUCTURED_ABSTRACT = eINSTANCE.getStructuredAbstract();

    /**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute STRUCTURED_ABSTRACT__BACKGROUND = eINSTANCE.getStructuredAbstract_Background();

    /**
		 * The meta object literal for the '<em><b>Objective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute STRUCTURED_ABSTRACT__OBJECTIVE = eINSTANCE.getStructuredAbstract_Objective();

    /**
		 * The meta object literal for the '<em><b>Methods</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute STRUCTURED_ABSTRACT__METHODS = eINSTANCE.getStructuredAbstract_Methods();

    /**
		 * The meta object literal for the '<em><b>Results</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute STRUCTURED_ABSTRACT__RESULTS = eINSTANCE.getStructuredAbstract_Results();

    /**
		 * The meta object literal for the '<em><b>Limitations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute STRUCTURED_ABSTRACT__LIMITATIONS = eINSTANCE.getStructuredAbstract_Limitations();

    /**
		 * The meta object literal for the '<em><b>Conclusions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute STRUCTURED_ABSTRACT__CONCLUSIONS = eINSTANCE.getStructuredAbstract_Conclusions();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.KeywordImpl <em>Keyword</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.KeywordImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getKeyword()
		 * @generated
		 */
    EClass KEYWORD = eINSTANCE.getKeyword();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute KEYWORD__DESCRIPTION = eINSTANCE.getKeyword_Description();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.GoalImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getGoal()
		 * @generated
		 */
    EClass GOAL = eINSTANCE.getGoal();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.SimpleGoalImpl <em>Simple Goal</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.SimpleGoalImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getSimpleGoal()
		 * @generated
		 */
    EClass SIMPLE_GOAL = eINSTANCE.getSimpleGoal();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SIMPLE_GOAL__NAME = eINSTANCE.getSimpleGoal_Name();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SIMPLE_GOAL__DESCRIPTION = eINSTANCE.getSimpleGoal_Description();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.StructuredGoalImpl <em>Structured Goal</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.StructuredGoalImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getStructuredGoal()
		 * @generated
		 */
    EClass STRUCTURED_GOAL = eINSTANCE.getStructuredGoal();

    /**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute STRUCTURED_GOAL__OBJECT = eINSTANCE.getStructuredGoal_Object();

    /**
		 * The meta object literal for the '<em><b>Technique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute STRUCTURED_GOAL__TECHNIQUE = eINSTANCE.getStructuredGoal_Technique();

    /**
		 * The meta object literal for the '<em><b>Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute STRUCTURED_GOAL__QUALITY = eINSTANCE.getStructuredGoal_Quality();

    /**
		 * The meta object literal for the '<em><b>Pt View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute STRUCTURED_GOAL__PT_VIEW = eINSTANCE.getStructuredGoal_PtView();

    /**
		 * The meta object literal for the '<em><b>Context Of</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute STRUCTURED_GOAL__CONTEXT_OF = eINSTANCE.getStructuredGoal_ContextOf();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ResearchQuestionImpl <em>Research Question</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.ResearchQuestionImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getResearchQuestion()
		 * @generated
		 */
    EClass RESEARCH_QUESTION = eINSTANCE.getResearchQuestion();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RESEARCH_QUESTION__NAME = eINSTANCE.getResearchQuestion_Name();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RESEARCH_QUESTION__DESCRIPTION = eINSTANCE.getResearchQuestion_Description();

    /**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RESEARCH_QUESTION__GOAL = eINSTANCE.getResearchQuestion_Goal();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ResearchHypothesisImpl <em>Research Hypothesis</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.ResearchHypothesisImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getResearchHypothesis()
		 * @generated
		 */
    EClass RESEARCH_HYPOTHESIS = eINSTANCE.getResearchHypothesis();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RESEARCH_HYPOTHESIS__NAME = eINSTANCE.getResearchHypothesis_Name();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RESEARCH_HYPOTHESIS__DESCRIPTION = eINSTANCE.getResearchHypothesis_Description();

    /**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RESEARCH_HYPOTHESIS__GOAL = eINSTANCE.getResearchHypothesis_Goal();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.VariableImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getVariable()
		 * @generated
		 */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VARIABLE__DESCRIPTION = eINSTANCE.getVariable_Description();

    /**
		 * The meta object literal for the '<em><b>Scale Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VARIABLE__SCALE_TYPE = eINSTANCE.getVariable_ScaleType();

    /**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VARIABLE__RANGE = eINSTANCE.getVariable_Range();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.RangeImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getRange()
		 * @generated
		 */
    EClass RANGE = eINSTANCE.getRange();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RANGE__NAME = eINSTANCE.getRange_Name();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.DepVariableImpl <em>Dep Variable</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.DepVariableImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getDepVariable()
		 * @generated
		 */
    EClass DEP_VARIABLE = eINSTANCE.getDepVariable();

    /**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DEP_VARIABLE__VARIABLE = eINSTANCE.getDepVariable_Variable();

    /**
		 * The meta object literal for the '<em><b>Rq</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DEP_VARIABLE__RQ = eINSTANCE.getDepVariable_Rq();

    /**
		 * The meta object literal for the '<em><b>Rh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DEP_VARIABLE__RH = eINSTANCE.getDepVariable_Rh();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.FactorImpl <em>Factor</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.FactorImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getFactor()
		 * @generated
		 */
    EClass FACTOR = eINSTANCE.getFactor();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference FACTOR__NAME = eINSTANCE.getFactor_Name();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.DOEImpl <em>DOE</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.DOEImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getDOE()
		 * @generated
		 */
    EClass DOE = eINSTANCE.getDOE();

    /**
		 * The meta object literal for the '<em><b>Treatment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOE__TREATMENT = eINSTANCE.getDOE_Treatment();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.LSImpl <em>LS</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.LSImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getLS()
		 * @generated
		 */
    EClass LS = eINSTANCE.getLS();

    /**
		 * The meta object literal for the '<em><b>Col</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LS__COL = eINSTANCE.getLS_Col();

    /**
		 * The meta object literal for the '<em><b>Row</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LS__ROW = eINSTANCE.getLS_Row();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.RCBDImpl <em>RCBD</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.RCBDImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getRCBD()
		 * @generated
		 */
    EClass RCBD = eINSTANCE.getRCBD();

    /**
		 * The meta object literal for the '<em><b>Block Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RCBD__BLOCK_VARIABLE = eINSTANCE.getRCBD_BlockVariable();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.CRBImpl <em>CRB</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.CRBImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getCRB()
		 * @generated
		 */
    EClass CRB = eINSTANCE.getCRB();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.ParameterImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getParameter()
		 * @generated
		 */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference PARAMETER__VARIABLE = eINSTANCE.getParameter_Variable();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.ProcessImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getProcess()
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
		 * The meta object literal for the '<em><b>Treatment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference PROCESS__TREATMENT = eINSTANCE.getProcess_Treatment();

    /**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PROCESS__ROLE = eINSTANCE.getProcess_Role();

    /**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference PROCESS__TASK = eINSTANCE.getProcess_Task();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.TaskImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getTask()
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
		 * The meta object literal for the '<em><b>Next</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TASK__NEXT = eINSTANCE.getTask_Next();

    /**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TASK__ROLE = eINSTANCE.getTask_Role();

    /**
		 * The meta object literal for the '<em><b>Artefacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TASK__ARTEFACTS = eINSTANCE.getTask_Artefacts();

    /**
		 * The meta object literal for the '<em><b>Metric</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TASK__METRIC = eINSTANCE.getTask_Metric();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ArtefactImpl <em>Artefact</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.ArtefactImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getArtefact()
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
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.MetricImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getMetric()
		 * @generated
		 */
    EClass METRIC = eINSTANCE.getMetric();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference METRIC__NAME = eINSTANCE.getMetric_Name();

    /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute METRIC__TYPE = eINSTANCE.getMetric_Type();

    /**
		 * The meta object literal for the '<em><b>Varname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute METRIC__VARNAME = eINSTANCE.getMetric_Varname();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.QuestionnaireImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getQuestionnaire()
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
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.QuestionImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getQuestion()
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
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.AlternativesImpl <em>Alternatives</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.AlternativesImpl
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getAlternatives()
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
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.ScaleType <em>Scale Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.ScaleType
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getScaleType()
		 * @generated
		 */
    EEnum SCALE_TYPE = eINSTANCE.getScaleType();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.DesignType <em>Design Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.DesignType
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getDesignType()
		 * @generated
		 */
    EEnum DESIGN_TYPE = eINSTANCE.getDesignType();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.RoleType <em>Role Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.RoleType
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getRoleType()
		 * @generated
		 */
    EEnum ROLE_TYPE = eINSTANCE.getRoleType();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.ArtefactType <em>Artefact Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.ArtefactType
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getArtefactType()
		 * @generated
		 */
    EEnum ARTEFACT_TYPE = eINSTANCE.getArtefactType();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.MetricType <em>Metric Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.MetricType
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getMetricType()
		 * @generated
		 */
    EEnum METRIC_TYPE = eINSTANCE.getMetricType();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.QuestionnaireType <em>Questionnaire Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.QuestionnaireType
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getQuestionnaireType()
		 * @generated
		 */
    EEnum QUESTIONNAIRE_TYPE = eINSTANCE.getQuestionnaireType();

    /**
		 * The meta object literal for the '{@link br.ufrn.dimap.ase.dsl.expdslv3.AnswerType <em>Answer Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.AnswerType
		 * @see br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3PackageImpl#getAnswerType()
		 * @generated
		 */
    EEnum ANSWER_TYPE = eINSTANCE.getAnswerType();

  }

} //Expdslv3Package

/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3.util;

import br.ufrn.dimap.ase.dsl.expdslv3.Abstract;
import br.ufrn.dimap.ase.dsl.expdslv3.Alternatives;
import br.ufrn.dimap.ase.dsl.expdslv3.Artefact;
import br.ufrn.dimap.ase.dsl.expdslv3.Author;
import br.ufrn.dimap.ase.dsl.expdslv3.CRB;
import br.ufrn.dimap.ase.dsl.expdslv3.DOE;
import br.ufrn.dimap.ase.dsl.expdslv3.DepVariable;
import br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package;
import br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement;
import br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign;
import br.ufrn.dimap.ase.dsl.expdslv3.Factor;
import br.ufrn.dimap.ase.dsl.expdslv3.Goal;
import br.ufrn.dimap.ase.dsl.expdslv3.Keyword;
import br.ufrn.dimap.ase.dsl.expdslv3.LS;
import br.ufrn.dimap.ase.dsl.expdslv3.Metric;
import br.ufrn.dimap.ase.dsl.expdslv3.Model;
import br.ufrn.dimap.ase.dsl.expdslv3.Parameter;
import br.ufrn.dimap.ase.dsl.expdslv3.Question;
import br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire;
import br.ufrn.dimap.ase.dsl.expdslv3.RCBD;
import br.ufrn.dimap.ase.dsl.expdslv3.Range;
import br.ufrn.dimap.ase.dsl.expdslv3.ResearchHypothesis;
import br.ufrn.dimap.ase.dsl.expdslv3.ResearchQuestion;
import br.ufrn.dimap.ase.dsl.expdslv3.SimpleAbstract;
import br.ufrn.dimap.ase.dsl.expdslv3.SimpleGoal;
import br.ufrn.dimap.ase.dsl.expdslv3.StructuredAbstract;
import br.ufrn.dimap.ase.dsl.expdslv3.StructuredGoal;
import br.ufrn.dimap.ase.dsl.expdslv3.Task;
import br.ufrn.dimap.ase.dsl.expdslv3.Variable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package
 * @generated
 */
public class Expdslv3AdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static Expdslv3Package modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Expdslv3AdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = Expdslv3Package.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected Expdslv3Switch<Adapter> modelSwitch =
    new Expdslv3Switch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseExperimentElement(ExperimentElement object) {
				return createExperimentElementAdapter();
			}
			@Override
			public Adapter caseExperimentalDesign(ExperimentalDesign object) {
				return createExperimentalDesignAdapter();
			}
			@Override
			public Adapter caseAuthor(Author object) {
				return createAuthorAdapter();
			}
			@Override
			public Adapter caseAbstract(Abstract object) {
				return createAbstractAdapter();
			}
			@Override
			public Adapter caseSimpleAbstract(SimpleAbstract object) {
				return createSimpleAbstractAdapter();
			}
			@Override
			public Adapter caseStructuredAbstract(StructuredAbstract object) {
				return createStructuredAbstractAdapter();
			}
			@Override
			public Adapter caseKeyword(Keyword object) {
				return createKeywordAdapter();
			}
			@Override
			public Adapter caseGoal(Goal object) {
				return createGoalAdapter();
			}
			@Override
			public Adapter caseSimpleGoal(SimpleGoal object) {
				return createSimpleGoalAdapter();
			}
			@Override
			public Adapter caseStructuredGoal(StructuredGoal object) {
				return createStructuredGoalAdapter();
			}
			@Override
			public Adapter caseResearchQuestion(ResearchQuestion object) {
				return createResearchQuestionAdapter();
			}
			@Override
			public Adapter caseResearchHypothesis(ResearchHypothesis object) {
				return createResearchHypothesisAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseRange(Range object) {
				return createRangeAdapter();
			}
			@Override
			public Adapter caseDepVariable(DepVariable object) {
				return createDepVariableAdapter();
			}
			@Override
			public Adapter caseFactor(Factor object) {
				return createFactorAdapter();
			}
			@Override
			public Adapter caseDOE(DOE object) {
				return createDOEAdapter();
			}
			@Override
			public Adapter caseLS(LS object) {
				return createLSAdapter();
			}
			@Override
			public Adapter caseRCBD(RCBD object) {
				return createRCBDAdapter();
			}
			@Override
			public Adapter caseCRB(CRB object) {
				return createCRBAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseProcess(br.ufrn.dimap.ase.dsl.expdslv3.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseArtefact(Artefact object) {
				return createArtefactAdapter();
			}
			@Override
			public Adapter caseMetric(Metric object) {
				return createMetricAdapter();
			}
			@Override
			public Adapter caseQuestionnaire(Questionnaire object) {
				return createQuestionnaireAdapter();
			}
			@Override
			public Adapter caseQuestion(Question object) {
				return createQuestionAdapter();
			}
			@Override
			public Adapter caseAlternatives(Alternatives object) {
				return createAlternativesAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Model
	 * @generated
	 */
  public Adapter createModelAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement <em>Experiment Element</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement
	 * @generated
	 */
  public Adapter createExperimentElementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign <em>Experimental Design</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign
	 * @generated
	 */
  public Adapter createExperimentalDesignAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Author
	 * @generated
	 */
  public Adapter createAuthorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Abstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Abstract
	 * @generated
	 */
  public Adapter createAbstractAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.SimpleAbstract <em>Simple Abstract</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.SimpleAbstract
	 * @generated
	 */
  public Adapter createSimpleAbstractAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.StructuredAbstract <em>Structured Abstract</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.StructuredAbstract
	 * @generated
	 */
  public Adapter createStructuredAbstractAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Keyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Keyword
	 * @generated
	 */
  public Adapter createKeywordAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Goal
	 * @generated
	 */
  public Adapter createGoalAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.SimpleGoal <em>Simple Goal</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.SimpleGoal
	 * @generated
	 */
  public Adapter createSimpleGoalAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.StructuredGoal <em>Structured Goal</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.StructuredGoal
	 * @generated
	 */
  public Adapter createStructuredGoalAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.ResearchQuestion <em>Research Question</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ResearchQuestion
	 * @generated
	 */
  public Adapter createResearchQuestionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.ResearchHypothesis <em>Research Hypothesis</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.ResearchHypothesis
	 * @generated
	 */
  public Adapter createResearchHypothesisAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Variable
	 * @generated
	 */
  public Adapter createVariableAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Range
	 * @generated
	 */
  public Adapter createRangeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.DepVariable <em>Dep Variable</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.DepVariable
	 * @generated
	 */
  public Adapter createDepVariableAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Factor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Factor
	 * @generated
	 */
  public Adapter createFactorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.DOE <em>DOE</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.DOE
	 * @generated
	 */
  public Adapter createDOEAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.LS <em>LS</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.LS
	 * @generated
	 */
  public Adapter createLSAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.RCBD <em>RCBD</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.RCBD
	 * @generated
	 */
  public Adapter createRCBDAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.CRB <em>CRB</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.CRB
	 * @generated
	 */
  public Adapter createCRBAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Parameter
	 * @generated
	 */
  public Adapter createParameterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Process
	 * @generated
	 */
  public Adapter createProcessAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Task
	 * @generated
	 */
  public Adapter createTaskAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Artefact <em>Artefact</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Artefact
	 * @generated
	 */
  public Adapter createArtefactAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Metric
	 * @generated
	 */
  public Adapter createMetricAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire
	 * @generated
	 */
  public Adapter createQuestionnaireAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Question
	 * @generated
	 */
  public Adapter createQuestionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expdslv3.Alternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Alternatives
	 * @generated
	 */
  public Adapter createAlternativesAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //Expdslv3AdapterFactory

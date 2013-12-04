/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2.util;

import br.ufrn.dimap.ase.dsl.expDslv2.Activity;
import br.ufrn.dimap.ase.dsl.expDslv2.ActivityMetric;
import br.ufrn.dimap.ase.dsl.expDslv2.Alternatives;
import br.ufrn.dimap.ase.dsl.expDslv2.Artefact;
import br.ufrn.dimap.ase.dsl.expDslv2.CollectedData;
import br.ufrn.dimap.ase.dsl.expDslv2.DataMetric;
import br.ufrn.dimap.ase.dsl.expDslv2.DependentVariable;
import br.ufrn.dimap.ase.dsl.expDslv2.Detail;
import br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package;
import br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement;
import br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan;
import br.ufrn.dimap.ase.dsl.expDslv2.Factor;
import br.ufrn.dimap.ase.dsl.expDslv2.Goal;
import br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses;
import br.ufrn.dimap.ase.dsl.expDslv2.Levels;
import br.ufrn.dimap.ase.dsl.expDslv2.Link;
import br.ufrn.dimap.ase.dsl.expDslv2.Metrics;
import br.ufrn.dimap.ase.dsl.expDslv2.Model;
import br.ufrn.dimap.ase.dsl.expDslv2.Parameter;
import br.ufrn.dimap.ase.dsl.expDslv2.Question;
import br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire;
import br.ufrn.dimap.ase.dsl.expDslv2.Role;
import br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses;
import br.ufrn.dimap.ase.dsl.expDslv2.Task;
import br.ufrn.dimap.ase.dsl.expDslv2.TaskMetric;
import br.ufrn.dimap.ase.dsl.expDslv2.TimeMetric;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package
 * @generated
 */
public class ExpDslv2AdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ExpDslv2Package modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ExpDslv2AdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = ExpDslv2Package.eINSTANCE;
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
  protected ExpDslv2Switch<Adapter> modelSwitch =
    new ExpDslv2Switch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseExperimentElement(ExperimentElement object) {
				return createExperimentElementAdapter();
			}
			@Override
			public Adapter caseProcess(br.ufrn.dimap.ase.dsl.expDslv2.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseArtefact(Artefact object) {
				return createArtefactAdapter();
			}
			@Override
			public Adapter caseMetrics(Metrics object) {
				return createMetricsAdapter();
			}
			@Override
			public Adapter caseDetail(Detail object) {
				return createDetailAdapter();
			}
			@Override
			public Adapter caseTimeMetric(TimeMetric object) {
				return createTimeMetricAdapter();
			}
			@Override
			public Adapter caseActivityMetric(ActivityMetric object) {
				return createActivityMetricAdapter();
			}
			@Override
			public Adapter caseTaskMetric(TaskMetric object) {
				return createTaskMetricAdapter();
			}
			@Override
			public Adapter caseDataMetric(DataMetric object) {
				return createDataMetricAdapter();
			}
			@Override
			public Adapter caseCollectedData(CollectedData object) {
				return createCollectedDataAdapter();
			}
			@Override
			public Adapter caseExperimentalPlan(ExperimentalPlan object) {
				return createExperimentalPlanAdapter();
			}
			@Override
			public Adapter caseGoal(Goal object) {
				return createGoalAdapter();
			}
			@Override
			public Adapter caseHypotheses(Hypotheses object) {
				return createHypothesesAdapter();
			}
			@Override
			public Adapter caseSubhypotheses(Subhypotheses object) {
				return createSubhypothesesAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseDependentVariable(DependentVariable object) {
				return createDependentVariableAdapter();
			}
			@Override
			public Adapter caseFactor(Factor object) {
				return createFactorAdapter();
			}
			@Override
			public Adapter caseLevels(Levels object) {
				return createLevelsAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
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
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Model
	 * @generated
	 */
  public Adapter createModelAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement <em>Experiment Element</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement
	 * @generated
	 */
  public Adapter createExperimentElementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Process
	 * @generated
	 */
  public Adapter createProcessAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Activity
	 * @generated
	 */
  public Adapter createActivityAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Task
	 * @generated
	 */
  public Adapter createTaskAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Role
	 * @generated
	 */
  public Adapter createRoleAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Artefact <em>Artefact</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Artefact
	 * @generated
	 */
  public Adapter createArtefactAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Metrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Metrics
	 * @generated
	 */
  public Adapter createMetricsAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Detail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Detail
	 * @generated
	 */
  public Adapter createDetailAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.TimeMetric <em>Time Metric</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.TimeMetric
	 * @generated
	 */
  public Adapter createTimeMetricAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.ActivityMetric <em>Activity Metric</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ActivityMetric
	 * @generated
	 */
  public Adapter createActivityMetricAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.TaskMetric <em>Task Metric</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.TaskMetric
	 * @generated
	 */
  public Adapter createTaskMetricAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.DataMetric <em>Data Metric</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.DataMetric
	 * @generated
	 */
  public Adapter createDataMetricAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.CollectedData <em>Collected Data</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.CollectedData
	 * @generated
	 */
  public Adapter createCollectedDataAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan <em>Experimental Plan</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan
	 * @generated
	 */
  public Adapter createExperimentalPlanAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Goal
	 * @generated
	 */
  public Adapter createGoalAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses <em>Hypotheses</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses
	 * @generated
	 */
  public Adapter createHypothesesAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses <em>Subhypotheses</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses
	 * @generated
	 */
  public Adapter createSubhypothesesAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Parameter
	 * @generated
	 */
  public Adapter createParameterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.DependentVariable <em>Dependent Variable</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.DependentVariable
	 * @generated
	 */
  public Adapter createDependentVariableAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Factor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Factor
	 * @generated
	 */
  public Adapter createFactorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Levels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Levels
	 * @generated
	 */
  public Adapter createLevelsAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Link
	 * @generated
	 */
  public Adapter createLinkAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire
	 * @generated
	 */
  public Adapter createQuestionnaireAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Question
	 * @generated
	 */
  public Adapter createQuestionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link br.ufrn.dimap.ase.dsl.expDslv2.Alternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.Alternatives
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

} //ExpDslv2AdapterFactory

/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.project.expDSL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.project.expDSL.Activity;
import org.xtext.project.expDSL.ActivityMetric;
import org.xtext.project.expDSL.Alternatives;
import org.xtext.project.expDSL.ExpDSLPackage;
import org.xtext.project.expDSL.ExperimentElement;
import org.xtext.project.expDSL.ExperimentalPlan;
import org.xtext.project.expDSL.Factor;
import org.xtext.project.expDSL.Levels;
import org.xtext.project.expDSL.Metrics;
import org.xtext.project.expDSL.Model;
import org.xtext.project.expDSL.Question;
import org.xtext.project.expDSL.Questions;
import org.xtext.project.expDSL.Role;
import org.xtext.project.expDSL.Task;
import org.xtext.project.expDSL.TaskMetric;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.project.expDSL.ExpDSLPackage
 * @generated
 */
public class ExpDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ExpDSLPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ExpDSLAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = ExpDSLPackage.eINSTANCE;
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
  protected ExpDSLSwitch<Adapter> modelSwitch =
    new ExpDSLSwitch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseExperimentElement(ExperimentElement object) {
				return createExperimentElementAdapter();
			}
			@Override
			public Adapter caseProcess(org.xtext.project.expDSL.Process object) {
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
			public Adapter caseExperimentalPlan(ExperimentalPlan object) {
				return createExperimentalPlanAdapter();
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
			public Adapter caseMetrics(Metrics object) {
				return createMetricsAdapter();
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
			public Adapter caseQuestions(Questions object) {
				return createQuestionsAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.xtext.project.expDSL.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.project.expDSL.Model
	 * @generated
	 */
  public Adapter createModelAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.project.expDSL.ExperimentElement <em>Experiment Element</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.project.expDSL.ExperimentElement
	 * @generated
	 */
  public Adapter createExperimentElementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.project.expDSL.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.project.expDSL.Process
	 * @generated
	 */
  public Adapter createProcessAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.project.expDSL.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.project.expDSL.Activity
	 * @generated
	 */
  public Adapter createActivityAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.project.expDSL.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.project.expDSL.Task
	 * @generated
	 */
  public Adapter createTaskAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.project.expDSL.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.project.expDSL.Role
	 * @generated
	 */
  public Adapter createRoleAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.project.expDSL.ExperimentalPlan <em>Experimental Plan</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.project.expDSL.ExperimentalPlan
	 * @generated
	 */
  public Adapter createExperimentalPlanAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.project.expDSL.Factor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.project.expDSL.Factor
	 * @generated
	 */
  public Adapter createFactorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.project.expDSL.Levels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.project.expDSL.Levels
	 * @generated
	 */
  public Adapter createLevelsAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.project.expDSL.Metrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.project.expDSL.Metrics
	 * @generated
	 */
  public Adapter createMetricsAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.project.expDSL.ActivityMetric <em>Activity Metric</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.project.expDSL.ActivityMetric
	 * @generated
	 */
  public Adapter createActivityMetricAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.project.expDSL.TaskMetric <em>Task Metric</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.project.expDSL.TaskMetric
	 * @generated
	 */
  public Adapter createTaskMetricAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.project.expDSL.Questions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.project.expDSL.Questions
	 * @generated
	 */
  public Adapter createQuestionsAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.project.expDSL.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.project.expDSL.Question
	 * @generated
	 */
  public Adapter createQuestionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.project.expDSL.Alternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.project.expDSL.Alternatives
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

} //ExpDSLAdapterFactory

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
import br.ufrn.dimap.ase.dsl.expDslv2.Metrics;
import br.ufrn.dimap.ase.dsl.expDslv2.Model;
import br.ufrn.dimap.ase.dsl.expDslv2.Parameter;
import br.ufrn.dimap.ase.dsl.expDslv2.Question;
import br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire;
import br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses;
import br.ufrn.dimap.ase.dsl.expDslv2.Task;
import br.ufrn.dimap.ase.dsl.expDslv2.TaskMetric;
import br.ufrn.dimap.ase.dsl.expDslv2.TimeMetric;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package
 * @generated
 */
public class ExpDslv2Switch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ExpDslv2Package modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ExpDslv2Switch()
  {
		if (modelPackage == null) {
			modelPackage = ExpDslv2Package.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case ExpDslv2Package.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.EXPERIMENT_ELEMENT: {
				ExperimentElement experimentElement = (ExperimentElement)theEObject;
				T result = caseExperimentElement(experimentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.PROCESS: {
				br.ufrn.dimap.ase.dsl.expDslv2.Process process = (br.ufrn.dimap.ase.dsl.expDslv2.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.ARTEFACT: {
				Artefact artefact = (Artefact)theEObject;
				T result = caseArtefact(artefact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.METRICS: {
				Metrics metrics = (Metrics)theEObject;
				T result = caseMetrics(metrics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.DETAIL: {
				Detail detail = (Detail)theEObject;
				T result = caseDetail(detail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.TIME_METRIC: {
				TimeMetric timeMetric = (TimeMetric)theEObject;
				T result = caseTimeMetric(timeMetric);
				if (result == null) result = caseDetail(timeMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.ACTIVITY_METRIC: {
				ActivityMetric activityMetric = (ActivityMetric)theEObject;
				T result = caseActivityMetric(activityMetric);
				if (result == null) result = caseTimeMetric(activityMetric);
				if (result == null) result = caseDetail(activityMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.TASK_METRIC: {
				TaskMetric taskMetric = (TaskMetric)theEObject;
				T result = caseTaskMetric(taskMetric);
				if (result == null) result = caseTimeMetric(taskMetric);
				if (result == null) result = caseDetail(taskMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.DATA_METRIC: {
				DataMetric dataMetric = (DataMetric)theEObject;
				T result = caseDataMetric(dataMetric);
				if (result == null) result = caseDetail(dataMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.COLLECTED_DATA: {
				CollectedData collectedData = (CollectedData)theEObject;
				T result = caseCollectedData(collectedData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.EXPERIMENTAL_PLAN: {
				ExperimentalPlan experimentalPlan = (ExperimentalPlan)theEObject;
				T result = caseExperimentalPlan(experimentalPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.HYPOTHESES: {
				Hypotheses hypotheses = (Hypotheses)theEObject;
				T result = caseHypotheses(hypotheses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.SUBHYPOTHESES: {
				Subhypotheses subhypotheses = (Subhypotheses)theEObject;
				T result = caseSubhypotheses(subhypotheses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.DEPENDENT_VARIABLE: {
				DependentVariable dependentVariable = (DependentVariable)theEObject;
				T result = caseDependentVariable(dependentVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.FACTOR: {
				Factor factor = (Factor)theEObject;
				T result = caseFactor(factor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.LEVELS: {
				Levels levels = (Levels)theEObject;
				T result = caseLevels(levels);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.QUESTIONNAIRE: {
				Questionnaire questionnaire = (Questionnaire)theEObject;
				T result = caseQuestionnaire(questionnaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.QUESTION: {
				Question question = (Question)theEObject;
				T result = caseQuestion(question);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpDslv2Package.ALTERNATIVES: {
				Alternatives alternatives = (Alternatives)theEObject;
				T result = caseAlternatives(alternatives);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseModel(Model object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Experiment Element</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experiment Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseExperimentElement(ExperimentElement object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseProcess(br.ufrn.dimap.ase.dsl.expDslv2.Process object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseActivity(Activity object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTask(Task object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Artefact</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artefact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseArtefact(Artefact object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Metrics</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metrics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMetrics(Metrics object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Detail</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDetail(Detail object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Time Metric</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTimeMetric(TimeMetric object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Metric</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseActivityMetric(ActivityMetric object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Task Metric</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTaskMetric(TaskMetric object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Data Metric</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDataMetric(DataMetric object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Collected Data</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collected Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCollectedData(CollectedData object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Experimental Plan</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experimental Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseExperimentalPlan(ExperimentalPlan object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseGoal(Goal object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Hypotheses</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hypotheses</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHypotheses(Hypotheses object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Subhypotheses</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subhypotheses</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSubhypotheses(Subhypotheses object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseParameter(Parameter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Dependent Variable</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependent Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDependentVariable(DependentVariable object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Factor</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseFactor(Factor object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Levels</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Levels</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseLevels(Levels object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseQuestionnaire(Questionnaire object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseQuestion(Question object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Alternatives</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternatives</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAlternatives(Alternatives object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
  public T defaultCase(EObject object)
  {
		return null;
	}

} //ExpDslv2Switch

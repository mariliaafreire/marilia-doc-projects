/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package
 * @generated
 */
public interface ExpDslv2Factory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ExpDslv2Factory eINSTANCE = br.ufrn.dimap.ase.dsl.expDslv2.impl.ExpDslv2FactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
  Model createModel();

  /**
	 * Returns a new object of class '<em>Experiment Element</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experiment Element</em>'.
	 * @generated
	 */
  ExperimentElement createExperimentElement();

  /**
	 * Returns a new object of class '<em>Experimental Plan</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experimental Plan</em>'.
	 * @generated
	 */
  ExperimentalPlan createExperimentalPlan();

  /**
	 * Returns a new object of class '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal</em>'.
	 * @generated
	 */
  Goal createGoal();

  /**
	 * Returns a new object of class '<em>Hypotheses</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hypotheses</em>'.
	 * @generated
	 */
  Hypotheses createHypotheses();

  /**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
  Parameter createParameter();

  /**
	 * Returns a new object of class '<em>Dependent Variable</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependent Variable</em>'.
	 * @generated
	 */
  DependentVariable createDependentVariable();

  /**
	 * Returns a new object of class '<em>Factor</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Factor</em>'.
	 * @generated
	 */
  Factor createFactor();

  /**
	 * Returns a new object of class '<em>Levels</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Levels</em>'.
	 * @generated
	 */
  Levels createLevels();

  /**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
  Process createProcess();

  /**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
  Task createTask();

  /**
	 * Returns a new object of class '<em>Artefact</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artefact</em>'.
	 * @generated
	 */
  Artefact createArtefact();

  /**
	 * Returns a new object of class '<em>Metrics</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metrics</em>'.
	 * @generated
	 */
  Metrics createMetrics();

  /**
	 * Returns a new object of class '<em>Detail</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detail</em>'.
	 * @generated
	 */
  Detail createDetail();

  /**
	 * Returns a new object of class '<em>Task Metric</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Metric</em>'.
	 * @generated
	 */
  TaskMetric createTaskMetric();

  /**
	 * Returns a new object of class '<em>Data Metric</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Metric</em>'.
	 * @generated
	 */
  DataMetric createDataMetric();

  /**
	 * Returns a new object of class '<em>Collected Data</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collected Data</em>'.
	 * @generated
	 */
  CollectedData createCollectedData();

  /**
	 * Returns a new object of class '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire</em>'.
	 * @generated
	 */
  Questionnaire createQuestionnaire();

  /**
	 * Returns a new object of class '<em>Question</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question</em>'.
	 * @generated
	 */
  Question createQuestion();

  /**
	 * Returns a new object of class '<em>Alternatives</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternatives</em>'.
	 * @generated
	 */
  Alternatives createAlternatives();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  ExpDslv2Package getExpDslv2Package();

} //ExpDslv2Factory

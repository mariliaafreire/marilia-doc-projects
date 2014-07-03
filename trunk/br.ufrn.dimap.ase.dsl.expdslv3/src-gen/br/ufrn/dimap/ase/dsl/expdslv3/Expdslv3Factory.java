/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package
 * @generated
 */
public interface Expdslv3Factory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  Expdslv3Factory eINSTANCE = br.ufrn.dimap.ase.dsl.expdslv3.impl.Expdslv3FactoryImpl.init();

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
	 * Returns a new object of class '<em>Experimental Design</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experimental Design</em>'.
	 * @generated
	 */
  ExperimentalDesign createExperimentalDesign();

  /**
	 * Returns a new object of class '<em>Author</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Author</em>'.
	 * @generated
	 */
  Author createAuthor();

  /**
	 * Returns a new object of class '<em>Abstract</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract</em>'.
	 * @generated
	 */
  Abstract createAbstract();

  /**
	 * Returns a new object of class '<em>Simple Abstract</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Abstract</em>'.
	 * @generated
	 */
  SimpleAbstract createSimpleAbstract();

  /**
	 * Returns a new object of class '<em>Structured Abstract</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structured Abstract</em>'.
	 * @generated
	 */
  StructuredAbstract createStructuredAbstract();

  /**
	 * Returns a new object of class '<em>Keyword</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keyword</em>'.
	 * @generated
	 */
  Keyword createKeyword();

  /**
	 * Returns a new object of class '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal</em>'.
	 * @generated
	 */
  Goal createGoal();

  /**
	 * Returns a new object of class '<em>Simple Goal</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Goal</em>'.
	 * @generated
	 */
  SimpleGoal createSimpleGoal();

  /**
	 * Returns a new object of class '<em>Structured Goal</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structured Goal</em>'.
	 * @generated
	 */
  StructuredGoal createStructuredGoal();

  /**
	 * Returns a new object of class '<em>Research Question</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Research Question</em>'.
	 * @generated
	 */
  ResearchQuestion createResearchQuestion();

  /**
	 * Returns a new object of class '<em>Research Hypothesis</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Research Hypothesis</em>'.
	 * @generated
	 */
  ResearchHypothesis createResearchHypothesis();

  /**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
  Variable createVariable();

  /**
	 * Returns a new object of class '<em>Range</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range</em>'.
	 * @generated
	 */
  Range createRange();

  /**
	 * Returns a new object of class '<em>Dep Variable</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dep Variable</em>'.
	 * @generated
	 */
  DepVariable createDepVariable();

  /**
	 * Returns a new object of class '<em>Factor</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Factor</em>'.
	 * @generated
	 */
  Factor createFactor();

  /**
	 * Returns a new object of class '<em>DOE</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>DOE</em>'.
	 * @generated
	 */
  DOE createDOE();

  /**
	 * Returns a new object of class '<em>LS</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>LS</em>'.
	 * @generated
	 */
  LS createLS();

  /**
	 * Returns a new object of class '<em>RCBD</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>RCBD</em>'.
	 * @generated
	 */
  RCBD createRCBD();

  /**
	 * Returns a new object of class '<em>CRB</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>CRB</em>'.
	 * @generated
	 */
  CRB createCRB();

  /**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
  Parameter createParameter();

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
	 * Returns a new object of class '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric</em>'.
	 * @generated
	 */
  Metric createMetric();

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
  Expdslv3Package getExpdslv3Package();

} //Expdslv3Factory

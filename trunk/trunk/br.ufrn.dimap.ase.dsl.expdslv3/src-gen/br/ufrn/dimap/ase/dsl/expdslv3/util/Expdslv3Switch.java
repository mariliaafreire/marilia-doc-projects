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
 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package
 * @generated
 */
public class Expdslv3Switch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static Expdslv3Package modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Expdslv3Switch()
  {
		if (modelPackage == null) {
			modelPackage = Expdslv3Package.eINSTANCE;
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
			case Expdslv3Package.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.EXPERIMENT_ELEMENT: {
				ExperimentElement experimentElement = (ExperimentElement)theEObject;
				T result = caseExperimentElement(experimentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.EXPERIMENTAL_DESIGN: {
				ExperimentalDesign experimentalDesign = (ExperimentalDesign)theEObject;
				T result = caseExperimentalDesign(experimentalDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.AUTHOR: {
				Author author = (Author)theEObject;
				T result = caseAuthor(author);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.ABSTRACT: {
				Abstract abstract_ = (Abstract)theEObject;
				T result = caseAbstract(abstract_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.SIMPLE_ABSTRACT: {
				SimpleAbstract simpleAbstract = (SimpleAbstract)theEObject;
				T result = caseSimpleAbstract(simpleAbstract);
				if (result == null) result = caseAbstract(simpleAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.STRUCTURED_ABSTRACT: {
				StructuredAbstract structuredAbstract = (StructuredAbstract)theEObject;
				T result = caseStructuredAbstract(structuredAbstract);
				if (result == null) result = caseAbstract(structuredAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.KEYWORD: {
				Keyword keyword = (Keyword)theEObject;
				T result = caseKeyword(keyword);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.SIMPLE_GOAL: {
				SimpleGoal simpleGoal = (SimpleGoal)theEObject;
				T result = caseSimpleGoal(simpleGoal);
				if (result == null) result = caseGoal(simpleGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.STRUCTURED_GOAL: {
				StructuredGoal structuredGoal = (StructuredGoal)theEObject;
				T result = caseStructuredGoal(structuredGoal);
				if (result == null) result = caseGoal(structuredGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.RESEARCH_QUESTION: {
				ResearchQuestion researchQuestion = (ResearchQuestion)theEObject;
				T result = caseResearchQuestion(researchQuestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.RESEARCH_HYPOTHESIS: {
				ResearchHypothesis researchHypothesis = (ResearchHypothesis)theEObject;
				T result = caseResearchHypothesis(researchHypothesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.RANGE: {
				Range range = (Range)theEObject;
				T result = caseRange(range);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.DEP_VARIABLE: {
				DepVariable depVariable = (DepVariable)theEObject;
				T result = caseDepVariable(depVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.FACTOR: {
				Factor factor = (Factor)theEObject;
				T result = caseFactor(factor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.DOE: {
				DOE doe = (DOE)theEObject;
				T result = caseDOE(doe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.LS: {
				LS ls = (LS)theEObject;
				T result = caseLS(ls);
				if (result == null) result = caseDOE(ls);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.RCBD: {
				RCBD rcbd = (RCBD)theEObject;
				T result = caseRCBD(rcbd);
				if (result == null) result = caseDOE(rcbd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.CRB: {
				CRB crb = (CRB)theEObject;
				T result = caseCRB(crb);
				if (result == null) result = caseDOE(crb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.PROCESS: {
				br.ufrn.dimap.ase.dsl.expdslv3.Process process = (br.ufrn.dimap.ase.dsl.expdslv3.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.ARTEFACT: {
				Artefact artefact = (Artefact)theEObject;
				T result = caseArtefact(artefact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.METRIC: {
				Metric metric = (Metric)theEObject;
				T result = caseMetric(metric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.QUESTIONNAIRE: {
				Questionnaire questionnaire = (Questionnaire)theEObject;
				T result = caseQuestionnaire(questionnaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.QUESTION: {
				Question question = (Question)theEObject;
				T result = caseQuestion(question);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Expdslv3Package.ALTERNATIVES: {
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
	 * Returns the result of interpreting the object as an instance of '<em>Experimental Design</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experimental Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseExperimentalDesign(ExperimentalDesign object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Author</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAuthor(Author object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstract(Abstract object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Abstract</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSimpleAbstract(SimpleAbstract object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Abstract</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseStructuredAbstract(StructuredAbstract object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Keyword</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keyword</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseKeyword(Keyword object)
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
	 * Returns the result of interpreting the object as an instance of '<em>Simple Goal</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSimpleGoal(SimpleGoal object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Goal</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseStructuredGoal(StructuredGoal object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Research Question</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseResearchQuestion(ResearchQuestion object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Research Hypothesis</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Hypothesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseResearchHypothesis(ResearchHypothesis object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseVariable(Variable object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRange(Range object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Dep Variable</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dep Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDepVariable(DepVariable object)
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
	 * Returns the result of interpreting the object as an instance of '<em>DOE</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDOE(DOE object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>LS</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseLS(LS object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>RCBD</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RCBD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRCBD(RCBD object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>CRB</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CRB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCRB(CRB object)
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
  public T caseProcess(br.ufrn.dimap.ase.dsl.expdslv3.Process object)
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
	 * Returns the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMetric(Metric object)
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

} //Expdslv3Switch

/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experimental Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getAuthor <em>Author</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getGoal <em>Goal</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getResearchQuestion <em>Research Question</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getResearchHypothesis <em>Research Hypothesis</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getVariable <em>Variable</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getDepVar <em>Dep Var</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getFactor <em>Factor</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getType <em>Type</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getDoe <em>Doe</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getExperimentalDesign()
 * @model
 * @generated
 */
public interface ExperimentalDesign extends EObject
{
  /**
   * Returns the value of the '<em><b>Author</b></em>' containment reference list.
   * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expdslv3.Author}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Author</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Author</em>' containment reference list.
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getExperimentalDesign_Author()
   * @model containment="true"
   * @generated
   */
  EList<Author> getAuthor();

  /**
   * Returns the value of the '<em><b>Abstract</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' containment reference.
   * @see #setAbstract(Abstract)
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getExperimentalDesign_Abstract()
   * @model containment="true"
   * @generated
   */
  Abstract getAbstract();

  /**
   * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getAbstract <em>Abstract</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' containment reference.
   * @see #getAbstract()
   * @generated
   */
  void setAbstract(Abstract value);

  /**
   * Returns the value of the '<em><b>Keyword</b></em>' containment reference list.
   * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expdslv3.Keyword}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keyword</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keyword</em>' containment reference list.
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getExperimentalDesign_Keyword()
   * @model containment="true"
   * @generated
   */
  EList<Keyword> getKeyword();

  /**
   * Returns the value of the '<em><b>Goal</b></em>' containment reference list.
   * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expdslv3.Goal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goal</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goal</em>' containment reference list.
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getExperimentalDesign_Goal()
   * @model containment="true"
   * @generated
   */
  EList<Goal> getGoal();

  /**
   * Returns the value of the '<em><b>Research Question</b></em>' containment reference list.
   * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expdslv3.ResearchQuestion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Research Question</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Research Question</em>' containment reference list.
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getExperimentalDesign_ResearchQuestion()
   * @model containment="true"
   * @generated
   */
  EList<ResearchQuestion> getResearchQuestion();

  /**
   * Returns the value of the '<em><b>Research Hypothesis</b></em>' containment reference list.
   * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expdslv3.ResearchHypothesis}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Research Hypothesis</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Research Hypothesis</em>' containment reference list.
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getExperimentalDesign_ResearchHypothesis()
   * @model containment="true"
   * @generated
   */
  EList<ResearchHypothesis> getResearchHypothesis();

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
   * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expdslv3.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference list.
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getExperimentalDesign_Variable()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getVariable();

  /**
   * Returns the value of the '<em><b>Dep Var</b></em>' containment reference list.
   * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expdslv3.DepVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dep Var</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dep Var</em>' containment reference list.
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getExperimentalDesign_DepVar()
   * @model containment="true"
   * @generated
   */
  EList<DepVariable> getDepVar();

  /**
   * Returns the value of the '<em><b>Factor</b></em>' containment reference list.
   * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expdslv3.Factor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factor</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factor</em>' containment reference list.
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getExperimentalDesign_Factor()
   * @model containment="true"
   * @generated
   */
  EList<Factor> getFactor();

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link br.ufrn.dimap.ase.dsl.expdslv3.DesignType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see br.ufrn.dimap.ase.dsl.expdslv3.DesignType
   * @see #setType(DesignType)
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getExperimentalDesign_Type()
   * @model
   * @generated
   */
  DesignType getType();

  /**
   * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see br.ufrn.dimap.ase.dsl.expdslv3.DesignType
   * @see #getType()
   * @generated
   */
  void setType(DesignType value);

  /**
   * Returns the value of the '<em><b>Doe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doe</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doe</em>' containment reference.
   * @see #setDoe(DOE)
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getExperimentalDesign_Doe()
   * @model containment="true"
   * @generated
   */
  DOE getDoe();

  /**
   * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign#getDoe <em>Doe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doe</em>' containment reference.
   * @see #getDoe()
   * @generated
   */
  void setDoe(DOE value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
   * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expdslv3.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference list.
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getExperimentalDesign_Parameter()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameter();

} // ExperimentalDesign

/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hypotheses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getDescription <em>Description</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getType <em>Type</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getDependentVariable <em>Dependent Variable</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getLevels <em>Levels</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getOperator <em>Operator</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getRelation <em>Relation</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getFactor <em>Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getHypotheses()
 * @model
 * @generated
 */
public interface Hypotheses extends EObject
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getHypotheses_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getHypotheses_Description()
	 * @model
	 * @generated
	 */
  String getDescription();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
  void setDescription(String value);

  /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufrn.dimap.ase.dsl.expDslv2.HypothesisType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.HypothesisType
	 * @see #setType(HypothesisType)
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getHypotheses_Type()
	 * @model
	 * @generated
	 */
  HypothesisType getType();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.HypothesisType
	 * @see #getType()
	 * @generated
	 */
  void setType(HypothesisType value);

  /**
	 * Returns the value of the '<em><b>Dependent Variable</b></em>' reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.DependentVariable}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependent Variable</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Variable</em>' reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getHypotheses_DependentVariable()
	 * @model
	 * @generated
	 */
  EList<DependentVariable> getDependentVariable();

  /**
	 * Returns the value of the '<em><b>Levels</b></em>' reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.Levels}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Levels</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Levels</em>' reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getHypotheses_Levels()
	 * @model
	 * @generated
	 */
  EList<Levels> getLevels();

  /**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufrn.dimap.ase.dsl.expDslv2.OperatorType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.OperatorType
	 * @see #setOperator(OperatorType)
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getHypotheses_Operator()
	 * @model
	 * @generated
	 */
  OperatorType getOperator();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.OperatorType
	 * @see #getOperator()
	 * @generated
	 */
  void setOperator(OperatorType value);

  /**
	 * Returns the value of the '<em><b>Relation</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufrn.dimap.ase.dsl.expDslv2.RelationType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' attribute.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.RelationType
	 * @see #setRelation(RelationType)
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getHypotheses_Relation()
	 * @model
	 * @generated
	 */
  RelationType getRelation();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses#getRelation <em>Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' attribute.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.RelationType
	 * @see #getRelation()
	 * @generated
	 */
  void setRelation(RelationType value);

  /**
	 * Returns the value of the '<em><b>Factor</b></em>' reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.Factor}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factor</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getHypotheses_Factor()
	 * @model
	 * @generated
	 */
  EList<Factor> getFactor();

} // Hypotheses

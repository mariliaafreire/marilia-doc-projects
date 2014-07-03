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
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Question#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Question#getDescription <em>Description</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Question#getType <em>Type</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Question#getReq <em>Req</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Question#getAlternatives <em>Alternatives</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getQuestion()
 * @model
 * @generated
 */
public interface Question extends EObject
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
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getQuestion_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.Question#getName <em>Name</em>}' attribute.
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
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getQuestion_Description()
	 * @model
	 * @generated
	 */
  String getDescription();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.Question#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
  void setDescription(String value);

  /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufrn.dimap.ase.dsl.expdslv3.AnswerType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.AnswerType
	 * @see #setType(AnswerType)
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getQuestion_Type()
	 * @model
	 * @generated
	 */
  AnswerType getType();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.Question#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.AnswerType
	 * @see #getType()
	 * @generated
	 */
  void setType(AnswerType value);

  /**
	 * Returns the value of the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Req</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Req</em>' attribute.
	 * @see #setReq(int)
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getQuestion_Req()
	 * @model
	 * @generated
	 */
  int getReq();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.Question#getReq <em>Req</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req</em>' attribute.
	 * @see #getReq()
	 * @generated
	 */
  void setReq(int value);

  /**
	 * Returns the value of the '<em><b>Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expdslv3.Alternatives}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alternatives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternatives</em>' containment reference list.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getQuestion_Alternatives()
	 * @model containment="true"
	 * @generated
	 */
  EList<Alternatives> getAlternatives();

} // Question

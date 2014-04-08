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
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Variable#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Variable#getDescription <em>Description</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Variable#getScaleType <em>Scale Type</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Variable#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject
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
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.Variable#getName <em>Name</em>}' attribute.
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
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getVariable_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.Variable#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Scale Type</b></em>' attribute.
   * The literals are from the enumeration {@link br.ufrn.dimap.ase.dsl.expdslv3.ScaleType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scale Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scale Type</em>' attribute.
   * @see br.ufrn.dimap.ase.dsl.expdslv3.ScaleType
   * @see #setScaleType(ScaleType)
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getVariable_ScaleType()
   * @model
   * @generated
   */
  ScaleType getScaleType();

  /**
   * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.Variable#getScaleType <em>Scale Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scale Type</em>' attribute.
   * @see br.ufrn.dimap.ase.dsl.expdslv3.ScaleType
   * @see #getScaleType()
   * @generated
   */
  void setScaleType(ScaleType value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference list.
   * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expdslv3.Range}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference list.
   * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getVariable_Range()
   * @model containment="true"
   * @generated
   */
  EList<Range> getRange();

} // Variable

/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Metric#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Metric#getType <em>Type</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Metric#getVarname <em>Varname</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getMetric()
 * @model
 * @generated
 */
public interface Metric extends EObject
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(Variable)
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getMetric_Name()
	 * @model
	 * @generated
	 */
  Variable getName();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.Metric#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
  void setName(Variable value);

  /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufrn.dimap.ase.dsl.expdslv3.MetricType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.MetricType
	 * @see #setType(MetricType)
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getMetric_Type()
	 * @model
	 * @generated
	 */
  MetricType getType();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.Metric#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.MetricType
	 * @see #getType()
	 * @generated
	 */
  void setType(MetricType value);

  /**
	 * Returns the value of the '<em><b>Varname</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Varname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Varname</em>' attribute.
	 * @see #setVarname(String)
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getMetric_Varname()
	 * @model
	 * @generated
	 */
  String getVarname();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.Metric#getVarname <em>Varname</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varname</em>' attribute.
	 * @see #getVarname()
	 * @generated
	 */
  void setVarname(String value);

} // Metric

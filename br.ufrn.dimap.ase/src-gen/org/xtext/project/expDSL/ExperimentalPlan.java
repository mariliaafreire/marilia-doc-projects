/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.project.expDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experimental Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.project.expDSL.ExperimentalPlan#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.ExperimentalPlan#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.ExperimentalPlan#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.ExperimentalPlan#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.ExperimentalPlan#getInternalReplication <em>Internal Replication</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.ExperimentalPlan#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.project.expDSL.ExpDSLPackage#getExperimentalPlan()
 * @model
 * @generated
 */
public interface ExperimentalPlan extends EObject
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
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getExperimentalPlan_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.xtext.project.expDSL.ExperimentalPlan#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.xtext.project.expDSL.DesignType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.xtext.project.expDSL.DesignType
	 * @see #setType(DesignType)
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getExperimentalPlan_Type()
	 * @model
	 * @generated
	 */
  DesignType getType();

  /**
	 * Sets the value of the '{@link org.xtext.project.expDSL.ExperimentalPlan#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.xtext.project.expDSL.DesignType
	 * @see #getType()
	 * @generated
	 */
  void setType(DesignType value);

  /**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.project.expDSL.Parameter}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getExperimentalPlan_Parameter()
	 * @model containment="true"
	 * @generated
	 */
  EList<Parameter> getParameter();

  /**
	 * Returns the value of the '<em><b>Factor</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.project.expDSL.Factor}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factor</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' containment reference list.
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getExperimentalPlan_Factor()
	 * @model containment="true"
	 * @generated
	 */
  EList<Factor> getFactor();

  /**
	 * Returns the value of the '<em><b>Internal Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Internal Replication</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Replication</em>' attribute.
	 * @see #setInternalReplication(int)
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getExperimentalPlan_InternalReplication()
	 * @model
	 * @generated
	 */
  int getInternalReplication();

  /**
	 * Sets the value of the '{@link org.xtext.project.expDSL.ExperimentalPlan#getInternalReplication <em>Internal Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Replication</em>' attribute.
	 * @see #getInternalReplication()
	 * @generated
	 */
  void setInternalReplication(int value);

  /**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.project.expDSL.Link}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getExperimentalPlan_Link()
	 * @model containment="true"
	 * @generated
	 */
  EList<Link> getLink();

} // ExperimentalPlan

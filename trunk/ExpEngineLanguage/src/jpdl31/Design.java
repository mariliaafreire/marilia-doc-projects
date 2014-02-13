/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jpdl31.Design#getFactors <em>Factors</em>}</li>
 *   <li>{@link jpdl31.Design#getDoE <em>Do E</em>}</li>
 *   <li>{@link jpdl31.Design#getParameters <em>Parameters</em>}</li>
 *   <li>{@link jpdl31.Design#getTest <em>Test</em>}</li>
 *   <li>{@link jpdl31.Design#getDepVariable <em>Dep Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see jpdl31.Jpdl31Package#getDesign()
 * @model
 * @generated
 */
public interface Design extends EObject {
	/**
	 * Returns the value of the '<em><b>Factors</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.Factor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factors</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getDesign_Factors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Factor> getFactors();

	/**
	 * Returns the value of the '<em><b>Do E</b></em>' attribute.
	 * The literals are from the enumeration {@link jpdl31.DoEType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do E</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do E</em>' attribute.
	 * @see jpdl31.DoEType
	 * @see #setDoE(DoEType)
	 * @see jpdl31.Jpdl31Package#getDesign_DoE()
	 * @model
	 * @generated
	 */
	DoEType getDoE();

	/**
	 * Sets the value of the '{@link jpdl31.Design#getDoE <em>Do E</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do E</em>' attribute.
	 * @see jpdl31.DoEType
	 * @see #getDoE()
	 * @generated
	 */
	void setDoE(DoEType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getDesign_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Test</b></em>' reference list.
	 * The list contents are of type {@link jpdl31.StatisticalTest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' reference list.
	 * @see jpdl31.Jpdl31Package#getDesign_Test()
	 * @model
	 * @generated
	 */
	EList<StatisticalTest> getTest();

	/**
	 * Returns the value of the '<em><b>Dep Variable</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.DependentVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dep Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dep Variable</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getDesign_DepVariable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DependentVariable> getDepVariable();

} // Design

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
 * A representation of the model object '<em><b>Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.project.expDSL.Factor#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Factor#getIsDesiredVariation <em>Is Desired Variation</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Factor#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.project.expDSL.ExpDSLPackage#getFactor()
 * @model
 * @generated
 */
public interface Factor extends EObject
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
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getFactor_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.xtext.project.expDSL.Factor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Is Desired Variation</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Desired Variation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Desired Variation</em>' attribute.
	 * @see #setIsDesiredVariation(String)
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getFactor_IsDesiredVariation()
	 * @model
	 * @generated
	 */
  String getIsDesiredVariation();

  /**
	 * Sets the value of the '{@link org.xtext.project.expDSL.Factor#getIsDesiredVariation <em>Is Desired Variation</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Desired Variation</em>' attribute.
	 * @see #getIsDesiredVariation()
	 * @generated
	 */
  void setIsDesiredVariation(String value);

  /**
	 * Returns the value of the '<em><b>Level</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.project.expDSL.Levels}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' containment reference list.
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getFactor_Level()
	 * @model containment="true"
	 * @generated
	 */
  EList<Levels> getLevel();

} // Factor

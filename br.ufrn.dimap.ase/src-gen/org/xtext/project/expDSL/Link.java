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
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.project.expDSL.Link#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Link#getTreatment <em>Treatment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.project.expDSL.ExpDSLPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject
{
  /**
	 * Returns the value of the '<em><b>Procedure</b></em>' reference list.
	 * The list contents are of type {@link org.xtext.project.expDSL.Process}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedure</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' reference list.
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getLink_Procedure()
	 * @model
	 * @generated
	 */
  EList<org.xtext.project.expDSL.Process> getProcedure();

  /**
	 * Returns the value of the '<em><b>Treatment</b></em>' reference list.
	 * The list contents are of type {@link org.xtext.project.expDSL.Levels}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Treatment</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Treatment</em>' reference list.
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getLink_Treatment()
	 * @model
	 * @generated
	 */
  EList<Levels> getTreatment();

} // Link

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
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Link#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Link#getTreatment <em>Treatment</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject
{
  /**
	 * Returns the value of the '<em><b>Procedure</b></em>' reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.Process}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedure</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getLink_Procedure()
	 * @model
	 * @generated
	 */
  EList<br.ufrn.dimap.ase.dsl.expDslv2.Process> getProcedure();

  /**
	 * Returns the value of the '<em><b>Treatment</b></em>' reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.Levels}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Treatment</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Treatment</em>' reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getLink_Treatment()
	 * @model
	 * @generated
	 */
  EList<Levels> getTreatment();

} // Link

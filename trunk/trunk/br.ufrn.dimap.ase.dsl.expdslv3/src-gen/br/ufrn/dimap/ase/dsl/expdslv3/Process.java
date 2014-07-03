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
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Process#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Process#getTreatment <em>Treatment</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Process#getRole <em>Role</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.Process#getTask <em>Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject
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
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getProcess_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expdslv3.Process#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Treatment</b></em>' reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expdslv3.Range}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Treatment</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Treatment</em>' reference list.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getProcess_Treatment()
	 * @model
	 * @generated
	 */
  EList<Range> getTreatment();

  /**
	 * Returns the value of the '<em><b>Role</b></em>' attribute list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expdslv3.RoleType}.
	 * The literals are from the enumeration {@link br.ufrn.dimap.ase.dsl.expdslv3.RoleType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute list.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.RoleType
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getProcess_Role()
	 * @model unique="false"
	 * @generated
	 */
  EList<RoleType> getRole();

  /**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expdslv3.Task}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package#getProcess_Task()
	 * @model containment="true"
	 * @generated
	 */
  EList<Task> getTask();

} // Process

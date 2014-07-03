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
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Task#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Task#getNext <em>Next</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Task#getRole <em>Role</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Task#getCollectData <em>Collect Data</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Task#getArtefacts <em>Artefacts</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Task#getQuestionnaire <em>Questionnaire</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject
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
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getTask_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expDslv2.Task#getName <em>Name</em>}' attribute.
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
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getTask_Description()
	 * @model
	 * @generated
	 */
  String getDescription();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expDslv2.Task#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
  void setDescription(String value);

  /**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.Task}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getTask_Next()
	 * @model
	 * @generated
	 */
  EList<Task> getNext();

  /**
	 * Returns the value of the '<em><b>Role</b></em>' attribute list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.RoleType}.
	 * The literals are from the enumeration {@link br.ufrn.dimap.ase.dsl.expDslv2.RoleType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.RoleType
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getTask_Role()
	 * @model unique="false"
	 * @generated
	 */
  EList<RoleType> getRole();

  /**
	 * Returns the value of the '<em><b>Collect Data</b></em>' reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.CollectedData}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collect Data</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Collect Data</em>' reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getTask_CollectData()
	 * @model
	 * @generated
	 */
  EList<CollectedData> getCollectData();

  /**
	 * Returns the value of the '<em><b>Artefacts</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.Artefact}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artefacts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Artefacts</em>' containment reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getTask_Artefacts()
	 * @model containment="true"
	 * @generated
	 */
  EList<Artefact> getArtefacts();

  /**
	 * Returns the value of the '<em><b>Questionnaire</b></em>' reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Questionnaire</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Questionnaire</em>' reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getTask_Questionnaire()
	 * @model
	 * @generated
	 */
  EList<Questionnaire> getQuestionnaire();

} // Task

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
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Activity#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Activity#getDescription <em>Description</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Activity#getNext <em>Next</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Activity#getRole <em>Role</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Activity#getCollectData <em>Collect Data</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Activity#getArtefacts <em>Artefacts</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Activity#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.Activity#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject
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
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getActivity_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expDslv2.Activity#getName <em>Name</em>}' attribute.
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
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getActivity_Description()
	 * @model
	 * @generated
	 */
  String getDescription();

  /**
	 * Sets the value of the '{@link br.ufrn.dimap.ase.dsl.expDslv2.Activity#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
  void setDescription(String value);

  /**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.Activity}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getActivity_Next()
	 * @model
	 * @generated
	 */
  EList<Activity> getNext();

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
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getActivity_Role()
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
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getActivity_CollectData()
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
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getActivity_Artefacts()
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
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getActivity_Questionnaire()
	 * @model
	 * @generated
	 */
  EList<Questionnaire> getQuestionnaire();

  /**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.Task}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getActivity_Tasks()
	 * @model containment="true"
	 * @generated
	 */
  EList<Task> getTasks();

} // Activity

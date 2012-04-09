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
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.project.expDSL.Activity#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Activity#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Activity#getNext <em>Next</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Activity#getRole <em>Role</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.Activity#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.project.expDSL.ExpDSLPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject
{
  /**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getActivity_Id()
	 * @model
	 * @generated
	 */
  String getId();

  /**
	 * Sets the value of the '{@link org.xtext.project.expDSL.Activity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
  void setId(String value);

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
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getActivity_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.xtext.project.expDSL.Activity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Next</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' attribute list.
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getActivity_Next()
	 * @model unique="false"
	 * @generated
	 */
  EList<String> getNext();

  /**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.project.expDSL.Role}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getActivity_Role()
	 * @model containment="true"
	 * @generated
	 */
  EList<Role> getRole();

  /**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.project.expDSL.Task}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getActivity_Tasks()
	 * @model containment="true"
	 * @generated
	 */
  EList<Task> getTasks();

} // Activity

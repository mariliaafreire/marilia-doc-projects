/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Content Package is special Method Package that contains Content Elements and Content Elements, only.  Examples for Content Element are Artifacts, Tasks, Roles, etc.  A key separation of concerns in UMA is the distinction between Method Content and Process.  This separation is enforced by special package types, which do not allow the mixing of method content with processes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uma.ContentPackage#getContentElements <em>Content Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see uma.UmaPackage#getContentPackage()
 * @model
 * @generated
 */
public interface ContentPackage extends MethodPackage {
	/**
	 * Returns the value of the '<em><b>Content Elements</b></em>' containment reference list.
	 * The list contents are of type {@link uma.ContentElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Elements</em>' containment reference list.
	 * @see uma.UmaPackage#getContentPackage_ContentElements()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ContentElement> getContentElements();

} // ContentPackage

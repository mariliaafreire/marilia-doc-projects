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
 * A representation of the model object '<em><b>Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uma.Kind#getApplicableMetaClassInfo <em>Applicable Meta Class Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see uma.UmaPackage#getKind()
 * @model
 * @generated
 */
public interface Kind extends ContentElement {
	/**
	 * Returns the value of the '<em><b>Applicable Meta Class Info</b></em>' containment reference list.
	 * The list contents are of type {@link uma.ApplicableMetaClassInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicable Meta Class Info</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable Meta Class Info</em>' containment reference list.
	 * @see uma.UmaPackage#getKind_ApplicableMetaClassInfo()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ApplicableMetaClassInfo> getApplicableMetaClassInfo();

} // Kind

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
 * A representation of the model object '<em><b>Fulfillable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uma.FulfillableElement#getFulfills <em>Fulfills</em>}</li>
 * </ul>
 * </p>
 *
 * @see uma.UmaPackage#getFulfillableElement()
 * @model
 * @generated
 */
public interface FulfillableElement extends DescribableElement {
	/**
	 * Returns the value of the '<em><b>Fulfills</b></em>' reference list.
	 * The list contents are of type {@link uma.FulfillableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fulfills</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfills</em>' reference list.
	 * @see uma.UmaPackage#getFulfillableElement_Fulfills()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FulfillableElement> getFulfills();

} // FulfillableElement

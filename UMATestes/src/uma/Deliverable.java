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
 * A representation of the model object '<em><b>Deliverable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A deliverable is a Work Product that provides a description and definition for packaging other Work Products, and may be delivered to an internal or external party.  Therefore, a Deliverable aggregates other Work Products. Therefore, a Deliverable aggregates other Work Products.  A Deliverable is used to pre-define typical or recommended content in the form or work products that would be packaged for delivery.  The actual packaging of the Deliverable in an actual process or even project could be a modification of this recommendation.  Deliverables are used to represent an output from a process that has value, material or otherwise, to a client, customer or other stakeholder. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uma.Deliverable#getDeliveredWorkProducts <em>Delivered Work Products</em>}</li>
 * </ul>
 * </p>
 *
 * @see uma.UmaPackage#getDeliverable()
 * @model
 * @generated
 */
public interface Deliverable extends WorkProduct {
	/**
	 * Returns the value of the '<em><b>Delivered Work Products</b></em>' reference list.
	 * The list contents are of type {@link uma.WorkProduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivered Work Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivered Work Products</em>' reference list.
	 * @see uma.UmaPackage#getDeliverable_DeliveredWorkProducts()
	 * @model ordered="false"
	 * @generated
	 */
	EList<WorkProduct> getDeliveredWorkProducts();

} // Deliverable

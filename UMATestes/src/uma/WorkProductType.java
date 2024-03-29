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
 * A representation of the model object '<em><b>Work Product Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Work Product Type is a second category for work products, which in contrast to Domain is more presentation oriented.  A work product can have many Work Product Types.  Examples, for a Work Product Type is "Class Diagram", which categorizes the Artifacts Analysis Model, Design Model, User Experience Model, or "Specification", which categorizes requirements specifications that define a system with a well-defined system boundary, such as use case or functional requirements specification.  A Work Product can be categorized to be of many Work Product Types.  For example, a use case model can be categorized as a Specification as well as Diagram Work Product Type.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uma.WorkProductType#getWorkProducts <em>Work Products</em>}</li>
 * </ul>
 * </p>
 *
 * @see uma.UmaPackage#getWorkProductType()
 * @model
 * @generated
 */
public interface WorkProductType extends ContentCategory {
	/**
	 * Returns the value of the '<em><b>Work Products</b></em>' reference list.
	 * The list contents are of type {@link uma.WorkProduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Products</em>' reference list.
	 * @see uma.UmaPackage#getWorkProductType_WorkProducts()
	 * @model ordered="false"
	 * @generated
	 */
	EList<WorkProduct> getWorkProducts();

} // WorkProductType

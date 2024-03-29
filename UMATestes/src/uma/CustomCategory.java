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
 * A representation of the model object '<em><b>Custom Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Custom Category is a category introduced by a method content author to structure any number of method Content Elements of any subtype based on user-defined criteria.  Because Content Categories (and therefore Custom Categories, too) are Content Elements themselves, Custom Categories can be used to recursively categorize Content Categories as well.  Custom Categories can also be nested with any Content Category.  Custom categories can be used to categorize content based on the user's criteria as well as to define whole tree-structures of nested categories allowing the user to systematically navigate and browse method content and processes based on these categories.  For example, one could create a custom category to logically organize content relevant for the user's development organization departments; e.g. a "Testing" category that groups together all roles, work products, tasks, and guidance element relevant to testing.  Another example would be categories that express licensing levels of the content grouping freely distributable method content versus content that represent intellectual property and requires a license to be purchased to be able to use it.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uma.CustomCategory#getCategorizedElements <em>Categorized Elements</em>}</li>
 *   <li>{@link uma.CustomCategory#getSubCategories <em>Sub Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @see uma.UmaPackage#getCustomCategory()
 * @model
 * @generated
 */
public interface CustomCategory extends ContentCategory {
	/**
	 * Returns the value of the '<em><b>Categorized Elements</b></em>' reference list.
	 * The list contents are of type {@link uma.DescribableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorized Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorized Elements</em>' reference list.
	 * @see uma.UmaPackage#getCustomCategory_CategorizedElements()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DescribableElement> getCategorizedElements();

	/**
	 * Returns the value of the '<em><b>Sub Categories</b></em>' reference list.
	 * The list contents are of type {@link uma.ContentCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Categories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Categories</em>' reference list.
	 * @see uma.UmaPackage#getCustomCategory_SubCategories()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ContentCategory> getSubCategories();

} // CustomCategory

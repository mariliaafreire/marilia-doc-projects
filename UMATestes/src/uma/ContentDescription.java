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
 * A representation of the model object '<em><b>Content Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Content Description is a Method Element that is used to store the textual description for a Content Element.  It defines standard attributes applicable for all Content Element types.  Specific Content Element sub-types can define their own matching Content Description sub-types. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uma.ContentDescription#getMainDescription <em>Main Description</em>}</li>
 *   <li>{@link uma.ContentDescription#getSections <em>Sections</em>}</li>
 *   <li>{@link uma.ContentDescription#getExternalId <em>External Id</em>}</li>
 *   <li>{@link uma.ContentDescription#getKeyConsiderations <em>Key Considerations</em>}</li>
 *   <li>{@link uma.ContentDescription#getLongPresentationName <em>Long Presentation Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uma.UmaPackage#getContentDescription()
 * @model
 * @generated
 */
public interface ContentDescription extends MethodUnit {
	/**
	 * Returns the value of the '<em><b>Main Description</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute store the main descriptive text for the Content Element.  All text that is not part of any of the more specific attributes shall be stored here.  If the Content Description is divided into sections using the Section class, then only the text from the 'start' of the content description to the first section will be stored here (similar to a normal document where you can place text between its beginning to its first diction heading).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Main Description</em>' attribute.
	 * @see #setMainDescription(String)
	 * @see uma.UmaPackage#getContentDescription_MainDescription()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getMainDescription();

	/**
	 * Sets the value of the '{@link uma.ContentDescription#getMainDescription <em>Main Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Description</em>' attribute.
	 * @see #getMainDescription()
	 * @generated
	 */
	void setMainDescription(String value);

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link uma.Section}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see uma.UmaPackage#getContentDescription_Sections()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Section> getSections();

	/**
	 * Returns the value of the '<em><b>External Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An external visible number or label that is used to reference this element. Used like a synonym to the name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Id</em>' attribute.
	 * @see #setExternalId(String)
	 * @see uma.UmaPackage#getContentDescription_ExternalId()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getExternalId();

	/**
	 * Sets the value of the '{@link uma.ContentDescription#getExternalId <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Id</em>' attribute.
	 * @see #getExternalId()
	 * @generated
	 */
	void setExternalId(String value);

	/**
	 * Returns the value of the '<em><b>Key Considerations</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Key Considerations provides advise and guidance of a critical nature for the content element as well as warnings, cautions, pitfalls, dangers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Considerations</em>' attribute.
	 * @see #setKeyConsiderations(String)
	 * @see uma.UmaPackage#getContentDescription_KeyConsiderations()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getKeyConsiderations();

	/**
	 * Sets the value of the '{@link uma.ContentDescription#getKeyConsiderations <em>Key Considerations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Considerations</em>' attribute.
	 * @see #getKeyConsiderations()
	 * @generated
	 */
	void setKeyConsiderations(String value);

	/**
	 * Returns the value of the '<em><b>Long Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Presentation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Presentation Name</em>' attribute.
	 * @see #setLongPresentationName(String)
	 * @see uma.UmaPackage#getContentDescription_LongPresentationName()
	 * @model dataType="uma.String" required="true" ordered="false"
	 * @generated
	 */
	String getLongPresentationName();

	/**
	 * Sets the value of the '{@link uma.ContentDescription#getLongPresentationName <em>Long Presentation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Presentation Name</em>' attribute.
	 * @see #getLongPresentationName()
	 * @generated
	 */
	void setLongPresentationName(String value);

} // ContentDescription

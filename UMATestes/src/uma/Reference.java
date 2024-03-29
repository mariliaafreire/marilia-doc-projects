/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uma.Reference#getIsIndividualRepresentation <em>Is Individual Representation</em>}</li>
 *   <li>{@link uma.Reference#getReferenced <em>Referenced</em>}</li>
 * </ul>
 * </p>
 *
 * @see uma.UmaPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Is Individual Representation</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Individual Representation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Individual Representation</em>' attribute.
	 * @see #setIsIndividualRepresentation(Boolean)
	 * @see uma.UmaPackage#getReference_IsIndividualRepresentation()
	 * @model default="false" dataType="uma.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsIndividualRepresentation();

	/**
	 * Sets the value of the '{@link uma.Reference#getIsIndividualRepresentation <em>Is Individual Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Individual Representation</em>' attribute.
	 * @see #getIsIndividualRepresentation()
	 * @generated
	 */
	void setIsIndividualRepresentation(Boolean value);

	/**
	 * Returns the value of the '<em><b>Referenced</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uma.DiagramElement#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced</em>' reference.
	 * @see #setReferenced(DiagramElement)
	 * @see uma.UmaPackage#getReference_Referenced()
	 * @see uma.DiagramElement#getReference
	 * @model opposite="reference" required="true" ordered="false"
	 * @generated
	 */
	DiagramElement getReferenced();

	/**
	 * Sets the value of the '{@link uma.Reference#getReferenced <em>Referenced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced</em>' reference.
	 * @see #getReferenced()
	 * @generated
	 */
	void setReferenced(DiagramElement value);

} // Reference

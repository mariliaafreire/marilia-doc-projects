/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UMA Semantic Model Bridge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uma.UMASemanticModelBridge#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see uma.UmaPackage#getUMASemanticModelBridge()
 * @model
 * @generated
 */
public interface UMASemanticModelBridge extends SemanticModelBridge {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(MethodElement)
	 * @see uma.UmaPackage#getUMASemanticModelBridge_Element()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MethodElement getElement();

	/**
	 * Sets the value of the '{@link uma.UMASemanticModelBridge#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(MethodElement value);

} // UMASemanticModelBridge

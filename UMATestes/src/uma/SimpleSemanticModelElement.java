/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Semantic Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uma.SimpleSemanticModelElement#getTypeInfo <em>Type Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see uma.UmaPackage#getSimpleSemanticModelElement()
 * @model
 * @generated
 */
public interface SimpleSemanticModelElement extends SemanticModelBridge {
	/**
	 * Returns the value of the '<em><b>Type Info</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Info</em>' attribute.
	 * @see #setTypeInfo(String)
	 * @see uma.UmaPackage#getSimpleSemanticModelElement_TypeInfo()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getTypeInfo();

	/**
	 * Sets the value of the '{@link uma.SimpleSemanticModelElement#getTypeInfo <em>Type Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Info</em>' attribute.
	 * @see #getTypeInfo()
	 * @generated
	 */
	void setTypeInfo(String value);

} // SimpleSemanticModelElement

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Element Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uma.MethodElementProperty#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uma.UmaPackage#getMethodElementProperty()
 * @model
 * @generated
 */
public interface MethodElementProperty extends PackageableElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see uma.UmaPackage#getMethodElementProperty_Value()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link uma.MethodElementProperty#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // MethodElementProperty

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
 * A representation of the model object '<em><b>Method Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Every class defined in this specification is derived from Method Element.  In other words Method Element is the root generalization for all UMA classes and defines a common set of attributes inherited by every other element type of this model.  Method Element itself is derived from Packageable Element from the UML 2.0 Infrastructure.  Method Element inherits the Name attribute from Packageable Element's super class.  Every element defined as a UMA instance is derived from Model Element.  Every Method Element in-stance is at least defined by a unique id, a name, as well as brief description.
 * Method Element in the package Method Plugin adds additional properties via package merge to Method Element defined in Method Core needed for the variability and extensibility capabilities introduces in this package.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uma.MethodElement#getGuid <em>Guid</em>}</li>
 *   <li>{@link uma.MethodElement#getPresentationName <em>Presentation Name</em>}</li>
 *   <li>{@link uma.MethodElement#getBriefDescription <em>Brief Description</em>}</li>
 *   <li>{@link uma.MethodElement#getOwnedRules <em>Owned Rules</em>}</li>
 *   <li>{@link uma.MethodElement#getMethodElementProperty <em>Method Element Property</em>}</li>
 *   <li>{@link uma.MethodElement#getKind <em>Kind</em>}</li>
 *   <li>{@link uma.MethodElement#getSuppressed <em>Suppressed</em>}</li>
 *   <li>{@link uma.MethodElement#getOrderingGuide <em>Ordering Guide</em>}</li>
 * </ul>
 * </p>
 *
 * @see uma.UmaPackage#getMethodElement()
 * @model abstract="true"
 * @generated
 */
public interface MethodElement extends PackageableElement {
	/**
	 * Returns the value of the '<em><b>Guid</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Every instance of Method Element has a global unique id.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guid</em>' attribute.
	 * @see #setGuid(String)
	 * @see uma.UmaPackage#getMethodElement_Guid()
	 * @model default="" id="true" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getGuid();

	/**
	 * Sets the value of the '{@link uma.MethodElement#getGuid <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guid</em>' attribute.
	 * @see #getGuid()
	 * @generated
	 */
	void setGuid(String value);

	/**
	 * Returns the value of the '<em><b>Presentation Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Every Describable Element has a presentation name, which is used for external presentation of the element.  For example, name (the internal representation) might be set to "rup_architecture_document" to differentiate from a "j2ee_architcture_document" whereas the external presentation would always be "Architecture Document".
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Presentation Name</em>' attribute.
	 * @see #setPresentationName(String)
	 * @see uma.UmaPackage#getMethodElement_PresentationName()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getPresentationName();

	/**
	 * Sets the value of the '{@link uma.MethodElement#getPresentationName <em>Presentation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Name</em>' attribute.
	 * @see #getPresentationName()
	 * @generated
	 */
	void setPresentationName(String value);

	/**
	 * Returns the value of the '<em><b>Brief Description</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Every instance of Method Element shall be briefly described with one or two sentences summarizing the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Brief Description</em>' attribute.
	 * @see #setBriefDescription(String)
	 * @see uma.UmaPackage#getMethodElement_BriefDescription()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getBriefDescription();

	/**
	 * Sets the value of the '{@link uma.MethodElement#getBriefDescription <em>Brief Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brief Description</em>' attribute.
	 * @see #getBriefDescription()
	 * @generated
	 */
	void setBriefDescription(String value);

	/**
	 * Returns the value of the '<em><b>Owned Rules</b></em>' containment reference list.
	 * The list contents are of type {@link uma.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Rules</em>' containment reference list.
	 * @see uma.UmaPackage#getMethodElement_OwnedRules()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getOwnedRules();

	/**
	 * Returns the value of the '<em><b>Method Element Property</b></em>' containment reference list.
	 * The list contents are of type {@link uma.MethodElementProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Element Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Element Property</em>' containment reference list.
	 * @see uma.UmaPackage#getMethodElement_MethodElementProperty()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MethodElementProperty> getMethodElementProperty();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' reference list.
	 * The list contents are of type {@link uma.Kind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' reference list.
	 * @see uma.UmaPackage#getMethodElement_Kind()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Kind> getKind();

	/**
	 * Returns the value of the '<em><b>Suppressed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a Variability Element is derived from another Variability Element using the Extends Variability Specialization then this attribute can be used to suppress inherited Method Elements that were part of the based-on Variability Element, which can be any type of Method Element.  In other words, if this attribute is set to true on a Method Element that has the same name than an inherited method element then it will not be regarded as inherited at all.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Suppressed</em>' attribute.
	 * @see #setSuppressed(Boolean)
	 * @see uma.UmaPackage#getMethodElement_Suppressed()
	 * @model default="false" dataType="uma.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getSuppressed();

	/**
	 * Sets the value of the '{@link uma.MethodElement#getSuppressed <em>Suppressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppressed</em>' attribute.
	 * @see #getSuppressed()
	 * @generated
	 */
	void setSuppressed(Boolean value);

	/**
	 * Returns the value of the '<em><b>Ordering Guide</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is used for CASE tool realizations of this model to contain information about layout and ordering of the method element and its parts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordering Guide</em>' attribute.
	 * @see #setOrderingGuide(String)
	 * @see uma.UmaPackage#getMethodElement_OrderingGuide()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getOrderingGuide();

	/**
	 * Sets the value of the '{@link uma.MethodElement#getOrderingGuide <em>Ordering Guide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering Guide</em>' attribute.
	 * @see #getOrderingGuide()
	 * @generated
	 */
	void setOrderingGuide(String value);

} // MethodElement

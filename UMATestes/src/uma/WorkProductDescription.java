/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Product Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uma.WorkProductDescription#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link uma.WorkProductDescription#getImpactOfNotHaving <em>Impact Of Not Having</em>}</li>
 *   <li>{@link uma.WorkProductDescription#getReasonsForNotNeeding <em>Reasons For Not Needing</em>}</li>
 * </ul>
 * </p>
 *
 * @see uma.UmaPackage#getWorkProductDescription()
 * @model
 * @generated
 */
public interface WorkProductDescription extends ContentDescription {
	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes why the work product is produced and to what use it will be put.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see uma.UmaPackage#getWorkProductDescription_Purpose()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link uma.WorkProductDescription#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Impact Of Not Having</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the consequences of not producing the work product.  This is intended to aid in the tailoring the method/process to the needs of a specific project.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Impact Of Not Having</em>' attribute.
	 * @see #setImpactOfNotHaving(String)
	 * @see uma.UmaPackage#getWorkProductDescription_ImpactOfNotHaving()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getImpactOfNotHaving();

	/**
	 * Sets the value of the '{@link uma.WorkProductDescription#getImpactOfNotHaving <em>Impact Of Not Having</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact Of Not Having</em>' attribute.
	 * @see #getImpactOfNotHaving()
	 * @generated
	 */
	void setImpactOfNotHaving(String value);

	/**
	 * Returns the value of the '<em><b>Reasons For Not Needing</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the circumstances in which it is reasonable not to produce the work product.  This is intended to aid in the tailoring of the method/process to the needs of a specific project.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reasons For Not Needing</em>' attribute.
	 * @see #setReasonsForNotNeeding(String)
	 * @see uma.UmaPackage#getWorkProductDescription_ReasonsForNotNeeding()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getReasonsForNotNeeding();

	/**
	 * Sets the value of the '{@link uma.WorkProductDescription#getReasonsForNotNeeding <em>Reasons For Not Needing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reasons For Not Needing</em>' attribute.
	 * @see #getReasonsForNotNeeding()
	 * @generated
	 */
	void setReasonsForNotNeeding(String value);

} // WorkProductDescription

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uma.ProcessDescription#getScope <em>Scope</em>}</li>
 *   <li>{@link uma.ProcessDescription#getUsageNotes <em>Usage Notes</em>}</li>
 * </ul>
 * </p>
 *
 * @see uma.UmaPackage#getProcessDescription()
 * @model
 * @generated
 */
public interface ProcessDescription extends ActivityDescription {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the scope of the Process, i.e. which types of projects does it address and which not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see uma.UmaPackage#getProcessDescription_Scope()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link uma.ProcessDescription#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

	/**
	 * Returns the value of the '<em><b>Usage Notes</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any additional notes on how to apply and instantiate this process for a project.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Notes</em>' attribute.
	 * @see #setUsageNotes(String)
	 * @see uma.UmaPackage#getProcessDescription_UsageNotes()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getUsageNotes();

	/**
	 * Sets the value of the '{@link uma.ProcessDescription#getUsageNotes <em>Usage Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Notes</em>' attribute.
	 * @see #getUsageNotes()
	 * @generated
	 */
	void setUsageNotes(String value);

} // ProcessDescription

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uma.TaskDescription#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link uma.TaskDescription#getAlternatives <em>Alternatives</em>}</li>
 * </ul>
 * </p>
 *
 * @see uma.UmaPackage#getTaskDescription()
 * @model
 * @generated
 */
public interface TaskDescription extends ContentDescription {
	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Summarizes the main reason for performing this Task and what is intended to be achieved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see uma.UmaPackage#getTaskDescription_Purpose()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link uma.TaskDescription#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Alternatives</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comprises of summaries describing important exceptional and non-standard ways of achieving this Task's development goals that were not covered by the Task's Steps.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternatives</em>' attribute.
	 * @see #setAlternatives(String)
	 * @see uma.UmaPackage#getTaskDescription_Alternatives()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getAlternatives();

	/**
	 * Sets the value of the '{@link uma.TaskDescription#getAlternatives <em>Alternatives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternatives</em>' attribute.
	 * @see #getAlternatives()
	 * @generated
	 */
	void setAlternatives(String value);

} // TaskDescription

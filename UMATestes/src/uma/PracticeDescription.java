/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Practice Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uma.PracticeDescription#getAdditionalInfo <em>Additional Info</em>}</li>
 *   <li>{@link uma.PracticeDescription#getProblem <em>Problem</em>}</li>
 *   <li>{@link uma.PracticeDescription#getBackground <em>Background</em>}</li>
 *   <li>{@link uma.PracticeDescription#getGoals <em>Goals</em>}</li>
 *   <li>{@link uma.PracticeDescription#getApplication <em>Application</em>}</li>
 *   <li>{@link uma.PracticeDescription#getLevelsOfAdoption <em>Levels Of Adoption</em>}</li>
 * </ul>
 * </p>
 *
 * @see uma.UmaPackage#getPracticeDescription()
 * @model
 * @generated
 */
public interface PracticeDescription extends ContentDescription {
	/**
	 * Returns the value of the '<em><b>Additional Info</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any additional Information not covered by the other attributes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Info</em>' attribute.
	 * @see #setAdditionalInfo(String)
	 * @see uma.UmaPackage#getPracticeDescription_AdditionalInfo()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getAdditionalInfo();

	/**
	 * Sets the value of the '{@link uma.PracticeDescription#getAdditionalInfo <em>Additional Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Info</em>' attribute.
	 * @see #getAdditionalInfo()
	 * @generated
	 */
	void setAdditionalInfo(String value);

	/**
	 * Returns the value of the '<em><b>Problem</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the problem the Practice addresses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Problem</em>' attribute.
	 * @see #setProblem(String)
	 * @see uma.UmaPackage#getPracticeDescription_Problem()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getProblem();

	/**
	 * Sets the value of the '{@link uma.PracticeDescription#getProblem <em>Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem</em>' attribute.
	 * @see #getProblem()
	 * @generated
	 */
	void setProblem(String value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elaboration on the background and the context in which the problem occurs and where the solution described by this Practice will fit in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(String)
	 * @see uma.UmaPackage#getPracticeDescription_Background()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getBackground();

	/**
	 * Sets the value of the '{@link uma.PracticeDescription#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(String value);

	/**
	 * Returns the value of the '<em><b>Goals</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A summary of the overall goals to be addressed by the Practice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goals</em>' attribute.
	 * @see #setGoals(String)
	 * @see uma.UmaPackage#getPracticeDescription_Goals()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getGoals();

	/**
	 * Sets the value of the '{@link uma.PracticeDescription#getGoals <em>Goals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goals</em>' attribute.
	 * @see #getGoals()
	 * @generated
	 */
	void setGoals(String value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes how the Practice is being applied or introduced into the context described in background.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Application</em>' attribute.
	 * @see #setApplication(String)
	 * @see uma.UmaPackage#getPracticeDescription_Application()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getApplication();

	/**
	 * Sets the value of the '{@link uma.PracticeDescription#getApplication <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' attribute.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(String value);

	/**
	 * Returns the value of the '<em><b>Levels Of Adoption</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outlines the different forms or variants in which the practice could be realized. (e.g. full adoption verus a partial adoption of the Practice)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Levels Of Adoption</em>' attribute.
	 * @see #setLevelsOfAdoption(String)
	 * @see uma.UmaPackage#getPracticeDescription_LevelsOfAdoption()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getLevelsOfAdoption();

	/**
	 * Sets the value of the '{@link uma.PracticeDescription#getLevelsOfAdoption <em>Levels Of Adoption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Levels Of Adoption</em>' attribute.
	 * @see #getLevelsOfAdoption()
	 * @generated
	 */
	void setLevelsOfAdoption(String value);

} // PracticeDescription

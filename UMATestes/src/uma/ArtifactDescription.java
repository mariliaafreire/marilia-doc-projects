/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uma.ArtifactDescription#getBriefOutline <em>Brief Outline</em>}</li>
 *   <li>{@link uma.ArtifactDescription#getRepresentationOptions <em>Representation Options</em>}</li>
 *   <li>{@link uma.ArtifactDescription#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link uma.ArtifactDescription#getNotation <em>Notation</em>}</li>
 * </ul>
 * </p>
 *
 * @see uma.UmaPackage#getArtifactDescription()
 * @model
 * @generated
 */
public interface ArtifactDescription extends WorkProductDescription {
	/**
	 * Returns the value of the '<em><b>Brief Outline</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a brief description of the information that can be found in this artifact. For example, discusses the contents for key chapters of a document artifact or the key packages and modules of a model artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Brief Outline</em>' attribute.
	 * @see #setBriefOutline(String)
	 * @see uma.UmaPackage#getArtifactDescription_BriefOutline()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getBriefOutline();

	/**
	 * Sets the value of the '{@link uma.ArtifactDescription#getBriefOutline <em>Brief Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brief Outline</em>' attribute.
	 * @see #getBriefOutline()
	 * @generated
	 */
	void setBriefOutline(String value);

	/**
	 * Returns the value of the '<em><b>Representation Options</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Discusses different possible alternative representations for the artifact. For example a design model can be represented as a UML model or an informal block diagram or by textual description only.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Representation Options</em>' attribute.
	 * @see #setRepresentationOptions(String)
	 * @see uma.UmaPackage#getArtifactDescription_RepresentationOptions()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getRepresentationOptions();

	/**
	 * Sets the value of the '{@link uma.ArtifactDescription#getRepresentationOptions <em>Representation Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation Options</em>' attribute.
	 * @see #getRepresentationOptions()
	 * @generated
	 */
	void setRepresentationOptions(String value);

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' attribute.
	 * @see #setRepresentation(String)
	 * @see uma.UmaPackage#getArtifactDescription_Representation()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getRepresentation();

	/**
	 * Sets the value of the '{@link uma.ArtifactDescription#getRepresentation <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' attribute.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(String value);

	/**
	 * Returns the value of the '<em><b>Notation</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation</em>' attribute.
	 * @see #setNotation(String)
	 * @see uma.UmaPackage#getArtifactDescription_Notation()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getNotation();

	/**
	 * Sets the value of the '{@link uma.ArtifactDescription#getNotation <em>Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation</em>' attribute.
	 * @see #getNotation()
	 * @generated
	 */
	void setNotation(String value);

} // ArtifactDescription

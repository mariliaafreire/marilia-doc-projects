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
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Artifact is a Work Product that provides a description and definition for tangible work product types. Artifacts may be composed of other artifacts. For example, a model artifact can be composed of model elements, which are also artifacts.
 * Artifacts are tangible work products consumed, produced, or modified by Tasks.  It may serve as a basis for defining reusable assets.  Roles use Artifacts to perform Tasks and produce Artifacts in the course of performing Tasks.  Artifacts are the responsibility of a single Role, making responsibility easy to identify and understand, and promoting the idea that every piece of information produced in the method requires the appropriate set of skills. Even though one role might "own" a specific type of Artifacts, other roles can still use the Artifacts; perhaps even update them if the Role has been given permission to do so.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uma.Artifact#getContainerArtifact <em>Container Artifact</em>}</li>
 *   <li>{@link uma.Artifact#getContainedArtifacts <em>Contained Artifacts</em>}</li>
 * </ul>
 * </p>
 *
 * @see uma.UmaPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends WorkProduct {
	/**
	 * Returns the value of the '<em><b>Container Artifact</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uma.Artifact#getContainedArtifacts <em>Contained Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Artifact</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Artifact</em>' container reference.
	 * @see #setContainerArtifact(Artifact)
	 * @see uma.UmaPackage#getArtifact_ContainerArtifact()
	 * @see uma.Artifact#getContainedArtifacts
	 * @model opposite="containedArtifacts" transient="false" ordered="false"
	 * @generated
	 */
	Artifact getContainerArtifact();

	/**
	 * Sets the value of the '{@link uma.Artifact#getContainerArtifact <em>Container Artifact</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Artifact</em>' container reference.
	 * @see #getContainerArtifact()
	 * @generated
	 */
	void setContainerArtifact(Artifact value);

	/**
	 * Returns the value of the '<em><b>Contained Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link uma.Artifact}.
	 * It is bidirectional and its opposite is '{@link uma.Artifact#getContainerArtifact <em>Container Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Artifacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Artifacts</em>' containment reference list.
	 * @see uma.UmaPackage#getArtifact_ContainedArtifacts()
	 * @see uma.Artifact#getContainerArtifact
	 * @model opposite="containerArtifact" containment="true" ordered="false"
	 * @generated
	 */
	EList<Artifact> getContainedArtifacts();

} // Artifact

/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.project.expDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artefact Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.project.expDSL.ArtefactMetric#getArtefact <em>Artefact</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.project.expDSL.ExpDSLPackage#getArtefactMetric()
 * @model
 * @generated
 */
public interface ArtefactMetric extends Metrics
{
  /**
   * Returns the value of the '<em><b>Artefact</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artefact</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artefact</em>' reference.
   * @see #setArtefact(Artefact)
   * @see org.xtext.project.expDSL.ExpDSLPackage#getArtefactMetric_Artefact()
   * @model
   * @generated
   */
  Artefact getArtefact();

  /**
   * Sets the value of the '{@link org.xtext.project.expDSL.ArtefactMetric#getArtefact <em>Artefact</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Artefact</em>' reference.
   * @see #getArtefact()
   * @generated
   */
  void setArtefact(Artefact value);

} // ArtefactMetric

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
 *   <li>{@link org.xtext.project.expDSL.ArtefactMetric#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.ArtefactMetric#getArtefacts <em>Artefacts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.project.expDSL.ExpDSLPackage#getArtefactMetric()
 * @model
 * @generated
 */
public interface ArtefactMetric extends Detail
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getArtefactMetric_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.xtext.project.expDSL.ArtefactMetric#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Artefacts</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artefacts</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Artefacts</em>' reference.
	 * @see #setArtefacts(Artefact)
	 * @see org.xtext.project.expDSL.ExpDSLPackage#getArtefactMetric_Artefacts()
	 * @model
	 * @generated
	 */
  Artefact getArtefacts();

  /**
	 * Sets the value of the '{@link org.xtext.project.expDSL.ArtefactMetric#getArtefacts <em>Artefacts</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artefacts</em>' reference.
	 * @see #getArtefacts()
	 * @generated
	 */
  void setArtefacts(Artefact value);

} // ArtefactMetric

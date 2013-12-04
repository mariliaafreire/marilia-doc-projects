/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.DataMetric#getCollectedData <em>Collected Data</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.DataMetric#getDataType <em>Data Type</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.DataMetric#getArtefacts <em>Artefacts</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.DataMetric#getQuestionnaires <em>Questionnaires</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getDataMetric()
 * @model
 * @generated
 */
public interface DataMetric extends Detail
{
  /**
	 * Returns the value of the '<em><b>Collected Data</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.CollectedData}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collected Data</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Collected Data</em>' containment reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getDataMetric_CollectedData()
	 * @model containment="true"
	 * @generated
	 */
  EList<CollectedData> getCollectedData();

  /**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.DataType}.
	 * The literals are from the enumeration {@link br.ufrn.dimap.ase.dsl.expDslv2.DataType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Type</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.DataType
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getDataMetric_DataType()
	 * @model unique="false"
	 * @generated
	 */
  EList<DataType> getDataType();

  /**
	 * Returns the value of the '<em><b>Artefacts</b></em>' reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.Artefact}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artefacts</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Artefacts</em>' reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getDataMetric_Artefacts()
	 * @model
	 * @generated
	 */
  EList<Artefact> getArtefacts();

  /**
	 * Returns the value of the '<em><b>Questionnaires</b></em>' reference list.
	 * The list contents are of type {@link br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Questionnaires</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Questionnaires</em>' reference list.
	 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getDataMetric_Questionnaires()
	 * @model
	 * @generated
	 */
  EList<Questionnaire> getQuestionnaires();

} // DataMetric

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jpdl31.Metric#getNome <em>Nome</em>}</li>
 *   <li>{@link jpdl31.Metric#getDescription <em>Description</em>}</li>
 *   <li>{@link jpdl31.Metric#getType <em>Type</em>}</li>
 *   <li>{@link jpdl31.Metric#getRelatesTo <em>Relates To</em>}</li>
 * </ul>
 * </p>
 *
 * @see jpdl31.Jpdl31Package#getMetric()
 * @model
 * @generated
 */
public interface Metric extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see jpdl31.Jpdl31Package#getMetric_Nome()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link jpdl31.Metric#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see jpdl31.Jpdl31Package#getMetric_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link jpdl31.Metric#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link jpdl31.MetricType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see jpdl31.MetricType
	 * @see #setType(MetricType)
	 * @see jpdl31.Jpdl31Package#getMetric_Type()
	 * @model required="true"
	 * @generated
	 */
	MetricType getType();

	/**
	 * Sets the value of the '{@link jpdl31.Metric#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see jpdl31.MetricType
	 * @see #getType()
	 * @generated
	 */
	void setType(MetricType value);

	/**
	 * Returns the value of the '<em><b>Relates To</b></em>' reference list.
	 * The list contents are of type {@link jpdl31.ProcessDefinitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relates To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relates To</em>' reference list.
	 * @see jpdl31.Jpdl31Package#getMetric_RelatesTo()
	 * @model
	 * @generated
	 */
	EList<ProcessDefinitionType> getRelatesTo();

} // Metric

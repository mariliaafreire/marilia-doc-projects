/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jpdl31.Delegation#getMixed <em>Mixed</em>}</li>
 *   <li>{@link jpdl31.Delegation#getAny <em>Any</em>}</li>
 *   <li>{@link jpdl31.Delegation#getClass_ <em>Class</em>}</li>
 *   <li>{@link jpdl31.Delegation#getConfigType <em>Config Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see jpdl31.Jpdl31Package#getDelegation()
 * @model extendedMetaData="name='delegation' kind='mixed'"
 * @generated
 */
public interface Delegation extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see jpdl31.Jpdl31Package#getDelegation_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see jpdl31.Jpdl31Package#getDelegation_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':1' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see jpdl31.Jpdl31Package#getDelegation_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link jpdl31.Delegation#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Config Type</b></em>' attribute.
	 * The default value is <code>"field"</code>.
	 * The literals are from the enumeration {@link jpdl31.ConfigTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Type</em>' attribute.
	 * @see jpdl31.ConfigTypeType
	 * @see #isSetConfigType()
	 * @see #unsetConfigType()
	 * @see #setConfigType(ConfigTypeType)
	 * @see jpdl31.Jpdl31Package#getDelegation_ConfigType()
	 * @model default="field" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='config-type'"
	 * @generated
	 */
	ConfigTypeType getConfigType();

	/**
	 * Sets the value of the '{@link jpdl31.Delegation#getConfigType <em>Config Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Type</em>' attribute.
	 * @see jpdl31.ConfigTypeType
	 * @see #isSetConfigType()
	 * @see #unsetConfigType()
	 * @see #getConfigType()
	 * @generated
	 */
	void setConfigType(ConfigTypeType value);

	/**
	 * Unsets the value of the '{@link jpdl31.Delegation#getConfigType <em>Config Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfigType()
	 * @see #getConfigType()
	 * @see #setConfigType(ConfigTypeType)
	 * @generated
	 */
	void unsetConfigType();

	/**
	 * Returns whether the value of the '{@link jpdl31.Delegation#getConfigType <em>Config Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Config Type</em>' attribute is set.
	 * @see #unsetConfigType()
	 * @see #getConfigType()
	 * @see #setConfigType(ConfigTypeType)
	 * @generated
	 */
	boolean isSetConfigType();

} // Delegation

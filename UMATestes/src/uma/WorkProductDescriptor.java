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
 * A representation of the model object '<em><b>Work Product Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Work Product Descriptor represents a Work Product in the context of one specific Activity.  Every breakdown structure can define different relationships of Work Product Descriptors to Task Descriptors and Role Descriptors.  Therefore one Work Product can be represented by many Work Product Descriptors each within the context of an Activity with its own set of relationships.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uma.WorkProductDescriptor#getActivityEntryState <em>Activity Entry State</em>}</li>
 *   <li>{@link uma.WorkProductDescriptor#getActivityExitState <em>Activity Exit State</em>}</li>
 *   <li>{@link uma.WorkProductDescriptor#getWorkProduct <em>Work Product</em>}</li>
 *   <li>{@link uma.WorkProductDescriptor#getImpactedBy <em>Impacted By</em>}</li>
 *   <li>{@link uma.WorkProductDescriptor#getImpacts <em>Impacts</em>}</li>
 *   <li>{@link uma.WorkProductDescriptor#getDeliverableParts <em>Deliverable Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see uma.UmaPackage#getWorkProductDescriptor()
 * @model
 * @generated
 */
public interface WorkProductDescriptor extends Descriptor {
	/**
	 * Returns the value of the '<em><b>Activity Entry State</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Given that an instance of Work Product Descriptor has been created for a specific Activity, then the Activity Entry State attribute specifies the desired state of instances of the referenced Work Product when work on the Activity is initiated (i.e. work on the Activity's Task Descriptors is being initiated that use this Work Product Descriptor as input).  
	 * For some Work Products state is expressed in percentage of completion, compliance to work product checklist, informal state descriptions, etc.  Others have very specific states expressed as enumerations such as [identified, briefly described, outlined, detailed] for use cases.  Other Work Product states relate to some quality measures or lifecycle states such as [reviewed, implemented, tested].
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Entry State</em>' attribute.
	 * @see #setActivityEntryState(String)
	 * @see uma.UmaPackage#getWorkProductDescriptor_ActivityEntryState()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getActivityEntryState();

	/**
	 * Sets the value of the '{@link uma.WorkProductDescriptor#getActivityEntryState <em>Activity Entry State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Entry State</em>' attribute.
	 * @see #getActivityEntryState()
	 * @generated
	 */
	void setActivityEntryState(String value);

	/**
	 * Returns the value of the '<em><b>Activity Exit State</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Given that an instance of Work Product Descriptor has been created for a specific Activity, then the Activity Exist State attribute specifies the desired state of instances of the referenced Work Product when work on the Activity is finished (i.e. work on the Activity's Task Descriptors has finished that have this Work Product Descriptor as output).
	 * For some Work Products state is expressed in percentage of completion, compliance to work product checklist, informal state descriptions, etc.  Others have very specific states expressed as enumerations such as [identified, briefly described, outlined, detailed] for use cases.  Other Work Product states relate to some quality measures or lifecycle states such as [reviewed, implemented, tested].
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Exit State</em>' attribute.
	 * @see #setActivityExitState(String)
	 * @see uma.UmaPackage#getWorkProductDescriptor_ActivityExitState()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getActivityExitState();

	/**
	 * Sets the value of the '{@link uma.WorkProductDescriptor#getActivityExitState <em>Activity Exit State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Exit State</em>' attribute.
	 * @see #getActivityExitState()
	 * @generated
	 */
	void setActivityExitState(String value);

	/**
	 * Returns the value of the '<em><b>Work Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Product</em>' reference.
	 * @see #setWorkProduct(WorkProduct)
	 * @see uma.UmaPackage#getWorkProductDescriptor_WorkProduct()
	 * @model ordered="false"
	 * @generated
	 */
	WorkProduct getWorkProduct();

	/**
	 * Sets the value of the '{@link uma.WorkProductDescriptor#getWorkProduct <em>Work Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Product</em>' reference.
	 * @see #getWorkProduct()
	 * @generated
	 */
	void setWorkProduct(WorkProduct value);

	/**
	 * Returns the value of the '<em><b>Impacted By</b></em>' reference list.
	 * The list contents are of type {@link uma.WorkProductDescriptor}.
	 * It is bidirectional and its opposite is '{@link uma.WorkProductDescriptor#getImpacts <em>Impacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impacted By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impacted By</em>' reference list.
	 * @see uma.UmaPackage#getWorkProductDescriptor_ImpactedBy()
	 * @see uma.WorkProductDescriptor#getImpacts
	 * @model opposite="impacts" ordered="false"
	 * @generated
	 */
	EList<WorkProductDescriptor> getImpactedBy();

	/**
	 * Returns the value of the '<em><b>Impacts</b></em>' reference list.
	 * The list contents are of type {@link uma.WorkProductDescriptor}.
	 * It is bidirectional and its opposite is '{@link uma.WorkProductDescriptor#getImpactedBy <em>Impacted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impacts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impacts</em>' reference list.
	 * @see uma.UmaPackage#getWorkProductDescriptor_Impacts()
	 * @see uma.WorkProductDescriptor#getImpactedBy
	 * @model opposite="impactedBy" ordered="false"
	 * @generated
	 */
	EList<WorkProductDescriptor> getImpacts();

	/**
	 * Returns the value of the '<em><b>Deliverable Parts</b></em>' reference list.
	 * The list contents are of type {@link uma.WorkProductDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deliverable Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deliverable Parts</em>' reference list.
	 * @see uma.UmaPackage#getWorkProductDescriptor_DeliverableParts()
	 * @model ordered="false"
	 * @generated
	 */
	EList<WorkProductDescriptor> getDeliverableParts();

} // WorkProductDescriptor

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jpdl31.TaskType#getGroup <em>Group</em>}</li>
 *   <li>{@link jpdl31.TaskType#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link jpdl31.TaskType#getController <em>Controller</em>}</li>
 *   <li>{@link jpdl31.TaskType#getEvent <em>Event</em>}</li>
 *   <li>{@link jpdl31.TaskType#getTimer <em>Timer</em>}</li>
 *   <li>{@link jpdl31.TaskType#getBlocking <em>Blocking</em>}</li>
 *   <li>{@link jpdl31.TaskType#getDescription <em>Description</em>}</li>
 *   <li>{@link jpdl31.TaskType#getDuedate <em>Duedate</em>}</li>
 *   <li>{@link jpdl31.TaskType#getName <em>Name</em>}</li>
 *   <li>{@link jpdl31.TaskType#getPriority <em>Priority</em>}</li>
 *   <li>{@link jpdl31.TaskType#getSignalling <em>Signalling</em>}</li>
 *   <li>{@link jpdl31.TaskType#getSwimlane <em>Swimlane</em>}</li>
 *   <li>{@link jpdl31.TaskType#getArtefacts <em>Artefacts</em>}</li>
 *   <li>{@link jpdl31.TaskType#getMetricInfo <em>Metric Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see jpdl31.Jpdl31Package#getTaskType()
 * @model extendedMetaData="name='task_._type' kind='elementOnly'"
 * @generated
 */
public interface TaskType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see jpdl31.Jpdl31Package#getTaskType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.AssignmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getTaskType_Assignment()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='assignment' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AssignmentType> getAssignment();

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.Delegation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getTaskType_Controller()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='controller' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Delegation> getController();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.EventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getTaskType_Event()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='event' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EventType> getEvent();

	/**
	 * Returns the value of the '<em><b>Timer</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.TimerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getTaskType_Timer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='timer' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TimerType> getTimer();

	/**
	 * Returns the value of the '<em><b>Blocking</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link jpdl31.BooleanType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocking</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocking</em>' attribute.
	 * @see jpdl31.BooleanType
	 * @see #isSetBlocking()
	 * @see #unsetBlocking()
	 * @see #setBlocking(BooleanType)
	 * @see jpdl31.Jpdl31Package#getTaskType_Blocking()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='blocking'"
	 * @generated
	 */
	BooleanType getBlocking();

	/**
	 * Sets the value of the '{@link jpdl31.TaskType#getBlocking <em>Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocking</em>' attribute.
	 * @see jpdl31.BooleanType
	 * @see #isSetBlocking()
	 * @see #unsetBlocking()
	 * @see #getBlocking()
	 * @generated
	 */
	void setBlocking(BooleanType value);

	/**
	 * Unsets the value of the '{@link jpdl31.TaskType#getBlocking <em>Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlocking()
	 * @see #getBlocking()
	 * @see #setBlocking(BooleanType)
	 * @generated
	 */
	void unsetBlocking();

	/**
	 * Returns whether the value of the '{@link jpdl31.TaskType#getBlocking <em>Blocking</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Blocking</em>' attribute is set.
	 * @see #unsetBlocking()
	 * @see #getBlocking()
	 * @see #setBlocking(BooleanType)
	 * @generated
	 */
	boolean isSetBlocking();

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
	 * @see jpdl31.Jpdl31Package#getTaskType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link jpdl31.TaskType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Duedate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duedate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duedate</em>' attribute.
	 * @see #setDuedate(String)
	 * @see jpdl31.Jpdl31Package#getTaskType_Duedate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='duedate'"
	 * @generated
	 */
	String getDuedate();

	/**
	 * Sets the value of the '{@link jpdl31.TaskType#getDuedate <em>Duedate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duedate</em>' attribute.
	 * @see #getDuedate()
	 * @generated
	 */
	void setDuedate(String value);

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
	 * @see jpdl31.Jpdl31Package#getTaskType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link jpdl31.TaskType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"normal"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #setPriority(Object)
	 * @see jpdl31.Jpdl31Package#getTaskType_Priority()
	 * @model default="normal" unsettable="true" dataType="jpdl31.PriorityType"
	 *        extendedMetaData="kind='attribute' name='priority'"
	 * @generated
	 */
	Object getPriority();

	/**
	 * Sets the value of the '{@link jpdl31.TaskType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Object value);

	/**
	 * Unsets the value of the '{@link jpdl31.TaskType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriority()
	 * @see #getPriority()
	 * @see #setPriority(Object)
	 * @generated
	 */
	void unsetPriority();

	/**
	 * Returns whether the value of the '{@link jpdl31.TaskType#getPriority <em>Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priority</em>' attribute is set.
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @see #setPriority(Object)
	 * @generated
	 */
	boolean isSetPriority();

	/**
	 * Returns the value of the '<em><b>Signalling</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link jpdl31.BooleanType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signalling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalling</em>' attribute.
	 * @see jpdl31.BooleanType
	 * @see #isSetSignalling()
	 * @see #unsetSignalling()
	 * @see #setSignalling(BooleanType)
	 * @see jpdl31.Jpdl31Package#getTaskType_Signalling()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='signalling'"
	 * @generated
	 */
	BooleanType getSignalling();

	/**
	 * Sets the value of the '{@link jpdl31.TaskType#getSignalling <em>Signalling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalling</em>' attribute.
	 * @see jpdl31.BooleanType
	 * @see #isSetSignalling()
	 * @see #unsetSignalling()
	 * @see #getSignalling()
	 * @generated
	 */
	void setSignalling(BooleanType value);

	/**
	 * Unsets the value of the '{@link jpdl31.TaskType#getSignalling <em>Signalling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignalling()
	 * @see #getSignalling()
	 * @see #setSignalling(BooleanType)
	 * @generated
	 */
	void unsetSignalling();

	/**
	 * Returns whether the value of the '{@link jpdl31.TaskType#getSignalling <em>Signalling</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Signalling</em>' attribute is set.
	 * @see #unsetSignalling()
	 * @see #getSignalling()
	 * @see #setSignalling(BooleanType)
	 * @generated
	 */
	boolean isSetSignalling();

	/**
	 * Returns the value of the '<em><b>Swimlane</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swimlane</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swimlane</em>' attribute.
	 * @see #setSwimlane(String)
	 * @see jpdl31.Jpdl31Package#getTaskType_Swimlane()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='swimlane'"
	 * @generated
	 */
	String getSwimlane();

	/**
	 * Sets the value of the '{@link jpdl31.TaskType#getSwimlane <em>Swimlane</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swimlane</em>' attribute.
	 * @see #getSwimlane()
	 * @generated
	 */
	void setSwimlane(String value);

	/**
	 * Returns the value of the '<em><b>Artefacts</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.Artefact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artefacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artefacts</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getTaskType_Artefacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artefact> getArtefacts();

	/**
	 * Returns the value of the '<em><b>Metric Info</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.MetricInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Info</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Info</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getTaskType_MetricInfo()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetricInfo> getMetricInfo();

} // TaskType

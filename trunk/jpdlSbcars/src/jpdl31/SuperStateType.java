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
 * A representation of the model object '<em><b>Super State Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jpdl31.SuperStateType#getGroup <em>Group</em>}</li>
 *   <li>{@link jpdl31.SuperStateType#getNode <em>Node</em>}</li>
 *   <li>{@link jpdl31.SuperStateType#getState <em>State</em>}</li>
 *   <li>{@link jpdl31.SuperStateType#getTaskNode <em>Task Node</em>}</li>
 *   <li>{@link jpdl31.SuperStateType#getSuperState <em>Super State</em>}</li>
 *   <li>{@link jpdl31.SuperStateType#getProcessState <em>Process State</em>}</li>
 *   <li>{@link jpdl31.SuperStateType#getFork <em>Fork</em>}</li>
 *   <li>{@link jpdl31.SuperStateType#getJoin <em>Join</em>}</li>
 *   <li>{@link jpdl31.SuperStateType#getDecision <em>Decision</em>}</li>
 *   <li>{@link jpdl31.SuperStateType#getEndState <em>End State</em>}</li>
 *   <li>{@link jpdl31.SuperStateType#getEvent <em>Event</em>}</li>
 *   <li>{@link jpdl31.SuperStateType#getExceptionHandler <em>Exception Handler</em>}</li>
 *   <li>{@link jpdl31.SuperStateType#getTimer <em>Timer</em>}</li>
 *   <li>{@link jpdl31.SuperStateType#getTransition <em>Transition</em>}</li>
 *   <li>{@link jpdl31.SuperStateType#getAsync <em>Async</em>}</li>
 *   <li>{@link jpdl31.SuperStateType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see jpdl31.Jpdl31Package#getSuperStateType()
 * @model extendedMetaData="name='super-state_._type' kind='elementOnly'"
 * @generated
 */
public interface SuperStateType extends EObject {
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
	 * @see jpdl31.Jpdl31Package#getSuperStateType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.NodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getSuperStateType_Node()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='node' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<NodeType> getNode();

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.StateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getSuperStateType_State()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='state' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<StateType> getState();

	/**
	 * Returns the value of the '<em><b>Task Node</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.TaskNodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Node</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getSuperStateType_TaskNode()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='task-node' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TaskNodeType> getTaskNode();

	/**
	 * Returns the value of the '<em><b>Super State</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.SuperStateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super State</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getSuperStateType_SuperState()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='super-state' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SuperStateType> getSuperState();

	/**
	 * Returns the value of the '<em><b>Process State</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.ProcessStateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process State</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getSuperStateType_ProcessState()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='process-state' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ProcessStateType> getProcessState();

	/**
	 * Returns the value of the '<em><b>Fork</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.ForkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fork</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fork</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getSuperStateType_Fork()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fork' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ForkType> getFork();

	/**
	 * Returns the value of the '<em><b>Join</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.JoinType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getSuperStateType_Join()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='join' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<JoinType> getJoin();

	/**
	 * Returns the value of the '<em><b>Decision</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.DecisionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getSuperStateType_Decision()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='decision' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DecisionType> getDecision();

	/**
	 * Returns the value of the '<em><b>End State</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.EndStateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End State</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getSuperStateType_EndState()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='end-state' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EndStateType> getEndState();

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
	 * @see jpdl31.Jpdl31Package#getSuperStateType_Event()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='event' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EventType> getEvent();

	/**
	 * Returns the value of the '<em><b>Exception Handler</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.ExceptionHandlerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Handler</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Handler</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getSuperStateType_ExceptionHandler()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exception-handler' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ExceptionHandlerType> getExceptionHandler();

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
	 * @see jpdl31.Jpdl31Package#getSuperStateType_Timer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='timer' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TimerType> getTimer();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link jpdl31.TransitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see jpdl31.Jpdl31Package#getSuperStateType_Transition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transition' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TransitionType> getTransition();

	/**
	 * Returns the value of the '<em><b>Async</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Async</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Async</em>' attribute.
	 * @see #isSetAsync()
	 * @see #unsetAsync()
	 * @see #setAsync(String)
	 * @see jpdl31.Jpdl31Package#getSuperStateType_Async()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='async'"
	 * @generated
	 */
	String getAsync();

	/**
	 * Sets the value of the '{@link jpdl31.SuperStateType#getAsync <em>Async</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Async</em>' attribute.
	 * @see #isSetAsync()
	 * @see #unsetAsync()
	 * @see #getAsync()
	 * @generated
	 */
	void setAsync(String value);

	/**
	 * Unsets the value of the '{@link jpdl31.SuperStateType#getAsync <em>Async</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAsync()
	 * @see #getAsync()
	 * @see #setAsync(String)
	 * @generated
	 */
	void unsetAsync();

	/**
	 * Returns whether the value of the '{@link jpdl31.SuperStateType#getAsync <em>Async</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Async</em>' attribute is set.
	 * @see #unsetAsync()
	 * @see #getAsync()
	 * @see #setAsync(String)
	 * @generated
	 */
	boolean isSetAsync();

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
	 * @see jpdl31.Jpdl31Package#getSuperStateType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link jpdl31.SuperStateType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SuperStateType

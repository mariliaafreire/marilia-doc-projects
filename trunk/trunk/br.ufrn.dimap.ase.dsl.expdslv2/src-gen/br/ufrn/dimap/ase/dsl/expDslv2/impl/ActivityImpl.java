/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2.impl;

import br.ufrn.dimap.ase.dsl.expDslv2.Activity;
import br.ufrn.dimap.ase.dsl.expDslv2.Artefact;
import br.ufrn.dimap.ase.dsl.expDslv2.CollectedData;
import br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package;
import br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire;
import br.ufrn.dimap.ase.dsl.expDslv2.Role;
import br.ufrn.dimap.ase.dsl.expDslv2.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ActivityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ActivityImpl#getNext <em>Next</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ActivityImpl#getRole <em>Role</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ActivityImpl#getCollectData <em>Collect Data</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ActivityImpl#getArtefacts <em>Artefacts</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ActivityImpl#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ActivityImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends MinimalEObjectImpl.Container implements Activity
{
  /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

  /**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
  protected EList<Activity> next;

  /**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
  protected EList<Role> role;

  /**
	 * The cached value of the '{@link #getCollectData() <em>Collect Data</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCollectData()
	 * @generated
	 * @ordered
	 */
  protected EList<CollectedData> collectData;

  /**
	 * The cached value of the '{@link #getArtefacts() <em>Artefacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getArtefacts()
	 * @generated
	 * @ordered
	 */
  protected EList<Artefact> artefacts;

  /**
	 * The cached value of the '{@link #getQuestionnaire() <em>Questionnaire</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getQuestionnaire()
	 * @generated
	 * @ordered
	 */
  protected EList<Questionnaire> questionnaire;

  /**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
  protected EList<Task> tasks;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ActivityImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ExpDslv2Package.Literals.ACTIVITY;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.ACTIVITY__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDescription()
  {
		return description;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDescription(String newDescription)
  {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.ACTIVITY__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Activity> getNext()
  {
		if (next == null) {
			next = new EObjectResolvingEList<Activity>(Activity.class, this, ExpDslv2Package.ACTIVITY__NEXT);
		}
		return next;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Role> getRole()
  {
		if (role == null) {
			role = new EObjectContainmentEList<Role>(Role.class, this, ExpDslv2Package.ACTIVITY__ROLE);
		}
		return role;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<CollectedData> getCollectData()
  {
		if (collectData == null) {
			collectData = new EObjectResolvingEList<CollectedData>(CollectedData.class, this, ExpDslv2Package.ACTIVITY__COLLECT_DATA);
		}
		return collectData;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Artefact> getArtefacts()
  {
		if (artefacts == null) {
			artefacts = new EObjectContainmentEList<Artefact>(Artefact.class, this, ExpDslv2Package.ACTIVITY__ARTEFACTS);
		}
		return artefacts;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Questionnaire> getQuestionnaire()
  {
		if (questionnaire == null) {
			questionnaire = new EObjectResolvingEList<Questionnaire>(Questionnaire.class, this, ExpDslv2Package.ACTIVITY__QUESTIONNAIRE);
		}
		return questionnaire;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Task> getTasks()
  {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, ExpDslv2Package.ACTIVITY__TASKS);
		}
		return tasks;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ExpDslv2Package.ACTIVITY__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case ExpDslv2Package.ACTIVITY__ARTEFACTS:
				return ((InternalEList<?>)getArtefacts()).basicRemove(otherEnd, msgs);
			case ExpDslv2Package.ACTIVITY__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ExpDslv2Package.ACTIVITY__NAME:
				return getName();
			case ExpDslv2Package.ACTIVITY__DESCRIPTION:
				return getDescription();
			case ExpDslv2Package.ACTIVITY__NEXT:
				return getNext();
			case ExpDslv2Package.ACTIVITY__ROLE:
				return getRole();
			case ExpDslv2Package.ACTIVITY__COLLECT_DATA:
				return getCollectData();
			case ExpDslv2Package.ACTIVITY__ARTEFACTS:
				return getArtefacts();
			case ExpDslv2Package.ACTIVITY__QUESTIONNAIRE:
				return getQuestionnaire();
			case ExpDslv2Package.ACTIVITY__TASKS:
				return getTasks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ExpDslv2Package.ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case ExpDslv2Package.ACTIVITY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ExpDslv2Package.ACTIVITY__NEXT:
				getNext().clear();
				getNext().addAll((Collection<? extends Activity>)newValue);
				return;
			case ExpDslv2Package.ACTIVITY__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends Role>)newValue);
				return;
			case ExpDslv2Package.ACTIVITY__COLLECT_DATA:
				getCollectData().clear();
				getCollectData().addAll((Collection<? extends CollectedData>)newValue);
				return;
			case ExpDslv2Package.ACTIVITY__ARTEFACTS:
				getArtefacts().clear();
				getArtefacts().addAll((Collection<? extends Artefact>)newValue);
				return;
			case ExpDslv2Package.ACTIVITY__QUESTIONNAIRE:
				getQuestionnaire().clear();
				getQuestionnaire().addAll((Collection<? extends Questionnaire>)newValue);
				return;
			case ExpDslv2Package.ACTIVITY__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case ExpDslv2Package.ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExpDslv2Package.ACTIVITY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ExpDslv2Package.ACTIVITY__NEXT:
				getNext().clear();
				return;
			case ExpDslv2Package.ACTIVITY__ROLE:
				getRole().clear();
				return;
			case ExpDslv2Package.ACTIVITY__COLLECT_DATA:
				getCollectData().clear();
				return;
			case ExpDslv2Package.ACTIVITY__ARTEFACTS:
				getArtefacts().clear();
				return;
			case ExpDslv2Package.ACTIVITY__QUESTIONNAIRE:
				getQuestionnaire().clear();
				return;
			case ExpDslv2Package.ACTIVITY__TASKS:
				getTasks().clear();
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case ExpDslv2Package.ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExpDslv2Package.ACTIVITY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ExpDslv2Package.ACTIVITY__NEXT:
				return next != null && !next.isEmpty();
			case ExpDslv2Package.ACTIVITY__ROLE:
				return role != null && !role.isEmpty();
			case ExpDslv2Package.ACTIVITY__COLLECT_DATA:
				return collectData != null && !collectData.isEmpty();
			case ExpDslv2Package.ACTIVITY__ARTEFACTS:
				return artefacts != null && !artefacts.isEmpty();
			case ExpDslv2Package.ACTIVITY__QUESTIONNAIRE:
				return questionnaire != null && !questionnaire.isEmpty();
			case ExpDslv2Package.ACTIVITY__TASKS:
				return tasks != null && !tasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl

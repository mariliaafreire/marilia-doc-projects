/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31.impl;

import java.util.Collection;

import jpdl31.Goal;
import jpdl31.Hyphoteses;
import jpdl31.HypothesisType;
import jpdl31.Jpdl31Package;
import jpdl31.Subhypotheses;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hyphoteses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jpdl31.impl.HyphotesesImpl#getFormalizes <em>Formalizes</em>}</li>
 *   <li>{@link jpdl31.impl.HyphotesesImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link jpdl31.impl.HyphotesesImpl#getFromGoal <em>From Goal</em>}</li>
 *   <li>{@link jpdl31.impl.HyphotesesImpl#getType <em>Type</em>}</li>
 *   <li>{@link jpdl31.impl.HyphotesesImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HyphotesesImpl extends EObjectImpl implements Hyphoteses {
	/**
	 * The cached value of the '{@link #getFormalizes() <em>Formalizes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalizes()
	 * @generated
	 * @ordered
	 */
	protected EList<Subhypotheses> formalizes;

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
	 * The cached value of the '{@link #getFromGoal() <em>From Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromGoal()
	 * @generated
	 * @ordered
	 */
	protected Goal fromGoal;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final HypothesisType TYPE_EDEFAULT = HypothesisType.NULL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected HypothesisType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HyphotesesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jpdl31Package.Literals.HYPHOTESES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subhypotheses> getFormalizes() {
		if (formalizes == null) {
			formalizes = new EObjectContainmentEList<Subhypotheses>(Subhypotheses.class, this, Jpdl31Package.HYPHOTESES__FORMALIZES);
		}
		return formalizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.HYPHOTESES__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal getFromGoal() {
		if (fromGoal != null && fromGoal.eIsProxy()) {
			InternalEObject oldFromGoal = (InternalEObject)fromGoal;
			fromGoal = (Goal)eResolveProxy(oldFromGoal);
			if (fromGoal != oldFromGoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Jpdl31Package.HYPHOTESES__FROM_GOAL, oldFromGoal, fromGoal));
			}
		}
		return fromGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal basicGetFromGoal() {
		return fromGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromGoal(Goal newFromGoal) {
		Goal oldFromGoal = fromGoal;
		fromGoal = newFromGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.HYPHOTESES__FROM_GOAL, oldFromGoal, fromGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypothesisType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(HypothesisType newType) {
		HypothesisType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.HYPHOTESES__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.HYPHOTESES__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jpdl31Package.HYPHOTESES__FORMALIZES:
				return ((InternalEList<?>)getFormalizes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Jpdl31Package.HYPHOTESES__FORMALIZES:
				return getFormalizes();
			case Jpdl31Package.HYPHOTESES__DESCRIPTION:
				return getDescription();
			case Jpdl31Package.HYPHOTESES__FROM_GOAL:
				if (resolve) return getFromGoal();
				return basicGetFromGoal();
			case Jpdl31Package.HYPHOTESES__TYPE:
				return getType();
			case Jpdl31Package.HYPHOTESES__ID:
				return getId();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Jpdl31Package.HYPHOTESES__FORMALIZES:
				getFormalizes().clear();
				getFormalizes().addAll((Collection<? extends Subhypotheses>)newValue);
				return;
			case Jpdl31Package.HYPHOTESES__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Jpdl31Package.HYPHOTESES__FROM_GOAL:
				setFromGoal((Goal)newValue);
				return;
			case Jpdl31Package.HYPHOTESES__TYPE:
				setType((HypothesisType)newValue);
				return;
			case Jpdl31Package.HYPHOTESES__ID:
				setId((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case Jpdl31Package.HYPHOTESES__FORMALIZES:
				getFormalizes().clear();
				return;
			case Jpdl31Package.HYPHOTESES__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Jpdl31Package.HYPHOTESES__FROM_GOAL:
				setFromGoal((Goal)null);
				return;
			case Jpdl31Package.HYPHOTESES__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Jpdl31Package.HYPHOTESES__ID:
				setId(ID_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Jpdl31Package.HYPHOTESES__FORMALIZES:
				return formalizes != null && !formalizes.isEmpty();
			case Jpdl31Package.HYPHOTESES__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Jpdl31Package.HYPHOTESES__FROM_GOAL:
				return fromGoal != null;
			case Jpdl31Package.HYPHOTESES__TYPE:
				return type != TYPE_EDEFAULT;
			case Jpdl31Package.HYPHOTESES__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", type: ");
		result.append(type);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //HyphotesesImpl

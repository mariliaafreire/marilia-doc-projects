/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uma.Role;
import uma.RoleDescriptor;
import uma.UmaPackage;
import uma.WorkProductDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uma.impl.RoleDescriptorImpl#getRole <em>Role</em>}</li>
 *   <li>{@link uma.impl.RoleDescriptorImpl#getModifies <em>Modifies</em>}</li>
 *   <li>{@link uma.impl.RoleDescriptorImpl#getResponsibleFor <em>Responsible For</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleDescriptorImpl extends DescriptorImpl implements RoleDescriptor {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * The cached value of the '{@link #getResponsibleFor() <em>Responsible For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleFor()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProductDescriptor> responsibleFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.ROLE_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Role)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmaPackage.ROLE_DESCRIPTOR__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.ROLE_DESCRIPTOR__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProductDescriptor> getModifies() {
		// TODO: implement this method to return the 'Modifies' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProductDescriptor> getResponsibleFor() {
		if (responsibleFor == null) {
			responsibleFor = new EObjectResolvingEList<WorkProductDescriptor>(WorkProductDescriptor.class, this, UmaPackage.ROLE_DESCRIPTOR__RESPONSIBLE_FOR);
		}
		return responsibleFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.ROLE_DESCRIPTOR__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case UmaPackage.ROLE_DESCRIPTOR__MODIFIES:
				return getModifies();
			case UmaPackage.ROLE_DESCRIPTOR__RESPONSIBLE_FOR:
				return getResponsibleFor();
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
			case UmaPackage.ROLE_DESCRIPTOR__ROLE:
				setRole((Role)newValue);
				return;
			case UmaPackage.ROLE_DESCRIPTOR__MODIFIES:
				getModifies().clear();
				getModifies().addAll((Collection<? extends WorkProductDescriptor>)newValue);
				return;
			case UmaPackage.ROLE_DESCRIPTOR__RESPONSIBLE_FOR:
				getResponsibleFor().clear();
				getResponsibleFor().addAll((Collection<? extends WorkProductDescriptor>)newValue);
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
			case UmaPackage.ROLE_DESCRIPTOR__ROLE:
				setRole((Role)null);
				return;
			case UmaPackage.ROLE_DESCRIPTOR__MODIFIES:
				getModifies().clear();
				return;
			case UmaPackage.ROLE_DESCRIPTOR__RESPONSIBLE_FOR:
				getResponsibleFor().clear();
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
			case UmaPackage.ROLE_DESCRIPTOR__ROLE:
				return role != null;
			case UmaPackage.ROLE_DESCRIPTOR__MODIFIES:
				return !getModifies().isEmpty();
			case UmaPackage.ROLE_DESCRIPTOR__RESPONSIBLE_FOR:
				return responsibleFor != null && !responsibleFor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoleDescriptorImpl

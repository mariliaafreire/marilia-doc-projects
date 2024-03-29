/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uma.Domain;
import uma.UmaPackage;
import uma.WorkProduct;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uma.impl.DomainImpl#getWorkProducts <em>Work Products</em>}</li>
 *   <li>{@link uma.impl.DomainImpl#getSubdomains <em>Subdomains</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainImpl extends ContentCategoryImpl implements Domain {
	/**
	 * The cached value of the '{@link #getWorkProducts() <em>Work Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProduct> workProducts;

	/**
	 * The cached value of the '{@link #getSubdomains() <em>Subdomains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdomains()
	 * @generated
	 * @ordered
	 */
	protected EList<Domain> subdomains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProduct> getWorkProducts() {
		if (workProducts == null) {
			workProducts = new EObjectResolvingEList<WorkProduct>(WorkProduct.class, this, UmaPackage.DOMAIN__WORK_PRODUCTS);
		}
		return workProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Domain> getSubdomains() {
		if (subdomains == null) {
			subdomains = new EObjectContainmentEList<Domain>(Domain.class, this, UmaPackage.DOMAIN__SUBDOMAINS);
		}
		return subdomains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmaPackage.DOMAIN__SUBDOMAINS:
				return ((InternalEList<?>)getSubdomains()).basicRemove(otherEnd, msgs);
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
			case UmaPackage.DOMAIN__WORK_PRODUCTS:
				return getWorkProducts();
			case UmaPackage.DOMAIN__SUBDOMAINS:
				return getSubdomains();
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
			case UmaPackage.DOMAIN__WORK_PRODUCTS:
				getWorkProducts().clear();
				getWorkProducts().addAll((Collection<? extends WorkProduct>)newValue);
				return;
			case UmaPackage.DOMAIN__SUBDOMAINS:
				getSubdomains().clear();
				getSubdomains().addAll((Collection<? extends Domain>)newValue);
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
			case UmaPackage.DOMAIN__WORK_PRODUCTS:
				getWorkProducts().clear();
				return;
			case UmaPackage.DOMAIN__SUBDOMAINS:
				getSubdomains().clear();
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
			case UmaPackage.DOMAIN__WORK_PRODUCTS:
				return workProducts != null && !workProducts.isEmpty();
			case UmaPackage.DOMAIN__SUBDOMAINS:
				return subdomains != null && !subdomains.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl

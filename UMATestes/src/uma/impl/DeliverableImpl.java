/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uma.Deliverable;
import uma.UmaPackage;
import uma.WorkProduct;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deliverable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uma.impl.DeliverableImpl#getDeliveredWorkProducts <em>Delivered Work Products</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeliverableImpl extends WorkProductImpl implements Deliverable {
	/**
	 * The cached value of the '{@link #getDeliveredWorkProducts() <em>Delivered Work Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveredWorkProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProduct> deliveredWorkProducts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliverableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.DELIVERABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProduct> getDeliveredWorkProducts() {
		if (deliveredWorkProducts == null) {
			deliveredWorkProducts = new EObjectResolvingEList<WorkProduct>(WorkProduct.class, this, UmaPackage.DELIVERABLE__DELIVERED_WORK_PRODUCTS);
		}
		return deliveredWorkProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.DELIVERABLE__DELIVERED_WORK_PRODUCTS:
				return getDeliveredWorkProducts();
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
			case UmaPackage.DELIVERABLE__DELIVERED_WORK_PRODUCTS:
				getDeliveredWorkProducts().clear();
				getDeliveredWorkProducts().addAll((Collection<? extends WorkProduct>)newValue);
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
			case UmaPackage.DELIVERABLE__DELIVERED_WORK_PRODUCTS:
				getDeliveredWorkProducts().clear();
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
			case UmaPackage.DELIVERABLE__DELIVERED_WORK_PRODUCTS:
				return deliveredWorkProducts != null && !deliveredWorkProducts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeliverableImpl

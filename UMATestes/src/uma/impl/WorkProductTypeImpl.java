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

import uma.UmaPackage;
import uma.WorkProduct;
import uma.WorkProductType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Product Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uma.impl.WorkProductTypeImpl#getWorkProducts <em>Work Products</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkProductTypeImpl extends ContentCategoryImpl implements WorkProductType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkProductTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.WORK_PRODUCT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProduct> getWorkProducts() {
		if (workProducts == null) {
			workProducts = new EObjectResolvingEList<WorkProduct>(WorkProduct.class, this, UmaPackage.WORK_PRODUCT_TYPE__WORK_PRODUCTS);
		}
		return workProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.WORK_PRODUCT_TYPE__WORK_PRODUCTS:
				return getWorkProducts();
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
			case UmaPackage.WORK_PRODUCT_TYPE__WORK_PRODUCTS:
				getWorkProducts().clear();
				getWorkProducts().addAll((Collection<? extends WorkProduct>)newValue);
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
			case UmaPackage.WORK_PRODUCT_TYPE__WORK_PRODUCTS:
				getWorkProducts().clear();
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
			case UmaPackage.WORK_PRODUCT_TYPE__WORK_PRODUCTS:
				return workProducts != null && !workProducts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkProductTypeImpl

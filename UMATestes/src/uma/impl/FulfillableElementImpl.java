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

import uma.FulfillableElement;
import uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fulfillable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uma.impl.FulfillableElementImpl#getFulfills <em>Fulfills</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FulfillableElementImpl extends DescribableElementImpl implements FulfillableElement {
	/**
	 * The cached value of the '{@link #getFulfills() <em>Fulfills</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfills()
	 * @generated
	 * @ordered
	 */
	protected EList<FulfillableElement> fulfills;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FulfillableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.FULFILLABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FulfillableElement> getFulfills() {
		if (fulfills == null) {
			fulfills = new EObjectResolvingEList<FulfillableElement>(FulfillableElement.class, this, UmaPackage.FULFILLABLE_ELEMENT__FULFILLS);
		}
		return fulfills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.FULFILLABLE_ELEMENT__FULFILLS:
				return getFulfills();
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
			case UmaPackage.FULFILLABLE_ELEMENT__FULFILLS:
				getFulfills().clear();
				getFulfills().addAll((Collection<? extends FulfillableElement>)newValue);
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
			case UmaPackage.FULFILLABLE_ELEMENT__FULFILLS:
				getFulfills().clear();
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
			case UmaPackage.FULFILLABLE_ELEMENT__FULFILLS:
				return fulfills != null && !fulfills.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FulfillableElementImpl

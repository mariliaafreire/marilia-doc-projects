/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uma.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uma.UmaPackage;
import uma.WorkBreakdownElement;
import uma.WorkOrder;
import uma.WorkOrderType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uma.impl.WorkOrderImpl#getLinkType <em>Link Type</em>}</li>
 *   <li>{@link uma.impl.WorkOrderImpl#getPred <em>Pred</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkOrderImpl extends ProcessElementImpl implements WorkOrder {
	/**
	 * The default value of the '{@link #getLinkType() <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkType()
	 * @generated
	 * @ordered
	 */
	protected static final WorkOrderType LINK_TYPE_EDEFAULT = WorkOrderType.FINISH_TO_START;

	/**
	 * The cached value of the '{@link #getLinkType() <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkType()
	 * @generated
	 * @ordered
	 */
	protected WorkOrderType linkType = LINK_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPred() <em>Pred</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPred()
	 * @generated
	 * @ordered
	 */
	protected WorkBreakdownElement pred;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.WORK_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkOrderType getLinkType() {
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkType(WorkOrderType newLinkType) {
		WorkOrderType oldLinkType = linkType;
		linkType = newLinkType == null ? LINK_TYPE_EDEFAULT : newLinkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.WORK_ORDER__LINK_TYPE, oldLinkType, linkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkBreakdownElement getPred() {
		if (pred != null && pred.eIsProxy()) {
			InternalEObject oldPred = (InternalEObject)pred;
			pred = (WorkBreakdownElement)eResolveProxy(oldPred);
			if (pred != oldPred) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmaPackage.WORK_ORDER__PRED, oldPred, pred));
			}
		}
		return pred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkBreakdownElement basicGetPred() {
		return pred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPred(WorkBreakdownElement newPred) {
		WorkBreakdownElement oldPred = pred;
		pred = newPred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.WORK_ORDER__PRED, oldPred, pred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.WORK_ORDER__LINK_TYPE:
				return getLinkType();
			case UmaPackage.WORK_ORDER__PRED:
				if (resolve) return getPred();
				return basicGetPred();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UmaPackage.WORK_ORDER__LINK_TYPE:
				setLinkType((WorkOrderType)newValue);
				return;
			case UmaPackage.WORK_ORDER__PRED:
				setPred((WorkBreakdownElement)newValue);
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
			case UmaPackage.WORK_ORDER__LINK_TYPE:
				setLinkType(LINK_TYPE_EDEFAULT);
				return;
			case UmaPackage.WORK_ORDER__PRED:
				setPred((WorkBreakdownElement)null);
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
			case UmaPackage.WORK_ORDER__LINK_TYPE:
				return linkType != LINK_TYPE_EDEFAULT;
			case UmaPackage.WORK_ORDER__PRED:
				return pred != null;
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
		result.append(" (linkType: ");
		result.append(linkType);
		result.append(')');
		return result.toString();
	}

} //WorkOrderImpl

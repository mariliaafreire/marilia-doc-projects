/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31.impl;

import jpdl31.DependentVariable;
import jpdl31.Jpdl31Package;
import jpdl31.Level;
import jpdl31.RelationOperator;
import jpdl31.Subhypotheses;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subhypotheses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jpdl31.impl.SubhypothesesImpl#getRelationOp <em>Relation Op</em>}</li>
 *   <li>{@link jpdl31.impl.SubhypothesesImpl#getTreatment <em>Treatment</em>}</li>
 *   <li>{@link jpdl31.impl.SubhypothesesImpl#getDependentVariable <em>Dependent Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubhypothesesImpl extends EObjectImpl implements Subhypotheses {
	/**
	 * The default value of the '{@link #getRelationOp() <em>Relation Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationOp()
	 * @generated
	 * @ordered
	 */
	protected static final RelationOperator RELATION_OP_EDEFAULT = RelationOperator.EQUAL;

	/**
	 * The cached value of the '{@link #getRelationOp() <em>Relation Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationOp()
	 * @generated
	 * @ordered
	 */
	protected RelationOperator relationOp = RELATION_OP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTreatment() <em>Treatment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatment()
	 * @generated
	 * @ordered
	 */
	protected Level treatment;

	/**
	 * The cached value of the '{@link #getDependentVariable() <em>Dependent Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentVariable()
	 * @generated
	 * @ordered
	 */
	protected DependentVariable dependentVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubhypothesesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jpdl31Package.Literals.SUBHYPOTHESES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationOperator getRelationOp() {
		return relationOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationOp(RelationOperator newRelationOp) {
		RelationOperator oldRelationOp = relationOp;
		relationOp = newRelationOp == null ? RELATION_OP_EDEFAULT : newRelationOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.SUBHYPOTHESES__RELATION_OP, oldRelationOp, relationOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level getTreatment() {
		if (treatment != null && treatment.eIsProxy()) {
			InternalEObject oldTreatment = (InternalEObject)treatment;
			treatment = (Level)eResolveProxy(oldTreatment);
			if (treatment != oldTreatment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Jpdl31Package.SUBHYPOTHESES__TREATMENT, oldTreatment, treatment));
			}
		}
		return treatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level basicGetTreatment() {
		return treatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreatment(Level newTreatment) {
		Level oldTreatment = treatment;
		treatment = newTreatment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.SUBHYPOTHESES__TREATMENT, oldTreatment, treatment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependentVariable getDependentVariable() {
		if (dependentVariable != null && dependentVariable.eIsProxy()) {
			InternalEObject oldDependentVariable = (InternalEObject)dependentVariable;
			dependentVariable = (DependentVariable)eResolveProxy(oldDependentVariable);
			if (dependentVariable != oldDependentVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Jpdl31Package.SUBHYPOTHESES__DEPENDENT_VARIABLE, oldDependentVariable, dependentVariable));
			}
		}
		return dependentVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependentVariable basicGetDependentVariable() {
		return dependentVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependentVariable(DependentVariable newDependentVariable) {
		DependentVariable oldDependentVariable = dependentVariable;
		dependentVariable = newDependentVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.SUBHYPOTHESES__DEPENDENT_VARIABLE, oldDependentVariable, dependentVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Jpdl31Package.SUBHYPOTHESES__RELATION_OP:
				return getRelationOp();
			case Jpdl31Package.SUBHYPOTHESES__TREATMENT:
				if (resolve) return getTreatment();
				return basicGetTreatment();
			case Jpdl31Package.SUBHYPOTHESES__DEPENDENT_VARIABLE:
				if (resolve) return getDependentVariable();
				return basicGetDependentVariable();
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
			case Jpdl31Package.SUBHYPOTHESES__RELATION_OP:
				setRelationOp((RelationOperator)newValue);
				return;
			case Jpdl31Package.SUBHYPOTHESES__TREATMENT:
				setTreatment((Level)newValue);
				return;
			case Jpdl31Package.SUBHYPOTHESES__DEPENDENT_VARIABLE:
				setDependentVariable((DependentVariable)newValue);
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
			case Jpdl31Package.SUBHYPOTHESES__RELATION_OP:
				setRelationOp(RELATION_OP_EDEFAULT);
				return;
			case Jpdl31Package.SUBHYPOTHESES__TREATMENT:
				setTreatment((Level)null);
				return;
			case Jpdl31Package.SUBHYPOTHESES__DEPENDENT_VARIABLE:
				setDependentVariable((DependentVariable)null);
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
			case Jpdl31Package.SUBHYPOTHESES__RELATION_OP:
				return relationOp != RELATION_OP_EDEFAULT;
			case Jpdl31Package.SUBHYPOTHESES__TREATMENT:
				return treatment != null;
			case Jpdl31Package.SUBHYPOTHESES__DEPENDENT_VARIABLE:
				return dependentVariable != null;
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
		result.append(" (relationOp: ");
		result.append(relationOp);
		result.append(')');
		return result.toString();
	}

} //SubhypothesesImpl

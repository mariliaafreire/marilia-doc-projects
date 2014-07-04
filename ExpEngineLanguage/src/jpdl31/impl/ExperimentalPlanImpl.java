/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31.impl;

import java.util.Collection;

import jpdl31.Design;
import jpdl31.ExperimentalPlan;
import jpdl31.Goal;
import jpdl31.Hyphotesis;
import jpdl31.Hyphoteses;
import jpdl31.Jpdl31Package;

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
 * An implementation of the model object '<em><b>Experimental Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jpdl31.impl.ExperimentalPlanImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link jpdl31.impl.ExperimentalPlanImpl#getHypothesis <em>Hypothesis</em>}</li>
 *   <li>{@link jpdl31.impl.ExperimentalPlanImpl#getDesign <em>Design</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentalPlanImpl extends EObjectImpl implements ExperimentalPlan {
	/**
	 * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goals;

	/**
	 * The cached value of the '{@link #getHypothesis() <em>Hypothesis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypothesis()
	 * @generated
	 * @ordered
	 */
	protected EList<Hyphotesis> hypothesis;

	/**
	 * The cached value of the '{@link #getDesign() <em>Design</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign()
	 * @generated
	 * @ordered
	 */
	protected Design design;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentalPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jpdl31Package.Literals.EXPERIMENTAL_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getGoals() {
		if (goals == null) {
			goals = new EObjectContainmentEList<Goal>(Goal.class, this, Jpdl31Package.EXPERIMENTAL_PLAN__GOALS);
		}
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hyphotesis> getHypothesis() {
		if (hypothesis == null) {
			hypothesis = new EObjectContainmentEList<Hyphotesis>(Hyphotesis.class, this, Jpdl31Package.EXPERIMENTAL_PLAN__HYPOTHESIS);
		}
		return hypothesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Design getDesign() {
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesign(Design newDesign, NotificationChain msgs) {
		Design oldDesign = design;
		design = newDesign;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jpdl31Package.EXPERIMENTAL_PLAN__DESIGN, oldDesign, newDesign);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesign(Design newDesign) {
		if (newDesign != design) {
			NotificationChain msgs = null;
			if (design != null)
				msgs = ((InternalEObject)design).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jpdl31Package.EXPERIMENTAL_PLAN__DESIGN, null, msgs);
			if (newDesign != null)
				msgs = ((InternalEObject)newDesign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jpdl31Package.EXPERIMENTAL_PLAN__DESIGN, null, msgs);
			msgs = basicSetDesign(newDesign, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.EXPERIMENTAL_PLAN__DESIGN, newDesign, newDesign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jpdl31Package.EXPERIMENTAL_PLAN__GOALS:
				return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.EXPERIMENTAL_PLAN__HYPOTHESIS:
				return ((InternalEList<?>)getHypothesis()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.EXPERIMENTAL_PLAN__DESIGN:
				return basicSetDesign(null, msgs);
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
			case Jpdl31Package.EXPERIMENTAL_PLAN__GOALS:
				return getGoals();
			case Jpdl31Package.EXPERIMENTAL_PLAN__HYPOTHESIS:
				return getHypothesis();
			case Jpdl31Package.EXPERIMENTAL_PLAN__DESIGN:
				return getDesign();
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
			case Jpdl31Package.EXPERIMENTAL_PLAN__GOALS:
				getGoals().clear();
				getGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case Jpdl31Package.EXPERIMENTAL_PLAN__HYPOTHESIS:
				getHypothesis().clear();
				getHypothesis().addAll((Collection<? extends Hyphotesis>)newValue);
				return;
			case Jpdl31Package.EXPERIMENTAL_PLAN__DESIGN:
				setDesign((Design)newValue);
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
			case Jpdl31Package.EXPERIMENTAL_PLAN__GOALS:
				getGoals().clear();
				return;
			case Jpdl31Package.EXPERIMENTAL_PLAN__HYPOTHESIS:
				getHypothesis().clear();
				return;
			case Jpdl31Package.EXPERIMENTAL_PLAN__DESIGN:
				setDesign((Design)null);
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
			case Jpdl31Package.EXPERIMENTAL_PLAN__GOALS:
				return goals != null && !goals.isEmpty();
			case Jpdl31Package.EXPERIMENTAL_PLAN__HYPOTHESIS:
				return hypothesis != null && !hypothesis.isEmpty();
			case Jpdl31Package.EXPERIMENTAL_PLAN__DESIGN:
				return design != null;
		}
		return super.eIsSet(featureID);
	}

} //ExperimentalPlanImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31.impl;

import java.util.Collection;

import jpdl31.DependentVariable;
import jpdl31.Design;
import jpdl31.DoEType;
import jpdl31.Factor;
import jpdl31.Jpdl31Package;
import jpdl31.Parameter;
import jpdl31.StatisticalTest;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jpdl31.impl.DesignImpl#getFactors <em>Factors</em>}</li>
 *   <li>{@link jpdl31.impl.DesignImpl#getDoE <em>Do E</em>}</li>
 *   <li>{@link jpdl31.impl.DesignImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link jpdl31.impl.DesignImpl#getTest <em>Test</em>}</li>
 *   <li>{@link jpdl31.impl.DesignImpl#getDepVariable <em>Dep Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DesignImpl extends EObjectImpl implements Design {
	/**
	 * The cached value of the '{@link #getFactors() <em>Factors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactors()
	 * @generated
	 * @ordered
	 */
	protected EList<Factor> factors;

	/**
	 * The default value of the '{@link #getDoE() <em>Do E</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoE()
	 * @generated
	 * @ordered
	 */
	protected static final DoEType DO_E_EDEFAULT = DoEType.LS;

	/**
	 * The cached value of the '{@link #getDoE() <em>Do E</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoE()
	 * @generated
	 * @ordered
	 */
	protected DoEType doE = DO_E_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected EList<StatisticalTest> test;

	/**
	 * The cached value of the '{@link #getDepVariable() <em>Dep Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<DependentVariable> depVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jpdl31Package.Literals.DESIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Factor> getFactors() {
		if (factors == null) {
			factors = new EObjectContainmentEList<Factor>(Factor.class, this, Jpdl31Package.DESIGN__FACTORS);
		}
		return factors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoEType getDoE() {
		return doE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoE(DoEType newDoE) {
		DoEType oldDoE = doE;
		doE = newDoE == null ? DO_E_EDEFAULT : newDoE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.DESIGN__DO_E, oldDoE, doE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, Jpdl31Package.DESIGN__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatisticalTest> getTest() {
		if (test == null) {
			test = new EObjectResolvingEList<StatisticalTest>(StatisticalTest.class, this, Jpdl31Package.DESIGN__TEST);
		}
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependentVariable> getDepVariable() {
		if (depVariable == null) {
			depVariable = new EObjectContainmentEList<DependentVariable>(DependentVariable.class, this, Jpdl31Package.DESIGN__DEP_VARIABLE);
		}
		return depVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jpdl31Package.DESIGN__FACTORS:
				return ((InternalEList<?>)getFactors()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.DESIGN__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case Jpdl31Package.DESIGN__DEP_VARIABLE:
				return ((InternalEList<?>)getDepVariable()).basicRemove(otherEnd, msgs);
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
			case Jpdl31Package.DESIGN__FACTORS:
				return getFactors();
			case Jpdl31Package.DESIGN__DO_E:
				return getDoE();
			case Jpdl31Package.DESIGN__PARAMETERS:
				return getParameters();
			case Jpdl31Package.DESIGN__TEST:
				return getTest();
			case Jpdl31Package.DESIGN__DEP_VARIABLE:
				return getDepVariable();
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
			case Jpdl31Package.DESIGN__FACTORS:
				getFactors().clear();
				getFactors().addAll((Collection<? extends Factor>)newValue);
				return;
			case Jpdl31Package.DESIGN__DO_E:
				setDoE((DoEType)newValue);
				return;
			case Jpdl31Package.DESIGN__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case Jpdl31Package.DESIGN__TEST:
				getTest().clear();
				getTest().addAll((Collection<? extends StatisticalTest>)newValue);
				return;
			case Jpdl31Package.DESIGN__DEP_VARIABLE:
				getDepVariable().clear();
				getDepVariable().addAll((Collection<? extends DependentVariable>)newValue);
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
			case Jpdl31Package.DESIGN__FACTORS:
				getFactors().clear();
				return;
			case Jpdl31Package.DESIGN__DO_E:
				setDoE(DO_E_EDEFAULT);
				return;
			case Jpdl31Package.DESIGN__PARAMETERS:
				getParameters().clear();
				return;
			case Jpdl31Package.DESIGN__TEST:
				getTest().clear();
				return;
			case Jpdl31Package.DESIGN__DEP_VARIABLE:
				getDepVariable().clear();
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
			case Jpdl31Package.DESIGN__FACTORS:
				return factors != null && !factors.isEmpty();
			case Jpdl31Package.DESIGN__DO_E:
				return doE != DO_E_EDEFAULT;
			case Jpdl31Package.DESIGN__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case Jpdl31Package.DESIGN__TEST:
				return test != null && !test.isEmpty();
			case Jpdl31Package.DESIGN__DEP_VARIABLE:
				return depVariable != null && !depVariable.isEmpty();
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
		result.append(" (DoE: ");
		result.append(doE);
		result.append(')');
		return result.toString();
	}

} //DesignImpl

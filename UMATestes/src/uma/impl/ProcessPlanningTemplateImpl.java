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

import uma.ProcessPlanningTemplate;
import uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Planning Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uma.impl.ProcessPlanningTemplateImpl#getBasedOnProcesses <em>Based On Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessPlanningTemplateImpl extends ProcessImpl implements ProcessPlanningTemplate {
	/**
	 * The cached value of the '{@link #getBasedOnProcesses() <em>Based On Processes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOnProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<uma.Process> basedOnProcesses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessPlanningTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.PROCESS_PLANNING_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<uma.Process> getBasedOnProcesses() {
		if (basedOnProcesses == null) {
			basedOnProcesses = new EObjectResolvingEList<uma.Process>(uma.Process.class, this, UmaPackage.PROCESS_PLANNING_TEMPLATE__BASED_ON_PROCESSES);
		}
		return basedOnProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.PROCESS_PLANNING_TEMPLATE__BASED_ON_PROCESSES:
				return getBasedOnProcesses();
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
			case UmaPackage.PROCESS_PLANNING_TEMPLATE__BASED_ON_PROCESSES:
				getBasedOnProcesses().clear();
				getBasedOnProcesses().addAll((Collection<? extends uma.Process>)newValue);
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
			case UmaPackage.PROCESS_PLANNING_TEMPLATE__BASED_ON_PROCESSES:
				getBasedOnProcesses().clear();
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
			case UmaPackage.PROCESS_PLANNING_TEMPLATE__BASED_ON_PROCESSES:
				return basedOnProcesses != null && !basedOnProcesses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessPlanningTemplateImpl

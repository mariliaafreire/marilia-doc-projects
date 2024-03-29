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

import uma.Discipline;
import uma.DisciplineGrouping;
import uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discipline Grouping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uma.impl.DisciplineGroupingImpl#getDisciplines <em>Disciplines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisciplineGroupingImpl extends ContentCategoryImpl implements DisciplineGrouping {
	/**
	 * The cached value of the '{@link #getDisciplines() <em>Disciplines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisciplines()
	 * @generated
	 * @ordered
	 */
	protected EList<Discipline> disciplines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisciplineGroupingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.DISCIPLINE_GROUPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Discipline> getDisciplines() {
		if (disciplines == null) {
			disciplines = new EObjectResolvingEList<Discipline>(Discipline.class, this, UmaPackage.DISCIPLINE_GROUPING__DISCIPLINES);
		}
		return disciplines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.DISCIPLINE_GROUPING__DISCIPLINES:
				return getDisciplines();
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
			case UmaPackage.DISCIPLINE_GROUPING__DISCIPLINES:
				getDisciplines().clear();
				getDisciplines().addAll((Collection<? extends Discipline>)newValue);
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
			case UmaPackage.DISCIPLINE_GROUPING__DISCIPLINES:
				getDisciplines().clear();
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
			case UmaPackage.DISCIPLINE_GROUPING__DISCIPLINES:
				return disciplines != null && !disciplines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DisciplineGroupingImpl

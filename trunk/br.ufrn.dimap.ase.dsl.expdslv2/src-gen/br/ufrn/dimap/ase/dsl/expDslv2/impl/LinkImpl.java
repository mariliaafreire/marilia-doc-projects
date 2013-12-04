/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2.impl;

import br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package;
import br.ufrn.dimap.ase.dsl.expDslv2.Levels;
import br.ufrn.dimap.ase.dsl.expDslv2.Link;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.LinkImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.LinkImpl#getTreatment <em>Treatment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends MinimalEObjectImpl.Container implements Link
{
  /**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
  protected EList<br.ufrn.dimap.ase.dsl.expDslv2.Process> procedure;

  /**
	 * The cached value of the '{@link #getTreatment() <em>Treatment</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTreatment()
	 * @generated
	 * @ordered
	 */
  protected EList<Levels> treatment;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected LinkImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ExpDslv2Package.Literals.LINK;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<br.ufrn.dimap.ase.dsl.expDslv2.Process> getProcedure()
  {
		if (procedure == null) {
			procedure = new EObjectResolvingEList<br.ufrn.dimap.ase.dsl.expDslv2.Process>(br.ufrn.dimap.ase.dsl.expDslv2.Process.class, this, ExpDslv2Package.LINK__PROCEDURE);
		}
		return procedure;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Levels> getTreatment()
  {
		if (treatment == null) {
			treatment = new EObjectResolvingEList<Levels>(Levels.class, this, ExpDslv2Package.LINK__TREATMENT);
		}
		return treatment;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ExpDslv2Package.LINK__PROCEDURE:
				return getProcedure();
			case ExpDslv2Package.LINK__TREATMENT:
				return getTreatment();
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
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ExpDslv2Package.LINK__PROCEDURE:
				getProcedure().clear();
				getProcedure().addAll((Collection<? extends br.ufrn.dimap.ase.dsl.expDslv2.Process>)newValue);
				return;
			case ExpDslv2Package.LINK__TREATMENT:
				getTreatment().clear();
				getTreatment().addAll((Collection<? extends Levels>)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case ExpDslv2Package.LINK__PROCEDURE:
				getProcedure().clear();
				return;
			case ExpDslv2Package.LINK__TREATMENT:
				getTreatment().clear();
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case ExpDslv2Package.LINK__PROCEDURE:
				return procedure != null && !procedure.isEmpty();
			case ExpDslv2Package.LINK__TREATMENT:
				return treatment != null && !treatment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LinkImpl

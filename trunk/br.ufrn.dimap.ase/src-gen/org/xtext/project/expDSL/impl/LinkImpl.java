/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.project.expDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.project.expDSL.ExpDSLPackage;
import org.xtext.project.expDSL.Levels;
import org.xtext.project.expDSL.Link;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.project.expDSL.impl.LinkImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.impl.LinkImpl#getTreatment <em>Treatment</em>}</li>
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
  protected EList<org.xtext.project.expDSL.Process> procedure;

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
		return ExpDSLPackage.Literals.LINK;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<org.xtext.project.expDSL.Process> getProcedure()
  {
		if (procedure == null) {
			procedure = new EObjectResolvingEList<org.xtext.project.expDSL.Process>(org.xtext.project.expDSL.Process.class, this, ExpDSLPackage.LINK__PROCEDURE);
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
			treatment = new EObjectResolvingEList<Levels>(Levels.class, this, ExpDSLPackage.LINK__TREATMENT);
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
			case ExpDSLPackage.LINK__PROCEDURE:
				return getProcedure();
			case ExpDSLPackage.LINK__TREATMENT:
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
			case ExpDSLPackage.LINK__PROCEDURE:
				getProcedure().clear();
				getProcedure().addAll((Collection<? extends org.xtext.project.expDSL.Process>)newValue);
				return;
			case ExpDSLPackage.LINK__TREATMENT:
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
			case ExpDSLPackage.LINK__PROCEDURE:
				getProcedure().clear();
				return;
			case ExpDSLPackage.LINK__TREATMENT:
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
			case ExpDSLPackage.LINK__PROCEDURE:
				return procedure != null && !procedure.isEmpty();
			case ExpDSLPackage.LINK__TREATMENT:
				return treatment != null && !treatment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LinkImpl

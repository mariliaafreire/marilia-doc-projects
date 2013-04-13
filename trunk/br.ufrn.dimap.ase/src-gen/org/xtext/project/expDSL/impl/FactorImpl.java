/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.project.expDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.project.expDSL.ExpDSLPackage;
import org.xtext.project.expDSL.Factor;
import org.xtext.project.expDSL.Levels;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.project.expDSL.impl.FactorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.impl.FactorImpl#getIsDesiredVariation <em>Is Desired Variation</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.impl.FactorImpl#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FactorImpl extends MinimalEObjectImpl.Container implements Factor
{
  /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

  /**
	 * The default value of the '{@link #getIsDesiredVariation() <em>Is Desired Variation</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getIsDesiredVariation()
	 * @generated
	 * @ordered
	 */
  protected static final String IS_DESIRED_VARIATION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getIsDesiredVariation() <em>Is Desired Variation</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getIsDesiredVariation()
	 * @generated
	 * @ordered
	 */
  protected String isDesiredVariation = IS_DESIRED_VARIATION_EDEFAULT;

  /**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
  protected EList<Levels> level;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected FactorImpl()
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
		return ExpDSLPackage.Literals.FACTOR;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDSLPackage.FACTOR__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getIsDesiredVariation()
  {
		return isDesiredVariation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setIsDesiredVariation(String newIsDesiredVariation)
  {
		String oldIsDesiredVariation = isDesiredVariation;
		isDesiredVariation = newIsDesiredVariation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDSLPackage.FACTOR__IS_DESIRED_VARIATION, oldIsDesiredVariation, isDesiredVariation));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Levels> getLevel()
  {
		if (level == null) {
			level = new EObjectContainmentEList<Levels>(Levels.class, this, ExpDSLPackage.FACTOR__LEVEL);
		}
		return level;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ExpDSLPackage.FACTOR__LEVEL:
				return ((InternalEList<?>)getLevel()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case ExpDSLPackage.FACTOR__NAME:
				return getName();
			case ExpDSLPackage.FACTOR__IS_DESIRED_VARIATION:
				return getIsDesiredVariation();
			case ExpDSLPackage.FACTOR__LEVEL:
				return getLevel();
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
			case ExpDSLPackage.FACTOR__NAME:
				setName((String)newValue);
				return;
			case ExpDSLPackage.FACTOR__IS_DESIRED_VARIATION:
				setIsDesiredVariation((String)newValue);
				return;
			case ExpDSLPackage.FACTOR__LEVEL:
				getLevel().clear();
				getLevel().addAll((Collection<? extends Levels>)newValue);
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
			case ExpDSLPackage.FACTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExpDSLPackage.FACTOR__IS_DESIRED_VARIATION:
				setIsDesiredVariation(IS_DESIRED_VARIATION_EDEFAULT);
				return;
			case ExpDSLPackage.FACTOR__LEVEL:
				getLevel().clear();
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
			case ExpDSLPackage.FACTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExpDSLPackage.FACTOR__IS_DESIRED_VARIATION:
				return IS_DESIRED_VARIATION_EDEFAULT == null ? isDesiredVariation != null : !IS_DESIRED_VARIATION_EDEFAULT.equals(isDesiredVariation);
			case ExpDSLPackage.FACTOR__LEVEL:
				return level != null && !level.isEmpty();
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", isDesiredVariation: ");
		result.append(isDesiredVariation);
		result.append(')');
		return result.toString();
	}

} //FactorImpl

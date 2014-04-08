/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3.impl;

import br.ufrn.dimap.ase.dsl.expdslv3.DOE;
import br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package;
import br.ufrn.dimap.ase.dsl.expdslv3.Factor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DOE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.DOEImpl#getTreatment <em>Treatment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DOEImpl extends MinimalEObjectImpl.Container implements DOE
{
  /**
   * The cached value of the '{@link #getTreatment() <em>Treatment</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTreatment()
   * @generated
   * @ordered
   */
  protected Factor treatment;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DOEImpl()
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
    return Expdslv3Package.Literals.DOE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Factor getTreatment()
  {
    if (treatment != null && treatment.eIsProxy())
    {
      InternalEObject oldTreatment = (InternalEObject)treatment;
      treatment = (Factor)eResolveProxy(oldTreatment);
      if (treatment != oldTreatment)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Expdslv3Package.DOE__TREATMENT, oldTreatment, treatment));
      }
    }
    return treatment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Factor basicGetTreatment()
  {
    return treatment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTreatment(Factor newTreatment)
  {
    Factor oldTreatment = treatment;
    treatment = newTreatment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.DOE__TREATMENT, oldTreatment, treatment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Expdslv3Package.DOE__TREATMENT:
        if (resolve) return getTreatment();
        return basicGetTreatment();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Expdslv3Package.DOE__TREATMENT:
        setTreatment((Factor)newValue);
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
    switch (featureID)
    {
      case Expdslv3Package.DOE__TREATMENT:
        setTreatment((Factor)null);
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
    switch (featureID)
    {
      case Expdslv3Package.DOE__TREATMENT:
        return treatment != null;
    }
    return super.eIsSet(featureID);
  }

} //DOEImpl

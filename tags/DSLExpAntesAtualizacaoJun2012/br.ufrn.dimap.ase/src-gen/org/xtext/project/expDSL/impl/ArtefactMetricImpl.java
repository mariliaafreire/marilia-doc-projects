/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.project.expDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.project.expDSL.Artefact;
import org.xtext.project.expDSL.ArtefactMetric;
import org.xtext.project.expDSL.ExpDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artefact Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.project.expDSL.impl.ArtefactMetricImpl#getArtefact <em>Artefact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtefactMetricImpl extends MetricsImpl implements ArtefactMetric
{
  /**
   * The cached value of the '{@link #getArtefact() <em>Artefact</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtefact()
   * @generated
   * @ordered
   */
  protected Artefact artefact;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArtefactMetricImpl()
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
    return ExpDSLPackage.Literals.ARTEFACT_METRIC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Artefact getArtefact()
  {
    if (artefact != null && artefact.eIsProxy())
    {
      InternalEObject oldArtefact = (InternalEObject)artefact;
      artefact = (Artefact)eResolveProxy(oldArtefact);
      if (artefact != oldArtefact)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpDSLPackage.ARTEFACT_METRIC__ARTEFACT, oldArtefact, artefact));
      }
    }
    return artefact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Artefact basicGetArtefact()
  {
    return artefact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArtefact(Artefact newArtefact)
  {
    Artefact oldArtefact = artefact;
    artefact = newArtefact;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpDSLPackage.ARTEFACT_METRIC__ARTEFACT, oldArtefact, artefact));
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
      case ExpDSLPackage.ARTEFACT_METRIC__ARTEFACT:
        if (resolve) return getArtefact();
        return basicGetArtefact();
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
      case ExpDSLPackage.ARTEFACT_METRIC__ARTEFACT:
        setArtefact((Artefact)newValue);
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
      case ExpDSLPackage.ARTEFACT_METRIC__ARTEFACT:
        setArtefact((Artefact)null);
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
      case ExpDSLPackage.ARTEFACT_METRIC__ARTEFACT:
        return artefact != null;
    }
    return super.eIsSet(featureID);
  }

} //ArtefactMetricImpl

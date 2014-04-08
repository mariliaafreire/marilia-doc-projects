/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3.impl;

import br.ufrn.dimap.ase.dsl.expdslv3.DepVariable;
import br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package;
import br.ufrn.dimap.ase.dsl.expdslv3.ResearchHypothesis;
import br.ufrn.dimap.ase.dsl.expdslv3.ResearchQuestion;
import br.ufrn.dimap.ase.dsl.expdslv3.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dep Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.DepVariableImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.DepVariableImpl#getRq <em>Rq</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.DepVariableImpl#getRh <em>Rh</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DepVariableImpl extends MinimalEObjectImpl.Container implements DepVariable
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected Variable variable;

  /**
   * The cached value of the '{@link #getRq() <em>Rq</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRq()
   * @generated
   * @ordered
   */
  protected ResearchQuestion rq;

  /**
   * The cached value of the '{@link #getRh() <em>Rh</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRh()
   * @generated
   * @ordered
   */
  protected ResearchHypothesis rh;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DepVariableImpl()
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
    return Expdslv3Package.Literals.DEP_VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getVariable()
  {
    if (variable != null && variable.eIsProxy())
    {
      InternalEObject oldVariable = (InternalEObject)variable;
      variable = (Variable)eResolveProxy(oldVariable);
      if (variable != oldVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Expdslv3Package.DEP_VARIABLE__VARIABLE, oldVariable, variable));
      }
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(Variable newVariable)
  {
    Variable oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.DEP_VARIABLE__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResearchQuestion getRq()
  {
    if (rq != null && rq.eIsProxy())
    {
      InternalEObject oldRq = (InternalEObject)rq;
      rq = (ResearchQuestion)eResolveProxy(oldRq);
      if (rq != oldRq)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Expdslv3Package.DEP_VARIABLE__RQ, oldRq, rq));
      }
    }
    return rq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResearchQuestion basicGetRq()
  {
    return rq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRq(ResearchQuestion newRq)
  {
    ResearchQuestion oldRq = rq;
    rq = newRq;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.DEP_VARIABLE__RQ, oldRq, rq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResearchHypothesis getRh()
  {
    if (rh != null && rh.eIsProxy())
    {
      InternalEObject oldRh = (InternalEObject)rh;
      rh = (ResearchHypothesis)eResolveProxy(oldRh);
      if (rh != oldRh)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Expdslv3Package.DEP_VARIABLE__RH, oldRh, rh));
      }
    }
    return rh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResearchHypothesis basicGetRh()
  {
    return rh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRh(ResearchHypothesis newRh)
  {
    ResearchHypothesis oldRh = rh;
    rh = newRh;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.DEP_VARIABLE__RH, oldRh, rh));
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
      case Expdslv3Package.DEP_VARIABLE__VARIABLE:
        if (resolve) return getVariable();
        return basicGetVariable();
      case Expdslv3Package.DEP_VARIABLE__RQ:
        if (resolve) return getRq();
        return basicGetRq();
      case Expdslv3Package.DEP_VARIABLE__RH:
        if (resolve) return getRh();
        return basicGetRh();
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
      case Expdslv3Package.DEP_VARIABLE__VARIABLE:
        setVariable((Variable)newValue);
        return;
      case Expdslv3Package.DEP_VARIABLE__RQ:
        setRq((ResearchQuestion)newValue);
        return;
      case Expdslv3Package.DEP_VARIABLE__RH:
        setRh((ResearchHypothesis)newValue);
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
      case Expdslv3Package.DEP_VARIABLE__VARIABLE:
        setVariable((Variable)null);
        return;
      case Expdslv3Package.DEP_VARIABLE__RQ:
        setRq((ResearchQuestion)null);
        return;
      case Expdslv3Package.DEP_VARIABLE__RH:
        setRh((ResearchHypothesis)null);
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
      case Expdslv3Package.DEP_VARIABLE__VARIABLE:
        return variable != null;
      case Expdslv3Package.DEP_VARIABLE__RQ:
        return rq != null;
      case Expdslv3Package.DEP_VARIABLE__RH:
        return rh != null;
    }
    return super.eIsSet(featureID);
  }

} //DepVariableImpl

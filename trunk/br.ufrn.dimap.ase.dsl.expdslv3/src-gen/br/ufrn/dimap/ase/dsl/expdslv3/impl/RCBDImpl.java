/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3.impl;

import br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package;
import br.ufrn.dimap.ase.dsl.expdslv3.RCBD;
import br.ufrn.dimap.ase.dsl.expdslv3.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RCBD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.RCBDImpl#getBlockVariable <em>Block Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RCBDImpl extends DOEImpl implements RCBD
{
  /**
	 * The cached value of the '{@link #getBlockVariable() <em>Block Variable</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBlockVariable()
	 * @generated
	 * @ordered
	 */
  protected Variable blockVariable;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RCBDImpl()
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
		return Expdslv3Package.Literals.RCBD;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Variable getBlockVariable()
  {
		if (blockVariable != null && blockVariable.eIsProxy()) {
			InternalEObject oldBlockVariable = (InternalEObject)blockVariable;
			blockVariable = (Variable)eResolveProxy(oldBlockVariable);
			if (blockVariable != oldBlockVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Expdslv3Package.RCBD__BLOCK_VARIABLE, oldBlockVariable, blockVariable));
			}
		}
		return blockVariable;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Variable basicGetBlockVariable()
  {
		return blockVariable;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setBlockVariable(Variable newBlockVariable)
  {
		Variable oldBlockVariable = blockVariable;
		blockVariable = newBlockVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.RCBD__BLOCK_VARIABLE, oldBlockVariable, blockVariable));
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
			case Expdslv3Package.RCBD__BLOCK_VARIABLE:
				if (resolve) return getBlockVariable();
				return basicGetBlockVariable();
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
		switch (featureID) {
			case Expdslv3Package.RCBD__BLOCK_VARIABLE:
				setBlockVariable((Variable)newValue);
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
			case Expdslv3Package.RCBD__BLOCK_VARIABLE:
				setBlockVariable((Variable)null);
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
			case Expdslv3Package.RCBD__BLOCK_VARIABLE:
				return blockVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //RCBDImpl

/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3.impl;

import br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package;
import br.ufrn.dimap.ase.dsl.expdslv3.LS;
import br.ufrn.dimap.ase.dsl.expdslv3.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.LSImpl#getCol <em>Col</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.LSImpl#getRow <em>Row</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LSImpl extends DOEImpl implements LS
{
  /**
	 * The cached value of the '{@link #getCol() <em>Col</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCol()
	 * @generated
	 * @ordered
	 */
  protected Variable col;

  /**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
  protected Variable row;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected LSImpl()
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
		return Expdslv3Package.Literals.LS;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Variable getCol()
  {
		if (col != null && col.eIsProxy()) {
			InternalEObject oldCol = (InternalEObject)col;
			col = (Variable)eResolveProxy(oldCol);
			if (col != oldCol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Expdslv3Package.LS__COL, oldCol, col));
			}
		}
		return col;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Variable basicGetCol()
  {
		return col;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCol(Variable newCol)
  {
		Variable oldCol = col;
		col = newCol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.LS__COL, oldCol, col));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Variable getRow()
  {
		if (row != null && row.eIsProxy()) {
			InternalEObject oldRow = (InternalEObject)row;
			row = (Variable)eResolveProxy(oldRow);
			if (row != oldRow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Expdslv3Package.LS__ROW, oldRow, row));
			}
		}
		return row;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Variable basicGetRow()
  {
		return row;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRow(Variable newRow)
  {
		Variable oldRow = row;
		row = newRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.LS__ROW, oldRow, row));
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
			case Expdslv3Package.LS__COL:
				if (resolve) return getCol();
				return basicGetCol();
			case Expdslv3Package.LS__ROW:
				if (resolve) return getRow();
				return basicGetRow();
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
			case Expdslv3Package.LS__COL:
				setCol((Variable)newValue);
				return;
			case Expdslv3Package.LS__ROW:
				setRow((Variable)newValue);
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
			case Expdslv3Package.LS__COL:
				setCol((Variable)null);
				return;
			case Expdslv3Package.LS__ROW:
				setRow((Variable)null);
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
			case Expdslv3Package.LS__COL:
				return col != null;
			case Expdslv3Package.LS__ROW:
				return row != null;
		}
		return super.eIsSet(featureID);
	}

} //LSImpl

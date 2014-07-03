/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2.impl;

import br.ufrn.dimap.ase.dsl.expDslv2.Detail;
import br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package;
import br.ufrn.dimap.ase.dsl.expDslv2.Metrics;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metrics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.MetricsImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.MetricsImpl#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.MetricsImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.MetricsImpl#getDetail <em>Detail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetricsImpl extends MinimalEObjectImpl.Container implements Metrics
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
	 * The cached value of the '{@link #getRelatesTo() <em>Relates To</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRelatesTo()
	 * @generated
	 * @ordered
	 */
  protected br.ufrn.dimap.ase.dsl.expDslv2.Process relatesTo;

  /**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
  protected Detail detail;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MetricsImpl()
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
		return ExpDslv2Package.Literals.METRICS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.METRICS__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public br.ufrn.dimap.ase.dsl.expDslv2.Process getRelatesTo()
  {
		if (relatesTo != null && relatesTo.eIsProxy()) {
			InternalEObject oldRelatesTo = (InternalEObject)relatesTo;
			relatesTo = (br.ufrn.dimap.ase.dsl.expDslv2.Process)eResolveProxy(oldRelatesTo);
			if (relatesTo != oldRelatesTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpDslv2Package.METRICS__RELATES_TO, oldRelatesTo, relatesTo));
			}
		}
		return relatesTo;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public br.ufrn.dimap.ase.dsl.expDslv2.Process basicGetRelatesTo()
  {
		return relatesTo;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRelatesTo(br.ufrn.dimap.ase.dsl.expDslv2.Process newRelatesTo)
  {
		br.ufrn.dimap.ase.dsl.expDslv2.Process oldRelatesTo = relatesTo;
		relatesTo = newRelatesTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.METRICS__RELATES_TO, oldRelatesTo, relatesTo));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDescription()
  {
		return description;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDescription(String newDescription)
  {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.METRICS__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Detail getDetail()
  {
		return detail;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetDetail(Detail newDetail, NotificationChain msgs)
  {
		Detail oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpDslv2Package.METRICS__DETAIL, oldDetail, newDetail);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDetail(Detail newDetail)
  {
		if (newDetail != detail) {
			NotificationChain msgs = null;
			if (detail != null)
				msgs = ((InternalEObject)detail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpDslv2Package.METRICS__DETAIL, null, msgs);
			if (newDetail != null)
				msgs = ((InternalEObject)newDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpDslv2Package.METRICS__DETAIL, null, msgs);
			msgs = basicSetDetail(newDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.METRICS__DETAIL, newDetail, newDetail));
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
			case ExpDslv2Package.METRICS__DETAIL:
				return basicSetDetail(null, msgs);
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
			case ExpDslv2Package.METRICS__NAME:
				return getName();
			case ExpDslv2Package.METRICS__RELATES_TO:
				if (resolve) return getRelatesTo();
				return basicGetRelatesTo();
			case ExpDslv2Package.METRICS__DESCRIPTION:
				return getDescription();
			case ExpDslv2Package.METRICS__DETAIL:
				return getDetail();
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
			case ExpDslv2Package.METRICS__NAME:
				setName((String)newValue);
				return;
			case ExpDslv2Package.METRICS__RELATES_TO:
				setRelatesTo((br.ufrn.dimap.ase.dsl.expDslv2.Process)newValue);
				return;
			case ExpDslv2Package.METRICS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ExpDslv2Package.METRICS__DETAIL:
				setDetail((Detail)newValue);
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
			case ExpDslv2Package.METRICS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExpDslv2Package.METRICS__RELATES_TO:
				setRelatesTo((br.ufrn.dimap.ase.dsl.expDslv2.Process)null);
				return;
			case ExpDslv2Package.METRICS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ExpDslv2Package.METRICS__DETAIL:
				setDetail((Detail)null);
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
			case ExpDslv2Package.METRICS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExpDslv2Package.METRICS__RELATES_TO:
				return relatesTo != null;
			case ExpDslv2Package.METRICS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ExpDslv2Package.METRICS__DETAIL:
				return detail != null;
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //MetricsImpl

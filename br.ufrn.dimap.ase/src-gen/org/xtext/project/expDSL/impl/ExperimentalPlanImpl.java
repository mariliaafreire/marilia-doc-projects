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

import org.xtext.project.expDSL.DesignType;
import org.xtext.project.expDSL.ExpDSLPackage;
import org.xtext.project.expDSL.ExperimentalPlan;
import org.xtext.project.expDSL.Factor;
import org.xtext.project.expDSL.Link;
import org.xtext.project.expDSL.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experimental Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.project.expDSL.impl.ExperimentalPlanImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.impl.ExperimentalPlanImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.impl.ExperimentalPlanImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.impl.ExperimentalPlanImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.impl.ExperimentalPlanImpl#getInternalReplication <em>Internal Replication</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.impl.ExperimentalPlanImpl#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentalPlanImpl extends MinimalEObjectImpl.Container implements ExperimentalPlan
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
  protected static final DesignType TYPE_EDEFAULT = DesignType.CDR;

  /**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
  protected DesignType type = TYPE_EDEFAULT;

  /**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
  protected EList<Parameter> parameter;

  /**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
  protected EList<Factor> factor;

  /**
	 * The default value of the '{@link #getInternalReplication() <em>Internal Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInternalReplication()
	 * @generated
	 * @ordered
	 */
  protected static final int INTERNAL_REPLICATION_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getInternalReplication() <em>Internal Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInternalReplication()
	 * @generated
	 * @ordered
	 */
  protected int internalReplication = INTERNAL_REPLICATION_EDEFAULT;

  /**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
  protected EList<Link> link;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ExperimentalPlanImpl()
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
		return ExpDSLPackage.Literals.EXPERIMENTAL_PLAN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDSLPackage.EXPERIMENTAL_PLAN__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DesignType getType()
  {
		return type;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setType(DesignType newType)
  {
		DesignType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDSLPackage.EXPERIMENTAL_PLAN__TYPE, oldType, type));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Parameter> getParameter()
  {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, ExpDSLPackage.EXPERIMENTAL_PLAN__PARAMETER);
		}
		return parameter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Factor> getFactor()
  {
		if (factor == null) {
			factor = new EObjectContainmentEList<Factor>(Factor.class, this, ExpDSLPackage.EXPERIMENTAL_PLAN__FACTOR);
		}
		return factor;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getInternalReplication()
  {
		return internalReplication;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setInternalReplication(int newInternalReplication)
  {
		int oldInternalReplication = internalReplication;
		internalReplication = newInternalReplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDSLPackage.EXPERIMENTAL_PLAN__INTERNAL_REPLICATION, oldInternalReplication, internalReplication));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Link> getLink()
  {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, ExpDSLPackage.EXPERIMENTAL_PLAN__LINK);
		}
		return link;
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
			case ExpDSLPackage.EXPERIMENTAL_PLAN__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case ExpDSLPackage.EXPERIMENTAL_PLAN__FACTOR:
				return ((InternalEList<?>)getFactor()).basicRemove(otherEnd, msgs);
			case ExpDSLPackage.EXPERIMENTAL_PLAN__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
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
			case ExpDSLPackage.EXPERIMENTAL_PLAN__NAME:
				return getName();
			case ExpDSLPackage.EXPERIMENTAL_PLAN__TYPE:
				return getType();
			case ExpDSLPackage.EXPERIMENTAL_PLAN__PARAMETER:
				return getParameter();
			case ExpDSLPackage.EXPERIMENTAL_PLAN__FACTOR:
				return getFactor();
			case ExpDSLPackage.EXPERIMENTAL_PLAN__INTERNAL_REPLICATION:
				return getInternalReplication();
			case ExpDSLPackage.EXPERIMENTAL_PLAN__LINK:
				return getLink();
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
			case ExpDSLPackage.EXPERIMENTAL_PLAN__NAME:
				setName((String)newValue);
				return;
			case ExpDSLPackage.EXPERIMENTAL_PLAN__TYPE:
				setType((DesignType)newValue);
				return;
			case ExpDSLPackage.EXPERIMENTAL_PLAN__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ExpDSLPackage.EXPERIMENTAL_PLAN__FACTOR:
				getFactor().clear();
				getFactor().addAll((Collection<? extends Factor>)newValue);
				return;
			case ExpDSLPackage.EXPERIMENTAL_PLAN__INTERNAL_REPLICATION:
				setInternalReplication((Integer)newValue);
				return;
			case ExpDSLPackage.EXPERIMENTAL_PLAN__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
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
			case ExpDSLPackage.EXPERIMENTAL_PLAN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExpDSLPackage.EXPERIMENTAL_PLAN__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ExpDSLPackage.EXPERIMENTAL_PLAN__PARAMETER:
				getParameter().clear();
				return;
			case ExpDSLPackage.EXPERIMENTAL_PLAN__FACTOR:
				getFactor().clear();
				return;
			case ExpDSLPackage.EXPERIMENTAL_PLAN__INTERNAL_REPLICATION:
				setInternalReplication(INTERNAL_REPLICATION_EDEFAULT);
				return;
			case ExpDSLPackage.EXPERIMENTAL_PLAN__LINK:
				getLink().clear();
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
			case ExpDSLPackage.EXPERIMENTAL_PLAN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExpDSLPackage.EXPERIMENTAL_PLAN__TYPE:
				return type != TYPE_EDEFAULT;
			case ExpDSLPackage.EXPERIMENTAL_PLAN__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case ExpDSLPackage.EXPERIMENTAL_PLAN__FACTOR:
				return factor != null && !factor.isEmpty();
			case ExpDSLPackage.EXPERIMENTAL_PLAN__INTERNAL_REPLICATION:
				return internalReplication != INTERNAL_REPLICATION_EDEFAULT;
			case ExpDSLPackage.EXPERIMENTAL_PLAN__LINK:
				return link != null && !link.isEmpty();
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
		result.append(", type: ");
		result.append(type);
		result.append(", internalReplication: ");
		result.append(internalReplication);
		result.append(')');
		return result.toString();
	}

} //ExperimentalPlanImpl

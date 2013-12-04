/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2.impl;

import br.ufrn.dimap.ase.dsl.expDslv2.Alternatives;
import br.ufrn.dimap.ase.dsl.expDslv2.AnswerType;
import br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package;
import br.ufrn.dimap.ase.dsl.expDslv2.Question;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.QuestionImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.QuestionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.QuestionImpl#getType <em>Type</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.QuestionImpl#getReq <em>Req</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.QuestionImpl#getAlternatives <em>Alternatives</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionImpl extends MinimalEObjectImpl.Container implements Question
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
  protected static final AnswerType TYPE_EDEFAULT = AnswerType.TEXT;

  /**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
  protected AnswerType type = TYPE_EDEFAULT;

  /**
	 * The default value of the '{@link #getReq() <em>Req</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getReq()
	 * @generated
	 * @ordered
	 */
  protected static final int REQ_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getReq() <em>Req</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getReq()
	 * @generated
	 * @ordered
	 */
  protected int req = REQ_EDEFAULT;

  /**
	 * The cached value of the '{@link #getAlternatives() <em>Alternatives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAlternatives()
	 * @generated
	 * @ordered
	 */
  protected EList<Alternatives> alternatives;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected QuestionImpl()
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
		return ExpDslv2Package.Literals.QUESTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.QUESTION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.QUESTION__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AnswerType getType()
  {
		return type;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setType(AnswerType newType)
  {
		AnswerType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.QUESTION__TYPE, oldType, type));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getReq()
  {
		return req;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setReq(int newReq)
  {
		int oldReq = req;
		req = newReq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.QUESTION__REQ, oldReq, req));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Alternatives> getAlternatives()
  {
		if (alternatives == null) {
			alternatives = new EObjectContainmentEList<Alternatives>(Alternatives.class, this, ExpDslv2Package.QUESTION__ALTERNATIVES);
		}
		return alternatives;
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
			case ExpDslv2Package.QUESTION__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
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
			case ExpDslv2Package.QUESTION__NAME:
				return getName();
			case ExpDslv2Package.QUESTION__DESCRIPTION:
				return getDescription();
			case ExpDslv2Package.QUESTION__TYPE:
				return getType();
			case ExpDslv2Package.QUESTION__REQ:
				return getReq();
			case ExpDslv2Package.QUESTION__ALTERNATIVES:
				return getAlternatives();
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
			case ExpDslv2Package.QUESTION__NAME:
				setName((String)newValue);
				return;
			case ExpDslv2Package.QUESTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ExpDslv2Package.QUESTION__TYPE:
				setType((AnswerType)newValue);
				return;
			case ExpDslv2Package.QUESTION__REQ:
				setReq((Integer)newValue);
				return;
			case ExpDslv2Package.QUESTION__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends Alternatives>)newValue);
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
			case ExpDslv2Package.QUESTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExpDslv2Package.QUESTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ExpDslv2Package.QUESTION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ExpDslv2Package.QUESTION__REQ:
				setReq(REQ_EDEFAULT);
				return;
			case ExpDslv2Package.QUESTION__ALTERNATIVES:
				getAlternatives().clear();
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
			case ExpDslv2Package.QUESTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExpDslv2Package.QUESTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ExpDslv2Package.QUESTION__TYPE:
				return type != TYPE_EDEFAULT;
			case ExpDslv2Package.QUESTION__REQ:
				return req != REQ_EDEFAULT;
			case ExpDslv2Package.QUESTION__ALTERNATIVES:
				return alternatives != null && !alternatives.isEmpty();
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
		result.append(", type: ");
		result.append(type);
		result.append(", req: ");
		result.append(req);
		result.append(')');
		return result.toString();
	}

} //QuestionImpl

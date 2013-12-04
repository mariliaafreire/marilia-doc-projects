/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2.impl;

import br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package;
import br.ufrn.dimap.ase.dsl.expDslv2.Goal;
import br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses;
import br.ufrn.dimap.ase.dsl.expDslv2.HypothesisType;
import br.ufrn.dimap.ase.dsl.expDslv2.Subhypotheses;

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
 * An implementation of the model object '<em><b>Hypotheses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.HypothesesImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.HypothesesImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.HypothesesImpl#getType <em>Type</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.HypothesesImpl#getFromGoal <em>From Goal</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.HypothesesImpl#getSubhypotheses <em>Subhypotheses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HypothesesImpl extends MinimalEObjectImpl.Container implements Hypotheses
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
  protected static final HypothesisType TYPE_EDEFAULT = HypothesisType.NULL;

  /**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
  protected HypothesisType type = TYPE_EDEFAULT;

  /**
	 * The cached value of the '{@link #getFromGoal() <em>From Goal</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFromGoal()
	 * @generated
	 * @ordered
	 */
  protected Goal fromGoal;

  /**
	 * The cached value of the '{@link #getSubhypotheses() <em>Subhypotheses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSubhypotheses()
	 * @generated
	 * @ordered
	 */
  protected EList<Subhypotheses> subhypotheses;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected HypothesesImpl()
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
		return ExpDslv2Package.Literals.HYPOTHESES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.HYPOTHESES__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.HYPOTHESES__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HypothesisType getType()
  {
		return type;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setType(HypothesisType newType)
  {
		HypothesisType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.HYPOTHESES__TYPE, oldType, type));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Goal getFromGoal()
  {
		if (fromGoal != null && fromGoal.eIsProxy()) {
			InternalEObject oldFromGoal = (InternalEObject)fromGoal;
			fromGoal = (Goal)eResolveProxy(oldFromGoal);
			if (fromGoal != oldFromGoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpDslv2Package.HYPOTHESES__FROM_GOAL, oldFromGoal, fromGoal));
			}
		}
		return fromGoal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Goal basicGetFromGoal()
  {
		return fromGoal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFromGoal(Goal newFromGoal)
  {
		Goal oldFromGoal = fromGoal;
		fromGoal = newFromGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.HYPOTHESES__FROM_GOAL, oldFromGoal, fromGoal));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Subhypotheses> getSubhypotheses()
  {
		if (subhypotheses == null) {
			subhypotheses = new EObjectContainmentEList<Subhypotheses>(Subhypotheses.class, this, ExpDslv2Package.HYPOTHESES__SUBHYPOTHESES);
		}
		return subhypotheses;
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
			case ExpDslv2Package.HYPOTHESES__SUBHYPOTHESES:
				return ((InternalEList<?>)getSubhypotheses()).basicRemove(otherEnd, msgs);
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
			case ExpDslv2Package.HYPOTHESES__NAME:
				return getName();
			case ExpDslv2Package.HYPOTHESES__DESCRIPTION:
				return getDescription();
			case ExpDslv2Package.HYPOTHESES__TYPE:
				return getType();
			case ExpDslv2Package.HYPOTHESES__FROM_GOAL:
				if (resolve) return getFromGoal();
				return basicGetFromGoal();
			case ExpDslv2Package.HYPOTHESES__SUBHYPOTHESES:
				return getSubhypotheses();
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
			case ExpDslv2Package.HYPOTHESES__NAME:
				setName((String)newValue);
				return;
			case ExpDslv2Package.HYPOTHESES__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ExpDslv2Package.HYPOTHESES__TYPE:
				setType((HypothesisType)newValue);
				return;
			case ExpDslv2Package.HYPOTHESES__FROM_GOAL:
				setFromGoal((Goal)newValue);
				return;
			case ExpDslv2Package.HYPOTHESES__SUBHYPOTHESES:
				getSubhypotheses().clear();
				getSubhypotheses().addAll((Collection<? extends Subhypotheses>)newValue);
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
			case ExpDslv2Package.HYPOTHESES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExpDslv2Package.HYPOTHESES__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ExpDslv2Package.HYPOTHESES__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ExpDslv2Package.HYPOTHESES__FROM_GOAL:
				setFromGoal((Goal)null);
				return;
			case ExpDslv2Package.HYPOTHESES__SUBHYPOTHESES:
				getSubhypotheses().clear();
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
			case ExpDslv2Package.HYPOTHESES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExpDslv2Package.HYPOTHESES__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ExpDslv2Package.HYPOTHESES__TYPE:
				return type != TYPE_EDEFAULT;
			case ExpDslv2Package.HYPOTHESES__FROM_GOAL:
				return fromGoal != null;
			case ExpDslv2Package.HYPOTHESES__SUBHYPOTHESES:
				return subhypotheses != null && !subhypotheses.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //HypothesesImpl

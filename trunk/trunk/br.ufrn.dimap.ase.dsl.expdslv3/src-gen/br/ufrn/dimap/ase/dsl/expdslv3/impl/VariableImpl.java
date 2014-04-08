/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3.impl;

import br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package;
import br.ufrn.dimap.ase.dsl.expdslv3.Range;
import br.ufrn.dimap.ase.dsl.expdslv3.ScaleType;
import br.ufrn.dimap.ase.dsl.expdslv3.Variable;

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
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.VariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.VariableImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.VariableImpl#getScaleType <em>Scale Type</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.VariableImpl#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends MinimalEObjectImpl.Container implements Variable
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
   * The default value of the '{@link #getScaleType() <em>Scale Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScaleType()
   * @generated
   * @ordered
   */
  protected static final ScaleType SCALE_TYPE_EDEFAULT = ScaleType.NUMERICIAL;

  /**
   * The cached value of the '{@link #getScaleType() <em>Scale Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScaleType()
   * @generated
   * @ordered
   */
  protected ScaleType scaleType = SCALE_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected EList<Range> range;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableImpl()
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
    return Expdslv3Package.Literals.VARIABLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.VARIABLE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.VARIABLE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScaleType getScaleType()
  {
    return scaleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScaleType(ScaleType newScaleType)
  {
    ScaleType oldScaleType = scaleType;
    scaleType = newScaleType == null ? SCALE_TYPE_EDEFAULT : newScaleType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.VARIABLE__SCALE_TYPE, oldScaleType, scaleType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Range> getRange()
  {
    if (range == null)
    {
      range = new EObjectContainmentEList<Range>(Range.class, this, Expdslv3Package.VARIABLE__RANGE);
    }
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Expdslv3Package.VARIABLE__RANGE:
        return ((InternalEList<?>)getRange()).basicRemove(otherEnd, msgs);
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
    switch (featureID)
    {
      case Expdslv3Package.VARIABLE__NAME:
        return getName();
      case Expdslv3Package.VARIABLE__DESCRIPTION:
        return getDescription();
      case Expdslv3Package.VARIABLE__SCALE_TYPE:
        return getScaleType();
      case Expdslv3Package.VARIABLE__RANGE:
        return getRange();
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
    switch (featureID)
    {
      case Expdslv3Package.VARIABLE__NAME:
        setName((String)newValue);
        return;
      case Expdslv3Package.VARIABLE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case Expdslv3Package.VARIABLE__SCALE_TYPE:
        setScaleType((ScaleType)newValue);
        return;
      case Expdslv3Package.VARIABLE__RANGE:
        getRange().clear();
        getRange().addAll((Collection<? extends Range>)newValue);
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
      case Expdslv3Package.VARIABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Expdslv3Package.VARIABLE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case Expdslv3Package.VARIABLE__SCALE_TYPE:
        setScaleType(SCALE_TYPE_EDEFAULT);
        return;
      case Expdslv3Package.VARIABLE__RANGE:
        getRange().clear();
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
      case Expdslv3Package.VARIABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Expdslv3Package.VARIABLE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case Expdslv3Package.VARIABLE__SCALE_TYPE:
        return scaleType != SCALE_TYPE_EDEFAULT;
      case Expdslv3Package.VARIABLE__RANGE:
        return range != null && !range.isEmpty();
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
    result.append(", scaleType: ");
    result.append(scaleType);
    result.append(')');
    return result.toString();
  }

} //VariableImpl

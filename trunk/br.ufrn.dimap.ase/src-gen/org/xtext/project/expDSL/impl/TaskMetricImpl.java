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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.project.expDSL.ColectType;
import org.xtext.project.expDSL.ExpDSLPackage;
import org.xtext.project.expDSL.MetricType;
import org.xtext.project.expDSL.MetricUnit;
import org.xtext.project.expDSL.TaskMetric;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.project.expDSL.impl.TaskMetricImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.impl.TaskMetricImpl#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.impl.TaskMetricImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.impl.TaskMetricImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.impl.TaskMetricImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.impl.TaskMetricImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.impl.TaskMetricImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.impl.TaskMetricImpl#getActivities <em>Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskMetricImpl extends MinimalEObjectImpl.Container implements TaskMetric
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
  protected org.xtext.project.expDSL.Process relatesTo;

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
  protected static final MetricType TYPE_EDEFAULT = MetricType.HARD_DATA;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected MetricType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getForm() <em>Form</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForm()
   * @generated
   * @ordered
   */
  protected static final ColectType FORM_EDEFAULT = ColectType.CONTINUOUS;

  /**
   * The cached value of the '{@link #getForm() <em>Form</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForm()
   * @generated
   * @ordered
   */
  protected ColectType form = FORM_EDEFAULT;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected static final MetricUnit UNIT_EDEFAULT = MetricUnit.MINUTES;

  /**
   * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected MetricUnit unit = UNIT_EDEFAULT;

  /**
   * The default value of the '{@link #getActivities() <em>Activities</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivities()
   * @generated
   * @ordered
   */
  protected static final String ACTIVITIES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getActivities() <em>Activities</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivities()
   * @generated
   * @ordered
   */
  protected String activities = ACTIVITIES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskMetricImpl()
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
    return ExpDSLPackage.Literals.TASK_METRIC;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ExpDSLPackage.TASK_METRIC__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.project.expDSL.Process getRelatesTo()
  {
    if (relatesTo != null && relatesTo.eIsProxy())
    {
      InternalEObject oldRelatesTo = (InternalEObject)relatesTo;
      relatesTo = (org.xtext.project.expDSL.Process)eResolveProxy(oldRelatesTo);
      if (relatesTo != oldRelatesTo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpDSLPackage.TASK_METRIC__RELATES_TO, oldRelatesTo, relatesTo));
      }
    }
    return relatesTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.project.expDSL.Process basicGetRelatesTo()
  {
    return relatesTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelatesTo(org.xtext.project.expDSL.Process newRelatesTo)
  {
    org.xtext.project.expDSL.Process oldRelatesTo = relatesTo;
    relatesTo = newRelatesTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpDSLPackage.TASK_METRIC__RELATES_TO, oldRelatesTo, relatesTo));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ExpDSLPackage.TASK_METRIC__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetricType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(MetricType newType)
  {
    MetricType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpDSLPackage.TASK_METRIC__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColectType getForm()
  {
    return form;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForm(ColectType newForm)
  {
    ColectType oldForm = form;
    form = newForm == null ? FORM_EDEFAULT : newForm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpDSLPackage.TASK_METRIC__FORM, oldForm, form));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpDSLPackage.TASK_METRIC__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetricUnit getUnit()
  {
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnit(MetricUnit newUnit)
  {
    MetricUnit oldUnit = unit;
    unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpDSLPackage.TASK_METRIC__UNIT, oldUnit, unit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getActivities()
  {
    return activities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActivities(String newActivities)
  {
    String oldActivities = activities;
    activities = newActivities;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpDSLPackage.TASK_METRIC__ACTIVITIES, oldActivities, activities));
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
      case ExpDSLPackage.TASK_METRIC__NAME:
        return getName();
      case ExpDSLPackage.TASK_METRIC__RELATES_TO:
        if (resolve) return getRelatesTo();
        return basicGetRelatesTo();
      case ExpDSLPackage.TASK_METRIC__DESCRIPTION:
        return getDescription();
      case ExpDSLPackage.TASK_METRIC__TYPE:
        return getType();
      case ExpDSLPackage.TASK_METRIC__FORM:
        return getForm();
      case ExpDSLPackage.TASK_METRIC__ID:
        return getId();
      case ExpDSLPackage.TASK_METRIC__UNIT:
        return getUnit();
      case ExpDSLPackage.TASK_METRIC__ACTIVITIES:
        return getActivities();
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
      case ExpDSLPackage.TASK_METRIC__NAME:
        setName((String)newValue);
        return;
      case ExpDSLPackage.TASK_METRIC__RELATES_TO:
        setRelatesTo((org.xtext.project.expDSL.Process)newValue);
        return;
      case ExpDSLPackage.TASK_METRIC__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case ExpDSLPackage.TASK_METRIC__TYPE:
        setType((MetricType)newValue);
        return;
      case ExpDSLPackage.TASK_METRIC__FORM:
        setForm((ColectType)newValue);
        return;
      case ExpDSLPackage.TASK_METRIC__ID:
        setId((String)newValue);
        return;
      case ExpDSLPackage.TASK_METRIC__UNIT:
        setUnit((MetricUnit)newValue);
        return;
      case ExpDSLPackage.TASK_METRIC__ACTIVITIES:
        setActivities((String)newValue);
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
      case ExpDSLPackage.TASK_METRIC__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ExpDSLPackage.TASK_METRIC__RELATES_TO:
        setRelatesTo((org.xtext.project.expDSL.Process)null);
        return;
      case ExpDSLPackage.TASK_METRIC__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case ExpDSLPackage.TASK_METRIC__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case ExpDSLPackage.TASK_METRIC__FORM:
        setForm(FORM_EDEFAULT);
        return;
      case ExpDSLPackage.TASK_METRIC__ID:
        setId(ID_EDEFAULT);
        return;
      case ExpDSLPackage.TASK_METRIC__UNIT:
        setUnit(UNIT_EDEFAULT);
        return;
      case ExpDSLPackage.TASK_METRIC__ACTIVITIES:
        setActivities(ACTIVITIES_EDEFAULT);
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
      case ExpDSLPackage.TASK_METRIC__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ExpDSLPackage.TASK_METRIC__RELATES_TO:
        return relatesTo != null;
      case ExpDSLPackage.TASK_METRIC__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case ExpDSLPackage.TASK_METRIC__TYPE:
        return type != TYPE_EDEFAULT;
      case ExpDSLPackage.TASK_METRIC__FORM:
        return form != FORM_EDEFAULT;
      case ExpDSLPackage.TASK_METRIC__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ExpDSLPackage.TASK_METRIC__UNIT:
        return unit != UNIT_EDEFAULT;
      case ExpDSLPackage.TASK_METRIC__ACTIVITIES:
        return ACTIVITIES_EDEFAULT == null ? activities != null : !ACTIVITIES_EDEFAULT.equals(activities);
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
    result.append(", form: ");
    result.append(form);
    result.append(", id: ");
    result.append(id);
    result.append(", unit: ");
    result.append(unit);
    result.append(", activities: ");
    result.append(activities);
    result.append(')');
    return result.toString();
  }

} //TaskMetricImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31.impl;

import java.util.Collection;
import jpdl31.Jpdl31Package;
import jpdl31.Metric;

import jpdl31.MetricType;
import jpdl31.ProcessDefinitionType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jpdl31.impl.MetricImpl#getName <em>Name</em>}</li>
 *   <li>{@link jpdl31.impl.MetricImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link jpdl31.impl.MetricImpl#getType <em>Type</em>}</li>
 *   <li>{@link jpdl31.impl.MetricImpl#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link jpdl31.impl.MetricImpl#getRefname <em>Refname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetricImpl extends EObjectImpl implements Metric {
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
	protected static final MetricType TYPE_EDEFAULT = MetricType.TIME;

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
	 * The cached value of the '{@link #getRelatesTo() <em>Relates To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessDefinitionType> relatesTo;

	/**
	 * The default value of the '{@link #getRefname() <em>Refname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefname()
	 * @generated
	 * @ordered
	 */
	protected static final String REFNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefname() <em>Refname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefname()
	 * @generated
	 * @ordered
	 */
	protected String refname = REFNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jpdl31Package.Literals.METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.METRIC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.METRIC__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MetricType newType) {
		MetricType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.METRIC__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessDefinitionType> getRelatesTo() {
		if (relatesTo == null) {
			relatesTo = new EObjectResolvingEList<ProcessDefinitionType>(ProcessDefinitionType.class, this, Jpdl31Package.METRIC__RELATES_TO);
		}
		return relatesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefname() {
		return refname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefname(String newRefname) {
		String oldRefname = refname;
		refname = newRefname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jpdl31Package.METRIC__REFNAME, oldRefname, refname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Jpdl31Package.METRIC__NAME:
				return getName();
			case Jpdl31Package.METRIC__DESCRIPTION:
				return getDescription();
			case Jpdl31Package.METRIC__TYPE:
				return getType();
			case Jpdl31Package.METRIC__RELATES_TO:
				return getRelatesTo();
			case Jpdl31Package.METRIC__REFNAME:
				return getRefname();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Jpdl31Package.METRIC__NAME:
				setName((String)newValue);
				return;
			case Jpdl31Package.METRIC__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Jpdl31Package.METRIC__TYPE:
				setType((MetricType)newValue);
				return;
			case Jpdl31Package.METRIC__RELATES_TO:
				getRelatesTo().clear();
				getRelatesTo().addAll((Collection<? extends ProcessDefinitionType>)newValue);
				return;
			case Jpdl31Package.METRIC__REFNAME:
				setRefname((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case Jpdl31Package.METRIC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Jpdl31Package.METRIC__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Jpdl31Package.METRIC__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Jpdl31Package.METRIC__RELATES_TO:
				getRelatesTo().clear();
				return;
			case Jpdl31Package.METRIC__REFNAME:
				setRefname(REFNAME_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Jpdl31Package.METRIC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Jpdl31Package.METRIC__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Jpdl31Package.METRIC__TYPE:
				return type != TYPE_EDEFAULT;
			case Jpdl31Package.METRIC__RELATES_TO:
				return relatesTo != null && !relatesTo.isEmpty();
			case Jpdl31Package.METRIC__REFNAME:
				return REFNAME_EDEFAULT == null ? refname != null : !REFNAME_EDEFAULT.equals(refname);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", type: ");
		result.append(type);
		result.append(", refname: ");
		result.append(refname);
		result.append(')');
		return result.toString();
	}

} //MetricImpl

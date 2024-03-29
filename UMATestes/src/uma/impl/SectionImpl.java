/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uma.Section;
import uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uma.impl.SectionImpl#getSectionName <em>Section Name</em>}</li>
 *   <li>{@link uma.impl.SectionImpl#getSectionDescription <em>Section Description</em>}</li>
 *   <li>{@link uma.impl.SectionImpl#getSubSections <em>Sub Sections</em>}</li>
 *   <li>{@link uma.impl.SectionImpl#getPredecessor <em>Predecessor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SectionImpl extends VariabilityElementImpl implements Section {
	/**
	 * The default value of the '{@link #getSectionName() <em>Section Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionName()
	 * @generated
	 * @ordered
	 */
	protected static final String SECTION_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSectionName() <em>Section Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionName()
	 * @generated
	 * @ordered
	 */
	protected String sectionName = SECTION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSectionDescription() <em>Section Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SECTION_DESCRIPTION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSectionDescription() <em>Section Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionDescription()
	 * @generated
	 * @ordered
	 */
	protected String sectionDescription = SECTION_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubSections() <em>Sub Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSections()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> subSections;

	/**
	 * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected Section predecessor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSectionName() {
		return sectionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionName(String newSectionName) {
		String oldSectionName = sectionName;
		sectionName = newSectionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.SECTION__SECTION_NAME, oldSectionName, sectionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSectionDescription() {
		return sectionDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionDescription(String newSectionDescription) {
		String oldSectionDescription = sectionDescription;
		sectionDescription = newSectionDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.SECTION__SECTION_DESCRIPTION, oldSectionDescription, sectionDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getSubSections() {
		if (subSections == null) {
			subSections = new EObjectContainmentEList<Section>(Section.class, this, UmaPackage.SECTION__SUB_SECTIONS);
		}
		return subSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section getPredecessor() {
		if (predecessor != null && predecessor.eIsProxy()) {
			InternalEObject oldPredecessor = (InternalEObject)predecessor;
			predecessor = (Section)eResolveProxy(oldPredecessor);
			if (predecessor != oldPredecessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmaPackage.SECTION__PREDECESSOR, oldPredecessor, predecessor));
			}
		}
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section basicGetPredecessor() {
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredecessor(Section newPredecessor) {
		Section oldPredecessor = predecessor;
		predecessor = newPredecessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.SECTION__PREDECESSOR, oldPredecessor, predecessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmaPackage.SECTION__SUB_SECTIONS:
				return ((InternalEList<?>)getSubSections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.SECTION__SECTION_NAME:
				return getSectionName();
			case UmaPackage.SECTION__SECTION_DESCRIPTION:
				return getSectionDescription();
			case UmaPackage.SECTION__SUB_SECTIONS:
				return getSubSections();
			case UmaPackage.SECTION__PREDECESSOR:
				if (resolve) return getPredecessor();
				return basicGetPredecessor();
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
			case UmaPackage.SECTION__SECTION_NAME:
				setSectionName((String)newValue);
				return;
			case UmaPackage.SECTION__SECTION_DESCRIPTION:
				setSectionDescription((String)newValue);
				return;
			case UmaPackage.SECTION__SUB_SECTIONS:
				getSubSections().clear();
				getSubSections().addAll((Collection<? extends Section>)newValue);
				return;
			case UmaPackage.SECTION__PREDECESSOR:
				setPredecessor((Section)newValue);
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
			case UmaPackage.SECTION__SECTION_NAME:
				setSectionName(SECTION_NAME_EDEFAULT);
				return;
			case UmaPackage.SECTION__SECTION_DESCRIPTION:
				setSectionDescription(SECTION_DESCRIPTION_EDEFAULT);
				return;
			case UmaPackage.SECTION__SUB_SECTIONS:
				getSubSections().clear();
				return;
			case UmaPackage.SECTION__PREDECESSOR:
				setPredecessor((Section)null);
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
			case UmaPackage.SECTION__SECTION_NAME:
				return SECTION_NAME_EDEFAULT == null ? sectionName != null : !SECTION_NAME_EDEFAULT.equals(sectionName);
			case UmaPackage.SECTION__SECTION_DESCRIPTION:
				return SECTION_DESCRIPTION_EDEFAULT == null ? sectionDescription != null : !SECTION_DESCRIPTION_EDEFAULT.equals(sectionDescription);
			case UmaPackage.SECTION__SUB_SECTIONS:
				return subSections != null && !subSections.isEmpty();
			case UmaPackage.SECTION__PREDECESSOR:
				return predecessor != null;
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
		result.append(" (sectionName: ");
		result.append(sectionName);
		result.append(", sectionDescription: ");
		result.append(sectionDescription);
		result.append(')');
		return result.toString();
	}

} //SectionImpl

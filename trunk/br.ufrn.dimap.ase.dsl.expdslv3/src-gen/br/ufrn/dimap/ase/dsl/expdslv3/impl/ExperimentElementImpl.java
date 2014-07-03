/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3.impl;

import br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package;
import br.ufrn.dimap.ase.dsl.expdslv3.ExperimentElement;
import br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign;
import br.ufrn.dimap.ase.dsl.expdslv3.Questionnaire;

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
 * An implementation of the model object '<em><b>Experiment Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentElementImpl#getExperiments <em>Experiments</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentElementImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentElementImpl#getQuestionnaire <em>Questionnaire</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentElementImpl extends MinimalEObjectImpl.Container implements ExperimentElement
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
	 * The cached value of the '{@link #getExperiments() <em>Experiments</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getExperiments()
	 * @generated
	 * @ordered
	 */
  protected ExperimentalDesign experiments;

  /**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
  protected EList<br.ufrn.dimap.ase.dsl.expdslv3.Process> process;

  /**
	 * The cached value of the '{@link #getQuestionnaire() <em>Questionnaire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getQuestionnaire()
	 * @generated
	 * @ordered
	 */
  protected EList<Questionnaire> questionnaire;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ExperimentElementImpl()
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
		return Expdslv3Package.Literals.EXPERIMENT_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.EXPERIMENT_ELEMENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.EXPERIMENT_ELEMENT__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ExperimentalDesign getExperiments()
  {
		return experiments;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetExperiments(ExperimentalDesign newExperiments, NotificationChain msgs)
  {
		ExperimentalDesign oldExperiments = experiments;
		experiments = newExperiments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Expdslv3Package.EXPERIMENT_ELEMENT__EXPERIMENTS, oldExperiments, newExperiments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setExperiments(ExperimentalDesign newExperiments)
  {
		if (newExperiments != experiments) {
			NotificationChain msgs = null;
			if (experiments != null)
				msgs = ((InternalEObject)experiments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Expdslv3Package.EXPERIMENT_ELEMENT__EXPERIMENTS, null, msgs);
			if (newExperiments != null)
				msgs = ((InternalEObject)newExperiments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Expdslv3Package.EXPERIMENT_ELEMENT__EXPERIMENTS, null, msgs);
			msgs = basicSetExperiments(newExperiments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.EXPERIMENT_ELEMENT__EXPERIMENTS, newExperiments, newExperiments));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<br.ufrn.dimap.ase.dsl.expdslv3.Process> getProcess()
  {
		if (process == null) {
			process = new EObjectContainmentEList<br.ufrn.dimap.ase.dsl.expdslv3.Process>(br.ufrn.dimap.ase.dsl.expdslv3.Process.class, this, Expdslv3Package.EXPERIMENT_ELEMENT__PROCESS);
		}
		return process;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Questionnaire> getQuestionnaire()
  {
		if (questionnaire == null) {
			questionnaire = new EObjectContainmentEList<Questionnaire>(Questionnaire.class, this, Expdslv3Package.EXPERIMENT_ELEMENT__QUESTIONNAIRE);
		}
		return questionnaire;
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
			case Expdslv3Package.EXPERIMENT_ELEMENT__EXPERIMENTS:
				return basicSetExperiments(null, msgs);
			case Expdslv3Package.EXPERIMENT_ELEMENT__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
			case Expdslv3Package.EXPERIMENT_ELEMENT__QUESTIONNAIRE:
				return ((InternalEList<?>)getQuestionnaire()).basicRemove(otherEnd, msgs);
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
			case Expdslv3Package.EXPERIMENT_ELEMENT__NAME:
				return getName();
			case Expdslv3Package.EXPERIMENT_ELEMENT__DESCRIPTION:
				return getDescription();
			case Expdslv3Package.EXPERIMENT_ELEMENT__EXPERIMENTS:
				return getExperiments();
			case Expdslv3Package.EXPERIMENT_ELEMENT__PROCESS:
				return getProcess();
			case Expdslv3Package.EXPERIMENT_ELEMENT__QUESTIONNAIRE:
				return getQuestionnaire();
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
			case Expdslv3Package.EXPERIMENT_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case Expdslv3Package.EXPERIMENT_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Expdslv3Package.EXPERIMENT_ELEMENT__EXPERIMENTS:
				setExperiments((ExperimentalDesign)newValue);
				return;
			case Expdslv3Package.EXPERIMENT_ELEMENT__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends br.ufrn.dimap.ase.dsl.expdslv3.Process>)newValue);
				return;
			case Expdslv3Package.EXPERIMENT_ELEMENT__QUESTIONNAIRE:
				getQuestionnaire().clear();
				getQuestionnaire().addAll((Collection<? extends Questionnaire>)newValue);
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
			case Expdslv3Package.EXPERIMENT_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Expdslv3Package.EXPERIMENT_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Expdslv3Package.EXPERIMENT_ELEMENT__EXPERIMENTS:
				setExperiments((ExperimentalDesign)null);
				return;
			case Expdslv3Package.EXPERIMENT_ELEMENT__PROCESS:
				getProcess().clear();
				return;
			case Expdslv3Package.EXPERIMENT_ELEMENT__QUESTIONNAIRE:
				getQuestionnaire().clear();
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
			case Expdslv3Package.EXPERIMENT_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Expdslv3Package.EXPERIMENT_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Expdslv3Package.EXPERIMENT_ELEMENT__EXPERIMENTS:
				return experiments != null;
			case Expdslv3Package.EXPERIMENT_ELEMENT__PROCESS:
				return process != null && !process.isEmpty();
			case Expdslv3Package.EXPERIMENT_ELEMENT__QUESTIONNAIRE:
				return questionnaire != null && !questionnaire.isEmpty();
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

} //ExperimentElementImpl

/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2.impl;

import br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package;
import br.ufrn.dimap.ase.dsl.expDslv2.ExperimentElement;
import br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan;
import br.ufrn.dimap.ase.dsl.expDslv2.Metrics;
import br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire;

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
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ExperimentElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ExperimentElementImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ExperimentElementImpl#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ExperimentElementImpl#getExperiments <em>Experiments</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ExperimentElementImpl#getQuestionnaire <em>Questionnaire</em>}</li>
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
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
  protected EList<br.ufrn.dimap.ase.dsl.expDslv2.Process> process;

  /**
	 * The cached value of the '{@link #getMetrics() <em>Metrics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
  protected EList<Metrics> metrics;

  /**
	 * The cached value of the '{@link #getExperiments() <em>Experiments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getExperiments()
	 * @generated
	 * @ordered
	 */
  protected EList<ExperimentalPlan> experiments;

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
		return ExpDslv2Package.Literals.EXPERIMENT_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.EXPERIMENT_ELEMENT__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<br.ufrn.dimap.ase.dsl.expDslv2.Process> getProcess()
  {
		if (process == null) {
			process = new EObjectContainmentEList<br.ufrn.dimap.ase.dsl.expDslv2.Process>(br.ufrn.dimap.ase.dsl.expDslv2.Process.class, this, ExpDslv2Package.EXPERIMENT_ELEMENT__PROCESS);
		}
		return process;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Metrics> getMetrics()
  {
		if (metrics == null) {
			metrics = new EObjectContainmentEList<Metrics>(Metrics.class, this, ExpDslv2Package.EXPERIMENT_ELEMENT__METRICS);
		}
		return metrics;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ExperimentalPlan> getExperiments()
  {
		if (experiments == null) {
			experiments = new EObjectContainmentEList<ExperimentalPlan>(ExperimentalPlan.class, this, ExpDslv2Package.EXPERIMENT_ELEMENT__EXPERIMENTS);
		}
		return experiments;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Questionnaire> getQuestionnaire()
  {
		if (questionnaire == null) {
			questionnaire = new EObjectContainmentEList<Questionnaire>(Questionnaire.class, this, ExpDslv2Package.EXPERIMENT_ELEMENT__QUESTIONNAIRE);
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
			case ExpDslv2Package.EXPERIMENT_ELEMENT__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
			case ExpDslv2Package.EXPERIMENT_ELEMENT__METRICS:
				return ((InternalEList<?>)getMetrics()).basicRemove(otherEnd, msgs);
			case ExpDslv2Package.EXPERIMENT_ELEMENT__EXPERIMENTS:
				return ((InternalEList<?>)getExperiments()).basicRemove(otherEnd, msgs);
			case ExpDslv2Package.EXPERIMENT_ELEMENT__QUESTIONNAIRE:
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
			case ExpDslv2Package.EXPERIMENT_ELEMENT__NAME:
				return getName();
			case ExpDslv2Package.EXPERIMENT_ELEMENT__PROCESS:
				return getProcess();
			case ExpDslv2Package.EXPERIMENT_ELEMENT__METRICS:
				return getMetrics();
			case ExpDslv2Package.EXPERIMENT_ELEMENT__EXPERIMENTS:
				return getExperiments();
			case ExpDslv2Package.EXPERIMENT_ELEMENT__QUESTIONNAIRE:
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
			case ExpDslv2Package.EXPERIMENT_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case ExpDslv2Package.EXPERIMENT_ELEMENT__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends br.ufrn.dimap.ase.dsl.expDslv2.Process>)newValue);
				return;
			case ExpDslv2Package.EXPERIMENT_ELEMENT__METRICS:
				getMetrics().clear();
				getMetrics().addAll((Collection<? extends Metrics>)newValue);
				return;
			case ExpDslv2Package.EXPERIMENT_ELEMENT__EXPERIMENTS:
				getExperiments().clear();
				getExperiments().addAll((Collection<? extends ExperimentalPlan>)newValue);
				return;
			case ExpDslv2Package.EXPERIMENT_ELEMENT__QUESTIONNAIRE:
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
			case ExpDslv2Package.EXPERIMENT_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExpDslv2Package.EXPERIMENT_ELEMENT__PROCESS:
				getProcess().clear();
				return;
			case ExpDslv2Package.EXPERIMENT_ELEMENT__METRICS:
				getMetrics().clear();
				return;
			case ExpDslv2Package.EXPERIMENT_ELEMENT__EXPERIMENTS:
				getExperiments().clear();
				return;
			case ExpDslv2Package.EXPERIMENT_ELEMENT__QUESTIONNAIRE:
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
			case ExpDslv2Package.EXPERIMENT_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExpDslv2Package.EXPERIMENT_ELEMENT__PROCESS:
				return process != null && !process.isEmpty();
			case ExpDslv2Package.EXPERIMENT_ELEMENT__METRICS:
				return metrics != null && !metrics.isEmpty();
			case ExpDslv2Package.EXPERIMENT_ELEMENT__EXPERIMENTS:
				return experiments != null && !experiments.isEmpty();
			case ExpDslv2Package.EXPERIMENT_ELEMENT__QUESTIONNAIRE:
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
		result.append(')');
		return result.toString();
	}

} //ExperimentElementImpl

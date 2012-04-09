/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.project.expDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.project.expDSL.ExpDSLPackage;
import org.xtext.project.expDSL.ExperimentElement;
import org.xtext.project.expDSL.ExperimentalPlan;
import org.xtext.project.expDSL.Question;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experiment Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.project.expDSL.impl.ExperimentElementImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.impl.ExperimentElementImpl#getExperiments <em>Experiments</em>}</li>
 *   <li>{@link org.xtext.project.expDSL.impl.ExperimentElementImpl#getQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentElementImpl extends MinimalEObjectImpl.Container implements ExperimentElement
{
  /**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
  protected EList<org.xtext.project.expDSL.Process> process;

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
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
  protected EList<Question> question;

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
		return ExpDSLPackage.Literals.EXPERIMENT_ELEMENT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<org.xtext.project.expDSL.Process> getProcess()
  {
		if (process == null) {
			process = new EObjectContainmentEList<org.xtext.project.expDSL.Process>(org.xtext.project.expDSL.Process.class, this, ExpDSLPackage.EXPERIMENT_ELEMENT__PROCESS);
		}
		return process;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ExperimentalPlan> getExperiments()
  {
		if (experiments == null) {
			experiments = new EObjectContainmentEList<ExperimentalPlan>(ExperimentalPlan.class, this, ExpDSLPackage.EXPERIMENT_ELEMENT__EXPERIMENTS);
		}
		return experiments;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Question> getQuestion()
  {
		if (question == null) {
			question = new EObjectContainmentEList<Question>(Question.class, this, ExpDSLPackage.EXPERIMENT_ELEMENT__QUESTION);
		}
		return question;
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
			case ExpDSLPackage.EXPERIMENT_ELEMENT__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
			case ExpDSLPackage.EXPERIMENT_ELEMENT__EXPERIMENTS:
				return ((InternalEList<?>)getExperiments()).basicRemove(otherEnd, msgs);
			case ExpDSLPackage.EXPERIMENT_ELEMENT__QUESTION:
				return ((InternalEList<?>)getQuestion()).basicRemove(otherEnd, msgs);
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
			case ExpDSLPackage.EXPERIMENT_ELEMENT__PROCESS:
				return getProcess();
			case ExpDSLPackage.EXPERIMENT_ELEMENT__EXPERIMENTS:
				return getExperiments();
			case ExpDSLPackage.EXPERIMENT_ELEMENT__QUESTION:
				return getQuestion();
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
			case ExpDSLPackage.EXPERIMENT_ELEMENT__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends org.xtext.project.expDSL.Process>)newValue);
				return;
			case ExpDSLPackage.EXPERIMENT_ELEMENT__EXPERIMENTS:
				getExperiments().clear();
				getExperiments().addAll((Collection<? extends ExperimentalPlan>)newValue);
				return;
			case ExpDSLPackage.EXPERIMENT_ELEMENT__QUESTION:
				getQuestion().clear();
				getQuestion().addAll((Collection<? extends Question>)newValue);
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
			case ExpDSLPackage.EXPERIMENT_ELEMENT__PROCESS:
				getProcess().clear();
				return;
			case ExpDSLPackage.EXPERIMENT_ELEMENT__EXPERIMENTS:
				getExperiments().clear();
				return;
			case ExpDSLPackage.EXPERIMENT_ELEMENT__QUESTION:
				getQuestion().clear();
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
			case ExpDSLPackage.EXPERIMENT_ELEMENT__PROCESS:
				return process != null && !process.isEmpty();
			case ExpDSLPackage.EXPERIMENT_ELEMENT__EXPERIMENTS:
				return experiments != null && !experiments.isEmpty();
			case ExpDSLPackage.EXPERIMENT_ELEMENT__QUESTION:
				return question != null && !question.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExperimentElementImpl

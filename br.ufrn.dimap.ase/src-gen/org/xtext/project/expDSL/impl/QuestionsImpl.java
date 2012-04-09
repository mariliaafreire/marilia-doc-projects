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
import org.xtext.project.expDSL.Question;
import org.xtext.project.expDSL.Questions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.project.expDSL.impl.QuestionsImpl#getQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionsImpl extends MinimalEObjectImpl.Container implements Questions
{
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
  protected QuestionsImpl()
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
		return ExpDSLPackage.Literals.QUESTIONS;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Question> getQuestion()
  {
		if (question == null) {
			question = new EObjectContainmentEList<Question>(Question.class, this, ExpDSLPackage.QUESTIONS__QUESTION);
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
			case ExpDSLPackage.QUESTIONS__QUESTION:
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
			case ExpDSLPackage.QUESTIONS__QUESTION:
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
			case ExpDSLPackage.QUESTIONS__QUESTION:
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
			case ExpDSLPackage.QUESTIONS__QUESTION:
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
			case ExpDSLPackage.QUESTIONS__QUESTION:
				return question != null && !question.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionsImpl

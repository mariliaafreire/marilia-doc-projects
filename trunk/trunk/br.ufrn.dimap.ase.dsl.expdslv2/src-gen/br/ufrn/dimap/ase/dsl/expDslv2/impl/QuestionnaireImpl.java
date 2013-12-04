/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2.impl;

import br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package;
import br.ufrn.dimap.ase.dsl.expDslv2.Question;
import br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire;
import br.ufrn.dimap.ase.dsl.expDslv2.QuestionnaireType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.QuestionnaireImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.QuestionnaireImpl#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.QuestionnaireImpl#getQuestionnaireType <em>Questionnaire Type</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.QuestionnaireImpl#getQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionnaireImpl extends MinimalEObjectImpl.Container implements Questionnaire
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
	 * The cached value of the '{@link #getRelatesTo() <em>Relates To</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRelatesTo()
	 * @generated
	 * @ordered
	 */
  protected EList<br.ufrn.dimap.ase.dsl.expDslv2.Process> relatesTo;

  /**
	 * The default value of the '{@link #getQuestionnaireType() <em>Questionnaire Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getQuestionnaireType()
	 * @generated
	 * @ordered
	 */
  protected static final QuestionnaireType QUESTIONNAIRE_TYPE_EDEFAULT = QuestionnaireType.PRE;

  /**
	 * The cached value of the '{@link #getQuestionnaireType() <em>Questionnaire Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getQuestionnaireType()
	 * @generated
	 * @ordered
	 */
  protected QuestionnaireType questionnaireType = QUESTIONNAIRE_TYPE_EDEFAULT;

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
  protected QuestionnaireImpl()
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
		return ExpDslv2Package.Literals.QUESTIONNAIRE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.QUESTIONNAIRE__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<br.ufrn.dimap.ase.dsl.expDslv2.Process> getRelatesTo()
  {
		if (relatesTo == null) {
			relatesTo = new EObjectResolvingEList<br.ufrn.dimap.ase.dsl.expDslv2.Process>(br.ufrn.dimap.ase.dsl.expDslv2.Process.class, this, ExpDslv2Package.QUESTIONNAIRE__RELATES_TO);
		}
		return relatesTo;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public QuestionnaireType getQuestionnaireType()
  {
		return questionnaireType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setQuestionnaireType(QuestionnaireType newQuestionnaireType)
  {
		QuestionnaireType oldQuestionnaireType = questionnaireType;
		questionnaireType = newQuestionnaireType == null ? QUESTIONNAIRE_TYPE_EDEFAULT : newQuestionnaireType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.QUESTIONNAIRE__QUESTIONNAIRE_TYPE, oldQuestionnaireType, questionnaireType));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Question> getQuestion()
  {
		if (question == null) {
			question = new EObjectContainmentEList<Question>(Question.class, this, ExpDslv2Package.QUESTIONNAIRE__QUESTION);
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
			case ExpDslv2Package.QUESTIONNAIRE__QUESTION:
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
			case ExpDslv2Package.QUESTIONNAIRE__NAME:
				return getName();
			case ExpDslv2Package.QUESTIONNAIRE__RELATES_TO:
				return getRelatesTo();
			case ExpDslv2Package.QUESTIONNAIRE__QUESTIONNAIRE_TYPE:
				return getQuestionnaireType();
			case ExpDslv2Package.QUESTIONNAIRE__QUESTION:
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
			case ExpDslv2Package.QUESTIONNAIRE__NAME:
				setName((String)newValue);
				return;
			case ExpDslv2Package.QUESTIONNAIRE__RELATES_TO:
				getRelatesTo().clear();
				getRelatesTo().addAll((Collection<? extends br.ufrn.dimap.ase.dsl.expDslv2.Process>)newValue);
				return;
			case ExpDslv2Package.QUESTIONNAIRE__QUESTIONNAIRE_TYPE:
				setQuestionnaireType((QuestionnaireType)newValue);
				return;
			case ExpDslv2Package.QUESTIONNAIRE__QUESTION:
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
			case ExpDslv2Package.QUESTIONNAIRE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExpDslv2Package.QUESTIONNAIRE__RELATES_TO:
				getRelatesTo().clear();
				return;
			case ExpDslv2Package.QUESTIONNAIRE__QUESTIONNAIRE_TYPE:
				setQuestionnaireType(QUESTIONNAIRE_TYPE_EDEFAULT);
				return;
			case ExpDslv2Package.QUESTIONNAIRE__QUESTION:
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
			case ExpDslv2Package.QUESTIONNAIRE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExpDslv2Package.QUESTIONNAIRE__RELATES_TO:
				return relatesTo != null && !relatesTo.isEmpty();
			case ExpDslv2Package.QUESTIONNAIRE__QUESTIONNAIRE_TYPE:
				return questionnaireType != QUESTIONNAIRE_TYPE_EDEFAULT;
			case ExpDslv2Package.QUESTIONNAIRE__QUESTION:
				return question != null && !question.isEmpty();
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
		result.append(", questionnaireType: ");
		result.append(questionnaireType);
		result.append(')');
		return result.toString();
	}

} //QuestionnaireImpl

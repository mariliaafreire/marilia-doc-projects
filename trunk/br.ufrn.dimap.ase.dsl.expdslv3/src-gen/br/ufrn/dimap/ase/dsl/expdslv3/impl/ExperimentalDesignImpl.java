/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3.impl;

import br.ufrn.dimap.ase.dsl.expdslv3.Abstract;
import br.ufrn.dimap.ase.dsl.expdslv3.Author;
import br.ufrn.dimap.ase.dsl.expdslv3.DOE;
import br.ufrn.dimap.ase.dsl.expdslv3.DepVariable;
import br.ufrn.dimap.ase.dsl.expdslv3.DesignType;
import br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package;
import br.ufrn.dimap.ase.dsl.expdslv3.ExperimentalDesign;
import br.ufrn.dimap.ase.dsl.expdslv3.Factor;
import br.ufrn.dimap.ase.dsl.expdslv3.Goal;
import br.ufrn.dimap.ase.dsl.expdslv3.Keyword;
import br.ufrn.dimap.ase.dsl.expdslv3.Parameter;
import br.ufrn.dimap.ase.dsl.expdslv3.ResearchHypothesis;
import br.ufrn.dimap.ase.dsl.expdslv3.ResearchQuestion;
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
 * An implementation of the model object '<em><b>Experimental Design</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentalDesignImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentalDesignImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentalDesignImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentalDesignImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentalDesignImpl#getResearchQuestion <em>Research Question</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentalDesignImpl#getResearchHypothesis <em>Research Hypothesis</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentalDesignImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentalDesignImpl#getDepVar <em>Dep Var</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentalDesignImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentalDesignImpl#getType <em>Type</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentalDesignImpl#getDoe <em>Doe</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.ExperimentalDesignImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentalDesignImpl extends MinimalEObjectImpl.Container implements ExperimentalDesign
{
  /**
   * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected EList<Author> author;

  /**
   * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstract()
   * @generated
   * @ordered
   */
  protected Abstract abstract_;

  /**
   * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyword()
   * @generated
   * @ordered
   */
  protected EList<Keyword> keyword;

  /**
   * The cached value of the '{@link #getGoal() <em>Goal</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoal()
   * @generated
   * @ordered
   */
  protected EList<Goal> goal;

  /**
   * The cached value of the '{@link #getResearchQuestion() <em>Research Question</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResearchQuestion()
   * @generated
   * @ordered
   */
  protected EList<ResearchQuestion> researchQuestion;

  /**
   * The cached value of the '{@link #getResearchHypothesis() <em>Research Hypothesis</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResearchHypothesis()
   * @generated
   * @ordered
   */
  protected EList<ResearchHypothesis> researchHypothesis;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected EList<Variable> variable;

  /**
   * The cached value of the '{@link #getDepVar() <em>Dep Var</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepVar()
   * @generated
   * @ordered
   */
  protected EList<DepVariable> depVar;

  /**
   * The cached value of the '{@link #getFactor() <em>Factor</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactor()
   * @generated
   * @ordered
   */
  protected EList<Factor> factor;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final DesignType TYPE_EDEFAULT = DesignType.CDR;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected DesignType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDoe() <em>Doe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoe()
   * @generated
   * @ordered
   */
  protected DOE doe;

  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExperimentalDesignImpl()
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
    return Expdslv3Package.Literals.EXPERIMENTAL_DESIGN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Author> getAuthor()
  {
    if (author == null)
    {
      author = new EObjectContainmentEList<Author>(Author.class, this, Expdslv3Package.EXPERIMENTAL_DESIGN__AUTHOR);
    }
    return author;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Abstract getAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbstract(Abstract newAbstract, NotificationChain msgs)
  {
    Abstract oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Expdslv3Package.EXPERIMENTAL_DESIGN__ABSTRACT, oldAbstract, newAbstract);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(Abstract newAbstract)
  {
    if (newAbstract != abstract_)
    {
      NotificationChain msgs = null;
      if (abstract_ != null)
        msgs = ((InternalEObject)abstract_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Expdslv3Package.EXPERIMENTAL_DESIGN__ABSTRACT, null, msgs);
      if (newAbstract != null)
        msgs = ((InternalEObject)newAbstract).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Expdslv3Package.EXPERIMENTAL_DESIGN__ABSTRACT, null, msgs);
      msgs = basicSetAbstract(newAbstract, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.EXPERIMENTAL_DESIGN__ABSTRACT, newAbstract, newAbstract));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Keyword> getKeyword()
  {
    if (keyword == null)
    {
      keyword = new EObjectContainmentEList<Keyword>(Keyword.class, this, Expdslv3Package.EXPERIMENTAL_DESIGN__KEYWORD);
    }
    return keyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Goal> getGoal()
  {
    if (goal == null)
    {
      goal = new EObjectContainmentEList<Goal>(Goal.class, this, Expdslv3Package.EXPERIMENTAL_DESIGN__GOAL);
    }
    return goal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ResearchQuestion> getResearchQuestion()
  {
    if (researchQuestion == null)
    {
      researchQuestion = new EObjectContainmentEList<ResearchQuestion>(ResearchQuestion.class, this, Expdslv3Package.EXPERIMENTAL_DESIGN__RESEARCH_QUESTION);
    }
    return researchQuestion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ResearchHypothesis> getResearchHypothesis()
  {
    if (researchHypothesis == null)
    {
      researchHypothesis = new EObjectContainmentEList<ResearchHypothesis>(ResearchHypothesis.class, this, Expdslv3Package.EXPERIMENTAL_DESIGN__RESEARCH_HYPOTHESIS);
    }
    return researchHypothesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getVariable()
  {
    if (variable == null)
    {
      variable = new EObjectContainmentEList<Variable>(Variable.class, this, Expdslv3Package.EXPERIMENTAL_DESIGN__VARIABLE);
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DepVariable> getDepVar()
  {
    if (depVar == null)
    {
      depVar = new EObjectContainmentEList<DepVariable>(DepVariable.class, this, Expdslv3Package.EXPERIMENTAL_DESIGN__DEP_VAR);
    }
    return depVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Factor> getFactor()
  {
    if (factor == null)
    {
      factor = new EObjectContainmentEList<Factor>(Factor.class, this, Expdslv3Package.EXPERIMENTAL_DESIGN__FACTOR);
    }
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DesignType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(DesignType newType)
  {
    DesignType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.EXPERIMENTAL_DESIGN__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DOE getDoe()
  {
    return doe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDoe(DOE newDoe, NotificationChain msgs)
  {
    DOE oldDoe = doe;
    doe = newDoe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Expdslv3Package.EXPERIMENTAL_DESIGN__DOE, oldDoe, newDoe);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoe(DOE newDoe)
  {
    if (newDoe != doe)
    {
      NotificationChain msgs = null;
      if (doe != null)
        msgs = ((InternalEObject)doe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Expdslv3Package.EXPERIMENTAL_DESIGN__DOE, null, msgs);
      if (newDoe != null)
        msgs = ((InternalEObject)newDoe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Expdslv3Package.EXPERIMENTAL_DESIGN__DOE, null, msgs);
      msgs = basicSetDoe(newDoe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.EXPERIMENTAL_DESIGN__DOE, newDoe, newDoe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParameter()
  {
    if (parameter == null)
    {
      parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, Expdslv3Package.EXPERIMENTAL_DESIGN__PARAMETER);
    }
    return parameter;
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
      case Expdslv3Package.EXPERIMENTAL_DESIGN__AUTHOR:
        return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
      case Expdslv3Package.EXPERIMENTAL_DESIGN__ABSTRACT:
        return basicSetAbstract(null, msgs);
      case Expdslv3Package.EXPERIMENTAL_DESIGN__KEYWORD:
        return ((InternalEList<?>)getKeyword()).basicRemove(otherEnd, msgs);
      case Expdslv3Package.EXPERIMENTAL_DESIGN__GOAL:
        return ((InternalEList<?>)getGoal()).basicRemove(otherEnd, msgs);
      case Expdslv3Package.EXPERIMENTAL_DESIGN__RESEARCH_QUESTION:
        return ((InternalEList<?>)getResearchQuestion()).basicRemove(otherEnd, msgs);
      case Expdslv3Package.EXPERIMENTAL_DESIGN__RESEARCH_HYPOTHESIS:
        return ((InternalEList<?>)getResearchHypothesis()).basicRemove(otherEnd, msgs);
      case Expdslv3Package.EXPERIMENTAL_DESIGN__VARIABLE:
        return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
      case Expdslv3Package.EXPERIMENTAL_DESIGN__DEP_VAR:
        return ((InternalEList<?>)getDepVar()).basicRemove(otherEnd, msgs);
      case Expdslv3Package.EXPERIMENTAL_DESIGN__FACTOR:
        return ((InternalEList<?>)getFactor()).basicRemove(otherEnd, msgs);
      case Expdslv3Package.EXPERIMENTAL_DESIGN__DOE:
        return basicSetDoe(null, msgs);
      case Expdslv3Package.EXPERIMENTAL_DESIGN__PARAMETER:
        return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
      case Expdslv3Package.EXPERIMENTAL_DESIGN__AUTHOR:
        return getAuthor();
      case Expdslv3Package.EXPERIMENTAL_DESIGN__ABSTRACT:
        return getAbstract();
      case Expdslv3Package.EXPERIMENTAL_DESIGN__KEYWORD:
        return getKeyword();
      case Expdslv3Package.EXPERIMENTAL_DESIGN__GOAL:
        return getGoal();
      case Expdslv3Package.EXPERIMENTAL_DESIGN__RESEARCH_QUESTION:
        return getResearchQuestion();
      case Expdslv3Package.EXPERIMENTAL_DESIGN__RESEARCH_HYPOTHESIS:
        return getResearchHypothesis();
      case Expdslv3Package.EXPERIMENTAL_DESIGN__VARIABLE:
        return getVariable();
      case Expdslv3Package.EXPERIMENTAL_DESIGN__DEP_VAR:
        return getDepVar();
      case Expdslv3Package.EXPERIMENTAL_DESIGN__FACTOR:
        return getFactor();
      case Expdslv3Package.EXPERIMENTAL_DESIGN__TYPE:
        return getType();
      case Expdslv3Package.EXPERIMENTAL_DESIGN__DOE:
        return getDoe();
      case Expdslv3Package.EXPERIMENTAL_DESIGN__PARAMETER:
        return getParameter();
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
      case Expdslv3Package.EXPERIMENTAL_DESIGN__AUTHOR:
        getAuthor().clear();
        getAuthor().addAll((Collection<? extends Author>)newValue);
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__ABSTRACT:
        setAbstract((Abstract)newValue);
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__KEYWORD:
        getKeyword().clear();
        getKeyword().addAll((Collection<? extends Keyword>)newValue);
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__GOAL:
        getGoal().clear();
        getGoal().addAll((Collection<? extends Goal>)newValue);
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__RESEARCH_QUESTION:
        getResearchQuestion().clear();
        getResearchQuestion().addAll((Collection<? extends ResearchQuestion>)newValue);
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__RESEARCH_HYPOTHESIS:
        getResearchHypothesis().clear();
        getResearchHypothesis().addAll((Collection<? extends ResearchHypothesis>)newValue);
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__VARIABLE:
        getVariable().clear();
        getVariable().addAll((Collection<? extends Variable>)newValue);
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__DEP_VAR:
        getDepVar().clear();
        getDepVar().addAll((Collection<? extends DepVariable>)newValue);
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__FACTOR:
        getFactor().clear();
        getFactor().addAll((Collection<? extends Factor>)newValue);
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__TYPE:
        setType((DesignType)newValue);
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__DOE:
        setDoe((DOE)newValue);
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__PARAMETER:
        getParameter().clear();
        getParameter().addAll((Collection<? extends Parameter>)newValue);
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
      case Expdslv3Package.EXPERIMENTAL_DESIGN__AUTHOR:
        getAuthor().clear();
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__ABSTRACT:
        setAbstract((Abstract)null);
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__KEYWORD:
        getKeyword().clear();
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__GOAL:
        getGoal().clear();
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__RESEARCH_QUESTION:
        getResearchQuestion().clear();
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__RESEARCH_HYPOTHESIS:
        getResearchHypothesis().clear();
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__VARIABLE:
        getVariable().clear();
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__DEP_VAR:
        getDepVar().clear();
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__FACTOR:
        getFactor().clear();
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__DOE:
        setDoe((DOE)null);
        return;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__PARAMETER:
        getParameter().clear();
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
      case Expdslv3Package.EXPERIMENTAL_DESIGN__AUTHOR:
        return author != null && !author.isEmpty();
      case Expdslv3Package.EXPERIMENTAL_DESIGN__ABSTRACT:
        return abstract_ != null;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__KEYWORD:
        return keyword != null && !keyword.isEmpty();
      case Expdslv3Package.EXPERIMENTAL_DESIGN__GOAL:
        return goal != null && !goal.isEmpty();
      case Expdslv3Package.EXPERIMENTAL_DESIGN__RESEARCH_QUESTION:
        return researchQuestion != null && !researchQuestion.isEmpty();
      case Expdslv3Package.EXPERIMENTAL_DESIGN__RESEARCH_HYPOTHESIS:
        return researchHypothesis != null && !researchHypothesis.isEmpty();
      case Expdslv3Package.EXPERIMENTAL_DESIGN__VARIABLE:
        return variable != null && !variable.isEmpty();
      case Expdslv3Package.EXPERIMENTAL_DESIGN__DEP_VAR:
        return depVar != null && !depVar.isEmpty();
      case Expdslv3Package.EXPERIMENTAL_DESIGN__FACTOR:
        return factor != null && !factor.isEmpty();
      case Expdslv3Package.EXPERIMENTAL_DESIGN__TYPE:
        return type != TYPE_EDEFAULT;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__DOE:
        return doe != null;
      case Expdslv3Package.EXPERIMENTAL_DESIGN__PARAMETER:
        return parameter != null && !parameter.isEmpty();
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //ExperimentalDesignImpl

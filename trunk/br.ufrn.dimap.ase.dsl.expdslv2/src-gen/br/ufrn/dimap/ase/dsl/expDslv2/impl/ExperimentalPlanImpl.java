/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2.impl;

import br.ufrn.dimap.ase.dsl.expDslv2.AnalysisTechiqueType;
import br.ufrn.dimap.ase.dsl.expDslv2.DependentVariable;
import br.ufrn.dimap.ase.dsl.expDslv2.DesignType;
import br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package;
import br.ufrn.dimap.ase.dsl.expDslv2.ExperimentalPlan;
import br.ufrn.dimap.ase.dsl.expDslv2.Factor;
import br.ufrn.dimap.ase.dsl.expDslv2.Goal;
import br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses;
import br.ufrn.dimap.ase.dsl.expDslv2.Parameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experimental Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ExperimentalPlanImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ExperimentalPlanImpl#getType <em>Type</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ExperimentalPlanImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ExperimentalPlanImpl#getDependentVariable <em>Dependent Variable</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ExperimentalPlanImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ExperimentalPlanImpl#getTohypotheses <em>Tohypotheses</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ExperimentalPlanImpl#getTechnique <em>Technique</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.ExperimentalPlanImpl#getInternalReplication <em>Internal Replication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentalPlanImpl extends MinimalEObjectImpl.Container implements ExperimentalPlan
{
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
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
  protected EList<Parameter> parameter;

  /**
	 * The cached value of the '{@link #getDependentVariable() <em>Dependent Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDependentVariable()
	 * @generated
	 * @ordered
	 */
  protected EList<DependentVariable> dependentVariable;

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
	 * The cached value of the '{@link #getTohypotheses() <em>Tohypotheses</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTohypotheses()
	 * @generated
	 * @ordered
	 */
  protected EList<Hypotheses> tohypotheses;

  /**
	 * The cached value of the '{@link #getTechnique() <em>Technique</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTechnique()
	 * @generated
	 * @ordered
	 */
  protected EList<AnalysisTechiqueType> technique;

  /**
	 * The default value of the '{@link #getInternalReplication() <em>Internal Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInternalReplication()
	 * @generated
	 * @ordered
	 */
  protected static final int INTERNAL_REPLICATION_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getInternalReplication() <em>Internal Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInternalReplication()
	 * @generated
	 * @ordered
	 */
  protected int internalReplication = INTERNAL_REPLICATION_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ExperimentalPlanImpl()
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
		return ExpDslv2Package.Literals.EXPERIMENTAL_PLAN;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Goal> getGoal()
  {
		if (goal == null) {
			goal = new EObjectContainmentEList<Goal>(Goal.class, this, ExpDslv2Package.EXPERIMENTAL_PLAN__GOAL);
		}
		return goal;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.EXPERIMENTAL_PLAN__TYPE, oldType, type));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Parameter> getParameter()
  {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, ExpDslv2Package.EXPERIMENTAL_PLAN__PARAMETER);
		}
		return parameter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<DependentVariable> getDependentVariable()
  {
		if (dependentVariable == null) {
			dependentVariable = new EObjectContainmentEList<DependentVariable>(DependentVariable.class, this, ExpDslv2Package.EXPERIMENTAL_PLAN__DEPENDENT_VARIABLE);
		}
		return dependentVariable;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Factor> getFactor()
  {
		if (factor == null) {
			factor = new EObjectContainmentEList<Factor>(Factor.class, this, ExpDslv2Package.EXPERIMENTAL_PLAN__FACTOR);
		}
		return factor;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Hypotheses> getTohypotheses()
  {
		if (tohypotheses == null) {
			tohypotheses = new EObjectResolvingEList<Hypotheses>(Hypotheses.class, this, ExpDslv2Package.EXPERIMENTAL_PLAN__TOHYPOTHESES);
		}
		return tohypotheses;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<AnalysisTechiqueType> getTechnique()
  {
		if (technique == null) {
			technique = new EDataTypeEList<AnalysisTechiqueType>(AnalysisTechiqueType.class, this, ExpDslv2Package.EXPERIMENTAL_PLAN__TECHNIQUE);
		}
		return technique;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getInternalReplication()
  {
		return internalReplication;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setInternalReplication(int newInternalReplication)
  {
		int oldInternalReplication = internalReplication;
		internalReplication = newInternalReplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.EXPERIMENTAL_PLAN__INTERNAL_REPLICATION, oldInternalReplication, internalReplication));
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
			case ExpDslv2Package.EXPERIMENTAL_PLAN__GOAL:
				return ((InternalEList<?>)getGoal()).basicRemove(otherEnd, msgs);
			case ExpDslv2Package.EXPERIMENTAL_PLAN__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case ExpDslv2Package.EXPERIMENTAL_PLAN__DEPENDENT_VARIABLE:
				return ((InternalEList<?>)getDependentVariable()).basicRemove(otherEnd, msgs);
			case ExpDslv2Package.EXPERIMENTAL_PLAN__FACTOR:
				return ((InternalEList<?>)getFactor()).basicRemove(otherEnd, msgs);
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
			case ExpDslv2Package.EXPERIMENTAL_PLAN__GOAL:
				return getGoal();
			case ExpDslv2Package.EXPERIMENTAL_PLAN__TYPE:
				return getType();
			case ExpDslv2Package.EXPERIMENTAL_PLAN__PARAMETER:
				return getParameter();
			case ExpDslv2Package.EXPERIMENTAL_PLAN__DEPENDENT_VARIABLE:
				return getDependentVariable();
			case ExpDslv2Package.EXPERIMENTAL_PLAN__FACTOR:
				return getFactor();
			case ExpDslv2Package.EXPERIMENTAL_PLAN__TOHYPOTHESES:
				return getTohypotheses();
			case ExpDslv2Package.EXPERIMENTAL_PLAN__TECHNIQUE:
				return getTechnique();
			case ExpDslv2Package.EXPERIMENTAL_PLAN__INTERNAL_REPLICATION:
				return getInternalReplication();
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
			case ExpDslv2Package.EXPERIMENTAL_PLAN__GOAL:
				getGoal().clear();
				getGoal().addAll((Collection<? extends Goal>)newValue);
				return;
			case ExpDslv2Package.EXPERIMENTAL_PLAN__TYPE:
				setType((DesignType)newValue);
				return;
			case ExpDslv2Package.EXPERIMENTAL_PLAN__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ExpDslv2Package.EXPERIMENTAL_PLAN__DEPENDENT_VARIABLE:
				getDependentVariable().clear();
				getDependentVariable().addAll((Collection<? extends DependentVariable>)newValue);
				return;
			case ExpDslv2Package.EXPERIMENTAL_PLAN__FACTOR:
				getFactor().clear();
				getFactor().addAll((Collection<? extends Factor>)newValue);
				return;
			case ExpDslv2Package.EXPERIMENTAL_PLAN__TOHYPOTHESES:
				getTohypotheses().clear();
				getTohypotheses().addAll((Collection<? extends Hypotheses>)newValue);
				return;
			case ExpDslv2Package.EXPERIMENTAL_PLAN__TECHNIQUE:
				getTechnique().clear();
				getTechnique().addAll((Collection<? extends AnalysisTechiqueType>)newValue);
				return;
			case ExpDslv2Package.EXPERIMENTAL_PLAN__INTERNAL_REPLICATION:
				setInternalReplication((Integer)newValue);
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
			case ExpDslv2Package.EXPERIMENTAL_PLAN__GOAL:
				getGoal().clear();
				return;
			case ExpDslv2Package.EXPERIMENTAL_PLAN__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ExpDslv2Package.EXPERIMENTAL_PLAN__PARAMETER:
				getParameter().clear();
				return;
			case ExpDslv2Package.EXPERIMENTAL_PLAN__DEPENDENT_VARIABLE:
				getDependentVariable().clear();
				return;
			case ExpDslv2Package.EXPERIMENTAL_PLAN__FACTOR:
				getFactor().clear();
				return;
			case ExpDslv2Package.EXPERIMENTAL_PLAN__TOHYPOTHESES:
				getTohypotheses().clear();
				return;
			case ExpDslv2Package.EXPERIMENTAL_PLAN__TECHNIQUE:
				getTechnique().clear();
				return;
			case ExpDslv2Package.EXPERIMENTAL_PLAN__INTERNAL_REPLICATION:
				setInternalReplication(INTERNAL_REPLICATION_EDEFAULT);
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
			case ExpDslv2Package.EXPERIMENTAL_PLAN__GOAL:
				return goal != null && !goal.isEmpty();
			case ExpDslv2Package.EXPERIMENTAL_PLAN__TYPE:
				return type != TYPE_EDEFAULT;
			case ExpDslv2Package.EXPERIMENTAL_PLAN__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case ExpDslv2Package.EXPERIMENTAL_PLAN__DEPENDENT_VARIABLE:
				return dependentVariable != null && !dependentVariable.isEmpty();
			case ExpDslv2Package.EXPERIMENTAL_PLAN__FACTOR:
				return factor != null && !factor.isEmpty();
			case ExpDslv2Package.EXPERIMENTAL_PLAN__TOHYPOTHESES:
				return tohypotheses != null && !tohypotheses.isEmpty();
			case ExpDslv2Package.EXPERIMENTAL_PLAN__TECHNIQUE:
				return technique != null && !technique.isEmpty();
			case ExpDslv2Package.EXPERIMENTAL_PLAN__INTERNAL_REPLICATION:
				return internalReplication != INTERNAL_REPLICATION_EDEFAULT;
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
		result.append(", Technique: ");
		result.append(technique);
		result.append(", internalReplication: ");
		result.append(internalReplication);
		result.append(')');
		return result.toString();
	}

} //ExperimentalPlanImpl

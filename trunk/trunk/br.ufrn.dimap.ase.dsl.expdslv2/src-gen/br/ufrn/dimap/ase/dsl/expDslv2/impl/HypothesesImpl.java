/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2.impl;

import br.ufrn.dimap.ase.dsl.expDslv2.DependentVariable;
import br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package;
import br.ufrn.dimap.ase.dsl.expDslv2.Factor;
import br.ufrn.dimap.ase.dsl.expDslv2.Hypotheses;
import br.ufrn.dimap.ase.dsl.expDslv2.HypothesisType;
import br.ufrn.dimap.ase.dsl.expDslv2.Levels;
import br.ufrn.dimap.ase.dsl.expDslv2.OperatorType;
import br.ufrn.dimap.ase.dsl.expDslv2.RelationType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hypotheses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.HypothesesImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.HypothesesImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.HypothesesImpl#getType <em>Type</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.HypothesesImpl#getDependentVariable <em>Dependent Variable</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.HypothesesImpl#getLevels <em>Levels</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.HypothesesImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.HypothesesImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.HypothesesImpl#getFactor <em>Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HypothesesImpl extends MinimalEObjectImpl.Container implements Hypotheses
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
  protected static final HypothesisType TYPE_EDEFAULT = HypothesisType.NULL_;

  /**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
  protected HypothesisType type = TYPE_EDEFAULT;

  /**
	 * The cached value of the '{@link #getDependentVariable() <em>Dependent Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDependentVariable()
	 * @generated
	 * @ordered
	 */
  protected EList<DependentVariable> dependentVariable;

  /**
	 * The cached value of the '{@link #getLevels() <em>Levels</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLevels()
	 * @generated
	 * @ordered
	 */
  protected EList<Levels> levels;

  /**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
  protected static final OperatorType OPERATOR_EDEFAULT = OperatorType.EQUAL;

  /**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
  protected OperatorType operator = OPERATOR_EDEFAULT;

  /**
	 * The default value of the '{@link #getRelation() <em>Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
  protected static final RelationType RELATION_EDEFAULT = RelationType.IS_RELATED;

  /**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
  protected RelationType relation = RELATION_EDEFAULT;

  /**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
  protected EList<Factor> factor;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected HypothesesImpl()
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
		return ExpDslv2Package.Literals.HYPOTHESES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.HYPOTHESES__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.HYPOTHESES__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HypothesisType getType()
  {
		return type;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setType(HypothesisType newType)
  {
		HypothesisType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.HYPOTHESES__TYPE, oldType, type));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<DependentVariable> getDependentVariable()
  {
		if (dependentVariable == null) {
			dependentVariable = new EObjectResolvingEList<DependentVariable>(DependentVariable.class, this, ExpDslv2Package.HYPOTHESES__DEPENDENT_VARIABLE);
		}
		return dependentVariable;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Levels> getLevels()
  {
		if (levels == null) {
			levels = new EObjectResolvingEList<Levels>(Levels.class, this, ExpDslv2Package.HYPOTHESES__LEVELS);
		}
		return levels;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperatorType getOperator()
  {
		return operator;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOperator(OperatorType newOperator)
  {
		OperatorType oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.HYPOTHESES__OPERATOR, oldOperator, operator));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RelationType getRelation()
  {
		return relation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRelation(RelationType newRelation)
  {
		RelationType oldRelation = relation;
		relation = newRelation == null ? RELATION_EDEFAULT : newRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpDslv2Package.HYPOTHESES__RELATION, oldRelation, relation));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Factor> getFactor()
  {
		if (factor == null) {
			factor = new EObjectResolvingEList<Factor>(Factor.class, this, ExpDslv2Package.HYPOTHESES__FACTOR);
		}
		return factor;
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
			case ExpDslv2Package.HYPOTHESES__NAME:
				return getName();
			case ExpDslv2Package.HYPOTHESES__DESCRIPTION:
				return getDescription();
			case ExpDslv2Package.HYPOTHESES__TYPE:
				return getType();
			case ExpDslv2Package.HYPOTHESES__DEPENDENT_VARIABLE:
				return getDependentVariable();
			case ExpDslv2Package.HYPOTHESES__LEVELS:
				return getLevels();
			case ExpDslv2Package.HYPOTHESES__OPERATOR:
				return getOperator();
			case ExpDslv2Package.HYPOTHESES__RELATION:
				return getRelation();
			case ExpDslv2Package.HYPOTHESES__FACTOR:
				return getFactor();
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
			case ExpDslv2Package.HYPOTHESES__NAME:
				setName((String)newValue);
				return;
			case ExpDslv2Package.HYPOTHESES__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ExpDslv2Package.HYPOTHESES__TYPE:
				setType((HypothesisType)newValue);
				return;
			case ExpDslv2Package.HYPOTHESES__DEPENDENT_VARIABLE:
				getDependentVariable().clear();
				getDependentVariable().addAll((Collection<? extends DependentVariable>)newValue);
				return;
			case ExpDslv2Package.HYPOTHESES__LEVELS:
				getLevels().clear();
				getLevels().addAll((Collection<? extends Levels>)newValue);
				return;
			case ExpDslv2Package.HYPOTHESES__OPERATOR:
				setOperator((OperatorType)newValue);
				return;
			case ExpDslv2Package.HYPOTHESES__RELATION:
				setRelation((RelationType)newValue);
				return;
			case ExpDslv2Package.HYPOTHESES__FACTOR:
				getFactor().clear();
				getFactor().addAll((Collection<? extends Factor>)newValue);
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
			case ExpDslv2Package.HYPOTHESES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExpDslv2Package.HYPOTHESES__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ExpDslv2Package.HYPOTHESES__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ExpDslv2Package.HYPOTHESES__DEPENDENT_VARIABLE:
				getDependentVariable().clear();
				return;
			case ExpDslv2Package.HYPOTHESES__LEVELS:
				getLevels().clear();
				return;
			case ExpDslv2Package.HYPOTHESES__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case ExpDslv2Package.HYPOTHESES__RELATION:
				setRelation(RELATION_EDEFAULT);
				return;
			case ExpDslv2Package.HYPOTHESES__FACTOR:
				getFactor().clear();
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
			case ExpDslv2Package.HYPOTHESES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExpDslv2Package.HYPOTHESES__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ExpDslv2Package.HYPOTHESES__TYPE:
				return type != TYPE_EDEFAULT;
			case ExpDslv2Package.HYPOTHESES__DEPENDENT_VARIABLE:
				return dependentVariable != null && !dependentVariable.isEmpty();
			case ExpDslv2Package.HYPOTHESES__LEVELS:
				return levels != null && !levels.isEmpty();
			case ExpDslv2Package.HYPOTHESES__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case ExpDslv2Package.HYPOTHESES__RELATION:
				return relation != RELATION_EDEFAULT;
			case ExpDslv2Package.HYPOTHESES__FACTOR:
				return factor != null && !factor.isEmpty();
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
		result.append(", operator: ");
		result.append(operator);
		result.append(", relation: ");
		result.append(relation);
		result.append(')');
		return result.toString();
	}

} //HypothesesImpl

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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uma.Constraint;
import uma.EstimationConsiderations;
import uma.Role;
import uma.Step;
import uma.Task;
import uma.ToolMentor;
import uma.UmaPackage;
import uma.WorkDefinition;
import uma.WorkProduct;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uma.impl.TaskImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link uma.impl.TaskImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link uma.impl.TaskImpl#getPerformedBy <em>Performed By</em>}</li>
 *   <li>{@link uma.impl.TaskImpl#getMandatoryInput <em>Mandatory Input</em>}</li>
 *   <li>{@link uma.impl.TaskImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link uma.impl.TaskImpl#getAdditionallyPerformedBy <em>Additionally Performed By</em>}</li>
 *   <li>{@link uma.impl.TaskImpl#getOptionalInput <em>Optional Input</em>}</li>
 *   <li>{@link uma.impl.TaskImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link uma.impl.TaskImpl#getToolMentors <em>Tool Mentors</em>}</li>
 *   <li>{@link uma.impl.TaskImpl#getEstimationConsiderations <em>Estimation Considerations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends ContentElementImpl implements Task {
	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint precondition;

	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint postcondition;

	/**
	 * The cached value of the '{@link #getPerformedBy() <em>Performed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> performedBy;

	/**
	 * The cached value of the '{@link #getMandatoryInput() <em>Mandatory Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryInput()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProduct> mandatoryInput;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProduct> output;

	/**
	 * The cached value of the '{@link #getAdditionallyPerformedBy() <em>Additionally Performed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionallyPerformedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> additionallyPerformedBy;

	/**
	 * The cached value of the '{@link #getOptionalInput() <em>Optional Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalInput()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProduct> optionalInput;

	/**
	 * The cached value of the '{@link #getToolMentors() <em>Tool Mentors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolMentors()
	 * @generated
	 * @ordered
	 */
	protected EList<ToolMentor> toolMentors;

	/**
	 * The cached value of the '{@link #getEstimationConsiderations() <em>Estimation Considerations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimationConsiderations()
	 * @generated
	 * @ordered
	 */
	protected EList<EstimationConsiderations> estimationConsiderations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecondition(Constraint newPrecondition, NotificationChain msgs) {
		Constraint oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmaPackage.TASK__PRECONDITION, oldPrecondition, newPrecondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecondition(Constraint newPrecondition) {
		if (newPrecondition != precondition) {
			NotificationChain msgs = null;
			if (precondition != null)
				msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmaPackage.TASK__PRECONDITION, null, msgs);
			if (newPrecondition != null)
				msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmaPackage.TASK__PRECONDITION, null, msgs);
			msgs = basicSetPrecondition(newPrecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.TASK__PRECONDITION, newPrecondition, newPrecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPostcondition() {
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostcondition(Constraint newPostcondition, NotificationChain msgs) {
		Constraint oldPostcondition = postcondition;
		postcondition = newPostcondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmaPackage.TASK__POSTCONDITION, oldPostcondition, newPostcondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostcondition(Constraint newPostcondition) {
		if (newPostcondition != postcondition) {
			NotificationChain msgs = null;
			if (postcondition != null)
				msgs = ((InternalEObject)postcondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmaPackage.TASK__POSTCONDITION, null, msgs);
			if (newPostcondition != null)
				msgs = ((InternalEObject)newPostcondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmaPackage.TASK__POSTCONDITION, null, msgs);
			msgs = basicSetPostcondition(newPostcondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.TASK__POSTCONDITION, newPostcondition, newPostcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getPerformedBy() {
		if (performedBy == null) {
			performedBy = new EObjectResolvingEList<Role>(Role.class, this, UmaPackage.TASK__PERFORMED_BY);
		}
		return performedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProduct> getMandatoryInput() {
		if (mandatoryInput == null) {
			mandatoryInput = new EObjectResolvingEList<WorkProduct>(WorkProduct.class, this, UmaPackage.TASK__MANDATORY_INPUT);
		}
		return mandatoryInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProduct> getOutput() {
		if (output == null) {
			output = new EObjectResolvingEList<WorkProduct>(WorkProduct.class, this, UmaPackage.TASK__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getAdditionallyPerformedBy() {
		if (additionallyPerformedBy == null) {
			additionallyPerformedBy = new EObjectResolvingEList<Role>(Role.class, this, UmaPackage.TASK__ADDITIONALLY_PERFORMED_BY);
		}
		return additionallyPerformedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProduct> getOptionalInput() {
		if (optionalInput == null) {
			optionalInput = new EObjectResolvingEList<WorkProduct>(WorkProduct.class, this, UmaPackage.TASK__OPTIONAL_INPUT);
		}
		return optionalInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getSteps() {
		// TODO: implement this method to return the 'Steps' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToolMentor> getToolMentors() {
		if (toolMentors == null) {
			toolMentors = new EObjectResolvingEList<ToolMentor>(ToolMentor.class, this, UmaPackage.TASK__TOOL_MENTORS);
		}
		return toolMentors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EstimationConsiderations> getEstimationConsiderations() {
		if (estimationConsiderations == null) {
			estimationConsiderations = new EObjectResolvingEList<EstimationConsiderations>(EstimationConsiderations.class, this, UmaPackage.TASK__ESTIMATION_CONSIDERATIONS);
		}
		return estimationConsiderations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmaPackage.TASK__PRECONDITION:
				return basicSetPrecondition(null, msgs);
			case UmaPackage.TASK__POSTCONDITION:
				return basicSetPostcondition(null, msgs);
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
			case UmaPackage.TASK__PRECONDITION:
				return getPrecondition();
			case UmaPackage.TASK__POSTCONDITION:
				return getPostcondition();
			case UmaPackage.TASK__PERFORMED_BY:
				return getPerformedBy();
			case UmaPackage.TASK__MANDATORY_INPUT:
				return getMandatoryInput();
			case UmaPackage.TASK__OUTPUT:
				return getOutput();
			case UmaPackage.TASK__ADDITIONALLY_PERFORMED_BY:
				return getAdditionallyPerformedBy();
			case UmaPackage.TASK__OPTIONAL_INPUT:
				return getOptionalInput();
			case UmaPackage.TASK__STEPS:
				return getSteps();
			case UmaPackage.TASK__TOOL_MENTORS:
				return getToolMentors();
			case UmaPackage.TASK__ESTIMATION_CONSIDERATIONS:
				return getEstimationConsiderations();
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
			case UmaPackage.TASK__PRECONDITION:
				setPrecondition((Constraint)newValue);
				return;
			case UmaPackage.TASK__POSTCONDITION:
				setPostcondition((Constraint)newValue);
				return;
			case UmaPackage.TASK__PERFORMED_BY:
				getPerformedBy().clear();
				getPerformedBy().addAll((Collection<? extends Role>)newValue);
				return;
			case UmaPackage.TASK__MANDATORY_INPUT:
				getMandatoryInput().clear();
				getMandatoryInput().addAll((Collection<? extends WorkProduct>)newValue);
				return;
			case UmaPackage.TASK__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends WorkProduct>)newValue);
				return;
			case UmaPackage.TASK__ADDITIONALLY_PERFORMED_BY:
				getAdditionallyPerformedBy().clear();
				getAdditionallyPerformedBy().addAll((Collection<? extends Role>)newValue);
				return;
			case UmaPackage.TASK__OPTIONAL_INPUT:
				getOptionalInput().clear();
				getOptionalInput().addAll((Collection<? extends WorkProduct>)newValue);
				return;
			case UmaPackage.TASK__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case UmaPackage.TASK__TOOL_MENTORS:
				getToolMentors().clear();
				getToolMentors().addAll((Collection<? extends ToolMentor>)newValue);
				return;
			case UmaPackage.TASK__ESTIMATION_CONSIDERATIONS:
				getEstimationConsiderations().clear();
				getEstimationConsiderations().addAll((Collection<? extends EstimationConsiderations>)newValue);
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
			case UmaPackage.TASK__PRECONDITION:
				setPrecondition((Constraint)null);
				return;
			case UmaPackage.TASK__POSTCONDITION:
				setPostcondition((Constraint)null);
				return;
			case UmaPackage.TASK__PERFORMED_BY:
				getPerformedBy().clear();
				return;
			case UmaPackage.TASK__MANDATORY_INPUT:
				getMandatoryInput().clear();
				return;
			case UmaPackage.TASK__OUTPUT:
				getOutput().clear();
				return;
			case UmaPackage.TASK__ADDITIONALLY_PERFORMED_BY:
				getAdditionallyPerformedBy().clear();
				return;
			case UmaPackage.TASK__OPTIONAL_INPUT:
				getOptionalInput().clear();
				return;
			case UmaPackage.TASK__STEPS:
				getSteps().clear();
				return;
			case UmaPackage.TASK__TOOL_MENTORS:
				getToolMentors().clear();
				return;
			case UmaPackage.TASK__ESTIMATION_CONSIDERATIONS:
				getEstimationConsiderations().clear();
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
			case UmaPackage.TASK__PRECONDITION:
				return precondition != null;
			case UmaPackage.TASK__POSTCONDITION:
				return postcondition != null;
			case UmaPackage.TASK__PERFORMED_BY:
				return performedBy != null && !performedBy.isEmpty();
			case UmaPackage.TASK__MANDATORY_INPUT:
				return mandatoryInput != null && !mandatoryInput.isEmpty();
			case UmaPackage.TASK__OUTPUT:
				return output != null && !output.isEmpty();
			case UmaPackage.TASK__ADDITIONALLY_PERFORMED_BY:
				return additionallyPerformedBy != null && !additionallyPerformedBy.isEmpty();
			case UmaPackage.TASK__OPTIONAL_INPUT:
				return optionalInput != null && !optionalInput.isEmpty();
			case UmaPackage.TASK__STEPS:
				return !getSteps().isEmpty();
			case UmaPackage.TASK__TOOL_MENTORS:
				return toolMentors != null && !toolMentors.isEmpty();
			case UmaPackage.TASK__ESTIMATION_CONSIDERATIONS:
				return estimationConsiderations != null && !estimationConsiderations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == WorkDefinition.class) {
			switch (derivedFeatureID) {
				case UmaPackage.TASK__PRECONDITION: return UmaPackage.WORK_DEFINITION__PRECONDITION;
				case UmaPackage.TASK__POSTCONDITION: return UmaPackage.WORK_DEFINITION__POSTCONDITION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == WorkDefinition.class) {
			switch (baseFeatureID) {
				case UmaPackage.WORK_DEFINITION__PRECONDITION: return UmaPackage.TASK__PRECONDITION;
				case UmaPackage.WORK_DEFINITION__POSTCONDITION: return UmaPackage.TASK__POSTCONDITION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TaskImpl

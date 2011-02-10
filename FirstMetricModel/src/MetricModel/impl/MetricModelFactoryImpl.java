/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MetricModel.impl;

import MetricModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetricModelFactoryImpl extends EFactoryImpl implements MetricModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetricModelFactory init() {
		try {
			MetricModelFactory theMetricModelFactory = (MetricModelFactory)EPackage.Registry.INSTANCE.getEFactory("Metrica"); 
			if (theMetricModelFactory != null) {
				return theMetricModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetricModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MetricModelPackage.METRIC: return createMetric();
			case MetricModelPackage.ACTIVITY_METRIC: return createActivityMetric();
			case MetricModelPackage.TASK_METRIC: return createTaskMetric();
			case MetricModelPackage.METRIC_MODEL_PLAN: return createMetricModelPlan();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MetricModelPackage.METRIC_TYPE:
				return createMetricTypeFromString(eDataType, initialValue);
			case MetricModelPackage.BASE_ELEMENT:
				return createBaseElementFromString(eDataType, initialValue);
			case MetricModelPackage.COLECT_TYPE:
				return createColectTypeFromString(eDataType, initialValue);
			case MetricModelPackage.METRIC_UNIT:
				return createMetricUnitFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MetricModelPackage.METRIC_TYPE:
				return convertMetricTypeToString(eDataType, instanceValue);
			case MetricModelPackage.BASE_ELEMENT:
				return convertBaseElementToString(eDataType, instanceValue);
			case MetricModelPackage.COLECT_TYPE:
				return convertColectTypeToString(eDataType, instanceValue);
			case MetricModelPackage.METRIC_UNIT:
				return convertMetricUnitToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric createMetric() {
		MetricImpl metric = new MetricImpl();
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityMetric createActivityMetric() {
		ActivityMetricImpl activityMetric = new ActivityMetricImpl();
		return activityMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskMetric createTaskMetric() {
		TaskMetricImpl taskMetric = new TaskMetricImpl();
		return taskMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricModelPlan createMetricModelPlan() {
		MetricModelPlanImpl metricModelPlan = new MetricModelPlanImpl();
		return metricModelPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricType createMetricTypeFromString(EDataType eDataType, String initialValue) {
		MetricType result = MetricType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetricTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement createBaseElementFromString(EDataType eDataType, String initialValue) {
		BaseElement result = BaseElement.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBaseElementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColectType createColectTypeFromString(EDataType eDataType, String initialValue) {
		ColectType result = ColectType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColectTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricUnit createMetricUnitFromString(EDataType eDataType, String initialValue) {
		MetricUnit result = MetricUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetricUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricModelPackage getMetricModelPackage() {
		return (MetricModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetricModelPackage getPackage() {
		return MetricModelPackage.eINSTANCE;
	}

} //MetricModelFactoryImpl

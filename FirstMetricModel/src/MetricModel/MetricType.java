/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MetricModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Metric Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MetricModel.MetricModelPackage#getMetricType()
 * @model
 * @generated
 */
public enum MetricType implements Enumerator {
	/**
	 * The '<em><b>Hard Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARD_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	HARD_DATA(0, "hardData", "hardData"),

	/**
	 * The '<em><b>Soft Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFT_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	SOFT_DATA(1, "softData", "softData"),

	/**
	 * The '<em><b>Normalized Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMALIZED_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	NORMALIZED_DATA(2, "normalizedData", "normalizedData");

	/**
	 * The '<em><b>Hard Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hard Data</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HARD_DATA
	 * @model name="hardData"
	 * @generated
	 * @ordered
	 */
	public static final int HARD_DATA_VALUE = 0;

	/**
	 * The '<em><b>Soft Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Soft Data</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOFT_DATA
	 * @model name="softData"
	 * @generated
	 * @ordered
	 */
	public static final int SOFT_DATA_VALUE = 1;

	/**
	 * The '<em><b>Normalized Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Normalized Data</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORMALIZED_DATA
	 * @model name="normalizedData"
	 * @generated
	 * @ordered
	 */
	public static final int NORMALIZED_DATA_VALUE = 2;

	/**
	 * An array of all the '<em><b>Metric Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MetricType[] VALUES_ARRAY =
		new MetricType[] {
			HARD_DATA,
			SOFT_DATA,
			NORMALIZED_DATA,
		};

	/**
	 * A public read-only list of all the '<em><b>Metric Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MetricType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Metric Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetricType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MetricType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metric Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetricType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MetricType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metric Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetricType get(int value) {
		switch (value) {
			case HARD_DATA_VALUE: return HARD_DATA;
			case SOFT_DATA_VALUE: return SOFT_DATA;
			case NORMALIZED_DATA_VALUE: return NORMALIZED_DATA;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MetricType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MetricType

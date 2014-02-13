/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jpdl31;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relation Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jpdl31.Jpdl31Package#getRelationOperator()
 * @model
 * @generated
 */
public enum RelationOperator implements Enumerator {
	/**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(0, "equal", "equal"), /**
	 * The '<em><b>Morethan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MORETHAN_VALUE
	 * @generated
	 * @ordered
	 */
	MORETHAN(1, "morethan", "morethan"), /**
	 * The '<em><b>Lessthan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSTHAN_VALUE
	 * @generated
	 * @ordered
	 */
	LESSTHAN(2, "lessthan", "lessthan"), /**
	 * The '<em><b>Moreequalthan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOREEQUALTHAN_VALUE
	 * @generated
	 * @ordered
	 */
	MOREEQUALTHAN(3, "moreequalthan", "moreequalthan"), /**
	 * The '<em><b>Lessequalthan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSEQUALTHAN_VALUE
	 * @generated
	 * @ordered
	 */
	LESSEQUALTHAN(4, "lessequalthan", "lessequalthan");

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model name="equal"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 0;

	/**
	 * The '<em><b>Morethan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Morethan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MORETHAN
	 * @model name="morethan"
	 * @generated
	 * @ordered
	 */
	public static final int MORETHAN_VALUE = 1;

	/**
	 * The '<em><b>Lessthan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lessthan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESSTHAN
	 * @model name="lessthan"
	 * @generated
	 * @ordered
	 */
	public static final int LESSTHAN_VALUE = 2;

	/**
	 * The '<em><b>Moreequalthan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Moreequalthan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOREEQUALTHAN
	 * @model name="moreequalthan"
	 * @generated
	 * @ordered
	 */
	public static final int MOREEQUALTHAN_VALUE = 3;

	/**
	 * The '<em><b>Lessequalthan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lessequalthan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESSEQUALTHAN
	 * @model name="lessequalthan"
	 * @generated
	 * @ordered
	 */
	public static final int LESSEQUALTHAN_VALUE = 4;

	/**
	 * An array of all the '<em><b>Relation Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelationOperator[] VALUES_ARRAY =
		new RelationOperator[] {
			EQUAL,
			MORETHAN,
			LESSTHAN,
			MOREEQUALTHAN,
			LESSEQUALTHAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Relation Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelationOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relation Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relation Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relation Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationOperator get(int value) {
		switch (value) {
			case EQUAL_VALUE: return EQUAL;
			case MORETHAN_VALUE: return MORETHAN;
			case LESSTHAN_VALUE: return LESSTHAN;
			case MOREEQUALTHAN_VALUE: return MOREEQUALTHAN;
			case LESSEQUALTHAN_VALUE: return LESSEQUALTHAN;
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
	private RelationOperator(int value, String name, String literal) {
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
	
} //RelationOperator

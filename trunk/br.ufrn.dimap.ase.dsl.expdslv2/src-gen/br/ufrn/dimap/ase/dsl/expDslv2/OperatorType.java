/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operator Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getOperatorType()
 * @model
 * @generated
 */
public enum OperatorType implements Enumerator
{
  /**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
  EQUAL(0, "equal", "="),

  /**
	 * The '<em><b>Different</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #DIFFERENT_VALUE
	 * @generated
	 * @ordered
	 */
  DIFFERENT(1, "different", "!="),

  /**
	 * The '<em><b>More</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #MORE_VALUE
	 * @generated
	 * @ordered
	 */
  MORE(2, "more", ">"),

  /**
	 * The '<em><b>Less</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #LESS_VALUE
	 * @generated
	 * @ordered
	 */
  LESS(3, "less", "<"),

  /**
	 * The '<em><b>More Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #MORE_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
  MORE_EQUAL(4, "moreEqual", ">="),

  /**
	 * The '<em><b>Less Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #LESS_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
  LESS_EQUAL(5, "lessEqual", "<=");

  /**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Equal</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model name="equal" literal="="
	 * @generated
	 * @ordered
	 */
  public static final int EQUAL_VALUE = 0;

  /**
	 * The '<em><b>Different</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Different</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #DIFFERENT
	 * @model name="different" literal="!="
	 * @generated
	 * @ordered
	 */
  public static final int DIFFERENT_VALUE = 1;

  /**
	 * The '<em><b>More</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>More</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #MORE
	 * @model name="more" literal=">"
	 * @generated
	 * @ordered
	 */
  public static final int MORE_VALUE = 2;

  /**
	 * The '<em><b>Less</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Less</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #LESS
	 * @model name="less" literal="<"
	 * @generated
	 * @ordered
	 */
  public static final int LESS_VALUE = 3;

  /**
	 * The '<em><b>More Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>More Equal</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #MORE_EQUAL
	 * @model name="moreEqual" literal=">="
	 * @generated
	 * @ordered
	 */
  public static final int MORE_EQUAL_VALUE = 4;

  /**
	 * The '<em><b>Less Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Less Equal</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #LESS_EQUAL
	 * @model name="lessEqual" literal="<="
	 * @generated
	 * @ordered
	 */
  public static final int LESS_EQUAL_VALUE = 5;

  /**
	 * An array of all the '<em><b>Operator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final OperatorType[] VALUES_ARRAY =
    new OperatorType[] {
			EQUAL,
			DIFFERENT,
			MORE,
			LESS,
			MORE_EQUAL,
			LESS_EQUAL,
		};

  /**
	 * A public read-only list of all the '<em><b>Operator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<OperatorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Operator Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static OperatorType get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperatorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Operator Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static OperatorType getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperatorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Operator Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static OperatorType get(int value)
  {
		switch (value) {
			case EQUAL_VALUE: return EQUAL;
			case DIFFERENT_VALUE: return DIFFERENT;
			case MORE_VALUE: return MORE;
			case LESS_VALUE: return LESS;
			case MORE_EQUAL_VALUE: return MORE_EQUAL;
			case LESS_EQUAL_VALUE: return LESS_EQUAL;
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
  private OperatorType(int value, String name, String literal)
  {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getValue()
  {
	  return value;
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
  public String getLiteral()
  {
	  return literal;
	}

  /**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		return literal;
	}
  
} //OperatorType

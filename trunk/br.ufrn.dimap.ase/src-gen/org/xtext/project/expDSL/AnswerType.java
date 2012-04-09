/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.project.expDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Answer Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.project.expDSL.ExpDSLPackage#getAnswerType()
 * @model
 * @generated
 */
public enum AnswerType implements Enumerator
{
  /**
	 * The '<em><b>Combo Box</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #COMBO_BOX_VALUE
	 * @generated
	 * @ordered
	 */
  COMBO_BOX(0, "ComboBox", "ComboBox"),

  /**
	 * The '<em><b>Check Boxes</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #CHECK_BOXES_VALUE
	 * @generated
	 * @ordered
	 */
  CHECK_BOXES(1, "CheckBoxes", "CheckBoxes"),

  /**
	 * The '<em><b>Option Buttons</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #OPTION_BUTTONS_VALUE
	 * @generated
	 * @ordered
	 */
  OPTION_BUTTONS(2, "OptionButtons", "OptionButtons");

  /**
	 * The '<em><b>Combo Box</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Combo Box</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #COMBO_BOX
	 * @model name="ComboBox"
	 * @generated
	 * @ordered
	 */
  public static final int COMBO_BOX_VALUE = 0;

  /**
	 * The '<em><b>Check Boxes</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Check Boxes</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #CHECK_BOXES
	 * @model name="CheckBoxes"
	 * @generated
	 * @ordered
	 */
  public static final int CHECK_BOXES_VALUE = 1;

  /**
	 * The '<em><b>Option Buttons</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Option Buttons</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #OPTION_BUTTONS
	 * @model name="OptionButtons"
	 * @generated
	 * @ordered
	 */
  public static final int OPTION_BUTTONS_VALUE = 2;

  /**
	 * An array of all the '<em><b>Answer Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final AnswerType[] VALUES_ARRAY =
    new AnswerType[] {
			COMBO_BOX,
			CHECK_BOXES,
			OPTION_BUTTONS,
		};

  /**
	 * A public read-only list of all the '<em><b>Answer Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<AnswerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Answer Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static AnswerType get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AnswerType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Answer Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static AnswerType getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AnswerType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Answer Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static AnswerType get(int value)
  {
		switch (value) {
			case COMBO_BOX_VALUE: return COMBO_BOX;
			case CHECK_BOXES_VALUE: return CHECK_BOXES;
			case OPTION_BUTTONS_VALUE: return OPTION_BUTTONS;
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
  private AnswerType(int value, String name, String literal)
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
  
} //AnswerType

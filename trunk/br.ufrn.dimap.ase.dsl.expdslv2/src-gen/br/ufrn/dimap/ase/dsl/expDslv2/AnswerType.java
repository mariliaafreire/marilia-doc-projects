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
 * A representation of the literals of the enumeration '<em><b>Answer Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getAnswerType()
 * @model
 * @generated
 */
public enum AnswerType implements Enumerator
{
  /**
	 * The '<em><b>Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
  TEXT(0, "Text", "Text"),

  /**
	 * The '<em><b>Paragraph Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #PARAGRAPH_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
  PARAGRAPH_TEXT(1, "ParagraphText", "ParagraphText"),

  /**
	 * The '<em><b>Multiple Choice</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #MULTIPLE_CHOICE_VALUE
	 * @generated
	 * @ordered
	 */
  MULTIPLE_CHOICE(2, "MultipleChoice", "MultipleChoice"),

  /**
	 * The '<em><b>Combo Box</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #COMBO_BOX_VALUE
	 * @generated
	 * @ordered
	 */
  COMBO_BOX(3, "ComboBox", "ComboBox"),

  /**
	 * The '<em><b>Check Boxes</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #CHECK_BOXES_VALUE
	 * @generated
	 * @ordered
	 */
  CHECK_BOXES(4, "CheckBoxes", "CheckBoxes"),

  /**
	 * The '<em><b>Scale</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #SCALE_VALUE
	 * @generated
	 * @ordered
	 */
  SCALE(5, "Scale", "Scale"),

  /**
	 * The '<em><b>Grid</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #GRID_VALUE
	 * @generated
	 * @ordered
	 */
  GRID(6, "Grid", "Grid");

  /**
	 * The '<em><b>Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Text</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #TEXT
	 * @model name="Text"
	 * @generated
	 * @ordered
	 */
  public static final int TEXT_VALUE = 0;

  /**
	 * The '<em><b>Paragraph Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Paragraph Text</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #PARAGRAPH_TEXT
	 * @model name="ParagraphText"
	 * @generated
	 * @ordered
	 */
  public static final int PARAGRAPH_TEXT_VALUE = 1;

  /**
	 * The '<em><b>Multiple Choice</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Multiple Choice</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #MULTIPLE_CHOICE
	 * @model name="MultipleChoice"
	 * @generated
	 * @ordered
	 */
  public static final int MULTIPLE_CHOICE_VALUE = 2;

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
  public static final int COMBO_BOX_VALUE = 3;

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
  public static final int CHECK_BOXES_VALUE = 4;

  /**
	 * The '<em><b>Scale</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Scale</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #SCALE
	 * @model name="Scale"
	 * @generated
	 * @ordered
	 */
  public static final int SCALE_VALUE = 5;

  /**
	 * The '<em><b>Grid</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Grid</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #GRID
	 * @model name="Grid"
	 * @generated
	 * @ordered
	 */
  public static final int GRID_VALUE = 6;

  /**
	 * An array of all the '<em><b>Answer Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final AnswerType[] VALUES_ARRAY =
    new AnswerType[] {
			TEXT,
			PARAGRAPH_TEXT,
			MULTIPLE_CHOICE,
			COMBO_BOX,
			CHECK_BOXES,
			SCALE,
			GRID,
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
			case TEXT_VALUE: return TEXT;
			case PARAGRAPH_TEXT_VALUE: return PARAGRAPH_TEXT;
			case MULTIPLE_CHOICE_VALUE: return MULTIPLE_CHOICE;
			case COMBO_BOX_VALUE: return COMBO_BOX;
			case CHECK_BOXES_VALUE: return CHECK_BOXES;
			case SCALE_VALUE: return SCALE;
			case GRID_VALUE: return GRID;
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

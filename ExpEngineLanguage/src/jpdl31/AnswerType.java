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
 * A representation of the literals of the enumeration '<em><b>Answer Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jpdl31.Jpdl31Package#getAnswerType()
 * @model
 * @generated
 */
public enum AnswerType implements Enumerator {
	/**
	 * The '<em><b>Combo Box</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMBO_BOX_VALUE
	 * @generated
	 * @ordered
	 */
	COMBO_BOX(0, "comboBox", "comboBox"),

	/**
	 * The '<em><b>Check Box</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECK_BOX_VALUE
	 * @generated
	 * @ordered
	 */
	CHECK_BOX(1, "checkBox", "checkBox"),

	/**
	 * The '<em><b>Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(2, "text", "text"),

	/**
	 * The '<em><b>Paragraph Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAGRAPH_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	PARAGRAPH_TEXT(3, "paragraphText", "paragraphText");

	/**
	 * The '<em><b>Combo Box</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Combo Box</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMBO_BOX
	 * @model name="comboBox"
	 * @generated
	 * @ordered
	 */
	public static final int COMBO_BOX_VALUE = 0;

	/**
	 * The '<em><b>Check Box</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Check Box</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECK_BOX
	 * @model name="checkBox"
	 * @generated
	 * @ordered
	 */
	public static final int CHECK_BOX_VALUE = 1;

	/**
	 * The '<em><b>Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Text</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXT
	 * @model name="text"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VALUE = 2;

	/**
	 * The '<em><b>Paragraph Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Paragraph Text</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARAGRAPH_TEXT
	 * @model name="paragraphText"
	 * @generated
	 * @ordered
	 */
	public static final int PARAGRAPH_TEXT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Answer Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AnswerType[] VALUES_ARRAY =
		new AnswerType[] {
			COMBO_BOX,
			CHECK_BOX,
			TEXT,
			PARAGRAPH_TEXT,
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
	public static AnswerType get(String literal) {
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
	public static AnswerType getByName(String name) {
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
	public static AnswerType get(int value) {
		switch (value) {
			case COMBO_BOX_VALUE: return COMBO_BOX;
			case CHECK_BOX_VALUE: return CHECK_BOX;
			case TEXT_VALUE: return TEXT;
			case PARAGRAPH_TEXT_VALUE: return PARAGRAPH_TEXT;
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
	private AnswerType(int value, String name, String literal) {
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
	
} //AnswerType

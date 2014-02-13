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
 * A representation of the literals of the enumeration '<em><b>Analysis Techique Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package#getAnalysisTechiqueType()
 * @model
 * @generated
 */
public enum AnalysisTechiqueType implements Enumerator
{
  /**
	 * The '<em><b>Chi2</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #CHI2_VALUE
	 * @generated
	 * @ordered
	 */
  CHI2(0, "chi2", "Chi-2"),

  /**
	 * The '<em><b>Binomial Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #BINOMIAL_TEST_VALUE
	 * @generated
	 * @ordered
	 */
  BINOMIAL_TEST(1, "binomialTest", "Binomial Test"),

  /**
	 * The '<em><b>TTest</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #TTEST_VALUE
	 * @generated
	 * @ordered
	 */
  TTEST(2, "tTest", "t-test"),

  /**
	 * The '<em><b>FTest</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #FTEST_VALUE
	 * @generated
	 * @ordered
	 */
  FTEST(3, "fTest", "F-test"),

  /**
	 * The '<em><b>Mc Nemar Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #MC_NEMAR_TEST_VALUE
	 * @generated
	 * @ordered
	 */
  MC_NEMAR_TEST(4, "McNemarTest", "McNemar Test"),

  /**
	 * The '<em><b>Mann Whitney</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #MANN_WHITNEY_VALUE
	 * @generated
	 * @ordered
	 */
  MANN_WHITNEY(5, "MannWhitney", "Mann-Whitney"),

  /**
	 * The '<em><b>Paired</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #PAIRED_VALUE
	 * @generated
	 * @ordered
	 */
  PAIRED(6, "paired", "Paired t-test"),

  /**
	 * The '<em><b>Wilcoxon</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #WILCOXON_VALUE
	 * @generated
	 * @ordered
	 */
  WILCOXON(7, "wilcoxon", "Wilcoxon"),

  /**
	 * The '<em><b>Sign Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #SIGN_TEST_VALUE
	 * @generated
	 * @ordered
	 */
  SIGN_TEST(8, "signTest", "Sign test"),

  /**
	 * The '<em><b>Anova</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #ANOVA_VALUE
	 * @generated
	 * @ordered
	 */
  ANOVA(9, "anova", "ANOVA"),

  /**
	 * The '<em><b>Kruskal Wallis</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #KRUSKAL_WALLIS_VALUE
	 * @generated
	 * @ordered
	 */
  KRUSKAL_WALLIS(10, "kruskalWallis", "Kruskal-Wallis"),

  /**
	 * The '<em><b>Others</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #OTHERS_VALUE
	 * @generated
	 * @ordered
	 */
  OTHERS(11, "others", "Others");

  /**
	 * The '<em><b>Chi2</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Chi2</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #CHI2
	 * @model name="chi2" literal="Chi-2"
	 * @generated
	 * @ordered
	 */
  public static final int CHI2_VALUE = 0;

  /**
	 * The '<em><b>Binomial Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Binomial Test</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #BINOMIAL_TEST
	 * @model name="binomialTest" literal="Binomial Test"
	 * @generated
	 * @ordered
	 */
  public static final int BINOMIAL_TEST_VALUE = 1;

  /**
	 * The '<em><b>TTest</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TTest</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #TTEST
	 * @model name="tTest" literal="t-test"
	 * @generated
	 * @ordered
	 */
  public static final int TTEST_VALUE = 2;

  /**
	 * The '<em><b>FTest</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FTest</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #FTEST
	 * @model name="fTest" literal="F-test"
	 * @generated
	 * @ordered
	 */
  public static final int FTEST_VALUE = 3;

  /**
	 * The '<em><b>Mc Nemar Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Mc Nemar Test</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #MC_NEMAR_TEST
	 * @model name="McNemarTest" literal="McNemar Test"
	 * @generated
	 * @ordered
	 */
  public static final int MC_NEMAR_TEST_VALUE = 4;

  /**
	 * The '<em><b>Mann Whitney</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Mann Whitney</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #MANN_WHITNEY
	 * @model name="MannWhitney" literal="Mann-Whitney"
	 * @generated
	 * @ordered
	 */
  public static final int MANN_WHITNEY_VALUE = 5;

  /**
	 * The '<em><b>Paired</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Paired</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #PAIRED
	 * @model name="paired" literal="Paired t-test"
	 * @generated
	 * @ordered
	 */
  public static final int PAIRED_VALUE = 6;

  /**
	 * The '<em><b>Wilcoxon</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Wilcoxon</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #WILCOXON
	 * @model name="wilcoxon" literal="Wilcoxon"
	 * @generated
	 * @ordered
	 */
  public static final int WILCOXON_VALUE = 7;

  /**
	 * The '<em><b>Sign Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sign Test</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #SIGN_TEST
	 * @model name="signTest" literal="Sign test"
	 * @generated
	 * @ordered
	 */
  public static final int SIGN_TEST_VALUE = 8;

  /**
	 * The '<em><b>Anova</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Anova</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #ANOVA
	 * @model name="anova" literal="ANOVA"
	 * @generated
	 * @ordered
	 */
  public static final int ANOVA_VALUE = 9;

  /**
	 * The '<em><b>Kruskal Wallis</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Kruskal Wallis</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #KRUSKAL_WALLIS
	 * @model name="kruskalWallis" literal="Kruskal-Wallis"
	 * @generated
	 * @ordered
	 */
  public static final int KRUSKAL_WALLIS_VALUE = 10;

  /**
	 * The '<em><b>Others</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Others</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #OTHERS
	 * @model name="others" literal="Others"
	 * @generated
	 * @ordered
	 */
  public static final int OTHERS_VALUE = 11;

  /**
	 * An array of all the '<em><b>Analysis Techique Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final AnalysisTechiqueType[] VALUES_ARRAY =
    new AnalysisTechiqueType[] {
			CHI2,
			BINOMIAL_TEST,
			TTEST,
			FTEST,
			MC_NEMAR_TEST,
			MANN_WHITNEY,
			PAIRED,
			WILCOXON,
			SIGN_TEST,
			ANOVA,
			KRUSKAL_WALLIS,
			OTHERS,
		};

  /**
	 * A public read-only list of all the '<em><b>Analysis Techique Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<AnalysisTechiqueType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Analysis Techique Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static AnalysisTechiqueType get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AnalysisTechiqueType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Analysis Techique Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static AnalysisTechiqueType getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AnalysisTechiqueType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Analysis Techique Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static AnalysisTechiqueType get(int value)
  {
		switch (value) {
			case CHI2_VALUE: return CHI2;
			case BINOMIAL_TEST_VALUE: return BINOMIAL_TEST;
			case TTEST_VALUE: return TTEST;
			case FTEST_VALUE: return FTEST;
			case MC_NEMAR_TEST_VALUE: return MC_NEMAR_TEST;
			case MANN_WHITNEY_VALUE: return MANN_WHITNEY;
			case PAIRED_VALUE: return PAIRED;
			case WILCOXON_VALUE: return WILCOXON;
			case SIGN_TEST_VALUE: return SIGN_TEST;
			case ANOVA_VALUE: return ANOVA;
			case KRUSKAL_WALLIS_VALUE: return KRUSKAL_WALLIS;
			case OTHERS_VALUE: return OTHERS;
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
  private AnalysisTechiqueType(int value, String name, String literal)
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
  
} //AnalysisTechiqueType

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.dimap.ase.dsl.expdslv3.tests;

import br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Factory;
import br.ufrn.dimap.ase.dsl.expdslv3.StructuredGoal;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Structured Goal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredGoalTest extends GoalTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StructuredGoalTest.class);
	}

	/**
	 * Constructs a new Structured Goal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredGoalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Structured Goal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StructuredGoal getFixture() {
		return (StructuredGoal)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Expdslv3Factory.eINSTANCE.createStructuredGoal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //StructuredGoalTest

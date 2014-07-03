/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.dimap.ase.dsl.expdslv3.tests;

import br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Factory;
import br.ufrn.dimap.ase.dsl.expdslv3.Goal;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoalTest extends TestCase {

	/**
	 * The fixture for this Goal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Goal fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GoalTest.class);
	}

	/**
	 * Constructs a new Goal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Goal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Goal fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Goal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Goal getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Expdslv3Factory.eINSTANCE.createGoal());
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

} //GoalTest

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.dimap.ase.dsl.expDslv2.tests;

import br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Factory;
import br.ufrn.dimap.ase.dsl.expDslv2.TaskMetric;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Metric</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskMetricTest extends DetailTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskMetricTest.class);
	}

	/**
	 * Constructs a new Task Metric test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskMetricTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Task Metric test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TaskMetric getFixture() {
		return (TaskMetric)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExpDslv2Factory.eINSTANCE.createTaskMetric());
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

} //TaskMetricTest

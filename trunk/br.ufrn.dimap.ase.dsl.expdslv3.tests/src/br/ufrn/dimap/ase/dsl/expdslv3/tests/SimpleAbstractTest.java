/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.dimap.ase.dsl.expdslv3.tests;

import br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Factory;
import br.ufrn.dimap.ase.dsl.expdslv3.SimpleAbstract;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Abstract</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleAbstractTest extends AbstractTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleAbstractTest.class);
	}

	/**
	 * Constructs a new Simple Abstract test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAbstractTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Abstract test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleAbstract getFixture() {
		return (SimpleAbstract)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Expdslv3Factory.eINSTANCE.createSimpleAbstract());
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

} //SimpleAbstractTest

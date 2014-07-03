/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.dimap.ase.dsl.expdslv3.tests;

import br.ufrn.dimap.ase.dsl.expdslv3.CRB;
import br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>CRB</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CRBTest extends DOETest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CRBTest.class);
	}

	/**
	 * Constructs a new CRB test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRBTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this CRB test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CRB getFixture() {
		return (CRB)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Expdslv3Factory.eINSTANCE.createCRB());
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

} //CRBTest

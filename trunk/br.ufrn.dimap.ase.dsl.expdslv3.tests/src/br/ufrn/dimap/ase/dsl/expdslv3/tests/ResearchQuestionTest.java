/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufrn.dimap.ase.dsl.expdslv3.tests;

import br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Factory;
import br.ufrn.dimap.ase.dsl.expdslv3.ResearchQuestion;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Research Question</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResearchQuestionTest extends TestCase {

	/**
	 * The fixture for this Research Question test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResearchQuestion fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResearchQuestionTest.class);
	}

	/**
	 * Constructs a new Research Question test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchQuestionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Research Question test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ResearchQuestion fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Research Question test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResearchQuestion getFixture() {
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
		setFixture(Expdslv3Factory.eINSTANCE.createResearchQuestion());
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

} //ResearchQuestionTest

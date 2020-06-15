/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.SubprogramPrototype;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subprogram Prototype</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubprogramPrototypeTest extends ComponentPrototypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubprogramPrototypeTest.class);
	}

	/**
	 * Constructs a new Subprogram Prototype test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramPrototypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subprogram Prototype test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SubprogramPrototype getFixture() {
		return (SubprogramPrototype) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createSubprogramPrototype());
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

} //SubprogramPrototypeTest

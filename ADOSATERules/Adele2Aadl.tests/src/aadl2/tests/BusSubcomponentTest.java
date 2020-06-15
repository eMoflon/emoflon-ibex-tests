/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.BusSubcomponent;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bus Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusSubcomponentTest extends SubcomponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusSubcomponentTest.class);
	}

	/**
	 * Constructs a new Bus Subcomponent test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusSubcomponentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bus Subcomponent test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BusSubcomponent getFixture() {
		return (BusSubcomponent) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createBusSubcomponent());
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

} //BusSubcomponentTest

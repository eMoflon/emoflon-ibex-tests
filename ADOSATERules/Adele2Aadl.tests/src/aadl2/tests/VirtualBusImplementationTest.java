/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.VirtualBusImplementation;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Virtual Bus Implementation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VirtualBusImplementationTest extends ComponentImplementationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VirtualBusImplementationTest.class);
	}

	/**
	 * Constructs a new Virtual Bus Implementation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualBusImplementationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Virtual Bus Implementation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VirtualBusImplementation getFixture() {
		return (VirtualBusImplementation) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createVirtualBusImplementation());
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

} //VirtualBusImplementationTest

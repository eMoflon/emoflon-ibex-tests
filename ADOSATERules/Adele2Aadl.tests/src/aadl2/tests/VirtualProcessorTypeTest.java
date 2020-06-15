/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.VirtualProcessorType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Virtual Processor Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VirtualProcessorTypeTest extends ComponentTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VirtualProcessorTypeTest.class);
	}

	/**
	 * Constructs a new Virtual Processor Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualProcessorTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Virtual Processor Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VirtualProcessorType getFixture() {
		return (VirtualProcessorType) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createVirtualProcessorType());
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

} //VirtualProcessorTypeTest

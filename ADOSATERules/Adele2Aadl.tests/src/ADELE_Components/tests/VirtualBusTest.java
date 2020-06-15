/**
 */
package ADELE_Components.tests;

import ADELE_Components.ADELE_ComponentsFactory;
import ADELE_Components.VirtualBus;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Virtual Bus</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VirtualBusTest extends ComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VirtualBusTest.class);
	}

	/**
	 * Constructs a new Virtual Bus test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualBusTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Virtual Bus test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VirtualBus getFixture() {
		return (VirtualBus) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ADELE_ComponentsFactory.eINSTANCE.createVirtualBus());
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

} //VirtualBusTest

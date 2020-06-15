/**
 */
package ADELE_Relations.tests;

import ADELE_Relations.ADELE_RelationsFactory;
import ADELE_Relations.BusAccessConnection;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bus Access Connection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusAccessConnectionTest extends AccessConnectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusAccessConnectionTest.class);
	}

	/**
	 * Constructs a new Bus Access Connection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusAccessConnectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bus Access Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BusAccessConnection getFixture() {
		return (BusAccessConnection) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ADELE_RelationsFactory.eINSTANCE.createBusAccessConnection());
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

} //BusAccessConnectionTest

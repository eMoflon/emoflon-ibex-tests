/**
 */
package ADELE_Components.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ADELE_Components</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ADELE_ComponentsTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ADELE_ComponentsTests("ADELE_Components Tests");
		suite.addTestSuite(BusTest.class);
		suite.addTestSuite(PackageTest.class);
		suite.addTestSuite(DataTest.class);
		suite.addTestSuite(DeviceTest.class);
		suite.addTestSuite(MemoryTest.class);
		suite.addTestSuite(ProcessTest.class);
		suite.addTestSuite(ProcessorTest.class);
		suite.addTestSuite(SubprogramTest.class);
		suite.addTestSuite(SystemTest.class);
		suite.addTestSuite(ThreadTest.class);
		suite.addTestSuite(ThreadGroupTest.class);
		suite.addTestSuite(SubprogramGroupTest.class);
		suite.addTestSuite(AbstractTest.class);
		suite.addTestSuite(VirtualProcessorTest.class);
		suite.addTestSuite(VirtualBusTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADELE_ComponentsTests(String name) {
		super(name);
	}

} //ADELE_ComponentsTests

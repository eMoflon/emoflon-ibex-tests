/**
 */
package ADELE_Relations.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ADELE_Relations</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ADELE_RelationsTests extends TestSuite {

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
		TestSuite suite = new ADELE_RelationsTests("ADELE_Relations Tests");
		suite.addTestSuite(BusAccessConnectionTest.class);
		suite.addTestSuite(DataAccessConnectionTest.class);
		suite.addTestSuite(SubprogramAccessConnectionTest.class);
		suite.addTestSuite(SubprogramGroupAccessConnectionTest.class);
		suite.addTestSuite(EventPortConnectionTest.class);
		suite.addTestSuite(DataPortConnectionTest.class);
		suite.addTestSuite(EventDataPortConnectionTest.class);
		suite.addTestSuite(ParameterConnectionTest.class);
		suite.addTestSuite(AbstractFeatureConnectionTest.class);
		suite.addTestSuite(FeatureGroupConnectionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADELE_RelationsTests(String name) {
		super(name);
	}

} //ADELE_RelationsTests

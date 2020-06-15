/**
 */
package ADELE_Features.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ADELE_Features</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ADELE_FeaturesTests extends TestSuite {

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
		TestSuite suite = new ADELE_FeaturesTests("ADELE_Features Tests");
		suite.addTestSuite(BusAccessTest.class);
		suite.addTestSuite(DataAccessTest.class);
		suite.addTestSuite(SubprogramAccessTest.class);
		suite.addTestSuite(SubprogramGroupAccessTest.class);
		suite.addTestSuite(ParameterTest.class);
		suite.addTestSuite(FeatureGroupTest.class);
		suite.addTestSuite(EventPortTest.class);
		suite.addTestSuite(DataPortTest.class);
		suite.addTestSuite(EventDataPortTest.class);
		suite.addTestSuite(AbstractFeatureTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADELE_FeaturesTests(String name) {
		super(name);
	}

} //ADELE_FeaturesTests

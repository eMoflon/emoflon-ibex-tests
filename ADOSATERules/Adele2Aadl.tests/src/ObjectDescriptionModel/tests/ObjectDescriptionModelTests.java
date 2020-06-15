/**
 */
package ObjectDescriptionModel.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ObjectDescriptionModel</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectDescriptionModelTests extends TestSuite {

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
		TestSuite suite = new ObjectDescriptionModelTests("ObjectDescriptionModel Tests");
		suite.addTestSuite(SKODSectionTest.class);
		suite.addTestSuite(SKODSystemTest.class);
		suite.addTestSuite(SKODSFactoryTest.class);
		suite.addTestSuite(SKODDataTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectDescriptionModelTests(String name) {
		super(name);
	}

} //ObjectDescriptionModelTests

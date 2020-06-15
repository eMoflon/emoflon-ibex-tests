/**
 */
package ADELE_Relations.tests;

import ADELE_Relations.ADELE_RelationsFactory;
import ADELE_Relations.DataAccessConnection;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Access Connection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataAccessConnectionTest extends AccessConnectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataAccessConnectionTest.class);
	}

	/**
	 * Constructs a new Data Access Connection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAccessConnectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Access Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataAccessConnection getFixture() {
		return (DataAccessConnection) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ADELE_RelationsFactory.eINSTANCE.createDataAccessConnection());
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

} //DataAccessConnectionTest

/**
 */
package ADELE_Relations.tests;

import ADELE_Relations.ADELE_RelationsFactory;
import ADELE_Relations.ParameterConnection;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameter Connection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterConnectionTest extends DirectedFeatureConnectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParameterConnectionTest.class);
	}

	/**
	 * Constructs a new Parameter Connection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterConnectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Parameter Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ParameterConnection getFixture() {
		return (ParameterConnection) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ADELE_RelationsFactory.eINSTANCE.createParameterConnection());
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

} //ParameterConnectionTest

/**
 */
package ADELE_Relations.tests;

import ADELE_Relations.ADELE_RelationsFactory;
import ADELE_Relations.AbstractFeatureConnection;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Abstract Feature Connection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractFeatureConnectionTest extends DirectedFeatureConnectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AbstractFeatureConnectionTest.class);
	}

	/**
	 * Constructs a new Abstract Feature Connection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFeatureConnectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Abstract Feature Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AbstractFeatureConnection getFixture() {
		return (AbstractFeatureConnection) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ADELE_RelationsFactory.eINSTANCE.createAbstractFeatureConnection());
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

} //AbstractFeatureConnectionTest

/**
 */
package runtime.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import runtime.RuntimeFactory;
import runtime.TempContainer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Temp Container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TempContainerTest extends TestCase {

	/**
	 * The fixture for this Temp Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TempContainer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TempContainerTest.class);
	}

	/**
	 * Constructs a new Temp Container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TempContainerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Temp Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TempContainer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Temp Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TempContainer getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RuntimeFactory.eINSTANCE.createTempContainer());
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

} //TempContainerTest

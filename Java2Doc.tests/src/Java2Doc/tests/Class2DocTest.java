/**
 */
package Java2Doc.tests;

import Java2Doc.Class2Doc;
import Java2Doc.Java2DocFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Class2 Doc</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Class2DocTest extends TestCase {

	/**
	 * The fixture for this Class2 Doc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Class2Doc fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Class2DocTest.class);
	}

	/**
	 * Constructs a new Class2 Doc test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class2DocTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Class2 Doc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Class2Doc fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Class2 Doc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Class2Doc getFixture() {
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
		setFixture(Java2DocFactory.eINSTANCE.createClass2Doc());
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

} //Class2DocTest

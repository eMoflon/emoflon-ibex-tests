/**
 */
package simpleDoc.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import simpleDoc.Doc;
import simpleDoc.SimpleDocFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Doc</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocTest extends TestCase {

	/**
	 * The fixture for this Doc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Doc fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DocTest.class);
	}

	/**
	 * Constructs a new Doc test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Doc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Doc fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Doc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Doc getFixture() {
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
		setFixture(SimpleDocFactory.eINSTANCE.createDoc());
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

} //DocTest

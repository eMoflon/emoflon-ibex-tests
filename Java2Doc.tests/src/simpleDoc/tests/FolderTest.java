/**
 */
package simpleDoc.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import simpleDoc.Folder;
import simpleDoc.SimpleDocFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FolderTest extends TestCase {

	/**
	 * The fixture for this Folder test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Folder fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FolderTest.class);
	}

	/**
	 * Constructs a new Folder test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FolderTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Folder test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Folder fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Folder test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Folder getFixture() {
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
		setFixture(SimpleDocFactory.eINSTANCE.createFolder());
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

} //FolderTest

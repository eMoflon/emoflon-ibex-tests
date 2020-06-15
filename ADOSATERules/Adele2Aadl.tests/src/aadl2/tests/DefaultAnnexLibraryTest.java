/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.DefaultAnnexLibrary;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Default Annex Library</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DefaultAnnexLibraryTest extends AnnexLibraryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DefaultAnnexLibraryTest.class);
	}

	/**
	 * Constructs a new Default Annex Library test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultAnnexLibraryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Default Annex Library test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DefaultAnnexLibrary getFixture() {
		return (DefaultAnnexLibrary) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createDefaultAnnexLibrary());
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

} //DefaultAnnexLibraryTest

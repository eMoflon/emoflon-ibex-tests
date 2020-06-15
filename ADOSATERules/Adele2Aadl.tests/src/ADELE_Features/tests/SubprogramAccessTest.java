/**
 */
package ADELE_Features.tests;

import ADELE_Features.ADELE_FeaturesFactory;
import ADELE_Features.SubprogramAccess;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subprogram Access</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubprogramAccessTest extends AccessTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubprogramAccessTest.class);
	}

	/**
	 * Constructs a new Subprogram Access test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramAccessTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subprogram Access test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SubprogramAccess getFixture() {
		return (SubprogramAccess) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ADELE_FeaturesFactory.eINSTANCE.createSubprogramAccess());
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

} //SubprogramAccessTest

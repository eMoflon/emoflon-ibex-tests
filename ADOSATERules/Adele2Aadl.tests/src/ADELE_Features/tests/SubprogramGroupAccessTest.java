/**
 */
package ADELE_Features.tests;

import ADELE_Features.ADELE_FeaturesFactory;
import ADELE_Features.SubprogramGroupAccess;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subprogram Group Access</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubprogramGroupAccessTest extends AccessTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubprogramGroupAccessTest.class);
	}

	/**
	 * Constructs a new Subprogram Group Access test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramGroupAccessTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subprogram Group Access test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SubprogramGroupAccess getFixture() {
		return (SubprogramGroupAccess) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ADELE_FeaturesFactory.eINSTANCE.createSubprogramGroupAccess());
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

} //SubprogramGroupAccessTest

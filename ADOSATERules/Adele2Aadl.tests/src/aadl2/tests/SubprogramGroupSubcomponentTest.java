/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.SubprogramGroupSubcomponent;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subprogram Group Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubprogramGroupSubcomponentTest extends SubcomponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubprogramGroupSubcomponentTest.class);
	}

	/**
	 * Constructs a new Subprogram Group Subcomponent test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramGroupSubcomponentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subprogram Group Subcomponent test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SubprogramGroupSubcomponent getFixture() {
		return (SubprogramGroupSubcomponent) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createSubprogramGroupSubcomponent());
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

} //SubprogramGroupSubcomponentTest

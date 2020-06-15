/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.FeatureGroupPrototypeActual;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feature Group Prototype Actual</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureGroupPrototypeActualTest extends FeaturePrototypeActualTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeatureGroupPrototypeActualTest.class);
	}

	/**
	 * Constructs a new Feature Group Prototype Actual test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroupPrototypeActualTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Feature Group Prototype Actual test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FeatureGroupPrototypeActual getFixture() {
		return (FeatureGroupPrototypeActual) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createFeatureGroupPrototypeActual());
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

} //FeatureGroupPrototypeActualTest

/**
 */
package KernelSpices.tests;

import KernelSpices.KernelSpicesFactory;
import KernelSpices.SKFeature;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>SK Feature</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SKFeatureTest extends SKHierarchicalObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SKFeatureTest.class);
	}

	/**
	 * Constructs a new SK Feature test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SKFeatureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this SK Feature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SKFeature getFixture() {
		return (SKFeature) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KernelSpicesFactory.eINSTANCE.createSKFeature());
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

} //SKFeatureTest

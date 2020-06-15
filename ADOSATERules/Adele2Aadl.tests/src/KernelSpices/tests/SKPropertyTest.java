/**
 */
package KernelSpices.tests;

import KernelSpices.KernelSpicesFactory;
import KernelSpices.SKProperty;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>SK Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SKPropertyTest extends SKHierarchicalObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SKPropertyTest.class);
	}

	/**
	 * Constructs a new SK Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SKPropertyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this SK Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SKProperty getFixture() {
		return (SKProperty) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KernelSpicesFactory.eINSTANCE.createSKProperty());
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

} //SKPropertyTest

/**
 */
package KernelSpices.tests;

import KernelSpices.KernelSpicesFactory;
import KernelSpices.SKRelation;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>SK Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SKRelationTest extends SKHierarchicalObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SKRelationTest.class);
	}

	/**
	 * Constructs a new SK Relation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SKRelationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this SK Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SKRelation getFixture() {
		return (SKRelation) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KernelSpicesFactory.eINSTANCE.createSKRelation());
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

} //SKRelationTest

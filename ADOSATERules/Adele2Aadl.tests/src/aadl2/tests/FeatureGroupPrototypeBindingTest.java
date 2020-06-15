/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.FeatureGroupPrototypeBinding;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feature Group Prototype Binding</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureGroupPrototypeBindingTest extends PrototypeBindingTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeatureGroupPrototypeBindingTest.class);
	}

	/**
	 * Constructs a new Feature Group Prototype Binding test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroupPrototypeBindingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Feature Group Prototype Binding test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FeatureGroupPrototypeBinding getFixture() {
		return (FeatureGroupPrototypeBinding) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createFeatureGroupPrototypeBinding());
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

} //FeatureGroupPrototypeBindingTest

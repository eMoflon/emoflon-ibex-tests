/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.ComponentPrototypeBinding;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Prototype Binding</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentPrototypeBindingTest extends PrototypeBindingTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentPrototypeBindingTest.class);
	}

	/**
	 * Constructs a new Component Prototype Binding test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPrototypeBindingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Component Prototype Binding test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComponentPrototypeBinding getFixture() {
		return (ComponentPrototypeBinding) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createComponentPrototypeBinding());
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

} //ComponentPrototypeBindingTest

/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.ComponentImplementationReference;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Implementation Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentImplementationReferenceTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentImplementationReferenceTest.class);
	}

	/**
	 * Constructs a new Component Implementation Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentImplementationReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Component Implementation Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComponentImplementationReference getFixture() {
		return (ComponentImplementationReference) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createComponentImplementationReference());
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

} //ComponentImplementationReferenceTest

/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.ModalPropertyValue;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Modal Property Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModalPropertyValueTest extends ModalElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModalPropertyValueTest.class);
	}

	/**
	 * Constructs a new Modal Property Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalPropertyValueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Modal Property Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ModalPropertyValue getFixture() {
		return (ModalPropertyValue) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createModalPropertyValue());
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

} //ModalPropertyValueTest

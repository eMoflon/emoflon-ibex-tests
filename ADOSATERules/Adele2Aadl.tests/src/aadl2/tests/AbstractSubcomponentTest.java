/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.AbstractSubcomponent;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Abstract Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractSubcomponentTest extends SubcomponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AbstractSubcomponentTest.class);
	}

	/**
	 * Constructs a new Abstract Subcomponent test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSubcomponentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Abstract Subcomponent test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AbstractSubcomponent getFixture() {
		return (AbstractSubcomponent) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createAbstractSubcomponent());
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

} //AbstractSubcomponentTest

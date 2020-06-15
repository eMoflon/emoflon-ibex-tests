/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.ThreadGroupImplementation;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Thread Group Implementation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThreadGroupImplementationTest extends ComponentImplementationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ThreadGroupImplementationTest.class);
	}

	/**
	 * Constructs a new Thread Group Implementation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadGroupImplementationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Thread Group Implementation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ThreadGroupImplementation getFixture() {
		return (ThreadGroupImplementation) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createThreadGroupImplementation());
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

} //ThreadGroupImplementationTest

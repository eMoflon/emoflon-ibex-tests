/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.SubprogramProxy;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subprogram Proxy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubprogramProxyTest extends ProcessorFeatureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubprogramProxyTest.class);
	}

	/**
	 * Constructs a new Subprogram Proxy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramProxyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subprogram Proxy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SubprogramProxy getFixture() {
		return (SubprogramProxy) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createSubprogramProxy());
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

} //SubprogramProxyTest

/**
 */
package ADELE_Components.tests;

import ADELE_Components.ADELE_ComponentsFactory;
import ADELE_Components.VirtualProcessor;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Virtual Processor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VirtualProcessorTest extends ComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VirtualProcessorTest.class);
	}

	/**
	 * Constructs a new Virtual Processor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualProcessorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Virtual Processor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VirtualProcessor getFixture() {
		return (VirtualProcessor) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ADELE_ComponentsFactory.eINSTANCE.createVirtualProcessor());
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

} //VirtualProcessorTest

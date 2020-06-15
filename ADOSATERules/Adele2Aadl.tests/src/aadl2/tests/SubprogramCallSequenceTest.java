/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.SubprogramCallSequence;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subprogram Call Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link aadl2.ModalElement#getAllInModes() <em>Get All In Modes</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SubprogramCallSequenceTest extends BehavioralFeatureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubprogramCallSequenceTest.class);
	}

	/**
	 * Constructs a new Subprogram Call Sequence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramCallSequenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subprogram Call Sequence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SubprogramCallSequence getFixture() {
		return (SubprogramCallSequence) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createSubprogramCallSequence());
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

	/**
	 * Tests the '{@link aadl2.ModalElement#getAllInModes() <em>Get All In Modes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aadl2.ModalElement#getAllInModes()
	 * @generated
	 */
	public void testGetAllInModes() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //SubprogramCallSequenceTest

/**
 */
package ADELE_Features.tests;

import ADELE_Features.ADELE_FeaturesFactory;
import ADELE_Features.EventDataPort;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Event Data Port</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventDataPortTest extends DirectedFeatureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EventDataPortTest.class);
	}

	/**
	 * Constructs a new Event Data Port test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDataPortTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Event Data Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EventDataPort getFixture() {
		return (EventDataPort) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ADELE_FeaturesFactory.eINSTANCE.createEventDataPort());
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

} //EventDataPortTest

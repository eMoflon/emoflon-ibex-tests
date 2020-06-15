/**
 */
package ADELE_Relations.tests;

import ADELE_Relations.ADELE_RelationsFactory;
import ADELE_Relations.EventDataPortConnection;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Event Data Port Connection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventDataPortConnectionTest extends DirectedFeatureConnectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EventDataPortConnectionTest.class);
	}

	/**
	 * Constructs a new Event Data Port Connection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDataPortConnectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Event Data Port Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EventDataPortConnection getFixture() {
		return (EventDataPortConnection) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ADELE_RelationsFactory.eINSTANCE.createEventDataPortConnection());
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

} //EventDataPortConnectionTest

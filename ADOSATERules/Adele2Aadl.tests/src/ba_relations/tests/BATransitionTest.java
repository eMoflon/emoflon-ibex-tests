/**
 */
package ba_relations.tests;

import ba_relations.BATransition;
import ba_relations.Ba_relationsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BA Transition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BATransitionTest extends BARelationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BATransitionTest.class);
	}

	/**
	 * Constructs a new BA Transition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BATransitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BA Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BATransition getFixture() {
		return (BATransition) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Ba_relationsFactory.eINSTANCE.createBATransition());
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

} //BATransitionTest

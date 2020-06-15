/**
 */
package ADELE_Components.tests;

import ADELE_Components.ADELE_ComponentsFactory;
import ADELE_Components.Subprogram;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subprogram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubprogramTest extends ComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubprogramTest.class);
	}

	/**
	 * Constructs a new Subprogram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subprogram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Subprogram getFixture() {
		return (Subprogram) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ADELE_ComponentsFactory.eINSTANCE.createSubprogram());
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

} //SubprogramTest

/**
 */
package runtime.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import runtime.RuntimeFactory;
import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TGG Rule Application</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TGGRuleApplicationTest extends TestCase {

	/**
	 * The fixture for this TGG Rule Application test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TGGRuleApplication fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TGGRuleApplicationTest.class);
	}

	/**
	 * Constructs a new TGG Rule Application test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TGGRuleApplicationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this TGG Rule Application test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TGGRuleApplication fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this TGG Rule Application test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TGGRuleApplication getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RuntimeFactory.eINSTANCE.createTGGRuleApplication());
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

} //TGGRuleApplicationTest

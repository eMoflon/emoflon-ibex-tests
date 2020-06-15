/**
 */
package ADELE_Features.tests;

import ADELE_Features.ADELE_FeaturesFactory;
import ADELE_Features.AbstractFeature;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Abstract Feature</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractFeatureTest extends DirectedFeatureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AbstractFeatureTest.class);
	}

	/**
	 * Constructs a new Abstract Feature test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFeatureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Abstract Feature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AbstractFeature getFixture() {
		return (AbstractFeature) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ADELE_FeaturesFactory.eINSTANCE.createAbstractFeature());
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

} //AbstractFeatureTest

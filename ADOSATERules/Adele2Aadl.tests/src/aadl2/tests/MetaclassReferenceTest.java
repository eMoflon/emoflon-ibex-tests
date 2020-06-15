/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.MetaclassReference;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Metaclass Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaclassReferenceTest extends PropertyOwnerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MetaclassReferenceTest.class);
	}

	/**
	 * Constructs a new Metaclass Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaclassReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Metaclass Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MetaclassReference getFixture() {
		return (MetaclassReference) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createMetaclassReference());
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

} //MetaclassReferenceTest

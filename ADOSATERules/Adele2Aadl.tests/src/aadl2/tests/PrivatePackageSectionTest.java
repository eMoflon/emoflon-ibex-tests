/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.PrivatePackageSection;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Private Package Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link aadl2.PrivatePackageSection#getPublicSection() <em>Public Section</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PrivatePackageSectionTest extends PackageSectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrivatePackageSectionTest.class);
	}

	/**
	 * Constructs a new Private Package Section test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivatePackageSectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Private Package Section test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PrivatePackageSection getFixture() {
		return (PrivatePackageSection) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createPrivatePackageSection());
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
	 * Tests the '{@link aadl2.PrivatePackageSection#getPublicSection() <em>Public Section</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aadl2.PrivatePackageSection#getPublicSection()
	 * @generated
	 */
	public void testGetPublicSection() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //PrivatePackageSectionTest

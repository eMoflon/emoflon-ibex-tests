/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.PublicPackageSection;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Public Package Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link aadl2.PublicPackageSection#getPrivateSection() <em>Private Section</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PublicPackageSectionTest extends PackageSectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PublicPackageSectionTest.class);
	}

	/**
	 * Constructs a new Public Package Section test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicPackageSectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Public Package Section test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PublicPackageSection getFixture() {
		return (PublicPackageSection) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createPublicPackageSection());
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
	 * Tests the '{@link aadl2.PublicPackageSection#getPrivateSection() <em>Private Section</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aadl2.PublicPackageSection#getPrivateSection()
	 * @generated
	 */
	public void testGetPrivateSection() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //PublicPackageSectionTest

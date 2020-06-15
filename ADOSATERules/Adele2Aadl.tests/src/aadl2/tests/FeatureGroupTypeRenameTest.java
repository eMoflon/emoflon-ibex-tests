/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.FeatureGroupTypeRename;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feature Group Type Rename</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureGroupTypeRenameTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeatureGroupTypeRenameTest.class);
	}

	/**
	 * Constructs a new Feature Group Type Rename test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroupTypeRenameTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Feature Group Type Rename test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FeatureGroupTypeRename getFixture() {
		return (FeatureGroupTypeRename) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createFeatureGroupTypeRename());
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

} //FeatureGroupTypeRenameTest

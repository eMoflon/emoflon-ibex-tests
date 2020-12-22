/**
 * generated by Xtext 2.23.0
 */
package org.emoflon.express.express.tests;

import junit.textui.TestRunner;

import org.emoflon.express.express.BooleanAttribute;
import org.emoflon.express.express.ExpressFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanAttributeTest extends AttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BooleanAttributeTest.class);
	}

	/**
	 * Constructs a new Boolean Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boolean Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BooleanAttribute getFixture() {
		return (BooleanAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExpressFactory.eINSTANCE.createBooleanAttribute());
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

} //BooleanAttributeTest

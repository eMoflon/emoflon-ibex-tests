/**
 */
package Adele2Aadl.tests;

import ADELE_Components.tests.ADELE_ComponentsTests;

import ADELE_Features.tests.ADELE_FeaturesTests;

import ADELE_Relations.tests.ADELE_RelationsTests;

import KernelSpices.tests.KernelSpicesTests;

import ObjectDescriptionModel.tests.ObjectDescriptionModelTests;

import aadl2.tests.Aadl2Tests;

import ba_relations.tests.Ba_relationsTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Adele2Aadl</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class Adele2AadlAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new Adele2AadlAllTests("Adele2Aadl Tests");
		suite.addTest(ADELE_ComponentsTests.suite());
		suite.addTest(Aadl2Tests.suite());
		suite.addTest(ADELE_FeaturesTests.suite());
		suite.addTest(KernelSpicesTests.suite());
		suite.addTest(ADELE_RelationsTests.suite());
		suite.addTest(Ba_relationsTests.suite());
		suite.addTest(ObjectDescriptionModelTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adele2AadlAllTests(String name) {
		super(name);
	}

} //Adele2AadlAllTests

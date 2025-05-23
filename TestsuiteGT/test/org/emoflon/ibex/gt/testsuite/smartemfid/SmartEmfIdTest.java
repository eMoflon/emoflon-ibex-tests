package org.emoflon.ibex.gt.testsuite.smartemfid;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import SmartEmfIdMetamodel.SmartEmfIdMetamodelPackage;

public class SmartEmfIdTest {

	@Test
	public void testRootAttrIdDisabledStatus() {
		assertFalse(SmartEmfIdMetamodelPackage.eINSTANCE.getRoot_TestAttrWithoutIdFlag().isID());
	}

	@Test
	public void testRootAttrIdEnabledStatus() {
		assertTrue(SmartEmfIdMetamodelPackage.eINSTANCE.getRoot_TestAttrWithIdFlag().isID());
	}

	@Test
	public void testRootAttrUniqueEnabledStatus() {
		assertTrue(SmartEmfIdMetamodelPackage.eINSTANCE.getRoot_TestAttrWithoutIdFlag().isUnique());
	}

	@Test
	public void testRootAttrUniqueDisabledStatus() {
		assertFalse(SmartEmfIdMetamodelPackage.eINSTANCE.getRoot_TestAttrWithoutUniqueFlag().isUnique());
	}

}

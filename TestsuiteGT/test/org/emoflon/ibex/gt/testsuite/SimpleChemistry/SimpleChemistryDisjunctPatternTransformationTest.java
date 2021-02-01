package org.emoflon.ibex.gt.testsuite.SimpleChemistry;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import SimpleChemistryGraphTransformation.api.SimpleChemistryGraphTransformationAPI;


public class SimpleChemistryDisjunctPatternTransformationTest extends SimpleChemistryAbstractTest {
	
	@Test
	public void testTransformation() {
		SimpleChemistryGraphTransformationAPI api = this.init("H2O.xmi");
		
		//simple assertion if transformation is functioning
		assertTrue(api.createH2().isDisjunct());
		assertFalse(api.notDisjunctcreateH2().isDisjunct());

	
	}
}

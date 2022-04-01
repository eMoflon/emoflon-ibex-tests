package org.emoflon.ibex.gt.testsuite.SimpleEconomy;

import org.junit.jupiter.api.Test;

import SimpleEconomyGraphTransformation.api.SimpleEconomyGraphTransformationAPI;

public class SimpleEconomyConstraintTest extends SimpleEconomyAbstractTest{
	
	@Test
	public void testConstraints() {
		SimpleEconomyGraphTransformationAPI api = this.init("ConstraintMarket.xmi");
		
 		assertMatchCount((int) api.notDisjointequal().countMatches(), api.equal());
		assertMatchCount((int) api.notDisjointunequal().countMatches(), api.unequal());		
		assertMatchCount((int) api.notDisjointgreater().countMatches(), api.greater());
		assertMatchCount((int) api.notDisjointgreaterOrEqual().countMatches(), api.greaterOrEqual());
		assertMatchCount((int) api.notDisjointsmallerThan().countMatches(), api.smallerThan());
		assertMatchCount((int) api.notDisjointsmallerOrEqual().countMatches(), api.smallerOrEqual());
		
		//test incremental
		api.changeBudget(10.0).apply();
		assertMatchCount((int) api.notDisjointequal().countMatches(), api.equal());
		assertMatchCount((int) api.notDisjointunequal().countMatches(), api.unequal());	
		assertMatchCount((int) api.notDisjointgreaterOrEqual().countMatches(), api.greaterOrEqual());
		assertMatchCount((int) api.notDisjointsmallerThan().countMatches(), api.smallerThan());
		assertMatchCount((int) api.notDisjointsmallerOrEqual().countMatches(), api.smallerOrEqual());		
		assertMatchCount((int) api.notDisjointgreater().countMatches(), api.greater());

	}

}

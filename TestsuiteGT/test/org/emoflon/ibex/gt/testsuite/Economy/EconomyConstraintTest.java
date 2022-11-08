package org.emoflon.ibex.gt.testsuite.Economy;

import org.junit.jupiter.api.Test;

import economy.gt.api.GtGtAPI;

public class EconomyConstraintTest extends EconomyAbstractTest{
	
	@Test
	public void testConstraints() {
		GtGtAPI<?> api = this.init("ConstraintMarket.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
 		assertMatchCount((int) api.notDisjointequal().countMatches(), api.equal());
		assertMatchCount((int) api.notDisjointunequal().countMatches(), api.unequal());		
		assertMatchCount((int) api.notDisjointgreater().countMatches(), api.greater());
		assertMatchCount((int) api.notDisjointgreaterOrEqual().countMatches(), api.greaterOrEqual());
		assertMatchCount((int) api.notDisjointsmallerThan().countMatches(), api.smallerThan());
		assertMatchCount((int) api.notDisjointsmallerOrEqual().countMatches(), api.smallerOrEqual());
		
		//test incremental
		api.changeBudget(10.0).applyAny(true);
		assertMatchCount((int) api.notDisjointequal().countMatches(), api.equal());
		assertMatchCount((int) api.notDisjointunequal().countMatches(), api.unequal());	
		assertMatchCount((int) api.notDisjointgreaterOrEqual().countMatches(), api.greaterOrEqual());
		assertMatchCount((int) api.notDisjointsmallerThan().countMatches(), api.smallerThan());
		assertMatchCount((int) api.notDisjointsmallerOrEqual().countMatches(), api.smallerOrEqual());		
		assertMatchCount((int) api.notDisjointgreater().countMatches(), api.greater());
		
		api.terminate();
	}

}

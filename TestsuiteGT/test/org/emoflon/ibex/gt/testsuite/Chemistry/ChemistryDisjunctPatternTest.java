package org.emoflon.ibex.gt.testsuite.Chemistry;

import static org.junit.jupiter.api.Assertions.*;

import chemistry.gt.api.GtGtAPI;
import chemistry.gt.api.match.CreateH3Match;
import chemistry.gt.api.rule.CreateH3Rule;


import org.junit.jupiter.api.Test;



public class ChemistryDisjunctPatternTest extends ChemistryAbstractTest{
	
	
	@Test
	public void testMatchesWithoutConstraints() {
		GtGtAPI<?> api = this.init("H2O.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount((int) api.notDisjunctfindFreeAtoms().countMatches(), api.findFreeAtoms());
		api.simpleBind().applyAny();
		assertEquals((int) api.notDisjunctsimpleBind().countMatches(), ((int) api.simpleBind().matchStream().count()));
		assertMatchCount((int) api.notDisjunctfindFreeAtoms().countMatches(), api.findFreeAtoms());
		assertMatchCount((int) api.notDisjunctsimpleBind().countMatches(), api.simpleBind());
		assertApplicableAndApply(api.simpleBind());
		assertAnyMatchExists(api.simpleBind());
		
		api.terminate();
	}
	
	@Test
	public void testInjectivityConstraint() {
		GtGtAPI<?> api = this.init("H2O.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		//simple matchCount
		assertMatchCount((int) api.notDisjunctfindTwoH().countMatches(), api.findTwoH());
		assertEquals(api.notDisjunctfindTwoH().countMatches(), api.findTwoH().matchStream().count());
		//match count with 3 subpatterns
		assertMatchCount((int) api.notDisjunctfindThreeH().countMatches(), api.findThreeH());
		assertEquals(api.notDisjunctfindThreeH().countMatches(), api.findThreeH().matchStream().count());
		//getMatch() works;
		assertAnyMatchExists(api.findFreeAtoms());
		//matchcount with independent subpatterns that each have injectivity constraints
		assertMatchCount((int) api.notDisjunctfindTwoHAndO().countMatches(), api.findTwoHAndO());
		assertEquals(api.notDisjunctfindTwoHAndO().countMatches(), api.findTwoHAndO().matchStream().count());
		
		api.terminate();
	}
	
	@Test
	public void testIncremental2(){
		GtGtAPI<?> api = this.init("HO.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount((int) api.notDisjointcompleteH20().countMatches(), api.completeH20());
		assertApplicableAndApply(api.completeH20());
		api.completeH20().applyAny();
		assertMatchCount((int) api.notDisjointcompleteH20().countMatches(), api.completeH20());
		
		api.terminate();
	}
	
	@Test
	public void testinjectivityIncremental() {
		GtGtAPI<?> api = this.init("H2.xmi");	
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		//remove subpatterns + see if match stream works
		assertMatchCount((int) api.notDisjunctcreateH2().countMatches(), api.createH2());
		assertEquals(api.notDisjunctcreateH2().countMatches(), api.createH2().matchStream().count());
		api.createH2().applyAny();
		assertMatchCount((int) api.notDisjunctcreateH2().countMatches(), api.createH2());
		assertEquals(api.notDisjunctcreateH2().countMatches(), api.createH2().matchStream().count());
		api.createH2().applyAny();
		assertMatchCount((int) api.notDisjunctcreateH2().countMatches(), api.createH2());
		assertEquals(api.notDisjunctcreateH2().countMatches(), api.createH2().matchStream().count());
		api.createH2().applyAny();
		assertNotApplicable(api.createH2());
		//add subpatterns
		api.destroyH2().applyAny();
		assertMatchCount((int) api.notDisjunctcreateH2().countMatches(), api.createH2());
		api.destroyH2().applyAny();
		assertMatchCount((int) api.notDisjunctcreateH2().countMatches(), api.createH2());
		api.destroyH2().applyAny();
		assertMatchCount((int) api.notDisjunctcreateH2().countMatches(), api.createH2());
		
		api.terminate();
	}
	
	@Test
	public void testIncrementalWith3Subpatterns() {
		GtGtAPI<?> api = this.init("H3.xmi");	
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		//remove subpatterns
		assertMatchCount((int) api.notDisjunctCreateH3().countMatches(), api.createH3());
		assertEquals(api.notDisjunctCreateH3().countMatches(), api.createH3().matchStream().count());
		api.createH3().applyAny();
		assertMatchCount((int) api.notDisjunctCreateH3().countMatches(), api.createH3());
		assertEquals(api.notDisjunctCreateH3().countMatches(), api.createH3().matchStream().count());
		api.createH3().applyAny();
		assertMatchCount((int) api.notDisjunctCreateH3().countMatches(), api.createH3());
		assertEquals(api.notDisjunctCreateH3().countMatches(), api.createH3().matchStream().count());
		api.createH3().applyAny();
		assertNotApplicable(api.createH3());
		//add subpatterns
		api.destroyH3().applyAny();
		assertMatchCount((int) api.notDisjunctCreateH3().countMatches(), api.createH3());
		api.destroyH3().applyAny();
		assertMatchCount((int) api.notDisjunctCreateH3().countMatches(), api.createH3());
		api.destroyH3().applyAny();
		assertMatchCount((int) api.notDisjunctCreateH3().countMatches(), api.createH3());
		
		api.terminate();
	}
	
	@Test
	public void testSubscription() {
		GtGtAPI<?> api = this.init("H3.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		CreateH3Rule rule = api.createH3();
		while(rule.hasMatches())
			rule.applyAny();
		
		assertEquals(3, rule.countRuleApplications());
		
		api.terminate();
	}
	
	@Test 
	public void testRandomMatches() {
		GtGtAPI<?> api = this.init("H3.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		CreateH3Rule rule = api.createH3();
		CreateH3Match match1 = rule.findAnyMatch().get();
		assertTrue(!match1.h1().equals(match1.h2()) && !match1.h1().equals(match1.h3()) && !match1.h3().equals(match1.h2()));
		CreateH3Match match2 = rule.findAnyMatch().get();
		assertTrue(!match2.h1().equals(match2.h2()) && !match2.h1().equals(match2.h3()) && !match2.h3().equals(match2.h2()));
		CreateH3Match match3 = rule.findAnyMatch().get();
		assertTrue(!match1.h1().equals(match3.h2()) && !match3.h1().equals(match3.h3()) && !match3.h3().equals(match3.h2()));
		
		api.terminate();
	}

}

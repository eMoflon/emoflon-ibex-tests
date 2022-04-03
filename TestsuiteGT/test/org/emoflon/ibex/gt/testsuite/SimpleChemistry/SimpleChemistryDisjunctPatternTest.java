package org.emoflon.ibex.gt.testsuite.SimpleChemistry;

import static org.junit.jupiter.api.Assertions.*;

import SimpleChemistry.H;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Test;

import SimpleChemistryGraphTransformation.api.SimpleChemistryGraphTransformationAPI;
import SimpleChemistryGraphTransformation.api.matches.CreateH3Match;
import SimpleChemistryGraphTransformation.api.rules.CreateH3Rule;


public class SimpleChemistryDisjunctPatternTest extends SimpleChemistryAbstractTest{
	
	
	@Test
	public void testMatchesWithoutConstraints() {
		SimpleChemistryGraphTransformationAPI api = this.init("H2O.xmi");
		
		assertMatchCount((int) api.notDisjunctfindFreeAtoms().countMatches(), api.findFreeAtoms());
		api.simpleBind().apply();
		assertEquals((int) api.notDisjunctsimpleBind().countMatches(), ((int) api.simpleBind().matchStream().count()));
		assertMatchCount((int) api.notDisjunctfindFreeAtoms().countMatches(), api.findFreeAtoms());
		assertMatchCount((int) api.notDisjunctsimpleBind().countMatches(), api.simpleBind());
		assertApplicable(api.simpleBind());
		assertAnyMatchExists(api.simpleBind());
	}
	
	@Test
	public void testInjectivityConstraint() {
		SimpleChemistryGraphTransformationAPI api = this.init("H2O.xmi");
		
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
	}
	
	@Test
	public void testIncremental2(){
		SimpleChemistryGraphTransformationAPI api = this.init("HO.xmi");
		assertMatchCount((int) api.notDisjointcompleteH20().countMatches(), api.completeH20());
		assertApplicable(api.completeH20());
		api.completeH20().apply();
		assertMatchCount((int) api.notDisjointcompleteH20().countMatches(), api.completeH20());
	}
	
	@Test
	public void testinjectivityIncremental() {
		SimpleChemistryGraphTransformationAPI api = this.init("H2.xmi");	
		
		//remove subpatterns + see if match stream works
		assertMatchCount((int) api.notDisjunctcreateH2().countMatches(), api.createH2());
		assertEquals(api.notDisjunctcreateH2().countMatches(), api.createH2().matchStream().count());
		api.createH2().apply();
		assertMatchCount((int) api.notDisjunctcreateH2().countMatches(), api.createH2());
		assertEquals(api.notDisjunctcreateH2().countMatches(), api.createH2().matchStream().count());
		api.createH2().apply();
		assertMatchCount((int) api.notDisjunctcreateH2().countMatches(), api.createH2());
		assertEquals(api.notDisjunctcreateH2().countMatches(), api.createH2().matchStream().count());
		api.createH2().apply();
		assertNotApplicable(api.createH2());
		//add subpatterns
		api.destroyH2().apply();
		assertMatchCount((int) api.notDisjunctcreateH2().countMatches(), api.createH2());
		api.destroyH2().apply();
		assertMatchCount((int) api.notDisjunctcreateH2().countMatches(), api.createH2());
		api.destroyH2().apply();
		assertMatchCount((int) api.notDisjunctcreateH2().countMatches(), api.createH2());
	}
	
	@Test
	public void testIncrementalWith3Subpatterns() {
		SimpleChemistryGraphTransformationAPI api = this.init("H3.xmi");	
		
		//remove subpatterns
		assertMatchCount((int) api.notDisjunctCreateH3().countMatches(), api.createH3());
		assertEquals(api.notDisjunctCreateH3().countMatches(), api.createH3().matchStream().count());
		api.createH3().apply();
		assertMatchCount((int) api.notDisjunctCreateH3().countMatches(), api.createH3());
		assertEquals(api.notDisjunctCreateH3().countMatches(), api.createH3().matchStream().count());
		api.createH3().apply();
		assertMatchCount((int) api.notDisjunctCreateH3().countMatches(), api.createH3());
		assertEquals(api.notDisjunctCreateH3().countMatches(), api.createH3().matchStream().count());
		api.createH3().apply();
		assertNotApplicable(api.createH3());
		//add subpatterns
		api.destroyH3().apply();
		assertMatchCount((int) api.notDisjunctCreateH3().countMatches(), api.createH3());
		api.destroyH3().apply();
		assertMatchCount((int) api.notDisjunctCreateH3().countMatches(), api.createH3());
		api.destroyH3().apply();
		assertMatchCount((int) api.notDisjunctCreateH3().countMatches(), api.createH3());
	}
	
	@Test
	public void testSubscription() {
		SimpleChemistryGraphTransformationAPI api = this.init("H3.xmi");
		
		CreateH3Rule rule = api.createH3();
		rule.enableAutoApply();
		api.updateMatches();
		
		//when the matches do not update between the applications the final count will be 504
		assertEquals(504, rule.countRuleApplications());
	}
	
	@Test 
	public void testRandomMatches() {
		SimpleChemistryGraphTransformationAPI api = this.init("H3.xmi");
		
		CreateH3Rule rule = api.createH3();
		CreateH3Match match1 = rule.findAnyMatch().get();
		assertTrue(!match1.getH1().equals(match1.getH2()) && !match1.getH1().equals(match1.getH3()) && !match1.getH3().equals(match1.getH2()));
		CreateH3Match match2 = rule.findAnyMatch().get();
		assertTrue(!match2.getH1().equals(match2.getH2()) && !match2.getH1().equals(match2.getH3()) && !match2.getH3().equals(match2.getH2()));
		CreateH3Match match3 = rule.findAnyMatch().get();
		assertTrue(!match1.getH1().equals(match3.getH2()) && !match3.getH1().equals(match3.getH3()) && !match3.getH3().equals(match3.getH2()));
	}

}

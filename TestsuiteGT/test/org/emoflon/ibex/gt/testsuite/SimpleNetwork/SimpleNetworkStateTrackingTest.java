package org.emoflon.ibex.gt.testsuite.SimpleNetwork;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.junit.Test;

import SimpleNetworkGraphTransformation.api.SimpleNetworkGraphTransformationAPI;

public class SimpleNetworkStateTrackingTest extends SimpleNetworkAbstractTest{
	
	@Test
	public void checkSimpleStateTracking1() {
		SimpleNetworkGraphTransformationAPI api = this.init("SimpleNetwork1.xmi");
		api.trackModelStates();
		api.updateMatches();
		
		HashMap<GraphTransformationPattern<?,?>, Integer> matchCounts = currentMatchCounts(api);
		HashMap<GraphTransformationPattern<?,?>, Set<IMatch>> matches = currentMatches(api);

		api.generateDevice().apply();
		api.revertLastApply(true);
		
		assertMatchCounts(matchCounts);
		assertMatchIdentities(matches);
		
		api.deactivateModelStatesTracking();
	}
	
	@Test
	public void checkSimpleStateTracking2() {
		SimpleNetworkGraphTransformationAPI api = this.init("SimpleNetwork1.xmi");
		api.trackModelStates();
		api.updateMatches();
		
		HashMap<GraphTransformationPattern<?,?>, Integer> matchCounts = currentMatchCounts(api);
		HashMap<GraphTransformationPattern<?,?>, Set<IMatch>> matches = currentMatches(api);
		api.generateDevice().apply();
		
		HashMap<GraphTransformationPattern<?,?>, Integer> matchCounts2 = currentMatchCounts(api);
		HashMap<GraphTransformationPattern<?,?>, Set<IMatch>> matches2 = currentMatches(api);
		api.generateDevice().apply();
		
		HashMap<GraphTransformationPattern<?,?>, Integer> matchCounts3 = currentMatchCounts(api);
		HashMap<GraphTransformationPattern<?,?>, Set<IMatch>> matches3 = currentMatches(api);
		api.generateDevice().apply();
		
		HashMap<GraphTransformationPattern<?,?>, Integer> matchCounts4 = currentMatchCounts(api);
		HashMap<GraphTransformationPattern<?,?>, Set<IMatch>> matches4 = currentMatches(api);
		api.insertDevicesIntoNetwork().apply();
		
		HashMap<GraphTransformationPattern<?,?>, Integer> matchCounts5 = currentMatchCounts(api);
		HashMap<GraphTransformationPattern<?,?>, Set<IMatch>> matches5 = currentMatches(api);
		api.insertDevicesIntoNetwork().apply();
		
		HashMap<GraphTransformationPattern<?,?>, Integer> matchCounts6 = currentMatchCounts(api);
		HashMap<GraphTransformationPattern<?,?>, Set<IMatch>> matches6 = currentMatches(api);
		api.insertDevicesIntoNetwork().apply();
		
		HashMap<GraphTransformationPattern<?,?>, Integer> matchCounts7 = currentMatchCounts(api);
		HashMap<GraphTransformationPattern<?,?>, Set<IMatch>> matches7 = currentMatches(api);
		api.connect().apply();
		
		HashMap<GraphTransformationPattern<?,?>, Integer> matchCounts8 = currentMatchCounts(api);
		HashMap<GraphTransformationPattern<?,?>, Set<IMatch>> matches8 = currentMatches(api);
		api.connect().apply();
		
		HashMap<GraphTransformationPattern<?,?>, Integer> matchCounts9 = currentMatchCounts(api);
		HashMap<GraphTransformationPattern<?,?>, Set<IMatch>> matches9 = currentMatches(api);
		api.connect().apply();
		
		HashMap<GraphTransformationPattern<?,?>, Integer> matchCounts10 = currentMatchCounts(api);
		HashMap<GraphTransformationPattern<?,?>, Set<IMatch>> matches10 = currentMatches(api);
		api.connect().apply();
		
		api.revertLastApply(true);
		assertMatchCounts(matchCounts10);
		assertMatchIdentities(matches10);
		
		api.revertLastApply(true);
		assertMatchCounts(matchCounts9);
		assertMatchIdentities(matches9);
		
		api.revertLastApply(true);
		assertMatchCounts(matchCounts8);
		assertMatchIdentities(matches8);
		
		api.revertLastApply(true);
		assertMatchCounts(matchCounts7);
		assertMatchIdentities(matches7);
		
		api.revertLastApply(true);
		assertMatchCounts(matchCounts6);
		assertMatchIdentities(matches6);
		
		api.revertLastApply(true);
		assertMatchCounts(matchCounts5);
		assertMatchIdentities(matches5);
		
		api.revertLastApply(true);
		assertMatchCounts(matchCounts4);
		assertMatchIdentities(matches4);
		
		api.revertLastApply(true);
		assertMatchCounts(matchCounts3);
		assertMatchIdentities(matches3);
		
		api.revertLastApply(true);
		assertMatchCounts(matchCounts2);
		assertMatchIdentities(matches2);
		
		api.revertLastApply(true);
		assertMatchCounts(matchCounts);
		assertMatchIdentities(matches);
		
		api.deactivateModelStatesTracking();
	}
	
	public static void assertMatchCounts(final HashMap<GraphTransformationPattern<?,?>, Integer> expected) {
		expected.forEach((p, count) -> {
			assertEquals(p.getPatternName()+" expected <"+count+"> matches but got <"+p.countMatches()+"> matches instead!", 
					count.intValue(), (int)p.countMatches());
		});
	}
	
	public static void assertMatchIdentities(final HashMap<GraphTransformationPattern<?,?>, Set<IMatch>> expected) {
		expected.forEach((p, m) -> {
			Set<IMatch> currentMatches = p.findMatches().stream()
					.map(match -> match.toIMatch())
					.collect(Collectors.toSet());
			m.forEach(expectedMatch -> {
				assertTrue(p.getPatternName()+" expecteds match:  "+expectedMatch+"\n-> which it is missing in the current state of the model.", 
						currentMatches.contains(expectedMatch));
			});
		});
	}
	
	public static HashMap<GraphTransformationPattern<?,?>, Integer> currentMatchCounts(final SimpleNetworkGraphTransformationAPI api) {
		HashMap<GraphTransformationPattern<?,?>, Integer> matchCounts = new HashMap<>();
		api.getAllPatterns().values().stream()
			.map(gtpSupplier -> gtpSupplier.get())
			.filter(pattern -> !pattern.isEmptyPattern())
			.forEach(pattern -> matchCounts.put(pattern, (int)pattern.countMatches()));
		
		return matchCounts;
	}
	
	public static HashMap<GraphTransformationPattern<?,?>, Set<IMatch>> currentMatches(final SimpleNetworkGraphTransformationAPI api) {
		HashMap<GraphTransformationPattern<?,?>, Set<IMatch>> matches = new HashMap<>();
		api.getAllPatterns().values().stream()
		.map(gtpSupplier -> gtpSupplier.get())
		.filter(pattern -> !pattern.isEmptyPattern())
		.forEach(pattern -> matches.put(pattern, pattern.findMatches().stream()
				.map(match -> match.toIMatch())
				.collect(Collectors.toSet())));
		
		return matches;
	}
}



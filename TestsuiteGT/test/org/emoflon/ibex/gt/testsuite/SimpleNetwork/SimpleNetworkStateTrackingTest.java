package org.emoflon.ibex.gt.testsuite.SimpleNetwork;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.stream.Collectors;

import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.emoflon.ibex.gt.StateModel.State;
import org.junit.Ignore;
import org.junit.Test;

import SimpleNetwork.Device;
import SimpleNetworkGraphTransformation.api.SimpleNetworkGraphTransformationAPI;

public class SimpleNetworkStateTrackingTest extends SimpleNetworkAbstractTest{
	
	@Test
	public void checkSimpleStateTracking1() {
		SimpleNetworkGraphTransformationAPI api = this.init("SimpleNetwork1.xmi");
		api.trackModelStates(false);
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
		api.trackModelStates(false);
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
	
	@Test
	public void checkStateNavigation1() {
		SimpleNetworkGraphTransformationAPI api = this.init("SimpleNetwork1.xmi");
		api.trackModelStates(false);
		api.updateMatches();
		
		LinkedList<TestState> testStates = new LinkedList<>();
		// Generate three devices
		testStates.add(new TestState("initial", api));
		
		api.generateDevice().apply();	
		testStates.add(new TestState("dev1", api));
		
		api.generateDevice().apply();
		testStates.add(new TestState("dev2", api));
		
		api.generateDevice().apply();
		testStates.add(new TestState("dev3", api));
		// Insert devices into containment hierarchy
		api.insertDevicesIntoNetwork().apply();
		testStates.add(new TestState("dev1-connect", api));
		
		api.insertDevicesIntoNetwork().apply();
		testStates.add(new TestState("dev2-connect", api));
		
		api.insertDevicesIntoNetwork().apply();
		TestState initialTestState = new TestState("dev3-connect_&_2ndInitial", api);
		testStates.add(initialTestState);
		// Create new State for each possible connection
		ArrayList<Device> devices = new ArrayList<>(api.findDevice().findMatches().stream()
				.map(match -> match.getDevice())
				.collect(Collectors.toList()));
		ArrayList<State> modelStates = new ArrayList<>();
		modelStates.add(api.getCurrentModelState());
		
		// Connection 1
		api.connect().bindFrom(devices.get(0));
		api.connect().bindTo(devices.get(1));
		api.connect().apply();
		api.connect().unbindFrom();
		api.connect().unbindTo();
		// Save States
		State connection1State = api.getCurrentModelState();
		modelStates.add(connection1State);
		testStates.add(new TestState("connection1", api));
		// Sanity Check
		api.revertLastApply(true);
		initialTestState.checkState();
		
		// Connection 2
		api.connect().bindFrom(devices.get(0));
		api.connect().bindTo(devices.get(2));
		api.connect().apply();
		api.connect().unbindFrom();
		api.connect().unbindTo();
		// Save States
		State connection2State = api.getCurrentModelState();
		modelStates.add(connection2State);
		testStates.add(new TestState("connection2", api));
		// Sanity Check
		api.revertLastApply(true);
		initialTestState.checkState();
				
		// Connection 3
		api.connect().bindFrom(devices.get(1));
		api.connect().bindTo(devices.get(2));
		api.connect().apply();
		api.connect().unbindFrom();
		api.connect().unbindTo();
		// Save States
		State connection3State = api.getCurrentModelState();
		modelStates.add(connection3State);
		testStates.add(new TestState("connection3", api));
		// Sanity Check
		api.revertLastApply(true);
		initialTestState.checkState();
		
		// Move to Connection 1 and check
		api.moveToKnownModelState(connection1State, true);
		testStates.get(testStates.size()-3).checkState();
		// Sanity Check
		api.revertLastApply(true);
		initialTestState.checkState();
		
		// Move to Connection 3 and check
		api.moveToKnownModelState(connection3State, true);
		testStates.get(testStates.size()-1).checkState();
		// Sanity Check
		api.revertLastApply(true);
		initialTestState.checkState();
		
		// Move to Connection 1, then connection 3 and check
		api.moveToKnownModelState(connection1State, true);
		testStates.get(testStates.size()-3).checkState();
		api.moveToKnownModelState(connection3State, true);
		testStates.get(testStates.size()-1).checkState();
		// Sanity Check
		api.revertLastApply(true);
		initialTestState.checkState();
		
		api.deactivateModelStatesTracking();
	}
	
	@Ignore
	@Test
	public void checkStateIdentityTracking1() {
		SimpleNetworkGraphTransformationAPI api = this.init("SimpleNetwork1.xmi");
		api.trackModelStates(false);
		api.updateMatches();
		
		LinkedList<TestState> testStates = new LinkedList<>();
		// Generate three devices
		State initial = api.getCurrentModelState();
		testStates.add(new TestState("initial", api));
		
		api.generateDevice().apply();	
		State dev1 = api.getCurrentModelState();
		testStates.add(new TestState("dev1", api));
		
		api.generateDevice().apply();
		State dev2 = api.getCurrentModelState();
		testStates.add(new TestState("dev2", api));
		
		api.generateDevice().apply();
		State dev3 = api.getCurrentModelState();
		testStates.add(new TestState("dev3", api));
		
		// Insert devices into containment hierarchy
		api.insertDevicesIntoNetwork().apply();
		State insert1 = api.getCurrentModelState();
		testStates.add(new TestState("dev1-connect", api));
		
		api.insertDevicesIntoNetwork().apply();
		State insert2 = api.getCurrentModelState();
		testStates.add(new TestState("dev2-connect", api));
		
		api.insertDevicesIntoNetwork().apply();
		State insert3 = api.getCurrentModelState();
		testStates.add(new TestState("dev3-connect", api));
		
		// Reset to inital & sanity check
		api.moveToKnownModelState(initial, true);
		testStates.getFirst().checkState();
		
		// Rebuild and check for duplicates
		api.generateDevice().apply();
		assertEquals("Expected model states mismatch!", dev1, api.getCurrentModelState());
		testStates.get(1).checkState();
		
		api.generateDevice().apply();
		assertEquals("Expected model states mismatch!", dev2, api.getCurrentModelState());
		testStates.get(2).checkState();
		
		api.generateDevice().apply();
		assertEquals("Expected model states mismatch!", dev3, api.getCurrentModelState());
		testStates.get(3).checkState();
		
		api.insertDevicesIntoNetwork().apply();
		assertEquals("Expected model states mismatch!", insert1, api.getCurrentModelState());
		testStates.get(4).checkState();
		
		api.insertDevicesIntoNetwork().apply();
		assertEquals("Expected model states mismatch!", insert2, api.getCurrentModelState());
		testStates.get(5).checkState();
		
		api.insertDevicesIntoNetwork().apply();
		assertEquals("Expected model states mismatch!", insert3, api.getCurrentModelState());
		testStates.get(6).checkState();
		
		// Reset to inital & sanity check
		api.moveToKnownModelState(initial, true);
		testStates.getFirst().checkState();
		
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

class TestState {
	final String name;
	final HashMap<GraphTransformationPattern<?,?>, Integer> matchCounts;
	final HashMap<GraphTransformationPattern<?,?>, Set<IMatch>> matches;
	
	public TestState(final String name, final SimpleNetworkGraphTransformationAPI api) {
		this.name = name;
		matchCounts = SimpleNetworkStateTrackingTest.currentMatchCounts(api);
		matches = SimpleNetworkStateTrackingTest.currentMatches(api);
	}
	
	public void checkState() {
		SimpleNetworkStateTrackingTest.assertMatchCounts(matchCounts);
		SimpleNetworkStateTrackingTest.assertMatchIdentities(matches);
	}
	
	@Override
	public String toString() {
		return "Teststate: "+name;
	}
}


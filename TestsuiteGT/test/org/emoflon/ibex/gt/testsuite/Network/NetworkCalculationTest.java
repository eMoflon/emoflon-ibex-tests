package org.emoflon.ibex.gt.testsuite.Network;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import SimpleNetwork.Device;
import SimpleNetwork.Network;
import network.gt1.api.Gt1GtApi;
import network.gt1.api.match.ConnectCoMatch;
import network.gt1.api.match.ConnectMatch;
import network.gt1.api.match.FindNetworkMatch;
import network.gt1.api.match.GenerateDeviceCoMatch;
import network.gt1.api.match.GenerateDeviceMatch;
import network.gt1.api.match.TestFunctionsCoMatch;
import network.gt1.api.match.TestFunctionsMatch;

public class NetworkCalculationTest extends NetworkAbstractTest{
	
	@Test
	public void checkSimpleCalculation() {
		Gt1GtApi<?> api = this.init("SimpleNetwork1.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		BiConsumer<GenerateDeviceMatch, GenerateDeviceCoMatch> doCalculations = (match, coMatch) -> {
			api.generatedCalculate1()
			.bindDevice(coMatch.device())
			.bindNetwork(match.network())
			.applyAny();
			api.generatedCalculate2()
			.bindDevice(coMatch.device())
			.bindNetwork(match.network())
			.applyAny();
			api.generatedCalculate3()
			.bindDevice(coMatch.device())
			.bindNetwork(match.network())
			.applyAny();
		};
		api.generateDevice().subscribeApplications(doCalculations);
		assertMatchCount(1, api.generateDevice());
		//check general calculation
		GenerateDeviceCoMatch match = api.generateDevice().applyAny();
		assertEquals(100.0/4.0, match.device().getMaxBandwidth(),  0.00000001);
		assertEquals(100.0-100.0/2.0, match.network().getMaxBandwidth(),  0.0000001);
		assertEquals(2, match.network().getDeviceNumber());
		assertEquals(Math.floor(50%6), match.device().getFlag());
		assertEquals(Math.floor(Math.log(50.0)), match.device().getMaxConnections());
		//generate 3 devices => no devices can be created anymore
		api.generateDevice().applyAny();
		api.generateDevice().applyAny();
		
		//check stream functions
		assertNoMatch(api.generateDevice());
		assertMatchCount(0, api.generateDevice());
		
		api.terminate();
	}
	
	@Test
	public void checkConnect(){
		Gt1GtApi<?> api = this.init("SimpleNetwork4.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		BiConsumer<ConnectMatch, ConnectCoMatch> doCalculations = (match, coMatch) -> {
			api.connectedCalculate()
			.bindConnection(coMatch.connection())
			.bindNetwork(match.network())
			.bindSrc(match.src())
			.bindTo(match.to())
			.applyAny();
		};
		
		api.connect().subscribeApplications(doCalculations);
		ConnectCoMatch match = api.connect().applyAny();
		//check if negative parameter is calculated properly
		assertEquals(-4.0, match.to().getOtherValue(),  0.000000001);
		assertEquals(-7.0, match.src().getOtherValue(),  0.000000001);
		assertEquals(match.connection().getFlag(), 0);
		
		api.connect().applyAny();
		api.connect().applyAny();
		assertNoMatch(api.connect());
		
		api.terminate();
	}
	
	@Test
	public void testFunctions() {
		Gt1GtApi<?> api = this.init("SimpleNetwork4.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		BiConsumer<TestFunctionsMatch,TestFunctionsCoMatch> doCalculations = (match, coMatch) -> {
			api.testFunctionsCalculate()
			.bindDevice1(match.device1())
			.bindDevice2(match.device2())
			.applyAny();
		};
		
		api.testFunctions().subscribeApplications(doCalculations);
		TestFunctionsCoMatch match = api.testFunctions().applyAny();
		//check if the arithmetic functions are calculated and rounded properly 
		assertEquals(Math.floor(Math.sqrt(Math.log10(4))), match.device1().getFlag());
		assertEquals(Math.abs(-Math.log10(4)), match.device1().getOtherValue(), 0.00000001);
		assertEquals(Math.log10(4.0), match.device1().getMaxBandwidth(), 0.0000000001);
		
		assertEquals(Math.floor(Math.tan(10.0)), match.device2().getFlag());
		assertEquals(Math.exp(-4.0), match.device2().getOtherValue(), 0.00000001);

		api.terminate();
	}
	@Test
	public void checkConstraints() {
		Gt1GtApi<?> api = this.init("SimpleNetwork3.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
	
		//check stream functions
		assertMatchCount(3, api.testConstraint1());
		assertNoMatch(api.testConstraint2());	
		assertMatchCount(3, api.notDisjointtestConstraint1());
		assertNoMatch(api.notDisjointtestConstraint2());
		
		api.terminate();
	}
	
	@Test
	public void checkCount() {
		Gt1GtApi<?> api = this.init("SimpleNetwork1.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		Network network1 = api.findNetwork().findAnyMatch().get().network();
		// simple sanity check
		assertMatchCount(0, api.testConstraint3());
		assertApplicableAndApply(api.generateDevice());
		assertApplicableAndApply(api.generateDevice());
		assertApplicableAndApply(api.generateDevice());
		assertApplicableAndApply(api.insertDevicesIntoNetwork());
		assertApplicableAndApply(api.insertDevicesIntoNetwork());
		assertApplicableAndApply(api.insertDevicesIntoNetwork());
		assertMatchCount(3, api.findDevice());
		assertApplicableAndApply(api.setNumberOfDevices(3));
		assertMatchCount(1, api.testConstraint3());
		// add a network and check
		Network network2 = api.createNetwork().applyAny().network();
		api.setNumberOfDevices(0).bindNetwork(network2).applyAny();
		api.setNumberOfDevices(0).unbindNetwork();
		assertMatchCount(2, api.testConstraint3());
		api.setNumberOfDevices(1).bindNetwork(network2).applyAny();
		api.setNumberOfDevices(1).unbindNetwork();
		assertMatchCount(1, api.testConstraint3());
//		 set correct amounts automatically
		List<FindNetworkMatch> matches = new LinkedList<>(api.findNetwork().getMatches());
		matches.forEach(match -> {
			assertApplicableAndApply(api.findAndsetNumberOfDevices().bindNetwork(match.network()));
		});
		assertMatchCount(2, api.testConstraint3());
		assertEquals(3, network1.getDeviceNumber());
		assertEquals(0, network2.getDeviceNumber());
		
		api.terminate();
	}
	
	@Test
	public void checkMinMax() {
		Gt1GtApi<?> api = this.init("SimpleNetwork1.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		Network network1 = api.findNetwork().findAnyMatch().get().network();
		Network network2 = api.createNetwork().applyAny().network();
		api.setNumberOfDevices(0).bindNetwork(network1).applyAny();
		api.setNumberOfDevices(0).bindNetwork(network2).applyAny();
		// simple sanity check
		assertMatchCount(0, api.findNetworkWithMoreThan2Devices());
		assertMatchCount(2, api.findNetworkWithLessThan2Devices());
		api.setNumberOfDevices(3).bindNetwork(network1).applyAny();
		assertApplicableAndApply(api.generateDevice().bindNetwork(network1));
		assertApplicableAndApply(api.generateDevice().bindNetwork(network1));
		assertApplicableAndApply(api.generateDevice().bindNetwork(network1));
		assertApplicableAndApply(api.insertDevicesIntoNetwork().bindNetwork(network1));
		assertApplicableAndApply(api.insertDevicesIntoNetwork().bindNetwork(network1));
		assertApplicableAndApply(api.insertDevicesIntoNetwork().bindNetwork(network1));
		api.setNumberOfDevices(3).bindNetwork(network1).applyAny();
		// check min / max
		assertMatchCount(3, api.findDevice().bindNetwork(network1));
		assertMatchCount(0, api.findDevice().bindNetwork(network2));
		assertMatchCount(1, api.findNetworkWithMoreThan2Devices());
		assertMatchCount(1, api.findNetworkWithLessThan2Devices());
		
		api.terminate();
	}
	
	@Test
	public void booleanLiterals() {
		Gt1GtApi<?> api = this.init("SimpleNetwork1.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		Network network1 = api.findNetwork().findAnyMatch().get().network();
		Network network2 = api.createNetwork().applyAny().network();
		assertMatchCount(2, api.findNetworkFalse());
		assertMatchCount(0, api.findNetworkTrue());
		
		network2.setFlag(true);
		api.updateMatches();
		
		assertMatchCount(1, api.findNetworkFalse());
		assertMatchCount(1, api.findNetworkTrue());
		
		api.terminate();
	}
	
	@Test
	public void checkWatchDogs1() {
		Gt1GtApi<?> api = this.init("SimpleNetwork4.xmi");
		assertEquals(0, api.watchDog1().getMatchesWithAttributeChanges().size());
		
		assertMatchCount(1, api.findNetwork());
		Network network = api.findNetwork().getMatches(true).iterator().next().network();
		assertMatchCount(3, api.findDevice());
		assertMatchCount(1, api.watchDog1());
		assertMatchCount(3, api.watchDog2());
		
		assertEquals(0, api.watchDog1().getMatchesWithAttributeChanges().size());
		assertEquals(0, api.watchDog2().getMatchesWithAttributeChanges().size());
		
		ConnectCoMatch coMatch = assertApplicableAndApply(api.connect());
		
		assertEquals(0, api.watchDog1().getMatchesWithAttributeChanges().size());
		assertEquals(2, api.watchDog2().getMatchesWithAttributeChanges().size());
		
		network.setDeviceNumber(-10);
		
		assertEquals(1, api.watchDog1().getMatchesWithAttributeChanges().size());
		assertEquals(3, api.watchDog2().getMatchesWithAttributeChanges().size());
		
		Set<Device> devices = api.watchDog2().getMatchesWithAttributeChanges().stream()
				.filter(m -> api.watchDog2().getAttributeChanges(m, m.device()).isPresent())
				.map(m -> m.device()).collect(Collectors.toSet());
		assertEquals(2, devices.size());
		assertTrue(devices.contains(coMatch.src()));
		assertTrue(devices.contains(coMatch.to()));
		
		api.updateMatches();
		
		assertEquals(0, api.watchDog1().getMatchesWithAttributeChanges().size());
		assertEquals(0, api.watchDog2().getMatchesWithAttributeChanges().size());
		
		api.terminate();
	}
	
	@Test
	public void checkNodeConstraints() {
		Gt1GtApi<?> api = this.init("SimpleNetwork4.xmi");
		assertMatchCount(1, api.findNetwork());
		assertMatchCount(3, api.findDevice());
		assertMatchCount(6, api.pairOfDevices());
		assertMatchCount(9, api.pairOfDevicesNoIC());
		assertMatchCount(6, api.pairOfDevicesManualIC());
		
		assertApplicableAndApply(api.removeDevice());
		
		assertMatchCount(1, api.findNetwork());
		assertMatchCount(2, api.findDevice());
		assertMatchCount(2, api.pairOfDevices());
		assertMatchCount(4, api.pairOfDevicesNoIC());
		assertMatchCount(2, api.pairOfDevicesManualIC());
		
		api.terminate();
	}
}
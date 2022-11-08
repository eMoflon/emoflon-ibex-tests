package org.emoflon.ibex.gt.testsuite.Network;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import SimpleNetwork.Network;
import network.gt1.api.Gt1GtAPI;
import network.gt1.api.match.ConnectCoMatch;
import network.gt1.api.match.FindNetworkMatch;
import network.gt1.api.match.GenerateDeviceCoMatch;
import network.gt1.api.match.TestFunctionsCoMatch;

public class NetworkCalculationTest extends NetworkAbstractTest{
	
	@Test
	public void checkSimpleCalculation() {
		Gt1GtAPI<?> api = this.init("SimpleNetwork1.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount(1, api.generateDevice());
		
		//check general calculation
		GenerateDeviceCoMatch match = api.generateDevice().applyAny();
		//TODO: check these operations with different test cases
//		assertEquals(100.0/3.0, match.device().getMaxBandwidth(),  0.00000001);
//		assertEquals(100.0-100.0/3.0, match.network().getMaxBandwidth(),  0.0000001);
		assertEquals(2, match.network().getDeviceNumber());
		//TODO: check these operations with different test cases
//		assertEquals(Math.round(100%6), match.device().getFlag());
//		assertEquals(Math.round(Math.log(100.0)), match.device().getMaxConnections());
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
		Gt1GtAPI<?> api = this.init("SimpleNetwork4.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		ConnectCoMatch match = api.connect().applyAny();
		
		//check if negative parameter is calculated properly
		//TODO: check these operations with different test cases
//		assertEquals(-3.0, match.to().getOtherValue(),  0.000000001);
//		assertEquals(-10.0, match.src().getOtherValue(),  0.000000001);
		
		//TODO: check these operations with different test cases
//		assertEquals(match.connection().getFlag(), 3);
		
		api.connect().applyAny();
		api.connect().applyAny();
		assertNoMatch(api.connect());
		
		api.terminate();
	}
	
	@Test
	public void testFunctions() {
		Gt1GtAPI<?> api = this.init("SimpleNetwork4.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		TestFunctionsCoMatch match = api.testFunctions().applyAny();
		//check if the arithmetic functions are calculated and rounded properly 
		assertEquals(Math.floor(Math.sqrt(10.0)), match.device1().getFlag());
		assertEquals(Math.abs(-10.0), match.device1().getOtherValue(), 0.00000001);
		//TODO: check these operations with different test cases
//		assertEquals(Math.log10(4.0), match.device1().getMaxBandwidth(), 0.0000000001);
		
		assertEquals(Math.floor(Math.tan(10.0)), match.device2().getFlag());
		assertEquals(Math.exp(-4.0), match.device2().getOtherValue(), 0.00000001);

		api.terminate();
	}
	@Test
	public void checkConstraints() {
		Gt1GtAPI<?> api = this.init("SimpleNetwork3.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
	
		//check stream functions
		assertMatchCount(3, api.testConstraint1());
		assertNoMatch(api.testConstraint2());	
		assertMatchCount(3, api.notDisjointtestConstraint1());
		assertNoMatch(api.notDisjointtestConstraint2());
		
		api.terminate();
	}

// TODO: In principle, checking for undefined or faulty arithmetic operations (e.g. div by zero) is a good idea. 
//		But throwing exceptions during runtime might be a little annoying for users.
	
//	@Test
//	public void checkExceptions1() {
//		//test that log() only accepts values>0
//		assertThrows(IllegalArgumentException.class, () -> {
//			Gt1GtAPI<?> api = this.init("SimpleNetwork2.xmi");
//			api.getGTEngine().setAlwaysUpdateAfter(true);
//			api.getGTEngine().setAlwaysUpdatePrior(true);
//			api.testException1().applyAny();
//		});
//	}
//	@Test
//	public void checkExceptions2() {
//		//test that ln() only accepts values>0
//		assertThrows(IllegalArgumentException.class, () -> {
//		Gt1GtAPI<?> api = this.init("SimpleNetwork2.xmi");
//		api.getGTEngine().setAlwaysUpdateAfter(true);
//		api.getGTEngine().setAlwaysUpdatePrior(true);
//		api.testException2().applyAny();
//		});
//	}
//	@Test
//	public void checkExceptions3() {
//		//test that sqrt() only accepts values>=0
//		assertThrows(IllegalArgumentException.class, () -> {
//		Gt1GtAPI<?> api = this.init("SimpleNetwork2.xmi");
//		api.getGTEngine().setAlwaysUpdateAfter(true);
//		api.getGTEngine().setAlwaysUpdatePrior(true);
//		api.testException3().applyAny();
//		});
//	}
//	@Test
//	public void checkExceptions4() {
//		//test that divide by zero throws a exception
//		assertThrows(IllegalArgumentException.class, () -> {
//			Gt1GtAPI<?> api = this.init("SimpleNetwork2.xmi");
//			api.getGTEngine().setAlwaysUpdateAfter(true);
//			api.getGTEngine().setAlwaysUpdatePrior(true);
//			api.testException4().applyAny();
//		});
//	}
	
	@Test
	public void checkCount() {
		Gt1GtAPI<?> api = this.init("SimpleNetwork1.xmi");
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
		Gt1GtAPI<?> api = this.init("SimpleNetwork1.xmi");
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
		Gt1GtAPI<?> api = this.init("SimpleNetwork1.xmi");
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

}
package org.emoflon.ibex.gt.testsuite.SimpleNetwork;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import SimpleNetwork.Network;
import SimpleNetworkGraphTransformation.api.SimpleNetworkGraphTransformationAPI;
import SimpleNetworkGraphTransformation.api.matches.ConnectMatch;
import SimpleNetworkGraphTransformation.api.matches.GenerateDeviceMatch;
import SimpleNetworkGraphTransformation.api.matches.TestFunctionsMatch;

public class SimpleNetworkCalculationTest extends SimpleNetworkAbstractTest{
	
	@Test
	public void checkSimpleCalculation() {
		SimpleNetworkGraphTransformationAPI api = this.init("SimpleNetwork1.xmi");
		
		assertMatchCount(1, api.generateDevice());
		
		//check general calculation
		GenerateDeviceMatch match = api.generateDevice().apply().get();
		assertEquals(100.0/3.0, match.getDevice().getMaxBandwidth(),  0.00000001);
		assertEquals(100.0-100.0/3.0, match.getNetwork().getMaxBandwidth(),  0.0000001);
		assertEquals(2, match.getNetwork().getDeviceNumber());
		assertEquals(Math.round(100%6), match.getDevice().getFlag());
		assertEquals(Math.round(Math.log(100.0)), match.getDevice().getMaxConnections());
		assertEquals(2, match.getNetwork().getDeviceNumber());
		//generate 3 devices => no devices can be created anymore
		api.generateDevice().apply().get();
		api.generateDevice().apply().get();
		
		//check stream functions
		assertNoMatch(api.generateDevice());
		assertMatchCount(0, api.generateDevice());
	}
	
	@Test
	public void checkConnect(){
		SimpleNetworkGraphTransformationAPI api = this.init("SimpleNetwork4.xmi");
		
		ConnectMatch match = api.connect().apply().get();
		
		//check if negative parameter is calculated properly	
		assertEquals(-3.0, match.getTo().getOtherValue(),  0.000000001);
		assertEquals(-10.0, match.getFrom().getOtherValue(),  0.000000001);
		
		assertEquals(match.getConnection().getFlag(), 3);
		
		api.connect().apply();
		api.connect().apply();
		assertNoMatch(api.connect());
		
	}
	
	@Test
	public void testFunctions() {
		SimpleNetworkGraphTransformationAPI api = this.init("SimpleNetwork4.xmi");
		
		TestFunctionsMatch match = api.testFunctions().apply().get();
		//check if the arithmetic functions are calculated and rounded properly 
		assertEquals(Math.round(Math.sqrt(10.0)), match.getDevice1().getFlag());
		assertEquals(Math.abs(-10.0), match.getDevice1().getOtherValue(), 0.00000001);
		assertEquals(Math.log10(4.0), match.getDevice1().getMaxBandwidth(), 0.0000000001);
		
		assertEquals(Math.round(Math.tan(10.0)), match.getDevice2().getFlag());
		assertEquals(Math.exp(-4.0), match.getDevice2().getOtherValue(), 0.00000001);

		
	}
	@Test
	public void checkConstraints() {
		SimpleNetworkGraphTransformationAPI api = this.init("SimpleNetwork3.xmi");
	
		//check stream functions
		assertMatchCount(3, api.testConstraint1());
		assertNoMatch(api.testConstraint2());	
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void checkExceptions1() {
		//test that log() only accepts values>0
		SimpleNetworkGraphTransformationAPI api = this.init("SimpleNetwork2.xmi");
		api.testException1().apply();
	}
	@Test(expected = IllegalArgumentException.class)
	public void checkExceptions2() {
		//test that ln() only accepts values>0
		SimpleNetworkGraphTransformationAPI api = this.init("SimpleNetwork2.xmi");
		api.testException2().apply();
	}
	@Test(expected = IllegalArgumentException.class)
	public void checkExceptions3() {
		//test that sqrt() only accepts values>=0
		SimpleNetworkGraphTransformationAPI api = this.init("SimpleNetwork2.xmi");
		api.testException3().apply();
	}
	@Test(expected = IllegalArgumentException.class)
	public void checkExceptions4() {
		//test that divide by zero throws a exception
		SimpleNetworkGraphTransformationAPI api = this.init("SimpleNetwork2.xmi");
		api.testException4().apply();
	}
	
	@Test
	public void checkCount() {
		SimpleNetworkGraphTransformationAPI api = this.init("SimpleNetwork1.xmi");
		Network network1 = api.findNetwork().findAnyMatch().get().getNetwork();
		// simple sanity check
		assertMatchCount(0, api.testConstraint3());
		assertApplicable(api.generateDevice());
		assertApplicable(api.generateDevice());
		assertApplicable(api.generateDevice());
		assertApplicable(api.insertDevicesIntoNetwork());
		assertApplicable(api.insertDevicesIntoNetwork());
		assertApplicable(api.insertDevicesIntoNetwork());
		assertMatchCount(3, api.findDevice());
		assertApplicable(api.setNumberOfDevices(3));
		assertMatchCount(1, api.testConstraint3());
		// add a network and check
		Network network2 = api.createNetwork().apply().get().getNetwork();
		api.setNumberOfDevices(0).bindNetwork(network2).apply();
		assertMatchCount(2, api.testConstraint3());
		api.setNumberOfDevices(1).bindNetwork(network2).apply();
		assertMatchCount(1, api.testConstraint3());
		// set correct amounts automatically
		api.findNetwork().findMatches().forEach(match -> {
			assertApplicable(api.findAndsetNumberOfDevices().bind(match).apply());
		});
		assertMatchCount(2, api.testConstraint3());
		assertEquals(3, network1.getDeviceNumber());
		assertEquals(0, network2.getDeviceNumber());
	}
}



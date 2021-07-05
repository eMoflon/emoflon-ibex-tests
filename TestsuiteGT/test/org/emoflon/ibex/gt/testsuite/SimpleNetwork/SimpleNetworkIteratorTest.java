package org.emoflon.ibex.gt.testsuite.SimpleNetwork;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import SimpleNetwork.Network;
import SimpleNetworkGraphTransformation.api.SimpleNetworkGraphTransformationAPI;
import SimpleNetworkGraphTransformation.api.matches.ConnectMatch;
import SimpleNetworkGraphTransformation.api.matches.GenerateDeviceMatch;
import SimpleNetworkGraphTransformation.api.matches.TestFunctionsMatch;

public class SimpleNetworkIteratorTest extends SimpleNetworkAbstractTest{
	
	@Test
	public void checkIteration() {
		SimpleNetworkGraphTransformationAPI api = this.init("SimpleNetwork1.xmi");	
		//check model
		Network oldNetwork = api.findNetwork().findAnyMatch().get().getNetwork();
		assertEquals(3, oldNetwork.getDeviceNumber());
		
		//generate 3 devices and insert
		api.generateDevice().apply();
		api.generateDevice().apply();
		api.generateDevice().apply();
		assertEquals(0, oldNetwork.getDeviceNumber());
		
		assertApplicable(api.insertDevicesIntoNetwork());
		assertApplicable(api.insertDevicesIntoNetwork());
		assertApplicable(api.insertDevicesIntoNetwork());
		assertNotApplicable(api.insertDevicesIntoNetwork());
		oldNetwork.setDeviceNumber(3);
		
		// create new network and swap containment
		Network newNetwork = api.createNetwork().apply().get().getNetwork();
		assertApplicable(api.moveAllDevices());
		assertEquals(3, newNetwork.getDeviceNumber());
		assertEquals(3, api.findDevice().bindNetwork(newNetwork).countMatches());
		assertEquals(0, oldNetwork.getDeviceNumber());
		assertEquals(0, api.findDevice().bindNetwork(oldNetwork).countMatches());
	}
	
	@Test
	public void checkIteration2() {
		SimpleNetworkGraphTransformationAPI api = this.init("SimpleNetwork1.xmi");	
		//check model
		Network oldNetwork = api.findNetwork().findAnyMatch().get().getNetwork();
		assertEquals(3, oldNetwork.getDeviceNumber());
		
		//generate 3 devices and insert
		api.generateDevice().apply();
		api.generateDevice().apply();
		api.generateDevice().apply();
		assertEquals(0, oldNetwork.getDeviceNumber());
		
		assertApplicable(api.insertDevicesIntoNetwork());
		assertApplicable(api.insertDevicesIntoNetwork());
		assertApplicable(api.insertDevicesIntoNetwork());
		assertNotApplicable(api.insertDevicesIntoNetwork());
		oldNetwork.setDeviceNumber(3);
		
		// create new network and swap containment
		Network newNetwork = api.createNetwork().apply().get().getNetwork();
		assertApplicable(api.moveAllDevices2());
		assertEquals(3, newNetwork.getDeviceNumber());
		assertEquals(3, api.findDevice().bindNetwork(newNetwork).countMatches());
		assertEquals(0, oldNetwork.getDeviceNumber());
		assertEquals(0, api.findDevice().bindNetwork(oldNetwork).countMatches());
	}
	
	@Test
	public void checkIteration3() {
		SimpleNetworkGraphTransformationAPI api = this.init("SimpleNetwork1.xmi");	
		//check model
		Network oldNetwork = api.findNetwork().findAnyMatch().get().getNetwork();
		oldNetwork.setDeviceNumber(4);
		assertEquals(4, oldNetwork.getDeviceNumber());
		
		//generate 4 devices and insert
		for(int i = 0; i<4; i++) {
			assertApplicable(api.generateDevice());
		}
		assertNotApplicable(api.generateDevice());
		assertEquals(0, oldNetwork.getDeviceNumber());
		
		for(int i = 0; i<4; i++) {
			assertApplicable(api.insertDevicesIntoNetwork());
		}
		assertNotApplicable(api.insertDevicesIntoNetwork());
		oldNetwork.setDeviceNumber(4);
		
		//connect devices to full-mesh
		for(int i = 0; i<6; i++) {
			assertApplicable(api.simpleConnect());
		}
		assertNotApplicable(api.simpleConnect());
		
		// create new network and swap device containment
		Network newNetwork = api.createNetwork().apply().get().getNetwork();
		assertApplicable(api.moveAllDevices2());
		assertEquals(4, newNetwork.getDeviceNumber());
		assertEquals(4, api.findDevice().bindNetwork(newNetwork).countMatches());
		assertEquals(0, oldNetwork.getDeviceNumber());
		assertEquals(0, api.findDevice().bindNetwork(oldNetwork).countMatches());
		
		// swap connection containment
		assertApplicable(api.moveAllConnections());
		assertEquals(6, api.findConnection().bindNetwork(newNetwork).countMatches());
		assertEquals(0, api.findConnection().bindNetwork(oldNetwork).countMatches());
		
		// cut all connections from device
		assertApplicable(api.isolateDevice());
		for(int i = 0; i<3; i++) {
			assertApplicable(api.removeDanglingConnection());
		}
		assertNotApplicable(api.removeDanglingConnection());
		assertEquals(3, api.findConnection().bindNetwork(newNetwork).countMatches());
		
		//reconnect devices to full-mesh
		for(int i = 0; i<3; i++) {
			assertApplicable(api.simpleConnect());
		}
		assertNotApplicable(api.simpleConnect());
	}
	
}



package org.emoflon.ibex.gt.testsuite.Network;

import static org.junit.jupiter.api.Assertions.*;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;
import org.junit.jupiter.api.Test;

import SimpleNetwork.Network;
import network.gt2.api.Gt2GtApi;

public class NetworkIteratorTest extends NetworkAbstractTest2{
	
	@Test
	public void checkIteration() {
		Gt2GtApi<?> api = this.init("SimpleNetwork1.xmi");
		// Skip if the engine is democles -> it does not work with some of these patterns -> See GT Rule file
		if(engine == GTAppTestCase.PM_DEMOCLES) {
			api.terminate();
			return;
		}
		
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		//check model
		Network oldNetwork = api.findNetwork().findAnyMatch().get().network();
		assertEquals(3, oldNetwork.getDeviceNumber());
		
		//generate 3 devices and insert
		api.generateDevice().applyAny();
		api.generateDevice().applyAny();
		api.generateDevice().applyAny();
		assertEquals(0, oldNetwork.getDeviceNumber());
		
		assertApplicableAndApply(api.insertDevicesIntoNetwork());
		assertApplicableAndApply(api.insertDevicesIntoNetwork());
		assertApplicableAndApply(api.insertDevicesIntoNetwork());
		assertNotApplicable(api.insertDevicesIntoNetwork());
		oldNetwork.setDeviceNumber(3);
		
		// create new network and swap containment
		Network newNetwork = api.createNetwork().applyAny().network();
		assertApplicableAndApply(api.moveAllDevices());
		assertEquals(3, newNetwork.getDeviceNumber());
		assertEquals(3, api.findDevice().bindNetwork(newNetwork).countMatches());
		assertEquals(0, oldNetwork.getDeviceNumber());
		assertEquals(0, api.findDevice().bindNetwork(oldNetwork).countMatches());
		
		api.terminate();
	}
	
	@Test
	public void checkIteration2() {
		Gt2GtApi<?> api = this.init("SimpleNetwork1.xmi");
		// Skip if the engine is democles -> it does not work with some of these patterns -> See GT Rule file
		if(engine == GTAppTestCase.PM_DEMOCLES) {
			api.terminate();
			return;
		}
		
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		//check model
		Network oldNetwork = api.findNetwork().findAnyMatch().get().network();
		assertEquals(3, oldNetwork.getDeviceNumber());
		
		//generate 3 devices and insert
		api.generateDevice().applyAny();
		api.generateDevice().applyAny();
		api.generateDevice().applyAny();
		assertEquals(0, oldNetwork.getDeviceNumber());
		
		assertApplicableAndApply(api.insertDevicesIntoNetwork());
		assertApplicableAndApply(api.insertDevicesIntoNetwork());
		assertApplicableAndApply(api.insertDevicesIntoNetwork());
		assertNotApplicable(api.insertDevicesIntoNetwork());
		oldNetwork.setDeviceNumber(3);
		
		// create new network and swap containment
		Network newNetwork = api.createNetwork().applyAny().network();
		assertApplicableAndApply(api.moveAllDevices2());
		assertEquals(3, newNetwork.getDeviceNumber());
		assertEquals(3, api.findDevice().bindNetwork(newNetwork).countMatches());
		assertEquals(0, oldNetwork.getDeviceNumber());
		assertEquals(0, api.findDevice().bindNetwork(oldNetwork).countMatches());
		
		api.terminate();
	}
	
	@Test
	public void checkIteration3() {
		Gt2GtApi<?> api = this.init("SimpleNetwork1.xmi");	
		// Skip if the engine is democles -> it does not work with some of these patterns -> See GT Rule file
		if(engine == GTAppTestCase.PM_DEMOCLES) {
			api.terminate();
			return;
		}
		
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		//check model
		Network oldNetwork = api.findNetwork().findAnyMatch().get().network();
		oldNetwork.setDeviceNumber(4);
		assertEquals(4, oldNetwork.getDeviceNumber());
		
		//generate 4 devices and insert
		for(int i = 0; i<4; i++) {
			assertApplicableAndApply(api.generateDevice());
		}
		assertNotApplicable(api.generateDevice());
		assertEquals(0, oldNetwork.getDeviceNumber());
		
		for(int i = 0; i<4; i++) {
			assertApplicableAndApply(api.insertDevicesIntoNetwork());
		}
		assertNotApplicable(api.insertDevicesIntoNetwork());
		oldNetwork.setDeviceNumber(4);
		
		//connect devices to full-mesh
		for(int i = 0; i<6; i++) {
			assertApplicableAndApply(api.simpleConnect());
		}
		assertNotApplicable(api.simpleConnect());
		
		// create new network and swap device containment
		Network newNetwork = api.createNetwork().applyAny().network();
		assertApplicableAndApply(api.moveAllDevices2());
		assertEquals(4, newNetwork.getDeviceNumber());
		assertEquals(4, api.findDevice().bindNetwork(newNetwork).countMatches());
		assertEquals(0, oldNetwork.getDeviceNumber());
		assertEquals(0, api.findDevice().bindNetwork(oldNetwork).countMatches());
		
		// swap connection containment
		assertApplicableAndApply(api.moveAllConnections());
		assertEquals(6, api.findConnection().bindNetwork(newNetwork).countMatches());
		assertEquals(0, api.findConnection().bindNetwork(oldNetwork).countMatches());
		
		// cut all connections from device
		assertApplicableAndApply(api.isolateDevice());
		for(int i = 0; i<3; i++) {
			assertApplicableAndApply(api.removeDanglingConnection());
		}
		assertNotApplicable(api.removeDanglingConnection());
		assertEquals(3, api.findConnection().bindNetwork(newNetwork).countMatches());
		
		//reconnect devices to full-mesh
		for(int i = 0; i<3; i++) {
			assertApplicableAndApply(api.simpleConnect());
		}
		assertNotApplicable(api.simpleConnect());
		
		api.terminate();
	}
	
	@Test
	public void checkTypedIteration() {
		Gt2GtApi<?> api = this.init("SimpleNetwork1.xmi");
		// Skip if the engine is democles -> it does not work with some of these patterns -> See GT Rule file
		if(engine == GTAppTestCase.PM_DEMOCLES) {
			api.terminate();
			return;
		}
		
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		//check model
		Network oldNetwork = api.findNetwork().findAnyMatch().get().network();
		assertEquals(3, oldNetwork.getDeviceNumber());
		
		//generate 3 devices and insert
		api.generateComputer().applyAny();
		api.generateComputer().applyAny();
		api.generateServer().applyAny();
		assertEquals(0, oldNetwork.getDeviceNumber());
		
		assertApplicableAndApply(api.insertDevicesIntoNetwork());
		assertApplicableAndApply(api.insertDevicesIntoNetwork());
		assertApplicableAndApply(api.insertDevicesIntoNetwork());
		assertNotApplicable(api.insertDevicesIntoNetwork());
		oldNetwork.setDeviceNumber(3);
		
		// create new network and swap containment
		Network newNetwork = api.createNetwork().applyAny().network();
		assertApplicableAndApply(api.moveAllComputers());
		assertEquals(2, newNetwork.getDeviceNumber());
		assertEquals(2, api.findDevice().bindNetwork(newNetwork).countMatches());
		assertEquals(1, oldNetwork.getDeviceNumber());
		assertEquals(1, api.findDevice().bindNetwork(oldNetwork).countMatches());
		
		assertApplicableAndApply(api.moveAllServers());
		assertEquals(3, newNetwork.getDeviceNumber());
		assertEquals(3, api.findDevice().bindNetwork(newNetwork).countMatches());
		assertEquals(0, oldNetwork.getDeviceNumber());
		assertEquals(0, api.findDevice().bindNetwork(oldNetwork).countMatches());
		
		api.terminate();
	}
}



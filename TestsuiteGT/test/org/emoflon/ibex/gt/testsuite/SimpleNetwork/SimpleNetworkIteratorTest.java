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
	
}



package org.emoflon.ibex.gt.testsuite.BPMN;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Test;

import BPMNGraphTransformation.api.BPMNGraphTransformationAPI;

public class BPMNModelCreationTest extends BPMNAbstractTest {

	@Test
	public void findTask() {
		ResourceSet model = this.initResourceSet("Task.xmi");
		BPMNGraphTransformationAPI api = this.initAPI(model);
		
		assertMatchCount(1, api.findTask());
	}
	
	@Test
	public void addTask() {
		ResourceSet model = this.initResourceSet("BPMN.xmi");
		BPMNGraphTransformationAPI api = this.initAPI(model);
		
		api.addTask().apply();
		saveResourceSet(model);
	}
}

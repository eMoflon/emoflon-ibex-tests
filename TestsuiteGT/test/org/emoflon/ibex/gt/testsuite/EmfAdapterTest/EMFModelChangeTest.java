package org.emoflon.ibex.gt.testsuite.EmfAdapterTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.emoflon.ibex.gt.testsuite.EMFModelAppTestCase;
import org.junit.Test;

import SimpleEMFModelTransformation.api.SimpleEMFModelTransformationAPI;
import SimpleEMFModelTransformation.api.SimpleEMFModelTransformationApp;
import SimpleFamiliesGraphTransformation.api.SimpleFamiliesGraphTransformationAPI;
import SimpleFamiliesGraphTransformation.api.SimpleFamiliesGraphTransformationApp;
import SimpleModelGraphTransformation.api.SimpleModelGraphTransformationAPI;
import SimpleModelGraphTransformation.api.SimpleModelGraphTransformationApp;

public class EMFModelChangeTest extends EMFModelAppTestCase{

	boolean debug = true;
	@Test
	public void testSmartEMFModelChange() {
		//app1 is smartemf
		//app2 is emf
		SimpleModelGraphTransformationApp app1 = new SimpleModelGraphTransformationApp(initEngine(), workspacePath);
		EMFTestContentAdapter adapter1 = createModel(app1, "SmartEMFModel.xmi", "SmartEMFModel.xmi", debug, true, "");	
		
		SimpleEMFModelTransformationApp app2 = new SimpleEMFModelTransformationApp(initEngine(), workspacePath);
		EMFTestContentAdapter adapter2 = createModel(app2, "EMFModel.xmi", "EMFModel.xmi", debug, false, "");	
		
		SimpleModelGraphTransformationAPI api1 = app1.initAPI();
		SimpleEMFModelTransformationAPI api2 = app2.initAPI();		
		
		adapter1.clear();
		adapter2.clear();
		//change the model state
		if(debug) System.out.println("Model loaded. Now the model will be changed");
		if(debug) System.out.println("Add new Class");
		
		api1.createClass().apply();
		api2.createClass().apply();
		
		assertEquals(4, api1.findClass().countMatches());
		assertEquals(4, api2.findClass().countMatches());
		
		adapter1.clear();
		adapter2.clear();	
		if(debug) System.out.println("Add new reference");
		api1.createReference().apply();
		api2.createReference().apply();

		assertEquals(2, api1.hasReference().countMatches());
		assertEquals(2, api2.hasReference().countMatches());
		
		if(debug) System.out.println("change references");
		
		api1.changeReference().apply();
		api2.changeReference().apply();
		
		if(debug) System.out.println("remove references");
		
		api1.removeReference().apply();
		api2.removeReference().apply();
		
		assertEquals(1, api1.hasReference().countMatches());
		assertEquals(1, api2.hasReference().countMatches());
	}
	
	//Ill try other test cases here for testing
	@Test
	public void createAndDeleteRegister() {
		SimpleFamiliesGraphTransformationApp app = new SimpleFamiliesGraphTransformationApp(initEngine(), workspacePath);
		EMFTestContentAdapter adapter1 = createModel(app, "CreateAndDeleteRegister.xmi", 
				"CreateAndDeleteRegister.xmi", debug, true, "SimpleFamilies");
		SimpleFamiliesGraphTransformationAPI api = app.initAPI();
		
		
		assertNoMatch(api.findRegister());
		assertMatchCount(1, api.createRegister()); // create rule is applicable
		assertTrue(api.createRegister().isApplicable());
		api.createRegister().apply();
		assertMatchCount(1, api.findRegister());

		assertTrue(api.deleteRegister().isApplicable());
		api.deleteRegister().apply();
		assertNoMatch(api.findRegister());

	}
	
}

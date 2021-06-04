package org.emoflon.ibex.gt.testsuite.EmfAdapterTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.gt.testsuite.EMFModelAppTestCase;
import org.junit.Test;

import SimpleEMFEcoreModel.Model;
import SimpleEMFModelTransformation.api.SimpleEMFModelTransformationAPI;
import SimpleEMFModelTransformation.api.SimpleEMFModelTransformationApp;
import SimpleModelGraphTransformation.api.SimpleModelGraphTransformationAPI;
import SimpleModelGraphTransformation.api.SimpleModelGraphTransformationApp;

public class EMFModelLoadTest extends EMFModelAppTestCase{
	
	boolean debug = false;
	@Test
	public void testSmartEMFModelLoad() {
		SimpleModelGraphTransformationApp app1 = new SimpleModelGraphTransformationApp(initEngine(), workspacePath);
		EMFTestContentAdapter adapter1 = createModel(app1, "SmartEMFModel.xmi", "SmartEMFModel.xmi", debug, true, "EmfAdapterTest");	
		
		SimpleEMFModelTransformationApp app2 = new SimpleEMFModelTransformationApp(initEngine(), workspacePath);
		EMFTestContentAdapter adapter2 = createModel(app2, "EMFModel.xmi", "EMFModel.xmi", debug, false, "EmfAdapterTest");	
		
		//test if the notification generation for both emf types is equal
		assertEquals(adapter1.getAllChangesAmount(), adapter2.getAllChangesAmount());

		//now both models should be loaded
		Optional<Object> object1 = adapter1.getChangedObjects().stream().findAny();
		Optional<Object> object2 = adapter2.getChangedObjects().stream().findAny();
		assertTrue(object1.isPresent());
		assertTrue(object2.isPresent());
		
		assertEquals(((SimpleModel.Model) ((Resource) object1.get()).getContents().get(0)).getClasses().size(), 
				((SimpleEMFEcoreModel.Model) ((Resource) object2.get()).getContents().get(0)).getClasses().size());
	}

}

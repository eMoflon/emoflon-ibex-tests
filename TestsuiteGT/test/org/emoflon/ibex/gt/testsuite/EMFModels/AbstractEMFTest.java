package org.emoflon.ibex.gt.testsuite.EMFModels;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.moflon.smartemf.persistence.SmartEMFResourceFactoryImpl;

import Village.VillagePackage;

public class AbstractEMFTest {
	
	
	public Resource createResource(String path) {
		URI resourceURI = URI.createFileURI(path);
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("xmi", new SmartEMFResourceFactoryImpl());
		ResourceSetImpl resSet = new ResourceSetImpl();
		//register the village package
		resSet.getPackageRegistry()
			.put(VillagePackage.eINSTANCE.getNsURI(), VillagePackage.eINSTANCE);
		Resource res = resSet.getResource(resourceURI, true);
		return res;
	}
	
	
	public EMFTestAdapter createAdapter(Resource r) {
		return new EMFTestAdapter(r);
	}
}

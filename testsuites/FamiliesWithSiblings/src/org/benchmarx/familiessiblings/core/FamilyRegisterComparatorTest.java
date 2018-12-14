package org.benchmarx.familiessiblings.core;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import FamiliesWithSiblings.FamiliesWithSiblingsPackage;
import FamiliesWithSiblings.FamilyRegister;


public class FamilyRegisterComparatorTest {

	FamiliesComparator comp;
	
	private static ResourceSet rs;
	
	@BeforeClass
	public static void init() {
		rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		rs.getPackageRegistry().put(FamiliesWithSiblingsPackage.eNS_URI, FamiliesWithSiblingsPackage.eINSTANCE);
	}
	
	@Before
	public void createComparator() {
		comp = new FamiliesComparator(false);
	}
	
	@Test
	public void testPositive() throws IOException {
		URI uri = URI.createURI("./model/FamilyRegister.xmi");
		Resource res = rs.createResource(uri);
		res.load(null);
		FamilyRegister familyReg = (FamilyRegister)(res.getContents().get(0));
		

		uri = URI.createURI("./model/FamilyRegister2.xmi");
		res = rs.createResource(uri);
		res.load(null);
		FamilyRegister sameFamilyReg = (FamilyRegister)(res.getContents().get(0));
		
		comp.assertEquals(familyReg, sameFamilyReg);
	}
	
	
}

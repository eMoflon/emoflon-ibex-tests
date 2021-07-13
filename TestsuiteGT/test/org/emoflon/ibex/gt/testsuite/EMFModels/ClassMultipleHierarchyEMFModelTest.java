package org.emoflon.ibex.gt.testsuite.EMFModels;

import MetamodelInheritance.BaseContaineeA;
import MetamodelInheritance.BaseContainer;
import MetamodelInheritance.MetamodelInheritanceFactory;
import MetamodelInheritance2.ChildA;
import MetamodelInheritance2.ChildContaineeD;
import MetamodelInheritance2.MetamodelInheritance2Factory;
import MetamodelInheritance3.ChildD;
import MetamodelInheritance3.MetamodelInheritance3Factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.emoflon.ibex.common.emf.EMFManipulationUtils;
import org.junit.Test;
import org.moflon.smartemf.runtime.SmartObject;

public class ClassMultipleHierarchyEMFModelTest {

	@Test
	public void testExternalModelReferences() {
		MetamodelInheritanceFactory factory = MetamodelInheritanceFactory.eINSTANCE;
		MetamodelInheritance2Factory factory2 = MetamodelInheritance2Factory.eINSTANCE;	
		MetamodelInheritance3Factory factory3 = MetamodelInheritance3Factory.eINSTANCE;
		
		BaseContainer base = factory.createBaseContainer();
		ChildA childA = factory2.createChildA();
		ChildContaineeD childC = factory2.createChildContaineeD();
		
		childA.getChildD().add(childC);
		base.getBaseA().add(childA);
		//check if containment was handled right
		assertEquals(1, base.getBaseA().size());
		assertEquals(1, childA.getChildD().size());
		assertNotNull(childC.eContainer());
		
		List<BaseContaineeA> bases = new ArrayList<BaseContaineeA>();
		BaseContaineeA base1 = factory.createBaseContaineeA();
		BaseContaineeA base2 = factory.createBaseContaineeA();
		BaseContaineeA base3 = factory.createBaseContaineeA();
		bases.add(base1);
		bases.add(base2);
		bases.add(base3);
		//add this to container
		base.getBaseA().addAll(bases);
		assertEquals(4, base.getBaseA().size());
		//change container
		childC.getContainerReferences().addAll(bases);
		assertEquals(1, base.getBaseA().size());
		assertEquals(3, childC.getContainerReferences().size());
		assertEquals(childC, base1.eContainer());
		
		//now do a non-containment reference with the third model
		ChildD childD = factory3.createChildD();
		childD.getA().addAll(bases);
		//containment shouldn't have changed
		assertEquals(3, childC.getContainerReferences().size());
		assertEquals(3, childD.getA().size());
		
		//delete childC
//		if(childC instanceof SmartObject) EMFManipulationUtils.delete(childC, true); 
//		else EcoreUtil.delete(childC, true);
//		assertNull(childC.eContainer());
//		assertEquals(0, childD.getA().size());
		
		
	}
}

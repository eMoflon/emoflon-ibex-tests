package org.benchmarx.simplefamilies.core;

import SimpleFamilies.Family;
import SimpleFamilies.FamilyMember;
import SimpleFamilies.FamilyRegister;
import SimpleFamilies.SimpleFamiliesFactory;

public class SimpleFamiliesHelper {

	public void createTestFamily(FamilyRegister register){
		Family f = SimpleFamiliesFactory.eINSTANCE.createFamily();
		f.setName("Test");
		register.getFamilies().add(f);
	}
	
	public void createMotherInSingleTestFamily(FamilyRegister register, String name){
		Family f = register.getFamilies().get(0);
		
		FamilyMember mother = SimpleFamiliesFactory.eINSTANCE.createFamilyMember();
		mother.setName(name);
		
		f.setMother(mother);
	}
	
	public void createDaughterInSingleTestFamily(FamilyRegister register, String name){
		Family f = register.getFamilies().get(0);
		
		FamilyMember daughter = SimpleFamiliesFactory.eINSTANCE.createFamilyMember();
		daughter.setName(name);
		
		f.getDaughters().add(daughter);
	}
}

package org.benchmarx.familiessiblings.core;

import FamiliesWithSiblings.FamiliesWithSiblingsFactory;
import FamiliesWithSiblings.Family;
import FamiliesWithSiblings.FamilyMember;
import FamiliesWithSiblings.FamilyRegister;

public class FamilySiblingsRegisterBuilder {

	private FamilyRegister register;
	private FamiliesWithSiblingsFactory f = FamiliesWithSiblingsFactory.eINSTANCE;
	
	public FamilySiblingsRegisterBuilder() {
		register = f.createFamilyRegister();
	}
	
	public FamilySiblingsRegisterBuilder(FamilyRegister reg) {
		register = reg;
	}
	
	public FamilyBuilder family(String name) {
		FamilyBuilder builder = new FamilyBuilder(name);
		return builder;
	}
	
	public FamilyBuilder family(Family fam) {
		FamilyBuilder builder = new FamilyBuilder(fam);
		return builder;
	}
	
	class FamilyBuilder {
		
		private Family fam;
		
		public FamilyBuilder(String name) {
			fam = f.createFamily();
			fam.setName(name);
			register.getFamilies().add(fam);
		}
		
		public FamilyBuilder(Family family) {
			fam = family;
		}
		
		public FamilyBuilder father(String name) {
			FamilyMember m = f.createFamilyMember();
			m.setName(name);
			fam.setFather(m);
			return this;
		}
		
		public FamilyBuilder mother(String name) {
			FamilyMember m = f.createFamilyMember();
			m.setName(name);
			fam.setMother(m);
			return this;
		}
		
		public FamilyBuilder son(String name) {
			FamilyMember m = f.createFamilyMember();
			m.setName(name);
			fam.getSons().add(m);
			return this;
		}
		
		public FamilyBuilder daughter(String name) {
			FamilyMember m = f.createFamilyMember();
			m.setName(name);
			fam.getDaughters().add(m);
			return this;
		}
		
		public FamilyBuilder sibling(Family sibling) {
			fam.getSiblings().add(sibling);
			return this;
		}
		
		public Family getFamily() {
			return fam;
		}		
	}
}

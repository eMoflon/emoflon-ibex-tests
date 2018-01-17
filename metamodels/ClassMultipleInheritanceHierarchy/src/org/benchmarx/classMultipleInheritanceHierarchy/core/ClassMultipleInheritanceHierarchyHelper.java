package org.benchmarx.classMultipleInheritanceHierarchy.core;

import org.eclipse.emf.ecore.util.EcoreUtil;

import classMultipleInheritanceHierarchy.Attribute;
import classMultipleInheritanceHierarchy.ClassMultipleInheritanceHierarchyFactory;
import classMultipleInheritanceHierarchy.ClassPackage;
import classMultipleInheritanceHierarchy.Clazz;

public class ClassMultipleInheritanceHierarchyHelper {

	public void createClass(ClassPackage pkg, String name){
		Clazz c = ClassMultipleInheritanceHierarchyFactory.eINSTANCE.createClazz();
		c.setName(name);
		pkg.getClasses().add(c);
	}

	public void createInheritance(ClassPackage pkg, int superClassPos, int subClassPos){
		Clazz superClazz = pkg.getClasses().get(superClassPos);
		Clazz c = pkg.getClasses().get(subClassPos);
		c.getSuperClass().add(superClazz);
	}
	
	public void createAttributeInSingleClass(ClassPackage pkg, String name, String type){
		createAttributeInClass(pkg, name, type, 0);
	}
	
	public void createAttributeInClass(ClassPackage pkg, String name, String type, int pos){
		Clazz c = pkg.getClasses().get(pos);
		
		Attribute attr = ClassMultipleInheritanceHierarchyFactory.eINSTANCE.createAttribute();
		attr.setName(name);
		attr.setType(type);
		
		c.getAttributes().add(attr);
	}
	
	public void deleteClass(ClassPackage pkg, String name) {
		Clazz toBeDeleted = pkg.getClasses().stream()
				.filter(p -> p.getName().equals(name)).findAny().get();
		//toBeDeleted.setSuperClass(null);
		EcoreUtil.delete(toBeDeleted, true);
	}

}

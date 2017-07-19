package org.benchmarx.classInheritanceHierarchy.core;

import ClassInheritanceHierarchy.Attribute;
import ClassInheritanceHierarchy.ClassInheritanceHierarchyFactory;
import ClassInheritanceHierarchy.ClassPackage;
import ClassInheritanceHierarchy.Clazz;

public class ClassInheritanceHierarchyHelper {

	public void createClass(ClassPackage pkg, String name){
		Clazz c = ClassInheritanceHierarchyFactory.eINSTANCE.createClazz();
		c.setName(name);
		pkg.getClasses().add(c);
	}

	public void createSubClass(ClassPackage pkg, String name, int superPos){
		Clazz superClazz = pkg.getClasses().get(superPos);
		Clazz c = ClassInheritanceHierarchyFactory.eINSTANCE.createClazz();
		c.setName(name);
		c.setSuperClass(superClazz);
		pkg.getClasses().add(c);
	}
	
	public void createAttributeInSingleClass(ClassPackage pkg, String name, String type){
		createAttributeInClass(pkg, name, type, 0);
	}
	
	public void createAttributeInClass(ClassPackage pkg, String name, String type, int pos){
		Clazz c = pkg.getClasses().get(pos);
		
		Attribute attr = ClassInheritanceHierarchyFactory.eINSTANCE.createAttribute();
		attr.setName(name);
		attr.setType(type);
		
		c.getAttributes().add(attr);
	}
}

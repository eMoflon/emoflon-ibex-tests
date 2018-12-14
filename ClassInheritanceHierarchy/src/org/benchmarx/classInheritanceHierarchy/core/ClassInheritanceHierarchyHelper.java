package org.benchmarx.classInheritanceHierarchy.core;

import java.util.Optional;

import org.eclipse.emf.ecore.util.EcoreUtil;

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
		pkg.getClasses().add(c);
		c.setName(name);
		c.setSuperClass(superClazz);
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

	public void addInheritance(ClassPackage pkg, int posSub, int posSuper) {
		Clazz sub = pkg.getClasses().get(posSub);
		Clazz sup = pkg.getClasses().get(posSuper);
		
		sub.setSuperClass(sup);
	}
	
	public void addInheritance(ClassPackage pkg, String subName, String superName) {
		Clazz sub = pkg.getClasses().stream()
				.filter(a -> a.getName().equals(subName))
				.findAny().get();
		Clazz sup = pkg.getClasses().stream()
				.filter(a -> a.getName().equals(superName))
				.findAny().get();
		
		sub.setSuperClass(sup);
	}
	
	public void deleteAttribute(ClassPackage pkg, String className, String name) {
		Clazz c = pkg.getClasses().stream()
				.filter(a -> a.getName().equals(className))
				.findAny().get();
		assert (!c.getAttributes().stream().noneMatch(a -> a.getName().equals(name)));
		Optional<Attribute> toBeDeleted = c.getAttributes().stream()
				.filter(a -> a.getName().equals(name)).findAny();
		
		toBeDeleted.ifPresent(a -> EcoreUtil.delete(a, true));
	}
	
	public void deleteClass(ClassPackage pkg, String name) {
		Clazz toBeDeleted = pkg.getClasses().stream()
				.filter(p -> p.getName().equals(name)).findAny().get();
		//toBeDeleted.setSuperClass(null);
		EcoreUtil.delete(toBeDeleted, true);
	}
	
	public void deleteInheritance(ClassPackage pkg, String nameSub) {
		Clazz sub = pkg.getClasses().stream()
				.filter(a -> a.getName().equals(nameSub))
				.findAny().get();
		
		sub.setSuperClass(null);
	}
	
	public void renameClass(ClassPackage pkg, String previousName, String newName) {
		pkg.getClasses().stream()
				.filter(c -> c.getName().equals(previousName))
				.forEach(c -> c.setName(newName));
	}
	
	public void renameAttribute(ClassPackage pkg, String previousName, String newName, String className) {
		Clazz c = pkg.getClasses().stream()
				.filter(a -> a.getName().equals(className))
				.findAny().get();
		assert (!c.getAttributes().stream().noneMatch(a -> a.getName().equals(previousName)));
			c.getAttributes().stream()
			.filter(a -> a.getName().equals(previousName))
			.forEach(a -> a.setName(newName));
	}
}

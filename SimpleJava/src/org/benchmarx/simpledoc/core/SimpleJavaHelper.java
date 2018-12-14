package org.benchmarx.simpledoc.core;

import simpleJava.Class;
import simpleJava.Package;
import simpleJava.SimpleJavaFactory;

public class SimpleJavaHelper {

	public void createMoflon(Package org) {
		Package es = createPackage(org, "es");
		Package emoflon = createPackage(es, "emoflon");
		Package cmoflon = createPackage(es, "cmoflon");
		Package ibex = createPackage(emoflon, "ibex");
		
		createClass(es, "EcoreUtil", "EcoreUtilImpl");
		createClass(emoflon, "TGG", "TGGImpl");
		createClass(ibex, "IPM", "IPMImpl");
		createClass(cmoflon, "GT", "GTImpl");
	}
	
	public Class createClass(Package p, String name, String content) {
		Class c = SimpleJavaFactory.eINSTANCE.createClass();
		c.setName(name);
		c.setBody(content);
		p.getClasses().add(c);
		return c;
	}
	
	public Package createPackage(Package p, String name) {
		Package pkg = SimpleJavaFactory.eINSTANCE.createPackage();
		pkg.setName(name);
		p.getSubPackages().add(pkg);
		return pkg;
	}
	
	public void fillBodies(Package p) {
		for(Class c : p.getClasses()) {
			if(c.getBody() != null) 
				continue;
			
			c.setBody(c.getName() + "Impl");
		}
		p.getSubPackages().stream().forEach(p1 -> fillBodies(p1));
	}
	
	public void rename(Package rootP, String oldName, String newName) {
		if(rootP.getName().equals(oldName)) {
			rootP.setName(newName);
			return;
		}
		rootP.getSubPackages().stream().forEach(sp -> rename(sp, oldName, newName));
		rootP.getClasses().stream().filter(c -> c.getName().equals(oldName)).forEach(c -> c.setName(newName));
	}
	
	public void movePackage(Package root, String parentName, String childName) {
		Package parent = getPackage(root, parentName);
		Package child = getPackage(root, childName);
		Package oldParent = (Package) child.eContainer();
		oldParent.getSubPackages().remove(child);
		parent.getSubPackages().add(child);
	}
	
	public void moveClass(Package root, String parentName, String docName) {
		Package parent = getPackage(root, parentName);
		Class doc = getClass(root, docName);
		parent.getClasses().add(doc);
	}
	
	public Package getPackage(Package root, String name) {
		if(root.getName().equals(name)) {
			return root;
		}
		for(Package f : root.getSubPackages())
			return getPackage(f, name);
		return null;
	}
	
	public Class getClass(Package root, String name) {
		for(Class d : root.getClasses())
			if(d.getName().equals(name))
				return d;
		for(Package f : root.getSubPackages())
			return getClass(f, name);
		return null;
	}
}

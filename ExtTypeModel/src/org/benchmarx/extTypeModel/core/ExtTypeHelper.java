package org.benchmarx.extTypeModel.core;

import ExtTypeModel.ExtTypeModelFactory;
import ExtTypeModel.Field;
import ExtTypeModel.JavaDoc;
import ExtTypeModel.Method;
import ExtTypeModel.Package;
import ExtTypeModel.Parameter;
import ExtTypeModel.Type;

public class ExtTypeHelper {

	private final Package rootPackage;
	
	private final ExtTypeModelFactory factory = ExtTypeModelFactory.eINSTANCE;

	public ExtTypeHelper(Package rootPackage) {
		this.rootPackage = rootPackage;
	}
	
	//// CREATORS ////
	
	public Package createPackage(Package superP, String name) {
		Package p = factory.createPackage();
		p.setName(name);
		p.setSuperPackage(superP);
		return p;
	}
	
	public Type createType(Package p, String name) {
		return createType(p, name, false);
	}
	
	public Type createType(Package p, String name, boolean isInterface) {
		Type t = factory.createType();
		t.setName(name);
		t.setInterface(isInterface);
		t.setPackage(p);
		return t;
	}
	
	public void createTypeExtensionLink(Type t, Type extendingT) {
		t.getExtendedBy().add(extendingT);
	}
	
	public Method createMethod(Type t, String name) {
		Method m = factory.createMethod();
		m.setName(name);
		m.setType(t);
		return m;
	}
	
	public Field createField(Type t, String name) {
		Field f = factory.createField();
		f.setName(name);
		f.setType(t);
		return f;
	}
	
	public Parameter createParameter(Method m, String name) {
		Parameter p = factory.createParameter();
		p.setName(name);
		p.setMethod(m);
		return p;
	}
	
	public JavaDoc createJavaDoc(Method m, String comment) {
		JavaDoc jd = factory.createJavaDoc();
		jd.setComment(comment);
		jd.setMethod(m);
		return jd;
	}
	
	//// GETTERS ////

	public Package getPackage(String name) {
		return getPackage(rootPackage, name);
	}

	public Package getPackage(Package p, String name) {
		if (p.getName().equals(name))
			return p;
		
		for (Package subP : p.getSubPackages()) {
			Package result = getPackage(subP, name);
			if (result != null)
				return result;
		}
		return null;
	}
	
	

}

package org.simpleClass.core;

import simpleClassInheritance.*;

public class SimpleClassInheritanceHelper {

	private ClazzContainer cCont;
	
	public SimpleClassInheritanceHelper(ClazzContainer cCont) {
		this.cCont = cCont;
	}
	
	public Clazz getClazz(String name) {
		for(Clazz c : cCont.getClazzes()) {
			Clazz result = getClazz(c, name);
			if(result != null)
				return result;
		}
		return null;
	}
	
	public Clazz getClazz(Clazz c, String name) {
		if(c.getName().equals(name))
			return c;
		
		for(Clazz sub : c.getSubClazzes()) {
			Clazz result = getClazz(sub, name);
			if(result != null)
				return result;
		}
		return null;
	}
	
	public Field getField(String name) {
		for(Clazz c : cCont.getClazzes()) {
			Field result = getField(c, name);
			if(result != null)
				return result;
		}
		return null;
	}
	
	public Field getField(Clazz c, String name) {
		for(Field f : c.getFields()) {
			if(f.getName().equals(name))
				return f;
		}
		
		for(Clazz sub : c.getSubClazzes()) {
			Field result = getField(sub, name);
			if(result != null)
				return result;
		}
		return null;
	}
	
	public Method getMethod(String name) {
		for(Clazz c : cCont.getClazzes()) {
			Method result = getMethod(c, name);
			if(result != null)
				return result;
		}
		return null;
	}
	
	public Method getMethod(Clazz c, String name) {
		for(Method m : c.getMethods()) {
			if(m.getName().equals(name))
				return m;
		}
		
		for(Clazz sub : c.getSubClazzes()) {
			Method result = getMethod(sub, name);
			if(result != null)
				return result;
		}
		return null;
	}
	
	public Clazz createClazz(String name) {
		Clazz c = SimpleClassInheritanceFactory.eINSTANCE.createClazz();
		c.setName(name);
		cCont.getClazzes().add(c);
		return c;
	}
	
	public Clazz createSubClazz(Clazz superC, String name) {
		Clazz c = SimpleClassInheritanceFactory.eINSTANCE.createClazz();
		c.setName(name);
		superC.getSubClazzes().add(c);
		return c;
	}
	
	public Field createField(Clazz c, String name) {
		Field f = SimpleClassInheritanceFactory.eINSTANCE.createField();
		f.setName(name);
		c.getFields().add(f);
		return f;
	}
	
	public Method createMethod(Clazz c, String name) {
		Method m = SimpleClassInheritanceFactory.eINSTANCE.createMethod();
		m.setName(name);
		c.getMethods().add(m);
		return m;
	}
	
	public Parameter createMethod(Method m, String name) {
		Parameter p = SimpleClassInheritanceFactory.eINSTANCE.createParameter();
		p.setName(name);
		m.getParameters().add(p);
		return p;
	}
	
	public void createInheritanceLink(Clazz superC, Clazz sub) {
		superC.getSubClazzes().add(sub);
	}
	
	public void deleteInheritanceLink(Clazz superC, Clazz sub) {
		superC.getSubClazzes().remove(sub);
	}
}

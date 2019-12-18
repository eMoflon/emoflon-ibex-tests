package org.benchmarx.ar.core;

import Ar.AClass;
import Ar.ArFactory;
import Ar.BClass;

public class ArHelper {

	public AClass createAClass(String name) {
		AClass a = ArFactory.eINSTANCE.createAClass();
		a.setName(name);
		return a;
	}
	
	public BClass createBClass(String name) {
		BClass b = ArFactory.eINSTANCE.createBClass();
		b.setName(name);
		return b;
	}
	
}

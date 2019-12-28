package org.benchmarx.ar.core;

import Ar.AClass;
import Ar.ArFactory;
import Ar.BClass;
import Ar.RClass;
import Ar.SClass;

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
	
	public void fillIDs(RClass r) {
		for(SClass s : r.getS())
			s.setId(54321);
	}
	
}

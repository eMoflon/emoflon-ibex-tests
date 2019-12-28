package org.benchmarx.qou.core;

import Qou.QClass;
import Qou.QouFactory;
import Qou.UClass;

public class QouHelper {

	public UClass createULess(QClass q) {
		UClass u = QouFactory.eINSTANCE.createUClass();
		u.setHasMore(false);
		u.setInfo("important informations");
		q.getU().add(u);
		return u;
	}
	
}

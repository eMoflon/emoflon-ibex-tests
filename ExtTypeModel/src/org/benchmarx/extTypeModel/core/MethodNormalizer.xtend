package org.benchmarx.extTypeModel.core

import ExtTypeModel.Method
import org.benchmarx.util.Normalizer

class MethodNormalizer extends Normalizer<Method> {
	
	override compare(Method o1, Method o2) {
		o1.name.compareTo(o2.name);
	}
	
}
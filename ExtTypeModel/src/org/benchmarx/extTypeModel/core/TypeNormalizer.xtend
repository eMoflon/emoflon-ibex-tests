package org.benchmarx.extTypeModel.core

import ExtTypeModel.Type
import org.benchmarx.util.Normalizer

class TypeNormalizer extends Normalizer<Type> {

	override compare(Type o1, Type o2) {
		o1.name.compareTo(o2.name);
	}

}

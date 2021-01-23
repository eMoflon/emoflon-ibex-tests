package org.benchmarx.extTypeModel.core

import ExtTypeModel.Field
import org.benchmarx.util.Normalizer

class FieldNormalizer extends Normalizer<Field> {
	
	override compare(Field o1, Field o2) {
		o1.name.compareTo(o2.name);
	}
	
}
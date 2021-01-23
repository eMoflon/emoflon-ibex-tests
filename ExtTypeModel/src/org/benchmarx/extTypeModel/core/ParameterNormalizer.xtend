package org.benchmarx.extTypeModel.core

import ExtTypeModel.Parameter
import org.benchmarx.util.Normalizer

class ParameterNormalizer extends Normalizer<Parameter> {
	
	override compare(Parameter o1, Parameter o2) {
		o1.name.compareTo(o2.name)
	}
	
}
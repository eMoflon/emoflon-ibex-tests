package org.benchmarx.extDocModel.core

import ExtDocModel.Annotation
import org.benchmarx.util.Normalizer

class AnnotationNormalizer extends Normalizer<Annotation> {
	
	override compare(Annotation o1, Annotation o2) {
		o1.value.compareTo(o2.value)
	}
	
}
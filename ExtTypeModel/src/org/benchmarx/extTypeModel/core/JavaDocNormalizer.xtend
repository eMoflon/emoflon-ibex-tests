package org.benchmarx.extTypeModel.core

import ExtTypeModel.JavaDoc
import org.benchmarx.util.Normalizer

class JavaDocNormalizer extends Normalizer<JavaDoc> {
	
	override compare(JavaDoc o1, JavaDoc o2) {
		o1.comment.compareTo(o2.comment)
	}
	
}
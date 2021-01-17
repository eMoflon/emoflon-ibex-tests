package org.benchmarx.extDocModel.core

import ExtDocModel.Doc
import org.benchmarx.util.Normalizer

class DocNormalizer extends Normalizer<Doc> {
	
	override compare(Doc o1, Doc o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
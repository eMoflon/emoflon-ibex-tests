package org.benchmarx.extDocModel.core

import ExtDocModel.GlossaryEntry
import org.benchmarx.util.Normalizer

class GlossaryEntryNormalizer extends Normalizer<GlossaryEntry> {
	
	override compare(GlossaryEntry o1, GlossaryEntry o2) {
		o1.name.compareTo(o2.name);
	}
	
}
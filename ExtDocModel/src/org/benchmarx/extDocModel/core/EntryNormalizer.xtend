package org.benchmarx.extDocModel.core

import ExtDocModel.Entry
import org.benchmarx.util.Normalizer

class EntryNormalizer extends Normalizer<Entry> {

	override compare(Entry o1, Entry o2) {
		o1.name.compareTo(o2.name);
	}

}

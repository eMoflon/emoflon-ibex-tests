package org.benchmarx.extDocModel.core

import org.benchmarx.util.Normalizer
import ExtDocModel.Folder

class FolderNormalizer extends Normalizer<Folder> {
	
	override compare(Folder o1, Folder o2) {
		o1.name.compareTo(o2.name);
	}
	
}
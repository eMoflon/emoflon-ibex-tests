package org.benchmarx.extTypeModel.core

import ExtTypeModel.Package
import org.benchmarx.util.Normalizer

class PackageNormalizer extends Normalizer<Package> {
	
	override compare(Package o1, Package o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
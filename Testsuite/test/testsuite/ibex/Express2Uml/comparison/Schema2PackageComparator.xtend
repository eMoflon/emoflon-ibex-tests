package testsuite.ibex.Express2Uml.comparison

import org.eclipse.emf.ecore.EObject
import testsuite.ibex.testUtil.CorrComparator
import Express2UML.Schema2Package

class Schema2PackageComparator extends CorrComparator {
	
	override stringify(EObject corr) {
		switch corr {
			Schema2Package: corr.stringify
		}
	}
	
	private def String stringify(Schema2Package corr) {
		'''
		Schema2Package {
			SRC {"«corr.source.name»}
			TRG {"«corr.target.name»"}
		}
		'''
	}
	
}
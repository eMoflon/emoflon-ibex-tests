package testsuite.ibex.Express2Uml.comparison

import org.eclipse.emf.ecore.EObject
import testsuite.ibex.testUtil.CorrComparator
import Express2UML.Schema2Package
import Express2UML.Entity2Class

class Express2UMLCorrespondenceComparator extends CorrComparator {
	
	override stringify(EObject corr) {
		switch corr {
			Schema2Package: corr.stringify()
			Entity2Class: corr.stringify()
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
	
	private def String stringify(Entity2Class corr) {
		'''
		Entity2Class {
			SRC {"«corr.source.name»}
			TRG {"«corr.target.name»"}
		}
		'''
	}
	
}
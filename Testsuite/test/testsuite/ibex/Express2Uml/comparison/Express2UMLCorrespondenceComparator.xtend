package testsuite.ibex.Express2Uml.comparison

import Express2UML.Entity2Clazz
import Express2UML.Schema2Package
import org.eclipse.emf.ecore.EObject
import testsuite.ibex.testUtil.CorrComparator

class Express2UMLCorrespondenceComparator extends CorrComparator {
	
	override stringify(EObject corr) {
		switch corr {
			Schema2Package: corr.stringify()
			Entity2Clazz: corr.stringify()
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
	
	private def String stringify(Entity2Clazz corr) {
		'''
		Entity2Class {
			SRC {"«corr.source.name»}
			TRG {"«corr.target.name»"}
		}
		'''
	}
	
}
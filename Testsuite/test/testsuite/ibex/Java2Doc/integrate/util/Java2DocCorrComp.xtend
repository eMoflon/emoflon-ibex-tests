package testsuite.ibex.Java2Doc.integrate.util

import Java2Doc.Class2Doc
import Java2Doc.Package2Folder
import org.eclipse.emf.ecore.EObject
import testsuite.ibex.testUtil.CorrComparator

class Java2DocCorrComp extends CorrComparator {

	override stringify(EObject corr) {
		if (corr instanceof Package2Folder)
			return corr.stringify;
		if (corr instanceof Class2Doc)
			return corr.stringify;
	}

	def stringify(Package2Folder corr) {
		'''
		Package2Folder {
			SRC {"«corr.source.name»", fullQualifier: «corr.source.fullQualifier»}
			TRG {"«corr.target.name»"}
		}
		'''
	}

	def stringify(Class2Doc corr) {
		'''
		Class2Doc {
			SRC {"«corr.source.name»", body: «corr.source.body»}
			TRG {"«corr.target.name»"}
		}
		'''
	}

}

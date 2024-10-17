package testsuite.ibex.Java2Doc.integrate.util

import Java2Doc.Class2Doc
import Java2Doc.Package2Folder
import org.eclipse.emf.ecore.EObject
import testsuite.ibex.testUtil.CorrComparator
import simpleDoc.Folder
import simpleJava.Clazz
import simpleDoc.Doc

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
			SRC {"«(corr.source as simpleJava.Package).name»", fullQualifier: «(corr.source as simpleJava.Package).fullQualifier»}
			TRG {"«(corr.target as Folder).name»"}
		}
		'''
	}

	def stringify(Class2Doc corr) {
		'''
		Class2Doc {
			SRC {"«(corr.source as Clazz).name»", body: «(corr.source as Clazz).body»}
			TRG {"«(corr.target as Doc).name»"}
		}
		'''
	}

}

package testsuite.ibex.ExtType2Doc_ConcSync.integrate.util

import ExtType2Doc_ConcSync.Field2Entry
import ExtType2Doc_ConcSync.JDoc2Annotation
import ExtType2Doc_ConcSync.Method2Entry
import ExtType2Doc_ConcSync.Package2Folder
import ExtType2Doc_ConcSync.Param2Entry
import ExtType2Doc_ConcSync.Project2DocContainer
import ExtType2Doc_ConcSync.Type2Doc
import org.eclipse.emf.ecore.EObject
import testsuite.ibex.testUtil.CorrComparator

class ExtType2Doc_ConcSync_CorrComp extends CorrComparator {
	
	override stringify(EObject corr) {
		if (corr instanceof Project2DocContainer)
			return corr.stringify;
		if (corr instanceof Package2Folder)
			return corr.stringify;
		if (corr instanceof Type2Doc)
			return corr.stringify;
		if (corr instanceof Method2Entry)
			return corr.stringify;
		if (corr instanceof Param2Entry)
			return corr.stringify;
		if (corr instanceof Field2Entry)
			return corr.stringify;
		if (corr instanceof JDoc2Annotation)
			return corr.stringify;
	}
	
	def stringify(Project2DocContainer corr) {
		'''
		Project2DocContainer {
			SRC {}
			TRG {}
		}
		'''
	}
	
	def stringify(Package2Folder corr) {
		'''
		Package2Folder {
			SRC {"«corr.source.name»", fQName: «corr.source.FQname»}
			TRG {"«corr.target.name»"}
		}
		'''
	}
	
	def stringify(Type2Doc corr) {
		'''
		Type2Doc {
			SRC {"«corr.source.name»", interface: «corr.source.interface»}
			TRG {"«corr.target.name»"}
		}
		'''
	}
	
	def stringify(Method2Entry corr) {
		'''
		Method2Entry {
			SRC {"«corr.source.name»"}
			TRG {"«corr.target.name»", type: «corr.target.type»}
		}
		'''
	}
	
	def stringify(Param2Entry corr) {
		'''
		Param2Entry {
			SRC {"«corr.source.name»"}
			TRG {"«corr.target.name»"}
		}
		'''
	}
	
	def stringify(Field2Entry corr) {
		'''
		Field2Entry {
			SRC {"«corr.source.name»"}
			TRG {"«corr.target.name»", type: «corr.target.type»}
		}
		'''
	}
	
	def stringify(JDoc2Annotation corr) {
		'''
		JDoc2Annotation {
			SRC {"«corr.source.comment»"}
			TRG {"«corr.target.value»"}
		}
		'''
	}
	
}
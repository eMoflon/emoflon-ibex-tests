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
import ExtTypeModel.Type
import ExtDocModel.Folder
import ExtDocModel.Doc
import ExtTypeModel.Method
import ExtDocModel.Entry
import ExtTypeModel.Parameter
import ExtTypeModel.Field
import ExtTypeModel.JavaDoc
import ExtDocModel.Annotation

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
			SRC {"«(corr.source as ExtTypeModel.Package).name»", fQName: «(corr.source as ExtTypeModel.Package).FQname»}
			TRG {"«(corr.target as Folder).name»"}
		}
		'''
	}
	
	def stringify(Type2Doc corr) {
		'''
		Type2Doc {
			SRC {"«(corr.source as Type).name»", interface: «(corr.source as Type).interface»}
			TRG {"«(corr.target as Doc).name»"}
		}
		'''
	}
	
	def stringify(Method2Entry corr) {
		'''
		Method2Entry {
			SRC {"«(corr.source as Method).name»"}
			TRG {"«(corr.target as Entry).name»", type: «(corr.target as Entry).type»}
		}
		'''
	}
	
	def stringify(Param2Entry corr) {
		'''
		Param2Entry {
			SRC {"«(corr.source as Parameter).name»"}
			TRG {"«(corr.target as Entry).name»"}
		}
		'''
	}
	
	def stringify(Field2Entry corr) {
		'''
		Field2Entry {
			SRC {"«(corr.source as Field).name»"}
			TRG {"«(corr.target as Entry).name»", type: «(corr.target as Entry).type»}
		}
		'''
	}
	
	def stringify(JDoc2Annotation corr) {
		'''
		JDoc2Annotation {
			SRC {"«(corr.source as JavaDoc).comment»"}
			TRG {"«(corr.target as Annotation).value»"}
		}
		'''
	}
	
}
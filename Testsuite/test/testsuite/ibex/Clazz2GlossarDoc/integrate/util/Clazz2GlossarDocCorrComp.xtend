package testsuite.ibex.Clazz2GlossarDoc.integrate.util

import Clazz2GlossarDoc.Clazz2doc
import Clazz2GlossarDoc.Container2container
import Clazz2GlossarDoc.Field2entry
import Clazz2GlossarDoc.Method2entry
import Clazz2GlossarDoc.Parameter2entry
import org.eclipse.emf.ecore.EObject
import testsuite.ibex.testUtil.CorrComparator

class Clazz2GlossarDocCorrComp extends CorrComparator {
	
	override stringify(EObject corr) {
		if(corr instanceof Container2container)
			return corr.stringify
		if(corr instanceof Clazz2doc)
			return corr.stringify
		if(corr instanceof Field2entry)
			return corr.stringify
		if(corr instanceof Method2entry)
			return corr.stringify
		if(corr instanceof Parameter2entry)
			return corr.stringify
	}
	
	def stringify(Container2container corr) {
		'''
		Container2container {
		}
		'''
	}
	
	def stringify(Clazz2doc corr) {
		'''
		Clazz2doc {
			SRC {"«corr.source.name»"}
			TRG {"«corr.target.name»"}
		}
		'''
	}
	
	def stringify(Field2entry corr) {
		'''
		Field2entry {
			SRC {"«corr.source.name»"}
			TRG {"«corr.target.name»", type: «corr.target.type»}
		}
		'''
	}
	
	def stringify(Method2entry corr) {
		'''
		Method2entry {
			SRC {"«corr.source.name»"}
			TRG {"«corr.target.name»", type: «corr.target.type»}
		}
		'''
	}
	
	def stringify(Parameter2entry corr) {
		'''
		Parameter2entry {
			SRC {"«corr.source.name»"}
			TRG {"«corr.target.name»", type: «corr.target.type»}
		}
		'''
	}
	
}
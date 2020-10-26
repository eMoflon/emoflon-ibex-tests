package testsuite.ibex.Express2Uml.comparison

import Express2UML.Entity2Clazz
import Express2UML.Function2SingleMethodClazz
import Express2UML.IntegerTypeAttribute2Integer
import Express2UML.Schema2Package
import org.eclipse.emf.ecore.EObject
import testsuite.ibex.testUtil.CorrComparator
import Express2UML.StringTypeAttribute2String

class Express2UMLCorrespondenceComparator extends CorrComparator {
	
	override stringify(EObject corr) {
		switch corr {
			Schema2Package: corr.stringify()
			Entity2Clazz: corr.stringify()
			Function2SingleMethodClazz: corr.stringify()
			IntegerTypeAttribute2Integer: corr.stringify()
			StringTypeAttribute2String: corr.stringify()
		}
	}
	
	private def String stringify(Schema2Package corr) {
		'''
		Schema2Package {
			SRC {"«corr.source.name»"}
			TRG {"«corr.target.name»"}
		}
		'''
	}
	
	private def String stringify(Entity2Clazz corr) {
		'''
		Entity2Clazz {
			SRC {"«corr.source.name»"}
			TRG {"«corr.target.name»"}
		}
		'''
	}
	
	private def String stringify(Function2SingleMethodClazz corr) {
		'''
		Function2SingleMethodClazz {
			SRC {"«corr.source.name»"}
			TRG {"«corr.target.name»"}
			METHOD {«corr.target.methods.get(0).name»}
		}
		'''
	}
	
	private def String stringify(IntegerTypeAttribute2Integer corr) {
		'''
		IntegerTypeAttribute2Integer {
			SRC {"«corr.source.name»"}
			TRG {"«corr.target.name»"}
		}
		'''
	}
	
	private def String stringify(StringTypeAttribute2String corr) {
		'''
		IntegerTypeAttribute2Integer {
			SRC {"«corr.source.name»"}
			TRG {"«corr.target.name»"}
		}
		'''
	}
	
}
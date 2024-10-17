package testsuite.ibex.Express2Uml.comparison

import Express2UML.Entity2Clazz
import Express2UML.Function2SingleMethodClazz
import Express2UML.IntegerTypeAttribute2Integer
import Express2UML.Schema2Package
import Express2UML.SchemaContainer2UMLContainer
import Express2UML.StringTypeAttribute2String
import org.eclipse.emf.ecore.EObject
import testsuite.ibex.testUtil.CorrComparator
import ExpressModel.Schema
import uml.Package
import ExpressModel.Entity
import uml.Clazz
import ExpressModel.Function
import ExpressModel.IntegerAttribute
import ExpressModel.StringAttribute

class Express2UMLCorrespondenceComparator extends CorrComparator {
	
	override stringify(EObject corr) {
		switch corr {
			SchemaContainer2UMLContainer: corr.stringify()
			Schema2Package: corr.stringify()
			Entity2Clazz: corr.stringify()
			Function2SingleMethodClazz: corr.stringify()
			IntegerTypeAttribute2Integer: corr.stringify()
			StringTypeAttribute2String: corr.stringify()
		}
	}
	
	private def String stringify(SchemaContainer2UMLContainer corr) {
		'''
		SchemaContainer2RootPackage {
			SRC {"SchemaContainer"}
			TRG {"UMLContainer"}
		}
		'''
	}
	
	private def String stringify(Schema2Package corr) {
		'''
		Schema2Package {
			SRC {"«(corr.source as Schema).name»"}
			TRG {"«(corr.target as Package).name»"}
		}
		'''
	}
	
	private def String stringify(Entity2Clazz corr) {
		'''
		Entity2Clazz {
			SRC {"«(corr.source as Entity).name»"}
			TRG {"«(corr.target as Clazz).name»"}
		}
		'''
	}
	
	private def String stringify(Function2SingleMethodClazz corr) {
		'''
		Function2SingleMethodClazz {
			SRC {"«(corr.source as Function).name»"}
			TRG {"«(corr.target as Clazz).name»"}
			METHOD {«(corr.target as Clazz).methods.get(0).name»}
		}
		'''
	}
	
	private def String stringify(IntegerTypeAttribute2Integer corr) {
		'''
		IntegerTypeAttribute2Integer {
			SRC {"«(corr.source as IntegerAttribute).name»"}
			TRG {"«(corr.target as uml.Integer).name»"}
		}
		'''
	}
	
	private def String stringify(StringTypeAttribute2String corr) {
		'''
		StringTypeAttribute2String {
			SRC {"«(corr.source as StringAttribute).name»"}
			TRG {"«(corr.target as uml.String).name»"}
		}
		'''
	}
	
}
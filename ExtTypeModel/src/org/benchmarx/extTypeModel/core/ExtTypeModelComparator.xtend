package org.benchmarx.extTypeModel.core

import ExtTypeModel.Field
import ExtTypeModel.JavaDoc
import ExtTypeModel.Method
import ExtTypeModel.Package
import ExtTypeModel.Parameter
import ExtTypeModel.Type
import org.benchmarx.emf.Comparator

import static org.junit.jupiter.api.Assertions.*
import ExtTypeModel.Project

class ExtTypeModelComparator implements Comparator<Project> {
	
	boolean checkAttributeValues;
	PackageNormalizer packageNormalizer;
	TypeNormalizer typeNormalizer;
	MethodNormalizer methodNormalizer;
	FieldNormalizer fieldNormalizer;
	ParameterNormalizer parameterNormalizer;
	JavaDocNormalizer javaDocNormalizer;
	
	new(boolean checkAttributeValues) {
		this.checkAttributeValues = checkAttributeValues;
		this.packageNormalizer = new PackageNormalizer;
		this.typeNormalizer = new TypeNormalizer;
		this.methodNormalizer = new MethodNormalizer;
		this.fieldNormalizer = new FieldNormalizer;
		this.parameterNormalizer = new ParameterNormalizer;
		this.javaDocNormalizer = new JavaDocNormalizer;
	}
	
	override assertEquals(Project expected, Project actual) {
		assertEquals(expected.stringify, actual.stringify);
	}
	
	def String stringify(Project project) {
		'''
		Project {
			packages {
				«FOR p : packageNormalizer.normalize(project.rootPackages)»
					«p.stringify»
				«ENDFOR»
			}
		}
		'''
	}
	
	def String stringify(Package package_) {
		'''
		Package {
			«IF checkAttributeValues»
				name = "«package_.name»"
				fQname = "«package_.FQname»"
			«ENDIF»
			subpackages {
				«FOR p : packageNormalizer.normalize(package_.subPackages)»
					«p.stringify»
				«ENDFOR»
			}
			types {
				«FOR t : typeNormalizer.normalize(package_.types)»
					«t.stringify»
				«ENDFOR»
			}
		}
		'''
	}
	
	def String stringify(Type type) {
		'''
		Type {
			«IF checkAttributeValues»
				name = "«type.name»"
				interface = «type.interface»
			«ENDIF»
			methods {
				«FOR m : methodNormalizer.normalize(type.methods)»
					«m.stringify»
				«ENDFOR»
			}
			fields {
				«FOR f : fieldNormalizer.normalize(type.fields)»
					«f.stringify»
				«ENDFOR»
			}
			extendedBy {
				«FOR t : typeNormalizer.normalize(type.extendedBy)»
					Type "«t.name»"
				«ENDFOR»
			}
		}
		'''
	}
	
	def String stringify(Method method) {
		'''
		Method {
			«IF checkAttributeValues»name = "«method.name»"«ENDIF»
			params {
				«FOR p : parameterNormalizer.normalize(method.params)»
					«p.stringify»
				«ENDFOR»
			}
			docs {
				«FOR jd : javaDocNormalizer.normalize(method.docs)»
					«jd.stringify»
				«ENDFOR»
			}
		}
		'''
	}
	
	def String stringify(Parameter parameter) {
		'''
		Parameter {
			«IF checkAttributeValues»name = "«parameter.name»"«ENDIF»
		}
		'''
	}
	
	def String stringify(JavaDoc doc) {
		'''
		JavaDoc {
			«IF checkAttributeValues»comment = "«doc.comment»"«ENDIF»
		}
		'''
	}
	
	def String stringify(Field field) {
		'''
		Field {
			«IF checkAttributeValues»name = "«field.name»"«ENDIF»
		}
		'''
	}
	
}
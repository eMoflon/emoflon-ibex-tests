package org.benchmarx.processDefinition.core

import java.util.ArrayList
import org.benchmarx.emf.Comparator

import static org.junit.Assert.*
import java.util.List
import ProcessDefinition.SystemModule
import ProcessDefinition.Module

class ProcessDefinitionComparator implements Comparator<SystemModule> {
	
	boolean checkAttributeValues
	
	ModuleNormalizer moduleNormalizer
	HelperNormalizer helperNormalizer
	
	new (boolean checkAttributeValues){
		this.checkAttributeValues = checkAttributeValues
		
		moduleNormalizer = new ModuleNormalizer(checkAttributeValues)
		helperNormalizer = new HelperNormalizer(checkAttributeValues)
	}
	
	override assertEquals(SystemModule expected, SystemModule actual) {
		assertTrue(stringify(expected).startsWith("SystemModule"))
		assertEquals(stringify(expected), stringify(actual))
	}
	
	def stringify(SystemModule sm) {
		return '''
		SystemModule {
			name = "«IF checkAttributeValues»«sm.name»«ELSE»systemModule«ENDIF»",
			helper = "«IF sm.helper !== null»«helperNormalizer.stringify(sm.helper)»«ELSE»()«ENDIF»",
			allModules = [
			«val List<Module> sortedModuleList = new ArrayList<Module>(sm.allModules)»
			«moduleNormalizer.normalize(sortedModuleList)»
			«FOR m : sortedModuleList SEPARATOR ", "»
				«moduleNormalizer.stringify(m)»
			«ENDFOR»
			]
		}
		'''
	}
	
	
}
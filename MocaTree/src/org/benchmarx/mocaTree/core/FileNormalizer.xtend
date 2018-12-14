package org.benchmarx.mocaTree.core

import MocaTree.File

class FileNormalizer extends Normalizer<File> {
	
	TextNormalizer textNormalizer
	
	new (boolean checkAttributeValues){
		super(checkAttributeValues)
		
		textNormalizer = new TextNormalizer(checkAttributeValues)
	}

	
	override String stringify(File f) {
		return '''
			File {
				name = "«IF checkAttributeValues»«f.name»«ELSE»file«ENDIF»",
				index = "«IF checkAttributeValues»«f.index»«ELSE»index«ENDIF»",
				«IF f.rootNode !== null»«textNormalizer.stringify(f.rootNode)»«ELSE»()«ENDIF»
			}
		'''
	}
}
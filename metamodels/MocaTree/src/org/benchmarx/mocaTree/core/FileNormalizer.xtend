package org.benchmarx.mocaTree.core

import MocaTree.File

class FileNormalizer extends Normalizer<File> {
	
	NodeNormalizer nodeNormalizer
	
	new (boolean checkAttributeValues){
		super(checkAttributeValues)
		
		nodeNormalizer = new NodeNormalizer(checkAttributeValues)
	}

	
	override String stringify(File f) {
		return '''
			File {
				name = "«IF checkAttributeValues»«f.name»«ELSE»file«ENDIF»",
				index = "«IF checkAttributeValues»«f.index»«ELSE»index«ENDIF»",
				rootNode = "«IF checkAttributeValues»«nodeNormalizer.stringify(f.rootNode)»«ELSE»«IF f.rootNode !== null»rootNode«ELSE»()«ENDIF»«ENDIF»",
			}
		'''
	}
}
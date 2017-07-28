package org.benchmarx.mocaTree.core

import java.util.List
import java.util.ArrayList
import MocaTree.File
import MocaTree.Folder

class FolderNormalizer extends Normalizer<Folder> {
	
	FileNormalizer fileNormalizer
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
		
		this.fileNormalizer = new FileNormalizer(checkAttributeValues)
	}

	
	override String stringify(Folder f) {
		return '''
		Folder {
			name = "«IF checkAttributeValues»«f.name»«ELSE»folder«ENDIF»",
			index = "«IF checkAttributeValues»«f.index»«ELSE»index«ENDIF»",
			subFolders = [
			«val List<Folder> sortedFolderList = new ArrayList<Folder>(f.subFolder)»
			«this.normalize(sortedFolderList)»
			«FOR r : sortedFolderList SEPARATOR ", "»
				«this.stringify(r)»
			«ENDFOR»
			]
			files = [
			«val List<File> sortedFileList = new ArrayList<File>(f.file)»
			«fileNormalizer.normalize(sortedFileList)»
			«FOR file : sortedFileList SEPARATOR ", "»
				«fileNormalizer.stringify(file)»
			«ENDFOR»
			]
		}
		'''
	}
}
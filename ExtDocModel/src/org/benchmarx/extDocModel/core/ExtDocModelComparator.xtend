package org.benchmarx.extDocModel.core

import ExtDocModel.Annotation
import ExtDocModel.Doc
import ExtDocModel.DocContainer
import ExtDocModel.Entry
import ExtDocModel.Folder
import ExtDocModel.Glossary
import ExtDocModel.GlossaryEntry
import org.benchmarx.emf.Comparator

import static org.junit.jupiter.api.Assertions.*

class ExtDocModelComparator implements Comparator<DocContainer> {
	
	boolean checkAttributeValues;
	FolderNormalizer folderNormalizer;
	DocNormalizer docNormalizer;
	EntryNormalizer entryNormalizer;
	AnnotationNormalizer annotationNormalizer;
	GlossaryEntryNormalizer glossaryEntryNormalizer;
	
	new(boolean checkAttributeValues) {
		this.checkAttributeValues = checkAttributeValues;
		this.folderNormalizer = new FolderNormalizer;
		this.docNormalizer = new DocNormalizer;
		this.entryNormalizer = new EntryNormalizer;
		this.annotationNormalizer = new AnnotationNormalizer;
		this.glossaryEntryNormalizer = new GlossaryEntryNormalizer;
	}
	
	override assertEquals(DocContainer expected, DocContainer actual) {
		assertEquals(expected.stringify, actual.stringify);
	}
	
	def String stringify(DocContainer container) {
		'''
		DocContainer {
			folders {
				«FOR f : folderNormalizer.normalize(container.folders)»
					«f.stringify»
				«ENDFOR»
			}
			«IF container.glossary !== null »glossary = «container.glossary.stringify»«ENDIF»
		}
		'''
	}
	
	def String stringify(Folder folder) {
		'''
		Folder {
			«IF checkAttributeValues»name = "«folder.name»"«ENDIF»
			subfolders {
				«FOR f : folderNormalizer.normalize(folder.subFolder)»
					«f.stringify»
				«ENDFOR»
			}
			docs {
				«FOR d : docNormalizer.normalize(folder.docs)»
					«d.stringify»
				«ENDFOR»
			}
		}
		'''
	}
	
	def String stringify(Doc doc) {
		'''
		Doc {
			«IF checkAttributeValues»name = "«doc.name»"«ENDIF»
			entries {
				«FOR e : entryNormalizer.normalize(doc.entries)»
					«e.stringify»
				«ENDFOR»
			}
			subDocs {
				«FOR d : docNormalizer.normalize(doc.subDocs)»
					Doc "«d.name»"
				«ENDFOR»
			}
		}
		'''
	}
	
	def String stringify(Entry entry) {
		'''
		Entry {
			«IF checkAttributeValues»
				name = "«entry.name»"
				type = "«entry.type»"
			«ENDIF»
			annotations {
				«FOR a : annotationNormalizer.normalize(entry.annotations)»
					«a.stringify»
				«ENDFOR»
			}
		}
		'''
	}
	
	def String stringify(Annotation annotation) {
		'''
		Annotation {
			«IF checkAttributeValues»value = "«annotation.value»"«ENDIF»
		}
		'''
	}
	
	def String stringify(Glossary glossary) {
		'''
		Glossary {
			entries {
				«FOR e : glossaryEntryNormalizer.normalize(glossary.entries)»
					«e.stringify»
				«ENDFOR»
			}
		}
		'''
	}
	
	def String stringify(GlossaryEntry glossaryEntry) {
		'''
		GlossaryEntry {
			«IF checkAttributeValues»name = "«glossaryEntry.name»"«ENDIF»
			entries {
				«FOR e : entryNormalizer.normalize(glossaryEntry.entries)»
					Entry "«e.name»"
				«ENDFOR»
			}
		}
		'''
	}
	
}
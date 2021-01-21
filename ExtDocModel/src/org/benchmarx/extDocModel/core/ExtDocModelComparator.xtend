package org.benchmarx.extDocModel.core

import ExtDocModel.Annotation
import ExtDocModel.Doc
import ExtDocModel.DocContainer
import ExtDocModel.Entry
import ExtDocModel.Glossary
import ExtDocModel.GlossaryEntry
import org.benchmarx.emf.Comparator

import static org.junit.Assert.assertEquals

class ExtDocModelComparator implements Comparator<DocContainer> {
	
	boolean checkAttributeValues;
	DocNormalizer docNormalizer;
	EntryNormalizer entryNormalizer;
	GlossaryEntryNormalizer glossaryEntryNormalizer;
	
	new(boolean checkAttributeValues) {
		this.checkAttributeValues = checkAttributeValues;
		this.docNormalizer = new DocNormalizer;
		this.entryNormalizer = new EntryNormalizer;
		this.glossaryEntryNormalizer = new GlossaryEntryNormalizer;
	}
	
	override assertEquals(DocContainer expected, DocContainer actual) {
		assertEquals(expected.stringify, actual.stringify);
	}
	
	def String stringify(DocContainer container) {
		'''
		DocContainer {
			docs {
				«FOR d : docNormalizer.normalize(container.docs)»
					«d.stringify»
				«ENDFOR»
			}
			«IF container.glossary !== null »glossary = «container.glossary.stringify»«ENDIF»
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
			«IF entry.annotation !== null»annotation = «entry.annotation.stringify»«ENDIF»
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
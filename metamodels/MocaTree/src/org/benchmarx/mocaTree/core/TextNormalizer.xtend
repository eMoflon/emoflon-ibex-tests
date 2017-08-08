package org.benchmarx.mocaTree.core

import MocaTree.Node
import java.util.List
import java.util.ArrayList
import MocaTree.Text
import MocaTree.Attribute

class TextNormalizer extends Normalizer<Text> {
	
	AttributeNormalizer attributeNormalizer
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
		
		attributeNormalizer = new AttributeNormalizer(checkAttributeValues)
	}	
	
	override stringify(Text t) {
		if (t instanceof Node)
			return stringifyNode(t)
		else
			return stringifyText(t)
	}
	
	def stringifyText(Text t) {
		return '''
			Text {
				name = "«IF checkAttributeValues»«t.name»«ELSE»text«ENDIF»",
				index = "«IF checkAttributeValues»«t.index»«ELSE»index«ENDIF»",
			}
		'''
	}
	
	def stringifyNode(Node n) {
		return '''
			Node {
				name = "«IF checkAttributeValues»«n.name»«ELSE»node«ENDIF»",
				index = "«IF checkAttributeValues»«n.index»«ELSE»index«ENDIF»",
				children = [
					«val List<Text> sortedNodeList = new ArrayList<Text>(n.children)»
					«this.normalize(sortedNodeList)»
					«FOR t : sortedNodeList SEPARATOR ", "»
						«this.stringify(t)»
					«ENDFOR»
				]
				attributes = [
					«val List<Attribute> sortedAttrList = new ArrayList<Attribute>(n.attribute)»
					«attributeNormalizer.normalize(sortedAttrList)»
					«FOR a : sortedAttrList SEPARATOR ", "»
						«attributeNormalizer.stringify(a)»
					«ENDFOR»
				]
			}
		'''
	}
}
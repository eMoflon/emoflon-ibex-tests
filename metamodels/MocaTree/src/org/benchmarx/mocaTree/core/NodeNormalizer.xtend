package org.benchmarx.mocaTree.core

import MocaTree.Node
import java.util.List
import java.util.ArrayList
import MocaTree.Text
import MocaTree.Attribute

class NodeNormalizer extends Normalizer<Node> {
	
	AttributeNormalizer attributeNormalizer
	TextNormalizer textNormalizer
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
		
		attributeNormalizer = new AttributeNormalizer(checkAttributeValues)
		textNormalizer = new TextNormalizer(checkAttributeValues)
	}

	
	override String stringify(Node n) {
		return '''
			Node {
				name = "«IF checkAttributeValues»«n.name»«ELSE»node«ENDIF»",
				index = "«IF checkAttributeValues»«n.index»«ELSE»index«ENDIF»",
				children = [
					«val List<Text> sortedNodeList = new ArrayList<Text>(n.children)»
					«textNormalizer.normalize(sortedNodeList)»
					«FOR t : sortedNodeList SEPARATOR ", "»
						«IF t instanceof Node»«this.stringify(t as Node)»«ELSE»«textNormalizer.stringify(t)»«ENDIF»
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
package org.benchmarx.woodenblockset.core

import WoodenBlockSet.BlockSet
import WoodenBlockSet.Construction
import WoodenBlockSet.Cube
import WoodenBlockSet.Cuboid
import WoodenBlockSet.Playroom
import WoodenBlockSet.Shape3D
import WoodenBlockSet.TriangularPrism
import java.util.stream.Collectors
import org.benchmarx.emf.Comparator

import static org.junit.jupiter.api.Assertions.*

class BlockSetComparator implements Comparator<Playroom> {
	
	boolean checkAttributeValues;
	ConstructionNormalizer constructionNormalizer;
	Shape3DNormalizer shapeNormalizer;

	new(boolean checkAttributeValues) {
		this.checkAttributeValues = checkAttributeValues;
		constructionNormalizer = new ConstructionNormalizer()
		shapeNormalizer = new Shape3DNormalizer()
	}
	
	override assertEquals(Playroom expected, Playroom actual) {
		assertEquals(expected.stringify, actual.stringify)
	}
	
	def String stringify(Playroom playroom) {
		'''
		Playroom {
			blocksets {
				«FOR s : playroom.blocksets.stream.map(b|b.stringify).collect(Collectors.toList).sort»
					«s»
				«ENDFOR»
			}
		}
		'''
	}
	
	def String stringify(BlockSet blockSet) {
		'''
		BlockSet {
			constructions {
				«FOR c : constructionNormalizer.normalize(blockSet.constructions)»
					«c.stringify»
				«ENDFOR»
			}
		}
		'''
	}
	
	def String stringify(Construction construction) {
		'''
		Construction {
			«IF checkAttributeValues»
				«construction.name»
				«construction.constructor»
			«ENDIF»
			components {
				«FOR c : shapeNormalizer.normalize(construction.components)»
					«c.stringify»
				«ENDFOR»
			}
		}
		'''
	}
	
	def String stringify(Shape3D shape) {
		if(shape instanceof Cuboid)
			return shape.stringify
		if(shape instanceof Cube)
			return shape.stringify
		if(shape instanceof TriangularPrism)
			return shape.stringify
	}
	
	def String stringify(Cuboid cuboid) {
		'''
		Cuboid {
			«IF checkAttributeValues»«cuboid.color»«ENDIF»
		}
		'''
	}
	
	def String stringify(Cube cube) {
		'''
		Cube {
			«IF checkAttributeValues»«cube.color»«ENDIF»
		}
		'''
	}
	
	def String stringify(TriangularPrism prism) {
		'''
		TriangularPrism {
			«IF checkAttributeValues»«prism.color»«ENDIF»
		}
		'''
	}
	
}
package org.benchmarx.woodenblockset.core

import org.benchmarx.emf.Comparator
import WoodenBlockSet.BlockSet
import static org.junit.Assert.assertEquals
import WoodenBlockSet.Construction
import WoodenBlockSet.Shape3D
import WoodenBlockSet.Cuboid
import WoodenBlockSet.Cube
import WoodenBlockSet.TriangularPrism

class BlockSetComparator implements Comparator<BlockSet> {
	
	boolean checkAttributeValues;
	ConstructionNormalizer constructionNormalizer;
	Shape3DNormalizer shapeNormalizer;

	new(boolean checkAttributeValues) {
		this.checkAttributeValues = checkAttributeValues;
		constructionNormalizer = new ConstructionNormalizer()
		shapeNormalizer = new Shape3DNormalizer()
	}
	
	override assertEquals(BlockSet expected, BlockSet actual) {
		assertEquals(expected.stringify, actual.stringify)
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
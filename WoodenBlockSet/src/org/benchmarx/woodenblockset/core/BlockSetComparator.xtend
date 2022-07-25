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
import WoodenBlockSet.Printed3DShape

class BlockSetComparator implements Comparator<Playroom> {
	
	boolean checkAttributeValues;
	ConstructionNormalizer constructionNormalizer;
	Shape3DNormalizer shapeNormalizer;
	Printed3DShapeNormalizer printed3DShapeNormalizer;

	new(boolean checkAttributeValues) {
		this.checkAttributeValues = checkAttributeValues;
		constructionNormalizer = new ConstructionNormalizer()
		shapeNormalizer = new Shape3DNormalizer()
		printed3DShapeNormalizer = new Printed3DShapeNormalizer()
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
			units {
				«FOR c : printed3DShapeNormalizer.normalize(blockSet.units)»
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
			connections {
				«FOR c : printed3DShapeNormalizer.normalize(construction.connections)»
					«c.name»
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
			«IF checkAttributeValues»color: «cuboid.color»«ENDIF»
		}
		'''
	}
	
	def String stringify(Cube cube) {
		'''
		Cube {
			«IF checkAttributeValues»color: «cube.color»«ENDIF»
		}
		'''
	}
	
	def String stringify(TriangularPrism prism) {
		'''
		TriangularPrism {
			«IF checkAttributeValues»color: «prism.color»«ENDIF»
		}
		'''
	}
	
	def String stringify(Printed3DShape printed3d) {
		'''
		Printed3DShape {
			«IF checkAttributeValues»
				name: «printed3d.name»
				color: «printed3d.color»
			«ENDIF»
			connections {
				«FOR c : printed3DShapeNormalizer.normalize(printed3d.connections)»
					«c.name»
				«ENDFOR»
			}
		}
		'''
	}
	
}
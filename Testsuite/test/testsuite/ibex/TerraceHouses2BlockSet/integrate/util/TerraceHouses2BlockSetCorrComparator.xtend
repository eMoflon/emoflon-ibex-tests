package testsuite.ibex.TerraceHouses2BlockSet.integrate.util

import testsuite.ibex.testUtil.CorrComparator
import org.eclipse.emf.ecore.EObject
import TerraceHouses2BlockSet.District2Playroom
import TerraceHouses2BlockSet.Structure2Construction
import TerraceHouses2BlockSet.Skyway2Printed3DShape
import TerraceHouses2BlockSet.House2Printed3DShape

class TerraceHouses2BlockSetCorrComparator extends CorrComparator {
	
	override stringify(EObject corr) {
		if(corr instanceof District2Playroom)
			return corr.stringify
		if(corr instanceof Structure2Construction)
			return corr.stringify
		if(corr instanceof Skyway2Printed3DShape)
			return corr.stringify
		if(corr instanceof House2Printed3DShape)
			return corr.stringify
	}
	
	def stringify(District2Playroom corr) {
		'''
		District2Playroom {
		}
		'''
	}
	
	def stringify(Structure2Construction corr) {
		'''
		Structure2Construction {
			SRC {"«corr.source.name»", address: «corr.source.address»}
			TRG {"«corr.target.name»", constructor: «corr.target.constructor»}
		}
		'''
	}
	
	def stringify(Skyway2Printed3DShape corr) {
		'''
		Skyway2Printed3DShape {
			SRC {"«corr.source.name»"}
			TRG {"«corr.target.name»", color: «corr.target.color»}
		}
		'''
	}
	
	def stringify(House2Printed3DShape corr) {
		'''
		House2Printed3DShape {
			SRC {"«corr.source.name»", address: «corr.source.address»}
			TRG {"«corr.target.name»", color: «corr.target.color»}
		}
		'''
	}
	
}
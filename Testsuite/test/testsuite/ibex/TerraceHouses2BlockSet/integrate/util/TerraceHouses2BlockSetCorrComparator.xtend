package testsuite.ibex.TerraceHouses2BlockSet.integrate.util

import testsuite.ibex.testUtil.CorrComparator
import org.eclipse.emf.ecore.EObject
import TerraceHouses2BlockSet.District2Playroom
import TerraceHouses2BlockSet.Structure2Construction

class TerraceHouses2BlockSetCorrComparator extends CorrComparator {
	
	override stringify(EObject corr) {
		if(corr instanceof District2Playroom)
			return corr.stringify
		if(corr instanceof Structure2Construction)
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
	
}
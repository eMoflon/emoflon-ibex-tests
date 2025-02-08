package testsuite.ibex.TerraceHouses2BlockSet.integrate.util

import testsuite.ibex.testUtil.CorrComparator
import org.eclipse.emf.ecore.EObject
import TerraceHouses2BlockSet.District2Playroom
import TerraceHouses2BlockSet.Structure2Construction
import TerraceHouses2BlockSet.Skyway2Printed3DShape
import TerraceHouses2BlockSet.House2Printed3DShape
import TerraceHouses.Structure
import WoodenBlockSet.Construction
import TerraceHouses.Skyway
import WoodenBlockSet.Printed3DShape
import TerraceHouses.House

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
			SRC {"«(corr.source as Structure).name»", address: «(corr.source as Structure).address»}
			TRG {"«(corr.target as Construction).name»", constructor: «(corr.target as Construction).constructor»}
		}
		'''
	}
	
	def stringify(Skyway2Printed3DShape corr) {
		'''
		Skyway2Printed3DShape {
			SRC {"«(corr.source as Skyway).name»"}
			TRG {"«(corr.target as Printed3DShape).name»", color: «(corr.target as Printed3DShape).color»}
		}
		'''
	}
	
	def stringify(House2Printed3DShape corr) {
		'''
		House2Printed3DShape {
			SRC {"«(corr.source as House).name»", address: «(corr.source as House).address»}
			TRG {"«(corr.target as Printed3DShape).name»", color: «(corr.target as Printed3DShape).color»}
		}
		'''
	}
	
}
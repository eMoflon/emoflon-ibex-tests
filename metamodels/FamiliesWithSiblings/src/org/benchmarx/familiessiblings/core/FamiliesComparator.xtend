package  org.benchmarx.familiessiblings.core

import FamiliesWithSiblings.Family;
import FamiliesWithSiblings.FamilyMember;
import FamiliesWithSiblings.FamilyRegister
import java.util.ArrayList
import java.util.List
import org.benchmarx.emf.Comparator

import static org.junit.Assert.*

public class FamiliesComparator implements Comparator<FamilyRegister> {
	FamilyNormaliser comparator
	FamilyMemberNormaliser familyMemberComparator
	FamilySiblingNormaliser familySiblingComparator
	boolean checkAttributeValues
	
	new (){
		comparator = new FamilyNormaliser();
		familyMemberComparator = new FamilyMemberNormaliser();
		familySiblingComparator = new FamilySiblingNormaliser();
		checkAttributeValues = true
	}
	
	new (boolean checkAttributeValues){
		comparator = new FamilyNormaliser();
		familyMemberComparator = new FamilyMemberNormaliser();
		familySiblingComparator = new FamilySiblingNormaliser();
		this.checkAttributeValues = checkAttributeValues
	}
	
	override assertEquals(FamilyRegister expected, FamilyRegister actual) {	
		assertTrue(familyToString(expected).startsWith("FamilyRegister"))
		assertEquals(familyToString(expected), familyToString(actual))
	}
	
	def familyToString(FamilyRegister families) {
		return '''
			FamilyRegister {
			    families = [
			    «val List<Family> sortedList = new ArrayList<Family>(families.families)»
			    «comparator.normalize(sortedList)»
				«FOR f : sortedList SEPARATOR ", "»
					Family {
					familyName = «IF checkAttributeValues»«f.name»«ELSE»family«ENDIF»
					«val List<Family> sortedListOfSiblings = new ArrayList<Family>(f.siblings)»
					«IF checkAttributeValues»«familySiblingComparator.normalize(sortedListOfSiblings)»«ELSE»«ENDIF»
					,siblings   = [«FOR sibling : sortedListOfSiblings SEPARATOR ", "»«IF checkAttributeValues»«familySibling(sibling)»«ELSE»sibling«ENDIF»«ENDFOR»]
					,father     = «IF checkAttributeValues»«maybeFamilyMember(f.father)»«ELSE»«ENDIF»
					,mother     = «IF checkAttributeValues»«maybeFamilyMember(f.mother)»«ELSE»«ENDIF»
					«val List<FamilyMember> sortedListOfSon = new ArrayList<FamilyMember>(f.sons)»
					«IF checkAttributeValues»«familyMemberComparator.normalize(sortedListOfSon)»«ELSE»«ENDIF»
					,sons       = [«FOR son : sortedListOfSon SEPARATOR ", "»«IF checkAttributeValues»«familyMember(son)»«ELSE»son«ENDIF»«ENDFOR»]
				«val List<FamilyMember> sortedListOfDaughter = new ArrayList<FamilyMember>(f.daughters)»
				«IF checkAttributeValues»«familyMemberComparator.normalize(sortedListOfDaughter)»«ELSE»«ENDIF»
					,daughters  = [«FOR daughter : sortedListOfDaughter SEPARATOR ", "»«IF checkAttributeValues»«familyMember(daughter)»«ELSE»daughter«ENDIF»«ENDFOR»]
					}
				«ENDFOR»
				]
			}
		'''
	}
	
	def maybeFamilyMember(FamilyMember fm){
		return '''«IF fm !== null»Just («familyMember(fm)»)«ELSE»Nothing«ENDIF»'''
	}
	
	def familyMember(FamilyMember fm){
		return '''FamilyMember { firstName = "«fm.name»" }'''
	}
	
	def familySibling(Family s){
		return '''Sibling "«s.name»"'''
	}
}

	


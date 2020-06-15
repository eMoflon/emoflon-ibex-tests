package testsuite.ibex.CompanyToIT.integrate.util

import testsuite.ibex.testUtil.CorrComparator
import org.eclipse.emf.ecore.EObject
import CompanyToIT.Admin2Router
import CompanyToIT.Company2IT
import CompanyToIT.Employee2Laptop
import CompanyToIT.Employee2PC

class CompanyToITCorrComp extends CorrComparator {
	
	override stringify(EObject corr) {
		if(corr instanceof Company2IT)
			return corr.stringify;
		if(corr instanceof Admin2Router)
			return corr.stringify;
		if(corr instanceof Employee2Laptop)
			return corr.stringify;
		if(corr instanceof Employee2PC)
			return corr.stringify;
	}
	
	def stringify(Company2IT corr) {
		'''
		Company2IT {
			SRC {"«corr.source.name»"}
			TRG {"«corr.target.name»"}
		}
		'''
	}
	
	def stringify(Admin2Router corr) {
		'''
		Admin2Router {
			SRC {"«corr.source.name»"}
			TRG {"«corr.target.name»"}
		}
		'''
	}
	
	def stringify(Employee2Laptop corr) {
		'''
		Employee2Laptop {
			SRC {"«corr.source.name»"}
			TRG {"«corr.target.name»"}
		}
		'''
	}
	
	def stringify(Employee2PC corr) {
		'''
		Employee2PC {
			SRC {"«corr.source.name»"}
			TRG {"«corr.target.name»"}
		}
		'''
	}
	
}
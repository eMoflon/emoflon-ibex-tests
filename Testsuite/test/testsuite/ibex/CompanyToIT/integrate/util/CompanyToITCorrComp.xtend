package testsuite.ibex.CompanyToIT.integrate.util

import testsuite.ibex.testUtil.CorrComparator
import org.eclipse.emf.ecore.EObject
import CompanyToIT.Admin2Router
import CompanyToIT.Company2IT
import CompanyToIT.Employee2Laptop
import CompanyToIT.Employee2PC
import CompanyLanguage.Company
import ITLanguage.IT
import CompanyLanguage.Admin
import ITLanguage.Router
import ITLanguage.Laptop
import CompanyLanguage.Employee
import ITLanguage.PC

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
		var source = corr.source as Company
		var target = corr.target as IT
		'''
		Company2IT {
			SRC {"«source.name»"}
			TRG {"«target.name»"}
		}
		'''
	}
	
	def stringify(Admin2Router corr) {
		var source = corr.source as Admin
		var target = corr.target as Router
		'''
		Admin2Router {
			SRC {"«source.name»"}
			TRG {"«target.name»"}
		}
		'''
	}
	
	def stringify(Employee2Laptop corr) {
		var source = corr.source as Employee
		var target = corr.target as Laptop
		'''
		Employee2Laptop {
			SRC {"«source.name»"}
			TRG {"«target.name»"}
		}
		'''
	}
	
	def stringify(Employee2PC corr) {
		var source = corr.source as Employee
		var target = corr.target as PC
		'''
		Employee2PC {
			SRC {"«source.name»"}
			TRG {"«target.name»"}
		}
		'''
	}
	
}
package org.benchmarx.companyLanguage.core

import CompanyLanguage.Company
import java.util.ArrayList
import org.benchmarx.emf.Comparator

import static org.junit.Assert.*
import CompanyLanguage.Employee
import java.util.List
import CompanyLanguage.CEO
import CompanyLanguage.Admin

class CompanyLanguageComparator implements Comparator<Company> {
	
	boolean checkAttributeValues
	
	EmployeeNormalizer employeeNormalizer
	CeoNormalizer ceoNormalizer
	AdminNormalizer adminNormalizer
	
	new (boolean checkAttributeValues){
		this.checkAttributeValues = checkAttributeValues
		
		employeeNormalizer = new EmployeeNormalizer(checkAttributeValues)
		ceoNormalizer = new CeoNormalizer(checkAttributeValues)
		adminNormalizer = new AdminNormalizer(checkAttributeValues)
	}
	
	override assertEquals(Company expected, Company actual) {
		assertTrue(stringify(expected).startsWith("Company"))
		assertEquals(stringify(expected), stringify(actual))
	}
	
	def stringify(Company company) {
		return '''
		Company {
			name = "«IF checkAttributeValues»«company.name»«ELSE»company«ENDIF»",
			employees = [
			«val List<Employee> sortedEmployeeList = new ArrayList<Employee>(company.employee)»
			«employeeNormalizer.normalize(sortedEmployeeList)»
			«FOR e : sortedEmployeeList SEPARATOR ", "»
				«employeeNormalizer.stringify(e)»
			«ENDFOR»
			]
			CEOs = [
			«val List<CEO> sortedCEOList = new ArrayList<CEO>(company.ceo)»
			«ceoNormalizer.normalize(sortedCEOList)»
			«FOR c : sortedCEOList SEPARATOR ", "»
				«ceoNormalizer.stringify(c)»
			«ENDFOR»
			]
			admins = [
			«val List<Admin> sortedAdminList = new ArrayList<Admin>(company.admin)»
			«adminNormalizer.normalize(sortedAdminList)»
			«FOR a : sortedAdminList SEPARATOR ", "»
				«adminNormalizer.stringify(a)»
			«ENDFOR»
			]
		}
		'''
	}
	
	
}
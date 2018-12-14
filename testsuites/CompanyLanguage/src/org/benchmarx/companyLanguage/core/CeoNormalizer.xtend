package org.benchmarx.companyLanguage.core

import java.util.List
import CompanyLanguage.Employee
import CompanyLanguage.CEO
import java.util.ArrayList

class CeoNormalizer extends Normalizer<CEO> {
	EmployeeNormalizer employeeNormalizer
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
		employeeNormalizer = new EmployeeNormalizer(checkAttributeValues)
	}

	
	override String stringify(CEO ceo) {
		'''
		CEO {
			name = "«IF checkAttributeValues»«ceo.name»«ELSE»ceo«ENDIF»"
			employees = [
									«val List<Employee> sortedEmployeeList = new ArrayList<Employee>(ceo.employee)»
									«employeeNormalizer.normalize(sortedEmployeeList)»
									«FOR e : sortedEmployeeList SEPARATOR ", "»
										«employeeNormalizer.stringify(e)»
									«ENDFOR»
			]
		}
		'''
	}
}
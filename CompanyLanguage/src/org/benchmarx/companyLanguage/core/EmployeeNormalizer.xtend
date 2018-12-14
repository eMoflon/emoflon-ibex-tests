package org.benchmarx.companyLanguage.core

import CompanyLanguage.Employee

class EmployeeNormalizer extends Normalizer<Employee> {
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
	}
	
	override String stringify(Employee employee) {
		'''
		Employee {
			name = "«IF checkAttributeValues»«employee.name»«ELSE»employee«ENDIF»"
		}
		'''
	}
}
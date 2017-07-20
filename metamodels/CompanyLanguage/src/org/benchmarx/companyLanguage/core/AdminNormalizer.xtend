package org.benchmarx.companyLanguage.core

import CompanyLanguage.Admin

class AdminNormalizer extends Normalizer<Admin> {
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
	}
	
	override String stringify(Admin admin) {
		'''
		Admin {
			name = "«IF checkAttributeValues»«admin.name»«ELSE»admin«ENDIF»",
			ceo = "«IF admin.ceo !== null»«IF checkAttributeValues»«admin.ceo.name»«ELSE»ceo«ENDIF»«ENDIF»",
		}
		'''
	}
}
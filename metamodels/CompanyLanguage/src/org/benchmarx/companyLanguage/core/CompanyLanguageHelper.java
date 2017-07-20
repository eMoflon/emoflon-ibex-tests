package org.benchmarx.companyLanguage.core;

import CompanyLanguage.Admin;
import CompanyLanguage.CEO;
import CompanyLanguage.Company;
import CompanyLanguage.CompanyLanguageFactory;
import CompanyLanguage.Employee;

public class CompanyLanguageHelper {

	public void createAdminForFirstCEO(Company c, String name) {
		CEO ceo = c.getCeo().get(0);
		Admin admin = CompanyLanguageFactory.eINSTANCE.createAdmin();
		c.getAdmin().add(admin);
		admin.setName(name);
		admin.setCeo(ceo);
	}

	public void createEmployeeForFirstCEO(Company c, String name) {
		CEO ceo = c.getCeo().get(0);
		Employee employee = CompanyLanguageFactory.eINSTANCE.createEmployee();
		c.getEmployee().add(employee);
		employee.setName(name);
		ceo.getEmployee().add(employee);
	}
}

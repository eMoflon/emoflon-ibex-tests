package testsuite.ibex.CompanyToIT.integrate;

import org.benchmarx.companyLanguage.core.CompanyLanguageHelper;
import org.benchmarx.itLanguage.core.ITLanguageHelper;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Ignore;
import org.junit.Test;

import CompanyLanguage.CEO;
import CompanyLanguage.Company;
import CompanyLanguage.CompanyLanguageFactory;
import CompanyLanguage.Employee;
import ITLanguage.IT;
import ITLanguage.ITLanguageFactory;
import ITLanguage.Laptop;
import testsuite.ibex.CompanyToIT.integrate.util.IntegIbexCompanyToIT;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class Basic extends IntegrateTestCase<Company, IT> {

	public final static String projectName = "CompanyToIT";

	CompanyLanguageHelper helperCompany;
	ITLanguageHelper helperIT;

	public Basic() {
		super(new IntegIbexCompanyToIT(projectName));
	}

	@Override
	protected void initHelpers() {
		helperCompany = new CompanyLanguageHelper();
		helperIT = new ITLanguageHelper();
	}

	@Override
	protected String getProjectName() {
		return projectName;
	}

	@Ignore
	@Test
	public void filterNACViolation() {
		tool.applyAndIntegrateDelta((c, it) -> {
			// src:
			CEO ceo = CompanyLanguageFactory.eINSTANCE.createCEO();
			ceo.setName("SecondCEO");
			c.getCeo().add(ceo);
			ceo.getEmployee().add(c.getEmployee().get(0));
		});
	}

	@Ignore
	@Test
	public void modelChanges() {
		tool.applyAndIntegrateDelta((c, it) -> {
			c.getAdmin().get(0).setCeo(null);
			c.setName("");
		});
	}

	@Test
	public void inconsDomainChangesConflict() {
		tool.applyAndIntegrateDelta((c, it) -> {
			Employee newEmployee = CompanyLanguageFactory.eINSTANCE.createEmployee();
			newEmployee.setName("Dominique");
			c.getEmployee().add(newEmployee);

			EcoreUtil.delete(it.getRouter().get(0));
		});
		
	}

	@Test
	public void delPreserveEdgeConflict() {
		tool.applyAndIntegrateDelta((c, it) -> {
			EcoreUtil.delete(c.getAdmin().get(0));

			Laptop laptop = ITLanguageFactory.eINSTANCE.createLaptop();
			laptop.setName("Dominique");
			it.getNetwork().get(0).getLaptop().add(laptop);
		});
		String prefix = "/integ/basic/expected/delete_preserve_edge_conflict/";
		assertCondition(prefix + "src", prefix + "trg", prefix + "corr");
	}
	
	@Test
	public void delPreserveAttributeConflict() {
		tool.applyAndIntegrateDelta((c, it) -> {
			EcoreUtil.delete(c.getAdmin().get(0));
			it.getNetwork().get(0).getLaptop().get(0).setName("Dominique");
		});

		String prefix = "/integ/basic/expected/delete_preserve_attribute_conflict/";
		assertCondition(prefix + "src", prefix + "trg", prefix + "corr");
	}

	@Test
	public void contradictingChangesConflict() {
		tool.applyAndIntegrateDelta((c, it) -> {
			EcoreUtil.delete(c.getAdmin().get(0));

			Laptop laptop = ITLanguageFactory.eINSTANCE.createLaptop();
			laptop.setName("Dominique");
			it.getNetwork().get(0).getLaptop().add(laptop);
		});
	}
}

package testsuite.ibex.CompanyToIT.integrate;

import org.benchmarx.companyLanguage.core.CompanyLanguageHelper;
import org.benchmarx.itLanguage.core.ITLanguageHelper;
import org.junit.Ignore;
import org.junit.Test;

import CompanyLanguage.CEO;
import CompanyLanguage.Company;
import CompanyLanguage.CompanyLanguageFactory;
import ITLanguage.IT;
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

}

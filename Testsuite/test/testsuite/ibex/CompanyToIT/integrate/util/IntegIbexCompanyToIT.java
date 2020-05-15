package testsuite.ibex.CompanyToIT.integrate.util;

import java.io.IOException;

import org.benchmarx.companyLanguage.core.CompanyLanguageComparator;
import org.benchmarx.itLanguage.core.ITLanguageComparator;
import org.emoflon.ibex.tgg.run.companytoit.INTEGRATE_App;

import CompanyLanguage.Company;
import ITLanguage.IT;
import testsuite.ibex.testUtil.IntegIbexAdapter;

public class IntegIbexCompanyToIT extends IntegIbexAdapter<Company, IT> {

	public IntegIbexCompanyToIT(String projectName) {
		super(new CompanyLanguageComparator(true), new ITLanguageComparator(true), new CompanyToITCorrComp(), projectName);
	}

	@Override
	public void initiateIntegrationDialogue() {
		try {
			integrator = new INTEGRATE_App(projectName,
					testsuite.ibex.performance.util.PerformanceConstants.workspacePath, "/resources/integ/basic/in", ilpSolver, false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

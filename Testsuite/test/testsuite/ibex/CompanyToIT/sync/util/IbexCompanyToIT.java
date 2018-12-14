package testsuite.ibex.CompanyToIT.sync.util;

import java.io.IOException;

import org.benchmarx.companyLanguage.core.CompanyLanguageComparator;
import org.benchmarx.itLanguage.core.ITLanguageComparator;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.companytoit.SYNC_App;

import CompanyLanguage.CEO;
import CompanyLanguage.Company;
import CompanyLanguage.CompanyLanguageFactory;
import ITLanguage.IT;
import testsuite.ibex.testUtil.IbexAdapter;

/**
 * This class implements the bx tool interface for eMoflon::Ibex, which is
 * structural-delta-based and corr-based.
 * 
 * 
 * @author anthony anjorin
 */
public class IbexCompanyToIT extends IbexAdapter<Company, IT>  {
	
	public IbexCompanyToIT(String projectName) {
		super(new CompanyLanguageComparator(true), new ITLanguageComparator(true), projectName);
	}
	
	@Override
	public void initiateSynchronisationDialogue() {
		try {
			synchroniser = new SYNC_App(projectName, testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false);
			
			Company company = CompanyLanguageFactory.eINSTANCE.createCompany();
			company.setName("ES");
			CEO ceo = CompanyLanguageFactory.eINSTANCE.createCEO();
			company.getCeo().add(ceo);
			ceo.setName("Andy");
			
			synchroniser.getSourceResource().getContents().add(company);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public SYNC getSYNC() {
		return synchroniser;
	}
}

package testsuite.ibex.FamiliesToPersons_V1.sync.util;

import java.io.IOException;

import org.benchmarx.simplefamilies.core.FamiliesComparator;
import org.benchmarx.simplepersons.core.PersonsComparator;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.familiestopersons_v1.SYNC_App;
import org.emoflon.ibex.tgg.run.familiestopersons_v1.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.familiestopersons_v1.config.HiPERegistrationHelper;

import SimpleFamilies.FamilyRegister;
import SimpleFamilies.SimpleFamiliesFactory;
import SimplePersons.PersonRegister;
import testsuite.ibex.testUtil.IbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;

/**
 * This class implements the bx tool interface for eMoflon::Ibex, which is
 * structural-delta-based and corr-based.
 * 
 * 
 * @author anthony anjorin
 */
public class IbexSimpleFamiliesToPersons extends IbexAdapter<FamilyRegister, PersonRegister>   {

	public IbexSimpleFamiliesToPersons(String projectName) {
		super(new FamiliesComparator(), new PersonsComparator(), projectName);
	}
	
	@Override
	public void initiateSynchronisationDialogue() {
		try {
			SYNC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper(), new HiPERegistrationHelper()});
			synchroniser = new SYNC_App(projectName, testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false);
			
			FamilyRegister reg = SimpleFamiliesFactory.eINSTANCE.createFamilyRegister();
			synchroniser.getResourceHandler().getSourceResource().getContents().add(reg);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

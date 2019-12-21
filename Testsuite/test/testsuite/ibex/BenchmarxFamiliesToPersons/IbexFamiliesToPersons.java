package testsuite.ibex.BenchmarxFamiliesToPersons;

import java.io.IOException;

import org.benchmarx.Configurator;
import org.benchmarx.families.core.FamiliesComparator;
import org.benchmarx.persons.core.PersonsComparator;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.benchmarxfamiliestopersons.SYNC_App;
import org.emoflon.ibex.tgg.run.benchmarxfamiliestopersons.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.benchmarxfamiliestopersons.config.HiPERegistrationHelper;

import Families.FamiliesFactory;
import Families.FamilyRegister;
import Persons.PersonRegister;
import testsuite.ibex.testUtil.Decisions;
import testsuite.ibex.testUtil.IbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class IbexFamiliesToPersons extends IbexAdapter<FamilyRegister, PersonRegister>{

	public IbexFamiliesToPersons(String projectName) {
		super(new FamiliesComparator(), new PersonsComparator(), projectName);
	}
	
	@Override
	public void initiateSynchronisationDialogue() {
		try {
			SYNC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper(), new HiPERegistrationHelper()});
			synchroniser = new SYNC_App(projectName, testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false);
			FamilyRegister familiesRoot = FamiliesFactory.eINSTANCE.createFamilyRegister();
			synchroniser.getResourceHandler().getSourceResource().getContents().add(familiesRoot);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void setConfigurator(Configurator<Decisions> configurator) {
		super.setConfigurator(configurator);
		synchroniser.setUpdatePolicy(new FamiliesToPersonsUpdatePolicy(configurator));
	}

}

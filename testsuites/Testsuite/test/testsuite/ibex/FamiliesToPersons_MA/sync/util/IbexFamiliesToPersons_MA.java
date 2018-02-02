package testsuite.ibex.FamiliesToPersons_MA.sync.util;

import java.io.IOException;

import org.benchmarx.Configurator;
import org.benchmarx.families.core.FamiliesComparator;
import org.benchmarx.persons.core.PersonsComparator;
import org.emoflon.ibex.tgg.run.familiestopersons_ma.SYNC_App;

import Families.FamiliesFactory;
import Families.FamilyRegister;
import Persons.PersonRegister;
import testsuite.ibex.testUtil.Decisions;
import testsuite.ibex.testUtil.IbexAdapter;

public class IbexFamiliesToPersons_MA extends IbexAdapter<FamilyRegister, PersonRegister>{

	public IbexFamiliesToPersons_MA(String projectName) {
		super(new FamiliesComparator(), new PersonsComparator(), projectName);
	}
	
	@Override
	public void initiateSynchronisationDialogue() {
		try {
			synchroniser = new SYNC_App(projectName, testsuite.ibex.testUtil.Constants.workspacePath, false);
			FamilyRegister familiesRoot = FamiliesFactory.eINSTANCE.createFamilyRegister();
			synchroniser.getSourceResource().getContents().add(familiesRoot);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void setConfigurator(Configurator<Decisions> configurator) {
		super.setConfigurator(configurator);
		
		synchroniser.setUpdatePolicy(new F2PUpdatePolicy(configurator));
	}

}

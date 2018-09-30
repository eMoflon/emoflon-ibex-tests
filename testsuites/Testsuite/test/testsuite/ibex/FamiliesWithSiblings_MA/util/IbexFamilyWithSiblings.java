package testsuite.ibex.FamiliesWithSiblings_MA.util;

import java.io.IOException;

import org.benchmarx.Configurator;
import org.benchmarx.familiessiblings.core.FamiliesComparator;
import org.benchmarx.persons.core.PersonsComparator;
import org.emoflon.ibex.tgg.run.familywithsiblingstopersons_ma.SYNC_App;

import FamiliesWithSiblings.FamiliesWithSiblingsFactory;
import FamiliesWithSiblings.FamilyRegister;
import Persons.PersonRegister;
import testsuite.ibex.FamiliesToPersons_MA.sync.util.F2PUpdatePolicy;
import testsuite.ibex.testUtil.Decisions;
import testsuite.ibex.testUtil.IbexAdapter;

public class IbexFamilyWithSiblings extends IbexAdapter<FamilyRegister, PersonRegister> {

	public IbexFamilyWithSiblings(String projectName) {
		super(new FamiliesComparator(), new PersonsComparator(), projectName);
	}

	@Override
	public void initiateSynchronisationDialogue() {
		try {
			synchroniser = new SYNC_App(projectName, testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false);

			FamilyRegister reg = FamiliesWithSiblingsFactory.eINSTANCE.createFamilyRegister();
			synchroniser.getSourceResource().getContents().add(reg);
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

package testsuite1.FamiliesToPersons_V1.sync.util;

import java.io.IOException;

import org.benchmarx.families.core.FamiliesComparator;
import org.benchmarx.persons.core.PersonsComparator;
import org.emoflon.ibex.tgg.run.familiestopersons_v1.SYNC_App;

import SimpleFamilies.FamilyRegister;
import SimpleFamilies.SimpleFamiliesFactory;
import SimplePersons.PersonRegister;
import testsuite1.testUtil.IbexAdapter;

/**
 * This class implements the bx tool interface for eMoflon::Ibex, which is
 * structural-delta-based and corr-based.
 * 
 * 
 * @author anthony anjorin
 */
public class IbexSimpleFamiliesToPersons extends IbexAdapter<FamilyRegister, PersonRegister>   {

	public IbexSimpleFamiliesToPersons(boolean flatten, String projectName) {
		super(new FamiliesComparator(), new PersonsComparator(), flatten, projectName);
	}
	
	@Override
	public void initiateSynchronisationDialogue() {
		try {
			synchroniser = new SYNC_App(projectName, testsuite1.testUtil.Constants.workspacePath, flatten, false);
			
			FamilyRegister reg = SimpleFamiliesFactory.eINSTANCE.createFamilyRegister();
			synchroniser.getSourceResource().getContents().add(reg);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

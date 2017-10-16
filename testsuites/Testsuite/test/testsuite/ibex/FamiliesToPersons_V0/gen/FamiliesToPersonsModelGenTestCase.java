
package testsuite.ibex.FamiliesToPersons_V0.gen;

import java.io.IOException;

import org.benchmarx.simplefamilies.core.FamiliesComparator;
import org.benchmarx.simplepersons.core.PersonsComparator;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.familiestopersons_v0.MODELGEN_App;
import org.junit.Before;

import SimpleFamilies.FamilyRegister;
import SimplePersons.PersonRegister;
import language.TGGRule;
import testsuite.ibex.testUtil.ModelGenTestCase;

public abstract class FamiliesToPersonsModelGenTestCase extends ModelGenTestCase<FamilyRegister, PersonRegister>{

	@Override
	protected String getProjectName() {
		return "FamiliesToPersons_V0";
	}
	
	@Before
	public void createGenerator() throws IOException {
		generator = new MODELGEN_App(getProjectName(), testsuite.ibex.testUtil.Constants.workspacePath, false);
		stop = new MODELGENStopCriterion(generator.getTGG());
		
		for (TGGRule rule : generator.getTGG().getRules()) {
			stop.setMaxRuleCount(rule.getName(), 0);
		}
		
		sourceComp = new FamiliesComparator();
		targetComp = new PersonsComparator();
	}
}

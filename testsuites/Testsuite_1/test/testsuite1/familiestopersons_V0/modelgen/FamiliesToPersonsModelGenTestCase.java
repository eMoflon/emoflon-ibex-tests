
package testsuite1.familiestopersons_V0.modelgen;

import java.io.IOException;

import org.benchmarx.families.core.FamiliesComparator;
import org.benchmarx.persons.core.PersonsComparator;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.familiestopersons_v0.MODELGEN_App;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import SimpleFamilies.FamilyRegister;
import SimplePersons.PersonRegister;
import language.TGGRule;
import testsuite1.testUtil.ModelGenTestCase;

@RunWith(Parameterized.class)
public abstract class FamiliesToPersonsModelGenTestCase extends ModelGenTestCase<FamilyRegister, PersonRegister>{

	public FamiliesToPersonsModelGenTestCase(boolean flatten) {
		super(flatten);
	}
	
	@Override
	protected String getProjectName() {
		return "FamiliesToPersons_V0";
	}
	
	@Before
	public void createGenerator() throws IOException {
		generator = new MODELGEN_App(getProjectName(), testsuite1.testUtil.Constants.workspacePath, flatten, false);
		stop = new MODELGENStopCriterion(generator.getTGG());
		
		for (TGGRule rule : generator.getTGG().getRules()) {
			stop.setMaxRuleCount(rule.getName(), 0);
		}
		
		sourceComp = new FamiliesComparator();
		targetComp = new PersonsComparator();
	}
}

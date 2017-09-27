package testsuite.ibex.FamiliesToPersons_MA.gen;

import java.io.IOException;

import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.familiestopersons_ma.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.benchmarx.families.core.FamiliesComparator;
import org.benchmarx.persons.core.PersonsComparator;

import Families.FamilyRegister;
import Persons.PersonRegister;
import language.TGGRule;
import testsuite.ibex.testUtil.ModelGenTestCase;

public class SimpleModelgenTest extends ModelGenTestCase<FamilyRegister, PersonRegister>{
	
	
	@Override
	protected String getProjectName() {
		return "FamiliesToPersons_MA";
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
	
	@Test
	public void testOneRoot() throws IOException {
		stop.setMaxRuleCount("Families2Persons", 1);
		runGenerator(stop);
		assertPostcondition("RootElementFamilies", "RootElementPersons");
	}
	
	@Test
	public void testEmptyFamily() throws IOException {
		stop.setMaxRuleCount("Families2Persons", 1);
		stop.setMaxRuleCount("CreateFamily", 1);
		// TODO:  configure update policy to allow no complement rule applications
		runGenerator(stop);
		assertPostcondition("OneFamily", "RootElementPersons");
	}
	
	@Ignore("Fails due to maximality.")
	@Test
	public void testCreateWholeSimpsonFamily() throws IOException {
		stop.setMaxRuleCount("Families2Persons", 1);
		stop.setMaxRuleCount("CreateFamily", 1);
		// TODO:  configure update policy to allow required number of complement rule applications
		runGenerator(stop);
		assertPostcondition("OneFamilyWithFatherMotherSonTwoDaughters", "PersonTwoMaleThreeFemale");
	}

}

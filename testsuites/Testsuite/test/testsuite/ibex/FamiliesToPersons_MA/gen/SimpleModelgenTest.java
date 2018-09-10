package testsuite.ibex.FamiliesToPersons_MA.gen;

import java.io.IOException;

import org.benchmarx.families.core.FamiliesComparator;
import org.benchmarx.persons.core.PersonsComparator;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.operational.updatepolicy.RandomMatchUpdatePolicy;
import org.emoflon.ibex.tgg.operational.updatepolicy.UpdatePolicy;
import org.emoflon.ibex.tgg.run.familiestopersons_ma.MODELGEN_App;
import org.junit.Before;
import org.junit.Test;

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
		generator = new MODELGEN_App(getProjectName(), testsuite.ibex.testUtil.Constants.workspacePath, true);
		stop = new MODELGENStopCriterion(generator.getTGG());
		
		for (TGGRule rule : generator.getTGG().getRules()) {
			stop.setMaxRuleCount(rule.getName(), 0);
		}
		
		sourceComp = new FamiliesComparator(false);
		targetComp = new PersonsComparator(false);
	}
	
	@Test
	public void testOneRoot() throws IOException {
		stop.setMaxRuleCount("Families2Persons", 1);
		runGenerator(stop);
		assertPostcondition("01_RootElementFamilies", "01_RootElementPersons");
	}
	
	@Test
	public void testEmptyFamily() throws IOException {
		stop.setMaxRuleCount("Families2Persons", 1);
		stop.setMaxRuleCount("CreateFamily", 1);
		runGenerator(stop);
		assertPostcondition("01_OneFamily", "01_RootElementPersons");
	}
	
	@Test
	public void testOneFather() throws IOException {
		stop.setMaxRuleCount("Families2Persons", 1);
		stop.setMaxRuleCount("CreateFamily", 1);
		UpdatePolicy newUP = new RandomMatchUpdatePolicy();
		newUP.setBoundForComplementRule("Father2Male", 1, true);
		generator.setUpdatePolicy(newUP);
		runGenerator(stop);
		assertPostcondition("01_Family_Father", "01_Person_Male");
	}
	
	@Test
	public void testOneFatherTwoDaughters() throws IOException {
		stop.setMaxRuleCount("Families2Persons", 1);
		stop.setMaxRuleCount("CreateFamily", 1);
		UpdatePolicy newUP = new RandomMatchUpdatePolicy();
		newUP.setBoundForComplementRule("Father2Male", 1, true);
		newUP.setBoundForComplementRule("Daughter2Female", 2, true);
		generator.setUpdatePolicy(newUP);
		runGenerator(stop);
		assertPostcondition("01_Family_FatherTwoDaughters", "01_Person_MaleTwoFemale");
	}
	
	@Test
	public void testFatherMotherSonTwoDaugthers() throws IOException {
		stop.setMaxRuleCount("Families2Persons", 1);
		stop.setMaxRuleCount("CreateFamily", 1);
		UpdatePolicy newUP = new RandomMatchUpdatePolicy();
		newUP.setBoundForComplementRule("Father2Male", 1, true);
		newUP.setBoundForComplementRule("Mother2Female", 1, true);
		newUP.setBoundForComplementRule("Son2Male", 1, true);
		newUP.setBoundForComplementRule("Daughter2Female", 2, true);
		generator.setUpdatePolicy(newUP);
		runGenerator(stop);
		assertPostcondition("01_Family_FatherMotherSonTwoDaughters", "01_Person_TwoMaleThreeFemale");
	}
	
	@Test
	public void testViolationOfUpperBoundFather() throws IOException {
		stop.setMaxRuleCount("Families2Persons", 1);
		stop.setMaxRuleCount("CreateFamily", 1);
		UpdatePolicy newUP = new RandomMatchUpdatePolicy();
		newUP.setBoundForComplementRule("Father2Male", 2, true);
		generator.setUpdatePolicy(newUP);
		runGenerator(stop);
		assertPostcondition("01_Family_Father", "01_Person_Male");
	}
}
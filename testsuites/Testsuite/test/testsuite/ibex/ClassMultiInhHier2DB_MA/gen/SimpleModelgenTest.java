package testsuite.ibex.ClassMultiInhHier2DB_MA.gen;

import java.io.IOException;

import org.benchmarx.classMultipleInheritanceHierarchy.core.ClassMultipleIhneritanceHierarchyComparator;
import org.benchmarx.database.core.DatabaseComparator;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.classmultipleinhhier2db_ma.MODELGEN_App;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import Database.DB;
import classMultipleInheritanceHierarchy.ClassPackage;
import language.TGGRule;
import testsuite.ibex.testUtil.ModelGenTestCase;

public class SimpleModelgenTest extends ModelGenTestCase<ClassPackage, DB>{
	
	@Override
	protected String getProjectName() {
		return "ClassMultipleInhHier2DB_MA";
	}
	
	@Before
	public void createGenerator() throws IOException {
		generator = new MODELGEN_App(getProjectName(), testsuite.ibex.testUtil.Constants.workspacePath, false);
		stop = new MODELGENStopCriterion(generator.getTGG());
		
		for (TGGRule rule : generator.getTGG().getRules()) {
			stop.setMaxRuleCount(rule.getName(), 0);
		}
		
		sourceComp = new ClassMultipleIhneritanceHierarchyComparator(false);
		targetComp = new DatabaseComparator(false);
	}
	
	@Test
	public void testPackageToDatabase() throws IOException {
		stop.setMaxRuleCount("PackageToDatabase", 1);
		runGenerator(stop);
		assertPostcondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
	}
	
	@Test
	public void testClassToTable() throws IOException {
		stop.setMaxRuleCount("PackageToDatabase", 1);
		stop.setMaxRuleCount("ClassToTable", 1);
		runGenerator(stop);
		assertPostcondition("in/ClassToTable_FWD", "expected/ClassToTable_FWD");
	}
	
	@Test
	public void testAttributeToColumn() throws IOException {
		stop.setMaxRuleCount("PackageToDatabase", 1);
		stop.setMaxRuleCount("ClassToTable", 1);
		stop.setMaxRuleCount("AttributeToColumn", 2);
		runGenerator(stop);
		assertPostcondition("in/AttributeToColumn_FWD", "expected/AttributeToColumn_FWD");
	}
	
	@Test
	public void testSubClassToTable() throws IOException {
		stop.setMaxRuleCount("PackageToDatabase", 1);
		stop.setMaxRuleCount("ClassToTable", 2);
		stop.setMaxRuleCount("SubClassToTable", 1);
		runGenerator(stop);
		assertPostcondition("in/SubClassToTable_FWD", "expected/SubClassToTable_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSuperAttToSubTable() throws IOException {

			stop.setMaxRuleCount("PackageToDatabase", 1);
			stop.setMaxRuleCount("ClassToTable", 2);
			stop.setMaxRuleCount("AttributeToColumn", 1);
			stop.setMaxRuleCount("SubClassToTable", 1);
			// TODO [Milica]: create update policy to ensure that SuperClass gets attribute first
			runGenerator(stop);
			assertPostcondition("in/SuperAttToSubTable_FWD", "expected/SuperAttToSubTable_FWD");
			
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSubAttToSubTable() throws IOException {

			stop.setMaxRuleCount("PackageToDatabase", 1);
			stop.setMaxRuleCount("ClassToTable", 2);
			stop.setMaxRuleCount("AttributeToColumn", 2);
			stop.setMaxRuleCount("SubClassToTable", 1);
			//generator.setUpdatePolicy();
			runGenerator(stop);
			assertPostcondition("in/SubAttToSubTable_FWD", "expected/SubAttToSubTable_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testTransitiveAttToSubTables() throws IOException {

			stop.setMaxRuleCount("PackageToDatabase", 1);
			stop.setMaxRuleCount("ClassToTable", 3);
			stop.setMaxRuleCount("AttributeToColumn", 1);
			stop.setMaxRuleCount("SubClassToTable", 2);
			//generator.setUpdatePolicy(new CreateAttributesUpdatePolicy());
			runGenerator(stop);
			assertPostcondition("in/SuperSuperClassToSubTable_FWD", "expected/SuperSuperClassToSubTable_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testTwoSuperClassesToSubTables() throws IOException {

			stop.setMaxRuleCount("PackageToDatabase", 1);
			stop.setMaxRuleCount("ClassToTable", 3);
			stop.setMaxRuleCount("AttributeToColumn", 2);
			stop.setMaxRuleCount("SubClassToTable", 2);
			//generator.setUpdatePolicy(new CreateAttributesUpdatePolicy());
			runGenerator(stop);
			assertPostcondition("in/TwoSuperClassesToSubTable_FWD", "expected/TwoSuperClassesToSubTable_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testTwoTransitiveSuperClassesToSubTables() throws IOException {

			stop.setMaxRuleCount("PackageToDatabase", 1);
			stop.setMaxRuleCount("ClassToTable", 5);
			stop.setMaxRuleCount("AttributeToColumn", 4);
			stop.setMaxRuleCount("SubClassToTable", 4);
			//generator.setUpdatePolicy(new CreateAttributesUpdatePolicy());
			runGenerator(stop);
			assertPostcondition("in/TwoTransitiveSuperClassesToSubTable_FWD", "expected/TwoTransitiveSuperClassesToSubTable_FWD");
	}

}

package testsuite.ibex.ClassInhHier2DB_MA.gen;

import java.io.IOException;

import org.benchmarx.classInheritanceHierarchy.core.ClassInheritanceHierarchyComparator;
import org.benchmarx.database.core.DatabaseComparator;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import ClassInheritanceHierarchy.ClassPackage;
import Database.DB;
import language.TGGRule;
import testsuite.ibex.testUtil.ModelGenTestCase;
import org.emoflon.ibex.tgg.run.classinhhier2db_ma.MODELGEN_App;

public class SimpleModelgenTest extends ModelGenTestCase<ClassPackage, DB>{
	
	@Override
	protected String getProjectName() {
		return "ClassInhHier2DB_MA";
	}
	
	@Before
	public void createGenerator() throws IOException {
		generator = new MODELGEN_App(getProjectName(), testsuite.ibex.testUtil.Constants.workspacePath, false);
		stop = new MODELGENStopCriterion(generator.getTGG());
		
		for (TGGRule rule : generator.getTGG().getRules()) {
			stop.setMaxRuleCount(rule.getName(), 0);
		}
		
		sourceComp = new ClassInheritanceHierarchyComparator(false);
		targetComp = new DatabaseComparator(false);
	}
	
	@Test
	public void testPackageToDatabase() throws IOException {
		stop.setMaxRuleCount("PackageToDatabaseRule", 1);
		runGenerator(stop);
		assertPostcondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
	}
	
	@Test
	public void testClassToTable() throws IOException {
		stop.setMaxRuleCount("PackageToDatabaseRule", 1);
		stop.setMaxRuleCount("ClassToTableRule", 1);
		runGenerator(stop);
		assertPostcondition("in/ClassToTable_FWD", "expected/ClassToTable_FWD");
	}
	
	@Test
	public void testAttributeToColumn() throws IOException {
		stop.setMaxRuleCount("PackageToDatabaseRule", 1);
		stop.setMaxRuleCount("ClassToTableRule", 1);
		stop.setMaxRuleCount("AttributeToColumnRule", 2);
		runGenerator(stop);
		assertPostcondition("in/AttributeToColumn_FWD", "expected/AttributeToColumn_FWD");
	}
	
	@Test
	public void testSubClassToTable() throws IOException {
		stop.setMaxRuleCount("PackageToDatabaseRule", 1);
		stop.setMaxRuleCount("ClassToTableRule", 1);
		stop.setMaxRuleCount("SubClassToTable", 1);
		runGenerator(stop);
		assertPostcondition("in/SubClassToTable_FWD", "expected/SubClassToTable_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSuperAttToSubTable() throws IOException {

			stop.setMaxRuleCount("PackageToDatabaseRule", 1);
			stop.setMaxRuleCount("ClassToTableRule", 1);
			stop.setMaxRuleCount("AttributeToColumnRule", 1);
			stop.setMaxRuleCount("SubClassToTable", 1);
			generator.setUpdatePolicy(new CreateAttributesUpdatePolicy());
			runGenerator(stop);
			assertPostcondition("in/SuperAttToSubTable_FWD", "expected/SuperAttToSubTable_FWD");
			
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSubAttToSubTable() throws IOException {

			stop.setMaxRuleCount("PackageToDatabaseRule", 1);
			stop.setMaxRuleCount("ClassToTableRule", 1);
			stop.setMaxRuleCount("AttributeToColumnRule", 2);
			stop.setMaxRuleCount("SubClassToTable", 1);
			generator.setUpdatePolicy(new CreateAttributesUpdatePolicy());
			runGenerator(stop);
			assertPostcondition("in/SubAttToSubTable_FWD", "expected/SubAttToSubTable_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSubAttToSubTable2() throws IOException {

			stop.setMaxRuleCount("PackageToDatabaseRule", 1);
			stop.setMaxRuleCount("ClassToTableRule", 1);
			stop.setMaxRuleCount("AttributeToColumnRule", 3);
			stop.setMaxRuleCount("SubClassToTable", 1);
			generator.setUpdatePolicy(new CreateAttributesUpdatePolicy());
			runGenerator(stop);
			assertPostcondition("in/SubAttToSubTable2_FWD", "expected/SubAttToSubTable2_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testTransitiveAttToSubTables() throws IOException {

			stop.setMaxRuleCount("PackageToDatabaseRule", 1);
			stop.setMaxRuleCount("ClassToTableRule", 1);
			stop.setMaxRuleCount("AttributeToColumnRule", 1);
			stop.setMaxRuleCount("SubClassToTable", 2);
			generator.setUpdatePolicy(new CreateAttributesUpdatePolicy());
			runGenerator(stop);
			assertPostcondition("in/SuperSuperClassToSubTable_FWD", "expected/SuperSuperClassToSubTable_FWD");
	}

}

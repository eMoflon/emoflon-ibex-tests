package testsuite.ibex.ClassInhHier2DB_MA.gen;

import java.io.IOException;

import org.benchmarx.classInheritanceHierarchy.core.ClassInheritanceHierarchyComparator;
import org.benchmarx.database.core.DatabaseComparator;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.classinhhier2db_ma.MODELGEN_App;
import org.junit.Before;
import org.junit.Test;

import ClassInheritanceHierarchy.ClassPackage;
import Database.DB;
import language.TGGRule;
import testsuite.ibex.testUtil.ModelGenTestCase;

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
		assertPostcondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
	}
	
	@Test
	public void testClassToTable() throws IOException {
		stop.setMaxRuleCount("PackageToDatabaseRule", 1);
		stop.setMaxRuleCount("ClassToTableRule", 1);
		runGenerator(stop);
		assertPostcondition("in/02_ClassToTable_FWD", "expected/02_ClassToTable_FWD");
	}
	
	@Test
	public void testAttributeToColumn() throws IOException {
		stop.setMaxRuleCount("PackageToDatabaseRule", 1);
		stop.setMaxRuleCount("ClassToTableRule", 1);
		stop.setMaxRuleCount("AttributeToColumnRule", 2);
		runGenerator(stop);
		assertPostcondition("in/03_AttributeToColumn_FWD", "expected/03_AttributeToColumn_FWD");
	}
	
	@Test
	public void testSubClassToTable() throws IOException {
		stop.setMaxRuleCount("PackageToDatabaseRule", 1);
		stop.setMaxRuleCount("ClassToTableRule", 1);
		stop.setMaxRuleCount("SubClassToTable", 1);
		runGenerator(stop);
		assertPostcondition("in/04_SubClassToTable_FWD", "expected/04_SubClassToTable_FWD");
	}
	
	@Test
	public void testSuperAttToSubTable() throws IOException {
			stop.setMaxRuleCount("PackageToDatabaseRule", 1);
			stop.setMaxRuleCount("ClassToTableRule", 1);
			stop.setMaxRuleCount("AttributeToColumnRule", 1);
			stop.setMaxRuleCount("SubClassToTable", 1);
			generator.setUpdatePolicy(new CreateAttributesUpdatePolicy());
			runGenerator(stop);
			assertPostcondition("in/05_OneSuperAtt_FWD", "expected/05_OneSuperAtt_FWD");
			
	}
	
	@Test
	public void testSubAttToSubTable() throws IOException {
			stop.setMaxRuleCount("PackageToDatabaseRule", 1);
			stop.setMaxRuleCount("ClassToTableRule", 1);
			stop.setMaxRuleCount("AttributeToColumnRule", 2);
			stop.setMaxRuleCount("SubClassToTable", 1);
			generator.setUpdatePolicy(new CreateAttributesUpdatePolicy());
			runGenerator(stop);
			assertPostcondition("in/06_OneSuperAtt_OneSubAtt_FWD", "expected/06_OneSuperAtt_OneSubAtt_FWD");
	}
	
	@Test
	public void testSubAttToSubTable2() throws IOException {
			stop.setMaxRuleCount("PackageToDatabaseRule", 1);
			stop.setMaxRuleCount("ClassToTableRule", 1);
			stop.setMaxRuleCount("AttributeToColumnRule", 3);
			stop.setMaxRuleCount("SubClassToTable", 1);
			generator.setUpdatePolicy(new CreateAttributesUpdatePolicy());
			runGenerator(stop);
			assertPostcondition("in/07_OneSuperAtt_TwoSubAtt_FWD", "expected/07_OneSuperAtt_TwoSubAtt_FWD");
	}
	
	@Test
	public void testTransitiveAttToSubTables() throws IOException {
			stop.setMaxRuleCount("PackageToDatabaseRule", 1);
			stop.setMaxRuleCount("ClassToTableRule", 1);
			stop.setMaxRuleCount("AttributeToColumnRule", 1);
			stop.setMaxRuleCount("SubClassToTable", 2);
			generator.setUpdatePolicy(new CreateAttributesUpdatePolicy());
			runGenerator(stop);
			assertPostcondition("in/09_OneSuperSuperAtt_FWD", "expected/09_OneSuperSuperAtt_FWD");
	}

}

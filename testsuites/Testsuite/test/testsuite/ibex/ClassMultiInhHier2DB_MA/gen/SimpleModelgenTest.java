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
		generator = new MODELGEN_App(getProjectName(), testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false);
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
		assertPostcondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
	}
	
	@Test
	public void testClassToTable() throws IOException {
		stop.setMaxRuleCount("PackageToDatabase", 1);
		stop.setMaxRuleCount("ClassToTable", 1);
		runGenerator(stop);
		assertPostcondition("in/02_ClassToTable_FWD", "expected/02_ClassToTable_FWD");
	}
	
	@Test
	public void testAttributeToColumn() throws IOException {
		stop.setMaxRuleCount("PackageToDatabase", 1);
		stop.setMaxRuleCount("ClassToTable", 1);
		stop.setMaxRuleCount("AttributeToColumn", 2);
		runGenerator(stop);
		assertPostcondition("in/03_AttributeToColumn_FWD", "expected/03_AttributeToColumn_FWD");
	}
	
	@Test
	public void testSubClassToTable() throws IOException {
		stop.setMaxRuleCount("PackageToDatabase", 1);
		stop.setMaxRuleCount("ClassToTable", 2);
		stop.setMaxRuleCount("SubClassToTable", 1);
		runGenerator(stop);
		assertPostcondition("in/04_SubClassToTable_FWD", "expected/04_SubClassToTable_FWD");
	}
	
	@Test
	public void testSuperAttToSubTable() throws IOException {
			stop.setMaxRuleCount("PackageToDatabase", 1);
			stop.setMaxRuleCount("ClassToTable", 2);
			stop.setMaxRuleCount("AttributeToColumn", 1);
			stop.setMaxRuleCount("SubClassToTable", 1);
			generator.setUpdatePolicy(new CreateAttributesUpdatePolicy());
			runGenerator(stop);
			assertPostcondition("in/05_OneSuperAtt_FWD", "expected/05_OneSuperAtt_FWD");
			
	}
	
	@Test
	public void testSubAttToSubTable() throws IOException {
			stop.setMaxRuleCount("PackageToDatabase", 1);
			stop.setMaxRuleCount("ClassToTable", 2);
			stop.setMaxRuleCount("AttributeToColumn", 2);
			stop.setMaxRuleCount("SubClassToTable", 1);
			generator.setUpdatePolicy(new CreateAttributesUpdatePolicy());
			runGenerator(stop);
			assertPostcondition("in/06_OneSuperAtt_OneSubAtt_FWD", "expected/06_OneSuperAtt_OneSubAtt_FWD");
	}
	
	@Ignore("Can be re-enabled after consolidation of GT and TGG")
	@Test
	public void testTransitiveAttToSubTables() throws IOException {
			stop.setMaxRuleCount("PackageToDatabase", 1);
			stop.setMaxRuleCount("ClassToTable", 3);
			stop.setMaxRuleCount("AttributeToColumn", 1);
			stop.setMaxRuleCount("SubClassToTable", 2);
			generator.setUpdatePolicy(new CreateSingleTransitiveInhUpdatePolicy());
			runGenerator(stop);
			assertPostcondition("in/07_OneSuperSuperAtt_FWD", "expected/07_OneSuperSuperAtt_FWD");
	}
	
	@Ignore("Can be re-enabled after consolidation of GT and TGG")
	@Test
	public void testTwoSuperClassesToSubTables() throws IOException {
			stop.setMaxRuleCount("PackageToDatabase", 1);
			stop.setMaxRuleCount("ClassToTable", 3);
			stop.setMaxRuleCount("AttributeToColumn", 2);
			stop.setMaxRuleCount("SubClassToTable", 2);
			generator.setUpdatePolicy(new CreateMultipleInhUpdatePolicy());
			runGenerator(stop);
			assertPostcondition("in/10_TwoDiffSuperAtt_FWD", "expected/10_TwoDiffSuperAtt_FWD");
	}

}

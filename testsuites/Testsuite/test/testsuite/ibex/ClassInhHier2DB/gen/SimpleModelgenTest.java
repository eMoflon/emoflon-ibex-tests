package testsuite.ibex.ClassInhHier2DB.gen;

import java.io.IOException;

import org.benchmarx.classInheritanceHierarchy.core.ClassInheritanceHierarchyComparator;
import org.benchmarx.database.core.DatabaseComparator;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.classinhhier2db.MODELGEN_App;
import org.junit.Before;
import org.junit.Test;

import ClassInheritanceHierarchy.ClassPackage;
import Database.DB;
import language.TGGRule;
import testsuite.ibex.testUtil.ModelGenTestCase;

public class SimpleModelgenTest extends ModelGenTestCase<ClassPackage, DB> {

	@Override
	protected String getProjectName() {
		return "ClassInhHier2DB";
	}
	
	@Before
	public void createGenerator() throws IOException {
		generator = new MODELGEN_App(getProjectName(), testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false);
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

}

package testsuite.ibex.Class2TestClass_MA.gen;

import java.io.IOException;

import org.benchmarx.classInheritanceHierarchy.core.ClassInheritanceHierarchyComparator;
import org.benchmarx.database.core.DatabaseComparator;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.operational.updatepolicy.RandomMatchUpdatePolicy;
import org.emoflon.ibex.tgg.operational.updatepolicy.UpdatePolicy;
import org.emoflon.ibex.tgg.run.class2testclass_ma.MODELGEN_App;
import org.junit.Before;
import org.junit.Test;

import ClassInheritanceHierarchy.ClassPackage;
import Database.DB;
import language.TGGRule;
import testsuite.ibex.testUtil.ModelGenTestCase;

public class SimpleModelgenTest extends ModelGenTestCase<ClassPackage, DB>{
	
	@Override
	protected String getProjectName() {
		return "Class2TestClass_MA";
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
	public void testPackageToTestSuite() throws IOException {
		stop.setMaxRuleCount("Package2TestSuite", 1);
		runGenerator(stop);
		assertPostcondition("in/01_PackageToTestSuite_FWD", "expected/01_PackageToTestSuite_FWD");
	}
	
	@Test
	public void testClassToTestClass() throws IOException {
		stop.setMaxRuleCount("Package2TestSuite", 1);
		stop.setMaxRuleCount("CreateClass", 1);
		UpdatePolicy newUP = new RandomMatchUpdatePolicy(10);
		newUP.setBoundForComplementRule("CreateTestClass", 1, true);
		generator.setUpdatePolicy(newUP);
		runGenerator(stop);
		assertPostcondition("in/02_OneClass", "expected/02_OneTestClass");
	}
	
	@Test
	public void testThreeClassesToSixTestClasses() throws IOException {
		stop.setMaxRuleCount("Package2TestSuite", 1);
		stop.setMaxRuleCount("CreateClass", 3);
		UpdatePolicy newUP = new RandomMatchUpdatePolicy(10);
		newUP.setBoundForComplementRule("CreateTestClass", 2, true);
		generator.setUpdatePolicy(newUP);
		runGenerator(stop);
		assertPostcondition("in/03_ThreeClasses", "expected/04_SixTestClasses");
	}
	
}

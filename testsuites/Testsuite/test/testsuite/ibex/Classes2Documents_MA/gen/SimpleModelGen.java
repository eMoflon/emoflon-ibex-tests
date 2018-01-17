package testsuite.ibex.Classes2Documents_MA.gen;

import java.io.IOException;

import org.benchmarx.classMultipleInheritanceHierarchy.core.ClassMultipleIhneritanceHierarchyComparator;
import org.benchmarx.documents.core.DocumentsComparator;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.class2doc_ma.MODELGEN_App;
import org.junit.Before;
import org.junit.Test;

import Documents.Container;
import classMultipleInheritanceHierarchy.ClassPackage;
import language.TGGRule;
import testsuite.ibex.testUtil.ModelGenTestCase;

public class SimpleModelGen extends ModelGenTestCase<ClassPackage, Container>{
	@Override
	protected String getProjectName() {
		return "Class2Doc_MA";
	}
	
	@Before
	public void createGenerator() throws IOException {
		generator = new MODELGEN_App(getProjectName(), testsuite.ibex.testUtil.Constants.workspacePath, false);
		stop = new MODELGENStopCriterion(generator.getTGG());
		
		for (TGGRule rule : generator.getTGG().getRules()) {
			stop.setMaxRuleCount(rule.getName(), 0);
		}
		
		sourceComp = new ClassMultipleIhneritanceHierarchyComparator(false);
		targetComp = new DocumentsComparator(false);
	}
	
	@Test
	public void testPackageToContainer() throws IOException {
		stop.setMaxRuleCount("Package2Container", 1);
		runGenerator(stop);
		assertPostcondition("in/01_PackageToContainer", "expected/01_PackageToContainer");
	}
	
	@Test
	public void testClassToDoc() throws IOException {
		stop.setMaxRuleCount("Package2Container", 1);
		stop.setMaxRuleCount("Class2Doc", 1);
		runGenerator(stop);
		assertPostcondition("in/02_ClassToDoc", "expected/02_ClassToDoc");
	}
	
	@Test
	public void testSubClassToSubDoc() throws IOException {
		stop.setMaxRuleCount("Package2Container", 1);
		stop.setMaxRuleCount("Class2Doc", 2);
		stop.setMaxRuleCount("SubClass2SubDoc", 1);
		runGenerator(stop);
		assertPostcondition("in/03_SubClassToDoc", "expected/03_SubClassToDoc");
	}
	
	@Test
	public void testSubSubClassToSubDoc() throws IOException {
		stop.setMaxRuleCount("Package2Container", 1);
		stop.setMaxRuleCount("Class2Doc", 3);
		stop.setMaxRuleCount("SubClass2SubDoc", 2);
		generator.setUpdatePolicy(new CreateSingleTransitiveUP());
		runGenerator(stop);
		assertPostcondition("in/04_SubSubClassToDoc", "expected/04_SubSubClassToDoc");
	}
}

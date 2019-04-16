package testsuite.ibex.adele2aadl;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.util.CCTestCase;

public class PositiveExamples extends CCTestCase {
	private void testForPairOfModels(String source, String target) throws IOException {
		createChecker(source, target);
		runCC();
		checker.saveModels();
		System.out.println(checker.generateConsistencyReport());
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	
//	@Test
//	public void testForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/component_implementation/forward.adele", "unit/component_implementation/reverse.aadl");
//	}
//	@Test
//	public void test1ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/component_type/forward.adele", "unit/component_type/reverse.aadl");
//	}
//	@Test
//	public void test2ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/component_type_circ_ref/forward.adele", "unit/component_type_circ_ref/reverse.aadl");
//	}
	@Test
	public void test3ForAdelePackageToAadlPackage() throws IOException {
		testForPairOfModels("unit/connection/dataAccessConn2AccessConnDataSubcompo/forward.adele", "unit/connection/dataAccessConn2AccessConnDataSubcompo/reverse.aadl");
	}
//	@Test
//	public void test4ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/connection/dataAccessConn2AccessConnSrcParentDestSubcompo/forward.adele", "unit/connection/dataAccessConn2AccessConnSrcParentDestSubcompo/reverse.aadl");
//	}
//	@Test
//	public void test5ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/connection/dataAccessConn2AccessConnSrcSubcompoDestParent/forward.adele", "unit/connection/dataAccessConn2AccessConnSrcSubcompoDestParent/reverse.aadl");
//	}
//	
//	@Test
//	public void test6ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/connection/dataAccessConn2AccessConnSrcSubcompoDestSubcompo/forward.adele", "unit/connection/dataAccessConn2AccessConnSrcSubcompoDestSubcompo/reverse.aadl");
//	}
//	@Test
//	public void test7ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/connection/dataPortConn2PortConn/forward.adele", "unit/connection/dataPortConn2PortConn/reverse.aadl");
//	}
//	@Test
//	public void test8ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/connection/eventDataPortConn2PortConnSrcSubcompoDestParent/forward.adele", "unit/connection/eventDataPortConn2PortConnSrcSubcompoDestParent/reverse.aadl");
//	}
//	@Test
//	public void test9ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/connection/eventDataPortConn2PortConnSrcSubcompoDestSubcompo/forward.adele", "unit/connection/eventDataPortConn2PortConnSrcSubcompoDestSubcompo/reverse.aadl");
//	}
//	@Test
//	public void test10ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/connection/eventPortConn2PortConnSrcSubcompoDestParent/forward.adele", "unit/connection/eventPortConn2PortConnSrcSubcompoDestParent/reverse.aadl");
//	}
//	
//	@Test
//	public void test11ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/connection/featureGroupConn2FeatureGroupConn/forward.adele", "unit/connection/featureGroupConn2FeatureGroupConn/reverse.aadl");
//	}
//	
//	@Test
//	public void test12ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/feature/abstractFeature2AbstractFeature/forward.adele", "unit/feature/abstractFeature2AbstractFeature/reverse.aadl");
//	}
//	
//	@Test
//	public void test13ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/feature/access2Access/forward.adele", "unit/feature/access2Access/reverse.aadl");
//	}
//	@Test
//	public void test14ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/feature/access2AccessRefined/forward.adele", "unit/feature/access2AccessRefined/reverse.aadl");
//	}
//	@Test
//	public void test15ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/feature/access2AccessTyped/forward.adele", "unit/feature/access2AccessTyped/reverse.aadl");
//	}
//	
//	@Test
//	public void test16ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/feature/access2AccessTypedRefined/forward.adele", "unit/feature/access2AccessTypedRefined/reverse.aadl");
//	}
//	
//	@Test
//	public void test17ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/feature/dataPort2DataPort/forward.adele", "unit/feature/dataPort2DataPort/reverse.aadl");
//	}
//	
//	@Test
//	public void test18ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/feature/dataPort2DataPortTyped/forward.adele", "unit/feature/dataPort2DataPortTyped/reverse.aadl");
//	}
//	
//	@Test
//	public void test19ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/feature/dataPort2DataPortTypedRefined/forward.adele", "unit/feature/dataPort2DataPortTypedRefined/reverse.aadl");
//	}
//	
//	@Test
//	public void test20ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/feature/eventPort2EventPort/forward.adele", "unit/feature/eventPort2EventPort/reverse.aadl");
//	}
//	@Test
//	public void test21ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/feature/eventPort2EventPortRefined/forward.adele", "unit/feature/eventPort2EventPortRefined/reverse.aadl");
//	}
//	
//	@Test
//	public void test22ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/feature/featureGroup2FeatureGroup/forward.adele", "unit/feature/featureGroup2FeatureGroup/reverse.aadl");
//	}
//	
//	@Test
//	public void test23ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/feature/parameter2Parameter/forward.adele", "unit/feature/parameter2Parameter/reverse.aadl");
//	}
//	
//	@Test
//	public void test24ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/subcomponent/ruleAbstract2AbstractSubcomponentTypedRefinedTyped/forward.adele", "unit/subcomponent/ruleAbstract2AbstractSubcomponentTypedRefinedTyped/reverse.aadl");
//	}
//	
//	@Test
//	public void test25ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/subcomponent/rulesTypedAsParent/forward.adele", "unit/subcomponent/rulesTypedAsParent/reverse.aadl");
//	}
//	
//	@Test
//	public void test26ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/subcomponent/ruleSystem2SystemSubcomponent/forward.adele", "unit/subcomponent/ruleSystem2SystemSubcomponent/reverse.aadl");
//	}
//	
//	@Test
//	public void test27ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/subcomponent/ruleSystem2SystemSubcomponentRefinedTyped/forward.adele", "unit/subcomponent/ruleSystem2SystemSubcomponentRefinedTyped/reverse.aadl");
//	}
//	
//	@Test
//	public void test28ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/subcomponent/ruleSystem2SystemSubcomponentRefinedTypedExtRes/forward.adele", "unit/subcomponent/ruleSystem2SystemSubcomponentRefinedTypedExtRes/reverse.aadl");
//	}
//	
//	@Test
//	public void test29ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/subcomponent/ruleSystem2SystemSubcomponentTyped/forward.adele", "unit/subcomponent/ruleSystem2SystemSubcomponentTyped/reverse.aadl");
//	}
//	@Test
//	public void test30ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/subcomponent/ruleSystem2SystemSubcomponentTypedRefinedTyped/forward.adele", "unit/subcomponent/ruleSystem2SystemSubcomponentTypedRefinedTyped/reverse.aadl");
//	}
	
}

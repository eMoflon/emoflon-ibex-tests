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
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	
	@Test
	public void testForAdelePackageToAadlPackage() throws IOException {
		testForPairOfModels("unit/component_implementation/forward.adele", "unit/component_implementation/reverse.aadl");
	}
	@Test
	public void test1ForAdelePackageToAadlPackage() throws IOException {
		testForPairOfModels("unit/component_type/forward.adele", "unit/component_type/reverse.aadl");
	}
	@Test
	public void test2ForAdelePackageToAadlPackage() throws IOException {
		testForPairOfModels("unit/component_type_circ_ref/forward.adele", "unit/component_type_circ_ref/reverse.aadl");
	}
//	@Test
//	public void test3ForAdelePackageToAadlPackage() throws IOException {
//		testForPairOfModels("unit/connection/dataAccessConn2AccessConnDataSubcompo/forward.adele", "unit/connection/dataAccessConn2AccessConnDataSubcompo/reverse.aadl");
//	}
	@Test
	public void test4ForAdelePackageToAadlPackage() throws IOException {
		testForPairOfModels("unit/connection/dataAccessConn2AccessConnSrcParentDestSubcompo/forward.adele", "unit/connection/dataAccessConn2AccessConnSrcParentDestSubcompo/reverse.aadl");
	}
	@Test
	public void test5ForAdelePackageToAadlPackage() throws IOException {
		testForPairOfModels("unit/connection/dataAccessConn2AccessConnSrcSubcompoDestParent/forward.adele", "unit/connection/dataAccessConn2AccessConnSrcSubcompoDestParent/reverse.aadl");
	}
	
	@Test
	public void test6ForAdelePackageToAadlPackage() throws IOException {
		testForPairOfModels("unit/connection/dataAccessConn2AccessConnSrcSubcompoDestSubcompo/forward.adele", "unit/connection/dataAccessConn2AccessConnSrcSubcompoDestSubcompo/reverse.aadl");
	}
	@Test
	public void test7ForAdelePackageToAadlPackage() throws IOException {
		testForPairOfModels("unit/connection/dataPortConn2PortConn/forward.adele", "unit/connection/dataPortConn2PortConn/reverse.aadl");
	}
	@Test
	public void test8ForAdelePackageToAadlPackage() throws IOException {
		testForPairOfModels("unit/connection/eventDataPortConn2PortConnSrcSubcompoDestParent/forward.adele", "unit/connection/eventDataPortConn2PortConnSrcSubcompoDestParent/reverse.aadl");
	}
	@Test
	public void test9ForAdelePackageToAadlPackage() throws IOException {
		testForPairOfModels("unit/connection/eventDataPortConn2PortConnSrcSubcompoDestSubcompo/forward.adele", "unit/connection/eventDataPortConn2PortConnSrcSubcompoDestSubcompo/reverse.aadl");
	}
	@Test
	public void test10ForAdelePackageToAadlPackage() throws IOException {
		testForPairOfModels("unit/connection/eventPortConn2PortConnSrcSubcompoDestParent/forward.adele", "unit/connection/eventPortConn2PortConnSrcSubcompoDestParent/reverse.aadl");
	}
	
	@Test
	public void test11ForAdelePackageToAadlPackage() throws IOException {
		testForPairOfModels("unit/connection/featureGroupConn2FeatureGroupConn/forward.adele", "unit/connection/featureGroupConn2FeatureGroupConn/reverse.aadl");
	}
	
	
	
}

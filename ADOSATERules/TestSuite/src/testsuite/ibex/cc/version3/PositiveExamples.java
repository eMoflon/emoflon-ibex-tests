package testsuite.ibex.cc.version3;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.util.CCTestCase;

public class PositiveExamples extends CCTestCase {
	private void testForPairOfModels(String source, String target) throws IOException {
		createChecker(source, target);
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	@Test
	public void testForAdelePackageToAadlPackage() throws IOException {
		testForPairOfModels("unit/component_implementation/forward.adele", "unit/component_implementation/reverse.aadl");
	}
}

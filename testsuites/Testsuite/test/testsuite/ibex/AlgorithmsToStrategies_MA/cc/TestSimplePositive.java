package testsuite.ibex.AlgorithmsToStrategies_MA.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.algorithmtostrategy_ma.CC_App;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimplePositive extends CCTestCase {

	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("AlgorithmToStrategy_MA", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance);
	}
	
	@Test
	public void testContainers() throws IOException {
		createGenerator("in/01_ContainersOnly", "expected/01_ContainersOnly");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testCreateOnlyStrategy() throws IOException {
		createGenerator("in/01_ContainersOnly", "expected/02_OneStrategy");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testCreateOnlyAlgorithm() throws IOException {
		createGenerator("in/03_OneAlgo", "expected/01_ContainersOnly");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}

	@Test
	public void testCreateOneAlgoOneStrategy() throws IOException {
		createGenerator("in/03_OneAlgo", "expected/02_OneStrategy");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}

	@Test
	public void testCreateThreeAlgosFourStrategy() throws IOException {
		createGenerator("in/05_ThreeAlgosFourStrategy", "expected/05_ThreeAlgosFourStrategy");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
}

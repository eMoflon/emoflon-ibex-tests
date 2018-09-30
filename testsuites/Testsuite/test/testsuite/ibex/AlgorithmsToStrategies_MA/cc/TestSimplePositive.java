package testsuite.ibex.AlgorithmsToStrategies_MA.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.algorithmtostrategy_ma.CC_App;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimplePositive extends CCTestCase {

	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("AlgorithmToStrategy_MA", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, this.ilpSolver);
	}
	
	@Test
	public void testContainers() throws IOException {
		createGenerator("in/01_ContainersOnly", "expected/01_ContainersOnly");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testCreateOnlyStrategy() throws IOException {
		createGenerator("in/01_ContainersOnly", "expected/02_OneStrategy");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testCreateOnlyAlgorithm() throws IOException {
		createGenerator("in/03_OneAlgo", "expected/01_ContainersOnly");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}

	@Test
	public void testCreateOneAlgoOneStrategy() throws IOException {
		createGenerator("in/03_OneAlgo", "expected/02_OneStrategy");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}

	@Test
	public void testCreateThreeAlgosFourStrategy() throws IOException {
		createGenerator("in/05_ThreeAlgosFourStrategy", "expected/05_ThreeAlgosFourStrategy");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Ignore("Fails for now because generating cyclig constraints does not terminate!")
	@Test
	public void testBigModels() throws IOException {
		createGenerator("in/06_BigModel", "expected/06_BigModel");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
}

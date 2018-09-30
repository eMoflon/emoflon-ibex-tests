package testsuite.ibex.AlgorithmsToStrategies_MA.opt;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.emoflon.ibex.tgg.run.algorithmtostrategy_ma.BWD_OPT_App;
import org.emoflon.ibex.tgg.run.algorithmtostrategy_ma.CO_App;
import org.emoflon.ibex.tgg.run.algorithmtostrategy_ma.FWD_OPT_App;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.testUtil.COTestCase;

public class TestAlgorithmsToStrategies_MA extends COTestCase {

	public void createCO(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		checker = new CO_App("AlgorithmToStrategy_MA", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, true, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
	}
	
	public void createFWD_OPT(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		forward = new FWD_OPT_App("AlgorithmToStrategy_MA", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
	}
	
	public void createBWD_OPT(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		backward = new BWD_OPT_App("AlgorithmToStrategy_MA", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
	}
	
	@Test
	public void testFWD_OPT() throws IOException {
		createFWD_OPT("/resources/co/src", "/resources/co/trg-tmp", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
		runFWD_OPT();
		createCO("/resources/co/src", "/resources/co/trg-tmp", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
		runCO();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	

	@Test
	public void testBWD_OPT() throws IOException {
		createBWD_OPT("/resources/co/src-tmp", "/resources/co/trg", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
		runBWD_OPT();
		createCO("/resources/co/src-tmp", "/resources/co/trg", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
		runCO();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testSimplePositive() throws IOException {
		createCO("/resources/co/src", "/resources/co/trg", "/resources/co/corr", "/resources/co/protocol");
		Logger.getRootLogger().setLevel(Level.DEBUG);
		runCO();
		checker.saveModels();
		System.out.println(checker.generateConsistencyReport());
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testEmptyRootNodes() throws IOException {
		createCO("/resources/co/src", "/resources/co/trg", "/resources/co/corr_inc", "/resources/co/protocol");
		runCO();
		Assert.assertFalse(checker.modelsAreConsistent());
	}
}

package testsuite.ibex.VHDLTGGCodeAdapter.gen;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.vhdltggcodeadapter.MODELGEN_App;
import org.junit.Before;
import org.junit.Test;

import org.emoflon.ibex.tgg.operational.updatepolicy.RandomMatchUpdatePolicy;

public class ExecutionTest {
	private MODELGEN generator;
	
	@Before
	public void createGenerator() throws IOException {
		BasicConfigurator.configure();
		
		this.generator = new MODELGEN_App("VHDLTGGCodeAdapter", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false);
		MODELGENStopCriterion stop = new MODELGENStopCriterion(generator.getTGG());
		stop.setTimeOutInMS(1000);
		generator.setUpdatePolicy(new RandomMatchUpdatePolicy(20));
		this.generator.setStopCriterion(stop);
	}
	
	@Test
	public void successfulExecution() throws IOException {
		try {
			this.generator.run();
		} catch (Exception e) {
			e.printStackTrace();
			throw new AssertionError();
		}
	}
	
}

package testmonitor.MemoryConsumptionObserver;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import org.emoflon.ibex.tgg.operational.monitoring.MemoryConsumptionObserver;
import org.emoflon.ibex.tgg.run.familiestopersons_ma.BWD_OPT_App;
import org.emoflon.ibex.tgg.run.familiestopersons_ma.CO_App;
import org.emoflon.ibex.tgg.run.familiestopersons_ma.FWD_OPT_App;
import org.junit.Test;
import testsuite.ibex.testUtil.COTestCase;

public class TestMemoryConsumptionObserver extends COTestCase {
	MemoryConsumptionObserver mco;

	public void createGenerator(String srcInstance, String trgInstance, String corrInstance, String protInstance)
			throws IOException {
		checker = new CO_App("FamiliesToPersons_MA", testsuite.ibex.performance.util.PerformanceConstants.workspacePath,
				false, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
	}

	public void createTransformation(String srcInstance, String trgInstance, String corrInstance, String protInstance)
			throws IOException {
		forward = new FWD_OPT_App("FamiliesToPersons_MA",
				testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance,
				corrInstance, protInstance, this.ilpSolver);
	}

	public void createBackward(String srcInstance, String trgInstance, String corrInstance, String protInstance)
			throws IOException {
		backward = new BWD_OPT_App("FamiliesToPersons_MA",
				testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance,
				corrInstance, protInstance, this.ilpSolver);
	}

	@Test
	public void testMemoryConsumptionObserver() throws IOException {
		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr", "/resources/co/protocol");
		mco = new MemoryConsumptionObserver(checker);
		checker.registerObserver(mco);
		checker.run();
		long memoryConsumtionSize = mco.getCurrentMemoryConsumption();

		assertTrue(!(memoryConsumtionSize <= 0L));

		checker.terminate();
		checker.saveModels();
	}
}
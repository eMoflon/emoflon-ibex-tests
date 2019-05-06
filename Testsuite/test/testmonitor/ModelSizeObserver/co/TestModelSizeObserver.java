package testmonitor.ModelSizeObserver.co;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.tgg.operational.monitoring.ModelSizeObserver;
import org.emoflon.ibex.tgg.run.familiestopersons_ma.BWD_OPT_App;
import org.emoflon.ibex.tgg.run.familiestopersons_ma.CO_App;
import org.emoflon.ibex.tgg.run.familiestopersons_ma.FWD_OPT_App;
import org.junit.Test;
import testsuite.ibex.testUtil.COTestCase;

public class TestModelSizeObserver extends COTestCase {

	ModelSizeObserver mso;

	public void createGenerator(String srcInstance, String trgInstance, String corrInstance, String protInstance)
			throws IOException {
		checker = new CO_App("FamiliesToPersons_MA", testsuite.ibex.performance.util.PerformanceConstants.workspacePath,
				false, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
		checker.registerObserver(new ModelSizeObserver(checker));
	}

	public void createTransformation(String srcInstance, String trgInstance, String corrInstance, String protInstance)
			throws IOException {
		forward = new FWD_OPT_App("FamiliesToPersons_MA",
				testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance,
				corrInstance, protInstance, this.ilpSolver);
		forward.registerObserver(new ModelSizeObserver(forward));
	}

	public void createBackward(String srcInstance, String trgInstance, String corrInstance, String protInstance)
			throws IOException {
		backward = new BWD_OPT_App("FamiliesToPersons_MA",
				testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance,
				corrInstance, protInstance, this.ilpSolver);
		backward.registerObserver(new ModelSizeObserver(backward));
	}

	@Test
	public void testModelSizeObserver() throws IOException {
		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr", "/resources/co/protocol");
		mso = new ModelSizeObserver(checker);
		checker.registerObserver(mso);
		checker.run();
		Resource s = checker.getSourceResource();
		Resource c = checker.getCorrResource();
		Resource t = checker.getTargetResource();

		int modelSize = mso.getNumberOfObjectsInModels(s, c, t);

		assertEquals(mso.countNumber(s), 5);
		assertEquals(mso.countNumber(t), 4);
		assertEquals(mso.countNumber(c), 4);

		assertEquals(modelSize, 13);

		checker.terminate();
		checker.saveModels();
	}
}

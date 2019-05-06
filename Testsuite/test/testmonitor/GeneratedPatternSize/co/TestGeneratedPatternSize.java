package testmonitor.GeneratedPatternSize.co;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Map;
import org.emoflon.ibex.tgg.operational.monitoring.GeneratedPatternsSizeObserver;
import org.emoflon.ibex.tgg.operational.monitoring.MemoryConsumptionObserver;
import org.emoflon.ibex.tgg.operational.monitoring.ModelSizeObserver;
import org.emoflon.ibex.tgg.operational.monitoring.NumberOfMatchesObserver;
import org.emoflon.ibex.tgg.operational.patterns.IGreenPatternFactory;
import org.emoflon.ibex.tgg.run.familiestopersons_ma.BWD_OPT_App;
import org.emoflon.ibex.tgg.run.familiestopersons_ma.CO_App;
import org.emoflon.ibex.tgg.run.familiestopersons_ma.FWD_OPT_App;
import org.junit.Test;
import testsuite.ibex.testUtil.COTestCase;

public class TestGeneratedPatternSize extends COTestCase {

	GeneratedPatternsSizeObserver gpso;

	public void createGenerator(String srcInstance, String trgInstance, String corrInstance, String protInstance)
			throws IOException {
		checker = new CO_App("FamiliesToPersons_MA", testsuite.ibex.performance.util.PerformanceConstants.workspacePath,
				false, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
		checker.registerObserver(new ModelSizeObserver(checker));
		checker.registerObserver(new NumberOfMatchesObserver(checker));
		checker.registerObserver(new MemoryConsumptionObserver(checker));
	}

	public void createTransformation(String srcInstance, String trgInstance, String corrInstance, String protInstance)
			throws IOException {
		forward = new FWD_OPT_App("FamiliesToPersons_MA",
				testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance,
				corrInstance, protInstance, this.ilpSolver);
		forward.registerObserver(new GeneratedPatternsSizeObserver(forward));
		forward.registerObserver(new ModelSizeObserver(forward));
		forward.registerObserver(new NumberOfMatchesObserver(forward));
		forward.registerObserver(new MemoryConsumptionObserver(forward));
	}

	public void createBackward(String srcInstance, String trgInstance, String corrInstance, String protInstance)
			throws IOException {
		backward = new BWD_OPT_App("FamiliesToPersons_MA",
				testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance,
				corrInstance, protInstance, this.ilpSolver);
		backward.registerObserver(new ModelSizeObserver(backward));
		backward.registerObserver(new NumberOfMatchesObserver(backward));
		backward.registerObserver(new MemoryConsumptionObserver(backward));
	}

	@Test
	public void TestGeneratedPatternSizeObserver() throws IOException {
		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr", "/resources/co/protocol");
		gpso = new GeneratedPatternsSizeObserver(checker);
		checker.registerObserver(gpso);
		checker.run();
		Map<String, IGreenPatternFactory> factories = checker.getFactories();

		for (String k : factories.keySet()) {
			switch (k) {
			case "Families2Persons":
				assertEquals(gpso.calculateSize(factories.get(k)), 0);
				break;
			case "Mother2Female":
				assertEquals(gpso.calculateSize(factories.get(k)), 2);
				break;
			case "Son2Male":
				assertEquals(gpso.calculateSize(factories.get(k)), 2);
				break;
			case "CreateFamily":
				assertEquals(gpso.calculateSize(factories.get(k)), 5);
				break;
			case "Daughter2Female":
				assertEquals(gpso.calculateSize(factories.get(k)), 2);
				break;
			case "Father2Male":
				assertEquals(gpso.calculateSize(factories.get(k)), 2);
				break;
			default:
				// ToDo: Print out that the rule does not exist
				assertEquals(true, false);
			}
		}
		checker.terminate();
		checker.saveModels();
	}
}
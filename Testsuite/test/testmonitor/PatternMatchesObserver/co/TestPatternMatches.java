package testmonitor.PatternMatchesObserver.co;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.HashMap;
import org.emoflon.ibex.tgg.operational.IBlackInterpreter;
import org.emoflon.ibex.tgg.operational.matches.IMatchContainer;
import org.emoflon.ibex.tgg.operational.monitoring.NumberOfMatchesObserver;
import org.emoflon.ibex.tgg.run.familiestopersons_ma.BWD_OPT_App;
import org.emoflon.ibex.tgg.run.familiestopersons_ma.CO_App;
import org.emoflon.ibex.tgg.run.familiestopersons_ma.FWD_OPT_App;
import org.junit.Test;
import testsuite.ibex.testUtil.COTestCase;

public class TestPatternMatches extends COTestCase {
	NumberOfMatchesObserver mo;

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
	public void TestNumberOfMatchesObserver() throws IOException {
		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr", "/resources/co/protocol");
		mo = new NumberOfMatchesObserver(checker);
		checker.registerObserver(mo);

		IBlackInterpreter bp;
		do {
			bp = checker.getBlackInterpreter();
			bp.updateMatches();
			IMatchContainer mc = checker.getMatchContainer();
			HashMap<String, Integer> map = mo.getMatchSize(mc);

			for (String key : map.keySet()) {
				String patternName = key.toString();
				int matches = map.get(patternName);

				switch (patternName) {
				case "Families2Persons":
					assertEquals(matches, 1);
					break;
				case "Mother2Female":
					assertEquals(matches, 2);
					break;
				case "Son2Male":
					assertEquals(matches, 1);
					break;
				case "CreateFamily":
					assertEquals(matches, 1);
					break;
				case "Daughter2Female":
					assertEquals(matches, 2);
					break;
				case "Father2Male":
					assertEquals(matches, 1);
					break;
				default:
					// ToDo: Print out that the rule does not exist
					assertEquals(true, false);
				}
			}
		} while (checker.processOneOptRuleMatch());

		checker.pWrapUp();
		checker.saveModels();
		checker.terminate();
	}
}
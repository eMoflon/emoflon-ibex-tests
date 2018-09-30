package testsuite.ibex.performance.run;

import java.io.IOException;

import org.emoflon.ibex.tgg.compiler.patterns.PatternSuffixes;
import org.emoflon.ibex.tgg.operational.matches.IMatch;
import org.emoflon.ibex.tgg.operational.patterns.IGreenPattern;

/**
 * This app only collects FWD patterns for the forward strategy and BWD pattern for the backward strategy to increase
 * the performance of the respective operationalization
 * @author NilsWeidmann
 *
 */
public class Initial_SYNC_App extends SYNC_App {

	public Initial_SYNC_App(String projectName, String workspacePath, boolean debug, String instancePath, boolean isFwd,
			boolean isIncr) throws IOException {
		super(projectName, workspacePath, debug, instancePath, isFwd, isIncr);
	}
	
	@Override
	public boolean isPatternRelevantForCompiler(String patternName) {
		if (isFwd)
			return patternName.endsWith(PatternSuffixes.FWD); 
		else 
			return patternName.endsWith(PatternSuffixes.BWD);
	}
	
	@Override
	public void saveModels() {
		// Models needn't be saved for all Operationalizations except MODELGEN
	}
	
	@Override
	protected void createMarkers(IGreenPattern greenPattern, IMatch comatch, String ruleName) {
		// Markers are not required anymore
	}
}

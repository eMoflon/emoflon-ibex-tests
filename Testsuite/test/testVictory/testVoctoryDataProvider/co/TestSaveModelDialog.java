package testVictory.testVoctoryDataProvider.co;

import static org.junit.Assert.assertEquals;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.stream.Collectors;
import org.eclipse.emf.common.util.URI;
import org.emoflon.ibex.tgg.operational.IBlackInterpreter;
import org.emoflon.ibex.tgg.operational.matches.IMatch;
import org.emoflon.ibex.tgg.operational.matches.IMatchContainer;
import org.emoflon.ibex.tgg.operational.monitoring.VictoryDataProvider;
import org.emoflon.ibex.tgg.run.companytoit.BWD_OPT_App;
import org.emoflon.ibex.tgg.run.companytoit.CO_App;
import org.emoflon.ibex.tgg.run.companytoit.FWD_OPT_App;
import org.junit.Test;
import testsuite.ibex.testUtil.COTestCase;

public class TestSaveModelDialog extends COTestCase {
	
public void createGenerator(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
	checker = new CO_App("CompanyToIT", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, true, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
}


public void createTransformation(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
	forward = new FWD_OPT_App("CompanyToIT", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
}

public void createBackward(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
	backward = new BWD_OPT_App("CompanyToIT", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, true, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
	
}


	@Test
	public void testSaveModel() throws IOException {
		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr", "/resources/co/protocol");
	VictoryDataProvider dataProvider = new VictoryDataProvider(checker);
	checker.run();
	String[] pLocations = { "/resource/CompanyToIT/instances", "/resource/CompanyToIT/instances"
			, "/resource/CompanyToIT/instances", "/resource/CompanyToIT/instances"};
	
	checker.terminate();
	checker.saveModels();
	// We can find find the URI only after the models have been saved
	
	Set<URI> uri = dataProvider.saveModels(pLocations);
	Boolean check = false;
	for (URI u: uri) {
		File file = new File(u.toString());
	boolean checkIfExists = !file.exists();
		boolean checkIsDirectory = !file.isDirectory();
		if(checkIfExists && checkIsDirectory) { 
	    check = true;			break;
		}
	}
	
	assertEquals(true, check);
	
	for (URI u: uri) {
		File file = new File(u.toString());
		file.delete();
	}
}

}

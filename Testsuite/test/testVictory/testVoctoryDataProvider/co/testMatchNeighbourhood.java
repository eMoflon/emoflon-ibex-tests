package testVictory.testVoctoryDataProvider.co;

import static org.junit.Assert.assertEquals;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.emoflon.ibex.tgg.operational.IBlackInterpreter;
import org.emoflon.ibex.tgg.operational.matches.IMatch;
import org.emoflon.ibex.tgg.operational.matches.IMatchContainer;
import org.emoflon.ibex.tgg.operational.monitoring.VictoryDataProvider;
import org.emoflon.ibex.tgg.run.companytoit.BWD_OPT_App;
import org.emoflon.ibex.tgg.run.companytoit.CO_App;
import org.emoflon.ibex.tgg.run.companytoit.FWD_OPT_App;
import org.junit.Test;
import testsuite.ibex.testUtil.COTestCase;

public class testMatchNeighbourhood extends COTestCase{
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
	public void testVictoryDataProviderGetMatchNeighborhood() throws IOException {
		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr", "/resources/co/protocol");
		VictoryDataProvider dataProvider = new VictoryDataProvider(checker);
		checker.run();
		EObject node = checker.getSourceResource().getContents().stream().findFirst().get();
		Collection<EObject> result = dataProvider.getMatchNeighbourhood(node, 4);
		Collection<EObject> testResult = new HashSet<EObject>();
		
		testResult.add(node);
		testResult.addAll(node.eContents());
		
		for (EObject n : node.eContents()) {
			testResult.addAll(n.eContents());
		}
		
		assertEquals(result.size(), testResult.size());
				
		
		checker.terminate();
		checker.saveModels();
	}

	
	
	

}

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

public class testVictoryDataProvider extends COTestCase {
		
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
	public void testVictoryDataProviderRule() throws IOException {
		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr", "/resources/co/protocol");
		VictoryDataProvider dataProvider = new VictoryDataProvider(checker);
		checker.run();	
		String ruleName = checker.getOptions().getFlattenedConcreteTGGRules().stream().findFirst().get().getName();
		String finalRuleName = dataProvider.getRule(ruleName).getName();	
		
		assertEquals(finalRuleName, ruleName);
		
		checker.terminate();
		checker.saveModels();
	}
	
	@Test
	public void testVictoryDataMatchByRule() throws IOException {
		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr", "/resources/co/protocol");
		VictoryDataProvider dataProvider = new VictoryDataProvider(checker);
		checker.run();
		
		String ruleName = checker.getOptions().getFlattenedConcreteTGGRules().stream().findFirst().get().getName();
		Set<IMatch> getMatchesByRuleName = checker.getMatchContainer().getMatches().stream().filter(r -> r.getRuleName().equals(ruleName))
				.collect(Collectors.toSet());;
		Set<IMatch> getMatchesByRuleNameTest = dataProvider.getMatches(ruleName);
		
		assertEquals(getMatchesByRuleNameTest, getMatchesByRuleName);
				
		checker.terminate();
		checker.saveModels();		
	
	}
	
	
	@Test
	public void testVictoryDataMatchByMatch() throws IOException {
		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr", "/resources/co/protocol");
		VictoryDataProvider dataProvider = new VictoryDataProvider(checker);
		IMatch temporaryMatchObject;
		IBlackInterpreter blackInterpreter;
		do {
			blackInterpreter = checker.getBlackInterpreter();
			blackInterpreter.updateMatches();
			IMatchContainer matchContainer = checker.getMatchContainer();
			
			temporaryMatchObject = matchContainer.getMatches().iterator().next();
			
			if(temporaryMatchObject != null) {
				 IMatch match = temporaryMatchObject;
				Set<IMatch> getMatchesByMatch = checker.getMatchContainer().getMatches().stream().filter(m -> m.getRuleName().equals(match.getRuleName()))
					.collect(Collectors.toSet());
				
				Set<IMatch> getmatchesByMatchTest = dataProvider.getMatches(match);
			
			assertEquals(getmatchesByMatchTest, getMatchesByMatch);
			break;
				
			}  
			
		} while (checker.processOneOptRuleMatch());
		
		checker.pWrapUp();
		checker.terminate();
		checker.saveModels();
			
	}
	
	
	@Test
	public void testSaveModel() throws IOException {
		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr", "/resources/co/protocol");
		VictoryDataProvider dataProvider = new VictoryDataProvider(checker);
		checker.run();
		
		checker.terminate();
		checker.saveModels();
		// We can find find the URI only after the models have been saved
		
		Set<URI> uri = dataProvider.saveModels();
		Boolean check = false;
		for (URI u: uri) {
			File file = new File(u.toString());
			boolean checkIfExists = !file.exists();
			boolean checkIsDirectory = !file.isDirectory();
			if(checkIfExists && checkIsDirectory) { 
			    check = true;
				break;
			}
		}
		
		assertEquals(true, check);
	}
	
	
}

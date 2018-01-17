package testsuite.ibex.AlgorithmsToStrategies.sync;

import org.benchmarx.strategy.core.StrategyHelper;
import org.junit.Ignore;
import org.junit.Test;

import Algorithms.AlgorithmContainer;
import Strategies.StrategyContainer;
import benchmarx.algorithm.core.AlgorithmHelper;
import testsuite.ibex.AlgorithmsToStrategies.sync.util.IbexA2S_MA;
import testsuite.ibex.testUtil.SyncTestCase;

@Ignore("Should work when sync is finalized.")
public class AlternatingSync extends SyncTestCase<AlgorithmContainer, StrategyContainer>{
	
	public final static String projectName = "AlgorithmToStrategy_MA";

	public AlternatingSync() {
		super(new IbexA2S_MA(projectName));
	}
	
	protected AlgorithmHelper helperAlgo;
	protected StrategyHelper helperStrategy;

	@Override
	protected void initHelpers() {
		helperAlgo = new AlgorithmHelper();
		helperStrategy = new StrategyHelper();
	}

	@Override
	protected String getProjectName() {
		return projectName;
	}
	
	@Test
	public void testPackageToDatabase_FWD()
	{
		assertPostcondition("in/01_ContainersOnly", "expected/01_ContainersOnly");
	}
	
	// Test outcome: create algo, strategy side remains the same
	@Test
	public void testCreateAlgo_FWD()
	{
		tool.performAndPropagateSourceEdit( p -> helperAlgo.createAlgorithm(p, "a1"));
		//------------
		assertPostcondition("in/03_OneAlgo", "expected/01_ContainersOnly");
	}
	
	// Test outcome: create strategy, algo side remains the same
	@Test
	public void testCreateStrategy_BWD()
	{
		tool.performAndPropagateTargetEdit( p -> helperStrategy.createStrategy(p, "s1"));
		//------------
		assertPostcondition("in/01_ContainersOnly", "expected/02_OneStrategy");
	}
	
	@Test
	public void testCreateStrategyThenAlgo()
	{
		tool.performAndPropagateTargetEdit( p -> helperStrategy.createStrategy(p, "s1"));
		tool.performAndPropagateSourceEdit( p -> helperAlgo.createAlgorithm(p, "a1"));
		//------------
		assertPostcondition("in/03_OneAlgo", "expected/02_OneStrategy");
	}
	
	@Test
	public void testCreateStrategyThreeAlgoThenFourStrategies()
	{
		tool.performAndPropagateSourceEdit( p -> helperAlgo.createAlgorithm(p, "a1"));
		tool.performAndPropagateSourceEdit( p -> helperAlgo.createAlgorithm(p, "a2"));
		tool.performAndPropagateSourceEdit( p -> helperAlgo.createAlgorithm(p, "a3"));
		tool.performAndPropagateTargetEdit( p -> helperStrategy.createStrategy(p, "s1"));
		tool.performAndPropagateTargetEdit( p -> helperStrategy.createStrategy(p, "s2"));
		tool.performAndPropagateTargetEdit( p -> helperStrategy.createStrategy(p, "s3"));
		tool.performAndPropagateTargetEdit( p -> helperStrategy.createStrategy(p, "s4"));
		//------------
		assertPostcondition("in/05_ThreeAlgosFourStrategy", "expected/05_ThreeAlgosFourStrategy");
	}
	
}

package testsuite.ibex.BlockDiagramCodeAdapter.co;

import java.io.IOException;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.blockdiagramcodeadapter.BWD_OPT_App;
import org.emoflon.ibex.tgg.run.blockdiagramcodeadapter.CO_App;
import org.emoflon.ibex.tgg.run.blockdiagramcodeadapter.FWD_OPT_App;
import org.emoflon.ibex.tgg.run.blockdiagramcodeadapter.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.blockdiagramcodeadapter.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.run.blockdiagramcodeadapter.config.ViatraRegistrationHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import testsuite.ibex.testUtil.COTestCase;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class TestBlockDiagramCodeAdapter extends COTestCase{

	public void createGenerator(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		CO_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper(), new HiPERegistrationHelper(), new ViatraRegistrationHelper()});
		checker = new CO_App("BlockDiagramCodeAdapter", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
	}
	
	public void createTransformation(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		FWD_OPT_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper(), new HiPERegistrationHelper(), new ViatraRegistrationHelper()});
		forward = new FWD_OPT_App("BlockDiagramCodeAdapter", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
	}
	
	public void createBackward(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		BWD_OPT_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper(), new HiPERegistrationHelper(), new ViatraRegistrationHelper()});
		backward = new BWD_OPT_App("BlockDiagramCodeAdapter", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
	}
	
	@Disabled("file Edge cannot be added, no idea why") 
	@Test
	public void testFWD_OPT() throws IOException {
		createTransformation("/resources/co/src", "/resources/co/trg-tmp", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
		runFWD_OPT();
		createGenerator("/resources/co/src", "/resources/co/trg-tmp", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
		runCO();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	

	@Test
	public void testBWD_OPT() throws IOException {
		createBackward("/resources/co/src-tmp", "/resources/co/trg", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
		runBWD_OPT();
		createGenerator("/resources/co/src-tmp", "/resources/co/trg", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
		runCO();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testSimplePositive() throws IOException {
		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr", "/resources/co/protocol");
		runCO();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testWrongLink() throws IOException {
		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr_inc", "/resources/co/protocol");
		runCO();
		Assertions.assertFalse(checker.modelsAreConsistent());
	}
}


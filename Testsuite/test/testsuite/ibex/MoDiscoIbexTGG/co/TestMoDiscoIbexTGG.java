package testsuite.ibex.MoDiscoIbexTGG.co;

import testsuite.ibex.testUtil.COTestCase;

public class TestMoDiscoIbexTGG extends COTestCase {

//	public void createGenerator(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
//		CO_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper() /*new HiPERegistrationHelper()*/, new ViatraRegistrationHelper()});
//		checker = new CO_App("MoDiscoIbexTGG", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, ilpSolver);
//	}
//	
//	public void createTransformation(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
//		FWD_OPT_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper() /*new HiPERegistrationHelper()*/, new ViatraRegistrationHelper()});
//		forward = new FWD_OPT_App("MoDiscoIbexTGG", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, ilpSolver);
//	}
//	
//	public void createBackward(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
//		BWD_OPT_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper() /*new HiPERegistrationHelper()*/, new ViatraRegistrationHelper()});
//		backward = new BWD_OPT_App("MoDiscoIbexTGG", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, ilpSolver);
//	}
	
//	@Test
//	public void testFWD_OPT() throws IOException {
//		createTransformation("/resources/co/src", "/resources/co/trg-tmp", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
//		runFWD_OPT();
//		createGenerator("/resources/co/src", "/resources/co/trg-tmp", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
//		runCO();
//		Assertions.assertTrue(checker.modelsAreConsistent());
//	}
//	
//
//	@Test
//	public void testBWD_OPT() throws IOException {
//		createBackward("/resources/co/src-tmp", "/resources/co/trg", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
//		runBWD_OPT();
//		createGenerator("/resources/co/src-tmp", "/resources/co/trg", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
//		runCO();
//		Assertions.assertTrue(checker.modelsAreConsistent());
//	}
//	
//	@Test
//	public void testSimplePositive() throws IOException {
//		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr", "/resources/co/protocol");
//		runCO();
//		Assertions.assertTrue(checker.modelsAreConsistent());
//	}
//	
//	@Test
//	public void testMissingLink() throws IOException {
//		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr_inc", "/resources/co/protocol");
//		runCO();
//		Assertions.assertFalse(checker.modelsAreConsistent());
//	}
}
	
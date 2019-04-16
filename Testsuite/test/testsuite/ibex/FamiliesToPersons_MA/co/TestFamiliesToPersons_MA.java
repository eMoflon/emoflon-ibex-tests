package testsuite.ibex.FamiliesToPersons_MA.co;

import java.io.IOException;

import org.emoflon.ibex.tgg.operational.monitoring.GeneratedPatternsSizeObserver;
import org.emoflon.ibex.tgg.operational.monitoring.MemoryConsumptionObserver;
import org.emoflon.ibex.tgg.operational.monitoring.ModelSizeObserver;
import org.emoflon.ibex.tgg.operational.monitoring.NumberOfMatchesObserver;
import org.emoflon.ibex.tgg.run.familiestopersons_ma.BWD_OPT_App;
import org.emoflon.ibex.tgg.run.familiestopersons_ma.CO_App;
import org.emoflon.ibex.tgg.run.familiestopersons_ma.FWD_OPT_App;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import testsuite.ibex.testUtil.COTestCase;

public class TestFamiliesToPersons_MA extends COTestCase {

	 public void createGenerator(String srcInstance, String trgInstance, String corrInstance, String protInstance)
	            throws IOException {
	        checker = new CO_App("FamiliesToPersons_MA", testsuite.ibex.performance.util.PerformanceConstants.workspacePath,
	                false, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
	        checker.registerObserver(new GeneratedPatternsSizeObserver (checker));
	        checker.registerObserver(new ModelSizeObserver (checker));
	        checker.registerObserver(new NumberOfMatchesObserver (checker));
	        checker.registerObserver(new MemoryConsumptionObserver (checker));
	    }
	 
	    public void createTransformation(String srcInstance, String trgInstance, String corrInstance, String protInstance)
	            throws IOException {
	        forward = new FWD_OPT_App("FamiliesToPersons_MA",
	                testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance,
	                corrInstance, protInstance, this.ilpSolver);
	        forward.registerObserver(new GeneratedPatternsSizeObserver (forward));
	        forward.registerObserver(new ModelSizeObserver (forward));
	        forward.registerObserver(new NumberOfMatchesObserver (forward));
	        forward.registerObserver(new MemoryConsumptionObserver (forward));
	    }
	 
	    public void createBackward(String srcInstance, String trgInstance, String corrInstance, String protInstance)
	            throws IOException {
	        backward = new BWD_OPT_App("FamiliesToPersons_MA",
	                testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance,
	                corrInstance, protInstance, this.ilpSolver);
	        backward.registerObserver(new ModelSizeObserver (backward));
	        backward.registerObserver(new NumberOfMatchesObserver (backward));
	        backward.registerObserver(new MemoryConsumptionObserver (backward));
	    }
	
	@Test
	public void testFWD_OPT() throws IOException {
		createTransformation("/resources/co/src", "/resources/co/trg-tmp", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
		runFWD_OPT();
		createGenerator("/resources/co/src", "/resources/co/trg-tmp", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
		runCO();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Ignore("Appears to be non-deterministic")
	@Test
	public void testBWD_OPT() throws IOException {
		createBackward("/resources/co/src-tmp", "/resources/co/trg", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
		runBWD_OPT();
		createGenerator("/resources/co/src-tmp", "/resources/co/trg", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
		runCO();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testSimplePositive() throws IOException {
		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr", "/resources/co/protocol");
		runCO();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testAllPersonsMissing() throws IOException {
		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr_inc", "/resources/co/protocol");
		runCO();
		Assert.assertFalse(checker.modelsAreConsistent());
	}
}
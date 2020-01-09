package testsuite.ibex.FamiliesToPersons_V1.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.familiestopersons_v1.CC_App;
import org.emoflon.ibex.tgg.run.familiestopersons_v1.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.familiestopersons_v1.config.HiPERegistrationHelper;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class TestSimple extends CCTestCase {

	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		CC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper(), new HiPERegistrationHelper()});
		checker = new CC_App("FamiliesToPersons_V1", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, ilpSolver);
	}

	@Test
	public void testCreateSingleRegisters() throws IOException {
		createGenerator("singleFamilyReg", "singlePersonReg");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testCreateOneFather() throws IOException {
		createGenerator("singleFamilyWithFather", "PersonRegisterWithMalePerson");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
}

package testsuite.ibex.FamiliesToPersons_V1.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.familiestopersons_v1.CC_App;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimple extends CCTestCase {

	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("FamiliesToPersons_V1", testsuite.ibex.testUtil.Constants.workspacePath, true, srcInstance, trgInstance);
	}

	@Test
	public void testCreateThreeRegisters() throws IOException {
		createGenerator("threeFamilyReg", "threePersonReg");
		runGenerator();
		Assert.assertFalse(checker.modelsAreConsistent());
	}
	
	@Test
	public void testCreateSingleRegisters() throws IOException {
		createGenerator("singleFamilyReg", "singlePersonReg");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testCreateTwoFathers() throws IOException {
		createGenerator("twoFamiliesWithFathers", "PersonRegisterWith2MalePersons");
		runGenerator();
		Assert.assertFalse(checker.modelsAreConsistent());
	}
	
	@Test
	public void testCreateOneFather() throws IOException {
		createGenerator("singleFamilyWithFather", "PersonRegisterWithMalePerson");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
}

package testsuite1.VHDLTGGCodeAdapter.modelgen;

import java.io.IOException;

import org.benchmarx.mocaTree.core.MocaTreeFileComparator;
import org.benchmarx.vhdlModel.core.VHDLModelComparator;
import org.emoflon.ibex.tgg.run.vhdltggcodeadapter.MODELGEN_App;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import MocaTree.File;
import VHDLModel.VHDLSpecification;
import testsuite1.testUtil.ModelGenTestCase;

public class SyncResourcesTest extends ModelGenTestCase<File, VHDLSpecification> {

	private final static String projectName =  "VHDLTGGCodeAdapter";
	
	public SyncResourcesTest(Boolean flatten) {
		super(flatten);
	}

	@Override
	protected String getProjectName() {
		return projectName;
	}
	
	@BeforeClass
	public static void createGenerators() throws IOException {
		logger.info("Performing initialisation...");
		long toc = System.currentTimeMillis();
		
		flattenedGenerator = new MODELGEN_App(projectName, testsuite1.testUtil.Constants.workpacePath, true, false);
		normalGenerator = new MODELGEN_App(projectName, testsuite1.testUtil.Constants.workpacePath, false, false);
		
		long tic = System.currentTimeMillis();
		logger.info("done in: " + (tic - toc)/1000 + "s");
	}
	
	@Before
	public void reset() throws IOException {
		resetGenerator(flatten);
		sourceComp = new MocaTreeFileComparator(false);
		targetComp = new VHDLModelComparator(false);
	}
	
	@Test
	public void testFile2VHDLSpec() throws IOException {
		stop.setMaxRuleCount("File2VHDLSpec", 1);
		runGenerator(stop);
		assertPostcondition("in/File2VHDLSpec_FWD", "expected/File2VHDLSpec_FWD");
	}
	
	@Test
	public void testEntity2CompositeBlock() throws IOException {
		stop.setMaxRuleCount("File2VHDLSpec", 1);
		stop.setMaxRuleCount("Entity2CompositeBlock", 1);
		runGenerator(stop);
		assertPostcondition("in/Entity2CompositeBlock_FWD", "expected/Entity2CompositeBlock_FWD");
	}
}

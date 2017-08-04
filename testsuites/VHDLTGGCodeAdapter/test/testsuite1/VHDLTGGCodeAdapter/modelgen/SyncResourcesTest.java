package testsuite1.VHDLTGGCodeAdapter.modelgen;

import java.io.IOException;

import org.junit.Test;

public class SyncResourcesTest extends ModelGenTestCase {

	public SyncResourcesTest(String flatten) {
		super(flatten);
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

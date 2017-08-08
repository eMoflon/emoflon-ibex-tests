package testsuite1.VHDLTGGCodeAdapter.sync;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.benchmarx.vhdlModel.core.VHDLModelHelper;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import MocaTree.File;
import VHDLModel.VHDLSpecification;
import testsuite1.VHDLTGGCodeAdapter.sync.util.IbexVHDLTGGCodeAdapter;
import testsuite1.VHDLTGGCodeAdapter.sync.util.MocaTreeHelper;
import testsuite1.testUtil.SyncTestCase;


public class Batch extends SyncTestCase<File, VHDLSpecification> {
	private static final String projectName = "VHDLTGGCodeAdapter";
	
	private MocaTreeHelper helperMT;
	private VHDLModelHelper helperVHDL;
	
	public Batch(boolean flatten) {
		super(new IbexVHDLTGGCodeAdapter(flatten, projectName), flatten);
	}

	@Override
	protected void initHelpers() {
		helperMT = new MocaTreeHelper();
		helperVHDL = new VHDLModelHelper();
	}
	
	protected void assertPrecondition(String source, String target) {
		util.assertPrecondition(projectName+"/"+source, projectName+"/"+target);
	}
	
	protected void assertPostcondition(String source, String target) {
		util.assertPostcondition(projectName+"/"+source, projectName+"/"+target);
	}
	
	// IndexOutOfBoundsException mentioned in issue #15
	@Parameters(name="eMoflon::IBeX, Flattened: true")
	public static Collection<Boolean> flattening() throws IOException {
		return Arrays.asList(true);
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	// IndexOutOfBoundsException mentioned in issue #15
	public void testFile2VHDLSpec_BWD()
	{
		//------------

		//------------
		assertPostcondition("expected/File2VHDLSpec_BWD", "in/File2VHDLSpec_BWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	// IndexOutOfBoundsException mentioned in issue #15
	// Join Failed Exception mentioned in issue #16
	@Ignore("Does not work due to Join Failed exception")
	public void testEntity2CompositeBlock_FWD()
	{
		assertPrecondition("expected/File2VHDLSpec_BWD", "in/File2VHDLSpec_BWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute((File f) -> helperMT.createGateAndEntityNodes(f))
				.andThen(f -> helperMT.createGateNode(f, "A"))
				.andThen(f -> helperMT.createEntityNode(f, "A"))
		);
		//------------
		assertPostcondition("in/Entity2CompositeBlock_FWD", "expected/Entity2CompositeBlock_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	// IndexOutOfBoundsException mentioned in issue #15
	// Join Failed Exception mentioned in issue #16
	@Ignore("Does not work due to Join Failed exception")
	public void testEntity2CompositeBlock_BWD()
	{
		assertPrecondition("expected/File2VHDLSpec_BWD", "in/File2VHDLSpec_BWD");
		//------------
		tool.performAndPropagateTargetEdit(v -> helperVHDL.createTopLevelBlock(v, "A"));
		//------------
		assertPostcondition("expected/Entity2CompositeBlock_BWD", "in/Entity2CompositeBlock_BWD");
	}
	
	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	// IndexOutOfBoundsException mentioned in issue #15
	// Join Failed Exception mentioned in issue #16
	@Ignore("Does not work due to Join Failed exception")
	public void testNotGate_BWD()
	{
		assertPrecondition("expected/File2VHDLSpec_BWD", "in/File2VHDLSpec_BWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute((VHDLSpecification v) -> helperVHDL.createTopLevelBlock(v, "Example"))
				.andThen(v -> helperVHDL.createNotGate(v))
		);
		//------------
		assertPostcondition("expected/NotGate_BWD", "in/NotGate_BWD");
	}
}

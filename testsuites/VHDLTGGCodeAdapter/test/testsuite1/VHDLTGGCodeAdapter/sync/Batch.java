package testsuite1.VHDLTGGCodeAdapter.sync;

import org.benchmarx.BXTool;
import org.junit.Ignore;
import org.junit.Test;

import MocaTree.File;
import VHDLModel.VHDLSpecification;
import testsuite1.VHDLTGGCodeAdapter.sync.util.Decisions;
import testsuite1.VHDLTGGCodeAdapter.sync.util.SyncTestCase;


public class Batch extends SyncTestCase {

	public Batch(BXTool<File, VHDLSpecification, Decisions> tool) {
		super(tool);
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testFile2VHDLSpec_BWD()
	{
		//------------

		//------------
		util.assertPostcondition("expected/File2VHDLSpec_BWD", "in/File2VHDLSpec_BWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testEntity2CompositeBlock_FWD()
	{
		util.assertPrecondition("expected/File2VHDLSpec_BWD", "in/File2VHDLSpec_BWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute((File f) -> helperMT.createGateAndEntityNodes(f))
				.andThen(f -> helperMT.createGateNode(f, "A"))
				.andThen(f -> helperMT.createEntityNode(f, "A"))
		);
		//------------
		util.assertPostcondition("in/Entity2CompositeBlock_FWD", "expected/Entity2CompositeBlock_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testEntity2CompositeBlock_BWD()
	{
		util.assertPrecondition("expected/File2VHDLSpec_BWD", "in/File2VHDLSpec_BWD");
		//------------
		tool.performAndPropagateTargetEdit(v -> helperVHDL.createTopLevelBlock(v, "A"));
		//------------
		util.assertPostcondition("expected/Entity2CompositeBlock_BWD", "in/Entity2CompositeBlock_BWD");
	}

//	/**
//	 * <b>Features</b>: fwd
//	 */
//	@Test
//	public void testNotGate_FWD()
//	{
//		util.assertPrecondition("expected/File2VHDLSpec_BWD", "in/File2VHDLSpec_BWD");
//		//------------
//		tool.performAndPropagateSourceEdit(util.execute((File f) -> helperMT.createGateAndEntityNodes(f))
//				.andThen(f -> helperMT.createGateNode(f, "Example"))
//				.andThen(f -> helperMT.createEntityNode(f, "Example"))
//		);
//		//------------
//		util.assertPostcondition("in/NotGate_FWD", "expected/NotGate_FWD");
//	}
	
	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	@Ignore("Does not work due to missing NACs in the TGG")
	public void testNotGate_BWD()
	{
		util.assertPrecondition("expected/File2VHDLSpec_BWD", "in/File2VHDLSpec_BWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute((VHDLSpecification v) -> helperVHDL.createTopLevelBlock(v, "Example"))
				.andThen(v -> helperVHDL.createNotGate(v))
		);
		//------------
		util.assertPostcondition("expected/NotGate_BWD", "in/NotGate_BWD");
	}
}

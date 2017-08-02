package testsuite1.BlockDiagramCodeAdapter.sync;

import org.benchmarx.BXTool;
import org.junit.Ignore;
import org.junit.Test;

import BlockDiagram.BlockSystem;
import MocaTree.File;
import testsuite1.BlockDiagramCodeAdapter.sync.util.Decisions;
import testsuite1.BlockDiagramCodeAdapter.sync.util.SyncTestCase;


public class AlignmentBased extends SyncTestCase {

	/** Currently, some of these tests fail due to Assertion Error in Democles*/
	public AlignmentBased(BXTool<BlockSystem, File, Decisions> tool) {
		super(tool);
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testSystemToNode_FWD()
	{
		// No precondition!
		//------------
		//------------
		util.assertPostcondition("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	@Ignore("Waiting for Fix related to democles issue #14")
	public void testProvideToNode_FWD()
	{
		util.assertPrecondition("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
		//------------
		tool.performAndPropagateSourceEdit(bs -> helperBlock.createBlock(bs, "A"));
		tool.performAndPropagateSourceEdit(bs -> helperBlock.createProvidePortInFirstBlock(bs, "5"));
		//------------
		util.assertPostcondition("in/ProvideToNode_FWD", "expected/ProvideToNode_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testProvideToNode_BWD()
	{
		util.assertPrecondition("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
		//------------
		tool.performAndPropagateTargetEdit(f -> helperMT.createBlockNode(f, "A"));
		tool.performAndPropagateTargetEdit(f -> helperMT.createPortNodeInFirstBlockNode(f, "PROVIDE", "5"));
		//------------
		util.assertPostcondition("expected/ProvideToNode_BWD", "in/ProvideToNode_BWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	@Ignore("Waiting for Fix related to democles issue #14")
	public void testRequireToNode_FWD()
	{
		util.assertPrecondition("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
		//------------
		tool.performAndPropagateSourceEdit(bs -> helperBlock.createBlock(bs, "A"));
		tool.performAndPropagateSourceEdit(bs -> helperBlock.createRequirePortInFirstBlock(bs, "1"));
		//------------
		util.assertPostcondition("in/RequireToNode_FWD", "expected/RequireToNode_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testRequireToNode_BWD()
	{
		util.assertPrecondition("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
		//------------
		tool.performAndPropagateTargetEdit(f -> helperMT.createBlockNode(f, "A"));
		tool.performAndPropagateTargetEdit(f -> helperMT.createPortNodeInFirstBlockNode(f, "REQUIRE", "1"));
		//------------
		util.assertPostcondition("expected/RequireToNode_BWD", "in/RequireToNode_BWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	@Ignore("Waiting for Fix related to democles issue #14")
	public void testConnectorToNode_FWD()
	{
		util.assertPrecondition("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
		//------------
		tool.performAndPropagateSourceEdit(bs -> helperBlock.createBlock(bs, "A"));
		tool.performAndPropagateSourceEdit(bs -> helperBlock.createProvidePortInFirstBlock(bs, "5"));
		tool.performAndPropagateSourceEdit(bs -> helperBlock.createBlock(bs, "B"));
		tool.performAndPropagateSourceEdit(bs -> helperBlock.createRequirePortInBlock(bs, "5", 1));
		tool.performAndPropagateSourceEdit(bs -> helperBlock.createConnectorBetweenFirstTwoBlocks(bs));
		//------------
		util.assertPostcondition("in/ConnectorToNode_FWD", "expected/ConnectorToNode_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testConnectorToNode_BWD()
	{
		util.assertPrecondition("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
		//------------
		tool.performAndPropagateTargetEdit(f -> helperMT.createBlockNode(f, "A"));
		tool.performAndPropagateTargetEdit(f -> helperMT.createBlockNode(f, "B"));
		tool.performAndPropagateTargetEdit(f -> helperMT.createPortNodeInFirstBlockNode(f, "PROVIDE", "5"));
		tool.performAndPropagateTargetEdit(f -> helperMT.createPortNodeInBlockNode(f, "REQUIRE", "2", 1));
		tool.performAndPropagateTargetEdit(f -> helperMT.createConnectorNodeBetweenFirstTwoBlockNodes(f));
		//------------
		util.assertPostcondition("expected/ConnectorToNode_BWD", "in/ConnectorToNode_BWD");
	}
	
}

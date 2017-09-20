package testsuite.ibex.BlockDiagramCodeAdapter.sync;

import org.benchmarx.blockDiagram.core.BlockDiagramHelper;
import org.benchmarx.mocaTree.core.MocaTreeHelperForBlockDiagramCode;
import org.junit.Test;

import BlockDiagram.BlockSystem;
import MocaTree.File;
import testsuite.ibex.BlockDiagramCodeAdapter.sync.util.IbexBlockDiagramCodeAdapter;


public class AlignmentBased extends testsuite.ibex.testUtil.SyncTestCase<BlockSystem, File> {
	private static final String projectName = "BlockDiagramCodeAdapter";
	
	BlockDiagramHelper helperBlock;
	MocaTreeHelperForBlockDiagramCode helperMT;

	/** Currently, some of these tests fail due to Assertion Error in Democles*/
	public AlignmentBased(boolean flatten) {
		super(new IbexBlockDiagramCodeAdapter(flatten, projectName), flatten);
	}
	
	protected void initHelpers() {
		helperBlock = new BlockDiagramHelper();
		helperMT = new MocaTreeHelperForBlockDiagramCode();
	}
	
	@Override
	protected String getProjectName() {
		return projectName;
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
		assertPostcondition("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testProvideToNode_FWD()
	{
		assertPrecondition("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
		//------------
		tool.performAndPropagateSourceEdit(bs -> helperBlock.createBlock(bs, "A"));
		tool.performAndPropagateSourceEdit(bs -> helperBlock.createProvidePortInFirstBlock(bs, "5"));
		//------------
		assertPostcondition("in/ProvideToNode_FWD", "expected/ProvideToNode_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testProvideToNode_BWD()
	{
		assertPrecondition("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
		//------------
		tool.performAndPropagateTargetEdit(f -> helperMT.createBlockNode(f, "A"));
		tool.performAndPropagateTargetEdit(f -> helperMT.createPortNodeInFirstBlockNode(f, "PROVIDE", "5"));
		//------------
		assertPostcondition("expected/ProvideToNode_BWD", "in/ProvideToNode_BWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testRequireToNode_FWD()
	{
		assertPrecondition("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
		//------------
		tool.performAndPropagateSourceEdit(bs -> helperBlock.createBlock(bs, "A"));
		tool.performAndPropagateSourceEdit(bs -> helperBlock.createRequirePortInFirstBlock(bs, "1"));
		//------------
		assertPostcondition("in/RequireToNode_FWD", "expected/RequireToNode_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testRequireToNode_BWD()
	{
		assertPrecondition("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
		//------------
		tool.performAndPropagateTargetEdit(f -> helperMT.createBlockNode(f, "A"));
		tool.performAndPropagateTargetEdit(f -> helperMT.createPortNodeInFirstBlockNode(f, "REQUIRE", "1"));
		//------------
		assertPostcondition("expected/RequireToNode_BWD", "in/RequireToNode_BWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testConnectorToNode_FWD()
	{
		assertPrecondition("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
		//------------
		tool.performAndPropagateSourceEdit(bs -> helperBlock.createBlock(bs, "A"));
		tool.performAndPropagateSourceEdit(bs -> helperBlock.createProvidePortInFirstBlock(bs, "5"));
		tool.performAndPropagateSourceEdit(bs -> helperBlock.createBlock(bs, "B"));
		tool.performAndPropagateSourceEdit(bs -> helperBlock.createRequirePortInBlock(bs, "2", 1));
		tool.performAndPropagateSourceEdit(bs -> helperBlock.createConnectorBetweenFirstTwoBlocks(bs));
		//------------
		assertPostcondition("in/ConnectorToNode_FWD", "expected/ConnectorToNode_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testConnectorToNode_BWD()
	{
		assertPrecondition("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
		//------------
		tool.performAndPropagateTargetEdit(f -> helperMT.createBlockNode(f, "A"));
		tool.performAndPropagateTargetEdit(f -> helperMT.createBlockNode(f, "B"));
		tool.performAndPropagateTargetEdit(f -> helperMT.createPortNodeInFirstBlockNode(f, "PROVIDE", "5"));
		tool.performAndPropagateTargetEdit(f -> helperMT.createPortNodeInBlockNode(f, "REQUIRE", "2", 1));
		tool.performAndPropagateTargetEdit(f -> helperMT.createConnectorNodeBetweenFirstTwoBlockNodes(f));
		//------------
		assertPostcondition("expected/ConnectorToNode_BWD", "in/ConnectorToNode_BWD");
	}
	
}

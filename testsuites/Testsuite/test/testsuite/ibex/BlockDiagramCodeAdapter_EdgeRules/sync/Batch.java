package testsuite.ibex.BlockDiagramCodeAdapter_EdgeRules.sync;

import org.benchmarx.blockDiagram.core.BlockDiagramHelper;
import org.benchmarx.mocaTree.core.MocaTreeHelperForBlockDiagramCode;
import org.junit.Test;

import BlockDiagram.BlockSystem;
import MocaTree.File;
import testsuite.ibex.BlockDiagramCodeAdapter_EdgeRules.sync.util.IbexBlockDiagramCodeAdapter;




public class Batch extends testsuite.ibex.testUtil.SyncTestCase<BlockSystem, File> {
	private static final String projectName = "BlockDiagramCodeAdapter_EdgeRules";
	
	BlockDiagramHelper helperBlock;
	MocaTreeHelperForBlockDiagramCode helperMT;

	/** Currently, some of these tests fail due to Assertion Error in Democles*/
	public Batch() {
		super(new IbexBlockDiagramCodeAdapter(projectName));
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
	public void testBlockToNode_FWD()
	{
		assertPrecondition("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
		//------------
		tool.performAndPropagateSourceEdit(bs -> helperBlock.createBlock(bs, "A"));
		//------------
		assertPostcondition("in/BlockToNode_FWD", "expected/BlockToNode_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testBlockToNode_BWD()
	{
		assertPrecondition("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
		//------------
		tool.performAndPropagateTargetEdit(f -> helperMT.createBlockNode(f, "A"));
		//------------
		assertPostcondition("expected/BlockToNode_BWD", "in/BlockToNode_BWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testProvideToNode_FWD()
	{
		assertPrecondition("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (BlockSystem bs) -> helperBlock.createBlock(bs, "A"))
		   .andThen(bs -> helperBlock.createProvidePortInFirstBlock(bs, "5"))
		);
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
		tool.performAndPropagateTargetEdit(util.execute( (File f) -> helperMT.createBlockNode(f, "A"))
			.andThen(f -> helperMT.createPortNodeInFirstBlockNode(f, "PROVIDE", "5"))
		);
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
		tool.performAndPropagateSourceEdit(util.execute( (BlockSystem bs) -> helperBlock.createBlock(bs, "A"))
		   .andThen(bs -> helperBlock.createRequirePortInFirstBlock(bs, "1"))
		);
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
		tool.performAndPropagateTargetEdit(util.execute( (File f) -> helperMT.createBlockNode(f, "A"))
			.andThen(f -> helperMT.createPortNodeInFirstBlockNode(f, "REQUIRE", "1"))
		);
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
		tool.performAndPropagateSourceEdit(util.execute( (BlockSystem bs) -> helperBlock.createBlock(bs, "A"))
		   .andThen(bs -> helperBlock.createProvidePortInFirstBlock(bs, "5"))
		   .andThen(bs -> helperBlock.createBlock(bs, "B"))
		   .andThen(bs -> helperBlock.createRequirePortInBlock(bs, "2", 1))
		   .andThen(bs -> helperBlock.createConnectorBetweenFirstTwoBlocks(bs))
		);
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
		tool.performAndPropagateTargetEdit(util.execute( (File f) -> helperMT.createBlockNode(f, "A"))
			.andThen(f -> helperMT.createBlockNode(f, "B"))
			.andThen(f -> helperMT.createPortNodeInFirstBlockNode(f, "PROVIDE", "5"))
			.andThen(f -> helperMT.createPortNodeInBlockNode(f, "REQUIRE", "2", 1))
			.andThen(f -> helperMT.createConnectorNodeBetweenFirstTwoBlockNodes(f))
		);
		//------------
		assertPostcondition("expected/ConnectorToNode_BWD", "in/ConnectorToNode_BWD");
	}
	
}

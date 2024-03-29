package testsuite.ibex.BlockCodeAdapter.sync;

import org.benchmarx.blockLanguage.core.BlockLanguageHelper;
import org.benchmarx.mocaTree.core.MocaTreeHelperForBlockCode;
import org.junit.jupiter.api.Test;

import BlockLanguage.Specification;
import MocaTree.File;
import testsuite.ibex.BlockCodeAdapter.sync.util.IbexBlockCodeAdapter;
import testsuite.ibex.testUtil.SyncTestCase;


public class AlignmentBased extends SyncTestCase<File, Specification> {
	private static final String projectName = "BlockCodeAdapter";
	
	private MocaTreeHelperForBlockCode helperMT;
	private BlockLanguageHelper helperBlock;
	
	public AlignmentBased() {
		super(new IbexBlockCodeAdapter(projectName));
	}
	
	protected void initHelpers() {
		helperMT = new MocaTreeHelperForBlockCode();
		helperBlock = new BlockLanguageHelper();
	}
	
	@Override
	protected String getProjectName() {
		return projectName;
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testPort_FWD()
	{
		assertPrecondition("expected/Spec_BWD", "in/Spec_BWD");
		//------------
		tool.performAndPropagateSourceEdit(f -> helperMT.createBlockNode(f, "block"));
		tool.performAndPropagateSourceEdit(f -> helperMT.createPortNode(f, "0", 0));
		//------------
		assertPostcondition("in/Port_FWD", "expected/Port_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testPort_BWD()
	{
		assertPrecondition("expected/Spec_BWD", "in/Spec_BWD");
		//------------
		tool.performAndPropagateTargetEdit(s -> helperBlock.createBlock(s, "block"));
		tool.performAndPropagateTargetEdit(s -> helperBlock.createPort(s, 0, 0));
		//------------
		assertPostcondition("expected/Port_BWD", "in/Port_BWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testWire_FWD()
	{
		assertPrecondition("expected/Spec_BWD", "in/Spec_BWD");
		//------------
		tool.performAndPropagateSourceEdit(f -> helperMT.createBlockNode(f, "block1"));
		tool.performAndPropagateSourceEdit(f -> helperMT.createBlockNode(f, "block2"));
		tool.performAndPropagateSourceEdit(f -> helperMT.createPortNode(f, "1", 0));
		tool.performAndPropagateSourceEdit(f -> helperMT.createPortNode(f, "2", 1));
		tool.performAndPropagateSourceEdit(f -> helperMT.createWireNodes(f, "1", "2"));
		//------------
		assertPostcondition("in/Wire_FWD", "expected/Wire_FWD");
	}
	
	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testWire_BWD()
	{
		assertPrecondition("expected/Spec_BWD", "in/Spec_BWD");
		//------------
		tool.performAndPropagateTargetEdit(s -> helperBlock.createBlock(s, "block1"));
		tool.performAndPropagateTargetEdit(s -> helperBlock.createBlock(s, "block2"));
		tool.performAndPropagateTargetEdit(s -> helperBlock.createPort(s, 1, 0));
		tool.performAndPropagateTargetEdit(s -> helperBlock.createPort(s, 2, 1));
		tool.performAndPropagateTargetEdit(s -> helperBlock.createWire(s, 0, 0, 1, 0));
		//------------
		assertPostcondition("expected/Wire_BWD", "in/Wire_BWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testWireCloseLoop_FWD()
	{
		assertPrecondition("expected/Spec_BWD", "in/Spec_BWD");
		//------------
		tool.performAndPropagateSourceEdit(f -> helperMT.createBlockNode(f, "block"));
		tool.performAndPropagateSourceEdit(f -> helperMT.createPortNode(f, "1", 0));
		tool.performAndPropagateSourceEdit(f -> helperMT.createPortNode(f, "2", 0));
		tool.performAndPropagateSourceEdit(f -> helperMT.createWireNodes(f, "1", "2"));
		//------------
		assertPostcondition("in/WireCloseLoop_FWD", "expected/WireCloseLoop_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testWireCloseLoop_BWD()
	{
		assertPrecondition("expected/Spec_BWD", "in/Spec_BWD");
		//------------
		tool.performAndPropagateTargetEdit(s -> helperBlock.createBlock(s, "block"));
		tool.performAndPropagateTargetEdit(s -> helperBlock.createPort(s, 1, 0));
		tool.performAndPropagateTargetEdit(s -> helperBlock.createPort(s, 2, 0));
		tool.performAndPropagateTargetEdit(s -> helperBlock.createWire(s, 0, 0, 0, 1));
		//------------
		assertPostcondition("expected/WireCloseLoop_BWD", "in/WireCloseLoop_BWD");
	}
}

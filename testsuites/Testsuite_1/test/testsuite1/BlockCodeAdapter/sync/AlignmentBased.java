package testsuite1.BlockCodeAdapter.sync;

import org.benchmarx.blockLanguage.core.BlockLanguageHelper;
import org.junit.Test;

import BlockLanguage.Specification;
import MocaTree.File;
import testsuite1.BlockCodeAdapter.sync.util.IbexBlockCodeAdapter;
import testsuite1.BlockCodeAdapter.sync.util.MocaTreeHelper;
import testsuite1.testUtil.SyncTestCase;


public class AlignmentBased extends SyncTestCase<File, Specification> {
	private static final String projectName = "BlockCodeAdapter";
	
	private MocaTreeHelper helperMT;
	private BlockLanguageHelper helperBlock;
	
	public AlignmentBased(boolean flatten) {
		super(new IbexBlockCodeAdapter(flatten, projectName), flatten);
	}
	
	protected void initHelpers() {
		helperMT = new MocaTreeHelper();
		helperBlock = new BlockLanguageHelper();
	}
	
	protected void assertPrecondition(String source, String target) {
		util.assertPrecondition(projectName+"/"+source, projectName+"/"+target);
	}
	
	protected void assertPostcondition(String source, String target) {
		util.assertPostcondition(projectName+"/"+source, projectName+"/"+target);
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

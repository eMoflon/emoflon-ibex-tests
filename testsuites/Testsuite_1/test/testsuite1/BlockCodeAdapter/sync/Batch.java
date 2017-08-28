package testsuite1.BlockCodeAdapter.sync;

import org.benchmarx.blockLanguage.core.BlockLanguageHelper;
import org.junit.Test;

import BlockLanguage.Specification;
import MocaTree.File;
import testsuite1.BlockCodeAdapter.sync.util.IbexBlockCodeAdapter;
import testsuite1.BlockCodeAdapter.sync.util.MocaTreeHelper;
import testsuite1.testUtil.SyncTestCase;

public class Batch extends SyncTestCase<File, Specification> {
	private static final String projectName = "BlockCodeAdapter";
	
	private MocaTreeHelper helperMT;
	private BlockLanguageHelper helperBlock;
	
	public Batch(boolean flatten) {
		super(new IbexBlockCodeAdapter(flatten, projectName), flatten);
	}
	
	protected void initHelpers() {
		helperMT = new MocaTreeHelper();
		helperBlock = new BlockLanguageHelper();
	}
	
	@Override
	protected String getProjectName() {
		return projectName;
	}
	
	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testSpec_BWD()
	{
		// No precondition!
		//------------
		//------------
		assertPostcondition("expected/Spec_BWD", "in/Spec_BWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testBlock_FWD()
	{
		assertPrecondition("expected/Spec_BWD", "in/Spec_BWD");
		//------------
		tool.performAndPropagateSourceEdit(f -> helperMT.createBlockNode(f, "block"));
		//------------
		assertPostcondition("in/Block_FWD", "expected/Block_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testBlock_BWD()
	{
		assertPrecondition("expected/Spec_BWD", "in/Spec_BWD");
		//------------
		tool.performAndPropagateTargetEdit(s -> helperBlock.createBlock(s, "block"));
		//------------
		assertPostcondition("expected/Block_BWD", "in/Block_BWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testPort_FWD()
	{
		assertPrecondition("expected/Spec_BWD", "in/Spec_BWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute((File f) -> helperMT.createBlockNode(f, "block"))
			.andThen(f -> helperMT.createPortNode(f, "0", 0))
		);
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
		tool.performAndPropagateTargetEdit(util.execute((Specification s) -> helperBlock.createBlock(s, "block"))
			.andThen(s -> helperBlock.createPort(s, 0, 0))
		);
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
		tool.performAndPropagateSourceEdit(util.execute((File f) -> helperMT.createBlockNode(f, "block1"))
			.andThen(f -> helperMT.createBlockNode(f, "block2"))
			.andThen(f -> helperMT.createPortNode(f, "1", 0))
			.andThen(f -> helperMT.createPortNode(f, "2", 1))
			.andThen(f -> helperMT.createWireNodes(f, "1", "2"))
		);
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
		tool.performAndPropagateTargetEdit(util.execute((Specification s) -> helperBlock.createBlock(s, "block1"))
			.andThen(s -> helperBlock.createBlock(s, "block2"))
			.andThen(s -> helperBlock.createPort(s, 1, 0))
			.andThen(s -> helperBlock.createPort(s, 2, 1))
			.andThen(s -> helperBlock.createWire(s, 0, 0, 1, 0))
		);
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
		tool.performAndPropagateSourceEdit(util.execute((File f) -> helperMT.createBlockNode(f, "block"))
			.andThen(f -> helperMT.createPortNode(f, "1", 0))
			.andThen(f -> helperMT.createPortNode(f, "2", 0))
			.andThen(f -> helperMT.createWireNodes(f, "1", "2"))
		);
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
		tool.performAndPropagateTargetEdit(util.execute((Specification s) -> helperBlock.createBlock(s, "block"))
			.andThen(s -> helperBlock.createPort(s, 1, 0))
			.andThen(s -> helperBlock.createPort(s, 2, 0))
			.andThen(s -> helperBlock.createWire(s, 0, 0, 0, 1))
		);
		//------------
		assertPostcondition("expected/WireCloseLoop_BWD", "in/WireCloseLoop_BWD");
	}
}

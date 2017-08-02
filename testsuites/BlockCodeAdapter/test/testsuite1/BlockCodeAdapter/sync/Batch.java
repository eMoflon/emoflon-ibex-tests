package testsuite1.BlockCodeAdapter.sync;

import org.benchmarx.BXTool;
import org.junit.Ignore;
import org.junit.Test;

import BlockLanguage.Specification;
import MocaTree.File;
import testsuite1.BlockCodeAdapter.sync.util.SyncTestCase;
import testsuite1.BlockCodeAdapter.sync.util.Decisions;

public class Batch extends SyncTestCase {
	
	public Batch(BXTool<File, Specification, Decisions> tool) {
		super(tool);
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
		util.assertPostcondition("expected/Spec_BWD", "in/Spec_BWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testBlock_FWD()
	{
		util.assertPrecondition("expected/Spec_BWD", "in/Spec_BWD");
		//------------
		tool.performAndPropagateSourceEdit(f -> helperMT.createBlockNode(f, "block"));
		//------------
		util.assertPostcondition("in/Block_FWD", "expected/Block_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testBlock_BWD()
	{
		util.assertPrecondition("expected/Spec_BWD", "in/Spec_BWD");
		//------------
		tool.performAndPropagateTargetEdit(s -> helperBlock.createBlock(s, "block"));
		//------------
		util.assertPostcondition("expected/Block_BWD", "in/Block_BWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	@Ignore("Waiting for Fix related to democles issue #14")
	public void testPort_FWD()
	{
		util.assertPrecondition("expected/Spec_BWD", "in/Spec_BWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute((File f) -> helperMT.createBlockNode(f, "block"))
			.andThen(f -> helperMT.createPortNode(f, "0", 0))
		);
		//------------
		util.assertPostcondition("in/Port_FWD", "expected/Port_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testPort_BWD()
	{
		util.assertPrecondition("expected/Spec_BWD", "in/Spec_BWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute((Specification s) -> helperBlock.createBlock(s, "block"))
			.andThen(s -> helperBlock.createPort(s, 0, 0))
		);
		//------------
		util.assertPostcondition("expected/Port_BWD", "in/Port_BWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	@Ignore("Waiting for Fix related to democles issue #14")
	public void testWire_FWD()
	{
		util.assertPrecondition("expected/Spec_BWD", "in/Spec_BWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute((File f) -> helperMT.createBlockNode(f, "block1"))
			.andThen(f -> helperMT.createBlockNode(f, "block2"))
			.andThen(f -> helperMT.createPortNode(f, "1", 0))
			.andThen(f -> helperMT.createPortNode(f, "2", 1))
			.andThen(f -> helperMT.createWireNodes(f, "1", "2"))
		);
		//------------
		util.assertPostcondition("in/Wire_FWD", "expected/Wire_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testWire_BWD()
	{
		util.assertPrecondition("expected/Spec_BWD", "in/Spec_BWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute((Specification s) -> helperBlock.createBlock(s, "block1"))
			.andThen(s -> helperBlock.createBlock(s, "block2"))
			.andThen(s -> helperBlock.createPort(s, 1, 0))
			.andThen(s -> helperBlock.createPort(s, 2, 1))
			.andThen(s -> helperBlock.createWire(s, 0, 0, 1, 0))
		);
		//------------
		util.assertPostcondition("expected/Wire_BWD", "in/Wire_BWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	@Ignore("Waiting for Fix related to democles issue #14")
	public void testWireCloseLoop_FWD()
	{
		util.assertPrecondition("expected/Spec_BWD", "in/Spec_BWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute((File f) -> helperMT.createBlockNode(f, "block"))
			.andThen(f -> helperMT.createPortNode(f, "1", 0))
			.andThen(f -> helperMT.createPortNode(f, "2", 0))
			.andThen(f -> helperMT.createWireNodes(f, "1", "2"))
		);
		//------------
		util.assertPostcondition("in/WireCloseLoop_FWD", "expected/WireCloseLoop_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testWireCloseLoop_BWD()
	{
		util.assertPrecondition("expected/Spec_BWD", "in/Spec_BWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute((Specification s) -> helperBlock.createBlock(s, "block"))
			.andThen(s -> helperBlock.createPort(s, 1, 0))
			.andThen(s -> helperBlock.createPort(s, 2, 0))
			.andThen(s -> helperBlock.createWire(s, 0, 0, 0, 1))
		);
		//------------
		util.assertPostcondition("expected/WireCloseLoop_BWD", "in/WireCloseLoop_BWD");
	}
}

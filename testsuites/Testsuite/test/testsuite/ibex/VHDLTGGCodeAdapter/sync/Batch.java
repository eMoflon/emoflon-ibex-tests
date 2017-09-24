package testsuite.ibex.VHDLTGGCodeAdapter.sync;

import org.benchmarx.mocaTree.core.MocaTreeHelperForVHDLTGGCode;
import org.benchmarx.vhdlModel.core.VHDLModelHelper;
import org.junit.Ignore;
import org.junit.Test;

import MocaTree.File;
import VHDLModel.VHDLSpecification;
import testsuite.ibex.VHDLTGGCodeAdapter.sync.util.IbexVHDLTGGCodeAdapter;
import testsuite.ibex.testUtil.SyncTestCase;


public class Batch extends SyncTestCase<File, VHDLSpecification> {
	private static final String projectName = "VHDLTGGCodeAdapter";
	
	private MocaTreeHelperForVHDLTGGCode helperMT;
	private VHDLModelHelper helperVHDL;
	
	public Batch() {
		super(new IbexVHDLTGGCodeAdapter(projectName));
	}

	@Override
	protected void initHelpers() {
		helperMT = new MocaTreeHelperForVHDLTGGCode();
		helperVHDL = new VHDLModelHelper();
	}
	
	@Override
	protected String getProjectName() {
		return projectName;
	}

	/**
	 * <b>Features</b>: bwd
	 */
	//FIXME [Greg]: https://github.com/eMoflon/emoflon-ibex-democles/issues/17
	@Ignore("Takes way too long...")
	@Test
	public void testFile2VHDLSpec_BWD()
	{
		//------------

		//------------
		assertPostcondition("expected/File2VHDLSpec_BWD", "in/File2VHDLSpec_BWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	//FIXME [Greg]: https://github.com/eMoflon/emoflon-ibex-democles/issues/17
	@Ignore("Takes way too long...")
	@Test
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
	//FIXME [Greg]: https://github.com/eMoflon/emoflon-ibex-democles/issues/17
	@Ignore("Takes way too long...")
	@Test
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
	//FIXME [Greg]: https://github.com/eMoflon/emoflon-ibex-democles/issues/17
	@Ignore("Takes way too long...")
	@Test
	public void testNotGate_BWD()
	{
		assertPrecondition("expected/File2VHDLSpec_BWD", "in/File2VHDLSpec_BWD");
		//------------
		tool.performAndPropagateTargetEdit(
				util.execute((VHDLSpecification v) -> helperVHDL.createTopLevelBlock(v, "Example"))
				    .andThen(v -> helperVHDL.createNotGate(v))
		);
		//------------
		assertPostcondition("expected/NotGate_BWD", "in/NotGate_BWD");
	}
}

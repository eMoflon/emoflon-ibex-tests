package testsuite.ibex.ProcessCodeAdapter.sync;

import org.benchmarx.mocaTree.core.MocaTreeHelperForProcessCode;
import org.benchmarx.processDefinition.core.ProcessDefinitionHelper;
import org.junit.jupiter.api.Test;

import MocaTree.Folder;
import ProcessDefinition.SystemModule;
import testsuite.ibex.ProcessCodeAdapter.sync.util.IbexProcessCodeAdapter;
import testsuite.ibex.testUtil.SyncTestCase;

public class Batch extends SyncTestCase<Folder, SystemModule> {
	private static final String projectName = "ProcessCodeAdapter";
	
	private MocaTreeHelperForProcessCode helperMoca;
	private ProcessDefinitionHelper helperProcess;

	public Batch() {
		super(new IbexProcessCodeAdapter(projectName));
	}
	
	@Override
	protected void initHelpers() {
		helperMoca = new MocaTreeHelperForProcessCode();
		helperProcess = new ProcessDefinitionHelper();
	}
	
	@Override
	protected String getProjectName() {
		return projectName;
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testSystemModule_FWD()
	{
		//------------

		//------------
		assertPostcondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testModules_FWD()
	{
		assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute((Folder f) -> helperMoca.createSubFolder(f, "A", 0))
				.andThen(f -> helperMoca.createSubFolder(f, "B", 0))
		);
		//------------
		assertPostcondition("in/Modules_FWD", "expected/Modules_FWD");
	}
	
	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testModules_BWD()
	{
		assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute((SystemModule sm) -> helperProcess.createSubModule(sm, "A"))
				.andThen(sm -> helperProcess.createSubModule(sm, "B"))
		);
		//------------
		assertPostcondition("expected/Modules_BWD", "in/Modules_BWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testTasks_FWD()
	{
		assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute((Folder f) -> helperMoca.createSubFolder(f, "A", 0))
				.andThen(f -> helperMoca.createSubFolder(f, "B", 0))
				.andThen(f -> helperMoca.createFile(f, "1.proc", 0))
				.andThen(f -> helperMoca.createFile(f, "2.proc", 1))
				.andThen(f -> helperMoca.createRootNode(f, "TASK", 0, 0))
				.andThen(f -> helperMoca.createRootNode(f, "TASK", 1, 0))
				.andThen(f -> helperMoca.createSubNode(f, "IMPORTS", 0, 0))
				.andThen(f -> helperMoca.createSubNode(f, "IMPORTS", 1, 0))
				.andThen(f -> helperMoca.createSubNode(f, "INVOCATIONS", 0, 0))
				.andThen(f -> helperMoca.createSubNode(f, "INVOCATIONS", 1, 0))
		);
		//------------
		assertPostcondition("in/Tasks_FWD", "expected/Tasks_FWD");
	}
	
	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testTasks_BWD()
	{
		assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute((SystemModule sm) -> helperProcess.createSubModule(sm, "A"))
				.andThen(sm -> helperProcess.createSubModule(sm, "B"))
				.andThen(sm -> helperProcess.createTask(sm, "1", 0))
				.andThen(sm -> helperProcess.createTask(sm, "2", 1))
		);
		//------------
		assertPostcondition("expected/Tasks_BWD", "in/Tasks_BWD");
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testImport_FWD()
	{
		assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute((Folder f) -> helperMoca.createSubFolder(f, "A", 0))
				.andThen(f -> helperMoca.createSubFolder(f, "B", 0))
				.andThen(f -> helperMoca.createFile(f, "1.proc", 0))
				.andThen(f -> helperMoca.createFile(f, "2.proc", 1))
				.andThen(f -> helperMoca.createRootNode(f, "TASK", 0, 0))
				.andThen(f -> helperMoca.createRootNode(f, "TASK", 1, 0))
				.andThen(f -> helperMoca.createSubNode(f, "IMPORTS", 0, 0))
				.andThen(f -> helperMoca.createSubNode(f, "IMPORTS", 1, 0))
				.andThen(f -> helperMoca.createSubNode(f, "INVOCATIONS", 0, 0))
				.andThen(f -> helperMoca.createSubNode(f, "INVOCATIONS", 1, 0))
				.andThen(f -> helperMoca.createSubSubNode(f, "B", 0, 0, 0))
		);
		//------------
		assertPostcondition("in/Import_FWD", "expected/Import_FWD");
	}
	
	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testImport_BWD()
	{
		assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute((SystemModule sm) -> helperProcess.createSubModule(sm, "A"))
				.andThen(sm -> helperProcess.createSubModule(sm, "B"))
				.andThen(sm -> helperProcess.createTask(sm, "1", 0))
				.andThen(sm -> helperProcess.createTask(sm, "2", 1))
				.andThen(sm -> helperProcess.createImport(sm, 0, 0, 1))
		);
		//------------
		assertPostcondition("expected/Import_BWD", "in/Import_BWD");
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testInvocationSameModule_FWD()
	{
		assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute((Folder f) -> helperMoca.createSubFolder(f, "A", 0))
				.andThen(f -> helperMoca.createFile(f, "1.proc", 0))
				.andThen(f -> helperMoca.createFile(f, "2.proc", 0))
				.andThen(f -> helperMoca.createRootNode(f, "TASK", 0, 0))
				.andThen(f -> helperMoca.createRootNode(f, "TASK", 0, 1))
				.andThen(f -> helperMoca.createSubNode(f, "IMPORTS", 0, 0))
				.andThen(f -> helperMoca.createSubNode(f, "IMPORTS", 0, 1))
				.andThen(f -> helperMoca.createSubNode(f, "INVOCATIONS", 0, 0))
				.andThen(f -> helperMoca.createSubNode(f, "INVOCATIONS", 0, 1))
				.andThen(f -> helperMoca.createSubSubNode(f, "2", 0, 0, 1))
		);
		//------------
		assertPostcondition("in/InvocationSameModule_FWD", "expected/InvocationSameModule_FWD");
	}
	
	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testInvocationSameModule_BWD()
	{
		assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute((SystemModule sm) -> helperProcess.createSubModule(sm, "A"))
				.andThen(sm -> helperProcess.createTask(sm, "1", 0))
				.andThen(sm -> helperProcess.createTask(sm, "2", 0))
				.andThen(sm -> helperProcess.createInvocation(sm, 0, 0, 0, 1))
		);
		//------------
		assertPostcondition("expected/InvocationSameModule_BWD", "in/InvocationSameModule_BWD");
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testInvocationOtherModule_FWD()
	{
		assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute((Folder f) -> helperMoca.createSubFolder(f, "A", 0))
				.andThen(f -> helperMoca.createSubFolder(f, "B", 0))
				.andThen(f -> helperMoca.createFile(f, "1.proc", 0))
				.andThen(f -> helperMoca.createFile(f, "2.proc", 1))
				.andThen(f -> helperMoca.createRootNode(f, "TASK", 0, 0))
				.andThen(f -> helperMoca.createRootNode(f, "TASK", 1, 0))
				.andThen(f -> helperMoca.createSubNode(f, "IMPORTS", 0, 0))
				.andThen(f -> helperMoca.createSubNode(f, "IMPORTS", 1, 0))
				.andThen(f -> helperMoca.createSubNode(f, "INVOCATIONS", 0, 0))
				.andThen(f -> helperMoca.createSubNode(f, "INVOCATIONS", 1, 0))
				.andThen(f -> helperMoca.createSubSubNode(f, "2", 0, 0, 1))
		);
		//------------
		assertPostcondition("in/InvocationOtherModule_FWD", "expected/InvocationOtherModule_FWD");
	}
	
	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testInvocationOtherModule_BWD()
	{
		assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute((SystemModule sm) -> helperProcess.createSubModule(sm, "A"))
				.andThen(sm -> helperProcess.createSubModule(sm, "B"))
				.andThen(sm -> helperProcess.createTask(sm, "1", 0))
				.andThen(sm -> helperProcess.createTask(sm, "2", 1))
				.andThen(sm -> helperProcess.createInvocation(sm, 0, 0, 1, 0))
		);
		//------------
		assertPostcondition("expected/InvocationOtherModule_BWD", "in/InvocationOtherModule_BWD");
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testInvocationRecursive_FWD()
	{
		assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute((Folder f) -> helperMoca.createSubFolder(f, "A", 0))
				.andThen(f -> helperMoca.createFile(f, "1.proc", 0))
				.andThen(f -> helperMoca.createRootNode(f, "TASK", 0, 0))
				.andThen(f -> helperMoca.createSubNode(f, "IMPORTS", 0, 0))
				.andThen(f -> helperMoca.createSubNode(f, "INVOCATIONS", 0, 0))
				.andThen(f -> helperMoca.createSubSubNode(f, "1", 0, 0, 1))
		);
		//------------
		assertPostcondition("in/InvocationRecursive_FWD", "expected/InvocationRecursive_FWD");
	}
	
	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testInvocationRecursive_BWD()
	{
		assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute((SystemModule sm) -> helperProcess.createSubModule(sm, "A"))
				.andThen(sm -> helperProcess.createTask(sm, "1", 0))
				.andThen(sm -> helperProcess.createInvocation(sm, 0, 0, 0, 0))
		);
		//------------
		assertPostcondition("expected/InvocationRecursive_BWD", "in/InvocationRecursive_BWD");
	}
}

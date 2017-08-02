package testsuite1.ProcessCodeAdapter.sync;

import org.benchmarx.BXTool;
import org.junit.Ignore;
import org.junit.Test;

import MocaTree.Folder;
import ProcessDefinition.SystemModule;
import testsuite1.ProcessCodeAdapter.sync.util.Decisions;
import testsuite1.ProcessCodeAdapter.sync.util.SyncTestCase;

public class AlignmentBased extends SyncTestCase {

	public AlignmentBased(BXTool<Folder, SystemModule, Decisions> tool) {
		super(tool);
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testModules_FWD()
	{
		util.assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubFolder(f, "A", 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubFolder(f, "B", 0));
		//------------
		util.assertPostcondition("in/Modules_FWD", "expected/Modules_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	@Ignore("Waiting for Fix related to democles issue #14")
	public void testModules_BWD()
	{
		util.assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createSubModule(sm, "A"));
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createSubModule(sm, "B"));
		//------------
		util.assertPostcondition("expected/Modules_BWD", "in/Modules_BWD");
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testTasks_FWD()
	{
		util.assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubFolder(f, "A", 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubFolder(f, "B", 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createFile(f, "1.proc", 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createFile(f, "2.proc", 1));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createRootNode(f, "TASK", 0, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createRootNode(f, "TASK", 1, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubNode(f, "IMPORTS", 0, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubNode(f, "IMPORTS", 1, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubNode(f, "INVOCATIONS", 0, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubNode(f, "INVOCATIONS", 1, 0));
		//------------
		util.assertPostcondition("in/Tasks_FWD", "expected/Tasks_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	@Ignore("Waiting for Fix related to democles issue #14")
	public void testTasks_BWD()
	{
		util.assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createSubModule(sm, "A"));
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createSubModule(sm, "B"));
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createTask(sm, "1", 0));
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createTask(sm, "2", 1));
		//------------
		util.assertPostcondition("expected/Tasks_BWD", "in/Tasks_BWD");
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testImport_FWD()
	{
		util.assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubFolder(f, "A", 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubFolder(f, "B", 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createFile(f, "1.proc", 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createFile(f, "2.proc", 1));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createRootNode(f, "TASK", 0, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createRootNode(f, "TASK", 1, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubNode(f, "IMPORTS", 0, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubNode(f, "IMPORTS", 1, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubNode(f, "INVOCATIONS", 0, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubNode(f, "INVOCATIONS", 1, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubSubNode(f, "B", 0, 0, 0));
		//------------
		util.assertPostcondition("in/Import_FWD", "expected/Import_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	@Ignore("Waiting for Fix related to democles issue #14")
	public void testImport_BWD()
	{
		util.assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createSubModule(sm, "A"));
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createSubModule(sm, "B"));
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createTask(sm, "1", 0));
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createTask(sm, "2", 1));
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createImport(sm, 0, 0, 1));
		//------------
		util.assertPostcondition("expected/Import_BWD", "in/Import_BWD");
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testInvocationSameModule_FWD()
	{
		util.assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubFolder(f, "A", 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createFile(f, "1.proc", 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createFile(f, "2.proc", 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createRootNode(f, "TASK", 0, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createRootNode(f, "TASK", 0, 1));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubNode(f, "IMPORTS", 0, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubNode(f, "IMPORTS", 0, 1));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubNode(f, "INVOCATIONS", 0, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubNode(f, "INVOCATIONS", 0, 1));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubSubNode(f, "2", 0, 0, 1));
		//------------
		util.assertPostcondition("in/InvocationSameModule_FWD", "expected/InvocationSameModule_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	@Ignore("Waiting for Fix related to democles issue #14")
	public void testInvocationSameModule_BWD()
	{
		util.assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createSubModule(sm, "A"));
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createTask(sm, "1", 0));
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createTask(sm, "2", 0));
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createInvocation(sm, 0, 0, 0, 1));
		//------------
		util.assertPostcondition("expected/InvocationSameModule_BWD", "in/InvocationSameModule_BWD");
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testInvocationOtherModule_FWD()
	{
		util.assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubFolder(f, "A", 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubFolder(f, "B", 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createFile(f, "1.proc", 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createFile(f, "2.proc", 1));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createRootNode(f, "TASK", 0, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createRootNode(f, "TASK", 1, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubNode(f, "IMPORTS", 0, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubNode(f, "IMPORTS", 1, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubNode(f, "INVOCATIONS", 0, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubNode(f, "INVOCATIONS", 1, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubSubNode(f, "2", 0, 0, 1));
		//------------
		util.assertPostcondition("in/InvocationOtherModule_FWD", "expected/InvocationOtherModule_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	@Ignore("Waiting for Fix related to democles issue #14")
	public void testInvocationOtherModule_BWD()
	{
		util.assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createSubModule(sm, "A"));
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createSubModule(sm, "B"));
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createTask(sm, "1", 0));
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createTask(sm, "2", 1));
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createInvocation(sm, 0, 0, 1, 0));
		//------------
		util.assertPostcondition("expected/InvocationOtherModule_BWD", "in/InvocationOtherModule_BWD");
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testInvocationRecursive_FWD()
	{
		util.assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubFolder(f, "A", 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createFile(f, "1.proc", 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createRootNode(f, "TASK", 0, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubNode(f, "IMPORTS", 0, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubNode(f, "INVOCATIONS", 0, 0));
		tool.performAndPropagateSourceEdit(f -> helperMoca.createSubSubNode(f, "1", 0, 0, 1));
		//------------
		util.assertPostcondition("in/InvocationRecursive_FWD", "expected/InvocationRecursive_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	@Ignore("Waiting for Fix related to democles issue #14")
	public void testInvocationRecursive_BWD()
	{
		util.assertPrecondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
		//------------
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createSubModule(sm, "A"));
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createTask(sm, "1", 0));
		tool.performAndPropagateTargetEdit(sm -> helperProcess.createInvocation(sm, 0, 0, 0, 0));
		//------------
		util.assertPostcondition("expected/InvocationRecursive_BWD", "in/InvocationRecursive_BWD");
	}
	
}

package testsuite1.CompanyToIT.sync;

import org.benchmarx.BXTool;
import org.junit.Test;

import CompanyLanguage.Company;
import ITLanguage.IT;
import testsuite1.CompanyToIT.sync.util.Decisions;
import testsuite1.CompanyToIT.sync.util.SyncTestCase;

public class AlignmentBased extends SyncTestCase {

	public AlignmentBased(BXTool<Company, IT, Decisions> tool) {
		super(tool);
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testAdmin_BWD()
	{
		util.assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateTargetEdit(i -> helperIT.createEmptyNetwork(i, "ES"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createRouterOnFirstNetwork(i, "Ingo"));
		//------------
		util.assertPostcondition("expected/Admin_BWD", "in/Admin_BWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testEmployee_Laptop_BWD()
	{
		util.assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateTargetEdit(i -> helperIT.createEmptyNetwork(i, "ES"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createRouterOnFirstNetwork(i, "Ingo"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createLaptopOnFirstNetwork(i, "Tony"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createLaptopOnFirstNetwork(i, "Marius"));
		//------------
		util.assertPostcondition("expected/Employee_Laptop_BWD", "in/Employee_Laptop_BWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testEmployee_PC_BWD()
	{
		util.assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateTargetEdit(i -> helperIT.createEmptyNetwork(i, "ES"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createRouterOnFirstNetwork(i, "Ingo"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createPCOnFirstNetwork(i, "Tony"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createPCOnFirstNetwork(i, "Marius"));
		//------------
		util.assertPostcondition("expected/Employee_PC_BWD", "in/Employee_PC_BWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testEmployee_PC_Laptop_BWD()
	{
		util.assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateTargetEdit(i -> helperIT.createEmptyNetwork(i, "ES"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createRouterOnFirstNetwork(i, "Ingo"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createLaptopOnFirstNetwork(i, "Tony"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createPCOnFirstNetwork(i, "Marius"));
		//------------
		util.assertPostcondition("in/Employee_PC_Laptop_FWD", "expected/Employee_PC_Laptop_FWD");
	}
	
}

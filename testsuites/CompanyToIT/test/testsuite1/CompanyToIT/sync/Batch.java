package testsuite1.CompanyToIT.sync;

import org.benchmarx.BXTool;
import org.junit.Ignore;
import org.junit.Test;

import CompanyLanguage.Company;
import ITLanguage.IT;
import testsuite1.CompanyToIT.sync.util.Decisions;
import testsuite1.CompanyToIT.sync.util.SyncTestCase;


public class Batch extends SyncTestCase {

	public Batch(BXTool<Company, IT, Decisions> tool) {
		super(tool);
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testCompany_FWD()
	{
		//------------

		//------------
		util.assertPostcondition("in/Company_FWD", "expected/Company_FWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testAdmin_FWD()
	{
		util.assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateSourceEdit(c -> helperCompany.createAdminForFirstCEO(c, "Ingo"));
		//------------
		util.assertPostcondition("in/Admin_FWD", "expected/Admin_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testAdmin_BWD()
	{
		util.assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute((IT i) -> helperIT.createEmptyNetwork(i, "ES"))
					.andThen((i -> helperIT.createRouterOnFirstNetwork(i, "Ingo")))
			);
		//------------
		util.assertPostcondition("expected/Admin_BWD", "in/Admin_BWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	@Ignore ("Translation ambiguous with respect to employees")
	public void testEmployee_Laptop_FWD()
	{
		util.assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute((Company c) -> helperCompany.createAdminForFirstCEO(c, "Ingo"))
					.andThen((c -> helperCompany.createEmployeeForFirstCEO(c, "Tony")))
			);
		//------------
		util.assertPostcondition("in/Employee_Laptop_FWD", "expected/Employee_Laptop_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testEmployee_Laptop_BWD()
	{
		util.assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute((IT i) -> helperIT.createEmptyNetwork(i, "ES"))
					.andThen((i -> helperIT.createRouterOnFirstNetwork(i, "Ingo")))
					.andThen((i -> helperIT.createLaptopOnFirstNetwork(i, "Tony")))
					.andThen((i -> helperIT.createLaptopOnFirstNetwork(i, "Marius")))
			);
		//------------
		util.assertPostcondition("expected/Employee_Laptop_BWD", "in/Employee_Laptop_BWD");
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	@Ignore ("Translation ambiguous with respect to employees")
	public void testEmployee_PC_FWD()
	{
		util.assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute((Company c) -> helperCompany.createAdminForFirstCEO(c, "Ingo"))
					.andThen((c -> helperCompany.createEmployeeForFirstCEO(c, "Marius")))
			);
		//------------
		util.assertPostcondition("in/Employee_PC_FWD", "expected/Employee_PC_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testEmployee_PC_BWD()
	{
		util.assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute((IT i) -> helperIT.createEmptyNetwork(i, "ES"))
					.andThen((i -> helperIT.createRouterOnFirstNetwork(i, "Ingo")))
					.andThen((i -> helperIT.createPCOnFirstNetwork(i, "Tony")))
					.andThen((i -> helperIT.createPCOnFirstNetwork(i, "Marius")))
			);
		//------------
		util.assertPostcondition("expected/Employee_PC_BWD", "in/Employee_PC_BWD");
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	@Ignore ("Translation ambiguous with respect to employees")
	public void testEmployee_PC_Laptop_FWD()
	{
		util.assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute((Company c) -> helperCompany.createAdminForFirstCEO(c, "Ingo"))
					.andThen((c -> helperCompany.createEmployeeForFirstCEO(c, "Marius")))
					.andThen((c -> helperCompany.createEmployeeForFirstCEO(c, "Tony")))
			);
		//------------
		util.assertPostcondition("in/Employee_PC_Laptop_FWD", "expected/Employee_PC_Laptop_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testEmployee_PC_Laptop_BWD()
	{
		util.assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute((IT i) -> helperIT.createEmptyNetwork(i, "ES"))
					.andThen((i -> helperIT.createRouterOnFirstNetwork(i, "Ingo")))
					.andThen((i -> helperIT.createLaptopOnFirstNetwork(i, "Tony")))
					.andThen((i -> helperIT.createPCOnFirstNetwork(i, "Marius")))
			);
		//------------
		util.assertPostcondition("in/Employee_PC_Laptop_FWD", "expected/Employee_PC_Laptop_FWD");
	}
}

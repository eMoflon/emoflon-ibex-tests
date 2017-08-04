package testsuite1.CompanyToIT.sync;

import java.util.Set;

import org.emoflon.ibex.tgg.operational.util.IMatch;
import org.junit.Test;

import CompanyLanguage.Employee;
import testsuite1.CompanyToIT.sync.util.IbexCompanyToIT;
import testsuite1.CompanyToIT.sync.util.SyncTestCase;

public class AlignmentBased extends SyncTestCase {

	public AlignmentBased(IbexCompanyToIT tool) {
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
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testEmployee_Laptop_FWD()
	{
		tool.getSYNC().setUpdatePolicy(matchContainer -> {
			Set<IMatch> matches = matchContainer.getMatches();
			for (IMatch match : matches) {
				if (!matchContainer.getRuleName(match).equals("EmployeeToPCRule"))
					return match;
			}
			return matches.iterator().next();
		});
		
		util.assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateSourceEdit(c -> helperCompany.createAdminForCEO(c, "Ingo"));
		tool.performAndPropagateSourceEdit(c -> helperCompany.createEmployeeForFirstCEO(c, "Tony"));
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
		tool.performAndPropagateTargetEdit(i -> helperIT.createEmptyNetwork(i, "ES"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createRouterOnFirstNetwork(i, "Ingo"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createLaptopOnFirstNetwork(i, "Tony"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createLaptopOnFirstNetwork(i, "Marius"));
		//------------
		util.assertPostcondition("expected/Employee_Laptop_BWD", "in/Employee_Laptop_BWD");
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testEmployee_PC_FWD()
	{
		tool.getSYNC().setUpdatePolicy(matchContainer -> {
			Set<IMatch> matches = matchContainer.getMatches();
			for (IMatch match : matches) {
				if (!matchContainer.getRuleName(match).equals("EmployeeToLaptopRule"))
					return match;
			}
			return matches.iterator().next();
		});
		
		util.assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateSourceEdit(c -> helperCompany.createAdminForCEO(c, "Ingo"));
		tool.performAndPropagateSourceEdit(c -> helperCompany.createEmployeeForFirstCEO(c, "Marius"));
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
		tool.performAndPropagateTargetEdit(i -> helperIT.createEmptyNetwork(i, "ES"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createRouterOnFirstNetwork(i, "Ingo"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createPCOnFirstNetwork(i, "Tony"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createPCOnFirstNetwork(i, "Marius"));
		//------------
		util.assertPostcondition("expected/Employee_PC_BWD", "in/Employee_PC_BWD");
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testEmployee_PC_Laptop_FWD()
	{
		tool.getSYNC().setUpdatePolicy(matchContainer -> {
			Set<IMatch> matches = matchContainer.getMatches();
			for (IMatch match : matches) {
				String name = matchContainer.getRuleName(match);
				if (name.equals("EmployeeToLaptopRule")) {
					Employee e = (Employee)match.get("employee");
					if (e.getName().equals("Marius"))
						continue;
				}
				if (name.equals("EmployeeToPCRule")) {
					Employee e = (Employee)match.get("employee");
					if (e.getName().equals("Tony"))
						continue;
				}
				return match;
			}
			return matches.iterator().next();
		});
		
		util.assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateSourceEdit(c -> helperCompany.createAdminForCEO(c, "Ingo"));
		tool.performAndPropagateSourceEdit(c -> helperCompany.createEmployeeForFirstCEO(c, "Marius"));
		tool.performAndPropagateSourceEdit(c -> helperCompany.createEmployeeForFirstCEO(c, "Tony"));
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
		tool.performAndPropagateTargetEdit(i -> helperIT.createEmptyNetwork(i, "ES"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createRouterOnFirstNetwork(i, "Ingo"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createLaptopOnFirstNetwork(i, "Tony"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createPCOnFirstNetwork(i, "Marius"));
		//------------
		util.assertPostcondition("in/Employee_PC_Laptop_FWD", "expected/Employee_PC_Laptop_FWD");
	}
	
}

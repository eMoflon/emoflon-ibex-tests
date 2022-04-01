package testsuite.ibex.CompanyToIT.sync;

import java.util.Set;

import org.benchmarx.companyLanguage.core.CompanyLanguageHelper;
import org.benchmarx.itLanguage.core.ITLanguageHelper;
import org.emoflon.ibex.tgg.operational.matches.ITGGMatch;
import org.junit.jupiter.api.Test;

import CompanyLanguage.Company;
import CompanyLanguage.Employee;
import ITLanguage.IT;
import testsuite.ibex.CompanyToIT.sync.util.IbexCompanyToIT;
import testsuite.ibex.testUtil.SyncTestCase;

public class AlignmentBased extends SyncTestCase<Company, IT> {
	public final static String projectName = "CompanyToIT";
	
	CompanyLanguageHelper helperCompany;
	ITLanguageHelper helperIT;

	public AlignmentBased() {
		super(new IbexCompanyToIT(projectName));
	}
	
	@Override
	protected void initHelpers() {
		helperCompany = new CompanyLanguageHelper();
		helperIT = new ITLanguageHelper();
	}
	
	@Override
	protected String getProjectName() {
		return projectName;
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testAdmin_BWD()
	{
		assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateTargetEdit(i -> helperIT.createEmptyNetwork(i, "ES"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createRouterOnFirstNetwork(i, "Ingo"));
		//------------
		assertPostcondition("expected/Admin_BWD", "in/Admin_BWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testEmployee_Laptop_FWD()
	{
		((IbexCompanyToIT)tool).getSYNC().setUpdatePolicy(matchContainer -> {
			Set<ITGGMatch> matches = matchContainer.getMatches();
			for (ITGGMatch match : matches) {
				if (!match.getRuleName().equals("EmployeeToPCRule"))
					return match;
			}
			return matches.iterator().next();
		});
		
		assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateSourceEdit(c -> helperCompany.createAdminForCEO(c, "Ingo"));
		tool.performAndPropagateSourceEdit(c -> helperCompany.createEmployeeForFirstCEO(c, "Tony"));
		//------------
		assertPostcondition("in/Employee_Laptop_FWD", "expected/Employee_Laptop_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testEmployee_Laptop_BWD()
	{
		assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateTargetEdit(i -> helperIT.createEmptyNetwork(i, "ES"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createRouterOnFirstNetwork(i, "Ingo"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createLaptopOnFirstNetwork(i, "Tony"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createLaptopOnFirstNetwork(i, "Marius"));
		//------------
		assertPostcondition("expected/Employee_Laptop_BWD", "in/Employee_Laptop_BWD");
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testEmployee_PC_FWD()
	{
		((IbexCompanyToIT)tool).getSYNC().setUpdatePolicy(matchContainer -> {
			Set<ITGGMatch> matches = matchContainer.getMatches();
			for (ITGGMatch match : matches) {
				if (!match.getRuleName().equals("EmployeeToLaptopRule"))
					return match;
			}
			return matches.iterator().next();
		});
		
		assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateSourceEdit(c -> helperCompany.createAdminForCEO(c, "Ingo"));
		tool.performAndPropagateSourceEdit(c -> helperCompany.createEmployeeForFirstCEO(c, "Marius"));
		//------------
		assertPostcondition("in/Employee_PC_FWD", "expected/Employee_PC_FWD");
	}


	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testEmployee_PC_BWD()
	{
		assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateTargetEdit(i -> helperIT.createEmptyNetwork(i, "ES"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createRouterOnFirstNetwork(i, "Ingo"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createPCOnFirstNetwork(i, "Tony"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createPCOnFirstNetwork(i, "Marius"));
		//------------
		assertPostcondition("expected/Employee_PC_BWD", "in/Employee_PC_BWD");
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testEmployee_PC_Laptop_FWD()
	{
		((IbexCompanyToIT)tool).getSYNC().setUpdatePolicy(matchContainer -> {
			Set<ITGGMatch> matches = matchContainer.getMatches();
			for (ITGGMatch match : matches) {
				String name = match.getRuleName();
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
		
		assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateSourceEdit(c -> helperCompany.createAdminForCEO(c, "Ingo"));
		tool.performAndPropagateSourceEdit(c -> helperCompany.createEmployeeForFirstCEO(c, "Marius"));
		tool.performAndPropagateSourceEdit(c -> helperCompany.createEmployeeForFirstCEO(c, "Tony"));
		//------------
		assertPostcondition("in/Employee_PC_Laptop_FWD", "expected/Employee_PC_Laptop_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testEmployee_PC_Laptop_BWD()
	{
		assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateTargetEdit(i -> helperIT.createEmptyNetwork(i, "ES"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createRouterOnFirstNetwork(i, "Ingo"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createLaptopOnFirstNetwork(i, "Tony"));
		tool.performAndPropagateTargetEdit(i -> helperIT.createPCOnFirstNetwork(i, "Marius"));
		//------------
		assertPostcondition("in/Employee_PC_Laptop_FWD", "expected/Employee_PC_Laptop_FWD");
	}
	
}

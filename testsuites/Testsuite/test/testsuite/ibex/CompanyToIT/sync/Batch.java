package testsuite.ibex.CompanyToIT.sync;

import java.util.Set;

import org.benchmarx.companyLanguage.core.CompanyLanguageHelper;
import org.benchmarx.itLanguage.core.ITLanguageHelper;
import org.emoflon.ibex.tgg.operational.util.IMatch;
import org.junit.Test;

import CompanyLanguage.Company;
import CompanyLanguage.Employee;
import ITLanguage.IT;
import testsuite.ibex.CompanyToIT.sync.util.IbexCompanyToIT;
import testsuite.ibex.testUtil.SyncTestCase;


public class Batch extends SyncTestCase<Company, IT> {
	public final static String projectName = "CompanyToIT";
	
	CompanyLanguageHelper helperCompany;
	ITLanguageHelper helperIT;

	public Batch() {
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
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testCompany_FWD()
	{
		//------------

		//------------
		assertPostcondition("in/Company_FWD", "expected/Company_FWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testAdmin_FWD()
	{
		assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateSourceEdit(c -> helperCompany.createAdminForCEO(c, "Ingo"));
		//------------
		assertPostcondition("in/Admin_FWD", "expected/Admin_FWD");
	}

	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testAdmin_BWD()
	{
		assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute((IT i) -> helperIT.createEmptyNetwork(i, "ES"))
					.andThen((i -> helperIT.createRouterOnFirstNetwork(i, "Ingo")))
			);
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
			Set<IMatch> matches = matchContainer.getMatches();
			for (IMatch match : matches) {
				if (!matchContainer.getRuleName(match).equals("EmployeeToPCRule"))
					return match;
			}
			return matches.iterator().next();
		});
		
		assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute((Company c) -> helperCompany.createAdminForCEO(c, "Ingo"))
					.andThen((c -> helperCompany.createEmployeeForFirstCEO(c, "Tony")))
			);
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
		tool.performAndPropagateTargetEdit(util.execute((IT i) -> helperIT.createEmptyNetwork(i, "ES"))
					.andThen((i -> helperIT.createRouterOnFirstNetwork(i, "Ingo")))
					.andThen((i -> helperIT.createLaptopOnFirstNetwork(i, "Tony")))
					.andThen((i -> helperIT.createLaptopOnFirstNetwork(i, "Marius")))
			);
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
			Set<IMatch> matches = matchContainer.getMatches();
			for (IMatch match : matches) {
				if (!matchContainer.getRuleName(match).equals("EmployeeToLaptopRule"))
					return match;
			}
			return matches.iterator().next();
		});
		
		assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute((Company c) -> helperCompany.createAdminForCEO(c, "Ingo"))
					.andThen((c -> helperCompany.createEmployeeForFirstCEO(c, "Marius")))
			);
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
		tool.performAndPropagateTargetEdit(util.execute((IT i) -> helperIT.createEmptyNetwork(i, "ES"))
					.andThen((i -> helperIT.createRouterOnFirstNetwork(i, "Ingo")))
					.andThen((i -> helperIT.createPCOnFirstNetwork(i, "Tony")))
					.andThen((i -> helperIT.createPCOnFirstNetwork(i, "Marius")))
			);
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
		
		assertPrecondition("in/Company_FWD", "expected/Company_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute((Company c) -> helperCompany.createAdminForCEO(c, "Ingo"))
					.andThen((c -> helperCompany.createEmployeeForFirstCEO(c, "Marius")))
					.andThen((c -> helperCompany.createEmployeeForFirstCEO(c, "Tony")))
			);
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
		tool.performAndPropagateTargetEdit(util.execute((IT i) -> helperIT.createEmptyNetwork(i, "ES"))
					.andThen((i -> helperIT.createRouterOnFirstNetwork(i, "Ingo")))
					.andThen((i -> helperIT.createLaptopOnFirstNetwork(i, "Tony")))
					.andThen((i -> helperIT.createPCOnFirstNetwork(i, "Marius")))
			);
		//------------
		assertPostcondition("in/Employee_PC_Laptop_FWD", "expected/Employee_PC_Laptop_FWD");
	}
}

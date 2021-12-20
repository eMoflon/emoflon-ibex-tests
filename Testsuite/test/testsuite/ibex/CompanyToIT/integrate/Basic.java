package testsuite.ibex.CompanyToIT.integrate;

import org.benchmarx.companyLanguage.core.CompanyLanguageHelper;
import org.benchmarx.itLanguage.core.ITLanguageHelper;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.common.emf.EMFManipulationUtils;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.DeletePreserveConflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.util.CRSHelper;
import org.junit.Ignore;
import org.junit.Test;

import CompanyLanguage.CEO;
import CompanyLanguage.Company;
import CompanyLanguage.CompanyLanguageFactory;
import CompanyLanguage.Employee;
import ITLanguage.IT;
import ITLanguage.ITLanguageFactory;
import ITLanguage.Laptop;
import testsuite.ibex.CompanyToIT.integrate.util.IntegIbexCompanyToIT;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class Basic extends IntegrateTestCase<Company, IT> {

	public final static String projectName = "CompanyToIT";

	CompanyLanguageHelper helperCompany;
	ITLanguageHelper helperIT;

	public Basic() {
		super(new IntegIbexCompanyToIT(projectName));
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

	@Ignore
	@Test
	public void filterNACViolation() {
		tool.applyAndIntegrateDelta((c, it) -> {
			// src:
			CEO ceo = CompanyLanguageFactory.eINSTANCE.createCEO();
			ceo.setName("SecondCEO");
			c.getCeo().add(ceo);
			ceo.getEmployee().add(c.getEmployee().get(0));
		});
	}

	@Ignore
	@Test
	public void modelChanges() {
		tool.applyAndIntegrateDelta((c, it) -> {
			c.getAdmin().get(0).setCeo(null);
			c.setName("");
		});
	}

	@Test
	public void inconsDomainChangesConflict() {
		tool.applyAndIntegrateDelta((c, it) -> {
			Employee newEmployee = CompanyLanguageFactory.eINSTANCE.createEmployee();
			newEmployee.setName("Dominique");
			c.getEmployee().add(newEmployee);

			EMFManipulationUtils.delete(it.getRouter().get(0));
		});

	}

	@Test
	public void delPreserveEdgeConflict() {
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s -> s.crs_mergeAndPreserve()));
		tool.applyAndIntegrateDelta((c, it) -> {
			// src:
			EMFManipulationUtils.delete(c.getAdmin().get(0));
			// trg:
			Laptop laptop = ITLanguageFactory.eINSTANCE.createLaptop();
			laptop.setName("Dominique");
			it.getNetwork().get(0).getLaptop().add(laptop);
		});

		assertCondition("/integ/basic/expected/delete_preserve_edge_conflict/");
	}

	@Test
	public void delPreserveAttributeConflict() {
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s -> s.crs_mergeAndPreserve()));
		tool.applyAndIntegrateDelta((c, it) -> {
			// src:
			EMFManipulationUtils.delete(c.getAdmin().get(0));
			// trg:
			it.getNetwork().get(0).getLaptop().get(0).setName("Dominique");
		});

		assertCondition("/integ/basic/expected/delete_preserve_attribute_conflict/");
	}

	@Test
	public void contradictingChangesConflict() {
		tool.applyAndIntegrateDelta((c, it) -> {
			// src:
			EMFManipulationUtils.delete(c.getAdmin().get(0));
			// trg:
			Laptop laptop = ITLanguageFactory.eINSTANCE.createLaptop();
			laptop.setName("Dominique");
			it.getNetwork().get(0).getLaptop().add(laptop);
		});
	}
}

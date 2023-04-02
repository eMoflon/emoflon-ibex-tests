package testsuite.ibex.CompanyToIT.weights;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.emoflon.ibex.common.emf.EMFEdge;
import org.emoflon.ibex.tgg.operational.patterns.IGreenPatternFactory;
import org.emoflon.ibex.tgg.run.companytoit.CC_App;
import org.emoflon.ibex.tgg.run.companytoit.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.matches.ITGGMatch;
import org.emoflon.ibex.tgg.runtime.matches.SimpleTGGMatch;
import org.emoflon.ibex.tgg.weights.Weights;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import CompanyLanguage.CEO;
import CompanyLanguage.Company;
import CompanyLanguage.CompanyLanguageFactory;
import CompanyLanguage.Employee;
import ITLanguage.IT;
import ITLanguage.ITLanguageFactory;
import ITLanguage.Laptop;
import ITLanguage.PC;
import ITLanguage.Router;
import testsuite.ibex.testUtil.CCTestCase;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class TestTggWeights extends CCTestCase {

	private void createGenerator(final String srcInstance, final String trgInstance) throws IOException {
		CC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new HiPERegistrationHelper()});
		this.checker = new CC_App("CompanyToIT", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, this.ilpSolver);
		this.checker.setUserDefinedWeightCalculationStrategy(new Weights(this.checker));
	}

	@BeforeEach
	public void setUp() throws IOException {
		this.createGenerator("co/src_weightTest", "co/trg_weightTest");
	}

	@AfterEach
	public void tearDown() throws IOException {
		this.checker.terminate();
		this.checker = null;
	}

	private int getDefaultCCWeigth(final String ruleName) {
		IGreenPatternFactory greenFactory = this.checker.getGreenFactories().get(ruleName);
		return greenFactory.getGreenSrcNodesInRule().size()
				+ greenFactory.getGreenTrgNodesInRule().size()
				+ greenFactory.getGreenSrcEdgesInRule().size()
				+ greenFactory.getGreenTrgEdgesInRule().size();
	}

	@Test
	public void testCompanyToIT() {
		ITGGMatch m = new SimpleTGGMatch("CompanyToITRule_CC");
		Company company = CompanyLanguageFactory.eINSTANCE.createCompany();
		company.setName("SimpleCompany");
		CEO ceo  = CompanyLanguageFactory.eINSTANCE.createCEO();
		ceo.setName("ceo");
		IT it = ITLanguageFactory.eINSTANCE.createIT();
		it.setName("WrongName");
		m.put("company", company);
		m.put("ceo", ceo);
		m.put("it", it);

		double weight = this.checker.getWeightForMatch(m, "CompanyToITRule");
		Assertions.assertEquals(company.getName().length(), weight, 0.001);

		double defaultCCWeight = this.checker.getDefaultWeightForMatch(m, "CompanyToITRule");
		Assertions.assertEquals(this.getDefaultCCWeigth("CompanyToITRule"), defaultCCWeight, 0.001);

	}

	@Test
	public void testUnknownRule() {
		ITGGMatch m = new SimpleTGGMatch("NotExisting_CC");
		Company company = CompanyLanguageFactory.eINSTANCE.createCompany();
		company.setName("SimpleCompany");
		CEO ceo  = CompanyLanguageFactory.eINSTANCE.createCEO();
		ceo.setName("ceo");
		IT it = ITLanguageFactory.eINSTANCE.createIT();
		it.setName("WrongName");
		m.put("company", company);
		m.put("ceo", ceo);
		m.put("it", it);
		double weight = this.checker.getWeightForMatch(m, "NotExistingRule");
		Assertions.assertEquals(26, weight, 0.001);
	}

	@Test
	public void testAdminToRouter() {
		ITGGMatch m = new SimpleTGGMatch("AdminToRouterRule_CC");
		Company company = CompanyLanguageFactory.eINSTANCE.createCompany();
		company.setName("SimpleCompany");
		CEO ceo  = CompanyLanguageFactory.eINSTANCE.createCEO();
		ceo.setName("ceo");
		IT it = ITLanguageFactory.eINSTANCE.createIT();
		it.setName("WrongName");
		Router router = ITLanguageFactory.eINSTANCE.createRouter();
		router.setName("TestName");
		m.put("company", company);
		m.put("ceo", ceo);
		m.put("it", it);
		m.put("router", router);

		double weight = this.checker.getWeightForMatch(m, "AdminToRouterRule");
		Assertions.assertEquals(company.getName().length() * router.getName().length(), weight, 0.001);

		double defaultCCWeight = this.checker.getDefaultWeightForMatch(m, "AdminToRouterRule");
		Assertions.assertEquals(this.getDefaultCCWeigth("AdminToRouterRule"), defaultCCWeight, 0.001);
	}

	@Test
	public void testEmployeeToLaptopRule() {
		ITGGMatch m = new SimpleTGGMatch("EmployeeToLaptopRule_CC");

		Employee employeeShortName = CompanyLanguageFactory.eINSTANCE.createEmployee();
		employeeShortName.setName("abc");
		Employee employeeLongName = CompanyLanguageFactory.eINSTANCE.createEmployee();
		employeeLongName.setName("abcdefghijklmnopqrstuvwxyz");

		Laptop laptop = ITLanguageFactory.eINSTANCE.createLaptop();
		laptop.setName("someName");

		m.put("employee", employeeLongName);
		m.put("computer", laptop);

		double weight = this.checker.getWeightForMatch(m, "EmployeeToLaptopRule");
		Assertions.assertEquals(800 *2, weight, 0.001);

		m.put("employee", employeeShortName);
		weight = this.checker.getWeightForMatch(m, "EmployeeToLaptopRule");
		Assertions.assertEquals(800, weight, 0.001);

		double defaultCCWeight = this.checker.getDefaultWeightForMatch(m, "EmployeeToLaptopRule");
		Assertions.assertEquals(this.getDefaultCCWeigth("EmployeeToLaptopRule"), defaultCCWeight, 0.001);
	}

	@Test
	public void testEmployeeToPCRule() {
		ITGGMatch m = new SimpleTGGMatch("EmployeeToPCRule_CC");

		Employee employeeShortName = CompanyLanguageFactory.eINSTANCE.createEmployee();
		employeeShortName.setName("abc");
		Employee employeeLongName = CompanyLanguageFactory.eINSTANCE.createEmployee();
		employeeLongName.setName("abcdefghijklmnopqrstuvwxyz");

		PC pc = ITLanguageFactory.eINSTANCE.createPC();
		pc.setName("someName");

		m.put("employee", employeeLongName);
		m.put("computer", pc);

		double weight = this.checker.getWeightForMatch(m, "EmployeeToPCRule");
		Assertions.assertEquals(500, weight, 0.001);

		m.put("employee", employeeShortName);
		weight = this.checker.getWeightForMatch(m, "EmployeeToPCRule");
		Assertions.assertEquals(500 * 2, weight, 0.001);

		double defaultCCWeight = this.checker.getDefaultWeightForMatch(m, "EmployeeToPCRule");
		Assertions.assertEquals(this.getDefaultCCWeigth("EmployeeToPCRule"), defaultCCWeight, 0.001);
	}

	@Test
	public void testCorrGeneration() throws IOException {
		this.runCC();
		Assertions.assertFalse(this.checker.modelsAreConsistent());
		System.out.println(this.checker.generateConsistencyReport());
		//the source model should be completely generated
		Assertions.assertTrue(this.checker.getInconsistentSrcEdges().isEmpty());
		Assertions.assertTrue(this.checker.getInconsistentSrcNodes().isEmpty());

		//The employee with short name should choose PC, long name laptop
		//so laptop(abc) and (PC(...)) should be inconsistent
		Collection<EObject> inconsistentTrgNodes = this.checker.getInconsistentTrgNodes();
		Assertions.assertTrue(inconsistentTrgNodes.size() == 2);
		Assertions.assertEquals(1, inconsistentTrgNodes.stream().filter(o -> o instanceof Laptop).count());
		Assertions.assertEquals(1, inconsistentTrgNodes.stream().filter(o -> o instanceof PC).count());
		Laptop inconsistentLaptop = (Laptop) inconsistentTrgNodes.stream().filter(o -> o instanceof Laptop).findFirst().get();
		PC inconsistentPC = (PC) inconsistentTrgNodes.stream().filter(o -> o instanceof PC).findFirst().get();
		Assertions.assertEquals("abc", inconsistentLaptop.getName());
		Assertions.assertEquals("abcdefghijklmnopqrstuvwxyz", inconsistentPC.getName());

		//The two edges pointing from the network to the inconsistent PC/laptop should be inconsistent
		Collection<EMFEdge> inconsistentTrgEdges = this.checker.getInconsistentTrgEdges();
		Assertions.assertTrue(inconsistentTrgEdges.size() == 2);
		Assertions.assertTrue(inconsistentTrgEdges.stream().anyMatch(e -> e.getTarget() == inconsistentLaptop));
		Assertions.assertTrue(inconsistentTrgEdges.stream().anyMatch(e -> e.getTarget() == inconsistentPC));
		Assertions.assertTrue(inconsistentTrgEdges.stream().anyMatch(e -> e.getSource() == inconsistentLaptop.eContainer()));
		Assertions.assertTrue(inconsistentTrgEdges.stream().anyMatch(e -> e.getSource() == inconsistentPC.eContainer()));
	}
}

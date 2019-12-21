package org.emoflon.ibex.tgg.weights;

import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.tgg.operational.strategies.IWeightCalculationStrategy;
import org.emoflon.ibex.tgg.operational.strategies.opt.OPT;

import CompanyLanguage.Admin;
import CompanyLanguage.CEO;
import CompanyLanguage.Company;
import CompanyLanguage.Employee;
import ITLanguage.IT;
import ITLanguage.Laptop;
import ITLanguage.Network;
import ITLanguage.PC;
import ITLanguage.Router;

/**
 * This abstract class defines the api for the calculation of weights of found matches and provides the necessary logic to invoke them.
 * Calculations are defined in "platform:/resource/CompanyToIT/src/org/emoflon/ibex/tgg/weights/Weights.tggw"
 */
@SuppressWarnings("all")
abstract class AbstractWeights implements IWeightCalculationStrategy {
  /**
   * The app this weight calculation strategy is registered at.
   */
  private final OPT app;
  
  /**
   * Constructor for the WeightCalculationStrategy
   * 
   * @param app	The application strategy
   */
  protected AbstractWeights(final OPT app) {
    this.app = app;
  }
  
  /**
   * Switching method that delegates the weight calculation to the methods dedicated to a single rule or to the default strategy if no calculation is specified.
   * 
   * @param ruleName	Name of the rule the match corresponds to
   * @param comatch	The comatch to calculate the weight for
   * 
   */
  @Override
  public final double calculateWeight(final String ruleName, final IMatch comatch) {
    switch(ruleName) {
    		case "AdminToRouterRule": 
    			return calculateWeightForAdminToRouterRule(ruleName, comatch);
    		case "CompanyToITRule": 
    			return calculateWeightForCompanyToITRule(ruleName, comatch);
    		case "EmployeeToLaptopRule": 
    			return calculateWeightForEmployeeToLaptopRule(ruleName, comatch);
    		case "EmployeeToPCRule": 
    			return calculateWeightForEmployeeToPCRule(ruleName, comatch);
    		default: 
    			return this.calculateDefaultWeight(ruleName, comatch);
    		}
  }
  
  /**
   * Retrieve all matched nodes and calculate the weight for AdminToRouterRule
   * 
   * @param ruleName	Name of the rule the match corresponds to
   * @param comatch	The comatch to calculate the weight for
   * 
   */
  private final double calculateWeightForAdminToRouterRule(final String ruleName, final IMatch comatch) {
    CompanyLanguage.Admin admin = (CompanyLanguage.Admin) comatch.get("admin");
    CompanyLanguage.CEO ceo = (CompanyLanguage.CEO) comatch.get("ceo");
    CompanyLanguage.Company company = (CompanyLanguage.Company) comatch.get("company");
    ITLanguage.IT it = (ITLanguage.IT) comatch.get("it");
    ITLanguage.Network network = (ITLanguage.Network) comatch.get("network");
    ITLanguage.Router router = (ITLanguage.Router) comatch.get("router");
    return calculateWeightForAdminToRouterRule(admin, ceo, company, it, network, router );
  }
  
  /**
   * Weight calculation for matched nodes of rule AdminToRouterRule
   * 
   * @param admin	The matched element for node "admin" of type "Admin"
   * @param ceo	The matched element for node "ceo" of type "CEO"
   * @param company	The matched element for node "company" of type "Company"
   * @param it	The matched element for node "it" of type "IT"
   * @param network	The matched element for node "network" of type "Network"
   * @param router	The matched element for node "router" of type "Router"
   * 
   */
  protected abstract double calculateWeightForAdminToRouterRule(final Admin admin, final CEO ceo, final Company company, final IT it, final Network network, final Router router);
  
  /**
   * Retrieve all matched nodes and calculate the weight for CompanyToITRule
   * 
   * @param ruleName	Name of the rule the match corresponds to
   * @param comatch	The comatch to calculate the weight for
   * 
   */
  private final double calculateWeightForCompanyToITRule(final String ruleName, final IMatch comatch) {
    CompanyLanguage.CEO ceo = (CompanyLanguage.CEO) comatch.get("ceo");
    CompanyLanguage.Company company = (CompanyLanguage.Company) comatch.get("company");
    ITLanguage.IT it = (ITLanguage.IT) comatch.get("it");
    return calculateWeightForCompanyToITRule(ceo, company, it );
  }
  
  /**
   * Weight calculation for matched nodes of rule CompanyToITRule
   * 
   * @param ceo	The matched element for node "ceo" of type "CEO"
   * @param company	The matched element for node "company" of type "Company"
   * @param it	The matched element for node "it" of type "IT"
   * 
   */
  protected abstract double calculateWeightForCompanyToITRule(final CEO ceo, final Company company, final IT it);
  
  /**
   * Retrieve all matched nodes and calculate the weight for EmployeeToLaptopRule
   * 
   * @param ruleName	Name of the rule the match corresponds to
   * @param comatch	The comatch to calculate the weight for
   * 
   */
  private final double calculateWeightForEmployeeToLaptopRule(final String ruleName, final IMatch comatch) {
    CompanyLanguage.Admin admin = (CompanyLanguage.Admin) comatch.get("admin");
    CompanyLanguage.CEO ceo = (CompanyLanguage.CEO) comatch.get("ceo");
    CompanyLanguage.Company company = (CompanyLanguage.Company) comatch.get("company");
    CompanyLanguage.Employee employee = (CompanyLanguage.Employee) comatch.get("employee");
    ITLanguage.Laptop computer = (ITLanguage.Laptop) comatch.get("computer");
    ITLanguage.IT it = (ITLanguage.IT) comatch.get("it");
    ITLanguage.Network network = (ITLanguage.Network) comatch.get("network");
    ITLanguage.Router router = (ITLanguage.Router) comatch.get("router");
    return calculateWeightForEmployeeToLaptopRule(admin, ceo, company, employee, computer, it, network, router );
  }
  
  /**
   * Weight calculation for matched nodes of rule EmployeeToLaptopRule
   * 
   * @param admin	The matched element for node "admin" of type "Admin"
   * @param ceo	The matched element for node "ceo" of type "CEO"
   * @param company	The matched element for node "company" of type "Company"
   * @param employee	The matched element for node "employee" of type "Employee"
   * @param computer	The matched element for node "computer" of type "Laptop"
   * @param it	The matched element for node "it" of type "IT"
   * @param network	The matched element for node "network" of type "Network"
   * @param router	The matched element for node "router" of type "Router"
   * 
   */
  protected abstract double calculateWeightForEmployeeToLaptopRule(final Admin admin, final CEO ceo, final Company company, final Employee employee, final Laptop computer, final IT it, final Network network, final Router router);
  
  /**
   * Retrieve all matched nodes and calculate the weight for EmployeeToPCRule
   * 
   * @param ruleName	Name of the rule the match corresponds to
   * @param comatch	The comatch to calculate the weight for
   * 
   */
  private final double calculateWeightForEmployeeToPCRule(final String ruleName, final IMatch comatch) {
    CompanyLanguage.Admin admin = (CompanyLanguage.Admin) comatch.get("admin");
    CompanyLanguage.CEO ceo = (CompanyLanguage.CEO) comatch.get("ceo");
    CompanyLanguage.Company company = (CompanyLanguage.Company) comatch.get("company");
    CompanyLanguage.Employee employee = (CompanyLanguage.Employee) comatch.get("employee");
    ITLanguage.PC computer = (ITLanguage.PC) comatch.get("computer");
    ITLanguage.IT it = (ITLanguage.IT) comatch.get("it");
    ITLanguage.Network network = (ITLanguage.Network) comatch.get("network");
    ITLanguage.Router router = (ITLanguage.Router) comatch.get("router");
    return calculateWeightForEmployeeToPCRule(admin, ceo, company, employee, computer, it, network, router );
  }
  
  /**
   * Weight calculation for matched nodes of rule EmployeeToPCRule
   * 
   * @param admin	The matched element for node "admin" of type "Admin"
   * @param ceo	The matched element for node "ceo" of type "CEO"
   * @param company	The matched element for node "company" of type "Company"
   * @param employee	The matched element for node "employee" of type "Employee"
   * @param computer	The matched element for node "computer" of type "PC"
   * @param it	The matched element for node "it" of type "IT"
   * @param network	The matched element for node "network" of type "Network"
   * @param router	The matched element for node "router" of type "Router"
   * 
   */
  protected abstract double calculateWeightForEmployeeToPCRule(final Admin admin, final CEO ceo, final Company company, final Employee employee, final PC computer, final IT it, final Network network, final Router router);
  
  /**
   * Default calculation for matches of rules that do not have a specific calculationn
   * 
   * @param ruleName	Name of the rule the match corresponds to
   * @param comatch	The comatch to calculate the weight for
   * 
   */
  protected double calculateDefaultWeight(final String ruleName, final IMatch comatch) {
    return this.app.getDefaultWeightForMatch(comatch, ruleName);
  }
}

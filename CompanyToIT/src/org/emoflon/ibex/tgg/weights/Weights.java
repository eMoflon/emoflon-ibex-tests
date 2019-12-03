package org.emoflon.ibex.tgg.weights;

import org.emoflon.ibex.tgg.operational.matches.IMatch;
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
 * This class defines the calculation of weights of found matches.
 * Calculations are defined in "platform:/resource/CompanyToIT/src/org/emoflon/ibex/tgg/weights/Weights.tggw"
 */
@SuppressWarnings("all")
public class Weights extends AbstractWeights {
  /**
   * Constructor for the WeightCalculationStrategy
   * 
   * @param app	The application strategy
   */
  public Weights(final OPT app) {
    super(app);
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
  @Override
  protected double calculateWeightForAdminToRouterRule(final Admin admin, final CEO ceo, final Company company, final IT it, final Network network, final Router router) {
    int _length = router.getName().length();
    int _length_1 = company.getName().length();
    return (_length * _length_1);
  }
  
  /**
   * Weight calculation for matched nodes of rule CompanyToITRule
   * 
   * @param ceo	The matched element for node "ceo" of type "CEO"
   * @param company	The matched element for node "company" of type "Company"
   * @param it	The matched element for node "it" of type "IT"
   * 
   */
  @Override
  protected double calculateWeightForCompanyToITRule(final CEO ceo, final Company company, final IT it) {
    return company.getName().length();
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
  @Override
  protected double calculateWeightForEmployeeToLaptopRule(final Admin admin, final CEO ceo, final Company company, final Employee employee, final Laptop computer, final IT it, final Network network, final Router router) {
    int _length = employee.getName().length();
    boolean _greaterThan = (_length > 4);
    if (_greaterThan) {
      int _exampleHelperFunction = this.exampleHelperFunction(computer);
      return (_exampleHelperFunction * 2);
    } else {
      return this.exampleHelperFunction(computer);
    }
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
  @Override
  protected double calculateWeightForEmployeeToPCRule(final Admin admin, final CEO ceo, final Company company, final Employee employee, final PC computer, final IT it, final Network network, final Router router) {
    int _length = employee.getName().length();
    boolean _lessThan = (_length < 4);
    if (_lessThan) {
      int _exampleHelperFunction = this.exampleHelperFunction(computer);
      return (_exampleHelperFunction * 2);
    } else {
      return this.exampleHelperFunction(computer);
    }
  }
  
  /**
   * Default calculation for matches of rules that do not have a specific calculation
   * 
   * @param ruleName	Name of the rule the match corresponds to
   * @param comatch	The comatch to calculate the weight for
   * 
   */
  @Override
  protected double calculateDefaultWeight(final String ruleName, final IMatch comatch) {
    return 26;
  }
  
  private final int exampleHelperFunction(final Laptop l) {
    return 800;
  }
  
  private final int exampleHelperFunction(final PC l) {
    return 500;
  }
}

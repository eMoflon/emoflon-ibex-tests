package testsuite.ibex.ClassInhHier2DB_MA.gen;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

public class SimpleModelgenTest extends testsuite.ibex.ClassInhHier2DB.gen.SimpleModelgenTest{
	
	@Override
	protected String getProjectName() {
		return "ClassInhHier2DB_MA";
	}
	
	
	@Override
	public void testSubClassToTable() throws IOException {
		stop.setMaxRuleCount("PackageToDatabaseRule", 1);
		stop.setMaxRuleCount("ClassToTableRule", 1);
		stop.setMaxRuleCount("SubClassToTable", 1);
		runGenerator(stop);
		assertPostcondition("in/SubClassToTable_FWD", "expected/SubClassToTable_FWD");
	}
	
	@Ignore ("Fails due to least change problems.")
	@Test
	public void testSuperAttToSubTable() throws IOException {

			stop.setMaxRuleCount("PackageToDatabaseRule", 1);
			stop.setMaxRuleCount("ClassToTableRule", 1);
			stop.setMaxRuleCount("AttributeToColumnRule", 1);
			stop.setMaxRuleCount("SubClassToTable", 1);
			generator.setUpdatePolicy(new CreateAttributesUpdatePolicy());
			runGenerator(stop);
			//assertPostconditionOnSrc("in/SubClassToTableRule2_FWD");
			
			assertPostcondition("in/SuperAttToSubTable_FWD", "expected/SuperAttToSubTable_FWD");
	}
	
	@Ignore ("Fails due to least change problems.")
	@Test
	public void testSubAttToSubTable() throws IOException {

			stop.setMaxRuleCount("PackageToDatabaseRule", 1);
			stop.setMaxRuleCount("ClassToTableRule", 1);
			stop.setMaxRuleCount("AttributeToColumnRule", 2);
			stop.setMaxRuleCount("SubClassToTable", 1);
			generator.setUpdatePolicy(new CreateAttributesUpdatePolicy());
			runGenerator(stop);
			//assertPostconditionOnSrc("in/AttributeToColumnRule2_FWD");
			assertPostcondition("in/SubAttToSubTable_FWD", "expected/SubAttToSubTable_FWD");
	}
	
	@Ignore ("Fails due to least change problems.")
	@Test
	public void testSubAttToSubTable2() throws IOException {

			stop.setMaxRuleCount("PackageToDatabaseRule", 1);
			stop.setMaxRuleCount("ClassToTableRule", 1);
			stop.setMaxRuleCount("AttributeToColumnRule", 3);
			stop.setMaxRuleCount("SubClassToTable", 1);
			generator.setUpdatePolicy(new CreateAttributesUpdatePolicy());
			runGenerator(stop);
			//assertPostconditionOnSrc("in/AttributeToColumnRule2_FWD");
			assertPostcondition("in/SubAttToSubTable2_FWD", "expected/SubAttToSubTable2_FWD");
	}
	
	@Ignore ("Fails due to least change problems.")
	@Test
	public void testTransitiveAttToSubTables() throws IOException {

			stop.setMaxRuleCount("PackageToDatabaseRule", 1);
			stop.setMaxRuleCount("ClassToTableRule", 1);
			stop.setMaxRuleCount("AttributeToColumnRule", 1);
			stop.setMaxRuleCount("SubClassToTable", 2);
			generator.setUpdatePolicy(new CreateAttributesUpdatePolicy());
			runGenerator(stop);
			//assertPostconditionOnSrc("in/AttributeToColumnRule2_FWD");
			assertPostcondition("in/SuperSuperClassToSubTable_FWD", "expected/SuperSuperClassToSubTable_FWD");
	}

}

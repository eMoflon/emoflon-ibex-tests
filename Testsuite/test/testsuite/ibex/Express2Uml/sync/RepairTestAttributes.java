package testsuite.ibex.Express2Uml.sync;

import org.emoflon.express.express.Schema;
import org.junit.Test;

import testsuite.ibex.Express2Uml.sync.util.IbexExpress2Uml;
import testsuite.ibex.testUtil.IntegrateTestCase;
import testsuite.ibex.testUtil.SyncTestCase;
import uml.Package;

public class RepairTestAttributes extends SyncTestCase<Schema, Package> {

	private static final String PROJECT_NAME = "Express2Uml";

	public RepairTestAttributes() {
		super(new IbexExpress2Uml(PROJECT_NAME));
	}

	@Override
	protected String getProjectName() {
		return PROJECT_NAME;
	}

	@Override
	protected void initHelpers() {
		
	}
	
	@Test
	public void test_FWD()
	{
		
	}

}

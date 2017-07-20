package testsuite1.CompanyToIT.sync;

import org.benchmarx.BXTool;
import org.junit.Ignore;
import org.junit.Test;

import CompanyLanguage.Company;
import ITLanguage.IT;
import testsuite1.CompanyToIT.sync.util.Decisions;
import testsuite1.CompanyToIT.sync.util.SyncTestCase;

public class AlignmentBased extends SyncTestCase {

	public AlignmentBased(BXTool<Company, IT, Decisions> tool) {
		super(tool);
	}
	
//	/**
//	 * <b>Features</b>: fwd
//	 */
//	@Test
//	public void testSubClassToTable_FWD()
//	{
//		util.assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
//		//------------
//		tool.performAndPropagateSourceEdit(p -> helperClassInh.createClass(p, "C1"));
//		tool.performAndPropagateSourceEdit(p -> helperClassInh.createSubClass(p, "C2", 0));
//			
//		//------------
//		util.assertPostcondition("in/SubClassToTable_FWD", "expected/SubClassToTable_FWD");
//	}
	
}

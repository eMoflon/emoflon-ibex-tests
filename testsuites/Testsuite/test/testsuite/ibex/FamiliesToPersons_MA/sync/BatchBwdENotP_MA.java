package testsuite.ibex.FamiliesToPersons_MA.sync;

import org.junit.Ignore;

import testsuite.ibex.BenchmarxFamiliesToPersons.sync.BatchBwdENotP;
import testsuite.ibex.FamiliesToPersons_MA.sync.util.IbexFamiliesToPersons_MA;

//@Ignore("Fails due to not implemented logic for complement rules.")
public class BatchBwdENotP_MA extends BatchBwdENotP {
	
	static { 
		projectName = "FamiliesToPersons_MA";
	}
	 
	public BatchBwdENotP_MA() {
		tool = new IbexFamiliesToPersons_MA(projectName);
	}
	
}

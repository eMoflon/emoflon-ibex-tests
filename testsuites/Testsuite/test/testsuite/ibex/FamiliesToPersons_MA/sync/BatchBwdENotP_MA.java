package testsuite.ibex.FamiliesToPersons_MA.sync;

import testsuite.ibex.BenchmarxFamiliesToPersons.sync.BatchBwdENotP;
import testsuite.ibex.FamiliesToPersons_MA.sync.util.IbexFamiliesToPersons_MA;


public class BatchBwdENotP_MA extends BatchBwdENotP {
	
	static { 
		projectName = "FamiliesToPersons_MA";
	}
	 
	public BatchBwdENotP_MA() {
		tool = new IbexFamiliesToPersons_MA(projectName);
	}
	
}

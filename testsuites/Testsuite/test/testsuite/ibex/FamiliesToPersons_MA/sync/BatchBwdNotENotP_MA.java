package testsuite.ibex.FamiliesToPersons_MA.sync;

import testsuite.ibex.BenchmarxFamiliesToPersons.sync.BatchBwdNotENotP;
import testsuite.ibex.FamiliesToPersons_MA.sync.util.IbexFamiliesToPersons_MA;

public class BatchBwdNotENotP_MA extends BatchBwdNotENotP {

	static { 
		projectName = "FamiliesToPersons_MA";
	}
	 
	public BatchBwdNotENotP_MA() {
		tool = new IbexFamiliesToPersons_MA(projectName);
	}
}

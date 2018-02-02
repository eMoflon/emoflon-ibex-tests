package testsuite.ibex.FamiliesToPersons_MA.sync;

import testsuite.ibex.BenchmarxFamiliesToPersons.sync.BatchBwdEAndP;
import testsuite.ibex.FamiliesToPersons_MA.sync.util.IbexFamiliesToPersons_MA;


public class BatchBwdEAndP_MA extends BatchBwdEAndP {
	
	 
	public final String projectName = "FamiliesToPersons_MA";
	
	public BatchBwdEAndP_MA() {
		tool = new IbexFamiliesToPersons_MA(projectName);
	}

}

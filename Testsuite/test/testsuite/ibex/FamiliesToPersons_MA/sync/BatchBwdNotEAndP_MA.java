package testsuite.ibex.FamiliesToPersons_MA.sync;

import testsuite.ibex.BenchmarxFamiliesToPersons.sync.BatchBwdNotEAndP;
import testsuite.ibex.FamiliesToPersons_MA.sync.util.IbexFamiliesToPersons_MA;


public class BatchBwdNotEAndP_MA extends BatchBwdNotEAndP {
	
	
	public final String projectName = "FamiliesToPersons_MA";
	public BatchBwdNotEAndP_MA() {
		tool = new IbexFamiliesToPersons_MA(projectName);
	}
}

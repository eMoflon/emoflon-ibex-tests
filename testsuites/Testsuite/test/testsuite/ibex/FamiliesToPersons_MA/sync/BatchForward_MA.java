package testsuite.ibex.FamiliesToPersons_MA.sync;

import testsuite.ibex.BenchmarxFamiliesToPersons.sync.BatchForward;
import testsuite.ibex.FamiliesToPersons_MA.sync.util.IbexFamiliesToPersons_MA;


public class BatchForward_MA extends BatchForward {

	 
	public final String projectName = "FamiliesToPersons_MA";
	public BatchForward_MA() {
		tool = new IbexFamiliesToPersons_MA(projectName);
	}
	
}

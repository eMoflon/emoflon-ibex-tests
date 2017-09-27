package testsuite.ibex.FamiliesToPersons_MA.sync;

import org.junit.Ignore;

import testsuite.ibex.BenchmarxFamiliesToPersons.sync.BatchBwdEAndP;
import testsuite.ibex.FamiliesToPersons_MA.sync.util.IbexFamiliesToPersons_MA;

@Ignore("Fails due to not implemented logic for complement rules.")
public class BatchBwdEAndP_MA extends BatchBwdEAndP {
	
	static { 
		projectName = "FamiliesToPersons_MA";
	}
	 
	public BatchBwdEAndP_MA() {
		tool = new IbexFamiliesToPersons_MA(projectName);
	}
}

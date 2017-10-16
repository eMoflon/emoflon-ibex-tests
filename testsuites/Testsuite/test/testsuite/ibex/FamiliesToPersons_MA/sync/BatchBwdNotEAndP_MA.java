package testsuite.ibex.FamiliesToPersons_MA.sync;

import org.junit.Ignore;

import testsuite.ibex.BenchmarxFamiliesToPersons.sync.BatchBwdNotEAndP;
import testsuite.ibex.FamiliesToPersons_MA.sync.util.IbexFamiliesToPersons_MA;

@Ignore("Fails due to not implemented logic for complement rules.")
public class BatchBwdNotEAndP_MA extends BatchBwdNotEAndP {
	
	static { 
		projectName = "FamiliesToPersons_MA";
	}
	 
	public BatchBwdNotEAndP_MA() {
		tool = new IbexFamiliesToPersons_MA(projectName);
	}
}

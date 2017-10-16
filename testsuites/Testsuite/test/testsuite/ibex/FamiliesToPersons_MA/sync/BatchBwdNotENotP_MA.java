package testsuite.ibex.FamiliesToPersons_MA.sync;

import org.junit.Ignore;

import testsuite.ibex.BenchmarxFamiliesToPersons.sync.BatchBwdNotENotP;
import testsuite.ibex.FamiliesToPersons_MA.sync.util.IbexFamiliesToPersons_MA;

@Ignore("Fails due to not implemented logic for complement rules.")
public class BatchBwdNotENotP_MA extends BatchBwdNotENotP {

	static { 
		projectName = "FamiliesToPersons_MA";
	}
	 
	public BatchBwdNotENotP_MA() {
		tool = new IbexFamiliesToPersons_MA(projectName);
	}
}

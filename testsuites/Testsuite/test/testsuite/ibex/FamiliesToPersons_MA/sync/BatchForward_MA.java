package testsuite.ibex.FamiliesToPersons_MA.sync;

import org.junit.Ignore;

import testsuite.ibex.BenchmarxFamiliesToPersons.sync.BatchForward;
import testsuite.ibex.FamiliesToPersons_MA.sync.util.IbexFamiliesToPersons_MA;

//@Ignore("Fails due to not implemented logic for complement rules.")
public class BatchForward_MA extends BatchForward {
	
	static { 
		projectName = "FamiliesToPersons_MA";
	}
	 
	public BatchForward_MA() {
		tool = new IbexFamiliesToPersons_MA(projectName);
	}
	
}

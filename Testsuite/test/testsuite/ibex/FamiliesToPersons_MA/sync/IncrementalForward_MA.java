package testsuite.ibex.FamiliesToPersons_MA.sync;

import testsuite.ibex.BenchmarxFamiliesToPersons.sync.IncrementalForward;
import testsuite.ibex.FamiliesToPersons_MA.sync.util.IbexFamiliesToPersons_MA;


public class IncrementalForward_MA extends IncrementalForward {
	
	public final String projectName = "FamiliesToPersons_MA";
	public IncrementalForward_MA() {
		tool = new IbexFamiliesToPersons_MA(projectName);
	} 
}

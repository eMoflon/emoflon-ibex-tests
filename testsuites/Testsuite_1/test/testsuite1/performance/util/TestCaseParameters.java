package testsuite1.performance.util;

/**
 * This class holds all parameters that define a unique performance test case.
 * Currently, these parameters are the TGG, the operationalization and the model size.
 * */
public class TestCaseParameters {
	private String tgg;
	private Operationalization op;
	private int modelSize;
	
	public TestCaseParameters(String tgg, Operationalization op, int modelSize) {
		this.tgg = tgg;
		this.op = op;
		this.modelSize = modelSize;
	}
	
	public String tgg() {
		return tgg;
	}
	
	public Operationalization operationalization() {
		return op;
	}
	
	public int modelSize() {
		return modelSize;
	}
	
	public String toString() {
		return tgg+"_"+op.name()+"_"+modelSize;
	}
}

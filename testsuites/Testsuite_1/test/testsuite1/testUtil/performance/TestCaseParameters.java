package testsuite1.testUtil.performance;

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

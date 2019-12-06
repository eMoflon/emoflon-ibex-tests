package testsuite.ibex.performance.util;

import java.io.Serializable;

/**
 * This class holds all parameters that define a unique performance test case.
 * Currently, these parameters are the TGG, the operationalization and the model size.
 * */
public class TestCaseParameters implements Serializable {
	private static final long serialVersionUID = -3164937405531444646L;
	
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
	
	@Override
	public int hashCode() {
		return tgg.hashCode() + op.hashCode() + Integer.valueOf(modelSize).hashCode();
	}
}

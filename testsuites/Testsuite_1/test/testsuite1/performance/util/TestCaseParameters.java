package testsuite1.performance.util;

import java.io.Serializable;

import testsuite1.testUtil.Operationalization;

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
}

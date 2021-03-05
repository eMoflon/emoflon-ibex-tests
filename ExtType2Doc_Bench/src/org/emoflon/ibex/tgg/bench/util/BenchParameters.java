package org.emoflon.ibex.tgg.bench.util;

public abstract class BenchParameters {
	
	public final String name;
	public final int modelScale;
	public final ScaleOrientation scaleOrientation;
	public final int numOfChanges;
	public final boolean saveModels;

	public BenchParameters(String name, int modelScale, ScaleOrientation scaleOrientation, int numOfChanges, boolean saveModels) {
		this.name = name;
		this.modelScale = modelScale;
		this.scaleOrientation = scaleOrientation;
		this.numOfChanges = numOfChanges;
		this.saveModels = saveModels;
	}

}

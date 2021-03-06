package org.emoflon.ibex.tgg.bench.exttype2doc.concsync;

import org.emoflon.ibex.tgg.bench.util.BenchParameters;
import org.emoflon.ibex.tgg.bench.util.ScaleOrientation;

public class ExtType2Doc_ConcSync_Params extends BenchParameters {

	public final int num_of_root_types;
	public final int inheritance_depth;
	public final int horizontal_inheritance_scale;
	public final int num_of_fields;
	public final int num_of_methods;
	public final int num_of_parameters;
	public final int num_of_glossar_entries;
	public final int num_of_glossar_links_per_entry;

	public final int num_of_conflicts;

	public ExtType2Doc_ConcSync_Params(String name, int modelScale, ScaleOrientation scaleOrientation, int numOfChanges, boolean saveModels) {
		super(name, modelScale, scaleOrientation, numOfChanges, saveModels);

		switch (scaleOrientation) {
		case HORIZONTAL:
			num_of_root_types = modelScale;
			inheritance_depth = 3;
			break;
		case VERTICAL:
			num_of_root_types = 1;
			inheritance_depth = modelScale;
			break;
		default:
			num_of_root_types = -1;
			inheritance_depth = -1;
			break;
		}

		horizontal_inheritance_scale = 3;
		num_of_fields = 3;
		num_of_methods = 3;
		num_of_parameters = 2;
		num_of_glossar_entries = (int) (Math.sqrt(modelScale) / 10) + 1;
		num_of_glossar_links_per_entry = 2;

		num_of_conflicts = numOfChanges;
	}

}

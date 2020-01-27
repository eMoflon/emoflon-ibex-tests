package org.benchmarx.terracehouses.core;

import org.benchmarx.emf.Comparator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.junit.Assert;

import TerraceHouses.Building;

public class TerraceHousesComparator implements Comparator<Building> {

	@Override
	public void assertEquals(Building expected, Building actual) {
		Comparison c = EMFCompare.builder().build().compare(new DefaultComparisonScope(expected, actual, null));
		EList<Diff> diffs = c.getDifferences();
		Assert.assertEquals(0, diffs.size());
	}

}

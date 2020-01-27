package org.benchmarx.woodenblockset.core;

import org.benchmarx.emf.Comparator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.junit.Assert;

import WoodenBlockSet.BlockSet;

public class BlockSetComparator implements Comparator<BlockSet> {

	@Override
	public void assertEquals(BlockSet expected, BlockSet actual) {
		Comparison c = EMFCompare.builder().build().compare(new DefaultComparisonScope(expected, actual, null));
		EList<Diff> diffs = c.getDifferences();
		Assert.assertEquals(0, diffs.size());
	}

}

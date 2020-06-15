package testsuite.ibex.testUtil

import java.util.Collection
import org.benchmarx.emf.Comparator
import org.eclipse.emf.ecore.EObject
import org.junit.Assert

abstract class CorrComparator implements Comparator<Collection<EObject>> {

	override assertEquals(Collection<EObject> expected, Collection<EObject> actual) {
		Assert.assertEquals(expected.stringifyAndSort, actual.stringifyAndSort);
	}

	def String stringifyAndSort(Collection<EObject> corrs) {
		var sortedCorrs = corrs.map[c | c.stringify.toString].sort;
		'''
		«FOR corr : sortedCorrs»
			«corr»
		«ENDFOR»
		'''
	}
	
	abstract def CharSequence stringify(EObject corr);

}

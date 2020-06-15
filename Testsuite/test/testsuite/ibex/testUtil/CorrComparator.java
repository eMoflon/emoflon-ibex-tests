package testsuite.ibex.testUtil;

import java.util.Collection;

import org.benchmarx.util.EMFUtil;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Assert;

public class CorrComparator {

	public void assertEquals(Collection<EObject> expected, Collection<EObject> actual) {
		Assert.assertEquals(expected.size(), actual.size());
		for (EObject exp : expected) {
			boolean found = false;
			for (EObject act : actual) {
				Comparison c = EMFCompare.builder().build().compare(new DefaultComparisonScope(exp, act, null));
				if (c.getDifferences().size() == 0) {
					found = true;
					break;
				}
			}
			Assert.assertTrue(found);
		}
	}
	
	public Collection<EObject> loadCorrElements(String path, ResourceSet resourceSet) {
		Resource r = EMFUtil.loadExpectedResource(path, resourceSet);
		Collection<EObject> corrs = r.getContents();
		return corrs;
	}

}

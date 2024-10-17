package testsuite.ibex.testUtil;

import java.io.IOException;

import org.benchmarx.emf.Comparator;
import org.benchmarx.util.EMFUtil;
import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.tgg.runtime.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.runtime.strategies.gen.MODELGENStopCriterion;
import org.junit.jupiter.api.Assertions;

public abstract class ModelGenTestCase<S, T> extends TestCase {
	protected MODELGEN generator;
	protected MODELGENStopCriterion stop;
	protected Comparator<S> sourceComp;
	protected Comparator<T> targetComp;
	
	protected abstract String getProjectName();
	
	protected String getResourcePath() {
		return "../../" + getProjectName() + "/resources/";
	}

	protected void runGenerator(MODELGENStopCriterion stop) throws IOException {
		generator.setStopCriterion(stop); 
		generator.run();
		generator.terminate();
	}

	protected void assertPostcondition(String src, String trg) {
		assertPostconditionOnSrc(src);
		assertPostconditionOnTrg(trg);
	}

	@SuppressWarnings("unchecked")
	protected void assertPostconditionOnSrc(String src) {
		Resource srcExp = EMFUtil.loadExpectedResource(getResourcePath()+"/"+src, generator.getResourceHandler().getModelResourceSet());
		
		Assertions.assertNotEquals(0, srcExp.getContents().size());
		
		Assertions.assertEquals(srcExp.getContents().size(), generator.getResourceHandler().getSourceResource().getContents().size());
		for (int i = 0; i < srcExp.getContents().size(); i++) {
			sourceComp.assertEquals((S)srcExp.getContents().get(i), 
					                (S)generator.getResourceHandler().getSourceResource().getContents().get(i));
		}
	}

	@SuppressWarnings("unchecked")
	protected void assertPostconditionOnTrg(String trg) {
		Resource trgExp = EMFUtil.loadExpectedResource(getResourcePath()+"/"+trg, generator.getResourceHandler().getModelResourceSet());
		
		Assertions.assertNotEquals(0, trgExp.getContents().size());
		
		Assertions.assertEquals(trgExp.getContents().size(), generator.getResourceHandler().getTargetResource().getContents().size());
		for (int i = 0; i < trgExp.getContents().size(); i++) {
			targetComp.assertEquals((T)trgExp.getContents().get(i), 
					                  (T)generator.getResourceHandler().getTargetResource().getContents().get(i));
		}
	}
}

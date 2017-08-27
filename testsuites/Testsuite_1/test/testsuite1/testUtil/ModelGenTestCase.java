package testsuite1.testUtil;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.benchmarx.emf.Comparator;
import org.benchmarx.util.EMFUtil;
import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.vhdltggcodeadapter.MODELGEN_App;
import org.junit.Assert;

import language.TGGRule;
import testsuite1.VHDLTGGCodeAdapter.modelgen.SyncResourcesTest;

public abstract class ModelGenTestCase<S, T> extends TestCase {
	protected final static Logger logger = Logger.getLogger(SyncResourcesTest.class);
	
	protected static MODELGEN generator;
	protected static MODELGEN_App flattenedGenerator;
	protected static MODELGEN_App normalGenerator;
	
	protected Comparator<S> sourceComp;
	protected Comparator<T> targetComp;
	
	protected static MODELGENStopCriterion stop;

	protected ModelGenTestCase(boolean flatten) {
		super(flatten);
	}
	
	protected abstract String getProjectName();

	protected static void resetGenerator(Boolean flatten) throws IOException{
		generator = flatten? flattenedGenerator : normalGenerator;
		generator.resetPatternMatchingEngine();
		
		stop = new MODELGENStopCriterion(generator.getTGG());		
		for (TGGRule rule : generator.getTGG().getRules())
			stop.setMaxRuleCount(rule.getName(), 0);
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
		Resource srcExp = EMFUtil.loadExpectedResource(getProjectName()+"/"+src, generator.getResourceSet());
		
		Assert.assertNotEquals("Resource is empty", 0, srcExp.getContents().size());
		
		Assert.assertEquals(srcExp.getContents().size(), generator.getSourceResource().getContents().size());
		for (int i = 0; i < srcExp.getContents().size(); i++) {
			sourceComp.assertEquals((S)srcExp.getContents().get(i), 
					                  (S)generator.getSourceResource().getContents().get(i));
		}
	}

	@SuppressWarnings("unchecked")
	protected void assertPostconditionOnTrg(String trg) {
		Resource trgExp = EMFUtil.loadExpectedResource(getProjectName()+"/"+trg, generator.getResourceSet());
		
		Assert.assertNotEquals("Resource is empty", 0, trgExp.getContents().size());
		
		Assert.assertEquals(trgExp.getContents().size(), generator.getTargetResource().getContents().size());
		for (int i = 0; i < trgExp.getContents().size(); i++) {
			targetComp.assertEquals((T)trgExp.getContents().get(i), 
					                  (T)generator.getTargetResource().getContents().get(i));
		}
	}
}

package testsuite1.BlockCodeAdapter.modelgen;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.apache.log4j.BasicConfigurator;
import org.benchmarx.blockLanguage.core.BlockLanguageComparator;
import org.benchmarx.emf.Comparator;
import org.benchmarx.mocaTree.core.MocaTreeFileComparator;
import org.benchmarx.util.EMFUtil;
import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.MODELGEN_App;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import BlockLanguage.Specification;
import MocaTree.File;
import language.TGGRule;

@RunWith(Parameterized.class)
public abstract class ModelGenTestCase {
	protected MODELGEN_App generator;
	protected Comparator<File> mocaTreeComp;
	protected Comparator<Specification> blockComp;
	protected MODELGENStopCriterion stop;
	protected boolean flatten;
	
	protected ModelGenTestCase(Boolean flatten) {
		this.flatten = flatten;
	}
	
	@BeforeClass
	public static void init() {
		BasicConfigurator.configure();
	}
	
	@Before
	public void createGenerator() throws IOException {
		generator = new MODELGEN_App("BlockCodeAdapter", "./../", flatten, false);
		generator.registerPatternMatchingEngine(new DemoclesEngine());
		stop = new MODELGENStopCriterion(generator.getTGG());
		
		for (TGGRule rule : generator.getTGG().getRules()) {
			stop.setMaxRuleCount(rule.getName(), 0);
		}
		
		mocaTreeComp = new MocaTreeFileComparator(false);
		blockComp = new BlockLanguageComparator(false);
	}

	protected void runGenerator(MODELGENStopCriterion stop) throws IOException {
//		long startTime = System.nanoTime();
		generator.setStopCriterion(stop); 
		generator.run();
		generator.terminate();
//		System.out.println((System.nanoTime() - startTime)/1000000.0);
	}

	protected void assertPostcondition(String src, String trg) {
		assertPostconditionOnSrc(src);
		assertPostconditionOnTrg(trg);
	}

	protected void assertPostconditionOnSrc(String src) {
		Resource srcExp = EMFUtil.loadExpectedResource(src, generator.getResourceSet());
		
		Assert.assertNotEquals("Resource is empty", 0, srcExp.getContents().size());
		
		Assert.assertEquals(srcExp.getContents().size(), generator.getSourceResource().getContents().size());
		for (int i = 0; i < srcExp.getContents().size(); i++) {
			mocaTreeComp.assertEquals((File)srcExp.getContents().get(i), 
					                  (File)generator.getSourceResource().getContents().get(i));
		}
	}

	protected void assertPostconditionOnTrg(String trg) {
		Resource trgExp = EMFUtil.loadExpectedResource(trg, generator.getResourceSet());
		
		Assert.assertNotEquals("Resource is empty", 0, trgExp.getContents().size());
		
		Assert.assertEquals(trgExp.getContents().size(), generator.getTargetResource().getContents().size());
		for (int i = 0; i < trgExp.getContents().size(); i++) {
			blockComp.assertEquals((Specification)trgExp.getContents().get(i), 
					                  (Specification)generator.getTargetResource().getContents().get(i));
		}
	}
	

	@Parameters
	public static Collection<Boolean> flattening() throws IOException {
		return Arrays.asList(true, false);
	}
}

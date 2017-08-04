package testsuite1.BlockDiagramCodeAdapter.modelgen;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.apache.log4j.BasicConfigurator;
import org.benchmarx.blockDiagram.core.BlockDiagramComparator;
import org.benchmarx.emf.Comparator;
import org.benchmarx.mocaTree.core.MocaTreeFileComparator;
import org.benchmarx.util.EMFUtil;
import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.MODELGEN_App;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import BlockDiagram.BlockSystem;
import MocaTree.File;
import language.TGGRule;

@RunWith(Parameterized.class)
public abstract class ModelGenTestCase {
	protected MODELGEN_App generator;
	protected Comparator<BlockSystem> blockDiagramComp;
	protected Comparator<File> mocaComp;
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
		generator = new MODELGEN_App("BlockDiagramCodeAdapter", "./../", flatten, false);
		stop = new MODELGENStopCriterion(generator.getTGG());
		
		for (TGGRule rule : generator.getTGG().getRules()) {
			stop.setMaxRuleCount(rule.getName(), 0);
		}
		
		blockDiagramComp = new BlockDiagramComparator(false);
		mocaComp = new MocaTreeFileComparator(false);
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
			blockDiagramComp.assertEquals((BlockSystem)srcExp.getContents().get(i), 
					                  (BlockSystem)generator.getSourceResource().getContents().get(i));
		}
	}

	protected void assertPostconditionOnTrg(String trg) {
		Resource trgExp = EMFUtil.loadExpectedResource(trg, generator.getResourceSet());
		
		Assert.assertNotEquals("Resource is empty", 0, trgExp.getContents().size());
		
		Assert.assertEquals(trgExp.getContents().size(), generator.getTargetResource().getContents().size());
		for (int i = 0; i < trgExp.getContents().size(); i++) {
			mocaComp.assertEquals((File)trgExp.getContents().get(i), 
					                  (File)generator.getTargetResource().getContents().get(i));
		}
	}
	

	@Parameters
	public static Collection<Boolean> flattening() throws IOException {
		return Arrays.asList(false, true);
	}
}

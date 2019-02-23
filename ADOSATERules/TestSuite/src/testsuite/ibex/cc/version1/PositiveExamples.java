package testsuite.ibex.cc.version1;

import java.io.IOException;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.util.CCTestCase;

public class PositiveExamples extends CCTestCase {
	public PositiveExamples(Supplier<IbexOptions> createOptions,
			BiConsumer<ResourceSet, OperationalStrategy> registerMetamodels, String name) {
		super(createOptions, registerMetamodels, name);
	}

	private void testForPairOfModels(String source, String target) throws IOException {
		createChecker(source, target);
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}

	@Test
	public void testForSingleNetwork() throws IOException {
		testForPairOfModels("version1/networks/OneFacebookNetwork", "version1/networks/OneInstagramNetwork");
	}

	@Test
	public void testForTwoNetworks() throws IOException {
		testForPairOfModels("version1/networks/TwoFacebookNetwork", "version1/networks/TwoInstagramNetwork");
	}

	@Test
	public void testForThreeNetwork() throws IOException {
		testForPairOfModels("version1/networks/ThreeFacebookNetworks", "version1/networks/ThreeInstagramNetworks");
	}	
	
}

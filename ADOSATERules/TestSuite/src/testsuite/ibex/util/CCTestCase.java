package testsuite.ibex.util;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.opt.cc.CC;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public abstract class CCTestCase extends TestCase {
	protected CC checker;
	
	private Supplier<IbexOptions> createOptions;
	private BiConsumer<ResourceSet, OperationalStrategy> registerMetamodels;

	public void createChecker(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App_ForTesting(srcInstance, trgInstance, createOptions, registerMetamodels);
	}

	public CCTestCase(Supplier<IbexOptions> createOptions,
			BiConsumer<ResourceSet, OperationalStrategy> registerMetamodels, String name) {
		this.createOptions = createOptions;
		this.registerMetamodels = registerMetamodels;
	}

	@Parameters(name = "{2}")
	public static Collection<?> solutions() {
		Supplier<IbexOptions> options1 = org.emoflon.ibex.tgg.run.adele2aadl._RegistrationHelper::createIbexOptions;
		BiConsumer<ResourceSet, OperationalStrategy> reg1 = (t, u) -> {
			try {
				org.emoflon.ibex.tgg.run.adele2aadl._RegistrationHelper.registerMetamodels(t, u);
			} catch (IOException e) {
				e.printStackTrace();
			}
		};
		/*Supplier<IbexOptions> options2 = org.emoflon.ibex.tgg.run.facebooktoinstagram._RegistrationHelper::createIbexOptions;
		BiConsumer<ResourceSet, OperationalStrategy> reg2 = (t, u) -> {
			try {
				org.emoflon.ibex.tgg.run.facebooktoinstagram._RegistrationHelper.registerMetamodels(t, u);
			} catch (IOException e) {
				e.printStackTrace();
			}
		};*/
		
		return Arrays.asList(new Object[][] { 
			{ options1, reg1, "Adele2Aadl"}, 
			
		});
	}
	
	protected void runCC() throws IOException {
		checker.run();
		checker.terminate();
	}
}

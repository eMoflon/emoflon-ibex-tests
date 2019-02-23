package testsuite.ibex.util;

import java.io.IOException;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.opt.cc.CC;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;

public class CC_App_ForTesting extends CC {
	private String src;
	private String trg;
	private BiConsumer<ResourceSet, OperationalStrategy> registerMetamodels;

	public CC_App_ForTesting(String srcInstance, String trgInstance, Supplier<IbexOptions> createOptions,
			BiConsumer<ResourceSet, OperationalStrategy> registerMetamodels) throws IOException {
		super(createOptions.get());
		src = srcInstance;
		trg = trgInstance;
		this.registerMetamodels = registerMetamodels;
		registerBlackInterpreter(new DemoclesTGGEngine());
	}

	@Override
	public void loadModels() throws IOException {
		s = loadResource("Testsuite/resources/" + src + ".xmi");
		t = loadResource("Testsuite/resources/" + trg + ".xmi");
		c = createResource("Adele2Aadl/instances/corr.xmi");
		p = createResource("Adele2Aadl/instances/protocol.xmi");

		EcoreUtil.resolveAll(rs);
	}

	@Override
	protected void registerUserMetamodels() throws IOException {
		registerMetamodels.accept(rs, this);

		// Register correspondence metamodel last
		loadAndRegisterCorrMetamodel(options.projectPath() + "/model/" + options.projectName() + ".ecore");
	}
}

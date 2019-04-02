package testsuite.ibex.util;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.strategies.opt.cc.CC;
import org.emoflon.ibex.tgg.run.adele2aadl._RegistrationHelper;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;
import org.osate.aadl2.impl.Aadl2PackageImpl;
import org.osate.aadl2.impl.AadlPackageImpl;
import org.osate.aadl2.util.Aadl2ResourceFactoryImpl;
import org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl;
import org.topcased.adele.model.ADELE_Components.util.ADELE_ComponentsResourceFactoryImpl;

public class CC_App_ForTesting extends CC {
	private String src;
	private String trg;

	public CC_App_ForTesting(String srcInstance, String trgInstance) throws IOException {
		super(_RegistrationHelper.createIbexOptions());
		src = srcInstance;
		trg = trgInstance;
		registerBlackInterpreter(new DemoclesTGGEngine());
	}

	@Override
	public void loadModels() throws IOException {
		s = loadAdeleResource("TestSuite/resources/" + src);
		t = loadAadlResource("TestSuite/resources/" + trg);
		c = createResource("TestSuite/out/corr.xmi");
		p = createResource("TestSuite/out/protocol.xmi");

		EcoreUtil.resolveAll(rs);
	}

	private Resource loadAdeleResource(String path) throws IOException {		
		getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap().put("adele",
				new ADELE_ComponentsResourceFactoryImpl());

		Resource r = loadResource(path);

		return r;
	}
	private Resource loadAadlResource(String path) throws IOException {		
		getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap().put("aadl",
				new Aadl2ResourceFactoryImpl());

		Resource r = loadResource(path);

		return r;
	}

	@Override
	protected void registerUserMetamodels() throws IOException {
		_RegistrationHelper.registerMetamodels(rs, this);

		// Register correspondence metamodel last
		loadAndRegisterCorrMetamodel(options.projectPath() + "/model/" + options.projectName() + ".ecore");
	}
}

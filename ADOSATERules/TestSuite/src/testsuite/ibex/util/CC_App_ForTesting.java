package testsuite.ibex.util;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.emoflon.ibex.tgg.operational.strategies.opt.cc.CC;
import org.emoflon.ibex.tgg.run.adele2aadl.OsateStandaloneSetup;
import org.emoflon.ibex.tgg.run.adele2aadl._RegistrationHelper;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;
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
		t = loadAadlResource("resources/" + trg);
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
		OsateStandaloneSetup setup = new OsateStandaloneSetup();
		ResourceSet rs = setup.createResourceSet();
		rs.getResource(URI.createURI("resources/unit/external_circ_ref.aadl"), true);
		rs.getResource(URI.createURI("resources/unit/external_specification.aadl"), true);
		rs.getResource(URI.createURI("resources/unit/external_specification1.aadl"), true);
		rs.getResource(URI.createURI("resources/unit/external_specification2.aadl"), true);
		Resource r = rs.getResource(URI.createURI(path), true);
		EcoreUtil2.resolveAll(rs);
		
		getResourceSet().getResources().addAll(rs.getResources());
		
		return r;
	}

	@Override
	protected void registerUserMetamodels() throws IOException {
		_RegistrationHelper.registerMetamodels(rs, this);

		// Register correspondence metamodel last
		loadAndRegisterCorrMetamodel(options.projectPath() + "/model/" + options.projectName() + ".ecore");
	}
}

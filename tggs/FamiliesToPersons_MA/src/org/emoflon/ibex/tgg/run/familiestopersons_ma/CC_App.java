package org.emoflon.ibex.tgg.run.familiestopersons_ma;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.strategies.cc.CC;
import org.emoflon.ibex.tgg.operational.util.IbexOptions;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import Families.impl.FamiliesPackageImpl;
import Persons.impl.PersonsPackageImpl;

public class CC_App extends CC {
	
	private String srcPath;
	private String trgPath;

	public CC_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
		registerPatternMatchingEngine(new DemoclesEngine());
	}

	public CC_App(String projectName, String workspacePath, boolean debug,
			String srcPath, String trgPath) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
		this.srcPath = srcPath;
		this.trgPath = trgPath;
		registerPatternMatchingEngine(new DemoclesEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		CC_App cc = new CC_App("FamiliesToPersons_MA", "./../", false);
		
		logger.info("Starting CC");
		long tic = System.currentTimeMillis();
		cc.run();
		System.out.println(cc.generateConsistencyReport());
		long toc = System.currentTimeMillis();
		logger.info("Completed CC in: " + (toc - tic) + " ms");
		
		cc.saveModels();
		cc.terminate();
	}

	protected void registerUserMetamodels() throws IOException {
		rs.getPackageRegistry().put("platform:/resource/Families/model/Families.ecore", FamiliesPackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/Persons/model/Persons.ecore", PersonsPackageImpl.init());
		
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	@Override
	public void loadModels() throws IOException {
		s = loadResource(projectPath + "/resources/"+srcPath+".xmi");
		t = loadResource(projectPath + "/resources/"+trgPath+".xmi");
		//s = loadResource(projectPath + "/resources/01_OneFamily.xmi");
		//t = loadResource(projectPath + "/resources/01_RootElementPersons.xmi");
		c = createResource(projectPath + "/instances/corr.xmi");
		p = createResource(projectPath + "/instances/protocol.xmi");
	
		EcoreUtil.resolveAll(rs);
	}
	
	private static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("FamiliesToPersons_MA");
		options.debug(true);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}

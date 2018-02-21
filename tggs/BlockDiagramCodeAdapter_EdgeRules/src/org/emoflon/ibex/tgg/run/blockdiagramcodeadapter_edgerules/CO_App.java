package org.emoflon.ibex.tgg.run.blockdiagramcodeadapter_edgerules;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.strategies.co.CO;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;

import BlockDiagram.impl.BlockDiagramPackageImpl;
import MocaTree.impl.MocaTreePackageImpl;

public class CO_App extends CO {

	String srcPath;
	String trgPath;
	String corrPath;
	String protPath;
	
	public CO_App(String projectName, String workspacePath, boolean debug, String srcPath, String trgPath, 
			String corrPath, String protPath) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
		this.srcPath = srcPath;
		this.trgPath = trgPath;
		this.corrPath = corrPath;
		this.protPath = protPath;
		registerBlackInterpreter(new DemoclesTGGEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		CO_App co = new CO_App("BlockDiagramCodeAdapter_EdgeRules", "./../",  true, "/resources/co/src", "/resources/co/trg", 
				"/resources/co/corr", "/resources/co/protocol");
		
		logger.info("Starting CO");
		long tic = System.currentTimeMillis();
		co.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed CO in: " + (toc - tic) + " ms");
		
		co.saveModels();
		co.terminate();
		
		logger.info(co.generateConsistencyReport());
	}

	protected void registerUserMetamodels() throws IOException {
		// Load and register source and target metamodels
		rs.getPackageRegistry().put("platform:/resource/BlockDiagram/model/BlockDiagram.ecore", BlockDiagramPackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", MocaTreePackageImpl.init());
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	@Override
	public void loadModels() throws IOException {
		s = loadResource(projectPath +srcPath+".xmi");
		t = loadResource(projectPath +trgPath+".xmi");
		c = loadResource(projectPath +corrPath+".xmi");
		p = createResource(projectPath +protPath+".xmi");
	
		EcoreUtil.resolveAll(rs);
	}
	
	@Override
	public void saveModels() throws IOException {
		p.save(null);
	}
	
	protected static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectPath("BenchmarxFamiliesToPersons");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}

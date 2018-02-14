package org.emoflon.ibex.tgg.run.processcodeadapter;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.strategies.co.CO;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import MocaTree.impl.MocaTreePackageImpl;
import ProcessDefinition.impl.ProcessDefinitionPackageImpl;

public class CO_App extends CO {

	String srcPath;
	String trgPath;
	String corrPath;
	
	public CO_App(String projectName, String workspacePath, boolean debug, String srcPath, String trgPath, String corrPath) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
		this.srcPath = srcPath;
		this.trgPath = trgPath;
		this.corrPath = corrPath;
		registerBlackInterpreter(new DemoclesEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		CO_App co = new CO_App("ProcessCodeAdapter", "./../", false, "src", "trg", "corr");
		
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
		rs.getPackageRegistry().put("platform:/resource/ProcessDefinition/model/ProcessDefinition.ecore", ProcessDefinitionPackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", MocaTreePackageImpl.init());
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	@Override
	public void loadModels() throws IOException {
		s = loadResource(projectPath + "/resources/co/"+srcPath+".xmi");
		t = loadResource(projectPath + "/resources/co/"+trgPath+".xmi");
		c = loadResource(projectPath + "/resources/co/"+corrPath+".xmi");
		p = createResource(projectPath + "/resources/co/protocol.xmi");
	
		EcoreUtil.resolveAll(rs);
	}
	
	@Override
	public void saveModels() throws IOException {
		p.save(null);
	}
	
	protected static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("BenchmarxFamiliesToPersons");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}

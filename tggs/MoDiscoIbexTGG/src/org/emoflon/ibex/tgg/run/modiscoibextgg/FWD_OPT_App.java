package org.emoflon.ibex.tgg.run.modiscoibextgg;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;

import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

public class FWD_OPT_App extends FWD_OPT {

	String srcPath;
	String trgPath;
	String corrPath;
	String protPath;
	
	public FWD_OPT_App(String projectName, String workspacePath, boolean debug, String srcPath, String trgPath, 
			String corrPath, String protPath, SupportedILPSolver ilpSolver) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug).setIlpSolver(ilpSolver));
		this.srcPath = srcPath;
		this.trgPath = trgPath;
		this.corrPath = corrPath;
		this.protPath = protPath;
		registerBlackInterpreter(new DemoclesTGGEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		FWD_OPT_App fwd_opt = new FWD_OPT_App("MoDiscoIbexTGG", "./../", true, "/instances/src", "/instances/trg", 
				"/instances/corr", "/instances/protocol", SupportedILPSolver.Gurobi);
		
		logger.info("Starting FWD_OPT");
		long tic = System.currentTimeMillis();
		fwd_opt.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed FWD_OPT in: " + (toc - tic) + " ms");
		
		fwd_opt.saveModels();
		fwd_opt.terminate();
	}

	@Override
	protected void registerUserMetamodels() throws IOException {
		_RegistrationHelper.registerMetamodels(rs, this);
			
		// Register correspondence metamodel last
		loadAndRegisterCorrMetamodel(options.projectPath() + "/model/" + options.projectName() + ".ecore");
	}
	
	private static IbexOptions createIbexOptions() {
		return _RegistrationHelper.createIbexOptions();
	}
	
	@Override
	public void loadModels() throws IOException {
		s = loadResource(options.projectPath() +srcPath+".xmi");
		t = createResource(options.projectPath() +trgPath+".xmi");
		c = createResource(options.projectPath() +corrPath+".xmi");
		p = createResource(options.projectPath() +protPath+".xmi");
	
		EcoreUtil.resolveAll(rs);
	}
}

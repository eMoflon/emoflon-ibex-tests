package org.emoflon.ibex.tgg.run.mocatreetoprocess;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.run.mocatreetoprocess.config._DefaultRegistrationHelper;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

public class BWD_OPT_App extends BWD_OPT {
	private static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	String srcPath;
	String trgPath;
	String corrPath;
	String protPath;
	
	public BWD_OPT_App(String projectName, String workspacePath, boolean debug, String srcPath, String trgPath, 
			String corrPath, String protPath, SupportedILPSolver ilpSolver) throws IOException {
		super(registrationHelper.createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug).setIlpSolver(ilpSolver));
		this.srcPath = srcPath;
		this.trgPath = trgPath;
		this.corrPath = corrPath;
		this.protPath = protPath;
		registerBlackInterpreter(options.getBlackInterpreter());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		BWD_OPT_App bwd_opt = new BWD_OPT_App("MocaTreeToProcess", "./../", true, "/instances/src", "/instances/trg", 
				"/instances/corr", "/instances/protocol", SupportedILPSolver.Gurobi);
		
		logger.info("Starting BWD_OPT");
		long tic = System.currentTimeMillis();
		bwd_opt.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed BWD_OPT in: " + (toc - tic) + " ms");
		
		bwd_opt.saveModels();
		bwd_opt.terminate();
	}

	@Override
	protected void registerUserMetamodels() throws IOException {
		registrationHelper.registerMetamodels(rs, this);
			
		// Register correspondence metamodel last
		loadAndRegisterCorrMetamodel(options.projectPath() + "/model/" + options.projectName() + ".ecore");
	}
	
	@Override
	public void loadModels() throws IOException {
		s = createResource(options.projectPath() +srcPath+".xmi");
		t = loadResource(options.projectPath() +trgPath+".xmi");
		c = createResource(options.projectPath() +corrPath+".xmi");
		p = createResource(options.projectPath() +protPath+".xmi");
	
		EcoreUtil.resolveAll(rs);
	}
}

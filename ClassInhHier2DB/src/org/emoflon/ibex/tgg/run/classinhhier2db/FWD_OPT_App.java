package org.emoflon.ibex.tgg.run.classinhhier2db;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.run.classinhhier2db.config._DefaultRegistrationHelper;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

public class FWD_OPT_App extends FWD_OPT {

	private static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	String srcPath;
	String trgPath;
	String corrPath;
	String protPath;
	
	public FWD_OPT_App(String projectName, String workspacePath, boolean debug, String srcPath, String trgPath, 
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

		FWD_OPT_App sync = new FWD_OPT_App("ClassInhHier2DB", "./../", true, "/resources/co/src", "/resources/co/trg", 
				"/resources/co/corr", "/resources/co/protocol", SupportedILPSolver.Gurobi);
		
		logger.info("Starting FWD_OPT");
		long tic = System.currentTimeMillis();
		sync.forward();
		long toc = System.currentTimeMillis();
		logger.info("Completed FWD_OPT in: " + (toc - tic) + " ms");
		
		sync.terminate();
		sync.saveModels();
	}
	
	@Override
	protected void registerUserMetamodels() throws IOException {
		registrationHelper.registerMetamodels(rs, this);
			
		// Register correspondence metamodel last
		loadAndRegisterCorrMetamodel(options.projectPath() + "/model/" + options.projectName() + ".ecore");
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

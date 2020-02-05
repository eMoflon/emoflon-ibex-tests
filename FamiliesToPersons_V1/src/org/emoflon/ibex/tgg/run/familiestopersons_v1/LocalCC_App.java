package org.emoflon.ibex.tgg.run.familiestopersons_v1;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.opt.LocalCC;
import org.emoflon.ibex.tgg.run.familiestopersons_v1.config._DefaultRegistrationHelper;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

public class LocalCC_App extends LocalCC {
	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public LocalCC_App(String projectName, String workspacePath, boolean debug,
			String srcPath, String trgPath, String corrPath, String protocolPath, SupportedILPSolver ilpSolver) throws IOException {
		super(registrationHelper.createIbexOptions().project.name(projectName).project.workspacePath(workspacePath).debug.ibexDebug(debug).ilpSolver(ilpSolver).resourceHandler(new TGGResourceHandler() {
			@Override
			public void loadModels() throws IOException {
				source = loadResource(options.project.path() + "/resources/"+srcPath+".xmi");
				target = loadResource(options.project.path() + "/resources/"+trgPath+".xmi");
				corr = loadResource(options.project.path() + "/resources/"+corrPath+".xmi");
				protocol = loadResource(options.project.path() + "/resources/"+protocolPath+".xmi");
			}
			
			@Override
			public void saveModels() throws IOException {
			}
		}));
	}
	
	public LocalCC_App(String projectName, String workspacePath, boolean debug,
			String srcPath, String trgPath, SupportedILPSolver ilpSolver) throws IOException {
		super(registrationHelper.createIbexOptions().project.name(projectName).project.workspacePath(workspacePath).debug.ibexDebug(debug).ilpSolver(ilpSolver).resourceHandler(new TGGResourceHandler() {
			@Override
			public void loadModels() throws IOException {
				source = loadResource(options.project.path() + "/resources/"+srcPath+".xmi");
				target = loadResource(options.project.path() + "/resources/"+trgPath+".xmi");
				corr = createResource(options.project.path() + "/instances/corr.xmi");
				protocol = createResource(options.project.path() + "/instances/protocol.xmi");
			}
			
			@Override
			public void saveModels() throws IOException {
			}
		}));
	}
	
	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		LocalCC_App cc = new LocalCC_App("FamiliesToPersons_V1", "./../", true, "../instances/src", "../instances/trg", "../instances/corr", "../instances/protocol", SupportedILPSolver.Gurobi);
		
		logger.info("Starting CC");
		long tic = System.currentTimeMillis();
		cc.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed CC in: " + (toc - tic) + " ms");
		
		System.out.println(cc.generateConsistencyReport());
		
		cc.saveModels();
		cc.terminate();
	}
}

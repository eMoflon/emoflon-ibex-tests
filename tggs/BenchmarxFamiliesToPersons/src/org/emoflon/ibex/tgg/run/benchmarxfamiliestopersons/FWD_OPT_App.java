package org.emoflon.ibex.tgg.run.benchmarxfamiliestopersons;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.*;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import Families.impl.FamiliesPackageImpl;
import Persons.impl.PersonsPackageImpl;

public class FWD_OPT_App extends FWD_OPT {

	public FWD_OPT_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
		registerBlackInterpreter(new DemoclesEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		FWD_OPT_App sync = new FWD_OPT_App("BenchmarxFamiliesToPersons", "./../", true);
		
		logger.info("Starting SYNC");
		long tic = System.currentTimeMillis();
		sync.forward();
		long toc = System.currentTimeMillis();
		logger.info("Completed SYNC in: " + (toc - tic) + " ms");
		
		sync.terminate();
		sync.saveModels();
	}
	
	@Override
	protected void registerUserMetamodels() throws IOException {
		rs.getPackageRegistry().put("platform:/resource/Families/model/Families.ecore", FamiliesPackageImpl.init());
		//rs.getPackageRegistry().put("platform:/resource/Persons/model/Persons.ecore", PersonsPackageImpl.init());
		//loadAndRegisterMetamodel("platform:/resource/../../benchmarx/examples/familiestopersons/metamodels/Families/model/Families.ecore");
		
		//Resource res2 = loadResource("platform:/resource/../../benchmarx/examples/familiestopersons/metamodels/Families/model/Families.ecore");
		//EPackage pack2 = (EPackage) res2.getContents().get(0);
		//rs.getResources().remove(res2);
		//rs.getPackageRegistry().put("platform:/resource/Families/model/Families", pack2);
		
		Resource res = loadResource("platform:/resource/../../benchmarx/examples/familiestopersons/metamodels/Persons/model/Persons.ecore");
		EPackage pack = (EPackage) res.getContents().get(0);
		rs.getResources().remove(res);
		rs.getPackageRegistry().put("platform:/resource/Persons/model/Persons.ecore", pack);
		
		//loadAndRegisterMetamodel("C:/Users/Nils/git/benchmarx/examples/familiestopersons/metamodels/Persons/model/Persons.ecore");
//		rs.getURIConverter().getURIMap().put(
//				URI.createURI("platform:/resource/Persons/model/Persons.ecore"), 
//				URI.createURI("platform:/resource/../../benchmarx/examples/familiestopersons/metamodels/Persons/model/Persons.ecore")
//			);
		
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	@Override
	public void loadModels() throws IOException {
		s = loadResource(projectPath + "/instances/src.xmi");
		t = createResource(projectPath + "/instances/trg.xmi");
		c = createResource(projectPath + "/instances/corr.xmi");
		p = createResource(projectPath + "/instances/protocol.xmi");
		
		EcoreUtil.resolveAll(rs);

	}
	
	protected static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("BenchmarxFamiliesToPersons");
		options.debug(true);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}

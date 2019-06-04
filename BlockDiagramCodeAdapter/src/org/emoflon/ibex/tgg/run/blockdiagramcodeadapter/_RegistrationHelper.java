package org.emoflon.ibex.tgg.run.blockdiagramcodeadapter;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.blockdiagramcodeadapter.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;

import BlockDiagram.impl.BlockDiagramPackageImpl;
import BlockDiagramCodeAdapter.BlockDiagramCodeAdapterPackage;
import BlockDiagramCodeAdapter.impl.BlockDiagramCodeAdapterPackageImpl;
import MocaTree.impl.MocaTreePackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy)  throws IOException {
		// Load and register source and target metamodels
		BlockDiagramPackageImpl.init();
	    MocaTreePackageImpl.init();
		
	    BlockDiagramCodeAdapterPackageImpl.init();
		
		rs.getPackageRegistry().put("platform:/resource/BlockDiagramCodeAdapter/model/BlockDiagramCodeAdapter.ecore", BlockDiagramCodeAdapterPackage.eINSTANCE);
		rs.getPackageRegistry().put("platform:/plugin/BlockDiagramCodeAdapter/model/BlockDiagramCodeAdapter.ecore", BlockDiagramCodeAdapterPackage.eINSTANCE);
	    
		if(strategy instanceof FWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/BlockDiagram/model/BlockDiagram.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/BlockDiagram/model/BlockDiagram.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/BlockDiagram/model/BlockDiagram.ecore", pack);
		}
		
		if(strategy instanceof BWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/MocaTree/model/MocaTree.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/MocaTree/model/MocaTree.ecore", pack);
		}
	}
	
	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("BlockDiagramCodeAdapter");
		options.projectPath("BlockDiagramCodeAdapter");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}

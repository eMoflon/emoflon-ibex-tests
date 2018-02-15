package org.emoflon.ibex.tgg.run.mocatreetoprocess;

import org.eclipse.emf.ecore.resource.ResourceSet;

import MocaTree.impl.MocaTreePackageImpl;
import ProcessDefinition.impl.ProcessDefinitionPackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs) {
		// Load and register source and target metamodels
		rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", MocaTreePackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/ProcessDefinition/model/ProcessDefinition.ecore", ProcessDefinitionPackageImpl.init());
	}
}

package org.emoflon.ibex.tgg.run.ibextgggantt2cpm.config;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.ibextgggantt2cpm.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.runtime.democles.DemoclesTGGEngine;

import cpm.CpmPackage;
import gantt.GanttPackage;

public class DemoclesRegistrationHelper implements IRegistrationHelper {

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable)  throws IOException {
		EPackage cpmPack = CpmPackage.eINSTANCE;
		EPackage ganttPack = GanttPackage.eINSTANCE;
		
		rs.getPackageRegistry().put("http://de.ubt.ai1.bw.qvt.examples.gantt.ecore", ganttPack);
		rs.getPackageRegistry().put("http://de.ubt.ai1.bw.qvt.examples.cpm.ecore", cpmPack);
		rs.getPackageRegistry().put("platform:/resource/Gantt/model/Gantt.ecore", ganttPack);
		rs.getPackageRegistry().put("platform:/resource/CPM/model/CPM.ecore", cpmPack);
	}
	
	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new DemoclesTGGEngine());
		options.project.name("IBeXTGGGantt2CPM");
		options.project.path("IBeXTGGGantt2CPM");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}

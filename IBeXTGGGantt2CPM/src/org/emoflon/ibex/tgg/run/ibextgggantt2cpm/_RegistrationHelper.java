package org.emoflon.ibex.tgg.run.ibextgggantt2cpm;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.ibextgggantt2cpm.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;

import IBeXTGGGantt2CPM.IBeXTGGGantt2CPMPackage;
import IBeXTGGGantt2CPM.impl.IBeXTGGGantt2CPMPackageImpl;
import cpm.CpmPackage;
import gantt.GanttPackage;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy)  throws IOException {
		DefaultRegistrationHelper.setWorkspaceRootDirectory(rs);
		
		EPackage cpmPack = CpmPackage.eINSTANCE;
		EPackage ganttPack = GanttPackage.eINSTANCE;
		
		rs.getPackageRegistry().put("http://de.ubt.ai1.bw.qvt.examples.gantt.ecore", ganttPack);
		rs.getPackageRegistry().put("http://de.ubt.ai1.bw.qvt.examples.cpm.ecore", cpmPack);
		rs.getPackageRegistry().put("platform:/resource/Gantt/model/Gantt.ecore", ganttPack);
		rs.getPackageRegistry().put("platform:/resource/CPM/model/CPM.ecore", cpmPack);
		
		IBeXTGGGantt2CPMPackageImpl.init();
		
		rs.getPackageRegistry().put("platform:/resource/IBeXTGGGantt2CPM/model/IBeXTGGGantt2CPM.ecore", IBeXTGGGantt2CPMPackage.eINSTANCE);
		rs.getPackageRegistry().put("platform:/plugin/IBeXTGGGantt2CPM/model/IBeXTGGGantt2CPM.ecore", IBeXTGGGantt2CPMPackage.eINSTANCE);
	}
	
	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		return DefaultRegistrationHelper.createIbexOptions();
	}
}

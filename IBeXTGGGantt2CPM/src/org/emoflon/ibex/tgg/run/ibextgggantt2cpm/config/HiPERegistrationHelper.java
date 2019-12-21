package org.emoflon.ibex.tgg.run.ibextgggantt2cpm.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.ibextgggantt2cpm.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;

import IBeXTGGGantt2CPM.IBeXTGGGantt2CPMPackage;
import IBeXTGGGantt2CPM.impl.IBeXTGGGantt2CPMPackageImpl;
import cpm.impl.CpmPackageImpl;
import gantt.impl.GanttPackageImpl;

public class HiPERegistrationHelper implements IRegistrationHelper {
	
	/** Create default options **/
	public final void setWorkspaceRootDirectory(ResourceSet resourceSet) throws IOException {
		final String root = "../";
		URI key = URI.createPlatformResourceURI("/", true);
		URI value = URI.createFileURI(new File(root).getCanonicalPath() + File.separatorChar);
		resourceSet.getURIConverter().getURIMap().put(key, value);
	}

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable) throws IOException {
		
		// Set correct workspace root
		setWorkspaceRootDirectory(rs);
		
		// Load and register source and target metamodels
		EPackage ganttPack = null;
		EPackage cpmPack = null;
		EPackage ibextgggantt2cpmPack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/CPM/model/CPM.ecore");
			cpmPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/IBeXTGGGantt2CPM/model/IBeXTGGGantt2CPM.ecore");
			ibextgggantt2cpmPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/Gantt/model/Gantt.ecore");
			ganttPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/IBeXTGGGantt2CPM/model/IBeXTGGGantt2CPM.ecore");
			ibextgggantt2cpmPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(ganttPack == null)
			ganttPack = GanttPackageImpl.init();
				
		if(cpmPack == null)
			cpmPack = CpmPackageImpl.init();
		
		if(ibextgggantt2cpmPack == null) {
			ibextgggantt2cpmPack = IBeXTGGGantt2CPMPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/IBeXTGGGantt2CPM/model/IBeXTGGGantt2CPM.ecore", IBeXTGGGantt2CPMPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/IBeXTGGGantt2CPM/model/IBeXTGGGantt2CPM.ecore", IBeXTGGGantt2CPMPackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/Gantt/model/Gantt.ecore", ganttPack);
	    rs.getPackageRegistry().put("platform:/plugin/Gantt/model/Gantt.ecore", ganttPack);	
			
		rs.getPackageRegistry().put("platform:/resource/CPM/model/CPM.ecore", cpmPack);
		rs.getPackageRegistry().put("platform:/plugin/CPM/model/CPM.ecore", cpmPack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.setBlackInterpreter(new HiPETGGEngine());
		options.projectName("IBeXTGGGantt2CPM");
		options.projectPath("IBeXTGGGantt2CPM");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}

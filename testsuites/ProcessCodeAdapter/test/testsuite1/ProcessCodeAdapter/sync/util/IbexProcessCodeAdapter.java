package testsuite1.ProcessCodeAdapter.sync.util;

import java.io.IOException;
import java.util.function.Consumer;

import org.benchmarx.Configurator;
import org.benchmarx.emf.BXToolForEMF;
import org.benchmarx.mocaTree.core.MocaTreeFolderComparator;
import org.benchmarx.processDefinition.core.ProcessDefinitionComparator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.SYNC_App;

import MocaTree.Folder;
import MocaTree.MocaTreeFactory;
import ProcessDefinition.SystemModule;

/**
 * This class implements the bx tool interface for eMoflon::Ibex, which is
 * structural-delta-based and corr-based.
 * 
 * 
 * @author anthony anjorin
 */
public class IbexProcessCodeAdapter extends BXToolForEMF<Folder, SystemModule, Decisions>   {
	
	private static final String RESULTPATH = "results/ibex";
	
	private boolean flatten;
	private SYNC synchroniser;
	
	public IbexProcessCodeAdapter(boolean flatten) {
		super(new MocaTreeFolderComparator(true), new ProcessDefinitionComparator(true));
		this.flatten = flatten;
	}
	
	@Override
	public String getName() {
		return "eMoflon::Ibex";
	}
	
	@Override
	public void initiateSynchronisationDialogue() {
		try {
			synchroniser = new SYNC_App("ProcessCodeAdapter", "./../", flatten, false);
			
			Folder folder = MocaTreeFactory.eINSTANCE.createFolder();
			folder.setName("Example");
			folder.setIndex(0);
			
			synchroniser.getSourceResource().getContents().add(folder);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void performAndPropagateTargetEdit(Consumer<SystemModule> edit) {
		edit.accept(getSystemModule());
		try {
			synchroniser.backward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private SystemModule getSystemModule() {
		return (SystemModule) synchroniser.getTargetResource().getContents().get(0);
	}

	@Override
	public void performAndPropagateSourceEdit(Consumer<Folder> edit) {
		edit.accept(getFolder());
		try {
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private Folder getFolder() {
		return (Folder) synchroniser.getSourceResource().getContents().get(0);
	}

	@Override
	public Folder getSourceModel() {
		return getFolder();
	} 

	@Override
	public SystemModule getTargetModel() {
		return getSystemModule();
	}

	@Override
	public void setConfigurator(Configurator<Decisions> configurator) {
		// No configuration for now
	}
	
	@Override
	public void saveModels(String name) {
		ResourceSet set = new ResourceSetImpl();
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		URI srcURI = URI.createFileURI(RESULTPATH + "/" + name + "MocaTree.xmi");
		URI trgURI = URI.createFileURI(RESULTPATH + "/" + name + "ProcessDefinition.xmi");
		Resource resSource = set.createResource(srcURI);
		Resource resTarget = set.createResource(trgURI);
		
		EObject colSource = EcoreUtil.copy(getSourceModel());
		EObject colTarget = EcoreUtil.copy(getTargetModel());
		
		resSource.getContents().add(colSource);
		resTarget.getContents().add(colTarget);
		
		try {
			resSource.save(null);
			resTarget.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void performIdleTargetEdit(Consumer<SystemModule> edit) {
		performAndPropagateTargetEdit(edit);
	}

	@Override
	public void performIdleSourceEdit(Consumer<Folder> edit) {
		performAndPropagateSourceEdit(edit);
	}
	
	@Override
	public void terminateSynchronisationDialogue() {
		try {
			synchroniser.saveModels();
			saveModels("results");
			synchroniser.terminate();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

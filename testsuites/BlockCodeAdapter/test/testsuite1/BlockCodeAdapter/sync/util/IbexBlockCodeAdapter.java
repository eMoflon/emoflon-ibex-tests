package testsuite1.BlockCodeAdapter.sync.util;

import java.io.IOException;
import java.util.function.Consumer;

import org.benchmarx.Configurator;
import org.benchmarx.blockLanguage.core.BlockLanguageComparator;
import org.benchmarx.emf.BXToolForEMF;
import org.benchmarx.mocaTree.core.MocaTreeFileComparator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.SYNC_App;

import BlockLanguage.BlockLanguageFactory;
import BlockLanguage.Specification;
import MocaTree.File;

/**
 * This class implements the bx tool interface for eMoflon::Ibex, which is
 * structural-delta-based and corr-based.
 * 
 * 
 * @author anthony anjorin
 */
public class IbexBlockCodeAdapter extends BXToolForEMF<File, Specification, Decisions>   {
	
	private static final String RESULTPATH = "results/ibex";
	
	private boolean flatten;
	private SYNC synchroniser;
	
	public IbexBlockCodeAdapter(boolean flatten) {
		super(new MocaTreeFileComparator(true), new BlockLanguageComparator(true));
		this.flatten = flatten;
	}
	
	@Override
	public String getName() {
		return "eMoflon::Ibex" + (flatten? " (flattened)" : " (with refinements)");
	}
	
	@Override
	public void initiateSynchronisationDialogue() {
		try {
			synchroniser = new SYNC_App("BlockCodeAdapter", "./../", flatten, true);
			Specification s = BlockLanguageFactory.eINSTANCE.createSpecification();
			s.setName("specification");
			synchroniser.getTargetResource().getContents().add(s);
			synchroniser.backward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void performAndPropagateTargetEdit(Consumer<Specification> edit) {
		edit.accept(getSpecification());
		try {
			synchroniser.backward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private Specification getSpecification() {
		return (Specification) synchroniser.getTargetResource().getContents().get(0);
	}

	@Override
	public void performAndPropagateSourceEdit(Consumer<File> edit) {
		edit.accept(getFile());
		try {
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private File getFile() {
		return (File) synchroniser.getSourceResource().getContents().get(0);
	}

	@Override
	public File getSourceModel() {
		return getFile();
	} 

	@Override
	public Specification getTargetModel() {
		return getSpecification();
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
		URI trgURI = URI.createFileURI(RESULTPATH + "/" + name + "BlockLanguage.xmi");
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
	public void performIdleTargetEdit(Consumer<Specification> edit) {
		performAndPropagateTargetEdit(edit);
	}

	@Override
	public void performIdleSourceEdit(Consumer<File> edit) {
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

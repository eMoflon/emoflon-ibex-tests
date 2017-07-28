package testsuite1.BlockDiagramCodeAdapter.sync.util;

import java.io.IOException;
import java.util.function.Consumer;

import org.benchmarx.Configurator;
import org.benchmarx.blockDiagram.core.BlockDiagramComparator;
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

import BlockDiagram.BlockDiagramFactory;
import BlockDiagram.BlockSystem;
import MocaTree.File;

/**
 * This class implements the bx tool interface for eMoflon::Ibex, which is
 * structural-delta-based and corr-based.
 * 
 * 
 * @author anthony anjorin
 */
public class IbexBlockDiagramCodeAdapter extends BXToolForEMF<BlockSystem, File, Decisions>   {
	
	private static final String RESULTPATH = "results/ibex";
	
	private boolean flatten;
	private SYNC synchroniser;
	
	public IbexBlockDiagramCodeAdapter(boolean flatten) {
		super(new BlockDiagramComparator(true), new MocaTreeFileComparator(true));
		this.flatten = flatten;
	}
	
	@Override
	public String getName() {
		return "eMoflon::Ibex";
	}
	
	@Override
	public void initiateSynchronisationDialogue() {
		try {
			synchroniser = new SYNC_App("BlockDiagramCodeAdapter", "./../", flatten, true);
			BlockSystem bs = BlockDiagramFactory.eINSTANCE.createBlockSystem();
			bs.setName("aBlockSystem");
			synchroniser.getSourceResource().getContents().add(bs);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void performAndPropagateTargetEdit(Consumer<File> edit) {
		edit.accept(getFile());
		try {
			synchroniser.backward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private File getFile() {
		return (File) synchroniser.getTargetResource().getContents().get(0);
	}

	@Override
	public void performAndPropagateSourceEdit(Consumer<BlockSystem> edit) {
		edit.accept(getBlockSystem());
		try {
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private BlockSystem getBlockSystem() {
		return (BlockSystem) synchroniser.getSourceResource().getContents().get(0);
	}

	@Override
	public BlockSystem getSourceModel() {
		return getBlockSystem();
	} 

	@Override
	public File getTargetModel() {
		return getFile();
	}

	@Override
	public void setConfigurator(Configurator<Decisions> configurator) {
		// No configuration for now
	}
	
	@Override
	public void saveModels(String name) {
		ResourceSet set = new ResourceSetImpl();
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		URI srcURI = URI.createFileURI(RESULTPATH + "/" + name + "BlockDiagram.xmi");
		URI trgURI = URI.createFileURI(RESULTPATH + "/" + name + "MocaTree.xmi");
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
	public void performIdleTargetEdit(Consumer<File> edit) {
		performAndPropagateTargetEdit(edit);
	}

	@Override
	public void performIdleSourceEdit(Consumer<BlockSystem> edit) {
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

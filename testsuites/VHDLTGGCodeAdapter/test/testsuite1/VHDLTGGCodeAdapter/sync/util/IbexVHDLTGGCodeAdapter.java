package testsuite1.VHDLTGGCodeAdapter.sync.util;

import java.io.IOException;
import java.util.function.Consumer;

import org.benchmarx.Configurator;
import org.benchmarx.emf.BXToolForEMF;
import org.benchmarx.mocaTree.core.MocaTreeFileComparator;
import org.benchmarx.vhdlModel.core.VHDLModelComparator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.SYNC_App;

import MocaTree.File;
import VHDLModel.VHDLModelFactory;
import VHDLModel.VHDLSpecification;

/**
 * This class implements the bx tool interface for eMoflon::Ibex, which is
 * structural-delta-based and corr-based.
 * 
 * 
 * @author anthony anjorin
 */
public class IbexVHDLTGGCodeAdapter extends BXToolForEMF<File, VHDLSpecification, Decisions>   {
	
	private static final String RESULTPATH = "results/ibex";
	
	private boolean flatten;
	private SYNC synchroniser;
	
	public IbexVHDLTGGCodeAdapter(boolean flatten) {
		super(new MocaTreeFileComparator(true), new VHDLModelComparator(true));
		this.flatten = flatten;
	}
	
	@Override
	public String getName() {
		return flatten ? "eMoflon::Ibex Flattened" : "eMoflon::Ibex Refinements";
	}
	
	@Override
	public void initiateSynchronisationDialogue() {
		try {
			synchroniser = new SYNC_App("VHDLTGGCodeAdapter", "./../", flatten, true);
			
			VHDLSpecification spec = VHDLModelFactory.eINSTANCE.createVHDLSpecification();
			spec.setName("Example");
			
			synchroniser.getTargetResource().getContents().add(spec);
			synchroniser.backward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void performAndPropagateTargetEdit(Consumer<VHDLSpecification> edit) {
		edit.accept(getVHDLSpecification());
		try {
			synchroniser.backward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private VHDLSpecification getVHDLSpecification() {
		return (VHDLSpecification) synchroniser.getTargetResource().getContents().get(0);
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
	public VHDLSpecification getTargetModel() {
		return getVHDLSpecification();
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
		URI trgURI = URI.createFileURI(RESULTPATH + "/" + name + "VHDLModel.xmi");
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
	public void performIdleTargetEdit(Consumer<VHDLSpecification> edit) {
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

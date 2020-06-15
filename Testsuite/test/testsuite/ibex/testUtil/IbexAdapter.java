package testsuite.ibex.testUtil;

import java.io.IOException;
import java.util.function.Consumer;

import org.benchmarx.Configurator;
import org.benchmarx.emf.BXToolForEMF;
import org.benchmarx.emf.Comparator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;

public abstract class IbexAdapter<S extends EObject, T extends EObject> extends BXToolForEMF<S, T, Decisions>   {

	protected static final String RESULTPATH = "results/ibex";
	
	protected String projectName;
	protected SYNC synchroniser;
	protected Configurator<Decisions> configurator;
	
	public IbexAdapter(Comparator<S> src, Comparator<T> trg, String projectName) {
		super(src, trg);
		this.projectName = projectName;
	}
	
	@Override
	public String getName() {
		return "eMoflon::Ibex";
	}

	@Override
	public void performAndPropagateTargetEdit(Consumer<T> edit) {
		edit.accept(getTargetModel());
		try {
			synchroniser.backward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void performAndPropagateSourceEdit(Consumer<S> edit) {
		edit.accept(getSourceModel());
		try {
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public S getSourceModel() {
		return (S) synchroniser.getResourceHandler().getSourceResource().getContents().get(0);
	} 

	@SuppressWarnings("unchecked")
	@Override
	public T getTargetModel() {
		return (T) synchroniser.getResourceHandler().getTargetResource().getContents().get(0);
	}

	@Override
	public void setConfigurator(Configurator<Decisions> configurator) {
		this.configurator = configurator;
	}
	
	@Override
	public void saveModels(String name) {
		ResourceSet set = new ResourceSetImpl();
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		URI srcURI = URI.createFileURI(RESULTPATH + "/" + name + "source.xmi");
		URI trgURI = URI.createFileURI(RESULTPATH + "/" + name + "target.xmi");
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
	public void performIdleTargetEdit(Consumer<T> edit) {
		performAndPropagateTargetEdit(edit);
	}

	@Override
	public void performIdleSourceEdit(Consumer<S> edit) {
		performAndPropagateSourceEdit(edit);
	}
	
	@Override
	public void terminateSynchronisationDialogue() {
		try {
			synchroniser.saveModels();
			saveModels("");
			synchroniser.terminate();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ResourceSet getResourceSet() {
		return synchroniser.getResourceHandler().getResourceSet();
	}
}

package testsuite.ibex.testUtil;

import java.io.IOException;
import java.util.function.BiConsumer;
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
import org.emoflon.ibex.tgg.operational.strategies.integrate.INTEGRATE;

public abstract class IntegIbexAdapter<S extends EObject, T extends EObject> extends BXToolForEMF<S, T, Decisions> {

	protected static final String RESULTPATH = "results/integibex";

	protected String projectName;
	protected INTEGRATE integrator;
	protected Configurator<Decisions> configurator;

	public IntegIbexAdapter(Comparator<S> src, Comparator<T> trg, String projectName) {
		super(src, trg);
		this.projectName = projectName;
	}

	@Override
	public String getName() {
		return "eMoflon::Ibex";
	}

	@Override
	public void initiateSynchronisationDialogue() {
		throw new UnsupportedOperationException("Not allowed for Integrate test");
	}

	@Override
	public void terminateSynchronisationDialogue() {
		throw new UnsupportedOperationException("Not allowed for Integrate test");
	}

	@Override
	public void performAndPropagateSourceEdit(Consumer<S> edit) {
		throw new UnsupportedOperationException("Not allowed for Integrate test");

	}

	@Override
	public void performAndPropagateTargetEdit(Consumer<T> edit) {
		throw new UnsupportedOperationException("Not allowed for Integrate test");

	}

	@Override
	public void performIdleSourceEdit(Consumer<S> edit) {
		throw new UnsupportedOperationException("Not allowed for Integrate test");
	}

	@Override
	public void performIdleTargetEdit(Consumer<T> edit) {
		throw new UnsupportedOperationException("Not allowed for Integrate test");
	}

	@Override
	public void setConfigurator(Configurator<Decisions> configurator) {
		this.configurator = configurator;
	}

	@SuppressWarnings("unchecked")
	@Override
	public S getSourceModel() {
		return (S) integrator.getSourceResource().getContents().get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T getTargetModel() {
		return (T) integrator.getTargetResource().getContents().get(0);
	}

	@Override
	public void saveModels(String name) {
		ResourceSet set = new ResourceSetImpl();
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());
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

	public ResourceSet getResourceSet() {
		return integrator.getResourceSet();
	}

	abstract public void initiateIntegrationDialogue();

	public void terminateIntegrationDialogue() {
		try {
			integrator.saveModels();
			saveModels("");
			integrator.terminate();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void applyAndIntegrateDelta(BiConsumer<S, T> delta) {
		integrator.applyDelta((BiConsumer<EObject, EObject>) delta);
		try {
			integrator.integrate();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public void applyIdleDelta(BiConsumer<S, T> delta) {
		integrator.applyDelta((BiConsumer<EObject, EObject>) delta);
	}
}

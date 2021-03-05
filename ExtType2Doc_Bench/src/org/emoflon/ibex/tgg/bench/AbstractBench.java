package org.emoflon.ibex.tgg.bench;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emoflon.ibex.tgg.bench.util.BenchEntry;
import org.emoflon.ibex.tgg.bench.util.BenchParameters;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;

public abstract class AbstractBench<OpStrat extends OperationalStrategy, BenchParams extends BenchParameters> {

	protected String workspacePath = "";
	protected ResourceSet rs = createResourceSet();
	protected URI base = URI.createPlatformResourceURI("/", true);

	protected Resource source;
	protected Resource target;
	protected Resource corr;
	protected Resource protocol;

	protected Resource delta;

	protected BenchParams parameters;

	protected int numOfElements;

	public BenchEntry genAndBench(BenchParams parameters) {
		this.parameters = parameters;
		try {
			OpStrat opStrat = initStub();
			initializeResource(opStrat);

			ModelAndDeltaGenerator<?, ?, ?, BenchParams> mdGenerator = initModelAndDeltaGenerator(source, target, corr, protocol, delta);
			mdGenerator.gen(parameters);
			this.numOfElements = mdGenerator.getNumOfElements();

			return applyDeltaAndRun(opStrat);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void genAndStore(BenchParams parameters, String path) {
		// TODO
	}

	public BenchEntry loadAndBench(String path) {
		// TODO
		return null;
	}

	protected abstract OpStrat initStub() throws IOException;

	protected abstract ModelAndDeltaGenerator<?, ?, ?, BenchParams> initModelAndDeltaGenerator(Resource s, Resource t, Resource c, Resource p, Resource d);

	protected abstract BenchEntry applyDeltaAndRun(OpStrat opStrat) throws IOException;

	private void initializeResource(OpStrat opStrat) {
		source = opStrat.getOptions().resourceHandler().getSourceResource();
		target = opStrat.getOptions().resourceHandler().getTargetResource();
		corr = opStrat.getOptions().resourceHandler().getCorrResource();
		protocol = opStrat.getOptions().resourceHandler().getProtocolResource();
	}

	private ResourceSet createResourceSet() {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap() //
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		try {
			rs.getURIConverter().getURIMap().put(URI.createPlatformResourceURI("/", true),
					URI.createFileURI(new File(workspacePath).getCanonicalPath() + File.separator));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public Resource createResource(String workspaceRelativePath) {
		URI uri = URI.createURI(workspaceRelativePath);
		Resource res = rs.createResource(uri.resolve(base), ContentHandler.UNSPECIFIED_CONTENT_TYPE);
		return res;
	}

}

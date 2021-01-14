package org.emoflon.ibex.tgg.bench;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;

import ExtDocModel.ExtDocModelFactory;
import ExtTypeModel.ExtTypeModelFactory;

public abstract class AbstractIntegrationBench<CorrFactory extends EFactory> {

	protected final ExtTypeModelFactory tFactory = ExtTypeModelFactory.eINSTANCE;
	protected final ExtDocModelFactory dFactory = ExtDocModelFactory.eINSTANCE;
	protected final CorrFactory cFactory = corrFactoryInstance();

	protected String workspacePath = "";
	protected ResourceSet rs = createResourceSet();
	protected URI base = URI.createPlatformResourceURI("/", true);
	
	protected Resource source;
	protected Resource target;
	protected Resource corr;
	protected Resource protocol;

	protected abstract CorrFactory corrFactoryInstance();
	
	private void initializeResource(OperationalStrategy opStrategy) {
		source = opStrategy.getOptions().resourceHandler().getSourceResource();
		target = opStrategy.getOptions().resourceHandler().getTargetResource();
		corr = opStrategy.getOptions().resourceHandler().getCorrResource();
		protocol = opStrategy.getOptions().resourceHandler().getProtocolResource();
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

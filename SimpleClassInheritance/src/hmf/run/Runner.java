package hmf.run;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.importer.ecore.EcoreImporter;

public class Runner {

	public static void main(String[] args) throws Exception {
		Runner run = new Runner();
		run.run();
	}
	
	public final ResourceSet createResourceSet(String workspacePath) throws IOException {
		final String root = "../";
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		try {
			rs.getURIConverter().getURIMap().put(URI.createPlatformResourceURI("/", true), URI.createFileURI(new File(workspacePath).getCanonicalPath() + File.separator));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		URI key = URI.createPlatformResourceURI("/", true);
		URI value = URI.createFileURI(new File(root).getCanonicalPath() + File.separatorChar);
		rs.getURIConverter().getURIMap().put(key, value);
		
		return rs;
	}
	
	public void run() throws Exception {
		EcorePackage.eINSTANCE.getName();
		GenModelPackage.eINSTANCE.getName();
		
		String pluginID = "SimpleClassInheritance";
		URI base = URI.createPlatformResourceURI("/", true);
		String metaModelLocation = pluginID + "/model/" + pluginID + ".ecore";
		
		ResourceSet rs = createResourceSet(pluginID);
		
		URI uri = URI.createURI(metaModelLocation);
		Resource metaRes = rs.createResource(uri.resolve(base), ContentHandler.UNSPECIFIED_CONTENT_TYPE);
		metaRes.load(null);
		EPackage metaModel = (EPackage) metaRes.getContents().get(0);
		
		URI metaModelUri = URI.createURI(metaModelLocation);
		metaModelUri = metaModelUri.resolve(base);

		URI genUri = URI.createURI(pluginID + "/model/" + pluginID + ".genmodel");
		Resource Genres = rs.createResource(genUri.resolve(base), ContentHandler.UNSPECIFIED_CONTENT_TYPE);
		Genres.load(null);
				
		GenModel genModel = (GenModel) Genres.getContents().get(0);
		
		System.out.println(genModel);
//		EcoreImporter importer = new EcoreImporter();
//		importer.setModelLocation(metaModelUri.toString());
//		importer.computeEPackages(monitor);
//		importer.adjustEPackages(monitor);
//		
//		for(EPackage ePackage : importer.getEPackages()) {
//			if(ePackage.getName().equals(metaModel.getName())) {
//				importer.getEPackageConvertInfo(ePackage).setConvert(true);
//			}else {
//				importer.getEPackageConvertInfo(ePackage).setConvert(false);
//			}
//		}			
//		
//		importer.setGenModelContainerPath(new Path(pluginID).append("model"));
//		importer.setGenModelFileName(importer.computeDefaultGenModelFileName());
//		importer.prepareGenModelAndEPackages(monitor);
//
//		GenModel genModel = importer.getGenModel();
//		genModel.setModelDirectory(pluginID + "/gen/");
	}
}

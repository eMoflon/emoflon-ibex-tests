package testsuite1.ClassInhHier2DB.sync.util;

import java.io.IOException;
import java.util.function.Consumer;

import org.benchmarx.Configurator;
import org.benchmarx.classInheritanceHierarchy.core.ClassInheritanceHierarchyComparator;
import org.benchmarx.database.core.DatabaseComparator;
import org.benchmarx.emf.BXToolForEMF;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.SYNC_App;

import ClassInheritanceHierarchy.ClassInheritanceHierarchyFactory;
import ClassInheritanceHierarchy.ClassPackage;
import Database.DB;

/**
 * This class implements the bx tool interface for eMoflon::Ibex, which is
 * structural-delta-based and corr-based.
 * 
 * 
 * @author anthony anjorin
 */
public class IbexClassInhHier2DB extends BXToolForEMF<ClassPackage, DB, Decisions>   {
	
	private static final String RESULTPATH = "results/ibex";
	
	private boolean flatten;
	private SYNC synchroniser;
	
	public IbexClassInhHier2DB(boolean flatten) {
		super(new ClassInheritanceHierarchyComparator(true), new DatabaseComparator(true));
		this.flatten = flatten;
	}
	
	@Override
	public String getName() {
		return "eMoflon::Ibex";
	}
	
	@Override
	public void initiateSynchronisationDialogue() {
		try {
			synchroniser = new SYNC_App("ClassInhHier2DB", "./../", flatten, true);
			ClassPackage pkg = ClassInheritanceHierarchyFactory.eINSTANCE.createClassPackage();
			pkg.setName("P");
			synchroniser.getSourceResource().getContents().add(pkg);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void performAndPropagateTargetEdit(Consumer<DB> edit) {
		edit.accept(getDB());
		try {
			synchroniser.backward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private DB getDB() {
		return (DB) synchroniser.getTargetResource().getContents().get(0);
	}

	@Override
	public void performAndPropagateSourceEdit(Consumer<ClassPackage> edit) {
		edit.accept(getClassPackage());
		try {
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private ClassPackage getClassPackage() {
		return (ClassPackage) synchroniser.getSourceResource().getContents().get(0);
	}

	@Override
	public ClassPackage getSourceModel() {
		return getClassPackage();
	} 

	@Override
	public DB getTargetModel() {
		return getDB();
	}

	@Override
	public void setConfigurator(Configurator<Decisions> configurator) {
		// No configuration for now
	}
	
	@Override
	public void saveModels(String name) {
		ResourceSet set = new ResourceSetImpl();
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		URI srcURI = URI.createFileURI(RESULTPATH + "/" + name + "ClassInheritanceHierarchy.xmi");
		URI trgURI = URI.createFileURI(RESULTPATH + "/" + name + "Database.xmi");
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
	public void performIdleTargetEdit(Consumer<DB> edit) {
		performAndPropagateTargetEdit(edit);
	}

	@Override
	public void performIdleSourceEdit(Consumer<ClassPackage> edit) {
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

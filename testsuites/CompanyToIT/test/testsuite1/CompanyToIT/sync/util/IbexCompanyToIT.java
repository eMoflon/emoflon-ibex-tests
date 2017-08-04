package testsuite1.CompanyToIT.sync.util;

import java.io.IOException;
import java.util.function.Consumer;

import org.benchmarx.Configurator;
import org.benchmarx.companyLanguage.core.CompanyLanguageComparator;
import org.benchmarx.emf.BXToolForEMF;
import org.benchmarx.itLanguage.core.ITLanguageComparator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.SYNC_App;

import CompanyLanguage.CEO;
import CompanyLanguage.Company;
import CompanyLanguage.CompanyLanguageFactory;
import ITLanguage.IT;

/**
 * This class implements the bx tool interface for eMoflon::Ibex, which is
 * structural-delta-based and corr-based.
 * 
 * 
 * @author anthony anjorin
 */
public class IbexCompanyToIT extends BXToolForEMF<Company, IT, Decisions>   {
	
	private static final String RESULTPATH = "results/ibex";
	
	private boolean flatten;
	private SYNC synchroniser;
	
	public IbexCompanyToIT(boolean flatten) {
		super(new CompanyLanguageComparator(true), new ITLanguageComparator(true));
		this.flatten = flatten;
	}
	
	@Override
	public String getName() {
		return "eMoflon::Ibex";
	}
	
	@Override
	public void initiateSynchronisationDialogue() {
		try {
			synchroniser = new SYNC_App("CompanyToIT", "./../", flatten, true);
			
			Company company = CompanyLanguageFactory.eINSTANCE.createCompany();
			company.setName("ES");
			CEO ceo = CompanyLanguageFactory.eINSTANCE.createCEO();
			company.getCeo().add(ceo);
			ceo.setName("Andy");
			
			synchroniser.getSourceResource().getContents().add(company);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void performAndPropagateTargetEdit(Consumer<IT> edit) {
		edit.accept(getIT());
		try {
			synchroniser.backward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private IT getIT() {
		return (IT) synchroniser.getTargetResource().getContents().get(0);
	}

	@Override
	public void performAndPropagateSourceEdit(Consumer<Company> edit) {
		edit.accept(getCompany());
		try {
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private Company getCompany() {
		return (Company) synchroniser.getSourceResource().getContents().get(0);
	}

	@Override
	public Company getSourceModel() {
		return getCompany();
	} 

	@Override
	public IT getTargetModel() {
		return getIT();
	}

	@Override
	public void setConfigurator(Configurator<Decisions> configurator) {
		// No configuration for now
	}
	
	@Override
	public void saveModels(String name) {
		ResourceSet set = new ResourceSetImpl();
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		URI srcURI = URI.createFileURI(RESULTPATH + "/" + name + "CompanyLanguage.xmi");
		URI trgURI = URI.createFileURI(RESULTPATH + "/" + name + "ITLanguage.xmi");
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
	public void performIdleTargetEdit(Consumer<IT> edit) {
		performAndPropagateTargetEdit(edit);
	}

	@Override
	public void performIdleSourceEdit(Consumer<Company> edit) {
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
	
	public SYNC getSYNC() {
		return synchroniser;
	}
}

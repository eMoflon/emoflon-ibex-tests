package testsuite1.testUtil.performance;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;

import BlockDiagram.impl.BlockDiagramPackageImpl;
import BlockLanguage.impl.BlockLanguagePackageImpl;
import ClassInheritanceHierarchy.impl.ClassInheritanceHierarchyPackageImpl;
import CompanyLanguage.impl.CompanyLanguagePackageImpl;
import Database.impl.DatabasePackageImpl;
import ITLanguage.impl.ITLanguagePackageImpl;
import MocaTree.impl.MocaTreePackageImpl;
import ProcessDefinition.impl.ProcessDefinitionPackageImpl;
import SimpleFamilies.impl.SimpleFamiliesPackageImpl;
import SimplePersons.impl.SimplePersonsPackageImpl;
import VHDLModel.impl.VHDLModelPackageImpl;
import testsuite1.testUtil.Constants;

public class MODELGEN_App extends MODELGEN {
	private String instancePath;

	public MODELGEN_App(String projectName, String workspacePath, boolean debug, String instancePath) throws IOException {
		super(projectName, workspacePath, debug);
		this.instancePath = instancePath;
	}

	protected void registerUserMetamodels() throws IOException {
		String srcMetaModel = "";
		String trgMetaModel = "";
		EPackage srcPackage = null;
		EPackage trgPackage = null;
		switch (projectPath) {
			case Constants.blockCodeAdapter:
				srcMetaModel = "MocaTree";
				trgMetaModel = "BlockLanguage";
				srcPackage = MocaTreePackageImpl.init();
				trgPackage = BlockLanguagePackageImpl.init();
				break;
			case Constants.blockDiagramCodeAdapter:
				srcMetaModel = "BlockDiagram";
				trgMetaModel = "MocaTree";
				srcPackage = BlockDiagramPackageImpl.init();
				trgPackage = MocaTreePackageImpl.init();
				break;
			case Constants.classInhHier2DB:
				srcMetaModel = "ClassInheritanceHierarchy";
				trgMetaModel = "Database";
				srcPackage = ClassInheritanceHierarchyPackageImpl.init();
				trgPackage = DatabasePackageImpl.init();
				break;
			case Constants.companyToIT:
				srcMetaModel = "CompanyLanguage";
				trgMetaModel = "ITLanguage";
				srcPackage = CompanyLanguagePackageImpl.init();
				trgPackage = ITLanguagePackageImpl.init();
				break;
			case Constants.familiesToPersons_V0:
			case Constants.familiesToPersons_V1:
				srcMetaModel = "SimpleFamilies";
				trgMetaModel = "SimplePersons";
				srcPackage = SimpleFamiliesPackageImpl.init();
				trgPackage = SimplePersonsPackageImpl.init();
				break;
			case Constants.processCodeAdapter:
				srcMetaModel = "MocaTree";
				trgMetaModel = "ProcessDefinition";
				srcPackage = MocaTreePackageImpl.init();
				trgPackage = ProcessDefinitionPackageImpl.init();
				break;
			case Constants.vhdlTGGCodeAdapter:
				srcMetaModel = "MocaTree";
				trgMetaModel = "VHDLModel";
				srcPackage = MocaTreePackageImpl.init();
				trgPackage = VHDLModelPackageImpl.init();
				break;
			default:
				throw new IllegalArgumentException("ProjectName parameter does not specify a supported TGG. "
						+ "New TGGs have to be manually added to the MODELGEN_App class of this testsuite.");
		};
		
		rs.getURIConverter().getURIMap().put(URI.createURI("platform:/plugin/"+srcMetaModel+"/"), URI.createURI("platform:/resource/"+srcMetaModel+"/"));
		rs.getURIConverter().getURIMap().put(URI.createURI("platform:/plugin/"+trgMetaModel+"/"), URI.createURI("platform:/resource/"+trgMetaModel+"/"));
		rs.getPackageRegistry().put("platform:/resource/"+srcMetaModel+"/model/"+srcMetaModel+".ecore", srcPackage);
		rs.getPackageRegistry().put("platform:/resource/"+trgMetaModel+"/model/"+trgMetaModel+".ecore", trgPackage);
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	@Override
	public void loadModels() throws IOException {
		s = createResource(instancePath + "/src.xmi");
		t = createResource(instancePath + "/trg.xmi");
		c = createResource(instancePath + "/corr.xmi");
		p = createResource(instancePath + "/protocol.xmi");
		
		EcoreUtil.resolveAll(rs);
	}
	
	@Override
	protected boolean protocol() {
		return true;
	}

}

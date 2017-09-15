package testsuite1.testUtil.performance;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.strategies.cc.CC;

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

public class CC_App extends CC {
	private String modelPath;

	public CC_App(String projectName, String workspacePath, boolean flatten, boolean debug,
			String modelPath) throws IOException {
		super(projectName, workspacePath, flatten, debug);
		this.modelPath = modelPath;
	}

	@Override
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
		
		rs.getPackageRegistry().put("platform:/resource/"+srcMetaModel+"/model/"+srcMetaModel+".ecore", srcPackage);
		rs.getPackageRegistry().put("platform:/resource/"+trgMetaModel+"/model/"+trgMetaModel+".ecore", trgPackage);
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	@Override
	public void loadModels() throws IOException {
		s = loadResource(projectPath + "/instances/"+modelPath+"/src.xmi");
		t = loadResource(projectPath + "/instances/"+modelPath+"/trg.xmi");
		c = createResource(projectPath + "/instances/"+modelPath+"/corr.xmi");
		p = createResource(projectPath + "/instances/"+modelPath+"/protocol.xmi");
	
		EcoreUtil.resolveAll(rs);
	}
}

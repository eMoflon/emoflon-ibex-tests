package testsuite1.testUtil;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

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

public class SYNC_App extends SYNC {
	private String instancePath;
	private boolean isFwd;
	private boolean isIncr;

	public SYNC_App(String projectName, String workspacePath, boolean flatten, boolean debug, String instancePath, boolean isFwd, boolean isIncr) throws IOException {
		super(projectName, workspacePath, flatten, debug);
		this.instancePath = instancePath;
		this.isFwd = isFwd;
		this.isIncr = isIncr;
		registerPatternMatchingEngine(new DemoclesEngine());
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
		if (isIncr) {
			s = loadResource(instancePath + "/src.xmi");
			t = loadResource(instancePath + "/trg.xmi");
			c = loadResource(instancePath + "/corr.xmi");
			p = loadResource(instancePath + "/protocol.xmi");
		} else {
			if (isFwd) {
				s = loadResource(instancePath + "/src.xmi");
				t = createResource(instancePath + "/trg.xmi");
			} else {
				s = createResource(instancePath + "/src.xmi");
				t = loadResource(instancePath + "/trg.xmi");
			}
			c = createResource(instancePath + "/corr.xmi");
			p = createResource(instancePath + "/protocol.xmi");
		}
		
		EcoreUtil.resolveAll(rs);
	}

}

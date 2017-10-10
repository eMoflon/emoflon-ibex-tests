package testsuite1.performance.util;

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

	@Override
	protected void registerUserMetamodels() throws IOException {
		new PerformanceTestUtil().registerUserMetamodels(projectPath, rs);
		
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

package testsuite.ibex.performance.util;

import java.util.function.Consumer;

import org.benchmarx.blockDiagram.core.BlockDiagramHelper;
import org.benchmarx.blockLanguage.core.BlockLanguageHelper;
import org.benchmarx.classInheritanceHierarchy.core.ClassInheritanceHierarchyHelper;
import org.benchmarx.companyLanguage.core.CompanyLanguageHelper;
import org.benchmarx.database.core.DatabaseHelper;
import org.benchmarx.simplefamilies.core.SimpleFamiliesHelper;
import org.benchmarx.itLanguage.core.ITLanguageHelper;
import org.benchmarx.mocaTree.core.MocaTreeHelperForBlockCode;
import org.benchmarx.mocaTree.core.MocaTreeHelperForBlockDiagramCode;
import org.benchmarx.mocaTree.core.MocaTreeHelperForProcessCode;
import org.benchmarx.mocaTree.core.MocaTreeHelperForVHDLTGGCode;
import org.benchmarx.simplepersons.core.SimplePersonsHelper;
import org.benchmarx.processDefinition.core.ProcessDefinitionHelper;
import org.benchmarx.vhdlModel.core.VHDLModelHelper;
import org.eclipse.emf.ecore.EObject;

import BlockDiagram.BlockSystem;
import BlockLanguage.Specification;
import ClassInheritanceHierarchy.ClassPackage;
import CompanyLanguage.Company;
import Database.DB;
import ITLanguage.IT;
import MocaTree.File;
import MocaTree.Folder;
import ProcessDefinition.SystemModule;
import SimpleFamilies.FamilyRegister;
import SimplePersons.PersonRegister;
import VHDLModel.VHDLSpecification;

public class IncrementalEditor {
	private BlockLanguageHelper blocks = new BlockLanguageHelper();
	private MocaTreeHelperForBlockCode mocaBlocks = new MocaTreeHelperForBlockCode();
	
	private BlockDiagramHelper blockDiagrams = new BlockDiagramHelper();
	private MocaTreeHelperForBlockDiagramCode mocaBlockDiagrams = new MocaTreeHelperForBlockDiagramCode();
	
	private ClassInheritanceHierarchyHelper classInhHier = new ClassInheritanceHierarchyHelper();
	private DatabaseHelper databases = new DatabaseHelper();
	
	private CompanyLanguageHelper companies = new CompanyLanguageHelper();
	private ITLanguageHelper itHelper = new ITLanguageHelper();
	
	private SimpleFamiliesHelper families = new SimpleFamiliesHelper();
	private SimplePersonsHelper persons = new SimplePersonsHelper();

	private ProcessDefinitionHelper processes = new ProcessDefinitionHelper();
	private MocaTreeHelperForProcessCode mocaProcesses = new MocaTreeHelperForProcessCode();

	private VHDLModelHelper vhdlModels = new VHDLModelHelper();
	private MocaTreeHelperForVHDLTGGCode mocaVHDL = new MocaTreeHelperForVHDLTGGCode();
	
	public Consumer<EObject> getEdit(String tggName, boolean isFwd) {
		switch (tggName) {
			case "BlockCodeAdapter":
				if (isFwd)
					return this::mocaBlockAddNode;
				else
					return this::blockCodeAddBlock;
			case "BlockDiagramCodeAdapter":
				if (isFwd)
					return this::blockDiagramAddBlock;
				else
					return this::mocaBlockDiagramAddNode;
			case "ClassInhHier2DB":
				if (isFwd)
					return this::classInhHierAddClass;
				else
					return this::dbAddTable;
			case "CompanyToIT":
				if (isFwd)
					return this::companyAddEmployee;
				else
					return this::itAddLaptop;
			case "FamiliesToPersons_V0":
			case "FamiliesToPersons_V1":
				if (isFwd)
					return this::familiesAddDaughter;
				else
					return this::personsAddDaughter;
			case "ProcessCodeAdapter":
				if (isFwd)
					return this::mocaProcessAddNode;
				else
					return this::processCodeAddBlock;
			case "VHDLTGGCodeAdapter":
				if (isFwd)
					return this::mocaVHDLAddEntityNode;
				else
					return this::vhdlAddCompositeBlock;
			default:
				return (e) -> {};
		}
	}
	
	public void mocaBlockAddNode(EObject file) {
		mocaBlocks.createBlockNode((File)file, "newBlockNode");
	}
	
	public void blockCodeAddBlock(EObject specification) {
		blocks.createBlock((Specification)specification, "newBlock");
	}
	
	public void blockDiagramAddBlock(EObject blockSystem) {
		blockDiagrams.createBlock((BlockSystem)blockSystem, "newBlock");
	}
	
	public void mocaBlockDiagramAddNode(EObject file) {
		mocaBlockDiagrams.createBlockNode((File)file, "newBlockNode");
	}
	
	public void classInhHierAddClass(EObject classPackage) {
		classInhHier.createClass((ClassPackage)classPackage, "newClass");
	}

	public void dbAddTable(EObject db) {
		databases.createTable((DB)db, "newTable");
	}
	
	public void companyAddEmployee(EObject company) {
		companies.createEmployeeForFirstCEO((Company)company, "newEmployee");
	}

	public void itAddLaptop(EObject it) {
		itHelper.createLaptopOnFirstNetwork((IT)it, "newLaptop");
	}
	
	public void familiesAddDaughter(EObject familyRegister) {
		families.createDaughterInSingleTestFamily((FamilyRegister)familyRegister, "newDaughter");
	}
	
	public void personsAddDaughter(EObject personRegister) {
		persons.createFemale((PersonRegister)personRegister, "newDaughter");
	}
	
	public void mocaProcessAddNode(EObject folder) {
		mocaProcesses.createSubFolder((Folder)folder, "newBlockNode", 118999);
	}
	
	public void processCodeAddBlock(EObject systemModule) {
		processes.createSubModule((SystemModule)systemModule, "newSubModule");
	}
	
	public void mocaVHDLAddEntityNode(EObject file) {
		mocaVHDL.createGateAndEntityNodes((File)file);
		mocaVHDL.createEntityNode((File)file, "newCompositeBlock");
		mocaVHDL.createGateNode((File)file, "newCompositeBlock");
	}
	
	public void vhdlAddCompositeBlock(EObject specification) {
		vhdlModels.createTopLevelBlock((VHDLSpecification)specification, "newCompositeBlock");
	}
}

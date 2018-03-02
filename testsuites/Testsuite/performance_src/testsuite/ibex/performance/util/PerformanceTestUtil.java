package testsuite.ibex.performance.util;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.operational.strategies.sync.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.sync.FWD_OPT;

import BlockDiagram.impl.BlockDiagramPackageImpl;
import BlockLanguage.impl.BlockLanguagePackageImpl;
import ClassInheritanceHierarchy.impl.ClassInheritanceHierarchyPackageImpl;
import CompanyLanguage.impl.CompanyLanguagePackageImpl;
import Database.impl.DatabasePackageImpl;
import Families.impl.FamiliesPackageImpl;
import FeatureModelConcise.impl.FeatureModelConcisePackageImpl;
import FeatureModelSafe.impl.FeatureModelSafePackageImpl;
import ITLanguage.impl.ITLanguagePackageImpl;
import MocaTree.impl.MocaTreePackageImpl;
import Persons.impl.PersonsPackageImpl;
import ProcessDefinition.impl.ProcessDefinitionPackageImpl;
import SimpleFamilies.impl.SimpleFamiliesPackageImpl;
import SimplePersons.impl.SimplePersonsPackageImpl;
import VHDLModel.impl.VHDLModelPackageImpl;
import classMultipleInheritanceHierarchy.impl.ClassMultipleInheritanceHierarchyPackageImpl;
import language.TGG;
import language.TGGRule;
import language.TGGRuleEdge;
import testsuite.ibex.performance.util.Operationalization;
import testsuite.ibex.testUtil.Constants;

public class PerformanceTestUtil {
	
	public class RegistrationData {
		private String srcMetaModel;
		String trgMetaModel;
		EPackage srcPackage;
		EPackage trgPackage;
		
		public RegistrationData(String srcMetaModel, String trgMetaModel, EPackage srcPackage, EPackage trgPackage) {
			this.srcMetaModel = srcMetaModel;
			this.trgMetaModel = trgMetaModel;
			this.srcPackage = srcPackage;
			this.trgPackage = trgPackage;
		}
	}
	
	/**
	 * Returns a data object for registering a meta model. For each new TGG,
	 * the meta models that need to be registered need to be added here.
	 */
	public RegistrationData getRegistrationData(String projectPath) {
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
		case Constants.classInhHier2DB_MA:
			srcMetaModel = "ClassInheritanceHierarchy";
			trgMetaModel = "Database";
			srcPackage = ClassInheritanceHierarchyPackageImpl.init();
			trgPackage = DatabasePackageImpl.init();
			break;
		case Constants.classMultipleInhHier2DB_MA:
			srcMetaModel = "ClassMultipleInheritanceHierarchy";
			trgMetaModel = "Database";
			srcPackage = ClassMultipleInheritanceHierarchyPackageImpl.init();
			trgPackage = DatabasePackageImpl.init();
			break;	
		case Constants.companyToIT:
			srcMetaModel = "CompanyLanguage";
			trgMetaModel = "ITLanguage";
			srcPackage = CompanyLanguagePackageImpl.init();
			trgPackage = ITLanguagePackageImpl.init();
			break;
		case Constants.familiesToPersons_MA:
			srcMetaModel = "Families";
			trgMetaModel = "Persons";
			srcPackage = FamiliesPackageImpl.init();
			trgPackage = PersonsPackageImpl.init();
			break;
		case Constants.familiesToPersons_V0:
		case Constants.familiesToPersons_V1:
			srcMetaModel = "SimpleFamilies";
			trgMetaModel = "SimplePersons";
			srcPackage = SimpleFamiliesPackageImpl.init();
			trgPackage = SimplePersonsPackageImpl.init();
			break;
		case Constants.featureModelConciseToSafe:
			srcMetaModel = "FeatureModelConcise";
			trgMetaModel = "FeatureModelSafe";
			srcPackage = FeatureModelConcisePackageImpl.init();
			trgPackage = FeatureModelSafePackageImpl.init();
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
					+ "New TGGs have to be manually added to the PerformanceTestUtil class.");
		}
		
		return new RegistrationData(srcMetaModel, trgMetaModel, srcPackage, trgPackage);
	}
	
	/** 
	 * Registers the meta models of the used TGG for CC, CO, SYNC and MODELGEN. 
	 *  */
	public void registerUserMetamodels(String projectPath, ResourceSet rs) throws IOException {
		
		RegistrationData data = getRegistrationData(projectPath);
		
		rs.getURIConverter().getURIMap().put(URI.createURI("platform:/plugin/"+data.srcMetaModel+"/"), URI.createURI("platform:/resource/"+data.srcMetaModel+"/"));
		rs.getURIConverter().getURIMap().put(URI.createURI("platform:/plugin/"+data.trgMetaModel+"/"), URI.createURI("platform:/resource/"+data.trgMetaModel+"/"));
		rs.getPackageRegistry().put("platform:/resource/"+data.srcMetaModel+"/model/"+data.srcMetaModel+".ecore", data.srcPackage);
		rs.getPackageRegistry().put("platform:/resource/"+data.trgMetaModel+"/model/"+data.trgMetaModel+".ecore", data.trgPackage);
	}
	
	/** 
	 * Registers the meta models of the used TGG for FWD_OPT. 
	 *  */
	public void registerUserMetamodelsFWD_OPT(String projectPath, ResourceSet rs, FWD_OPT op) throws IOException {
		
		RegistrationData data = getRegistrationData(projectPath);
		
		rs.getPackageRegistry().put("platform:/resource/"+data.srcMetaModel+"/model/"+data.srcMetaModel+".ecore", data.srcPackage);
		
		// Load and register source and target metamodels
		Resource res = op.loadResource("platform:/resource/../metamodels/"+data.trgMetaModel+"/model/"+data.trgMetaModel+".ecore");
		EPackage pack = (EPackage) res.getContents().get(0);
		rs.getPackageRegistry().put("platform:/resource/" +data.trgMetaModel+ "/model/" +data.trgMetaModel+ ".ecore", pack);
		rs.getPackageRegistry().put("platform:/plugin/" +data.trgMetaModel+ "/model/" +data.trgMetaModel+ ".ecore", pack);
	}
	
	/** 
	 * Registers the meta models of the used TGG for BWD_OPT. 
	 *  */
	public void registerUserMetamodelsBWD_OPT(String projectPath, ResourceSet rs, BWD_OPT op) throws IOException {
		
		RegistrationData data = getRegistrationData(projectPath);
		
		rs.getPackageRegistry().put("platform:/resource/" +data.trgMetaModel+ "/model/" +data.trgMetaModel+ ".ecore", data.trgPackage);
		
		// Load and register source and target metamodels
		Resource res = op.loadResource("platform:/resource/../metamodels/"+data.srcMetaModel+"/model/"+data.srcMetaModel+".ecore");
		EPackage pack = (EPackage) res.getContents().get(0);
		rs.getPackageRegistry().put("platform:/resource/"+data.srcMetaModel+"/model/"+ data.srcMetaModel +".ecore", pack);
		rs.getPackageRegistry().put("platform:/plugin/"+ data.srcMetaModel +"/model/"+ data.srcMetaModel +".ecore", pack);
	}

	/**
	 * Returns those TestDataPoints from the testData which fit to the
	 * specified parameters tgg, op and modelSize. When null is
	 * passed for any parameter, then that parameter is not used for filtering.
	 */
	public List<TestDataPoint> filterTestResults(List<TestDataPoint> testData, String tgg, Operationalization op, Integer modelSize) {
		if (testData == null)
			return null;
		return testData.stream()
				  	   .filter(t -> t != null)
					   .filter(t -> tgg==null || t.testCase.tgg().equals(tgg))
					   .filter(t -> op==null || t.testCase.operationalization() == op)
					   .filter(t -> modelSize==null || t.testCase.modelSize() == modelSize)
					   .collect(Collectors.toList());
	}
		
	/**
	 * Creates a MODELGENStopCriterion for a given TGG which ensures that only one
	 * axiom is applied. Needs to be extended for every new test project, or more
	 * specifically for every new axiom.
	 */
	public Function<TGG, MODELGENStopCriterion> createStopCriterion(String tggName, int size) {
		return (TGG tgg) -> {
			MODELGENStopCriterion stop = new MODELGENStopCriterion(tgg);
			stop.setMaxElementCount(size);
			
			switch (tgg.getName()) {
				case Constants.blockCodeAdapter:
					stop.setMaxRuleCount("File2SpecRule", 1);
					break;
				case Constants.blockDiagramCodeAdapter:
					stop.setMaxRuleCount("SystemToNodeRule", 1);
					break;
				case Constants.classInhHier2DB:
					stop.setMaxRuleCount("PackageToDatabaseRule", 1);
					break;
				case Constants.classInhHier2DB_MA:
					stop.setMaxRuleCount("PackageToDatabaseRule", 1);
					break;
				case Constants.classMultipleInhHier2DB_MA:
					stop.setMaxRuleCount("PackageToDatabase", 1);
					break;	
				case Constants.companyToIT:
					stop.setMaxRuleCount("CompanyToITRule", 1);
					break;
				case Constants.familiesToPersons_MA:
					stop.setMaxRuleCount("FamiliesToPersons", 1);
					break;
				case Constants.familiesToPersons_V0:
					stop.setMaxRuleCount("HandleRegisters", 1);
					stop.setMaxRuleCount("HandleFamilyReg", 0);
					stop.setMaxRuleCount("HandleRegistersLoose", 0);
					stop.setMaxRuleCount("IgnoreFamilyLoose", 0);
					stop.setMaxRuleCount("CreateFather", 0);
					stop.setMaxRuleCount("FatherAndMale", 0);
					stop.setMaxRuleCount("FatherToNothing", 0);
					stop.setMaxRuleCount("ReplaceFatherWithSon", 0);
					break;
				case Constants.familiesToPersons_V1:
					stop.setMaxRuleCount("HandleRegisters", 1);
					break;
				case Constants.featureModelConciseToSafe:
					stop.setMaxRuleCount("RootAxiomRule", 1);
					break;
				case Constants.processCodeAdapter:
					stop.setMaxRuleCount("RootToSystemRule", 1);
					break;
				case Constants.vhdlTGGCodeAdapter:
					stop.setMaxRuleCount("File2VHDLSpec", 1);
					break;
				default:
					throw new IllegalArgumentException("The MODELGENStopCriterion has not been defined yet for the TGG "+tgg.getName());
			}
			return stop;
		};
	}

	/**
	 * Calculates the average number of elements per rule in a TGG
	 */
	public double getAverageRuleSize(TGG flattenedTGG) {
		double numberOfRules = flattenedTGG.getRules().size();
		
		return flattenedTGG.getRules().stream()
				  .map(this::getRuleSize)
			 	  .reduce((size1, size2) -> size1 + size2)
			 	  .get()/numberOfRules;
	}

	/**
	 * Calculates the max number of elements of a rule in a TGG
	 */
	public double getMaxRuleSize(TGG flattenedTGG) {
		return flattenedTGG.getRules().stream()
				  .map(this::getRuleSize)
			 	  .reduce((size1, size2) -> Math.max(size1, size2))
			 	  .get();
	}

	/**
	 * Calculates the number of elements in a rule
	 */
	private int getRuleSize(TGGRule rule) {
		int size = rule.getNodes().size();
		HashSet<TGGRuleEdge> checkedEdges = new HashSet<>();
		
		for (TGGRuleEdge e1 : rule.getEdges()) {
			if (e1.getType().getEOpposite() == null
					|| !checkedEdges.stream().anyMatch(e2 -> oppositeEdges(e1, e2))) {
				checkedEdges.add(e1);
				size++;
			}
		}
		
		return size;
	}
	
	/**
	 * Checks whether two edges are EOpposites of each other.
	 */
	private boolean oppositeEdges(TGGRuleEdge e1, TGGRuleEdge e2) {
		return e1.getType().getEOpposite().equals(e2.getType())
				&& e1.getSrcNode().equals(e2.getTrgNode())
				&& e1.getTrgNode().equals(e2.getSrcNode());
	}
}

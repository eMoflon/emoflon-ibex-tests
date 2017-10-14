package testsuite1.performance.util;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;

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
import language.TGG;
import language.TGGRule;
import language.TGGRuleEdge;
import testsuite1.testUtil.Constants;
import testsuite1.testUtil.Operationalization;

public class PerformanceTestUtil {
	
	/** 
	 * Registers the meta models of the used TGG. For each new TGG,
	 * the meta models that need to be registered need to be added here.
	 *  */
	protected void registerUserMetamodels(String projectPath, ResourceSet rs) throws IOException {
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
						+ "New TGGs have to be manually added to the PerformanceTestUtil class.");
		};
		
		rs.getURIConverter().getURIMap().put(URI.createURI("platform:/plugin/"+srcMetaModel+"/"), URI.createURI("platform:/resource/"+srcMetaModel+"/"));
		rs.getURIConverter().getURIMap().put(URI.createURI("platform:/plugin/"+trgMetaModel+"/"), URI.createURI("platform:/resource/"+trgMetaModel+"/"));
		rs.getPackageRegistry().put("platform:/resource/"+srcMetaModel+"/model/"+srcMetaModel+".ecore", srcPackage);
		rs.getPackageRegistry().put("platform:/resource/"+trgMetaModel+"/model/"+trgMetaModel+".ecore", trgPackage);
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
				case "BlockCodeAdapter":
					stop.setMaxRuleCount("File2SpecRule", 1);
					break;
				case "BlockDiagramCodeAdapter":
					stop.setMaxRuleCount("SystemToNodeRule", 1);
					break;
				case "ClassInhHier2DB":
					stop.setMaxRuleCount("PackageToDatabaseRule", 1);
					break;
				case "CompanyToIT":
					stop.setMaxRuleCount("CompanyToITRule", 1);
					break;
				case "FamiliesToPersons_V0":
					stop.setMaxRuleCount("HandleRegisters", 1);
					stop.setMaxRuleCount("HandleFamilyReg", 0);
					stop.setMaxRuleCount("HandleRegistersLoose", 0);
					stop.setMaxRuleCount("IgnoreFamilyLoose", 0);
					stop.setMaxRuleCount("CreateFather", 0);
					stop.setMaxRuleCount("FatherAndMale", 0);
					stop.setMaxRuleCount("FatherToNothing", 0);
					stop.setMaxRuleCount("ReplaceFatherWithSon", 0);
					break;
				case "FamiliesToPersons_V1":
					stop.setMaxRuleCount("HandleRegisters", 1);
					break;
				case "ProcessCodeAdapter":
					stop.setMaxRuleCount("RootToSystemRule", 1);
					break;
				case "VHDLTGGCodeAdapter":
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

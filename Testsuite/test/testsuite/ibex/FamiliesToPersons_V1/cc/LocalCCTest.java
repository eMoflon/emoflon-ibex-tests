package testsuite.ibex.FamiliesToPersons_V1.cc;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.familiestopersons_v1.LocalCC_App;
import org.emoflon.ibex.tgg.run.familiestopersons_v1.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.familiestopersons_v1.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.run.familiestopersons_v1.config.ViatraRegistrationHelper;
import org.junit.Assert;
import org.junit.Test;

import SimpleFamilies.Family;
import SimpleFamilies.FamilyMember;
import SimpleFamilies.FamilyRegister;
import SimpleFamilies.SimpleFamiliesFactory;
import SimplePersons.Female;
import SimplePersons.Male;
import SimplePersons.PersonRegister;
import SimplePersons.SimplePersonsFactory;
import testsuite.ibex.testUtil.CCTestCase;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class LocalCCTest extends CCTestCase {

	public void createGenerator(String srcInstance, String trgInstance, String corrInstance, String protocolInstance) throws IOException {
		LocalCC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper(), new HiPERegistrationHelper(), new ViatraRegistrationHelper()});
		checker = new LocalCC_App("FamiliesToPersons_V1", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, corrInstance, protocolInstance, ilpSolver);
	}
	
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		LocalCC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper(), new HiPERegistrationHelper(), new ViatraRegistrationHelper()});
		checker = new LocalCC_App("FamiliesToPersons_V1", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, ilpSolver);
	}

	@Test
	public void testCreateSingleRegisters_CC() throws IOException {
		createGenerator("singleFamilyReg", "singlePersonReg");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testCreateOneFather_CC() throws IOException {
		createGenerator("singleFamilyWithFather", "PersonRegisterWithMalePerson");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testCreateOneFather_LocalCC() throws IOException {
		createGenerator("singleFamilyReg", "singlePersonReg", "singleRegCorr", "singleRegProtocol");
		
		Resource source = checker.getResourceHandler().getSourceResource();
		FamilyRegister famReg = (FamilyRegister) source.getContents().get(0);
		Family newFam = SimpleFamiliesFactory.eINSTANCE.createFamily();
		newFam.setName("Test");
		famReg.getFamilies().add(newFam);
		FamilyMember newFather = SimpleFamiliesFactory.eINSTANCE.createFamilyMember();
		newFather.setName("father");
		newFam.setFather(newFather);
		
		Resource target = checker.getResourceHandler().getTargetResource();
		PersonRegister perReg = (PersonRegister) target.getContents().get(0);
		Male newPerson = SimplePersonsFactory.eINSTANCE.createMale();
		newPerson.setName("father");
		perReg.getPersons().add(newPerson);
		
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testCreateFamily_LocalCC() throws IOException {
		createGenerator("singleFamilyReg", "singlePersonReg", "singleRegCorr", "singleRegProtocol");
		
		Resource source = checker.getResourceHandler().getSourceResource();
		FamilyRegister famReg = (FamilyRegister) source.getContents().get(0);
		Family newFam = SimpleFamiliesFactory.eINSTANCE.createFamily();
		newFam.setName("Test");
		famReg.getFamilies().add(newFam);
		FamilyMember newFather = SimpleFamiliesFactory.eINSTANCE.createFamilyMember();
		FamilyMember daughter1 = SimpleFamiliesFactory.eINSTANCE.createFamilyMember();
		FamilyMember daughter2 = SimpleFamiliesFactory.eINSTANCE.createFamilyMember();
		newFather.setName("father");
		daughter1.setName("daughter1");
		daughter2.setName("daughter2");
		newFam.setFather(newFather);
		newFam.getDaughters().add(daughter1);
		newFam.getDaughters().add(daughter2);

		Resource target = checker.getResourceHandler().getTargetResource();
		PersonRegister perReg = (PersonRegister) target.getContents().get(0);
		Male newMale = SimplePersonsFactory.eINSTANCE.createMale();
		Female newFemale2 = SimplePersonsFactory.eINSTANCE.createFemale();
		Female newFemale3 = SimplePersonsFactory.eINSTANCE.createFemale();
		newMale.setName("father");
		newFemale2.setName("daughter1");
		newFemale3.setName("daughter2");
		perReg.getPersons().add(newMale);
		perReg.getPersons().add(newFemale2);	
		perReg.getPersons().add(newFemale3);
		
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testAddDaughter_LocalCC() throws IOException {
		createGenerator("singleFamilyWithFather", "PersonRegisterWithMalePerson", "singlePersonCorr", "singlePersonProtocol");
		
		Resource source = checker.getResourceHandler().getSourceResource();
		FamilyRegister famReg = (FamilyRegister) source.getContents().get(0);
		Family newFam = famReg.getFamilies().get(0);
		FamilyMember daughter1 = SimpleFamiliesFactory.eINSTANCE.createFamilyMember();
		FamilyMember daughter2 = SimpleFamiliesFactory.eINSTANCE.createFamilyMember();
		daughter1.setName("daughter1");
		daughter2.setName("daughter2");
		newFam.getDaughters().add(daughter1);
		newFam.getDaughters().add(daughter2);

		Resource target = checker.getResourceHandler().getTargetResource();
		PersonRegister perReg = (PersonRegister) target.getContents().get(0);
		Female newFemale2 = SimplePersonsFactory.eINSTANCE.createFemale();
		Female newFemale3 = SimplePersonsFactory.eINSTANCE.createFemale();
		newFemale2.setName("daughter1");
		newFemale3.setName("daughter2");
		perReg.getPersons().add(newFemale2);	
		perReg.getPersons().add(newFemale3);
		
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
}

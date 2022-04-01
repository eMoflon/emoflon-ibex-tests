package testsuite.ibex.FeatureModelConciseToSafe.sync;

import org.junit.jupiter.api.Test;

import FeatureModelConcise.FeatureModelConciseFactory;
import FeatureModelConcise.Model;
import FeatureModelConcise.XorGroup;
import FeatureModelSafe.FeatureModelSafeFactory;
import testsuite.ibex.testUtil.SyncTestCase;

public class SingleGroups extends SyncTestCase<Model, FeatureModelSafe.Model>{
	
	public SingleGroups() {
		super(new IbexFeatureModelConciseToSafe(projectName));
	}

	private static final String projectName = "FeatureModelConciseToSafe";

	@Override
	protected void initHelpers() {
		
	}

	@Override
	protected String getProjectName() {
		return projectName;
	}
	
	@Test
	public void testInit()
	{
		//------------
		assertPostcondition("initConcise", "initSafe");
	}
	
	@Test
	public void testFwd()
	{
		assertPrecondition("initConcise", "initSafe");
		//------------
		tool.performAndPropagateSourceEdit(m -> {
			FeatureModelConcise.Feature car = m.getRoot();
			
			FeatureModelConcise.Feature automatic = FeatureModelConciseFactory.eINSTANCE.createFeature();
			automatic.setName("Automatic");
			
			FeatureModelConcise.Feature manual = FeatureModelConciseFactory.eINSTANCE.createFeature();
			manual.setName("Manual");
			
			FeatureModelConcise.Feature citystop = FeatureModelConciseFactory.eINSTANCE.createFeature();
			citystop.setName("CityStop");
			
			car.getSubfeatures().add(automatic);
			car.getSubfeatures().add(manual);
			car.getSubfeatures().add(citystop);
			
			XorGroup group = FeatureModelConciseFactory.eINSTANCE.createXorGroup();
			car.getGroups().add(group);
			
			group.getMembers().add(automatic);
			group.getMembers().add(manual);
		});
		//--------------
		assertPostcondition("XORGroup3FeaturesConcise", "XORGroup3FeaturesSafe");
	}
	
	@Test
	public void testBwd(){
		assertPrecondition("initConcise", "initSafe");
		//------------
		tool.performAndPropagateTargetEdit(m -> {
			FeatureModelSafe.Feature car = m.getRoot();
			
			FeatureModelSafe.Feature automatic = FeatureModelSafeFactory.eINSTANCE.createFeature();
			automatic.setName("Automatic");
			
			FeatureModelSafe.Feature manual = FeatureModelSafeFactory.eINSTANCE.createFeature();
			manual.setName("Manual");
			
			FeatureModelSafe.Feature citystop = FeatureModelSafeFactory.eINSTANCE.createFeature();
			citystop.setName("CityStop");
			
			car.getSolitarySubFeatures().add(citystop);
			
			FeatureModelSafe.XorGroup group = FeatureModelSafeFactory.eINSTANCE.createXorGroup();
			car.getGroups().add(group);
			
			group.getMembers().add(automatic);
			group.getMembers().add(manual);
		});
		//--------------
		assertPostcondition("XORGroup3FeaturesConcise", "XORGroup3FeaturesSafe");
	}
}

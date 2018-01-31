package testsuite.ibex.Class2TestClass_MA.sync.util;

import java.io.IOException;

import org.benchmarx.classInheritanceHierarchy.core.ClassInheritanceHierarchyComparator;
import org.benchmarx.database.core.DatabaseComparator;
import org.emoflon.ibex.tgg.run.class2testclass_ma.SYNC_App;

import ClassInheritanceHierarchy.ClassInheritanceHierarchyFactory;
import ClassInheritanceHierarchy.ClassPackage;
import Database.DB;
import testsuite.ibex.testUtil.IbexAdapter;

public class IbexC2TC_MA extends IbexAdapter<ClassPackage, DB> {

	public IbexC2TC_MA(String projectName) {
		super(new ClassInheritanceHierarchyComparator(false), new DatabaseComparator(false), projectName);
		
	}

	@Override
	public void initiateSynchronisationDialogue() {
		try {
			synchroniser = new SYNC_App("Class2TestClass_MA", testsuite.ibex.testUtil.Constants.workspacePath, false);
				
			ClassPackage pkg = ClassInheritanceHierarchyFactory.eINSTANCE.createClassPackage();
			pkg.setName("p");
				
			synchroniser.getSourceResource().getContents().add(pkg);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

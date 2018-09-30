package testsuite.ibex.ClassInhHier2DB.sync.util;

import java.io.IOException;

import org.benchmarx.classInheritanceHierarchy.core.ClassInheritanceHierarchyComparator;
import org.benchmarx.database.core.DatabaseComparator;
import org.emoflon.ibex.tgg.run.classinhhier2db.SYNC_App;

import ClassInheritanceHierarchy.ClassInheritanceHierarchyFactory;
import ClassInheritanceHierarchy.ClassPackage;
import Database.DB;
import testsuite.ibex.testUtil.IbexAdapter;

public class IbexClassInhHier2DB extends IbexAdapter<ClassPackage, DB>   {
	
	public IbexClassInhHier2DB(String projectName) {
		super(new ClassInheritanceHierarchyComparator(true), new DatabaseComparator(true), projectName);
	}
	
	@Override
	public void initiateSynchronisationDialogue() {
		try {
			synchroniser = new SYNC_App("ClassInhHier2DB", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false);
			
			ClassPackage pkg = ClassInheritanceHierarchyFactory.eINSTANCE.createClassPackage();
			pkg.setName("P");
			
			synchroniser.getSourceResource().getContents().add(pkg);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

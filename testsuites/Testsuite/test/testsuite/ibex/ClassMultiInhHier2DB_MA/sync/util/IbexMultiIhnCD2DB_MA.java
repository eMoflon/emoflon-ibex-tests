package testsuite.ibex.ClassMultiInhHier2DB_MA.sync.util;

import java.io.IOException;

import org.benchmarx.classMultipleInheritanceHierarchy.core.ClassMultipleIhneritanceHierarchyComparator;
import org.benchmarx.database.core.DatabaseComparator;
import org.emoflon.ibex.tgg.run.classmultipleinhhier2db_ma.SYNC_App;

import classMultipleInheritanceHierarchy.ClassMultipleInheritanceHierarchyFactory;
import classMultipleInheritanceHierarchy.ClassPackage;
import Database.DB;
import testsuite.ibex.testUtil.IbexAdapter;

public class IbexMultiIhnCD2DB_MA extends IbexAdapter<ClassPackage, DB> {

	public IbexMultiIhnCD2DB_MA(String projectName) {
		super(new ClassMultipleIhneritanceHierarchyComparator(true), new DatabaseComparator(true), projectName);
		
	}

	@Override
	public void initiateSynchronisationDialogue() {
		try {
			synchroniser = new SYNC_App("ClassMultipleInhHier2DB_MA", testsuite.ibex.testUtil.Constants.workspacePath, false);
				
			ClassPackage pkg = ClassMultipleInheritanceHierarchyFactory.eINSTANCE.createClassPackage();
			pkg.setName("P");
				
			synchroniser.getSourceResource().getContents().add(pkg);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

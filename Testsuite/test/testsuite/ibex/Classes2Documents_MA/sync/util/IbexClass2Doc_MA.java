package testsuite.ibex.Classes2Documents_MA.sync.util;

import java.io.IOException;

import org.benchmarx.classMultipleInheritanceHierarchy.core.ClassMultipleIhneritanceHierarchyComparator;
import org.benchmarx.documents.core.DocumentsComparator;
import org.emoflon.ibex.tgg.run.class2doc_ma.SYNC_App;

import classMultipleInheritanceHierarchy.ClassPackage;
import Documents.Container;
import classMultipleInheritanceHierarchy.ClassMultipleInheritanceHierarchyFactory;
import testsuite.ibex.testUtil.IbexAdapter;

public class IbexClass2Doc_MA extends IbexAdapter<ClassPackage, Container>{

	public IbexClass2Doc_MA(String projectName) {
		super(new ClassMultipleIhneritanceHierarchyComparator(true), new DocumentsComparator(true), projectName);
		
	}

	@Override
	public void initiateSynchronisationDialogue() {
		try {
			synchroniser = new SYNC_App("Class2Doc_MA", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false);
				
			ClassPackage pkg = ClassMultipleInheritanceHierarchyFactory.eINSTANCE.createClassPackage();
			pkg.setName("p");
				
			synchroniser.getSourceResource().getContents().add(pkg);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package testsuite.ibex.Clazz2GlossarDoc.sync.util;

import java.io.IOException;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.clazz2glossardoc.SYNC_App;
import org.emoflon.ibex.tgg.run.clazz2glossardoc.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.clazz2glossardoc.config.HiPERegistrationHelper;
import org.glossarDoc.core.GlossarDocumentationComparator;
import org.simpleClass.core.ClazzInheritanceComparator;

import glossarDocumentation.DocumentationContainer;
import simpleClassInheritance.ClazzContainer;
import simpleClassInheritance.SimpleClassInheritanceFactory;
import testsuite.ibex.testUtil.IbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class IbexClazz2GlossarDocAdapter extends IbexAdapter<ClazzContainer, DocumentationContainer> {

	public IbexClazz2GlossarDocAdapter(String projectName) {
		super(new ClazzInheritanceComparator(true), new GlossarDocumentationComparator(true), projectName);
	}

	@Override
	public void initiateSynchronisationDialogue() {
		try {
			SYNC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[] { //
					new DemoclesRegistrationHelper(), new HiPERegistrationHelper() //
			});
			synchroniser = new SYNC_App(projectName, testsuite.ibex.performance.util.PerformanceConstants.workspacePath, ilpSolver, false);

			ClazzContainer container = SimpleClassInheritanceFactory.eINSTANCE.createClazzContainer();
			synchroniser.getResourceHandler().getSourceResource().getContents().add(container);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

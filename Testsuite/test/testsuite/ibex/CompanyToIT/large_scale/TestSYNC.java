package testsuite.ibex.CompanyToIT.large_scale;

import java.io.IOException;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.companytoit.CO_App;
import org.emoflon.ibex.tgg.run.companytoit.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.companytoit.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.run.companytoit.config.ViatraRegistrationHelper;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import CompanyLanguage.impl.CompanyLanguagePackageImpl;
import ITLanguage.impl.ITLanguagePackageImpl;
import testsuite.ibex.testUtil.CompleteSyncTestCase;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class TestSYNC extends CompleteSyncTestCase {
	private static IRegistrationHelper registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper(), new HiPERegistrationHelper(), new ViatraRegistrationHelper()});

	static String fwdSrcPath;
	static String fwdTrgPath;
	static String fwdCorrPath;
	static String fwdProtPath;

	static String bwdSrcPath;
	static String bwdTrgPath;
	static String bwdCorrPath;
	static String bwdProtPath;

	
	/**
	 * Inner class that has configurable paths for the resources
	 * @author NilsWeidmann
	 *
	 */
	public class FWD_App extends SYNC {
		
		public FWD_App(String projectName, String workspacePath, boolean debug, String srcPath, String trgPath, 
				String corrPath, String protPath) throws IOException {
			super(registrationHelper.createIbexOptions().project.name(projectName).project.workspacePath(workspacePath).debug.ibexDebug(debug));
			
			TestSYNC.fwdSrcPath = srcPath;
			TestSYNC.fwdTrgPath = trgPath;
			TestSYNC.fwdCorrPath = corrPath;
			TestSYNC.fwdProtPath = protPath;
		}
	}
	
	class FWD_TGGResourceHandler extends TGGResourceHandler {
		
		public FWD_TGGResourceHandler() throws IOException {
			super();
		}

		@Override
		public void loadModels() throws IOException {
			source = loadResource(options.project.path() + TestSYNC.fwdSrcPath + ".xmi");
			target = createResource(options.project.path() + TestSYNC.fwdTrgPath + ".xmi");
			corr = createResource(options.project.path() + TestSYNC.fwdCorrPath + ".xmi");
			protocol = createResource(options.project.path() + TestSYNC.fwdProtPath + ".xmi");
		}
		
		@Override
		protected void registerUserMetamodels() throws IOException {
			rs.getPackageRegistry().put("platform:/resource/CompanyLanguage/model/CompanyLanguage.ecore", CompanyLanguagePackageImpl.init());
			rs.getPackageRegistry().put("platform:/resource/ITLanguage/model/ITLanguage.ecore", ITLanguagePackageImpl.init());
			
			// Register correspondence metamodel last
			loadAndRegisterMetamodel(options.project.path() + "/model/" + options.project.path() + ".ecore");
			
			super.registerUserMetamodels();
		}
		
		@Override
		public void saveModels() throws IOException {
			target.save(null);
			corr.save(null);
			protocol.save(null);
		}
	}
	
	/**
	 * Inner class that has configurable paths for the resources
	 * @author NilsWeidmann
	 *
	 */
	public class BWD_App extends SYNC {
		public BWD_App(String projectName, String workspacePath, boolean debug, String srcPath, String trgPath, 
				String corrPath, String protPath) throws IOException {
			super(registrationHelper.createIbexOptions().project.name(projectName).project.workspacePath(workspacePath).debug.ibexDebug(debug));

			TestSYNC.bwdSrcPath = srcPath;
			TestSYNC.bwdTrgPath = trgPath;
			TestSYNC.bwdCorrPath = corrPath;
			TestSYNC.bwdProtPath = protPath;
		}
	}
	
	class BWD_TGGResourceHandler extends TGGResourceHandler {
		
		public BWD_TGGResourceHandler() throws IOException {
			super();
		}

		@Override
		public void loadModels() throws IOException {
			source = createResource(options.project.path() + TestSYNC.bwdSrcPath + ".xmi");
			target = loadResource(options.project.path() + TestSYNC.bwdTrgPath + ".xmi");
			corr = createResource(options.project.path() + TestSYNC.bwdCorrPath + ".xmi");
			protocol = createResource(options.project.path() + TestSYNC.bwdProtPath + ".xmi");
		}
		
		@Override
		protected void registerUserMetamodels() throws IOException {
			rs.getPackageRegistry().put("platform:/resource/CompanyLanguage/model/CompanyLanguage.ecore", CompanyLanguagePackageImpl.init());
			rs.getPackageRegistry().put("platform:/resource/ITLanguage/model/ITLanguage.ecore", ITLanguagePackageImpl.init());
			
			// Register correspondence metamodel last
			loadAndRegisterMetamodel(options.project.path() + "/model/" + options.project.path() + ".ecore");
			
			super.registerUserMetamodels();
		}
		
		@Override
		public void saveModels() throws IOException {
			source.save(null);
			corr.save(null);
			protocol.save(null);
		}
	}
	
	public void createGenerator(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		checker = new CO_App("CompanyToIT", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, ilpSolver);
	}
	
	public void createForward(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		fwd = new FWD_App("CompanyToIT", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance);
	}
	
	public void createBackward(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		bwd = new BWD_App("CompanyToIT", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance);
	}
	
	@Test
	@Ignore
	public void testFWD() throws IOException {
		createForward("/resources/large_scale/src", "/resources/large_scale/trg-tmp", "/resources/large_scale/corr-tmp", "/resources/large_scale/prot-tmp");
		runForward();
		createGenerator("/resources/large_scale/src", "/resources/large_scale/trg-tmp", "/resources/large_scale/corr-tmp", "/resources/large_scale/prot-tmp");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	@Ignore
	public void testBWD() throws IOException {
		createBackward("/resources/large_scale/src-tmp", "/resources/large_scale/trg", "/resources/large_scale/corr-tmp", "/resources/large_scale/prot-tmp");
		runBackward();
		createGenerator("/resources/large_scale/src-tmp", "/resources/large_scale/trg", "/resources/large_scale/corr-tmp", "/resources/large_scale/prot-tmp");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
}

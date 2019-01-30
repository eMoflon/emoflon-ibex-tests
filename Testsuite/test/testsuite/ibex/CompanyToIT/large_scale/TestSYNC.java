package testsuite.ibex.CompanyToIT.large_scale;

import java.io.IOException;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.companytoit.CO_App;
import org.emoflon.ibex.tgg.run.vhdltggcodeadapter._RegistrationHelper;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import CompanyLanguage.impl.CompanyLanguagePackageImpl;
import ITLanguage.impl.ITLanguagePackageImpl;
import testsuite.ibex.testUtil.CompleteSyncTestCase;

public class TestSYNC extends CompleteSyncTestCase {
	
	/**
	 * Inner class that has configurable paths for the resources
	 * @author NilsWeidmann
	 *
	 */
	public class FWD_App extends SYNC {
		private String srcPath;
		private String trgPath;
		private String corrPath;
		private String protPath;
		
		public FWD_App(String projectName, String workspacePath, boolean debug, String srcPath, String trgPath, 
				String corrPath, String protPath) throws IOException {
			super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
			
			this.srcPath = srcPath;
			this.trgPath = trgPath;
			this.corrPath = corrPath;
			this.protPath = protPath;
			
			registerBlackInterpreter(new DemoclesTGGEngine());
		}
		
		@Override
		public void loadModels() throws IOException {
			s = loadResource(options.projectPath() + srcPath + ".xmi");
			t = createResource(options.projectPath() + trgPath + ".xmi");
			c = createResource(options.projectPath() + corrPath + ".xmi");
			p = createResource(options.projectPath() + protPath + ".xmi");
			
			EcoreUtil.resolveAll(rs);
		}
		
		@Override
		public void saveModels() throws IOException {
			t.save(null);
			c.save(null);
			p.save(null);
		}
		
		@Override
		protected void registerUserMetamodels() throws IOException {
			rs.getPackageRegistry().put("platform:/resource/CompanyLanguage/model/CompanyLanguage.ecore", CompanyLanguagePackageImpl.init());
			rs.getPackageRegistry().put("platform:/resource/ITLanguage/model/ITLanguage.ecore", ITLanguagePackageImpl.init());
			
			// Register correspondence metamodel last
			loadAndRegisterMetamodel(options.projectPath() + "/model/" + options.projectPath() + ".ecore");
		}
	}
	
	/**
	 * Inner class that has configurable paths for the resources
	 * @author NilsWeidmann
	 *
	 */
	public class BWD_App extends SYNC {
		private String srcPath;
		private String trgPath;
		private String corrPath;
		private String protPath;
		
		public BWD_App(String projectName, String workspacePath, boolean debug, String srcPath, String trgPath, 
				String corrPath, String protPath) throws IOException {
			super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));

			this.srcPath = srcPath;
			this.trgPath = trgPath;
			this.corrPath = corrPath;
			this.protPath = protPath;
			
			registerBlackInterpreter(new DemoclesTGGEngine());
		}
		
		@Override
		public void loadModels() throws IOException {
			s = createResource(options.projectPath() + srcPath + ".xmi");
			t = loadResource(options.projectPath() + trgPath + ".xmi");
			c = createResource(options.projectPath() + corrPath + ".xmi");
			p = createResource(options.projectPath() + protPath + ".xmi");
			
			EcoreUtil.resolveAll(rs);
		}
		
		@Override
		public void saveModels() throws IOException {
			s.save(null);
			c.save(null);
			p.save(null);
		}
		
		@Override
		protected void registerUserMetamodels() throws IOException {
			rs.getPackageRegistry().put("platform:/resource/CompanyLanguage/model/CompanyLanguage.ecore", CompanyLanguagePackageImpl.init());
			rs.getPackageRegistry().put("platform:/resource/ITLanguage/model/ITLanguage.ecore", ITLanguagePackageImpl.init());
			
			// Register correspondence metamodel last
			loadAndRegisterMetamodel(options.projectPath() + "/model/" + options.projectPath() + ".ecore");
		}
	}
	
	/**
	 * Create options for FWD_App and BWD_App
	 */
	private static IbexOptions createIbexOptions() {
		return _RegistrationHelper.createIbexOptions();
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
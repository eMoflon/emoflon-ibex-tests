package testsuite1.testUtil.performance

import java.nio.file.Files
import java.nio.file.Paths
import java.util.Arrays

class LaunchConfiguration {
	public final static String maxMemorySize = "1024M" //"M" for megabyte, "G" for gigabyte
	public final static String launchConfigPath = "performance/launchConfigs/"
	
	private TestCaseParameters params
	
	public new(TestCaseParameters params) {
		this.params = params
	}
	
	public def getName() {
		return params.toString()
	}
	
	public def save() {
		save(launchConfigPath)
	}
	
	public def save(String path) {
		Files.write(Paths.get(path+getName()+".launch"), Arrays.asList(getContents()))
	}
	
	public def getContents() {
		return '''
		<?xml version="1.0" encoding="UTF-8" standalone="no"?>
		<launchConfiguration type="org.eclipse.jdt.launching.localJavaApplication">
			<listAttribute key="org.eclipse.debug.core.MAPPED_RESOURCE_PATHS">
				<listEntry value="/Testsuite_1/test/testsuite1/performance/TestDataCollector.java"/>
			</listAttribute>
			<listAttribute key="org.eclipse.debug.core.MAPPED_RESOURCE_TYPES">
				<listEntry value="1"/>
			</listAttribute>
			<stringAttribute key="org.eclipse.jdt.launching.MAIN_TYPE" value="testsuite1.performance.TestDataCollector"/>
			<stringAttribute key="org.eclipse.jdt.launching.PROJECT_ATTR" value="Testsuite_1"/>
			<stringAttribute key="org.eclipse.jdt.launching.PROGRAM_ARGUMENTS" value="«params.tgg» «params.operationalization.name()» «params.modelSize»"/>
			<stringAttribute key="org.eclipse.jdt.launching.VM_ARGUMENTS" value="-Xmx«maxMemorySize»"/>
		</launchConfiguration>
		
		'''
	}
}
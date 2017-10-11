package testsuite1.performance

import java.nio.file.Files
import java.nio.file.Paths
import java.util.ArrayList
import java.util.Arrays
import java.util.List
import testsuite1.performance.LaunchConfiguration
import testsuite1.performance.util.TestCaseParameters
import testsuite1.testUtil.Operationalization
import testsuite1.testUtil.Constants

class LaunchGroup {
	/** Path where the LaunchGroup is saved by default. */
	public final static String launchGroupPath = "performance/"
	
	/** Model sizes for which test cases shall be generated. */
	public final static int[] modelSizes = #[10, 50
//											 100, 500, 
//											 1000, 5000,
//											 10000, 50000,
//											 100000, 500000,
//											 1000000, 5000000,
//											 10000000
	]
	
	/** Creates the launch configurations for all test cases and saves them together with a launch group. */
	def static void main(String[] args) {
		var group = new LaunchGroup()
		
		for (tgg : Constants.testProjects) {
			for (op : Operationalization.values) {
				if (op != Operationalization.INCREMENTAL_FWD && op != Operationalization.INCREMENTAL_BWD)
					for (size : modelSizes) {
						var launchConfig = new LaunchConfiguration(new TestCaseParameters(tgg, op, size))
						launchConfig.save();
						group.launchConfigs.add(launchConfig)
					}
					
			}
		}
		
		group.save()
	}
	
	
	public List<LaunchConfiguration> launchConfigs
	
	public new() {
		this.launchConfigs = new ArrayList()
	}
	
	public new(List<LaunchConfiguration> launchConfigs) {
		this.launchConfigs = launchConfigs
	}
	
	
	/** Saves the launch configuration in a file at the default location. */
	public def save() {
		save(launchGroupPath)
	}
	
	/** Saves the launch configuration in a file at the specified location. */
	public def save(String path) {
		Files.write(Paths.get(path+"AllPerformanceTests.launch"), Arrays.asList(getContents()))
	}
	
	/** The launch group template which is parameterized by all TestCaseParameters. */
	def getContents() {
		return '''
		<?xml version="1.0" encoding="UTF-8" standalone="no"?>
		<launchConfiguration type="org.eclipse.debug.core.groups.GroupLaunchConfigurationType">
			«var i = 0»
			«FOR testCase : launchConfigs»
				<stringAttribute key="org.eclipse.debug.core.launchGroup.«i».action" value="WAIT_FOR_TERMINATION"/>
				<booleanAttribute key="org.eclipse.debug.core.launchGroup.«i».adoptIfRunning" value="false"/>
				<booleanAttribute key="org.eclipse.debug.core.launchGroup.«i».enabled" value="true"/>
				<stringAttribute key="org.eclipse.debug.core.launchGroup.«i».mode" value="inherit"/>
				<stringAttribute key="org.eclipse.debug.core.launchGroup.«i».name" value="«testCase.getName»"/>
				«{i = i+1; ""}»
			«ENDFOR»
			<stringAttribute key="org.eclipse.debug.core.launchGroup.«i».action" value="WAIT_FOR_TERMINATION"/>
			<booleanAttribute key="org.eclipse.debug.core.launchGroup.«i».adoptIfRunning" value="false"/>
			<booleanAttribute key="org.eclipse.debug.core.launchGroup.«i».enabled" value="true"/>
			<stringAttribute key="org.eclipse.debug.core.launchGroup.«i».mode" value="inherit"/>
			<stringAttribute key="org.eclipse.debug.core.launchGroup.«i».name" value="PerformanceTest"/>
		</launchConfiguration>
		'''
	}
}
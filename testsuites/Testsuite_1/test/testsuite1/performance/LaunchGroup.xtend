package testsuite1.performance

import java.nio.file.Files
import java.nio.file.Paths
import java.util.ArrayList
import java.util.Arrays
import java.util.List
import testsuite1.performance.util.LaunchConfiguration
import testsuite1.performance.util.Operationalization
import testsuite1.performance.util.TestCaseParameters
import testsuite1.testUtil.Constants

class LaunchGroup {
	public final static String launchGroupPath = "performance/"
	public final static int[] modelSizes = #[10, 50
//											 100, 500, 
//											 1000, 5000,
//											 10000, 50000,
//											 100000, 500000,
//											 1000000, 5000000,
//											 10000000
	]
	
	def static void main(String[] args) {
		var group = new LaunchGroup()
		
		for (tgg : Constants.testProjects) {
			for (op : Operationalization.values) {
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
	
	
	public def save() {
		save(launchGroupPath)
	}
	
	public def save(String path) {
		Files.write(Paths.get(path+"AllPerformanceTests.launch"), Arrays.asList(getContents()))
	}
	
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
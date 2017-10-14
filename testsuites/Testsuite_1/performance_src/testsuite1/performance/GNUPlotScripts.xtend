package testsuite1.performance

import java.nio.file.Files
import java.nio.file.Paths
import java.util.concurrent.TimeUnit
import testsuite1.performance.util.PerformanceConstants

class GNUPlotScripts {

	private static final TimeUnit timeUnit = PerformanceConstants.plotTimeUnit;
	private static final long timeFactor = TimeUnit.NANOSECONDS.convert(1, timeUnit); //conversion from nanoseconds to "timeUnit"
	
	private static final String outputstyle = PerformanceConstants.outputstyle;
	
	private static final String plotPath = "performance/plots/"
	private static final String scriptPath = "performance/gnuplot_scripts/"
	private static final String dataPath = "performance/data/"
	
	/**
	 * Saves the script for the specified plot and the plot itself as files
	 * in the corresponding folders in the "performance/" directory of the testsuite.
	 * @param title The name of the plot that shall be created.
	 * @param script The script for the plot in a single String.
	 */
	def createPlot(String title, String script) {
		var lines = script.split("\n\n")
		Files.write(Paths.get(scriptPath+title+".gp"), lines)
		Runtime.runtime.exec("gnuplot "+scriptPath+title+".gp").waitFor()
	}
	
	def commonHistogramScriptParts(String diagramType, String fileName) {
		return '''
			set output "«plotPath»«diagramType»/«fileName».«IF outputstyle=="gif"»gif«ELSE»pdf«ENDIF»"
			set style data histogram
			set style histogram cluster gap 1
			set style fill solid border -1
			set boxwidth 0.9
			set ylabel "execution time / «timeUnit»"
			set xtic rotate by -45 noenhanced
			set key top left
			set logscale y
			set grid
		'''
	}

	def allTGGsComparison(String title, String op) {
		var script = '''
			set terminal «outputstyle»
			«commonHistogramScriptParts("AllTGGs", title)»
			set title "Comparison of TGG execution times for models of size «PlotGenerator.standardModelSize» - «op»"
			set yrange [1:10000]
			plot \
			newhistogram lt 3, \
			"«dataPath»«title».dat" using ($2/«timeFactor»):xtic(1) ti col
		'''
		createPlot(title, script);
	}

	def allTGGsInitComparison(String title, String op) {
		var script = '''
			set terminal «outputstyle»
			«commonHistogramScriptParts("AllTGGsInit", title)»
			set title "Comparison of TGG initialization times for models of size «PlotGenerator.standardModelSize» - «op»"
			set yrange [10:100000]
			plot \
			newhistogram lt 3, \
			"«dataPath»«title».dat" using ($2/«timeFactor»):xtic(1) ti col
		'''
		createPlot(title, script);
	}

	def modelSizeComparison(String title, String tgg, String op) {
		var script = '''
			set terminal «outputstyle»
			«commonHistogramScriptParts("ModelSizes", title)»
			set title "Impact of model size on execution time - «tgg»:«op»"
			set xlabel "model size"
			plot \
			newhistogram lt 3, \
			"«dataPath»«title».dat" using ($2/«timeFactor»):xtic(1) ti col
		'''
		createPlot(title, script);
	}

	def tggsWithoutRefinementComparison(String title) {
		var script = '''
			set terminal «outputstyle»
			«commonHistogramScriptParts("TGGsWithoutRefinements", title)»
			set title "Execution times of TGGs without refinements"
			set style histogram cluster gap 1 title offset 0, -2
			set rmargin 8
			set bmargin 9
			set yrange [0.1:10000]
			plot \
			newhistogram lt 3 "ClassInhHier2DB", \
			"«dataPath»«title».dat" using ($2/«timeFactor»):xtic(1) ti col, \
			newhistogram lt 3 "CompanyToIT", \
			"«dataPath»«title».dat" every ::1 using ($3/«timeFactor»):xtic(1) notitle \
		'''
		createPlot(title, script);
	}
	
	def initTimes(String title, String tgg, String op) {
		var script = '''
			set terminal «outputstyle» size 5,2
			«commonHistogramScriptParts("InitTimes", title)»
			set title "Execution times of initialization - «tgg»:«op»"
			set xlabel "model size"
			set yrange [1:100000]
			plot \
			newhistogram lt 3, \
			"«dataPath»«title».dat" using ($2/«timeFactor»):xtic(1) ti col
		'''
		createPlot(title, script);
	}
}
package testsuite.ibex.performance

import java.nio.file.Files
import java.nio.file.Paths
import java.util.concurrent.TimeUnit
import testsuite.ibex.performance.util.PerformanceConstants

class GNUPlotScripts {

	static final TimeUnit timeUnit = PerformanceConstants.plotTimeUnit;
	static final long timeFactor = TimeUnit.NANOSECONDS.convert(1, timeUnit); // conversion from nanoseconds to "timeUnit"
	static final String output = PerformanceConstants.output;
	static final String terminal = PerformanceConstants.terminal;
	static final String gnuplotCommand = PerformanceConstants.gnuPlotCommand;
	
	static final String plotPath = "performance/plots/"
	static final String scriptPath = "performance/gnuplot_scripts/"
	static final String dataPath = "performance/data/"
	static final String evalDataPath = "performance/evaluation/data/"
	static final String evalScriptPath = "performance/evaluation/gnuplot_scripts/"
	static final String evalPlotPath = "performance/evaluation/plots/"
	
	static final int max_y_axis = 1000;
	
	/**
	 * Saves the script for the specified plot and the plot itself as files
	 * in the corresponding folders in the "performance/" directory of the testsuite.
	 * @param title The name of the plot that shall be created.
	 * @param script The script for the plot in a single String.
	 */
	def createPlot(String title, String script) {
		var lines = script.split("\n\n")
		Files.write(Paths.get(scriptPath+title+".gp"), lines)
		Runtime.runtime.exec(gnuplotCommand + " "+scriptPath+title+".gp").waitFor()
	}
	
		/**
	 * Saves the script for the specified evaluation plot and the plot itself as files
	 * in the corresponding folders in the "performance/evaluation/" directory of the testsuite.
	 * @param title The name of the plot that shall be created.
	 * @param script The script for the plot in a single String.
	 */
	def createEvalPlot(String title, String script) {
		var lines = script.split("\n\n")
		Files.write(Paths.get(evalScriptPath+title+".gp"), lines)
		Runtime.runtime.exec(gnuplotCommand + " "+evalScriptPath+title+".gp").waitFor()
	}
	
	def commonHistogramScriptParts(String diagramType, String fileName) {
		return '''
			set terminal «terminal»
			set output "«plotPath»«diagramType»/«fileName».«output»"
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
	
	def testHistogramScriptParts(String fileName) {
		return '''
			set terminal «terminal»
			set output "«evalPlotPath»«fileName».«output»"
			set style data histogram
			set style histogram cluster gap 1
			set style fill solid border -1
			set boxwidth 0.9
			set ylabel "average rank"
			set xtic rotate by -45 noenhanced
			set key top left
			set grid
		'''
	}

	def allTGGsComparison(String title, String op) {
		var script = '''
			«commonHistogramScriptParts("AllTGGs", title)»
			set title "Comparison of TGG execution times for models of size «PlotGenerator.standardModelSize» - «op»"
			set yrange [1:«max_y_axis»]
			plot \
			newhistogram lt 3, \
			"«dataPath»«title».dat" using ($2/«timeFactor»):xtic(1) ti col
		'''
		createPlot(title, script);
	}

	def allTGGsInitComparison(String title, String op) {
		var script = '''
			«commonHistogramScriptParts("AllTGGsInit", title)»
			set title "Comparison of TGG initialization times for models of size «PlotGenerator.standardModelSize» - «op»"
			set yrange [10:«max_y_axis»]
			plot \
			newhistogram lt 3, \
			"«dataPath»«title».dat" using ($2/«timeFactor»):xtic(1) ti col
		'''
		createPlot(title, script);
	}

	def modelSizeComparison(String title, String tgg, String op) {
		var script = '''
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
			«commonHistogramScriptParts("TGGsWithoutRefinements", title)»
			set title "Execution times of TGGs without refinements"
			set style histogram cluster gap 1 title offset 0, -2
			set rmargin 8
			set bmargin 9
			set yrange [0.1:«max_y_axis»]
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
			«commonHistogramScriptParts("InitTimes", title)»
			set title "Execution times of initialization - «tgg»:«op»"
			set xlabel "model size"
			set yrange [0.1:«max_y_axis»]
			plot \
			newhistogram lt 3, \
			"«dataPath»«title».dat" using ($2/«timeFactor»):xtic(1) ti col
		'''
		createPlot(title, script);
	}
	
	def allTestsComparisonOnRanks(String title, String op) {
		var script = '''
			«testHistogramScriptParts(title)»
			set title "Comparison of average ranks among tests for models of size «PlotGenerator.standardModelSize» - «op»"
			set yrange [1:10]
			plot \
			newhistogram lt 3, \
			"«evalDataPath»«title».dat" using ($2):xtic(1) ti col
		'''
		createEvalPlot(title, script);
	}
	
	def allTestsComparisonOnValues(String title, String op) {
		var script = '''
			«testHistogramScriptParts(title)»
			set title "Comparison of average execution times among tests for models of size «PlotGenerator.standardModelSize» - «op»"
			set yrange [1:«max_y_axis»]
			plot \
			newhistogram lt 3, \
			"«evalDataPath»«title».dat" using ($2/«timeFactor»):xtic(1) ti col
		'''
		createEvalPlot(title, script);
	}
}
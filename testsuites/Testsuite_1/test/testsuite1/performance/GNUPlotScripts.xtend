package testsuite1.performance

import java.nio.file.Files
import java.nio.file.Paths
import testsuite1.performance.PerformanceTest
import java.util.concurrent.TimeUnit

class GNUPlotScripts {
	private static final TimeUnit timeUnit = TimeUnit.MILLISECONDS;
	private static final long timeFactor = TimeUnit.NANOSECONDS.convert(1, timeUnit); //conversion from nanoseconds to "timeUnit"
	
	private static final String plotPath = "performance/plots/"
	private static final String scriptPath = "performance/gnuplot_scripts/"
	private static final String dataPath = "performance/data/"
	
	/**
	 * Creates the script for the specified plot and creates the plot itself.
	 * Saves both as files in the corresponding folders in the performance/
	 * directory of the testsuite.
	 * To define a new plot, a method for the generation of the script
	 * has to be implemented and that method has to be added to the switch
	 * statement in this method.
	 * @param title The name of the plot that shall be created.
	 * @param outputstyle The style in which the plot should be generated.
	 * The possible options are "gif" for a .gif file and "pdf" for a .pdf file.
	 */
	def static createPlot(String diagramType, String title, String outputstyle, String[] args) {
		var script = ""
		switch diagramType {
			case "TGGsWithoutRefinement": script = tggsWithoutRefinementComparison(title, outputstyle)
			// args[0] should be the Operationalization
			case "AllTGGs": script = allTGGsComparison(title, outputstyle, args.get(0))
			case "AllTGGsInit": script = allTGGsInitComparison(title, outputstyle, args.get(0))
			case "MemoryUsage": script = memoryUsage(title, outputstyle, args.get(0))
			// args[0] should be the TGG, args[1] the Operationalization
			case "ModelSize": script = modelSizeComparison(title, outputstyle, args.get(0), args.get(1))
			case "InitTimes": script = initTimes(title, outputstyle, args.get(0), args.get(1))
		}
		var lines = script.split("\n\n")
		Files.write(Paths.get(scriptPath+title+".gp"), lines)
		Runtime.runtime.exec("gnuplot "+scriptPath+title+".gp").waitFor()
		
	}
	
	def static commonHistogramScriptParts(String diagramType, String fileName, String outputstyle) {
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

	def static allTGGsComparison(String title, String outputstyle, String op) {
		return '''
			set terminal «outputstyle»
			«commonHistogramScriptParts("AllTGGs", title, outputstyle)»
			set title "Comparison of TGG execution times for models of size «PerformanceTest.standardModelSize» - «op»"
			set yrange [1:10000]
			plot \
			newhistogram lt 3, \
			"«dataPath»«title».dat" using ($2/«timeFactor»):xtic(1) ti col
		'''
	}

	def static allTGGsInitComparison(String title, String outputstyle, String op) {
		return '''
			set terminal «outputstyle»
			«commonHistogramScriptParts("AllTGGsInit", title, outputstyle)»
			set title "Comparison of TGG initialization times for models of size «PerformanceTest.standardModelSize» - «op»"
			set yrange [10:100000]
			plot \
			newhistogram lt 3, \
			"«dataPath»«title».dat" using ($2/«timeFactor»):xtic(1) ti col
		'''
	}

	def static modelSizeComparison(String title, String outputstyle, String tgg, String op) {
		return '''
			set terminal «outputstyle»
			«commonHistogramScriptParts("ModelSizes", title, outputstyle)»
			set title "Impact of model size on execution time - «tgg»:«op»"
			set xlabel "model size"
			plot \
			newhistogram lt 3, \
			"«dataPath»«title».dat" using ($2/«timeFactor»):xtic(1) ti col
		'''
	}

	def static tggsWithoutRefinementComparison(String title, String outputstyle) {
		return '''
			set terminal «outputstyle»
			«commonHistogramScriptParts("TGGsWithoutRefinements", title, outputstyle)»
			set title "Execution times of TGGs without refinements"
			set style histogram cluster gap 1 title offset 0, -2
			set rmargin 8
			set bmargin 8
			set yrange [0.1:10000]
			plot \
			newhistogram lt 3 "ClassInhHier2DB", \
			"«dataPath»«title».dat" using ($2/«timeFactor»):xtic(1) ti col
			newhistogram lt 3 "CompanyToIT", \
			"«dataPath»«title».dat" every ::1 using ($3/«timeFactor»):xtic(1) notitle \
		'''
	}
	
	def static memoryUsage(String title, String outputstyle, String op) {
		// make this into one stacked diagram
		return '''
			set terminal «outputstyle»
			«commonHistogramScriptParts("MemoryUsage", title, outputstyle)»
			set title "Maximum possible model sizes - «op»"
			set ylabel "model size"
			set yrange [10:100000]
			plot \
			newhistogram lt 3, \
			"«dataPath»«title».dat" using ($2):xtic(1) ti col
		'''
	}
	
	def static initTimes(String title, String outputstyle, String tgg, String op) {
		return '''
			set terminal «outputstyle» size 5,2
			«commonHistogramScriptParts("InitTimes", title, outputstyle)»
			set title "Execution times of initialization - «tgg»:«op»"
			set xlabel "model size"
			set yrange [1:100000]
			plot \
			newhistogram lt 3, \
			"«dataPath»«title».dat" using ($2/«timeFactor»):xtic(1) ti col
		'''
	}
	
}
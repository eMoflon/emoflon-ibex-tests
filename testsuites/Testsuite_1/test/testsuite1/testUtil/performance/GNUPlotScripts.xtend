package testsuite1.testUtil.performance

import java.nio.file.Files
import java.nio.file.Paths

class GNUPlotScripts {
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
	def static createPlot(String title, String outputstyle, String... args) {
		var script = ""
		switch title {
			// args[0] should be the Operationalization
			case "TGGSize": script = tggSizeComparison(title, outputstyle, args.get(0))
			// args[0] should be the TGG, args[1] the Operationalization
			case "ModelSize": script = modelSizeComparison(title, outputstyle, args.get(0), args.get(1)) 
			
			case "TGGsWithoutRefinement": script = tggsWithoutRefinementComparison(title, outputstyle)
		}
		var lines = script.split("\n\n")
		Files.write(Paths.get(scriptPath+title+".gp"), lines)
		Runtime.runtime.exec("gnuplot "+scriptPath+title+".gp").waitFor()
		
	}
	
	def static commonHistogramScriptParts(String title, String outputstyle) {
		return '''
			set terminal «outputstyle»
			set output "«plotPath»«title».«IF outputstyle=="gif"»gif«ELSE»pdf«ENDIF»"
			set style data histogram
			set style histogram cluster gap 1
			set style fill solid border -1
			set boxwidth 0.9
			set ylabel "execution time / ms"
			set xtic rotate by -45
			set key top left
			set logscale y
			set grid
		'''
	}

	def static tggSizeComparison(String title, String outputstyle, String op) {
		return '''
			«testsuite1.testUtil.performance.GNUPlotScripts.commonHistogramScriptParts(title, outputstyle)»
			set title "Impact of TGG size on execution time - «op»"
			plot \
			newhistogram lt 3, \
			"«dataPath»«title».dat" using ($2/1000000):xtic(1) ti col, '' u ($3/1000000) ti col
		'''
	}

	def static modelSizeComparison(String title, String outputstyle, String tgg, String op) {
		return '''
			«testsuite1.testUtil.performance.GNUPlotScripts.commonHistogramScriptParts(title, outputstyle)»
			set title "Impact of model size on execution time - «tgg»:«op»"
			plot \
			newhistogram lt 3, \
			"«dataPath»«title».dat" using ($2/1000000):xtic(1) ti col, '' u ($3/1000000) ti col
		'''
	}

	def static tggsWithoutRefinementComparison(String title, String outputstyle) {
		return '''
			«testsuite1.testUtil.performance.GNUPlotScripts.commonHistogramScriptParts(title, outputstyle)»
			set title "Comparison of TGGs without refinements"
			set style histogram cluster gap 1 title offset 0, -2
			set rmargin 8
			set bmargin 8
			plot \
			newhistogram lt 3 "ClassInhHier2DB", \
			"«dataPath»«title».dat" using ($2/1000000):xtic(1) ti col, '' u ($3/1000000) ti col, \
			newhistogram lt 3 "CompanyToIT", \
			"«dataPath»«title».dat" every ::1 using ($4/1000000):xtic(1) notitle, '' every ::1 u ($5/1000000) notitle, \
		'''
	}
}
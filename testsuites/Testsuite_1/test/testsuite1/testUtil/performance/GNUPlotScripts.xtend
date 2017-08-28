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
	def static createPlot(String title, String outputstyle) {
		var script = ""
		switch title {
			case "tggSizeMODELGEN": script = tggSizeMODELGENComparison(title, outputstyle)
		}
		var lines = script.split("\n\n")
		Files.write(Paths.get(scriptPath+title+".gp"), lines)
		Runtime.runtime.exec("gnuplot "+scriptPath+title+".gp").waitFor()
		
	}

	def static tggSizeMODELGENComparison(String title, String outputstyle) {
		return '''
			set terminal «outputstyle»
			set output "«plotPath»«title».«IF outputstyle=="gif"»gif«ELSE»pdf«ENDIF»"
			set title "Comparison of Model Sizes - MODELGEN"
			set style data histogram
			set style histogram cluster gap 1
			set style fill solid border -1
			set boxwidth 0.9
			set xlabel "TGG"
			set ylabel "execution time / ms"
			set grid
			set xtic rotate by -45 scale 0
			set key top left
			plot "«dataPath»«title».dat" using ($2/100000):xtic(1) ti col, '' u ($3/100000) ti col
		'''
	}
}
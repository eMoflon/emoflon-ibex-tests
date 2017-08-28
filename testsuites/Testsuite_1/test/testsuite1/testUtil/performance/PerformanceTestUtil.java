package testsuite1.testUtil.performance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class PerformanceTestUtil {
	
	private List<TestDataPoint> testData;
	
	public PerformanceTestUtil(List<TestDataPoint> testData) {
		this.testData = testData;
	}

	/**
	 * Returns those TestDataPoints from the testData which fit to the
	 * specified parameters tgg, op, modelSize and flattened. When null is
	 * passed for any parameter, then that parameter is not used for filtering.
	 */
	public List<TestDataPoint> filterTestResults(String tgg, Operationalization op, Integer modelSize, Boolean flattened) {
		return testData.stream()
					   .filter(t -> tgg==null || t.tgg.getName().equals(tgg))
					   .filter(t -> op==null || t.operationalization == op)
					   .filter(t -> modelSize==null || t.modelSize == modelSize)
					   .filter(t -> flattened==null || t.flattenedNetwork == flattened)
					   .collect(Collectors.toList());
	}
	
	/**
	 * Concatenates the Strings in contents with tabs. Used to define one
	 * line for the .dat file, where the columns are separated by tabs.
	 */
	public String makeLine(String... contents) {
		return String.join("	", contents);
	}
	
	/**
	 * Saves the data as a .dat file in the performance/data directory
	 * of the testsuite. Also, 
	 * @param data
	 * @param fileName Name of the .dat file
	 */
	public void saveDataAndCreatePlot(List<String> data, String fileName) {
		try {
			Path file = Paths.get("performance/data/"+fileName+".dat");
			Files.write(file, data);
//			GNUPlotScripts.tggSizeMODELGENComparison("MODELGEN with 100 elements sorted by TGG size", "gif");
			GNUPlotScripts.createPlot(fileName, "gif");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

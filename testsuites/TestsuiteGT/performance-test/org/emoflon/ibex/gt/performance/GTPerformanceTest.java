package org.emoflon.ibex.gt.performance;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.emoflon.ibex.gt.api.GraphTransformationApp;

public abstract class GTPerformanceTest {
	protected static final String RESULT_DIRECTORY = "performance/";
	private static final String CSV_SEPARATOR = ";";
	private static final String CSV_LINE_DELIMITER = "\n";
	private static final DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");

	private FileWriter writer;

	protected abstract String getTestName();

	protected List<String> getColumnNames() {
		return new ArrayList<String>(Arrays.asList("init duration", "test duration"));
	}

	public static long timeDifference(final long start, final long end) {
		return end - start;
	}

	private static String getDateString() {
		return dateFormat.format(new Date());
	}

	/**
	 * Runs <code>timesPerSize</code> tests for each size in the array
	 * <code>modelSizes</code>.
	 * 
	 * @param testsPerSize
	 *            the number of tests per size
	 * @param modelSizes
	 *            the model size to test
	 */
	public void run(final int testsPerSize, final int[] modelSizes) {
		System.out.println(getTestName());

		createFile();
		for (int modelSize : modelSizes) {
			for (int i = 0; i < testsPerSize; i++) {
				run(modelSize);
			}
		}
		closeFile();
	}

	/**
	 * Runs a single test for the given model size.
	 * 
	 * @param modelSize
	 *            the model size to test
	 */
	protected abstract void run(final int modelSize);

	/**
	 * Creates an URI based on the name of the tests, the model size and the current
	 * date and time.
	 * 
	 * @param modelSize
	 *            the model size
	 * @return the URI
	 */
	public URI createDateURI(int modelSize) {
		return URI.createFileURI(String.format("%s/model-%s-%s.xmi", //
				RESULT_DIRECTORY + getTestName(), modelSize, getDateString()));
	}

	/**
	 * Creates a CSV file for the results and initializes the file writer.
	 */
	private void createFile() {
		File file = new File(RESULT_DIRECTORY + getTestName() + "-" + getDateString() + ".csv");
		file.getParentFile().mkdirs();

		try {
			writer = new FileWriter(file);
			writer.append("model size");
			writer.append(CSV_SEPARATOR);
			for (String n : getColumnNames()) {
				writer.append(n);
				writer.append(CSV_SEPARATOR);
			}
			writer.append(CSV_LINE_DELIMITER);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Writes a result to the CSV file.
	 * 
	 * @param durations
	 *            the durations
	 */
	public void addResult(final int modelSize, long... durations) {
		String s = modelSize + CSV_SEPARATOR;
		for (long d : durations) {
			s += d + CSV_SEPARATOR;
		}

		System.out.println(s);
		try {
			writer.append(s);
			writer.append(CSV_LINE_DELIMITER);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.gc();
	}

	/**
	 * Close the CSV file.
	 */
	private void closeFile() {
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Saves the resources of the given application.
	 * 
	 * @param app
	 *            the GT app
	 */
	public void save(final GraphTransformationApp<?> app) {
		try {
			app.saveResourceSet();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

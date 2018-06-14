package org.emoflon.ibex.gt.performance;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.emoflon.ibex.gt.api.GraphTransformationApp;

public abstract class GTPerformanceTest {
	protected static final String RESULT_DIRECTORY = "performance/";
	private static final char CSV_SEPARATOR = ';';
	private static final char CSV_LINE_DELIMITER = '\n';
	private static final DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");

	private List<TestResult> results = new ArrayList<TestResult>();

	protected abstract String getTestName();

	protected abstract void run(final int modelSize);

	public static long timeDifference(final long start, final long end) {
		return end - start;
	}

	public static String getDateString() {
		return dateFormat.format(new Date());
	}

	public URI createDateURI(int modelSize) {
		return URI.createFileURI(RESULT_DIRECTORY + getTestName() + "/model-" + modelSize + "-" + getDateString() + ".xmi");
	}

	public void addResult(final int modelSize, final long initDuration, final long testDuration) {
		System.out.println("model size: " + modelSize);
		System.out.println("init: " + initDuration);
		System.out.println("test: " + testDuration);
		results.add(new TestResult(modelSize, initDuration, testDuration));
		System.gc();
	}

	public void run(final int timesPerSize, final int[] modelSizes) {
		for (int modelSize : modelSizes) {
			for (int i = 0; i < timesPerSize; i++) {
				run(modelSize);
			}
		}
		try {
			export(RESULT_DIRECTORY + getTestName() + "-" + getDateString() + ".csv");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void export(final String filePath) throws IOException {
		File file = new File(filePath);
		file.getParentFile().mkdirs();

		FileWriter writer = new FileWriter(file);
		writer.append("Model size");
		writer.append(CSV_SEPARATOR);
		writer.append("Init duration");
		writer.append(CSV_SEPARATOR);
		writer.append("Test duration");
		writer.append(CSV_SEPARATOR);
		writer.append(CSV_LINE_DELIMITER);

		for (TestResult result : results) {
			writer.append(String.valueOf(result.modelSize));
			writer.append(CSV_SEPARATOR);
			writer.append(String.valueOf(result.initDuration));
			writer.append(CSV_SEPARATOR);
			writer.append(String.valueOf(result.testDuration));
			writer.append(CSV_SEPARATOR);
			writer.append(CSV_LINE_DELIMITER);
		}

		writer.flush();
		writer.close();
	}
	
	public void save(final GraphTransformationApp<?> app) {
		try {
			app.saveResourceSet();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class TestResult {
	protected int modelSize;
	protected long initDuration;
	protected long testDuration;

	public TestResult(final int modelSize, final long initDuration, final long testDuration) {
		this.modelSize = modelSize;
		this.initDuration = initDuration;
		this.testDuration = testDuration;
	}
}

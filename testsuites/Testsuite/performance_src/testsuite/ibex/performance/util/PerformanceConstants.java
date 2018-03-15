package testsuite.ibex.performance.util;

import java.util.concurrent.TimeUnit;

public class PerformanceConstants {
	
	//-------------------  Performance tests -----------------------------------------------
	
	/** The timeout after which a performance test is aborted. */
	public final static int timeout = 150; // in seconds
	
	/** Defines how much memory may be allocated for the heap by the launched JavaVM. */
	public final static String maxMemorySize = "4096M"; //"M" for megabyte, "G" for gigabyte
	
	/** Model sizes for which test cases shall be generated and executed. */
	public final static int[] modelSizes = {
											500,
											1000,
											2000,
											4000,
											8000
	};

	/** Number of repetitions per test case. Final result is the median of all repetitions. */
	public final static int repetitions = 3;

	//-------------------------  Plots -----------------------------------------------------
	
	/** 
	 * Terminal type to be used by gnuplot
	 * */
	//public static final String terminal = "postscript";  // <-- Try this if pdf doesn't work
	public static final String terminal = "pdf";

	/** 
	 * Output format of the file to be generated by gnuplot
	 * */
	//public static final String output = "ps";  // <-- Try this if pdf doesn't work
	public static final String output = "pdf";
	
	/**
	 * The command used to invoke gnuplot.  You might have to change this depending on your installation.
	 */
	//public static final String gnuPlotCommand = "/usr/local/bin/gnuplot";  // <-- You might need this on a nix system
	public static final String gnuPlotCommand = "gnuplot";
	
	/** The time unit used in the plots. */
	public static final TimeUnit plotTimeUnit = TimeUnit.MILLISECONDS;

	/**
	 * The model size used for most plots with a fixed size. Should be low enough that most
	 * TGGs/Operationalizations do not timeout/run out of memory for this size.
	 * */
	public static final int standardModelSize = 8000;
	
	/**
	 * The model size used for some plots with a fixed size, where the TGG/Operationalization
	 * can handle bigger sizes.
	 * */
	public static final int bigModelSize = 8000;
	
}

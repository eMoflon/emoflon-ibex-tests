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
	
	public final static String workspacePath = "./../../tggs/";
	
	public final static String algorithmToStrategy_MA = "AlgorithmToStrategy_MA";
	public final static String benchmarxFamiliesToPersons = "BenchmarxFamiliesToPersons";
	public final static String blockCodeAdapter = "BlockCodeAdapter";
	public final static String blockDiagramCodeAdapter = "BlockDiagramCodeAdapter";
	public final static String blockDiagramCodeAdapter_EdgeRules = "BlockDiagramCodeAdapter_EdgeRules";
	public final static String class2Doc_MA = "Class2Doc_MA";
	public final static String class2TestClass_MA = "Class2TestClass_MA";
	public final static String classInhHier2DB = "ClassInhHier2DB";
	public final static String classInhHier2DB_MA = "ClassInhHier2DB_MA";
	public final static String classMultipleInhHier2DB_MA = "ClassMultipleInhHier2DB_MA";
	public final static String companyToIT = "CompanyToIT";
	public final static String familiesToPersons_MA = "FamiliesToPersons_MA";
	public final static String familiesToPersons_V0 = "FamiliesToPersons_V0";
	public final static String familiesToPersons_V1 = "FamiliesToPersons_V1";
	public final static String familyWithSiblingsToPersons_MA = "FamilyWithSiblingsToPersons_MA";
	public final static String featureModelConciseToSafe = "FeatureModelConciseToSafe";
	public final static String moDiscoIbexTGG = "MoDiscoIbexTGG";
	public final static String processCodeAdapter = "ProcessCodeAdapter";
	public final static String vhdlTGGCodeAdapter = "VHDLTGGCodeAdapter";
		
	public final static String[] testProjects = {algorithmToStrategy_MA,
												 benchmarxFamiliesToPersons,
			 									 blockCodeAdapter,
												 blockDiagramCodeAdapter,
												 blockDiagramCodeAdapter_EdgeRules,
												 class2Doc_MA,
												 class2TestClass_MA,
												 classInhHier2DB,
												 classInhHier2DB_MA,
												 classMultipleInhHier2DB_MA,
												 companyToIT,
												 familiesToPersons_MA,
												 familiesToPersons_V0,
												 familiesToPersons_V1,
												 familyWithSiblingsToPersons_MA,
												 featureModelConciseToSafe,
												 moDiscoIbexTGG,
												 processCodeAdapter,
												 vhdlTGGCodeAdapter
												 };

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

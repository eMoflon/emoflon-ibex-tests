This framework evaluates the performance of eMoflon::IBeX by automatically measuring
the execution and initialization times of all operationalizations for various TGGs and model sizes.
It also generates several plots automatically from the collected data.

This README file contains instructions on how to setup the framework, how to use it, and
how to customize it, e.g., by adding new TGGs to the framework.

Note:  All paths given are relative to this README file.

Setup
------------
- Download and install [gnuplot][].

[gnuplot]: http://gnuplot.sourceforge.net/

- Make sure the bin-folder of your gnuplot installation is contained in your PATH-variable.


Executing performance tests
------------
- Before you can execute the tests for the first time, you have to generate the launch configurations and launch group.
To do this, execute the main method in `./testsuite/ibex/performance/LaunchGroup.xtend`.
- To execute all tests, run the generated launch configuration `../performance/AllPerformanceTests.launch`.
If you just generated the file, you might have to refresh the folder in order for it to appear.
- After all tests have been executed, the plots are automatically generated for the collected data.

Generating plots
------------
- If you want to regenerate all plots without running the tests again,
you can simply execute `./testsuite/ibex/performance/PlotGenerator.java`.
This may be useful, e.g.,  if you change a plot type or add a new plot type
and want to see how it looks like.


Changing parameters of the performance tests
------------
The performance tests have various parameters that can be changed. They can all be found in `./testsuite/ibex/performance/util/PerformanceConstants.java`. Here is a list of all of them:

- timeout: The timeout after which a performance test is aborted.
- maxMemorySize: Defines how much memory may be allocated for the heap by the JavaVM in each test case.
- modelSizes: Array of model sizes for which test cases shall be generated and executed.
- repetitions: Number of repetitions per test case. Final result is the median of all repetitions.

- outputstyle: The file format in which the plot should be generated,  e.g. pdf or gif.
- plotTimeUnit: The time unit used in the plots.

Adding a new plot type to the performance framework
------------
To add a new plot type, you have to do two things: Create a new gnuplot script template and provide the script with data.

1. *Creating a script template:* The class GNUPlotScripts contains all templates. You can create a new one by simply adding a new method that returns the script.

2. *Providing data:* The templates are called from the PlotGenerator class. After a new template is added, a new method in PlotGenerator must be created that saves a part of the collected data that is relevant to the plot in an appropriate form. You should format the data in a table, where each row is a separate string and each column is separated by a tab. For more detailed information on how the .data files should look like, refer to the existing plots or the gnuplot website.

   You can then call saveData(List<String> data, String fileName) which saves the .data file in the performance/data folder. Afterwards, the template method of GNUPlotScripts can be called, which then saves the script for the concrete parameters in a .gp file in performance/gnuplot_scripts, and executes the script for the previously created .data file. Note that the fileName for the data and the script must be identical (excluding the file extension, which is automatically added).

Adding a new TGG to the performance framework
------------

- Add the new TGG's name to `../test/testsuite/ibex/performance/PerformanceConstants.java`
- You might have to register any new metamodels that weren't present before in the testsuite workspace here:  ` testsuite.ibex.performance.util.PerformanceTestUtil::registerUserMetamodels`
- Create a suitable modelgenStopCriterion for the TGG
- Create suitable incremental edits for the TGG in `./testsuite/ibex/performance/util/IncrementalEditor.java`
- Generate your launch configurations afresh and check if the new TGG is included

Additional remarks
------------
- All generated files are located in the performance folder of the testsuite.
- performance/data holds the generated tables that are used by gnuplot to create the plots.
- performance/gnuplot_scripts holds the generated scripts that are used by gnuplot to create the plots.
It can be used to generate the plot again by directly calling gnuplot with the script file and the
corresponding data file.
- performance/launchConfigs holds all launch configurations generated for the performance test.
- performance/plots holds the generated plots
- If you have executed a performance test before, the result is saved in the file performance/allTestDataPoints.ser.
It contains a serialized version of a List<TestDataPoint> that contains all collected test results.


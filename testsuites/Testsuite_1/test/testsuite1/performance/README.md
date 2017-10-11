

Prerequisites
------------
- Download and install [gnuplot][].

[gnuplot]: http://gnuplot.sourceforge.net/

- Make sure the bin-folder of your gnuplot installation is contained in your PATH-variable.


Executing performance tests
------------
- Before you can execute the tests for the first time, you have to generate the launch configurations and launch group.
To do this, run the LaunchGroup class.


- To execute all tests, run the file AllPerformanceTests.launch in the performace folder of the testsuite project.

- After all tests have been executed, the plots are automatically generated for the collected data.

Generating plots
------------
- If you want to generate the plots without running the tests again,
you can simply run the PlotGenerator class.
This may be useful, e.g.,  if you change a plot type or add a new plot type
and want to see how it looks like.


Changing parameters of the performance tests
------------
The performance tests have various parameters that can be changed. Here is a list of all of them:

- Timeout: 
- Model Sizes:
- Output Style:
- Memory...:


Adding a new plot type to the performance framework
------------


Adding a new TGG to the performance framework
------------


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


package org.emoflon.ibex.tgg.run.bench;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
	private static int[] ns = { //
			2500//100, 200, 300, 500, 1000, 1500, 2000, 2500, 3000, 4000, 5000,  6000, 7000, 8000, 9000, 10000, 11000, 12000,
			//13000, 14000, 15000,16000, 17000, 18000//
	};

	private static int repetitions = 5;

	public static void main(String[] args) throws IOException, InterruptedException {
		BenchContainer cont = new BenchContainer();
		for (int i = 0; i < ns.length; i++) {

			for (int r = 0; r < repetitions; r++) {
				Process proc = exec(VerticalIntegrationBench.class, Arrays.asList("-Xmx6G", "-Xss3m"),
						Arrays.asList("" + ns[i], "" + ns[i]));// ,
				proc.waitFor();
				proc.exitValue();

				// Then retrieve the process output
				InputStream in = proc.getInputStream();
				@SuppressWarnings("unused")
				InputStream err = proc.getErrorStream();

				InputStreamReader is = new InputStreamReader(in);
				StringBuilder sb = new StringBuilder();
				BufferedReader br = new BufferedReader(is);
				String read = br.readLine();
				while (read != null) {
					// System.out.println(read);
					sb.append(read);
					// sb.append("\n");
					read = br.readLine();
				}
				String[] output = sb.toString().split(";");
				BenchEntry b = new BenchEntry( //
						Integer.valueOf(output[0]), //
						Integer.valueOf(output[1]), //
						Integer.valueOf(output[2]), //
						Double.valueOf(output[3]), //
						Double.valueOf(output[4]), //
						Double.valueOf(output[5]), Integer.valueOf(output[6]));
				cont.addBench(b);
				System.out.println(b);
			}
		}
		cont.print();
	}

	public static Process exec(Class<?> clazz, List<String> jvmArgs, List<String> args)
			throws IOException, InterruptedException {
		String javaHome = System.getProperty("java.home");
		String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
		String classpath = System.getProperty("java.class.path");
		String className = clazz.getName();
		List<String> command = new ArrayList<>();
		command.add(javaBin);
		command.addAll(jvmArgs);
		command.add("-cp");
		command.add(classpath);
		command.add(className);
		command.addAll(args);
		ProcessBuilder builder = new ProcessBuilder(command);
		Process process = builder.start();
		return process;
	}
}

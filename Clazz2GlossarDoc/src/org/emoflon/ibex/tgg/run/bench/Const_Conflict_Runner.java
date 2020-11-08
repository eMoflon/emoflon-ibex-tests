package org.emoflon.ibex.tgg.run.bench;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.IOUtils;

import com.google.common.io.CharStreams;

public class Const_Conflict_Runner {

	
	private static int[] ns = {
//			100, 200, 300, 500, 1000, 1500, 2000, 2500, 3000, 3500, 4000, 4500, 5000
			//100, 150, 
			200
	};
	
	private static int[] cs = {
			1
	};
	
	private static int repetitions = 1;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		BenchContainer cont = new BenchContainer();
		for(int i = 0; i < ns.length; i++) {
			for(int j = 0; j < cs.length; j++) {
				for(int r = 0; r < repetitions; r++) {
				     Process proc = exec(Horizontal_IntegrationBench.class, Arrays.asList("-Xmx4G"), Arrays.asList(""+ns[i], ""+cs[j]));
				     proc.waitFor();
					 proc.exitValue();
					 
					// Then retreive the process output
					 InputStream in = proc.getInputStream();
					 InputStream err = proc.getErrorStream();
					 String errStr = IOUtils.toString(err, StandardCharsets.UTF_8);
					 System.out.println(errStr);
					
					 
					 InputStreamReader is = new InputStreamReader(in);
					 StringBuilder sb=new StringBuilder();
					 BufferedReader br = new BufferedReader(is);
					 String read = br.readLine();
					 while(read != null) {
					        //System.out.println(read);
					        sb.append(read);
					        sb.append("\n");
					        read =br.readLine();
					    }
					 String[] output = sb.toString().trim().split(";");
					 BenchEntry b = new BenchEntry( //
							 Integer.valueOf(output[0]), //
							 Integer.valueOf(output[1]), //
							 Integer.valueOf(output[2]), //
							 Double.valueOf(output[3]), //
							 Double.valueOf(output[4]), //
							 Integer.valueOf(output[5]));
					 cont.addBench(b);
					 System.out.println(b);
				}
			}
		}
		cont.print();
	}
	
	public static Process exec(Class clazz, List<String> jvmArgs, List<String> args) throws IOException, InterruptedException {
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

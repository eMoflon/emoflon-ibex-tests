package org.emoflon.ibex.tgg.run.modiscoibextgg.config;

import java.io.IOException;

import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;

/**
 * Generated by eMoflon::IBeX.
 * 
 * Do not edit this class. It is automatically generated and is kept in sync
 * with the imports in your Schema.tgg file.
 */
public class _SchemaBasedAutoRegistration {
	
	public static void register(OperationalStrategy strategy) throws IOException {
		strategy.loadAndRegisterMetamodel("platform:/resource/MoDiscoIbexTGG/metamodels/java.ecore");
		strategy.loadAndRegisterMetamodel("platform:/resource/MoDiscoIbexTGG/metamodels/UML.ecore");
	}
	
}

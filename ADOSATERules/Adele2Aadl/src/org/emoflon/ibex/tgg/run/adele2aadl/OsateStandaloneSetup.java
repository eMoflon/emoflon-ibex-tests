/**
 * AADL-RAMSES
 * 
 * Copyright © 2012 TELECOM ParisTech and CNRS
 * 
 * TELECOM ParisTech/LTCI
 * 
 * Authors: see AUTHORS
 * 
 * This program is free software: you can redistribute it and/or modify 
 * it under the terms of the Eclipse Public License as published by Eclipse,
 * either version 1.0 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see 
 * http://www.eclipse.org/org/documents/epl-v10.php
 */

package org.emoflon.ibex.tgg.run.adele2aadl;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.osate.aadl2.instance.InstancePackage;
import org.osate.aadl2.instance.util.InstanceResourceFactoryImpl;
import org.osate.workspace.WorkspacePlugin;
import org.osate.xtext.aadl2.Aadl2StandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class OsateStandaloneSetup extends Aadl2StandaloneSetup {
	
	@SuppressWarnings("unused")
	private static final Object dummy = InstancePackage.eINSTANCE;
	
	private static final FileFilter aadlFilesFilter = new FileFilter() {
		
		@Override
		public boolean accept( final File file ) {
			return file.isDirectory() || file.getName().endsWith( "." + WorkspacePlugin.SOURCE_FILE_EXT );
		}
	};
	
	private final URI baseUri;

	public OsateStandaloneSetup() {
		this( null );
	}

	public OsateStandaloneSetup( final URI baseUri ) {
		this.baseUri = baseUri;
	}

	@Override
	public Injector createInjector() {
		return Guice.createInjector( new StandaloneAadl2RuntimeModule() );
	}

	public ResourceSet createResourceSet() {
		return createResourceSet( null );
	}
	
	public ResourceSet createResourceSet( final String[] predefinedAadlResNames ) {
		return createResourceSet( "", predefinedAadlResNames );
	}

	public ResourceSet createResourceSet(  	final String predefinedAadlResDir,
											final Comparator<String> resourceDependenciesComparator ) {
		return createResourceSet( predefinedAadlResDir, null, resourceDependenciesComparator );
	}

	public ResourceSet createResourceSet(  	final String predefinedAadlResDir,
											final String[] predefinedAadlResNames ) {
		return createResourceSet( predefinedAadlResDir, predefinedAadlResNames, null );
	}
		
	public ResourceSet createResourceSet(  	final String predefinedAadlResDir,
											final String[] predefinedAadlResNames,
											final Comparator<String> resourceDependenciesComparator ) {
		final Injector injector = createInjectorAndDoEMFRegistration();

		// Issue #35: EMFIndexRetrieval API changed and class deprecated
		//EMFIndexRetrieval.registerResourceProviders( injector.getInstance( ResourceDescriptionsProvider.class ) );
//		EMFIndexRetrieval.registerResourceProviders( 	injector.getInstance( ResourceDescriptionsProvider.class ), 
//														injector.getInstance( IResourceServiceProvider.Registry.class ) );
		
		final XtextResourceSet resourceSet = injector.getInstance( XtextResourceSet.class );
		resourceSet.addLoadOption( XtextResource.OPTION_RESOLVE_ALL, true );
		
		loadPredefinedAadlResources( 	predefinedAadlResDir,
										predefinedAadlResNames,
										resourceDependenciesComparator,
										resourceSet,
										baseUri );
		
		return resourceSet;
	}
	
	public static void loadPredefinedAadlResources( final String predefinedAadlResDir,
			final String[] predefinedAadlFiles,
			final ResourceSet resourceSet ) {
		loadPredefinedAadlResources( predefinedAadlResDir, predefinedAadlFiles, resourceSet, null );
	}
	
	public static void loadPredefinedAadlResources( final String predefinedAadlResDir,
													final String[] predefinedAadlFiles,
													final ResourceSet resourceSet,
													final URI baseUri ) {
		loadPredefinedAadlResources( predefinedAadlResDir, predefinedAadlFiles, null, resourceSet, baseUri );
	}

	public static void loadPredefinedAadlResources( final String predefinedAadlResDir,
													final String[] predefinedAadlResNames,
													final Comparator<String> resourceDependenciesComparator,
													final ResourceSet resourceSet,
													final URI baseUri ) {
		assert predefinedAadlResDir != null;
		
		final Set<String> predefinedAadlResources = new LinkedHashSet<String>();
		
		if ( predefinedAadlResNames != null ) {
			predefinedAadlResources.addAll( Arrays.asList( predefinedAadlResNames ) );
		}
		else {
			 final List<String> files = findAadlFiles( new File( predefinedAadlResDir ) );
			
			if ( resourceDependenciesComparator != null ) {
				files.sort( resourceDependenciesComparator );
			}
			
			predefinedAadlResources.addAll( files );
		}
		
		 URI predefinedAadlResDirUri = URI.createFileURI( predefinedAadlResDir );
		 
		 if ( baseUri != null ) {
			 predefinedAadlResDirUri = predefinedAadlResDirUri.resolve( baseUri );
		 }
		
		for ( final String aadlFileName : predefinedAadlResources ) {
		//while ( !predefinedAadlResources.isEmpty() ) {
			//final String aadlFileName = predefinedAadlResources.iterator().next();
			final Resource resource = resourceSet.getResource( predefinedAadlResDirUri.appendSegment( aadlFileName ), true );
			
			if ( !resource.getErrors().isEmpty() ) {
				final StringBuilder strBuild = new StringBuilder( "Resource " );
				strBuild.append( resource.getURI() );
				strBuild.append( " has errors!" );
				strBuild.append( System.lineSeparator() );
				strBuild.append( resource.getErrors().toString() );
				
				resource.unload();
				
				throw new IllegalStateException( strBuild.toString() );
			}
//			else {
				//predefinedAadlResources.remove( aadlFileName );
//			}
		}
	}
	
	private static List<String> findAadlFiles( final File file ) {
		final List<String> aadlFiles = new ArrayList<String>();
		
		if ( file.isFile() ) {
			if ( aadlFilesFilter.accept( file ) ) {
				aadlFiles.add( file.getName() );
			}
		}
		else if ( file.isDirectory() ) {
			for ( final File subFile : file.listFiles( aadlFilesFilter ) ) {
				aadlFiles.addAll( findAadlFiles( subFile ) );
			}
		}
		
		return aadlFiles;
	}
	
	@Override
	public void register(Injector injector) {
		super.register(injector);

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put( WorkspacePlugin.INSTANCE_FILE_EXT, new InstanceResourceFactoryImpl() );
	}
}
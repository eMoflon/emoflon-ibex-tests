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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.osate.annexsupport.AnnexLinkingService;
import org.osate.annexsupport.AnnexParser;
import org.osate.annexsupport.AnnexProxy;
import org.osate.annexsupport.AnnexRegistry;
import org.osate.annexsupport.AnnexResolver;
import org.osate.annexsupport.AnnexTextPositionResolver;
import org.osate.annexsupport.AnnexUnparser;
import org.osate.ba.AadlBaParserAction;
import org.osate.ba.AadlBaResolver;
import org.osate.ba.AadlBaUnParserAction;
import org.osate.ba.texteditor.AadlBaSemanticHighlighter;
import org.osate.ba.texteditor.AadlBaTextPositionResolver;

public class StandaloneAnnexRegistry extends AnnexRegistry {
	
	private static final Map<String, StandaloneAnnexRegistry> registries = new HashMap<String, StandaloneAnnexRegistry>();
	
	public StandaloneAnnexRegistry( final String extensionId ) {
		registries.put( extensionId, this );
		
		initialize( extensionId );
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void initialize( final String extensionId ) {
		if ( Platform.isRunning() /*&& OsateResourceUtil.USES_GUI*/ ) {
			super.initialize(extensionId);
		}
		else {
			// Hard coded initialization of annexes
			extensions = new HashMap<String, Object>();
			
			if ( extensionId == ANNEX_PARSER_EXT_ID ) {
				extensions.put( AadlBaParserAction.ANNEX_NAME, new AadlBaParserAction() );
			} 
			else if ( extensionId == ANNEX_UNPARSER_EXT_ID ) {
				extensions.put( AadlBaUnParserAction.ANNEX_NAME, new AadlBaUnParserAction() );
			}
			else if ( extensionId == ANNEX_RESOLVER_EXT_ID ) {
				extensions.put( AadlBaResolver.ANNEX_NAME, new AadlBaResolver() );
			}
//			else if ( extensionId == ANNEX_LINKINGSERVICE_EXT_ID ) {
//			}
			else if  ( extensionId == ANNEX_TEXTPOSITIONRESOLVER_EXT_ID ) {
				extensions.put( AadlBaParserAction.ANNEX_NAME, new AadlBaTextPositionResolver() );
			}
//			else if ( extensionId == ANNEX_INSTANTIATOR_EXT_ID ) {
//			}
			else if (extensionId == ANNEX_HIGHLIGHTER_EXT_ID) {
				extensions.put( AadlBaParserAction.ANNEX_NAME, new AadlBaSemanticHighlighter() );
			}
//			else if (extensionId == ANNEX_CONTENT_ASSIST_EXT_ID) {
//			}
		}
	}

	public static StandaloneAnnexRegistry getRegistry( final String extensionId ) {
		StandaloneAnnexRegistry registry = registries.get( extensionId );

		if ( registry == null ) {
			registry = new StandaloneAnnexRegistry( extensionId );
			registries.put( extensionId, registry );
		}
		
		return registry;
	}

	@Override
	protected AnnexProxy createProxy( final IConfigurationElement configElem ) {
		return new StandaloneAnnexProxy( configElem );
	}

	public AnnexParser getAnnexParser( String annexName ) {
		return (AnnexParser) extensions.get( annexName.toLowerCase() );
	}

	public AnnexUnparser getAnnexUnparser( String annexName ) {
		return (AnnexUnparser) extensions.get( annexName.toLowerCase() );
	}

	public AnnexResolver getAnnexResolver( String annexName ) {
		return (AnnexResolver) extensions.get( annexName.toLowerCase() );
	}

	public AnnexTextPositionResolver getTextPositionResolver( String annexName ) {
		return (AnnexTextPositionResolver) extensions.get( annexName.toLowerCase() );
	}

	public AnnexLinkingService getAnnexLinkingService( String annexName ) {
		return (AnnexLinkingService) extensions.get( annexName.toLowerCase() );
	}
}
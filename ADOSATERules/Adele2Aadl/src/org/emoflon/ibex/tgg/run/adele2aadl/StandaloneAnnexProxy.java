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

import org.eclipse.core.runtime.IConfigurationElement;
import org.osate.annexsupport.AnnexProxy;

public class StandaloneAnnexProxy extends AnnexProxy {

	public StandaloneAnnexProxy( final IConfigurationElement configElem) {
	    super( configElem );
	}

	public StandaloneAnnexProxy(	final String id,
									final String name,
									final String annexName, 
									final String className ) {
		super( id, name, annexName, className );
	}
}
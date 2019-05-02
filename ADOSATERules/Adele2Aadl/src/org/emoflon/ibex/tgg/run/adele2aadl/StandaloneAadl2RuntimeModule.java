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

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.linking.ILinkingService;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;
import org.eclipse.xtext.resource.IFragmentProvider;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.validation.IConcreteSyntaxValidator;
import org.eclipse.xtext.validation.INamesAreUniqueValidationHelper;
//import org.osate.aadl2.modelsupport.scoping.EClassGlobalScopeProvider;
import org.osate.xtext.aadl2.AbstractAadl2RuntimeModule;
import org.osate.xtext.aadl2.scoping.Aadl2GlobalScopeProvider;
import org.osate.xtext.aadl2.serializer.Aadl2CrossReferenceSerializer;
import org.osate.xtext.aadl2.serializing.Aadl2TransientValueService;
import org.osate.xtext.aadl2.util.Aadl2QualifiedNameFragmentProvider;
import org.osate.xtext.aadl2.validation.Aadl2ConcreteSyntaxValidator;
import org.osate.xtext.aadl2.validation.Aadl2NamesAreUniqueValidationHelper;
import org.osate.xtext.aadl2.valueconversion.Aadl2ValueConverter;

public class StandaloneAadl2RuntimeModule extends AbstractAadl2RuntimeModule {

	@Override
	public Class<? extends ILinkingService> bindILinkingService() {
		return StandaloneAadl2LinkingService.class;
	}

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return Aadl2ValueConverter.class;
	}

	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return StandaloneAadl2QualifiedNameProvider.class;
	}
//
//	public Class<? extends IQualifiedNameConverter> bindIQualifiedNameConverter() {
//		return Aadl2QualifiedNameConverter.class;
//	}

	@Override
	public Class<? extends ILinker> bindILinker() {
		return StandaloneAnnexParserAgent.class;
	}

	@Override
	public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return /*EClassGlobalScopeProvider*/Aadl2GlobalScopeProvider.class;
	}

	/* Issue #8: Needed to identify transient features from the AADL meta-model
	 * 
	 * (non-Javadoc)
	 * @see org.eclipse.xtext.service.DefaultRuntimeModule#bindITransientValueService()
	 */
	@Override
	public Class<? extends ITransientValueService> bindITransientValueService() {
		return Aadl2TransientValueService.class;
	}

	@Override
	public Class<? extends IConcreteSyntaxValidator> bindConcreteSyntaxValidator() {
		return Aadl2ConcreteSyntaxValidator.class;
	}

	@Override
	public Class<? extends IFragmentProvider> bindIFragmentProvider() {
		return Aadl2QualifiedNameFragmentProvider.class;
	}

	public Class<? extends INamesAreUniqueValidationHelper> bindINamesAreUniqueValidationHelper() {
		return Aadl2NamesAreUniqueValidationHelper.class;
	}

	/**
	 * Issue #10: Save refined model with standard EMF API
	 * @return
	 */
	@SuppressWarnings("restriction")
	public Class<? extends org.eclipse.xtext.serializer.tokens.ICrossReferenceSerializer> bindICrossReferenceSerializer() {
		return Aadl2CrossReferenceSerializer.class;
	}
}
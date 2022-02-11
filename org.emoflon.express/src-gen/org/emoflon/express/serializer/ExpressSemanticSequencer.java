/*
 * generated by Xtext 2.25.0
 */
package org.emoflon.express.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.emoflon.express.express.AliasType;
import org.emoflon.express.express.BooleanAttribute;
import org.emoflon.express.express.Entity;
import org.emoflon.express.express.EnumerationType;
import org.emoflon.express.express.EnumerationValue;
import org.emoflon.express.express.ExpressPackage;
import org.emoflon.express.express.Function;
import org.emoflon.express.express.ImportedEntity;
import org.emoflon.express.express.ImportedEntityList;
import org.emoflon.express.express.IntegerAttribute;
import org.emoflon.express.express.ParameterList;
import org.emoflon.express.express.RealAttribute;
import org.emoflon.express.express.ReferenceAttribute;
import org.emoflon.express.express.ReferenceOrValue;
import org.emoflon.express.express.Schema;
import org.emoflon.express.express.SchemaContainer;
import org.emoflon.express.express.SelectType;
import org.emoflon.express.express.StringAttribute;
import org.emoflon.express.express.UseFrom;
import org.emoflon.express.express.UserDefinedTypeList;
import org.emoflon.express.services.ExpressGrammarAccess;

@SuppressWarnings("all")
public class ExpressSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ExpressGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ExpressPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ExpressPackage.ALIAS_TYPE:
				sequence_AliasType(context, (AliasType) semanticObject); 
				return; 
			case ExpressPackage.BOOLEAN_ATTRIBUTE:
				sequence_BooleanAttribute(context, (BooleanAttribute) semanticObject); 
				return; 
			case ExpressPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case ExpressPackage.ENUMERATION_TYPE:
				sequence_EnumerationType(context, (EnumerationType) semanticObject); 
				return; 
			case ExpressPackage.ENUMERATION_VALUE:
				sequence_EnumerationValue(context, (EnumerationValue) semanticObject); 
				return; 
			case ExpressPackage.FUNCTION:
				sequence_Function(context, (Function) semanticObject); 
				return; 
			case ExpressPackage.IMPORTED_ENTITY:
				sequence_ImportedEntity(context, (ImportedEntity) semanticObject); 
				return; 
			case ExpressPackage.IMPORTED_ENTITY_LIST:
				sequence_ImportedEntityList(context, (ImportedEntityList) semanticObject); 
				return; 
			case ExpressPackage.INTEGER_ATTRIBUTE:
				sequence_IntegerAttribute(context, (IntegerAttribute) semanticObject); 
				return; 
			case ExpressPackage.PARAMETER:
				sequence_Parameter(context, (org.emoflon.express.express.Parameter) semanticObject); 
				return; 
			case ExpressPackage.PARAMETER_LIST:
				sequence_ParameterList(context, (ParameterList) semanticObject); 
				return; 
			case ExpressPackage.REAL_ATTRIBUTE:
				sequence_RealAttribute(context, (RealAttribute) semanticObject); 
				return; 
			case ExpressPackage.REFERENCE_ATTRIBUTE:
				sequence_ReferenceAttribute(context, (ReferenceAttribute) semanticObject); 
				return; 
			case ExpressPackage.REFERENCE_OR_VALUE:
				sequence_ReferenceOrValue(context, (ReferenceOrValue) semanticObject); 
				return; 
			case ExpressPackage.SCHEMA:
				sequence_Schema(context, (Schema) semanticObject); 
				return; 
			case ExpressPackage.SCHEMA_CONTAINER:
				sequence_SchemaContainer(context, (SchemaContainer) semanticObject); 
				return; 
			case ExpressPackage.SELECT_TYPE:
				sequence_SelectType(context, (SelectType) semanticObject); 
				return; 
			case ExpressPackage.STRING_ATTRIBUTE:
				sequence_StringAttribute(context, (StringAttribute) semanticObject); 
				return; 
			case ExpressPackage.USE_FROM:
				sequence_UseFrom(context, (UseFrom) semanticObject); 
				return; 
			case ExpressPackage.USER_DEFINED_TYPE_LIST:
				sequence_UserDefinedTypeList(context, (UserDefinedTypeList) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Declaration returns AliasType
	 *     UserDefinedType returns AliasType
	 *     AliasType returns AliasType
	 *
	 * Constraint:
	 *     (name=ID element=[UserDefinedType|ID])
	 */
	protected void sequence_AliasType(ISerializationContext context, AliasType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpressPackage.Literals.USER_DEFINED_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressPackage.Literals.USER_DEFINED_TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, ExpressPackage.Literals.ALIAS_TYPE__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressPackage.Literals.ALIAS_TYPE__ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAliasTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAliasTypeAccess().getElementUserDefinedTypeIDTerminalRuleCall_3_0_1(), semanticObject.eGet(ExpressPackage.Literals.ALIAS_TYPE__ELEMENT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns BooleanAttribute
	 *     BooleanAttribute returns BooleanAttribute
	 *
	 * Constraint:
	 *     (name=ID optional?='OPTIONAL'?)
	 */
	protected void sequence_BooleanAttribute(ISerializationContext context, BooleanAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Entity
	 *     UserDefinedType returns Entity
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID subType=[Entity|ID]? superType=[Entity|ID]? attributes+=Attribute*)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns EnumerationType
	 *     UserDefinedType returns EnumerationType
	 *     EnumerationType returns EnumerationType
	 *
	 * Constraint:
	 *     (name=ID values+=EnumerationValue values+=EnumerationValue?)
	 */
	protected void sequence_EnumerationType(ISerializationContext context, EnumerationType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EnumerationValue returns EnumerationValue
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_EnumerationValue(ISerializationContext context, EnumerationValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpressPackage.Literals.ENUMERATION_VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressPackage.Literals.ENUMERATION_VALUE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnumerationValueAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Function
	 *     Function returns Function
	 *
	 * Constraint:
	 *     (name=ID parameters=ParameterList? returnType=ReferenceOrValue)
	 */
	protected void sequence_Function(ISerializationContext context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ImportedEntityList returns ImportedEntityList
	 *
	 * Constraint:
	 *     (entities+=ImportedEntity entities+=ImportedEntity*)
	 */
	protected void sequence_ImportedEntityList(ISerializationContext context, ImportedEntityList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ImportedEntity returns ImportedEntity
	 *
	 * Constraint:
	 *     (entity=[Entity|ID] alias=ID?)
	 */
	protected void sequence_ImportedEntity(ISerializationContext context, ImportedEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns IntegerAttribute
	 *     IntegerAttribute returns IntegerAttribute
	 *
	 * Constraint:
	 *     (name=ID optional?='OPTIONAL'?)
	 */
	protected void sequence_IntegerAttribute(ISerializationContext context, IntegerAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterList returns ParameterList
	 *
	 * Constraint:
	 *     (parameters+=Parameter parameters+=Parameter*)
	 */
	protected void sequence_ParameterList(ISerializationContext context, ParameterList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (name=ID type=ReferenceOrValue)
	 */
	protected void sequence_Parameter(ISerializationContext context, org.emoflon.express.express.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpressPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressPackage.Literals.PARAMETER__NAME));
			if (transientValues.isValueTransient(semanticObject, ExpressPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressPackage.Literals.PARAMETER__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterAccess().getTypeReferenceOrValueParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns RealAttribute
	 *     RealAttribute returns RealAttribute
	 *
	 * Constraint:
	 *     (name=ID optional?='OPTIONAL'?)
	 */
	protected void sequence_RealAttribute(ISerializationContext context, RealAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns ReferenceAttribute
	 *     ReferenceAttribute returns ReferenceAttribute
	 *
	 * Constraint:
	 *     (name=ID optional?='OPTIONAL'? reference=[UserDefinedType|ID])
	 */
	protected void sequence_ReferenceAttribute(ISerializationContext context, ReferenceAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReferenceOrValue returns ReferenceOrValue
	 *
	 * Constraint:
	 *     (reference=[UserDefinedType|ID] | value='INTEGER' | value='BOOLEAN' | value='STRING')
	 */
	protected void sequence_ReferenceOrValue(ISerializationContext context, ReferenceOrValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SchemaContainer returns SchemaContainer
	 *
	 * Constraint:
	 *     schemas+=Schema
	 */
	protected void sequence_SchemaContainer(ISerializationContext context, SchemaContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Schema returns Schema
	 *
	 * Constraint:
	 *     (name=ID declarations+=Declaration*)
	 */
	protected void sequence_Schema(ISerializationContext context, Schema semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns SelectType
	 *     UserDefinedType returns SelectType
	 *     SelectType returns SelectType
	 *
	 * Constraint:
	 *     (name=ID types=UserDefinedTypeList)
	 */
	protected void sequence_SelectType(ISerializationContext context, SelectType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpressPackage.Literals.USER_DEFINED_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressPackage.Literals.USER_DEFINED_TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, ExpressPackage.Literals.SELECT_TYPE__TYPES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressPackage.Literals.SELECT_TYPE__TYPES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSelectTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSelectTypeAccess().getTypesUserDefinedTypeListParserRuleCall_5_0(), semanticObject.getTypes());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns StringAttribute
	 *     StringAttribute returns StringAttribute
	 *
	 * Constraint:
	 *     (name=ID optional?='OPTIONAL'?)
	 */
	protected void sequence_StringAttribute(ISerializationContext context, StringAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns UseFrom
	 *     UseFrom returns UseFrom
	 *
	 * Constraint:
	 *     (schema=[Schema|ID] importedEntities=ImportedEntityList?)
	 */
	protected void sequence_UseFrom(ISerializationContext context, UseFrom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UserDefinedTypeList returns UserDefinedTypeList
	 *
	 * Constraint:
	 *     (elements+=[UserDefinedType|ID] elements+=[UserDefinedType|ID]*)
	 */
	protected void sequence_UserDefinedTypeList(ISerializationContext context, UserDefinedTypeList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
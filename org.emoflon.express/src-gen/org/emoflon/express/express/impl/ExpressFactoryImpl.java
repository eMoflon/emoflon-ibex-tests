/**
 * generated by Xtext 2.37.0
 */
package org.emoflon.express.express.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emoflon.express.express.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressFactoryImpl extends EFactoryImpl implements ExpressFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ExpressFactory init()
  {
    try
    {
      ExpressFactory theExpressFactory = (ExpressFactory)EPackage.Registry.INSTANCE.getEFactory(ExpressPackage.eNS_URI);
      if (theExpressFactory != null)
      {
        return theExpressFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ExpressFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ExpressPackage.SCHEMA_CONTAINER: return createSchemaContainer();
      case ExpressPackage.SCHEMA: return createSchema();
      case ExpressPackage.DECLARATION: return createDeclaration();
      case ExpressPackage.REFERENCE_OR_VALUE: return createReferenceOrValue();
      case ExpressPackage.USER_DEFINED_TYPE: return createUserDefinedType();
      case ExpressPackage.USE_FROM: return createUseFrom();
      case ExpressPackage.IMPORTED_ENTITY_LIST: return createImportedEntityList();
      case ExpressPackage.IMPORTED_ENTITY: return createImportedEntity();
      case ExpressPackage.SELECT_TYPE: return createSelectType();
      case ExpressPackage.ENUMERATION_TYPE: return createEnumerationType();
      case ExpressPackage.ENUMERATION_VALUE: return createEnumerationValue();
      case ExpressPackage.ALIAS_TYPE: return createAliasType();
      case ExpressPackage.ENTITY: return createEntity();
      case ExpressPackage.FUNCTION: return createFunction();
      case ExpressPackage.PARAMETER_LIST: return createParameterList();
      case ExpressPackage.PARAMETER: return createParameter();
      case ExpressPackage.USER_DEFINED_TYPE_LIST: return createUserDefinedTypeList();
      case ExpressPackage.ATTRIBUTE: return createAttribute();
      case ExpressPackage.INTEGER_ATTRIBUTE: return createIntegerAttribute();
      case ExpressPackage.STRING_ATTRIBUTE: return createStringAttribute();
      case ExpressPackage.REAL_ATTRIBUTE: return createRealAttribute();
      case ExpressPackage.BOOLEAN_ATTRIBUTE: return createBooleanAttribute();
      case ExpressPackage.REFERENCE_ATTRIBUTE: return createReferenceAttribute();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SchemaContainer createSchemaContainer()
  {
    SchemaContainerImpl schemaContainer = new SchemaContainerImpl();
    return schemaContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Schema createSchema()
  {
    SchemaImpl schema = new SchemaImpl();
    return schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReferenceOrValue createReferenceOrValue()
  {
    ReferenceOrValueImpl referenceOrValue = new ReferenceOrValueImpl();
    return referenceOrValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UserDefinedType createUserDefinedType()
  {
    UserDefinedTypeImpl userDefinedType = new UserDefinedTypeImpl();
    return userDefinedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UseFrom createUseFrom()
  {
    UseFromImpl useFrom = new UseFromImpl();
    return useFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImportedEntityList createImportedEntityList()
  {
    ImportedEntityListImpl importedEntityList = new ImportedEntityListImpl();
    return importedEntityList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImportedEntity createImportedEntity()
  {
    ImportedEntityImpl importedEntity = new ImportedEntityImpl();
    return importedEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectType createSelectType()
  {
    SelectTypeImpl selectType = new SelectTypeImpl();
    return selectType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumerationType createEnumerationType()
  {
    EnumerationTypeImpl enumerationType = new EnumerationTypeImpl();
    return enumerationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumerationValue createEnumerationValue()
  {
    EnumerationValueImpl enumerationValue = new EnumerationValueImpl();
    return enumerationValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AliasType createAliasType()
  {
    AliasTypeImpl aliasType = new AliasTypeImpl();
    return aliasType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParameterList createParameterList()
  {
    ParameterListImpl parameterList = new ParameterListImpl();
    return parameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UserDefinedTypeList createUserDefinedTypeList()
  {
    UserDefinedTypeListImpl userDefinedTypeList = new UserDefinedTypeListImpl();
    return userDefinedTypeList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntegerAttribute createIntegerAttribute()
  {
    IntegerAttributeImpl integerAttribute = new IntegerAttributeImpl();
    return integerAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringAttribute createStringAttribute()
  {
    StringAttributeImpl stringAttribute = new StringAttributeImpl();
    return stringAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RealAttribute createRealAttribute()
  {
    RealAttributeImpl realAttribute = new RealAttributeImpl();
    return realAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanAttribute createBooleanAttribute()
  {
    BooleanAttributeImpl booleanAttribute = new BooleanAttributeImpl();
    return booleanAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReferenceAttribute createReferenceAttribute()
  {
    ReferenceAttributeImpl referenceAttribute = new ReferenceAttributeImpl();
    return referenceAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressPackage getExpressPackage()
  {
    return (ExpressPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ExpressPackage getPackage()
  {
    return ExpressPackage.eINSTANCE;
  }

} //ExpressFactoryImpl

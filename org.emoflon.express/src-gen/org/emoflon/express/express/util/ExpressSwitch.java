/**
 * generated by Xtext 2.25.0
 */
package org.emoflon.express.express.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emoflon.express.express.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.emoflon.express.express.ExpressPackage
 * @generated
 */
public class ExpressSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ExpressPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ExpressPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ExpressPackage.SCHEMA_CONTAINER:
      {
        SchemaContainer schemaContainer = (SchemaContainer)theEObject;
        T result = caseSchemaContainer(schemaContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.SCHEMA:
      {
        Schema schema = (Schema)theEObject;
        T result = caseSchema(schema);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.REFERENCE_OR_VALUE:
      {
        ReferenceOrValue referenceOrValue = (ReferenceOrValue)theEObject;
        T result = caseReferenceOrValue(referenceOrValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.USER_DEFINED_TYPE:
      {
        UserDefinedType userDefinedType = (UserDefinedType)theEObject;
        T result = caseUserDefinedType(userDefinedType);
        if (result == null) result = caseDeclaration(userDefinedType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.USE_FROM:
      {
        UseFrom useFrom = (UseFrom)theEObject;
        T result = caseUseFrom(useFrom);
        if (result == null) result = caseDeclaration(useFrom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.IMPORTED_ENTITY_LIST:
      {
        ImportedEntityList importedEntityList = (ImportedEntityList)theEObject;
        T result = caseImportedEntityList(importedEntityList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.IMPORTED_ENTITY:
      {
        ImportedEntity importedEntity = (ImportedEntity)theEObject;
        T result = caseImportedEntity(importedEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.SELECT_TYPE:
      {
        SelectType selectType = (SelectType)theEObject;
        T result = caseSelectType(selectType);
        if (result == null) result = caseUserDefinedType(selectType);
        if (result == null) result = caseDeclaration(selectType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.ENUMERATION_TYPE:
      {
        EnumerationType enumerationType = (EnumerationType)theEObject;
        T result = caseEnumerationType(enumerationType);
        if (result == null) result = caseUserDefinedType(enumerationType);
        if (result == null) result = caseDeclaration(enumerationType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.ENUMERATION_VALUE:
      {
        EnumerationValue enumerationValue = (EnumerationValue)theEObject;
        T result = caseEnumerationValue(enumerationValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.ALIAS_TYPE:
      {
        AliasType aliasType = (AliasType)theEObject;
        T result = caseAliasType(aliasType);
        if (result == null) result = caseUserDefinedType(aliasType);
        if (result == null) result = caseDeclaration(aliasType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = caseUserDefinedType(entity);
        if (result == null) result = caseDeclaration(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = caseDeclaration(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.PARAMETER_LIST:
      {
        ParameterList parameterList = (ParameterList)theEObject;
        T result = caseParameterList(parameterList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.USER_DEFINED_TYPE_LIST:
      {
        UserDefinedTypeList userDefinedTypeList = (UserDefinedTypeList)theEObject;
        T result = caseUserDefinedTypeList(userDefinedTypeList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.INTEGER_ATTRIBUTE:
      {
        IntegerAttribute integerAttribute = (IntegerAttribute)theEObject;
        T result = caseIntegerAttribute(integerAttribute);
        if (result == null) result = caseAttribute(integerAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.STRING_ATTRIBUTE:
      {
        StringAttribute stringAttribute = (StringAttribute)theEObject;
        T result = caseStringAttribute(stringAttribute);
        if (result == null) result = caseAttribute(stringAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.REAL_ATTRIBUTE:
      {
        RealAttribute realAttribute = (RealAttribute)theEObject;
        T result = caseRealAttribute(realAttribute);
        if (result == null) result = caseAttribute(realAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.BOOLEAN_ATTRIBUTE:
      {
        BooleanAttribute booleanAttribute = (BooleanAttribute)theEObject;
        T result = caseBooleanAttribute(booleanAttribute);
        if (result == null) result = caseAttribute(booleanAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressPackage.REFERENCE_ATTRIBUTE:
      {
        ReferenceAttribute referenceAttribute = (ReferenceAttribute)theEObject;
        T result = caseReferenceAttribute(referenceAttribute);
        if (result == null) result = caseAttribute(referenceAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Schema Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Schema Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchemaContainer(SchemaContainer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchema(Schema object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaration(Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference Or Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference Or Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceOrValue(ReferenceOrValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>User Defined Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>User Defined Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUserDefinedType(UserDefinedType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Use From</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Use From</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUseFrom(UseFrom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imported Entity List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imported Entity List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportedEntityList(ImportedEntityList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imported Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imported Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportedEntity(ImportedEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectType(SelectType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumerationType(EnumerationType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumerationValue(EnumerationValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alias Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alias Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAliasType(AliasType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterList(ParameterList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>User Defined Type List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>User Defined Type List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUserDefinedTypeList(UserDefinedTypeList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerAttribute(IntegerAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringAttribute(StringAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealAttribute(RealAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanAttribute(BooleanAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceAttribute(ReferenceAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ExpressSwitch
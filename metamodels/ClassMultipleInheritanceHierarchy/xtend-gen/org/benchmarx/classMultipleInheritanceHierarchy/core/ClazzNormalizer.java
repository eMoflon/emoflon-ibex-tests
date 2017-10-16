package org.benchmarx.classMultipleInheritanceHierarchy.core;

import classMultipleInheritanceHierarchy.Attribute;
import classMultipleInheritanceHierarchy.Clazz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.benchmarx.classMultipleInheritanceHierarchy.core.AttributeNormalizer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ClazzNormalizer implements Comparator<Clazz> {
  private boolean checkAttributeValues;
  
  private AttributeNormalizer attributeNormalizer;
  
  public ClazzNormalizer(final boolean checkAttributeValues) {
    this.checkAttributeValues = checkAttributeValues;
    AttributeNormalizer _attributeNormalizer = new AttributeNormalizer(checkAttributeValues);
    this.attributeNormalizer = _attributeNormalizer;
  }
  
  @Override
  public int compare(final Clazz clazz1, final Clazz clazz2) {
    final String clazzString1 = this.stringify(clazz1);
    final String clazzString2 = this.stringify(clazz2);
    return clazzString1.compareTo(clazzString2);
  }
  
  public String stringify(final Clazz clazz) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Clazz {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("name = \"");
    {
      if (this.checkAttributeValues) {
        String _name = clazz.getName();
        _builder.append(_name, "\t");
      } else {
        _builder.append("clazz");
      }
    }
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("superClasses = [");
    _builder.newLine();
    _builder.append("\t");
    EList<Clazz> _superClass = clazz.getSuperClass();
    final List<Clazz> sortedSuperClasses = new ArrayList<Clazz>(_superClass);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    this.normalize(sortedSuperClasses);
    _builder.newLineIfNotEmpty();
    {
      boolean _hasElements = false;
      for(final Clazz ssc : sortedSuperClasses) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        _builder.append("\t");
        {
          if (this.checkAttributeValues) {
            String _name_1 = ssc.getName();
            _builder.append(_name_1, "\t");
          } else {
            _builder.append("superClass");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attributes = [");
    _builder.newLine();
    _builder.append("\t");
    EList<Attribute> _attributes = clazz.getAttributes();
    final List<Attribute> sortedList = new ArrayList<Attribute>(_attributes);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    this.attributeNormalizer.normalize(sortedList);
    _builder.newLineIfNotEmpty();
    {
      boolean _hasElements_1 = false;
      for(final Attribute a : sortedList) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        _builder.append("\t");
        String _stringify = this.attributeNormalizer.stringify(a);
        _builder.append(_stringify, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public void normalize(final List<Clazz> clazzes) {
    Collections.<Clazz>sort(clazzes, this);
  }
}

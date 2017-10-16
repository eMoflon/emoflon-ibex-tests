package org.benchmarx.classMultipleInheritanceHierarchy.core;

import classMultipleInheritanceHierarchy.ClassPackage;
import classMultipleInheritanceHierarchy.Clazz;
import java.util.ArrayList;
import java.util.List;
import org.benchmarx.classMultipleInheritanceHierarchy.core.ClazzNormalizer;
import org.benchmarx.emf.Comparator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Assert;

@SuppressWarnings("all")
public class ClassMultipleIhneritanceHierarchyComparator implements Comparator<ClassPackage> {
  /**
   * checkAttributeValues determines if equality requires equal values in all EAttributes.
   * MODELGEN tests cannot handle this and therefore require checkAttributeValues == false.
   */
  private boolean checkAttributeValues;
  
  private ClazzNormalizer clazzNormalizer;
  
  public ClassMultipleIhneritanceHierarchyComparator(final boolean checkAttributeValues) {
    this.checkAttributeValues = checkAttributeValues;
    ClazzNormalizer _clazzNormalizer = new ClazzNormalizer(checkAttributeValues);
    this.clazzNormalizer = _clazzNormalizer;
  }
  
  @Override
  public void assertEquals(final ClassPackage expected, final ClassPackage actual) {
    Assert.assertTrue(this.stringify(expected).startsWith("ClassPackage"));
    Assert.assertEquals(this.stringify(expected), this.stringify(actual));
  }
  
  public String stringify(final ClassPackage classPackage) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ClassPackage {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("name = \"");
    {
      if (this.checkAttributeValues) {
        String _name = classPackage.getName();
        _builder.append(_name, "\t");
      } else {
        _builder.append("classPackage");
      }
    }
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("classes = [");
    _builder.newLine();
    _builder.append("\t");
    EList<Clazz> _classes = classPackage.getClasses();
    final List<Clazz> sortedList = new ArrayList<Clazz>(_classes);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    this.clazzNormalizer.normalize(sortedList);
    _builder.newLineIfNotEmpty();
    {
      boolean _hasElements = false;
      for(final Clazz c : sortedList) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        _builder.append("\t");
        String _stringify = this.clazzNormalizer.stringify(c);
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
}

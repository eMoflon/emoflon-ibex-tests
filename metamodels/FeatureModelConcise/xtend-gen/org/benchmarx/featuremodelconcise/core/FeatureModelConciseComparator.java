package org.benchmarx.featuremodelconcise.core;

import FeatureModelConcise.Feature;
import FeatureModelConcise.Group;
import FeatureModelConcise.Model;
import FeatureModelConcise.OrGroup;
import FeatureModelConcise.XorGroup;
import java.util.Arrays;
import org.benchmarx.emf.Comparator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Assert;

@SuppressWarnings("all")
public class FeatureModelConciseComparator implements Comparator<Model> {
  private boolean checkAttributeValues;
  
  public FeatureModelConciseComparator(final boolean checkAttributeValues) {
    this.checkAttributeValues = checkAttributeValues;
  }
  
  @Override
  public void assertEquals(final Model expected, final Model actual) {
    Assert.assertTrue(this.stringify(expected).startsWith("FeatureModelConcise"));
    Assert.assertEquals(this.stringify(expected), this.stringify(actual));
  }
  
  public String stringify(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("FeatureModelConcise {");
    _builder.newLine();
    _builder.append("\t");
    {
      if (this.checkAttributeValues) {
        String _name = model.getName();
        _builder.append(_name, "\t");
      } else {
        _builder.append("model");
      }
    }
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _stringify = this.stringify(model.getRoot());
    _builder.append(_stringify, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String stringify(final Feature feature) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (this.checkAttributeValues) {
        String _name = feature.getName();
        _builder.append(_name);
      } else {
        _builder.append("feature");
      }
    }
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("// Groups:");
    _builder.newLine();
    {
      EList<Group> _groups = feature.getGroups();
      for(final Group group : _groups) {
        _builder.append("\t");
        String _stringifyGroup = this.stringifyGroup(group);
        _builder.append(_stringifyGroup, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Sub Features:");
    _builder.newLine();
    {
      EList<Feature> _subfeatures = feature.getSubfeatures();
      for(final Feature f : _subfeatures) {
        _builder.append("\t");
        String _stringify = this.stringify(f);
        _builder.append(_stringify, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _stringifyGroup(final XorGroup group) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("XOR {");
    _builder.newLine();
    {
      EList<Feature> _members = group.getMembers();
      for(final Feature f : _members) {
        _builder.append("\t");
        String _stringify = this.stringify(f);
        _builder.append(_stringify, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _stringifyGroup(final OrGroup group) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("OR {");
    _builder.newLine();
    {
      EList<Feature> _members = group.getMembers();
      for(final Feature f : _members) {
        _builder.append("\t");
        String _stringify = this.stringify(f);
        _builder.append(_stringify, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String stringifyGroup(final Group group) {
    if (group instanceof OrGroup) {
      return _stringifyGroup((OrGroup)group);
    } else if (group instanceof XorGroup) {
      return _stringifyGroup((XorGroup)group);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(group).toString());
    }
  }
}

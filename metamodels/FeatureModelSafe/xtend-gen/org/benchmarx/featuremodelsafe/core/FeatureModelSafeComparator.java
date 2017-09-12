package org.benchmarx.featuremodelsafe.core;

import FeatureModelSafe.Feature;
import FeatureModelSafe.Group;
import FeatureModelSafe.Model;
import FeatureModelSafe.OrGroup;
import FeatureModelSafe.XorGroup;
import java.util.ArrayList;
import java.util.Arrays;
import org.benchmarx.emf.Comparator;
import org.benchmarx.featuremodelsafe.core.FeatureNormaliser;
import org.benchmarx.featuremodelsafe.core.GroupNormaliser;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Assert;

@SuppressWarnings("all")
public class FeatureModelSafeComparator implements Comparator<Model> {
  private boolean checkAttributeValues;
  
  private FeatureNormaliser featureNormaliser;
  
  private GroupNormaliser groupNormaliser;
  
  public FeatureModelSafeComparator(final boolean checkAttributeValues) {
    this.checkAttributeValues = checkAttributeValues;
    FeatureNormaliser _featureNormaliser = new FeatureNormaliser();
    this.featureNormaliser = _featureNormaliser;
    GroupNormaliser _groupNormaliser = new GroupNormaliser();
    this.groupNormaliser = _groupNormaliser;
  }
  
  @Override
  public void assertEquals(final Model expected, final Model actual) {
    String _stringify = this.stringify(expected);
    boolean _startsWith = _stringify.startsWith("FeatureModelSafe");
    Assert.assertTrue(_startsWith);
    String _stringify_1 = this.stringify(expected);
    String _stringify_2 = this.stringify(actual);
    Assert.assertEquals(_stringify_1, _stringify_2);
  }
  
  public String stringify(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("FeatureModelSafe {");
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
    Feature _root = model.getRoot();
    String _stringify = this.stringify(_root);
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
        _builder.append(_name, "");
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
      ArrayList<Group> _normalise = this.groupNormaliser.normalise(_groups);
      for(final Group group : _normalise) {
        _builder.append("\t");
        String _stringifyGroup = this.stringifyGroup(group);
        _builder.append(_stringifyGroup, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Solitary Sub Features:");
    _builder.newLine();
    {
      EList<Feature> _solitarySubFeatures = feature.getSolitarySubFeatures();
      ArrayList<Feature> _normalise_1 = this.featureNormaliser.normalise(_solitarySubFeatures);
      for(final Feature f : _normalise_1) {
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
      ArrayList<Feature> _normalise = this.featureNormaliser.normalise(_members);
      for(final Feature f : _normalise) {
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
      ArrayList<Feature> _normalise = this.featureNormaliser.normalise(_members);
      for(final Feature f : _normalise) {
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

package org.benchmarx.featuremodelconcise.core;

import FeatureModelConcise.Feature;
import FeatureModelConcise.Group;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.benchmarx.featuremodelconcise.core.FeatureNormaliser;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class GroupNormaliser implements Comparator<Group> {
  public ArrayList<Group> normalise(final EList<Group> groups) {
    final ArrayList<Group> list = new ArrayList<Group>(groups);
    Collections.<Group>sort(list, this);
    return list;
  }
  
  @Override
  public int compare(final Group g1, final Group g2) {
    EList<Feature> _members = g1.getMembers();
    int _size = _members.size();
    EList<Feature> _members_1 = g2.getMembers();
    int _size_1 = _members_1.size();
    boolean _greaterThan = (_size > _size_1);
    if (_greaterThan) {
      return 1;
    } else {
      EList<Feature> _members_2 = g1.getMembers();
      int _size_2 = _members_2.size();
      EList<Feature> _members_3 = g2.getMembers();
      int _size_3 = _members_3.size();
      boolean _lessThan = (_size_2 < _size_3);
      if (_lessThan) {
        return (-1);
      } else {
        final FeatureNormaliser featureNormaliser = new FeatureNormaliser();
        EList<Feature> _members_4 = g1.getMembers();
        final ArrayList<Feature> g1Members = featureNormaliser.normalise(_members_4);
        EList<Feature> _members_5 = g2.getMembers();
        final ArrayList<Feature> g2Members = featureNormaliser.normalise(_members_5);
        StringConcatenation _builder = new StringConcatenation();
        {
          boolean _hasElements = false;
          for(final Feature f : g1Members) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate("__", "");
            }
            String _name = f.getName();
            _builder.append(_name, "");
            _builder.newLineIfNotEmpty();
          }
        }
        final String g1Label = _builder.toString();
        StringConcatenation _builder_1 = new StringConcatenation();
        {
          boolean _hasElements_1 = false;
          for(final Feature f_1 : g2Members) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder_1.appendImmediate("__", "");
            }
            String _name_1 = f_1.getName();
            _builder_1.append(_name_1, "");
            _builder_1.newLineIfNotEmpty();
          }
        }
        final String g2Label = _builder_1.toString();
        return g1Label.compareTo(g2Label);
      }
    }
  }
}

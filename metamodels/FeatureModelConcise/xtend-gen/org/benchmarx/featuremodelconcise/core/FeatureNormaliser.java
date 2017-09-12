package org.benchmarx.featuremodelconcise.core;

import FeatureModelConcise.Feature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class FeatureNormaliser implements Comparator<Feature> {
  public ArrayList<Feature> normalise(final EList<Feature> features) {
    final ArrayList<Feature> list = new ArrayList<Feature>(features);
    Collections.<Feature>sort(list, this);
    return list;
  }
  
  @Override
  public int compare(final Feature f1, final Feature f2) {
    String _name = f1.getName();
    String _name_1 = f2.getName();
    return _name.compareTo(_name_1);
  }
}

package org.benchmarx.strategy.core;

import Strategies.Strategy;
import Strategies.StrategyContainer;
import java.util.ArrayList;
import java.util.List;
import org.benchmarx.emf.Comparator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Assert;

@SuppressWarnings("all")
public class StrategyComparator implements Comparator<StrategyContainer> {
  /**
   * checkAttributeValues determines if equality requires equal values in all EAttributes.
   * MODELGEN tests cannot handle this and therefore require checkAttributeValues == false.
   */
  @Override
  public void assertEquals(final StrategyContainer expected, final StrategyContainer actual) {
    Assert.assertTrue(this.stringify(expected).startsWith("StrategyContainer"));
    Assert.assertEquals(this.stringify(expected), this.stringify(actual));
  }
  
  public String stringify(final StrategyContainer strategyContainer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("StrategyContainer {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("name = \"StrategyContainer\",");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("strategies = [");
    _builder.newLine();
    _builder.append("\t");
    EList<Strategy> _strategies = strategyContainer.getStrategies();
    final List<Strategy> sortedList = new ArrayList<Strategy>(_strategies);
    _builder.newLineIfNotEmpty();
    {
      boolean _hasElements = false;
      for(final Strategy c : sortedList) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        _builder.append("\t");
        _builder.append("s", "\t");
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

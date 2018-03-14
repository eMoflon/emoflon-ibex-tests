package benchmarx.algorithm.core;

import Algorithms.Algorithm;
import Algorithms.AlgorithmContainer;
import java.util.ArrayList;
import java.util.List;
import org.benchmarx.emf.Comparator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Assert;

@SuppressWarnings("all")
public class AlgorithmComparator implements Comparator<AlgorithmContainer> {
  /**
   * checkAttributeValues determines if equality requires equal values in all EAttributes.
   * MODELGEN tests cannot handle this and therefore require checkAttributeValues == false.
   */
  @Override
  public void assertEquals(final AlgorithmContainer expected, final AlgorithmContainer actual) {
    Assert.assertTrue(this.stringify(expected).startsWith("AlgorithmContainer"));
    Assert.assertEquals(this.stringify(expected), this.stringify(actual));
  }
  
  public String stringify(final AlgorithmContainer AlgorithmContainer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("AlgorithmContainer {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("name = \"AlgorithmContainer\",");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("algorithms = [");
    _builder.newLine();
    _builder.append("\t");
    EList<Algorithm> _algorithms = AlgorithmContainer.getAlgorithms();
    final List<Algorithm> sortedList = new ArrayList<Algorithm>(_algorithms);
    _builder.newLineIfNotEmpty();
    {
      boolean _hasElements = false;
      for(final Algorithm c : sortedList) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        _builder.append("\t");
        _builder.append("a", "\t");
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

package org.benchmarx.documents.core;

import Documents.Container;
import Documents.Document;
import java.util.ArrayList;
import java.util.List;
import org.benchmarx.documents.core.DocumentsNormalizer;
import org.benchmarx.emf.Comparator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Assert;

@SuppressWarnings("all")
public class DocumentsComparator implements Comparator<Container> {
  /**
   * checkAttributeValues determines if equality requires equal values in all EAttributes.
   * MODELGEN tests cannot handle this and therefore require checkAttributeValues == false.
   */
  private boolean checkAttributeValues;
  
  private DocumentsNormalizer docNormalizer;
  
  public DocumentsComparator(final boolean checkAttributeValues) {
    this.checkAttributeValues = checkAttributeValues;
    DocumentsNormalizer _documentsNormalizer = new DocumentsNormalizer(checkAttributeValues);
    this.docNormalizer = _documentsNormalizer;
  }
  
  @Override
  public void assertEquals(final Container expected, final Container actual) {
    Assert.assertTrue(this.stringify(expected).startsWith("Container"));
    Assert.assertEquals(this.stringify(expected), this.stringify(actual));
  }
  
  public String stringify(final Container docPackage) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Container {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("name = \"");
    {
      if (this.checkAttributeValues) {
        String _name = docPackage.getName();
        _builder.append(_name, "\t");
      } else {
        _builder.append("container");
      }
    }
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("documents = [");
    _builder.newLine();
    _builder.append("\t");
    EList<Document> _documents = docPackage.getDocuments();
    final List<Document> sorted = new ArrayList<Document>(_documents);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    this.docNormalizer.normalize(sorted);
    _builder.newLineIfNotEmpty();
    {
      boolean _hasElements = false;
      for(final Document c : sorted) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        _builder.append("\t");
        String _stringify = this.docNormalizer.stringify(c);
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

package org.benchmarx.documents.core;

import Documents.Document;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class DocumentsNormalizer implements Comparator<Document> {
  private boolean checkAttributeValues;
  
  public DocumentsNormalizer(final boolean checkAttributeValues) {
    this.checkAttributeValues = checkAttributeValues;
  }
  
  @Override
  public int compare(final Document doc1, final Document doc2) {
    final String docString1 = this.stringify(doc1);
    final String docString2 = this.stringify(doc2);
    return docString1.compareTo(docString2);
  }
  
  public String stringify(final Document doc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Document {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("name = \"");
    {
      if (this.checkAttributeValues) {
        String _name = doc.getName();
        _builder.append(_name, "\t");
      } else {
        _builder.append("doc");
      }
    }
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("references = [");
    _builder.newLine();
    _builder.append("\t");
    EList<Document> _reference = doc.getReference();
    final List<Document> sortedReferences = new ArrayList<Document>(_reference);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    this.normalize(sortedReferences);
    _builder.newLineIfNotEmpty();
    {
      boolean _hasElements = false;
      for(final Document ssc : sortedReferences) {
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
            _builder.append("ref");
          }
        }
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
  
  public void normalize(final List<Document> docs) {
    Collections.<Document>sort(docs, this);
  }
}

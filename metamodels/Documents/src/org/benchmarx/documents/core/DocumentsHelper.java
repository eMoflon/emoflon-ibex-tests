package org.benchmarx.documents.core;

import Documents.Container;
import Documents.Document;
import Documents.DocumentsFactory;

public class DocumentsHelper {
	
	public void createDocument(Container c, String name) {
		Document doc = DocumentsFactory.eINSTANCE.createDocument();
		doc.setName(name);
		c.getDocuments().add(doc);
	}
	
	public void createReference(Container c, String doc1, String doc2) {
		Document d1 = c.getDocuments().stream()
				.filter(a -> a.getName().equals(doc1)).findAny().get();
		Document d2 = c.getDocuments().stream()
				.filter(a -> a.getName().equals(doc2)).findAny().get();
		d1.getReference().add(d2);
	}

}

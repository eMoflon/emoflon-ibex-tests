package org.benchmarx.documents.core;

import org.eclipse.emf.ecore.util.EcoreUtil;

import Documents.Container;
import Documents.Document;
import Documents.DocumentsFactory;

public class DocumentsHelper {
	
	public void createDocument(Container c, String name) {
		Document doc = DocumentsFactory.eINSTANCE.createDocument();
		doc.setName(name);
		c.getDocuments().add(doc);
	}
	
	public void createReference(Container c, String from, String to) {
		Document d1 = c.getDocuments().stream()
				.filter(a -> a.getName().equals(from)).findAny().get();
		Document d2 = c.getDocuments().stream()
				.filter(a -> a.getName().equals(to)).findAny().get();
		d1.getReference().add(d2);
	}
	
	public void deleteDocument(Container c, String name) {
		Document toBeDeleted = c.getDocuments().stream()
				.filter(p -> p.getName().equals(name)).findAny().get();
		EcoreUtil.delete(toBeDeleted, true);
	}
	
	public void deleteReference(Container c, String doc1, String doc2) {
		Document d1 = c.getDocuments().stream()
				.filter(a -> a.getName().equals(doc1)).findAny().get();
		Document d2 = c.getDocuments().stream()
				.filter(a -> a.getName().equals(doc2)).findAny().get();
		d1.getReference().remove(d2);
	}

}

package org.benchmarx.extDocModel.core;

import ExtDocModel.Doc;
import ExtDocModel.DocContainer;
import ExtDocModel.Entry;
import ExtDocModel.EntryType;
import ExtDocModel.ExtDocModelFactory;
import ExtDocModel.Glossary;
import ExtDocModel.GlossaryEntry;

public class ExtDocHelper {
	
	private final DocContainer docContainer;
	
	private final ExtDocModelFactory factory = ExtDocModelFactory.eINSTANCE;

	public ExtDocHelper(DocContainer docContainer) {
		this.docContainer = docContainer;
	}
	
	//// CREATORS ////
	
	public Doc createDoc(String name) {
		Doc d = factory.createDoc();
		d.setName(name);
		d.setContainer(docContainer);
		return d;
	}
	
	public Entry createEntry(Doc d, String name, EntryType type) {
		Entry e = factory.createEntry();
		e.setName(name);
		e.setDoc(d);
		e.setType(type);
		return e;
	}
	
	public void createSubDocLink(Doc d, Doc subD) {
		d.getSubDocs().add(subD);
	}
	
	public Glossary createGlossary() {
		Glossary g = factory.createGlossary();
		g.setContainer(docContainer);
		return g;
	}
	
	public GlossaryEntry createGlossaryEntry(String name) {
		Glossary g = docContainer.getGlossary() == null ? createGlossary() : docContainer.getGlossary();
		
		GlossaryEntry ge = factory.createGlossaryEntry();
		ge.setName(name);
		ge.setGlossary(g);
		return ge;
	}
	
	public void createGlossarEntryLink(Entry e, GlossaryEntry ge) {
		e.getGlossaryEntries().add(ge);
	}
	
	
	//// GETTERS ////
	
	public Doc getDoc(String name) {
		for (Doc d : docContainer.getDocs()) {
			if (d.getName().equals(name))
				return d;
		}
		return null;
	}
	
	public Entry getEntry(String name) {
		for (Doc d : docContainer.getDocs()) {
			Entry result = getEntry(d, name);
			if (result != null)
				return result;
		}
		return null;
	}
	
	public Entry getEntry(Doc d, String name) {
		for (Entry e : d.getEntries()) {
			if (e.getName().equals(name))
				return e;
		}
		return null;
	}
	
	public GlossaryEntry getGlossaryEntry(String name) {
		if(docContainer.getGlossary() == null)
			return null;
		
		for (GlossaryEntry ge : docContainer.getGlossary().getEntries()) {
			if (ge.getName().equals(name))
				return ge;
		}
		return null;
	}

}

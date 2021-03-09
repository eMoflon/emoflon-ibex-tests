package org.benchmarx.extDocModel.core;

import ExtDocModel.Doc;
import ExtDocModel.DocContainer;
import ExtDocModel.Entry;
import ExtDocModel.EntryType;
import ExtDocModel.ExtDocModelFactory;
import ExtDocModel.Folder;
import ExtDocModel.Glossary;
import ExtDocModel.GlossaryEntry;

public class ExtDocHelper {
	
	private final DocContainer docContainer;
	
	private final ExtDocModelFactory factory = ExtDocModelFactory.eINSTANCE;

	public ExtDocHelper(DocContainer docContainer) {
		this.docContainer = docContainer;
	}
	
	//// CREATORS ////
	
	public Folder createFolder(String name) {
		Folder f = factory.createFolder();
		f.setName(name);
		f.setContainer(docContainer);
		return f;
	}
	
	public Doc createDoc(Folder f, String name) {
		Doc d = factory.createDoc();
		d.setName(name);
		d.setFolder(f);
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
	
	public Folder getFolder(String name) {
		for (Folder f : docContainer.getFolders()) {
			if (f.getName().equals(name))
				return f;
		}
		return null;
	}
	
	public Doc getDoc(String name) {
		for (Folder f: docContainer.getFolders()) {
			Doc result = getDoc(f, name);
			if (result != null)
				return result;
		}
		return null;
	}
	
	public Doc getDoc(Folder f, String name) {
		for (Doc d : f.getDocs()) {
			if (d.getName().equals(name))
				return d;
		}
		return null;
	}
	
	public Entry getEntry(String name) {
		for (Folder f : docContainer.getFolders()) {
			for (Doc d : f.getDocs()) {
				Entry result = getEntry(d, name);
				if (result != null)
					return result;
			}
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

package org.glossarDoc.core;

import glossarDocumentation.*;

public class GlossarDocumentationHelper {

	private DocumentationContainer dCont;

	public GlossarDocumentationHelper(DocumentationContainer cCont) {
		this.dCont = cCont;
	}

	public Document getDocumentation(String name) {
		for (Document d : dCont.getDocuments()) {
			if (d.getName().equals(name))
				return d;
		}
		return null;
	}

	public Entry getEntry(String name) {
		for (Document c : dCont.getDocuments()) {
			Entry result = getEntry(c, name);
			if (result != null)
				return result;
		}
		return null;
	}

	public Entry getEntry(Document c, String name) {
		for (Entry f : c.getEntries()) {
			if (f.getName().equals(name))
				return f;
		}

		return null;
	}

	public GlossarEntry getGlossarEntry(String value) {
		for (GlossarEntry ge : dCont.getGlossar().getEntries()) {
			if (ge.getValue().equals(value))
				return ge;
		}
		return null;
	}

	public Document createDocument(String name) {
		Document d = GlossarDocumentationFactory.eINSTANCE.createDocument();
		d.setName(name);
		dCont.getDocuments().add(d);
		return d;
	}

	public Entry createMethodEntry(Document d, String name) {
		Entry e = GlossarDocumentationFactory.eINSTANCE.createEntry();
		e.setName(name);
		e.setType(EntryType.METHOD);
		d.getEntries().add(e);
		return e;
	}

	public Entry createFieldEntry(Document d, String name) {
		Entry e = GlossarDocumentationFactory.eINSTANCE.createEntry();
		e.setName(name);
		e.setType(EntryType.FIELD);
		d.getEntries().add(e);
		return e;
	}

	public GlossarEntry createGlossarEntry(String name) {
		GlossarEntry ge = GlossarDocumentationFactory.eINSTANCE.createGlossarEntry();
		ge.setValue(name);
		dCont.getGlossar().getEntries().add(ge);
		return ge;
	}

	public void createHyperRef(Document source, Document target) {
		source.getHyperRefs().add(target);
	}

	public void deleteHyperRef(Document source, Document target) {
		source.getHyperRefs().remove(target);
	}

	public void createGlossarEntryLink(Entry e, GlossarEntry ge) {
		e.getGlossarentries().add(ge);
	}

	public void deleteGlossarEntryLink(Entry e, GlossarEntry ge) {
		e.getGlossarentries().remove(ge);
	}

	public void completeExampleModel() {
		createGlossarEntry("GE12");
		GlossarEntry ge13 = createGlossarEntry("GE13");
		createGlossarEntryLink(getEntry("F7"), ge13);
		createGlossarEntryLink(getEntry("M8"), ge13);
	}
}

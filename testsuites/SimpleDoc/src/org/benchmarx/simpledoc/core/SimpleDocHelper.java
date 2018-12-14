package org.benchmarx.simpledoc.core;

import simpleDoc.Doc;
import simpleDoc.Folder;
import simpleDoc.SimpleDocFactory;

public class SimpleDocHelper {

	public void createMoflon(Folder org) {
		Folder es = createFolder(org, "es");
		Folder emoflon = createFolder(es, "emoflon");
		Folder cmoflon = createFolder(es, "cmoflon");
		Folder ibex = createFolder(emoflon, "ibex");
		
		createDoc(es, "es_doc", "esDoc");
		createDoc(emoflon, "emoflon_doc", "emoflonDoc");
		createDoc(cmoflon, "cmoflon_doc", "cmoflonDoc");
		createDoc(ibex, "ibex_doc", "ibexDoc");
		
		createDoc(es, "EcoreUtil_doc", "EcoreUtilDoc");
		createDoc(emoflon, "TGG_doc", "TGGDoc");
		createDoc(ibex, "IPM_doc", "IPMDoc");
		createDoc(cmoflon, "GT_doc", "GTDoc");
	}
	
	public Doc createDoc(Folder f, String name, String content) {
		Doc doc = SimpleDocFactory.eINSTANCE.createDoc();
		doc.setName(name);
		doc.setContent(content);
		f.getDocs().add(doc);
		return doc;
	}
	
	public Folder createFolder(Folder f, String name) {
		Folder folder = SimpleDocFactory.eINSTANCE.createFolder();
		folder.setName(name);
		f.getSubFolders().add(folder);
		return folder;
	}
	
	public void fillContents(Folder f) {
		for(Doc d : f.getDocs()) {
			if(d.getContent() != null) 
				continue;
			
			d.setContent(d.getName().replace("_doc", "") + "Doc");
		}
		f.getSubFolders().stream().forEach(p -> fillContents(p));
	}
	
	public void rename(Folder rootF, String oldName, String newName) {
		if(rootF.getName().equals(oldName)) {
			rootF.setName(newName);
		}
		rootF.getSubFolders().stream().forEach(sf -> rename(sf, oldName, newName));
		rootF.getDocs().stream().filter(d -> d.getName().equals(oldName + "_doc")).forEach(d -> d.setName(newName + "_doc"));
	}
	
	public void moveFolder(Folder root, String parentName, String childName) {
		Folder parent = getFolder(root, parentName);
		Folder child = getFolder(root, childName);
		Folder oldParent = (Folder) child.eContainer();
		oldParent.getSubFolders().remove(child);
		parent.getSubFolders().add(child);
	}
	
	public void moveDoc(Folder root, String parentName, String docName) {
		Folder parent = getFolder(root, parentName);
		Doc doc = getDoc(root, docName);
		parent.getDocs().add(doc);
	}
	
	public Folder getFolder(Folder root, String name) {
		if(root.getName().equals(name)) {
			return root;
		}
		for(Folder f : root.getSubFolders())
			return getFolder(f, name);
		return null;
	}
	
	public Doc getDoc(Folder root, String name) {
		for(Doc d : root.getDocs())
			if(d.getName().equals(name))
				return d;
		
		for(Folder f : root.getSubFolders())
			return getDoc(f, name);
		return null;
	}
}

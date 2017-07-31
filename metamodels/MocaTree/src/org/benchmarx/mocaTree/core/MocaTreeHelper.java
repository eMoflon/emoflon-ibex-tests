package org.benchmarx.mocaTree.core;

import MocaTree.File;
import MocaTree.Folder;
import MocaTree.MocaTreeFactory;
import MocaTree.Node;

public class MocaTreeHelper {

	public void createSubFolder(Folder f, String name, int index) {
		Folder subFolder = MocaTreeFactory.eINSTANCE.createFolder();
		f.getSubFolder().add(subFolder);
		subFolder.setName(name);
		subFolder.setIndex(index);
	}

	public void createFile(Folder f, String name, int index) {
		Folder subFolder = f.getSubFolder().get(index);
		File file = MocaTreeFactory.eINSTANCE.createFile();
		subFolder.getFile().add(file);
		file.setName(name);
	}

	public void createRootNode(Folder f, String name, int index, int subIndex) {
		File file = f.getSubFolder().get(index).getFile().get(subIndex);
		Node rootNode = MocaTreeFactory.eINSTANCE.createNode();
		file.setRootNode(rootNode);
		rootNode.setName(name);
	}

	public void createSubNode(Folder f, String name, int index, int subIndex) {
		Node node = f.getSubFolder().get(index).getFile().get(subIndex).getRootNode();
		Node subNode = MocaTreeFactory.eINSTANCE.createNode();
		node.getChildren().add(subNode);
		subNode.setName(name);
	}

	public void createSubSubNode(Folder f, String name, int index, int subIndex, int subSubIndex) {
		Node node = (Node)f.getSubFolder().get(index).getFile().get(subIndex).getRootNode().getChildren().get(subSubIndex);
		Node subSubNode = MocaTreeFactory.eINSTANCE.createNode();
		node.getChildren().add(subSubNode);
		subSubNode.setName(name);
	}

}

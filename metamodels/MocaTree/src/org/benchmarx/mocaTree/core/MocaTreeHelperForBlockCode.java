package org.benchmarx.mocaTree.core;

import MocaTree.File;
import MocaTree.MocaTreeFactory;
import MocaTree.Node;

public class MocaTreeHelperForBlockCode {

	public void createBlockNode(File f, String name) {
		Node blocks = (Node)f.getRootNode().getChildren().get(0);
		Node blockNode = MocaTreeFactory.eINSTANCE.createNode();
		blocks.getChildren().add(blockNode);
		blockNode.setName(name);
	}

	public void createPortNode(File f, String name, int index) {
		Node blocks = (Node)f.getRootNode().getChildren().get(0);
		Node block = (Node)blocks.getChildren().get(index);
		Node portNode = MocaTreeFactory.eINSTANCE.createNode();
		block.getChildren().add(portNode);
		portNode.setName(name);
	}

	public void createWireNodes(File f, String node1Name, String node2Name) {
		Node mappings = (Node)f.getRootNode().getChildren().get(1);
		Node node1 = MocaTreeFactory.eINSTANCE.createNode();
		mappings.getChildren().add(node1);
		node1.setName(node1Name);
		Node node2 = MocaTreeFactory.eINSTANCE.createNode();
		node1.getChildren().add(node2);
		node2.setName(node2Name);
	}
	
	
}

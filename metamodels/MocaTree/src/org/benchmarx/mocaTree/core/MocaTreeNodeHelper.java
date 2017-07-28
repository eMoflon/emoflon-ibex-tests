package org.benchmarx.mocaTree.core;

import MocaTree.Attribute;
import MocaTree.File;
import MocaTree.MocaTreeFactory;
import MocaTree.Node;

public class MocaTreeNodeHelper {

	public void createBlockNode(File f, String name) {
		Node blockNode = MocaTreeFactory.eINSTANCE.createNode();
		f.getRootNode().getChildren().add(blockNode);
		blockNode.setName("Block");

		Attribute attr = MocaTreeFactory.eINSTANCE.createAttribute();
		blockNode.getAttribute().add(attr);
		attr.setName("id");
		attr.setValue(name);
	}

	public void createPortNodeInFirstBlockNode(File f, String portType, String name) {
		createPortNodeInBlockNode(f, portType, name, 0);
	}

	public void createPortNodeInBlockNode(File f, String portType, String name, int index) {
		Node portNode = MocaTreeFactory.eINSTANCE.createNode();
		((Node)f.getRootNode().getChildren().get(index)).getChildren().add(portNode);
		portNode.setName(portType);

		Attribute attr = MocaTreeFactory.eINSTANCE.createAttribute();
		portNode.getAttribute().add(attr);
		attr.setName("id");
		attr.setValue(name);
	}

	public void createConnectorNodeBetweenFirstTwoBlockNodes(File f) {
		Node provideBlock = (Node)f.getRootNode().getChildren().get(0);
		Node requireBlock = (Node)f.getRootNode().getChildren().get(1);
		
		Node connectorNode = MocaTreeFactory.eINSTANCE.createNode();
		((Node)requireBlock.getChildren().get(0)).getChildren().add(connectorNode);
		connectorNode.setName("CONNECTOR");

		Attribute blockAttr = MocaTreeFactory.eINSTANCE.createAttribute();
		connectorNode.getAttribute().add(blockAttr);
		blockAttr.setName("block");
		blockAttr.setIndex(1);
		blockAttr.setValue(provideBlock.getAttribute().get(0).getValue());

		Attribute portAttr = MocaTreeFactory.eINSTANCE.createAttribute();
		connectorNode.getAttribute().add(portAttr);
		portAttr.setName("port");
		portAttr.setValue(((Node)provideBlock.getChildren().get(0)).getAttribute().get(0).getValue());
	}

}

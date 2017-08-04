package testsuite1.VHDLTGGCodeAdapter.sync.util;

import MocaTree.File;
import MocaTree.MocaTreeFactory;
import MocaTree.Node;

public class MocaTreeHelper {

	public void createGateAndEntityNodes(File f) {
		Node gate = MocaTreeFactory.eINSTANCE.createNode();
		f.getRootNode().getChildren().add(gate);
		gate.setName("GATE");
		gate.setIndex(0);
		
		Node entity = MocaTreeFactory.eINSTANCE.createNode();
		f.getRootNode().getChildren().add(entity);
		entity.setName("ENTITY");
		entity.setIndex(1);
	}

	public void createGateNode(File f, String name) {
		Node gates = (Node)f.getRootNode().getChildren().get(0);
		Node gateNode = MocaTreeFactory.eINSTANCE.createNode();
		gates.getChildren().add(gateNode);
		gateNode.setName(name);
	}

	public void createEntityNode(File f, String name) {
		Node entities = (Node)f.getRootNode().getChildren().get(1);
		Node entityNode = MocaTreeFactory.eINSTANCE.createNode();
		entities.getChildren().add(entityNode);
		entityNode.setName(name);
	}

}

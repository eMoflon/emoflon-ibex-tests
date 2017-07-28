package org.benchmarx.blockDiagram.core;

import BlockDiagram.Block;
import BlockDiagram.BlockDiagramFactory;
import BlockDiagram.BlockSystem;
import BlockDiagram.Connector;
import BlockDiagram.Provide;
import BlockDiagram.Require;

public class BlockDiagramHelper {

	public void createBlock(BlockSystem p, String id) {
		Block block = BlockDiagramFactory.eINSTANCE.createBlock();
		p.getBlocks().add(block);
		block.setId(id);
	}

	public void createProvidePortInFirstBlock(BlockSystem p, String id) {
		Provide port = BlockDiagramFactory.eINSTANCE.createProvide();
		p.getBlocks().get(0).getPorts().add(port);
		port.setId(id);
	}

	public void createRequirePortInFirstBlock(BlockSystem p, String id) {
		createRequirePortInBlock(p, id, 0);
	}

	public void createRequirePortInBlock(BlockSystem p, String id, int i) {
		Require port = BlockDiagramFactory.eINSTANCE.createRequire();
		p.getBlocks().get(i).getPorts().add(port);
		port.setId(id);
	}


	public void createConnectorBetweenFirstTwoBlocks(BlockSystem p) {
		Provide prov = (Provide)p.getBlocks().get(0).getPorts().get(0);
		Require req = (Require)p.getBlocks().get(1).getPorts().get(0);
		
		Connector connector = BlockDiagramFactory.eINSTANCE.createConnector();
		req.setConnector(connector);
		connector.setPub(prov);
	}
}

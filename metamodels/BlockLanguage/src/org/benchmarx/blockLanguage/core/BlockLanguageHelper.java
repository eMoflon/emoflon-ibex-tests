package org.benchmarx.blockLanguage.core;

import BlockLanguage.Block;
import BlockLanguage.BlockLanguageFactory;
import BlockLanguage.Port;
import BlockLanguage.Specification;
import BlockLanguage.Wire;

public class BlockLanguageHelper {

	public void createBlock(Specification s, String name) {
		Block block = BlockLanguageFactory.eINSTANCE.createBlock();
		s.getBlocks().add(block);
		block.setName(name);
	}

	public void createPort(Specification s, int id, int index) {
		Port port = BlockLanguageFactory.eINSTANCE.createPort();
		s.getBlocks().get(index).getPorts().add(port);
		port.setId(id);
	}

	public void createWire(Specification s, int fromBlock, int fromPortIndex, int toBlock, int toPortIndex) {
		Port fromPort = s.getBlocks().get(fromBlock).getPorts().get(fromPortIndex);
		Port toPort = s.getBlocks().get(toBlock).getPorts().get(toPortIndex);
		Wire wire = BlockLanguageFactory.eINSTANCE.createWire();
		fromPort.getWire().add(wire);
		wire.setPort(toPort);
	}

}

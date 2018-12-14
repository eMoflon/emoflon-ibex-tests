package org.benchmarx.vhdlModel.core;

import VHDLModel.CompositeBlock;
import VHDLModel.InputPort;
import VHDLModel.NotGate;
import VHDLModel.OutputPort;
import VHDLModel.VHDLModelFactory;
import VHDLModel.VHDLSpecification;

public class VHDLModelHelper {

	public void createSth(VHDLSpecification spec) {
		
	}

	public void createTopLevelBlock(VHDLSpecification v, String name) {
		CompositeBlock block = VHDLModelFactory.eINSTANCE.createCompositeBlock();
		v.getBlocks().add(block);
		block.setName(name);
	}

	public void createNotGate(VHDLSpecification v) {
		CompositeBlock parentBlock = v.getBlocks().get(0);
		NotGate gate = VHDLModelFactory.eINSTANCE.createNotGate();
		parentBlock.getBlocks().add(gate);

		OutputPort gateOutPort = VHDLModelFactory.eINSTANCE.createOutputPort();
		gate.setOutputport(gateOutPort);
		gateOutPort.setBlock(gate);
		gateOutPort.setName("NOT.out");

		InputPort gateInPort = VHDLModelFactory.eINSTANCE.createInputPort();
		gate.setInputport(gateInPort);
		gate.getInputs().add(gateInPort);
		gateInPort.setBlock(gate);
		gateInPort.setName("NOT.in");

		OutputPort blockOutPort = VHDLModelFactory.eINSTANCE.createOutputPort();
		parentBlock.getPorts().add(blockOutPort);
		blockOutPort.setBlock(parentBlock);
		blockOutPort.setName("ExternalOutput");

		InputPort blockInPort = VHDLModelFactory.eINSTANCE.createInputPort();
		parentBlock.getPorts().add(blockInPort);
		parentBlock.getInputs().add(blockInPort);
		blockInPort.setBlock(parentBlock);
		blockInPort.setName("ExternalInput");

		blockOutPort.setSrc(gateOutPort);
		gateInPort.setSrc(blockInPort);
	}
}

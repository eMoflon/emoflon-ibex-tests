package org.benchmarx.itLanguage.core;

import ITLanguage.IT;
import ITLanguage.ITLanguageFactory;
import ITLanguage.Laptop;
import ITLanguage.Network;
import ITLanguage.PC;
import ITLanguage.Router;

public class ITLanguageHelper {
	
	public void createRouterOnFirstNetwork(IT i, String name) {
		Network network = i.getNetwork().get(0);
		Router router = ITLanguageFactory.eINSTANCE.createRouter();
		i.getRouter().add(router);
		router.setName(name);
		router.setNetwork(network);
	}

	public void createEmptyNetwork(IT i, String name) {
		Network network = ITLanguageFactory.eINSTANCE.createNetwork();
		i.getNetwork().add(network);
		network.setName(name);
	}

	public void createLaptopOnFirstNetwork(IT i, String name) {
		Network network = i.getNetwork().get(0);
		Laptop laptop = ITLanguageFactory.eINSTANCE.createLaptop();
		network.getLaptop().add(laptop);
		laptop.setName(name);
	}

	public void createPCOnFirstNetwork(IT i, String name) {
		Network network = i.getNetwork().get(0);
		PC pc = ITLanguageFactory.eINSTANCE.createPC();
		network.getPc().add(pc);
		pc.setName(name);
	}

}

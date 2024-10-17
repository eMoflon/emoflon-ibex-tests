package org.emoflon.ibex.gt.testsuite.MESystem;

import static org.junit.jupiter.api.Assertions.*;

import mESystem.COLOR;
import mesystem.gt.api.GtGtApi;
import org.junit.jupiter.api.Test;

public class MESystemTest extends MESystemAbstractTest {
	
	@Test
	public void constructHospital1() {
		GtGtApi<?> api = this.initEmpty("MESystemConstruction1.xmi");
		
		// Check axiomatic rule (rules with green(++) elements only) with NACs
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		
		terminate(api);
	}
	
	
	@Test
	//One NAC Test(max 5 cores)
	public void checkFindCoresOfMESystem() {
		GtGtApi<?> api = this.initEmpty("checkFindCoresOfMESystem.xmi");
		
		// Check axiomatic rule (rules with green(++) elements only) with NACs
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.core());
		
		assertMatchCount(3, api.findAllCores());
		
		terminate(api);
	}
	
	@Test
	//One NAC Test(max 5 cores)
	public void checkFindCoresOfMESystem2() {
		GtGtApi<?> api = this.initEmpty("checkFindCoresOfMESystem2.xmi");
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		
		//max core count
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.core());
		
		assertMatchCount(5, api.findAllCores());
		
		terminate(api);
	}
	
	@Test
	//One NAC Test(max 5 cores)
	public void checkCoresOfMESystemNACWithoutLocal() {
		GtGtApi<?> api = this.initEmpty("checkCoresOfMESystemNACWithoutLocal.xmi");
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		
		//max core count
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.core());
		
		//find 5 cores
		assertMatchCount(5, api.findCore());
		
		//6 cores not possible
		assertNotApplicable(api.core());
		
		terminate(api);
	}
	
	//Test disables because of missing application of rules in top class
	/*@Test
	//Two NAC + NAC in refined rule Test(max 5 cables on core and max 1 different cable type)
	public void checkDenseCablesOnCoreNACAllLocal() {
		GtGtApi<?> api = this.initEmpty("checkDenseCablesOnCoreNACAllLocal.xmi");
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		assertApplicableAndApply(api.core());
		
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		
		//find 5 densecables
		assertMatchCount(5, api.findCableOnCore());
		
		//6 cables should not possible
		assertNotApplicable(api.denseCable());
		
		terminate(api);
	}
	
	@Test
	//Two NAC + NAC in refined rule Test(max 5 cables on core and max 1 different cable type)
	public void checkSmartCablesOnCoreNACAllLocal() {
		GtGtApi<?> api = this.initEmpty("checkSmartCablesOnCoreNACAllLocal.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		assertApplicableAndApply(api.core());
		
		assertApplicableAndApply(api.smartCable());
		assertApplicableAndApply(api.smartCable());
		assertApplicableAndApply(api.smartCable());
		assertApplicableAndApply(api.smartCable());
		assertApplicableAndApply(api.smartCable());
		
		//find 5 smartcables
		assertMatchCount(5, api.findCableOnCore());
		
		//6 cables should be not possible
		assertNotApplicable(api.smartCable());
		
		terminate(api);
	}*/
	
	@Test
	//Two NAC + NAC in refined rule Test(max 5 cables on core and max 1 different cable type)
	public void checkCablesOnCoreNACWithoutLocal() {
		GtGtApi<?> api = this.initEmpty("checkCablesOnCoreNACWithoutLocal.xmi");
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		assertApplicableAndApply(api.core());
		
		assertApplicableAndApply(api.smartCable());
		assertApplicableAndApply(api.smartCable());
		
		//find 2 smartcables
		assertMatchCount(2, api.findCableOnCore());
		
		//only one type of cable per core
		assertNotApplicable(api.denseCable());
		
		terminate(api);
	}
	
	@Test
	//Two NAC + NAC in refined rule Test(max 5 cables on core and max 1 different cable type)
	public void checkCablesOnCoreNACWithoutLocal2() {
		GtGtApi<?> api = this.initEmpty("checkCablesOnCoreNACWithoutLocal2.xmi");
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		assertApplicableAndApply(api.core());
		
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		
		//find 2 smartcables
		assertMatchCount(2, api.findCableOnCore());
		
		//only one type of cable per core
		assertNotApplicable(api.smartCable());
		
		terminate(api);
	}
	
	@Test
	//Three NAC + NAC in refined rule Test(max 5 busses on cable)
	public void checkBussesOnCableWithoutLocal() {
		GtGtApi<?> api = this.initEmpty("checkBussesOnCableWithoutLocal.xmi");
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.bus());
		}
		
		//find 10 buses
		assertMatchCount(10, api.findBusOnCable());
		
		//only 5 busses per cable
		assertNotApplicable(api.bus());
		
		terminate(api);
	}
	
	//Tests as the one aboth for 2 different interfaces but disabled due to top class constraint not checked
	/*@Test
	//Three NAC + NAC in refined rule Test(max 5 terminals on cable and max 1 different interface type)
	public void checkTerminalOnCableWithLocal() {
		GtGtApi<?> api = this.initEmpty("checkTerminalOnCableWithLocal.xmi");
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		
		for(int i = 0; i < 6; i++) {
			assertApplicableAndApply(api.terminal());
		}
		
		//find 5 terminals
		assertMatchCount(6, api.findTerminalOnCable());
		
		//only 5 terminals per cable
		assertNotApplicable(api.terminal());
		
		terminate(api);
	}
	
	@Test
	//Three NAC + NAC in refined rule Test(max 5 meinterfaces on cable and max 1 different interface type)
	public void checkInterfaceOnCableWithLocal() {
		GtGtApi<?> api = this.initEmpty("checkInterfaceOnCableWithLocal.xmi");
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		
		for(int i = 0; i < 25; i++) {
			assertApplicableAndApply(api.meinterface());
		}
		
		//find 25 interfaces
		assertMatchCount(25, api.findMEInterfaceOnCable());
		
		//max 5 interfaces per cable
		assertNotApplicable(api.meinterface());
		
		terminate(api);
	}*/
	
	@Test
	//Three NAC + NAC in refined rule Test(max 5 terminals on cable and max 1 different interface type)
	public void checkInterfaceOnCableExclusiveWithLocal() {
		GtGtApi<?> api = this.initEmpty("checkInterfaceOnCableExclusiveWithLocal.xmi");
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		
		for(int i = 0; i < 4; i++) {
			assertApplicableAndApply(api.terminal());
		}
		
		//find 5 terminals
		assertMatchCount(4, api.findTerminalOnCable());
		
		//only 5 terminals per cable
		assertNotApplicable(api.meinterface());
		
		terminate(api);
	}
	
	//Disabled due to topclass constraint problem
	/*@Test
	//Three NAC + NAC in refined rule Test(max 5 meinterfaces on cable and max 1 different interface type)
	public void checkInterfaceOnCableExclusiveWithLocal2() {
		GtGtApi<?> api = this.initEmpty("checkInterfaceOnCableExclusiveWithLocal2.xmi");
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		
		for(int i = 0; i < 4; i++) {
			assertApplicableAndApply(api.meinterface());
		}
		
		for(int i = 0; i < 5; i++) {
			assertApplicableAndApply(api.terminal());
		}
		
		//find 25 interfaces
		assertMatchCount(4, api.findMEInterfaceOnCable());
		
		//max 5 interfaces per cable
		assertNotApplicable(api.terminal());
		
		terminate(api);
	}*/
	
	@Test
	//4 NAC + NAC in refined rule Test(max 1 drive per bus)
	public void checkDriveOnBusWithLocal() {
		GtGtApi<?> api = this.initEmpty("checkDriveOnBusWithLocal.xmi");
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.bus());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.drive());
		}
		
		//find 10 buses
		assertMatchCount(10, api.findBusOnCable());
		assertMatchCount(10, api.findDrive());
		
		//only 1 drive per bus
		assertNotApplicable(api.drive());
		
		terminate(api);
	}
	
	@Test
	//5 NAC + 2 NAC in refined rule Test(max 5 storagecells per drive and only 1 of each type)
	public void checkStorageCellInDriveWithLocal() {
		GtGtApi<?> api = this.initEmpty("checkStorageCellInDriveWithLocal.xmi");
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.bus());
		assertApplicableAndApply(api.drive());
		
		assertApplicableAndApply(api.storageCell1K());
		assertApplicableAndApply(api.storageCell16K());
		assertApplicableAndApply(api.storageCell4K());
		assertApplicableAndApply(api.storageCell64K());
		
		//find 1 storageCell of each Type
		assertMatchCount(1, api.find1KStorageCell());
		assertMatchCount(1, api.find16KStorageCell());
		assertMatchCount(1, api.find4KStorageCell());
		assertMatchCount(1, api.find64KStorageCell());
		
		//only 1 Type of each per drive
		assertNotApplicable(api.storageCell1K());
		assertNotApplicable(api.storageCell64K());
		assertNotApplicable(api.storageCell16K());
		assertNotApplicable(api.storageCell4K());
		
		terminate(api);
	}
	
	@Test
	//5 NAC + 2 NAC in refined rule Test(max 5 storagecells per drive and only 1 of each type)
	public void checkStorageCellInDriveExclusiveWithLocal() {
		GtGtApi<?> api = this.initEmpty("checkStorageCellInDriveExclusiveWithLocal.xmi");
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.bus());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.drive());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.storageCell16K());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.storageCell1K());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.storageCell4K());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.storageCell64K());
		}
		
		//find 10 storageCells of each Type
		assertMatchCount(10, api.find1KStorageCell());
		assertMatchCount(10, api.find16KStorageCell());
		assertMatchCount(10, api.find4KStorageCell());
		assertMatchCount(10, api.find64KStorageCell());
		
		//only 1 Type of each per drive
		assertNotApplicable(api.storageCell1K());
		assertNotApplicable(api.storageCell64K());
		assertNotApplicable(api.storageCell16K());
		assertNotApplicable(api.storageCell4K());
		
		terminate(api);
	}
	
	//Disabled due to top class constraint problem
	/*@Test
	//6 NAC + 2 NAC in refined rule Test(max 10 items per storagecells)
	public void checkItemsInStorageWithLocal() {
		GtGtApi<?> api = this.initEmpty("checkItemsInStorageWithLocal.xmi");
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.bus());
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell1K());
		
		assertApplicableAndApply(api.itemInStorage("sand"));
		assertApplicableAndApply(api.itemInStorage("wood"));
		assertApplicableAndApply(api.itemInStorage("plank"));
		assertApplicableAndApply(api.itemInStorage("stick"));
		assertApplicableAndApply(api.itemInStorage("iron"));
		assertApplicableAndApply(api.itemInStorage("gold"));
		assertApplicableAndApply(api.itemInStorage("diamond"));
		assertApplicableAndApply(api.itemInStorage("stone"));
		assertApplicableAndApply(api.itemInStorage("cobblestone"));
		assertApplicableAndApply(api.itemInStorage("birch wood"));
		
		//find 10 items
		assertMatchCount(10, api.find1ItemInStorage());
		
		//only 1 Type of each per drive
		assertNotApplicable(api.itemInStorage());
		
		terminate(api);
	}
	
	@Test
	//6 NAC + 2 NAC in refined rule Test(max 10 items per storagecells)
	public void checkStorageCellInDriveExclusiveWithLocal2() {
		GtGtApi<?> api = this.initEmpty("checkStorageCellInDriveExclusiveWithLocal2.xmi");
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.bus());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.drive());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.storageCell16K());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.storageCell1K());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.storageCell4K());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.storageCell64K());
		}
		
		//find 10 storageCells of each Type
		assertMatchCount(10, api.find1KStorageCell());
		assertMatchCount(10, api.find16KStorageCell());
		assertMatchCount(10, api.find4KStorageCell());
		assertMatchCount(10, api.find64KStorageCell());
		
		//only 1 Type of each per drive
		assertNotApplicable(api.storageCell1K());
		assertNotApplicable(api.storageCell64K());
		assertNotApplicable(api.storageCell16K());
		assertNotApplicable(api.storageCell4K());
		
		terminate(api);
	}*/
	
	@Test
	//6 NAC + 2 PAC + 1 Variable constraint Test(max 9 items, no recipe with same name, max 5 recipes per terminal, enforce that there is at least one drive and 1 storage cell)
	public void checkRecipeWithVariableConstrainWithLocal() {
		GtGtApi<?> api = this.initEmpty("checkRecipeWithVariableConstrainWithLocal.xmi");
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.bus());
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell1K());
		assertApplicableAndApply(api.meinterface());
		assertApplicableAndApply(api.terminal());
		
		assertApplicableAndApply(api.recipe("wood", 4, 0));
		assertApplicableAndApply(api.recipe("chair", 6, 0));
		assertApplicableAndApply(api.recipe("table", 4, 0));
		assertApplicableAndApply(api.recipe("tree", 7, 0));
		assertApplicableAndApply(api.recipe("hello", 8, 0));
		
		//find recipe
		assertMatchCount(5, api.findRecipe());
		
		//only 1 Type of each per drive
		assertNotApplicable(api.recipe("stick", 4, 0));
		
		terminate(api);
	}
	
	@Test
	//6 NAC + 2 NAC in refined rule Test(max 10 items per storagecells)
	public void checkItemsInStorageCellConstrainWithLocal() {
		GtGtApi<?> api = this.initEmpty("checkItemsInStorageCellConstrainWithLocal.xmi");
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.bus());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.drive());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.storageCell16K());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.storageCell1K());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.storageCell4K());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.storageCell64K());
		}
		
		//find 10 storageCells of each Type
		assertMatchCount(10, api.find1KStorageCell());
		assertMatchCount(10, api.find16KStorageCell());
		assertMatchCount(10, api.find4KStorageCell());
		assertMatchCount(10, api.find64KStorageCell());
		
		//only 1 Type of each per drive
		assertNotApplicable(api.storageCell1K());
		assertNotApplicable(api.storageCell64K());
		assertNotApplicable(api.storageCell16K());
		assertNotApplicable(api.storageCell4K());
		
		terminate(api);
	}
	
	@Test
	//6 NAC + 2 NAC in refined rule Test(max 10 items per storagecells)
	public void checkItemsInStorageCellConstrainWithLocal2() {
		GtGtApi<?> api = this.initEmpty("checkItemsInStorageCellConstrainWithLocal2.xmi");
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		
		for(int i = 0; i < 50; i++) {
			assertApplicableAndApply(api.bus());
		}
		
		for(int i = 0; i < 50; i++) {
			assertApplicableAndApply(api.drive());
		}
		
		for(int i = 0; i < 50; i++) {
			assertApplicableAndApply(api.storageCell16K());
		}
		
		for(int i = 0; i < 50; i++) {
			assertApplicableAndApply(api.storageCell1K());
		}
		
		for(int i = 0; i < 50; i++) {
			assertApplicableAndApply(api.storageCell4K());
		}
		
		for(int i = 0; i < 50; i++) {
			assertApplicableAndApply(api.storageCell64K());
		}
		
		//find 10 storageCells of each Type
		assertMatchCount(50, api.find1KStorageCell());
		assertMatchCount(50, api.find16KStorageCell());
		assertMatchCount(50, api.find4KStorageCell());
		assertMatchCount(50, api.find64KStorageCell());
		
		//only 1 Type of each per drive
		assertNotApplicable(api.storageCell1K());
		assertNotApplicable(api.storageCell64K());
		assertNotApplicable(api.storageCell16K());
		assertNotApplicable(api.storageCell4K());
		
		terminate(api);
	}
	
	@Test
	//6 NAC + 2 NAC in refined rule Test(max 10 items per storagecells)
	public void checkItemsInStorageCellConstrainExclusiveWithLocal() {
		GtGtApi<?> api = this.initEmpty("checkItemsInStorageCellConstrainExclusiveWithLocal.xmi");
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		
		assertApplicableAndApply(api.bus());
		assertApplicableAndApply(api.bus());
		assertApplicableAndApply(api.bus());
		
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell16K());
		assertApplicableAndApply(api.storageCell1K());
		assertApplicableAndApply(api.storageCell4K());
		assertApplicableAndApply(api.storageCell64K());
		assertApplicableAndApply(api.storageCell16K());
		assertApplicableAndApply(api.storageCell1K());
		assertApplicableAndApply(api.storageCell4K());
		assertApplicableAndApply(api.storageCell64K());
		assertApplicableAndApply(api.storageCell16K());
		assertApplicableAndApply(api.storageCell1K());
		assertApplicableAndApply(api.storageCell4K());
		assertApplicableAndApply(api.storageCell64K());
		assertApplicableAndApply(api.itemInStorage("wood"));
		
		for(int i = 0; i < 100; i++) {
			assertApplicableAndApply(api.itemInStorage("wood"));
		}
		
		//find 1 storageCells of each Type
		assertMatchCount(3, api.find1KStorageCell());
		assertMatchCount(3, api.find16KStorageCell());
		assertMatchCount(3, api.find4KStorageCell());
		assertMatchCount(3, api.find64KStorageCell());
		
		//only 1 Type of each per drive
		assertNotApplicable(api.storageCell1K());
		assertNotApplicable(api.storageCell64K());
		assertNotApplicable(api.storageCell16K());
		assertNotApplicable(api.storageCell4K());
		
		terminate(api);
	}
	
	/*@Test
	//6 NAC + 2 NAC in refined rule Test(max 10 items per storagecells)
	public void checkItemsInStorageCellConstrainExclusiveWithLocal2() {
		GtGtApi<?> api = this.initEmpty("checkItemsInStorageCellConstrainExclusiveWithLocal2.xmi");
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.bus());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.drive());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.storageCell16K());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.storageCell1K());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.storageCell4K());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.storageCell64K());
		}
		for(int i = 0; i < 100; i++) {
			assertApplicableAndApply(api.item("wood"));
		}
		
		//find 10 storageCells of each Type
		assertMatchCount(10, api.find1KStorageCell());
		assertMatchCount(10, api.find16KStorageCell());
		assertMatchCount(10, api.find4KStorageCell());
		assertMatchCount(10, api.find64KStorageCell());
		
		//only 1 Type of each per drive
		assertNotApplicable(api.storageCell1K());
		assertNotApplicable(api.storageCell64K());
		assertNotApplicable(api.storageCell16K());
		assertNotApplicable(api.storageCell4K());
		
		terminate(api);
	}*/
	
	@Test
	//6 NAC + 2 NAC in refined rule Test(max 10 items per storagecells)
	public void checkItemsInStorageCellConstrainExclusiveWithLocal3() {
		GtGtApi<?> api = this.initEmpty("checkItemsInStorageCellConstrainExclusiveWithLocal3.xmi");
		
		assertMatchCount(1, api.mesystem());
		assertApplicableAndApply(api.mesystem());
		assertNotApplicable(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.bus());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.drive());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.storageCell16K());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.storageCell1K());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.storageCell4K());
		}
		
		for(int i = 0; i < 10; i++) {
			assertApplicableAndApply(api.storageCell64K());
		}
		
		//find 10 storageCells of each Type
		assertMatchCount(10, api.find1KStorageCell());
		assertMatchCount(10, api.find16KStorageCell());
		assertMatchCount(10, api.find4KStorageCell());
		assertMatchCount(10, api.find64KStorageCell());
		
		//only 1 Type of each per drive
		assertNotApplicable(api.storageCell1K());
		assertNotApplicable(api.storageCell64K());
		assertNotApplicable(api.storageCell16K());
		assertNotApplicable(api.storageCell4K());
		
		terminate(api);
	}
	
	
}

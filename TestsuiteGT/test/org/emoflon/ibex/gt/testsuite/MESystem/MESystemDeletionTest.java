package org.emoflon.ibex.gt.testsuite.MESystem;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import mesystem.gt.api.GtGtApi;

public class MESystemDeletionTest extends MESystemAbstractTest {

	@Disabled
	@Test
	public void deleteStorageCellTest() {
		GtGtApi<?> api = this.initEmpty("StorageCellDeletion.xmi");

		assertApplicableAndApply(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.bus());
		assertApplicableAndApply(api.drive());

		assertApplicableAndApply(api.storageCell16K());

		for (int i = 0; i < 5; i++) {
			assertApplicableAndApply(api.itemInStorage("Item" + i));
		}

		// StorageCells exist
		assertMatchCount(1, api.findStorageCell());

		assertApplicableAndApply(api.deleteStorageCell());

		// StorageCell has been deleted
		assertMatchCount(0, api.findStorageCell());
		terminate(api);
	}

	/*
	 * @Test public void deleteStorageCellsTest() { GtGtApi<?> api =
	 * this.initEmpty("StorageCellsDeletion.xmi");
	 * 
	 * assertApplicableAndApply(api.mesystem());
	 * 
	 * for (int i = 0; i < 4; i++) { assertApplicableAndApply(api.core());
	 * assertApplicableAndApply(api.denseCable());
	 * assertApplicableAndApply(api.bus()); assertApplicableAndApply(api.drive());
	 * assertApplicableAndApply(api.storageCell16K()); }
	 * 
	 * for (int i = 0; i < 4; i++) { for (int j = 0; j < 100; j++) {
	 * assertApplicableAndApply(api.itemInStorage("Item_" + i + "_" + j)); } }
	 * 
	 * for (int i = 0; i < 3; i++) {
	 * assertApplicableAndApply(api.deleteStorageCell()); }
	 * 
	 * assertMatchCount(1, api.findStorageCell());
	 * 
	 * for (int i = 0; i < 3; i++) { assertApplicableAndApply(api.storageCell16K());
	 * }
	 * 
	 * assertMatchCount(4, api.findStorageCell());
	 * 
	 * terminate(api); }
	 */

	@Test
	public void deleteCoreTest() {
		GtGtApi<?> api = this.initEmpty("CoreDeletion.xmi");

		assertApplicableAndApply(api.mesystem());
		assertApplicableAndApply(api.core());

		assertApplicableAndApply(api.deleteCore());

		assertMatchCount(0, api.findCore());

		terminate(api);
	}

	/*
	 * @Test public void deleteCoresTest() { GtGtApi<?> api =
	 * this.initEmpty("CoresDeletion.xmi");
	 * 
	 * for (int i = 0; i < 4; i++) { assertApplicableAndApply(api.mesystem());
	 * assertApplicableAndApply(api.core());
	 * assertApplicableAndApply(api.denseCable());
	 * assertApplicableAndApply(api.smartCable());
	 * assertApplicableAndApply(api.bus());
	 * assertApplicableAndApply(api.terminal()); }
	 * 
	 * // failed to create more cores assertNotApplicable(api.core());
	 * 
	 * // delete for (int i = 0; i < 3; i++) {
	 * assertApplicableAndApply(api.deleteCore()); }
	 * 
	 * assertMatchCount(1, api.findCore());
	 * 
	 * for (int i = 0; i < 3; i++) { assertApplicableAndApply(api.core()); }
	 * 
	 * assertNotApplicable(api.core());
	 * 
	 * assertMatchCount(4, api.findCore());
	 * 
	 * terminate(api); }
	 */

	@Test
	public void deleteSmartCableTest() {
		GtGtApi<?> api = this.initEmpty("SmartCableDeletion.xmi");

		assertApplicableAndApply(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.smartCable());

		assertApplicableAndApply(api.deleteSmartCable());

		assertMatchCount(0, api.findSmartCableOnCore());

		terminate(api);
	}

	@Test
	public void deleteDenseCableTest() {
		GtGtApi<?> api = this.initEmpty("DenseCableDeletion.xmi");

		assertApplicableAndApply(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());

		assertApplicableAndApply(api.deleteDenseCable());

		assertMatchCount(0, api.findDenseCableOnCore());

		terminate(api);
	}

	@Test
	public void deleteBusTest() {
		GtGtApi<?> api = this.initEmpty("BusDeletion.xmi");

		assertApplicableAndApply(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.bus());

		assertApplicableAndApply(api.deleteBus());

		assertMatchCount(0, api.findBusOnCable());

		terminate(api);
	}

	/*
	 * @Test public void deleteBussesTest() { GtGtApi<?> api =
	 * this.initEmpty("BussesDeletion.xmi");
	 * 
	 * assertApplicableAndApply(api.mesystem()); for (int i = 0; i < 4; i++) {
	 * assertApplicableAndApply(api.core()); for (int j = 0; j < 4; j++) {
	 * assertApplicableAndApply(api.denseCable()); } }
	 * 
	 * for (int i = 0; i < 256; i++) { assertApplicableAndApply(api.bus()); }
	 * 
	 * assertNotApplicable(api.bus());
	 * 
	 * for (int i = 0; i < 32; i++) { assertApplicableAndApply(api.deleteBus()); }
	 * 
	 * assertMatchCount(224, api.findBusOnCable());
	 * 
	 * for (int i = 0; i < 32; i++) { assertApplicableAndApply(api.bus()); }
	 * 
	 * assertNotApplicable(api.bus());
	 * 
	 * assertMatchCount(256, api.findBusOnCable());
	 * 
	 * terminate(api); }
	 */

	@Test
	public void deleteTerminalTest() {
		GtGtApi<?> api = this.initEmpty("TerminalDeletion.xmi");

		assertApplicableAndApply(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.terminal());

		assertApplicableAndApply(api.deleteTerminal());

		assertMatchCount(0, api.findTerminalOnCable());

		terminate(api);
	}

	/*
	 * @Test public void deleteTerminalsTest() { GtGtApi<?> api =
	 * this.initEmpty("TerminalsDeletion.xmi");
	 * 
	 * assertApplicableAndApply(api.mesystem());
	 * 
	 * for (int i = 0; i < 4; i++) { assertApplicableAndApply(api.core());
	 * 
	 * for (int j = 0; j < 4; j++) { assertApplicableAndApply(api.denseCable()); for
	 * (int k = 0; k < 32; k++) { assertApplicableAndApply(api.terminal()); } } }
	 * 
	 * assertNotApplicable(api.terminal());
	 * 
	 * for (int i = 0; i < 32; i++) {
	 * assertApplicableAndApply(api.deleteTerminal()); }
	 * 
	 * assertMatchCount(224, api.findTerminalOnCable());
	 * 
	 * for (int i = 0; i < 32; i++) { assertApplicableAndApply(api.terminal()); }
	 * 
	 * assertNotApplicable(api.terminal());
	 * 
	 * assertMatchCount(256, api.findTerminalOnCable());
	 * 
	 * terminate(api); }
	 */

	@Test
	public void deleteItemInStorageTest() {
		GtGtApi<?> api = this.initEmpty("ItemInStorageDeletion.xmi");

		assertApplicableAndApply(api.mesystem());
		assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.bus());
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell16K());
		assertApplicableAndApply(api.itemInStorage("ChocolateCake"));

		assertApplicableAndApply(api.deleteItemInStorage("ChocolateCake"));

		assertMatchCount(0, api.find1ItemInStorage());

		terminate(api);
	}

	/*
	 * @Test public void deleteItemsInStorageTest() { GtGtApi<?> api =
	 * this.initEmpty("ItemsInStorageDeletion.xmi");
	 * 
	 * assertApplicableAndApply(api.mesystem());
	 * assertApplicableAndApply(api.core());
	 * assertApplicableAndApply(api.denseCable());
	 * assertApplicableAndApply(api.bus()); assertApplicableAndApply(api.drive());
	 * assertApplicableAndApply(api.storageCell16K());
	 * 
	 * for (int i = 0; i < 100; i++) {
	 * assertApplicableAndApply(api.itemInStorage("Item" + i)); }
	 * 
	 * assertNotApplicable(api.itemInStorage("Item101"));
	 * 
	 * for (int i = 0; i < 10; i++) {
	 * assertApplicableAndApply(api.deleteItemInStorage("Item" + i)); }
	 * 
	 * assertMatchCount(90, api.find1ItemInStorage());
	 * 
	 * // Re-add ItemInStorage entities to the StorageCell for (int i = 0; i < 10;
	 * i++) { assertApplicableAndApply(api.itemInStorage("NewItem" + i)); }
	 * 
	 * assertNotApplicable(api.itemInStorage("Item101"));
	 * 
	 * // Final cleanup check for the number of ItemInStorage entities in the
	 * StorageCell assertMatchCount(100, api.find1ItemInStorage());
	 * 
	 * terminate(api); }
	 */

}

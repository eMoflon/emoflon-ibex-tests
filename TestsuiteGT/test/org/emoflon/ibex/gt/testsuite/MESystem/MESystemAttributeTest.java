package org.emoflon.ibex.gt.testsuite.MESystem;

import static org.junit.jupiter.api.Assertions.*;

import mESystem.COLOR;
import mESystem.Cable;
import mESystem.Item;
import mESystem.Recipe;
import mESystem.StorageCell;
import mESystem.StorageCell16K;
import mesystem.gt.api.GtGtApi;
import org.junit.jupiter.api.Test;


public class MESystemAttributeTest extends MESystemAbstractTest {
	
	//Smaller Tests testing singular attributes
	@Test
    public void testMEInterfaceNameChange() {
        GtGtApi<?> api = this.initEmpty("MEInterfaceNameChange.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        // Create necessary components
        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core());
        assertApplicableAndApply(api.smartCable());
        assertApplicableAndApply(api.meinterface("Interface1"));

        // Change MEInterface name
        assertApplicableAndApply(api.changeMEInterfaceName("Interface1", "NewInterface"));
        assertEquals(1, api.findMEInterfaceByName("NewInterface").countMatches());

        terminate(api);
    }

    @Test
    public void testBusSpeedChange() {
        GtGtApi<?> api = this.initEmpty("BusSpeedChange.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        // Create necessary components
        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core());
        assertApplicableAndApply(api.smartCable());
        assertApplicableAndApply(api.bus("Bus1", 50));

        // Change bus speed
        assertApplicableAndApply(api.changeBusSpeed("Bus1", 100));
        assertEquals(1, api.findBusBySpeed(100).countMatches());

        terminate(api);
    }

    @Test
    public void testRecipeNumOfStepsChange() {
        GtGtApi<?> api = this.initEmpty("RecipeNumOfStepsChange.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        // Create necessary components
        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.bus());
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell1K());
		assertApplicableAndApply(api.meinterface());
		assertApplicableAndApply(api.terminal());
        assertApplicableAndApply(api.recipe("Cake", 3,1));

        // Change number of steps in the recipe
        assertApplicableAndApply(api.changeRecipeNumOfSteps("Cake", 5));
        assertEquals(1, api.findRecipeByNumOfSteps(5).countMatches());

        terminate(api);
    }

    @Test
    public void testItemNameChange() {
        GtGtApi<?> api = this.initEmpty("ItemNameChange.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        // Create necessary components
        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.bus());
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell1K());
		assertApplicableAndApply(api.meinterface());
		assertApplicableAndApply(api.terminal());
        assertApplicableAndApply(api.recipe("Cake", 3,1));
        assertApplicableAndApply(api.item("Flour"));

        // Change item name
        assertApplicableAndApply(api.changeItemName("Flour", "Wheat"));
        assertEquals(1, api.findItemByName("Wheat").countMatches());

        terminate(api);
    }

    @Test
    public void testRecipeItemInStorageChange() {
        GtGtApi<?> api = this.initEmpty("RecipeItemInStorageChange.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        // Create necessary components
        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.bus());
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell1K());
		assertApplicableAndApply(api.meinterface());
		assertApplicableAndApply(api.terminal());
        assertApplicableAndApply(api.recipe("Bread", 5,1));
        assertApplicableAndApply(api.itemInStorage("Sugar"));

        // Change item in storage name
        assertApplicableAndApply(api.changeItemInStorageName("Sugar", "Salt"));
        assertEquals(1, api.findItemInStorageByName("Salt").countMatches());

        terminate(api);
    }

    @Test
    public void testMEInterfaceRecipeChanges() {
        GtGtApi<?> api = this.initEmpty("MEInterfaceRecipeChanges.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        // Create necessary components
        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.bus());
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell1K());
		assertApplicableAndApply(api.meinterface("Interface1"));
		assertApplicableAndApply(api.terminal());
        assertApplicableAndApply(api.recipe("Soup", 4,1));

        // Change MEInterface and Recipe
        assertApplicableAndApply(api.changeMEInterfaceName("Interface1", "UpdatedInterface"));
        assertApplicableAndApply(api.changeRecipeNumOfItems("Soup", 6));

        assertEquals(1, api.findMEInterfaceByName("UpdatedInterface").countMatches());
        assertEquals(1, api.findRecipeByName("Soup").countMatches());

        terminate(api);
    }

    @Test
    public void testCableColorChange() {
        GtGtApi<?> api = this.initEmpty("CableColorChange.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        // Create necessary components
        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core());
        assertApplicableAndApply(api.smartCable());

        // Change cable color
        assertApplicableAndApply(api.changeCableColor(0, COLOR.BLUE));
        assertEquals(1, api.findCableById(0).countMatches());

        terminate(api);
    }

    @Test
    public void testItemWeightChange() {
        GtGtApi<?> api = this.initEmpty("ItemWeightChange.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        // Create necessary components
        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.bus());
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell1K());
		assertApplicableAndApply(api.meinterface());
		assertApplicableAndApply(api.terminal());
        assertApplicableAndApply(api.recipe("Cake", 3,1));
        assertApplicableAndApply(api.item("Sugar"));

        // Change item weight
        assertApplicableAndApply(api.changeItemWeight("Sugar", 150));
        assertEquals(1, api.findItemByWeight(150).countMatches());

        terminate(api);
    }

    @Test
    public void testDenseCableThicknessChange() {
        GtGtApi<?> api = this.initEmpty("DenseCableThicknessChange.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        // Create necessary components
        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core());
        assertApplicableAndApply(api.denseCable("DenseCable1",5, COLOR.GREEN, 4));

        // Change Dense Cable thickness
        assertApplicableAndApply(api.changeDenseCableThickness("DenseCable1", 10));
        assertEquals(1, api.findDenseCableByThickness(10).countMatches());

        terminate(api);
    }

    //Medium Tests changing multiple things
	@Test
    public void testAttributeChanges() {
        GtGtApi<?> api = this.initEmpty("AttributeChange.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core());
        assertApplicableAndApply(api.denseCable());
        assertApplicableAndApply(api.bus());
        assertApplicableAndApply(api.drive());
        assertApplicableAndApply(api.storageCell16K());
        assertApplicableAndApply(api.meinterface());
        assertApplicableAndApply(api.recipe("Bread", 5,1));
        assertApplicableAndApply(api.item("Flour"));
        assertApplicableAndApply(api.itemInStorage("Sugar"));

        assertEquals(1, api.findItemByName("Flour").countMatches());
        assertEquals(1, api.findItemInStorageByName("Sugar").countMatches());

        assertEquals(1, api.findRecipeByName("Bread").countMatches());

        assertApplicableAndApply(api.changeRecipeName("Bread", "Pastry"));
        assertApplicableAndApply(api.changeRecipeNumOfItems("Pastry", 10));
        
        assertApplicableAndApply(api.changeItemName("Flour", "Apple"));
        assertApplicableAndApply(api.changeItemInStorageName("Sugar", "Salt"));

        assertApplicableAndApply(api.changeCableNumOfConnections(0, 10));
        assertApplicableAndApply(api.changeCableMaxConnections(0, 20));
        assertApplicableAndApply(api.changeCableColor(0, COLOR.BLUE));

        
        assertEquals(1, api.findItemByName("Apple").countMatches());
        assertEquals(1, api.findItemInStorageByName("Salt").countMatches());

        assertEquals(1, api.findRecipeByName("Pastry").countMatches());
        assertEquals(1, api.findCableById(0).countMatches());

        terminate(api);
    }   
	
	@Test
    public void testMEInterfaceRecipeItemChanges() {
        GtGtApi<?> api = this.initEmpty("MEInterfaceRecipeItemChanges.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core());
        assertApplicableAndApply(api.smartCable());
        assertApplicableAndApply(api.bus());
        assertApplicableAndApply(api.drive());
        assertApplicableAndApply(api.storageCell16K());
        assertApplicableAndApply(api.meinterface("Interface1"));
        assertApplicableAndApply(api.recipe("Cake", 3,1));
        assertApplicableAndApply(api.item("Sugar"));

        assertApplicableAndApply(api.changeMEInterfaceName("Interface1", "NewInterface"));
        assertApplicableAndApply(api.changeRecipeNumOfItems("Cake", 5));
        assertApplicableAndApply(api.changeItemName("Sugar", "Honey"));

        assertEquals(1, api.findMEInterfaceByName("NewInterface").countMatches());
        assertEquals(1, api.findRecipeByName("Cake").countMatches());
        assertEquals(1, api.findItemByName("Honey").countMatches());

        terminate(api);
    }

    @Test
    public void testDriveBusStorageCellChanges() {
        GtGtApi<?> api = this.initEmpty("DriveBusStorageCellChanges.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core());
        assertApplicableAndApply(api.smartCable());
        assertApplicableAndApply(api.bus("Bus1",1));
        assertApplicableAndApply(api.drive());
        assertApplicableAndApply(api.storageCell16K("Cell1",1));

        assertApplicableAndApply(api.changeBusSpeed("Bus1", 200));
        assertApplicableAndApply(api.changeStorageCellSize("Cell1", 64000));

        assertEquals(1, api.findBusBySpeed(200).countMatches());
        assertEquals(1, api.findStorageCellBySize(64000).countMatches());

        terminate(api);
    }

    @Test
    public void testItemInStorageRecipeSmartCableChanges() {
        GtGtApi<?> api = this.initEmpty("ItemInStorageRecipeSmartCableChanges.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.smartCable("Cable1","Active", COLOR.BLUE,50));
		assertApplicableAndApply(api.bus());
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell1K());
		assertApplicableAndApply(api.meinterface());
        assertApplicableAndApply(api.itemInStorage("Sugar"));
        assertApplicableAndApply(api.recipe("Bread", 5,1));

        assertApplicableAndApply(api.changeItemInStorageName("Sugar", "Salt"));
        assertApplicableAndApply(api.changeRecipeNumOfItems("Bread", 10));
        assertApplicableAndApply(api.changeSmartCableStatus("Cable1", "Inactive"));

        assertEquals(1, api.findItemInStorageByName("Salt").countMatches());
        assertEquals(1, api.findRecipeByName("Bread").countMatches());
        assertEquals(1, api.findSmartCableByStatus("Inactive").countMatches());

        terminate(api);
    }

    @Test
    public void testTerminalDenseCableRecipeChanges() {
        GtGtApi<?> api = this.initEmpty("TerminalDenseCableRecipeChanges.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable("DenseCable1",5,COLOR.BLACK,5));
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.bus());
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell1K());
		assertApplicableAndApply(api.meinterface());
		assertApplicableAndApply(api.terminal("Terminal1"));
        assertApplicableAndApply(api.recipe("Pastry", 3,1));

        assertApplicableAndApply(api.changeTerminalType("Terminal1", "Basic"));
        assertApplicableAndApply(api.changeDenseCableThickness("DenseCable1", 20));
        assertApplicableAndApply(api.changeRecipeNumOfSteps("Pastry", 5));

        assertEquals(1, api.findTerminalByType("Basic").countMatches());
        assertEquals(1, api.findDenseCableByThickness(20).countMatches());
        assertEquals(1, api.findRecipeByNumOfSteps(5).countMatches());

        terminate(api);
    }

    @Test
    public void testCoreStorageCellBusChanges() {
        GtGtApi<?> api = this.initEmpty("CoreStorageCellBusChanges.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core("Core1",50));
        assertApplicableAndApply(api.smartCable());
        assertApplicableAndApply(api.bus("Bus1",50));
        assertApplicableAndApply(api.drive());
        assertApplicableAndApply(api.storageCell16K("Cell1",5));

        assertApplicableAndApply(api.changeCorePowerOutput("Core1", 1500));
        assertApplicableAndApply(api.changeStorageCellSize("Cell1", 128000));
        assertApplicableAndApply(api.changeBusSpeed("Bus1", 300));

        assertEquals(1, api.findCoreByPowerOutput(1500).countMatches());
        assertEquals(1, api.findStorageCellBySize(128000).countMatches());
        assertEquals(1, api.findBusBySpeed(300).countMatches());

        terminate(api);
    }

    @Test
    public void testRecipeItemInStorageDriveChanges() {
        GtGtApi<?> api = this.initEmpty("RecipeItemInStorageDriveChanges.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.bus());
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell1K());
		assertApplicableAndApply(api.meinterface());
		assertApplicableAndApply(api.terminal());
        assertApplicableAndApply(api.itemInStorage("Potato"));
        assertApplicableAndApply(api.recipe("Soup", 4,1));

        assertApplicableAndApply(api.changeRecipeNumOfItems("Soup", 8));
        assertApplicableAndApply(api.changeItemInStorageName("Potato", "Carrot"));

        assertEquals(1, api.findRecipeByName("Soup").countMatches());
        assertEquals(1, api.findItemInStorageByName("Carrot").countMatches());

        terminate(api);
    }
    
    @Test
    public void testCoreSmartCableRecipeChanges() {
        GtGtApi<?> api = this.initEmpty("CoreSmartCableRecipeChanges.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        // Create necessary components
        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core("Core1",50));
        assertApplicableAndApply(api.core("Core2",50));
        assertApplicableAndApply(api.smartCable("SmartCable1","Inactive",COLOR.PINK, 3));
        assertApplicableAndApply(api.meinterface());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.bus());
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell1K());
		assertApplicableAndApply(api.meinterface());
		assertApplicableAndApply(api.terminal());
        assertApplicableAndApply(api.recipe("Cake", 3,1));

        // Change attributes across components
        assertApplicableAndApply(api.changeCorePowerOutput("Core1", 1800));
        assertApplicableAndApply(api.changeSmartCableStatus("SmartCable1", "Active"));
        assertApplicableAndApply(api.changeRecipeNumOfItems("Cake", 8));

        // Assertions
        assertEquals(1, api.findCoreByPowerOutput(1800).countMatches());
        assertEquals(1, api.findSmartCableByStatus("Active").countMatches());
        assertEquals(1, api.findRecipeByName("Cake").countMatches());

        terminate(api);
    }

    @Test
    public void testStorageCellDenseCableChanges() {
        GtGtApi<?> api = this.initEmpty("StorageCellDenseCableChanges.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        // Create necessary components
        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core());
        assertApplicableAndApply(api.denseCable("DenseCable1",5,COLOR.ORANGE,5));
		assertApplicableAndApply(api.bus());
		assertApplicableAndApply(api.drive());
        assertApplicableAndApply(api.storageCell16K("Cell1",1));
        assertApplicableAndApply(api.meinterface());

        // Change storage cell size and dense cable thickness
        assertApplicableAndApply(api.changeStorageCellSize("Cell1", 32000));
        assertApplicableAndApply(api.changeDenseCableThickness("DenseCable1", 15));

        // Assertions
        assertEquals(1, api.findStorageCellBySize(32000).countMatches());
        assertEquals(1, api.findDenseCableByThickness(15).countMatches());

        terminate(api);
    }

    @Test
    public void testMEInterfaceSmartCableItemChanges() {
        GtGtApi<?> api = this.initEmpty("MEInterfaceSmartCableItemChanges.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        // Create necessary components
        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core());
        assertApplicableAndApply(api.smartCable("SmartCable1","Active",COLOR.BLACK,1));
        
		assertApplicableAndApply(api.bus());
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell1K());
		assertApplicableAndApply(api.meinterface("Interface1"));
        assertApplicableAndApply(api.recipe("Soup", 3,1));
        assertApplicableAndApply(api.item("Tomato"));

        // Change MEInterface name, smart cable status, and item name
        assertApplicableAndApply(api.changeMEInterfaceName("Interface1", "HighPerformanceInterface"));
        assertApplicableAndApply(api.changeSmartCableStatus("SmartCable1", "Idle"));
        assertApplicableAndApply(api.changeItemName("Tomato", "Carrot"));

        // Assertions
        assertEquals(1, api.findMEInterfaceByName("HighPerformanceInterface").countMatches());
        assertEquals(1, api.findSmartCableByStatus("Idle").countMatches());
        assertEquals(1, api.findItemByName("Carrot").countMatches());

        terminate(api);
    }

    @Test
    public void testStorageCellSmartCableRecipeItemChanges() {
        GtGtApi<?> api = this.initEmpty("StorageCellSmartCableRecipeItemChanges.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        // Create necessary components
        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core());
        assertApplicableAndApply(api.smartCable("SmartCable1","Active",COLOR.RED,1));
        assertApplicableAndApply(api.smartCable());
		assertApplicableAndApply(api.smartCable());
		assertApplicableAndApply(api.bus());
		assertApplicableAndApply(api.drive());
        assertApplicableAndApply(api.storageCell64K("Cell1",4));
        assertApplicableAndApply(api.meinterface());
        assertApplicableAndApply(api.recipe("Pie", 5,1));
        assertApplicableAndApply(api.item("Sugar"));

        // Change attributes across multiple components
        assertApplicableAndApply(api.changeStorageCellSize("Cell1", 64000));
        assertApplicableAndApply(api.changeSmartCableStatus("SmartCable1", "Operational"));
        assertApplicableAndApply(api.changeRecipeNumOfItems("Pie", 7));
        assertApplicableAndApply(api.changeItemName("Sugar", "BrownSugar"));

        // Assertions
        assertEquals(1, api.findStorageCellBySize(64000).countMatches());
        assertEquals(1, api.findSmartCableByStatus("Operational").countMatches());
        assertEquals(1, api.findRecipeByName("Pie").countMatches());
        assertEquals(1, api.findItemByName("BrownSugar").countMatches());

        terminate(api);
    }

    //Bigger Tests changing numerous attributes
    @Test
    public void testChange5Attributes() {
        GtGtApi<?> api = this.initEmpty("Change5Attributes.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        // Create necessary components
        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core("Core2",50));
        assertApplicableAndApply(api.core("Core1",50));
        assertApplicableAndApply(api.smartCable("SmartCable1","Inactive",COLOR.PINK, 3));
        assertApplicableAndApply(api.meinterface("Interface2"));
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.denseCable());
		assertApplicableAndApply(api.bus());
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell1K());
        assertApplicableAndApply(api.bus());
        assertApplicableAndApply(api.meinterface("Interface1"));
        assertApplicableAndApply(api.recipe("Pie", 5,5));

        // Change 5 attributes
        assertApplicableAndApply(api.changeCorePowerOutput("Core1", 1200));
        assertApplicableAndApply(api.changeSmartCableStatus("SmartCable1", "Active"));
        assertApplicableAndApply(api.changeRecipeNumOfItems("Pie", 8));
        assertApplicableAndApply(api.changeRecipeNumOfSteps("Pie", 3));
        assertApplicableAndApply(api.changeMEInterfaceName("Interface1", "NewInterface"));

        // Assert each change
        assertEquals(1, api.findCoreByPowerOutput(1200).countMatches());
        assertEquals(1, api.findSmartCableByStatus("Active").countMatches());
        assertEquals(1, api.findRecipeByName("Pie").countMatches());
        assertEquals(1, api.findRecipeByNumOfSteps(3).countMatches());
        assertEquals(1, api.findMEInterfaceByName("NewInterface").countMatches());

        terminate(api);
    }

    @Test
    public void testChange10Attributes() {
        GtGtApi<?> api = this.initEmpty("Change10Attributes.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        // Create necessary components
        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core("Core2",50));
        assertApplicableAndApply(api.core("Core1",50));
        assertApplicableAndApply(api.smartCable("SmartCable1","Inactive",COLOR.PINK, 3));
        assertApplicableAndApply(api.meinterface("Interface1"));
		assertApplicableAndApply(api.denseCable("DenseCable1", 4, COLOR.PINK, 3));
		assertApplicableAndApply(api.denseCable("DenseCable2", 4, COLOR.PINK, 3));
		assertApplicableAndApply(api.bus("Bus1",6));
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell1K());
        assertApplicableAndApply(api.bus());
        assertApplicableAndApply(api.recipe("Soup", 4,5));
        assertApplicableAndApply(api.item("Carrot"));

        // Change 10 attributes
        assertApplicableAndApply(api.changeCorePowerOutput("Core1", 1500));
        assertApplicableAndApply(api.changeDenseCableThickness("DenseCable1", 12));
        assertApplicableAndApply(api.changeBusSpeed("Bus1", 600));
        assertApplicableAndApply(api.changeMEInterfaceName("Interface1", "MainInterface"));
        assertApplicableAndApply(api.changeRecipeNumOfItems("Soup", 6));
        assertApplicableAndApply(api.changeRecipeNumOfSteps("Soup", 5));
        assertApplicableAndApply(api.changeItemName("Carrot", "Tomato"));
        assertApplicableAndApply(api.changeDenseCableMaxConnections("DenseCable1", 30));
        assertApplicableAndApply(api.changeRecipeName("Soup", "Stew"));

        // Assert each change
        assertEquals(1, api.findCoreByPowerOutput(1500).countMatches());
        assertEquals(1, api.findDenseCableByThickness(12).countMatches());
        assertEquals(1, api.findBusBySpeed(600).countMatches());
        assertEquals(1, api.findMEInterfaceByName("MainInterface").countMatches());
        assertEquals(1, api.findRecipeByName("Stew").countMatches());
        assertEquals(1, api.findRecipeByNumOfItems(6).countMatches());
        assertEquals(1, api.findRecipeByNumOfSteps(5).countMatches());
        assertEquals(1, api.findItemByName("Tomato").countMatches());
        assertEquals(1, api.findDenseCableMaxConnections(30).countMatches());

        terminate(api);
    }

    @Test
    public void testChange15Attributes() {
        GtGtApi<?> api = this.initEmpty("Change15Attributes.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        // Create necessary components
        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core("Core2",50));
        assertApplicableAndApply(api.core("Core1",50));
        assertApplicableAndApply(api.smartCable("SmartCable1","Inactive",COLOR.PINK, 3));
        assertApplicableAndApply(api.meinterface("Interface1"));
		assertApplicableAndApply(api.denseCable("DenseCable1", 4, COLOR.PINK, 3));
		assertApplicableAndApply(api.denseCable("DenseCable2", 4, COLOR.PINK, 3));
		assertApplicableAndApply(api.bus("Bus1",6));
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell1K());
        assertApplicableAndApply(api.bus());
        assertApplicableAndApply(api.recipe("Cake", 6,8));
        assertApplicableAndApply(api.item("Sugar"));
        assertApplicableAndApply(api.itemInStorage("Salt"));

        // Change 15 attributes
        assertApplicableAndApply(api.changeCorePowerOutput("Core1", 2000));
        assertApplicableAndApply(api.changeSmartCableStatus("SmartCable1", "Inactive"));
        assertApplicableAndApply(api.changeBusSpeed("Bus1", 800));
        assertApplicableAndApply(api.changeMEInterfaceName("Interface1", "NewInterface"));
        assertApplicableAndApply(api.changeRecipeNumOfItems("Cake", 7));
        assertApplicableAndApply(api.changeRecipeNumOfSteps("Cake", 4));
        assertApplicableAndApply(api.changeItemName("Sugar", "Honey"));
        assertApplicableAndApply(api.changeItemInStorageName("Salt", "Pepper"));
        assertApplicableAndApply(api.changeSmartCableNumOfConnections("SmartCable1", 15));
        assertApplicableAndApply(api.changeSmartCableColor("SmartCable1", COLOR.BLUE));
        assertApplicableAndApply(api.changeRecipeName("Cake", "Cookie"));
        assertApplicableAndApply(api.changeBusSpeed("Bus1", 1000));
        assertApplicableAndApply(api.changeCorePowerOutput("Core1", 2500));
        assertApplicableAndApply(api.changeBusSpeed("Bus1", 1200));

        // Assert each change
        assertEquals(1, api.findCoreByPowerOutput(2500).countMatches());
        assertEquals(1, api.findSmartCableByStatus("Inactive").countMatches());
        assertEquals(1, api.findBusBySpeed(1200).countMatches());
        assertEquals(1, api.findMEInterfaceByName("NewInterface").countMatches());
        assertEquals(1, api.findRecipeByName("Cookie").countMatches());
        assertEquals(1, api.findRecipeByNumOfItems(7).countMatches());
        assertEquals(1, api.findRecipeByNumOfSteps(4).countMatches());
        assertEquals(1, api.findItemByName("Honey").countMatches());
        assertEquals(1, api.findItemInStorageByName("Pepper").countMatches());
        assertEquals(1, api.findSmartCableNumOfConnections(15).countMatches());
        assertEquals(1, api.findSmartCableByColor(COLOR.BLUE).countMatches());

        terminate(api);
    }

    @Test
    public void testChange20Attributes() {
        GtGtApi<?> api = this.initEmpty("Change20Attributes.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        // Create necessary components
        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core("Core2",50));
        assertApplicableAndApply(api.core("Core1",50));
        assertApplicableAndApply(api.smartCable("SmartCable1","Inactive",COLOR.PINK, 3));
        assertApplicableAndApply(api.meinterface("Interface1"));
		assertApplicableAndApply(api.denseCable("DenseCable1", 4, COLOR.PINK, 3));
		assertApplicableAndApply(api.denseCable("DenseCable2", 4, COLOR.PINK, 3));
		assertApplicableAndApply(api.bus("Bus1",6));
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell1K("Cell1",0));
        assertApplicableAndApply(api.bus());
        assertApplicableAndApply(api.recipe("Salad", 4,4));
        assertApplicableAndApply(api.itemInStorage("Lettuce"));
        assertApplicableAndApply(api.item("Tomato"));
        assertApplicableAndApply(api.item("Lettuce"));
        assertApplicableAndApply(api.storageCell16K("Cell2",2));

        // Change 20 attributes
        assertApplicableAndApply(api.changeCorePowerOutput("Core1", 2000));
        assertApplicableAndApply(api.changeDenseCableThickness("DenseCable1", 15));
        assertApplicableAndApply(api.changeBusSpeed("Bus1", 900));
        assertApplicableAndApply(api.changeMEInterfaceName("Interface1", "AdvancedInterface"));
        assertApplicableAndApply(api.changeRecipeNumOfItems("Salad", 5));
        assertApplicableAndApply(api.changeRecipeNumOfSteps("Salad", 3));
        assertApplicableAndApply(api.changeItemName("Lettuce", "Spinach"));
        assertApplicableAndApply(api.changeItemName("Tomato", "Cucumber"));
        assertApplicableAndApply(api.changeItemInStorageName("Lettuce", "Spinach"));
        assertApplicableAndApply(api.changeSmartCableColor("SmartCable1", COLOR.GREEN));
        assertApplicableAndApply(api.changeBusSpeed("Bus1", 1000));
        assertApplicableAndApply(api.changeStorageCellSize("Cell1", 128000));
        assertApplicableAndApply(api.changeRecipeName("Salad", "GardenSalad"));
        assertApplicableAndApply(api.changeBusSpeed("Bus1", 1200));
        assertApplicableAndApply(api.changeCorePowerOutput("Core1", 2500));
        assertApplicableAndApply(api.changeRecipeNumOfItems("GardenSalad", 6));
        assertApplicableAndApply(api.changeRecipeNumOfSteps("GardenSalad", 4));
        assertApplicableAndApply(api.changeStorageCellSize("Cell1", 256000));

        // Assert each change
        assertEquals(1, api.findCoreByPowerOutput(2500).countMatches());
        assertEquals(1, api.findDenseCableByThickness(15).countMatches());
        assertEquals(1, api.findBusBySpeed(1200).countMatches());
        assertEquals(1, api.findMEInterfaceByName("AdvancedInterface").countMatches());
        assertEquals(1, api.findRecipeByName("GardenSalad").countMatches());
        assertEquals(1, api.findRecipeByNumOfItems(6).countMatches());
        assertEquals(1, api.findRecipeByNumOfSteps(4).countMatches());
        assertEquals(1, api.findItemByName("Spinach").countMatches());
        assertEquals(1, api.findItemByName("Cucumber").countMatches());
        assertEquals(1, api.findSmartCableByColor(COLOR.GREEN).countMatches());
        assertEquals(1, api.findStorageCellBySize(256000).countMatches());

        terminate(api);
    }


    @Test
    public void testChange25Attributes() {
        GtGtApi<?> api = this.initEmpty("Change25Attributes.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        // Create necessary components
        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core("Core2",50));
        assertApplicableAndApply(api.core("Core1",50));
        assertApplicableAndApply(api.smartCable("SmartCable1","Inactive",COLOR.PINK, 3));
        assertApplicableAndApply(api.meinterface("Interface1"));
		assertApplicableAndApply(api.denseCable("DenseCable1", 4, COLOR.PINK, 3));
		assertApplicableAndApply(api.denseCable("DenseCable2", 4, COLOR.PINK, 3));
		assertApplicableAndApply(api.bus("Bus1",6));
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell1K("Cell1",0));
        assertApplicableAndApply(api.bus());
        assertApplicableAndApply(api.recipe("Burger", 5,5));
        assertApplicableAndApply(api.item("Bun"));
        assertApplicableAndApply(api.item("Patty"));
        assertApplicableAndApply(api.itemInStorage("Lettuce"));
        assertApplicableAndApply(api.storageCell64K("Cell2",0));

        // Change 25 attributes
        assertApplicableAndApply(api.changeCorePowerOutput("Core1", 3000));
        assertApplicableAndApply(api.changeSmartCableStatus("SmartCable1", "Idle"));
        assertApplicableAndApply(api.changeBusSpeed("Bus1", 700));
        assertApplicableAndApply(api.changeMEInterfaceName("Interface1", "AdvancedInterface"));
        assertApplicableAndApply(api.changeRecipeNumOfItems("Burger", 7));
        assertApplicableAndApply(api.changeRecipeNumOfSteps("Burger", 4));
        assertApplicableAndApply(api.changeItemName("Bun", "Bread"));
        assertApplicableAndApply(api.changeItemName("Patty", "VeggiePatty"));
        assertApplicableAndApply(api.changeItemInStorageName("Lettuce", "Spinach"));
        assertApplicableAndApply(api.changeSmartCableNumOfConnections("SmartCable1", 10));
        assertApplicableAndApply(api.changeSmartCableColor("SmartCable1", COLOR.ORANGE));
        assertApplicableAndApply(api.changeBusSpeed("Bus1", 850));
        assertApplicableAndApply(api.changeCorePowerOutput("Core1", 3500));
        assertApplicableAndApply(api.changeStorageCellSize("Cell1", 512000));
        assertApplicableAndApply(api.changeRecipeName("Burger", "Sandwich"));
        assertApplicableAndApply(api.changeRecipeNumOfSteps("Sandwich", 5));
        assertApplicableAndApply(api.changeItemName("Bread", "Roll"));
        assertApplicableAndApply(api.changeItemInStorageName("Spinach", "Kale"));
        assertApplicableAndApply(api.changeStorageCellSize("Cell1", 1024000));
        assertApplicableAndApply(api.changeCorePowerOutput("Core1", 4000));
        assertApplicableAndApply(api.changeSmartCableColor("SmartCable1", COLOR.GREEN));
        assertApplicableAndApply(api.changeRecipeNumOfItems("Sandwich", 10));

        // Assert each change
        assertEquals(1, api.findCoreByPowerOutput(4000).countMatches());
        assertEquals(1, api.findSmartCableByStatus("Idle").countMatches());
        assertEquals(1, api.findBusBySpeed(850).countMatches());
        assertEquals(1, api.findMEInterfaceByName("AdvancedInterface").countMatches());
        assertEquals(1, api.findRecipeByName("Sandwich").countMatches());
        assertEquals(1, api.findRecipeByNumOfItems(10).countMatches());
        assertEquals(1, api.findRecipeByNumOfSteps(5).countMatches());
        assertEquals(1, api.findItemByName("Roll").countMatches());
        assertEquals(1, api.findItemInStorageByName("Kale").countMatches());
        assertEquals(1, api.findSmartCableNumOfConnections(10).countMatches());
        assertEquals(1, api.findSmartCableByColor(COLOR.GREEN).countMatches());
        assertEquals(1, api.findStorageCellBySize(1024000).countMatches());

        terminate(api);
    }
    
    @Test
    public void testChange30Attributes() {
        GtGtApi<?> api = this.initEmpty("Change30Attributes.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        // Create necessary components
        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core("Core1",50));
        assertApplicableAndApply(api.core("Core2",50));
        assertApplicableAndApply(api.smartCable("SmartCable1","Inactive",COLOR.PINK, 3));
        assertApplicableAndApply(api.meinterface("Interface1"));
		assertApplicableAndApply(api.denseCable("DenseCable1", 4, COLOR.PINK, 3));
		assertApplicableAndApply(api.denseCable("DenseCable2", 4, COLOR.PINK, 3));
		assertApplicableAndApply(api.bus("Bus1",6));
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell1K("Cell1",1));
        assertApplicableAndApply(api.bus());
        assertApplicableAndApply(api.recipe("Pizza", 6,6));
        assertApplicableAndApply(api.item("Cheese"));
        assertApplicableAndApply(api.item("Sauce"));
        assertApplicableAndApply(api.itemInStorage("Dough"));
        assertApplicableAndApply(api.storageCell16K("Cell2",0));

        // Change 30 attributes
        assertApplicableAndApply(api.changeCorePowerOutput("Core1", 4000));
        assertApplicableAndApply(api.changeDenseCableThickness("DenseCable1", 20));
        assertApplicableAndApply(api.changeBusSpeed("Bus1", 900));
        assertApplicableAndApply(api.changeMEInterfaceName("Interface1", "HighPerformanceInterface"));
        assertApplicableAndApply(api.changeRecipeNumOfItems("Pizza", 8));
        assertApplicableAndApply(api.changeRecipeNumOfSteps("Pizza", 6));
        assertApplicableAndApply(api.changeItemName("Cheese", "Mozzarella"));
        assertApplicableAndApply(api.changeItemName("Sauce", "TomatoSauce"));
        assertApplicableAndApply(api.changeItemInStorageName("Dough", "WheatDough"));
        assertApplicableAndApply(api.changeSmartCableColor("SmartCable1", COLOR.GREEN));
        assertApplicableAndApply(api.changeSmartCableNumOfConnections("SmartCable1", 8));
        assertApplicableAndApply(api.changeStorageCellSize("Cell1", 32000));
        assertApplicableAndApply(api.changeCorePowerOutput("Core1", 4500));
        assertApplicableAndApply(api.changeBusSpeed("Bus1", 1000));
        assertApplicableAndApply(api.changeSmartCableStatus("SmartCable1", "Operational"));
        assertApplicableAndApply(api.changeRecipeName("Pizza", "MargheritaPizza"));
        assertApplicableAndApply(api.changeRecipeNumOfItems("MargheritaPizza", 10));
        assertApplicableAndApply(api.changeRecipeNumOfSteps("MargheritaPizza", 7));
        assertApplicableAndApply(api.changeItemName("Mozzarella", "Cheddar"));
        assertApplicableAndApply(api.changeItemInStorageName("WheatDough", "Sourdough"));
        assertApplicableAndApply(api.changeStorageCellSize("Cell1", 64000));
        assertApplicableAndApply(api.changeCorePowerOutput("Core1", 5000));
        assertApplicableAndApply(api.changeBusSpeed("Bus1", 1100));
        assertApplicableAndApply(api.changeSmartCableStatus("SmartCable1", "Idle"));

        // Assert each change
        assertEquals(1, api.findCoreByPowerOutput(5000).countMatches());
        assertEquals(1, api.findDenseCableByThickness(20).countMatches());
        assertEquals(1, api.findBusBySpeed(1100).countMatches());
        assertEquals(1, api.findMEInterfaceByName("HighPerformanceInterface").countMatches());
        assertEquals(1, api.findRecipeByName("MargheritaPizza").countMatches());
        assertEquals(1, api.findRecipeByNumOfItems(10).countMatches());
        assertEquals(1, api.findRecipeByNumOfSteps(7).countMatches());
        assertEquals(1, api.findItemByName("Cheddar").countMatches());
        assertEquals(1, api.findItemInStorageByName("Sourdough").countMatches());
        assertEquals(1, api.findSmartCableByStatus("Idle").countMatches());
        assertEquals(1, api.findSmartCableNumOfConnections(8).countMatches());
        assertEquals(1, api.findSmartCableByColor(COLOR.GREEN).countMatches());
        assertEquals(1, api.findStorageCellBySize(64000).countMatches());

        terminate(api);
    }

    public class MESystemRepeatedAttributeTest extends MESystemAbstractTest {

        @Test
        public void testChangeSmartCableStatusOn10Cables() {
            GtGtApi<?> api = this.initEmpty("ChangeSmartCableStatusOn10Cables.xmi");
            api.getGTEngine().setAlwaysUpdatePrior(true);
            assertApplicableAndApply(api.mesystem());
            assertApplicableAndApply(api.core("Core2",50));
            assertApplicableAndApply(api.core("Core1",50));
            // Create 10 SmartCables
            for (int i = 0; i < 10; i++) {
                assertApplicableAndApply(api.smartCable("SmartCable1","Inactive",COLOR.BLUE, i));
            }

            // Change the status of each SmartCable
            for (int i = 0; i < 10; i++) {
                assertApplicableAndApply(api.changeSmartCableStatus("SmartCable" + i, "Active"));
                assertEquals(1, api.findSmartCableByStatus("Active").countMatches());
            }

            // Ensure all cables have the new status
            for (int i = 0; i < 10; i++) {
                assertEquals(1, api.findSmartCableByStatus("Active").countMatches());
            }

            terminate(api);
        }

        @Test
        public void testChangeCorePowerOutputOn5Cores() {
            GtGtApi<?> api = this.initEmpty("ChangeCorePowerOutputOn5Cores.xmi");
            api.getGTEngine().setAlwaysUpdatePrior(true);

            assertApplicableAndApply(api.mesystem());
            
            // Create 5 cores
            for (int i = 0; i < 5; i++) {
                assertApplicableAndApply(api.core("Core" + i,0));
            }

            // Change the power output of each core
            for (int i = 0; i < 5; i++) {
                assertApplicableAndApply(api.changeCorePowerOutput("Core" + i, 1500 + i * 100));
                assertEquals(1, api.findCoreByPowerOutput(1500 + i * 100).countMatches());
            }

            // Ensure all cores have the correct power output
            for (int i = 0; i < 5; i++) {
                assertEquals(1, api.findCoreByPowerOutput(1500 + i * 100).countMatches());
            }

            terminate(api);
        }

    }
    
    @Test
    public void testChangeItemNamesOn10Items() {
        GtGtApi<?> api = this.initEmpty("ChangeItemNamesOn10Items.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core("Core2",50));
        assertApplicableAndApply(api.core("Core1",50));
        assertApplicableAndApply(api.smartCable("SmartCable1","Inactive",COLOR.PINK, 3));
        assertApplicableAndApply(api.meinterface("Interface2"));
		assertApplicableAndApply(api.denseCable("DenseCable1", 4, COLOR.PINK, 3));
		assertApplicableAndApply(api.denseCable("DenseCable2", 4, COLOR.PINK, 3));
		assertApplicableAndApply(api.bus("Bus1",6));
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell1K());
        assertApplicableAndApply(api.bus());
        assertApplicableAndApply(api.recipe("Burger", 5,5));
        assertApplicableAndApply(api.recipe("Burger2", 5,5));
        assertApplicableAndApply(api.recipe("Burger3", 5,5));
        // Create 10 Items
        for (int i = 1; i <= 10; i++) {
            assertApplicableAndApply(api.item("Item" + i));
        }

        // Change the name of each Item
        for (int i = 1; i <= 10; i++) {
            assertApplicableAndApply(api.changeItemName("Item" + i, "NewItem" + i));
            assertEquals(1, api.findItemByName("NewItem" + i).countMatches());
        }

        // Ensure all items have the new names
        for (int i = 1; i <= 10; i++) {
            assertEquals(1, api.findItemByName("NewItem" + i).countMatches());
        }

        terminate(api);
    }

    @Test
    public void testChangeRecipeNumOfStepsOn5Recipes() {
        GtGtApi<?> api = this.initEmpty("ChangeRecipeNumOfStepsOn5Recipes.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core("Core2",50));
        assertApplicableAndApply(api.core("Core1",50));
        assertApplicableAndApply(api.smartCable("SmartCable1","Inactive",COLOR.PINK, 3));
        assertApplicableAndApply(api.meinterface("Interface2"));
		assertApplicableAndApply(api.denseCable("DenseCable1", 4, COLOR.PINK, 3));
		assertApplicableAndApply(api.denseCable("DenseCable2", 4, COLOR.PINK, 3));
		assertApplicableAndApply(api.bus("Bus1",6));
		assertApplicableAndApply(api.drive());
		assertApplicableAndApply(api.storageCell1K());
        assertApplicableAndApply(api.bus());
        // Create 5 Recipes
        for (int i = 1; i <= 5; i++) {
            assertApplicableAndApply(api.recipe("Recipe" + i, i + 1, 3));
        }

        // Change the number of steps of each Recipe
        for (int i = 1; i <= 5; i++) {
            assertApplicableAndApply(api.changeRecipeNumOfSteps("Recipe" + i, i * 2));
            assertEquals(1, api.findRecipeByNumOfSteps(i * 2).countMatches());
        }

        // Ensure all recipes have the correct number of steps
        for (int i = 1; i <= 5; i++) {
            assertEquals(1, api.findRecipeByNumOfSteps(i * 2).countMatches());
        }

        terminate(api);
    }
    
    @Test
    public void testChangeBusSpeedsOn5Buses() {
        GtGtApi<?> api = this.initEmpty("ChangeBusSpeedsOn5Buses.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);

        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core("Core2",50));
        assertApplicableAndApply(api.core("Core1",50));
        assertApplicableAndApply(api.smartCable("SmartCable1","Inactive",COLOR.PINK, 3));
        assertApplicableAndApply(api.meinterface("Interface2"));
		assertApplicableAndApply(api.denseCable("DenseCable1", 4, COLOR.PINK, 3));
		assertApplicableAndApply(api.denseCable("DenseCable2", 4, COLOR.PINK, 3));
        // Create 5 Buses
        for (int i = 1; i <= 5; i++) {
            assertApplicableAndApply(api.bus("Bus" + i,0));
        }

        // Change the speed of each Bus
        for (int i = 1; i <= 5; i++) {
            assertApplicableAndApply(api.changeBusSpeed("Bus" + i, 100 + i * 100));
            assertEquals(1, api.findBusBySpeed(100 + i * 100).countMatches());
        }

        // Ensure all buses have the correct speeds
        for (int i = 1; i <= 5; i++) {
            assertEquals(1, api.findBusBySpeed(100 + i * 100).countMatches());
        }

        terminate(api);
    }
    
    @Test
    public void testChangeCorePowerOutputOn5Cores() {
        GtGtApi<?> api = this.initEmpty("ChangeCorePowerOutputOn4Cores.xmi");
        api.getGTEngine().setAlwaysUpdatePrior(true);
        assertApplicableAndApply(api.mesystem());
        // Create 4 Cores
        for (int i = 1; i <= 4; i++) {
            assertApplicableAndApply(api.core("Core" + i,0));
        }

        // Change the power output of each Core
        for (int i = 1; i <= 4; i++) {
            assertApplicableAndApply(api.changeCorePowerOutput("Core" + i, 1000 + i * 500));
            assertEquals(1, api.findCoreByPowerOutput(1000 + i * 500).countMatches());
        }

        // Ensure all cores have the correct power output
        for (int i = 1; i <= 4; i++) {
            assertEquals(1, api.findCoreByPowerOutput(1000 + i * 500).countMatches());
        }

        terminate(api);
    }








	
}

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

	@Test
	//Change multiple attribute values manually and check if they are still found
    public void testAttributeChanges() {
        GtGtApi<?> api = this.initEmpty("AttributeChange.xmi");

        assertApplicableAndApply(api.mesystem());
        assertApplicableAndApply(api.core());
        assertApplicableAndApply(api.denseCable());
        assertApplicableAndApply(api.bus());
        assertApplicableAndApply(api.drive());
        assertApplicableAndApply(api.storageCell16K());
        assertApplicableAndApply(api.meinterface());
        assertApplicableAndApply(api.recipe("Bread", 5));
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

	
}

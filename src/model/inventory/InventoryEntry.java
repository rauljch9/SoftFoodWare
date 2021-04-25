package model.inventory;

import java.util.Date;
import java.util.List;

/**
 * This class wil be used to create documents that add stock to the Inventory
 */
public class InventoryEntry {
    Date date;
    List<InventoryEntryDetail> inventoryEntryDetailList;
}

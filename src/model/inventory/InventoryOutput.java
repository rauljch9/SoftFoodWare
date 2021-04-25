package model.inventory;

import java.util.Date;
import java.util.List;

/**
 * This class wil be used to create documents that remove stock to the Inventory
 */
public class InventoryOutput {
    Date date;
    List<InventoryOutputDetail> inventoryOutputDetailList;
}

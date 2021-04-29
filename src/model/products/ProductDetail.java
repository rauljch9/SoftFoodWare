package model.products;

import model.inventory.Ingredient;

/**
 * The "Product" class will have a "ProductDetail" list, which includes a list of ingredients with their amounts.
 */
public class ProductDetail {
    Ingredient ingredient;
    Double quantity;
    String note;
}

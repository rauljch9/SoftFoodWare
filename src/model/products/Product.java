package model.products;

import model.inventory.Ingredient;

import java.util.List;

/**
 * This is the main product class
 */
public class Product {
    int id;
    String name;
    String description;
    int preparationTime;
    Double price;
    List<ProductDetail> productDetailList;
}

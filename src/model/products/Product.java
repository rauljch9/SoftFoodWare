package model.products;

import model.inventory.Ingredient;

import java.util.List;

/**
 * This class represents a finished product, which is made with ingredients that are in inventory. That is why the product class has an ingredient list.
 */
public class Product {
    int id;
    String name;
    String description;
    int preparationTime;
    Double price;
    List<ProductDetail> productDetailList;

}

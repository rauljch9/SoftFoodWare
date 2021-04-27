package model.inventory;

/**
 * This class will be used for the inventory and final products for the preparation
 */
public class Ingredient{
    int id;
    String name;
    Double stock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }
}

package model.products;

import model.inventory.Ingredient;

/**
 * The "Product" class will have a "ProductDetail" list, which includes a list of ingredients with their amounts.
 */
public class ProductDetail {
    Ingredient ingredient;
    Double quantity;
    String note;

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

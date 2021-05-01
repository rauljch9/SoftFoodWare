package model.orders;

import model.products.Product;

/**
 * The OrderDetail has a product and a quantity, and will be used in the Order
 */
public class OrderDetail {
    Product product;
    int quantity;
    String note;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

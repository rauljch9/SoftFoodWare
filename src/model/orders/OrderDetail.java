package model.orders;


import model.Product;

/**
 * The OrderDetail has a product and a quantity, and will be used in the Order
 */
public class OrderDetail {
    Product product;
    Double quantity;
    String note;

    public OrderDetail() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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

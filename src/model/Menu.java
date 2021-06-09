package model;

import java.util.Collection;

public class Menu {
    Long id;
    Collection<Product> productList;

    public Menu() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void setProductList(Collection<Product> productList) {
        this.productList = productList;
    }
}

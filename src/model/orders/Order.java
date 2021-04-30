package model.orders;

import model.persons.Client;
import model.products.Product;

import java.util.List;

/**
 * The Order Class has this Client and the list of OrderDetail (list of product and quantity)
 */
public abstract class Order {
    int id;
    Client client;
    List<OrderDetail> orderDetailList;
    String note;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

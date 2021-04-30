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

}

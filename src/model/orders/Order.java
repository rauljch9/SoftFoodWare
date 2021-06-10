package model.orders;

import model.Product;
import model.persons.Client;
import java.util.HashMap;
import java.util.Map;

import java.util.Collection;

/**
 * The Order Class has this Client and the list of OrderDetail (list of product and quantity)
 */
public class Order {
    Integer id;
    Client client;
    Collection<OrderDetail> orderDetailList;
    String note;

    /**
     * @return The price of the list of products
     */
    public Double getProductListPrice(){
        Double totalPrice = 0.0;
        for (OrderDetail orderDetail: orderDetailList) {
            totalPrice+=orderDetail.getProduct().getPrice();
        }
        return totalPrice;
    }

    /**
     * @return this method calculates the estimated preparation time of the whole order. Estimated preparation time expressed in minutes.
     */
    public Double getEstimatedPreparationTime(){
        Double estimatedPreparationTime=0.0;
        for (OrderDetail orderDetail :
                this.orderDetailList) {
            estimatedPreparationTime+=orderDetail.getProduct().getPreparationTime();
        }
        return estimatedPreparationTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Collection<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(Collection<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }
    
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

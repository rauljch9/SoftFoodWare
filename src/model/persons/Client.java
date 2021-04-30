package model.persons;

import model.persons.Person;

/**
 * This represents the Clients that wil order
 */
public class Client extends Person {
    String defaultDeliveryAddress;

    public String getDefaultDeliveryAddress() {
        return defaultDeliveryAddress;
    }

    public void setDefaultDeliveryAddress(String defaultDeliveryAddress) {
        this.defaultDeliveryAddress = defaultDeliveryAddress;
    }
}

/**
 * Name: Dingnan Hsu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/03/2023
 * File Name: Driver.java
 * Description: The Driver class represents a driver who can be notified of new delivery requests from shops.
 * Each driver has an ID, a name, and a status indicating whether they're available for deliveries. The Driver class implements the Observer interface, allowing drivers to receive updates about new delivery requests.
 */
package edu.bu.met.cs665.observer;

import edu.bu.met.cs665.model.DeliveryRequest;

public class Driver implements Observer {
    private int id;
    private String name;
    private boolean isAvailable;

    /**
     * Constructs a new Driver with the given ID, name, and availability status.
     *
     * @param id          The unique ID of the driver.
     * @param name        The name of the driver.
     * @param isAvailable The availability status of the driver.
     */
    public Driver(int id, String name, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.isAvailable = isAvailable;
    }

    /**
     * Receives and processes the delivery request. If the driver is available,
     * details of the delivery request are printed.
     *
     * @param deliveryRequest The delivery request details.
     */
    @Override
    public void update(DeliveryRequest deliveryRequest) {
        if (isAvailable()) {
            System.out.println("Driver [ID: " + id + ", Name: " + name + "] notified of a new delivery request:");
            System.out.println("Description: " + deliveryRequest.getDescription());
            System.out.println("Product Name: " + deliveryRequest.getProductName());
            System.out.println("Pick-up Address: " + deliveryRequest.getPickupAddress());
            System.out.println("Destination Address: " + deliveryRequest.getDestinationAddress());
            System.out.println("Customer Name: " + deliveryRequest.getCustomerName());
            System.out.println("Customer Contact: " + deliveryRequest.getCustomerContact());
            System.out.println("--------------------------------------------------------");
        } else {
            System.out.println("Driver " + name + " is currently unavailable for deliveries.");
        }
    }

    /**
     * Retrieves the name of the driver.
     *
     * @return The name of the driver.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Checks the availability status of the driver.
     *
     * @return true if the driver is available, false otherwise.
     */
    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Sets the availability status of the driver.
     *
     * @param availability The new availability status.
     */
    @Override
    public void setAvailability(boolean availability) {
        this.isAvailable = availability;
    }
}

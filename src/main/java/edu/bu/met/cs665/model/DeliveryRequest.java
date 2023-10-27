/**
 * Name: Dingnan Hsu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/03/2023
 * File Name: DeliveryRequest.java
 * Description: The DeliveryRequest class encapsulates the details of a delivery request made by a customer.
 * It contains information about the product, pick-up and destination addresses, customer details, and a general description of the request.
 */
package edu.bu.met.cs665.model;

public class DeliveryRequest {

    private String description;
    private String productName;
    private String destinationAddress;
    private String pickupAddress;
    private String customerName;
    private String customerContact;

    /**
     * Constructs a new DeliveryRequest with all necessary details.
     *
     * @param description        A brief description of the delivery request.
     * @param productName        The name or description of the product to be
     *                           delivered.
     * @param destinationAddress The address where the product should be delivered.
     * @param pickupAddress      The address where the product should be picked up.
     * @param customerName       The name of the customer requesting the delivery.
     * @param customerContact    Contact details of the customer.
     */
    public DeliveryRequest(String description, String productName, String destinationAddress,
            String pickupAddress, String customerName, String customerContact) {
        this.description = description;
        this.productName = productName;
        this.destinationAddress = destinationAddress;
        this.pickupAddress = pickupAddress;
        this.customerName = customerName;
        this.customerContact = customerContact;
    }

    // Getters
    public String getDescription() {
        return description;
    }

    public String getProductName() {
        return productName;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public String getPickupAddress() {
        return pickupAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    // Setters
    public void setDescription(String description) {
        this.description = description;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public void setPickupAddress(String pickupAddress) {
        this.pickupAddress = pickupAddress;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }
}

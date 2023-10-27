package edu.bu.met.cs665.model;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class DeliveryRequestTest {

    private DeliveryRequest deliveryRequest;

    @Before
    public void setUp() {
        deliveryRequest = new DeliveryRequest(
                "Test Description",
                "Test Product",
                "Test Destination",
                "Test Pickup",
                "Test Customer",
                "Test Contact");
    }

    @Test
    public void testGetDescription() {
        assertEquals("Test Description", deliveryRequest.getDescription());
    }

    @Test
    public void testGetProductName() {
        assertEquals("Test Product", deliveryRequest.getProductName());
    }

    @Test
    public void testGetDestinationAddress() {
        assertEquals("Test Destination", deliveryRequest.getDestinationAddress());
    }

    @Test
    public void testGetPickupAddress() {
        assertEquals("Test Pickup", deliveryRequest.getPickupAddress());
    }

    @Test
    public void testGetCustomerName() {
        assertEquals("Test Customer", deliveryRequest.getCustomerName());
    }

    @Test
    public void testGetCustomerContact() {
        assertEquals("Test Contact", deliveryRequest.getCustomerContact());
    }

    @Test
    public void testSetDescription() {
        deliveryRequest.setDescription("New Description");
        assertEquals("New Description", deliveryRequest.getDescription());
    }

    @Test
    public void testSetProductName() {
        deliveryRequest.setProductName("New Product");
        assertEquals("New Product", deliveryRequest.getProductName());
    }

    @Test
    public void testSetDestinationAddress() {
        deliveryRequest.setDestinationAddress("New Destination");
        assertEquals("New Destination", deliveryRequest.getDestinationAddress());
    }

    @Test
    public void testSetPickupAddress() {
        deliveryRequest.setPickupAddress("New Pickup");
        assertEquals("New Pickup", deliveryRequest.getPickupAddress());
    }

    @Test
    public void testSetCustomerName() {
        deliveryRequest.setCustomerName("New Customer");
        assertEquals("New Customer", deliveryRequest.getCustomerName());
    }

    @Test
    public void testSetCustomerContact() {
        deliveryRequest.setCustomerContact("New Contact");
        assertEquals("New Contact", deliveryRequest.getCustomerContact());
    }
}

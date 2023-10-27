package edu.bu.met.cs665.observer;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.bu.met.cs665.model.DeliveryRequest;

public class DriverTest {

    private Driver driver;
    private DeliveryRequest request;

    @Before
    public void setUp() {
        driver = new Driver(1, "Test Driver", true);

        request = new DeliveryRequest(
                "Test Delivery",
                "Test Product",
                "123 Test St, Test City",
                "456 Pickup St, Test City",
                "Test Customer",
                "555-1234");
    }

    @Test
    public void testGetName() {
        assertEquals("Test Driver", driver.getName());
    }

    @Test
    public void testIsAvailable() {
        assertEquals(true, driver.isAvailable());
    }

    @Test
    public void testSetAvailability() {
        driver.setAvailability(false);
        assertEquals(false, driver.isAvailable());
    }

    @Test
    public void testUpdate() {
        driver.update(request);
    }
}

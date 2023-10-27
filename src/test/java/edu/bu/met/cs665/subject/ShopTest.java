package edu.bu.met.cs665.subject;

import org.junit.Before;
import org.junit.Test;

import edu.bu.met.cs665.model.DeliveryRequest;
import edu.bu.met.cs665.observer.Driver;

public class ShopTest {

    private Shop shop;
    private DeliveryRequest request;
    private Driver driver1, driver2;

    @Before
    public void setUp() {
        shop = new Shop();

        driver1 = new Driver(1, "Driver One", true);
        driver2 = new Driver(2, "Driver Two", false);

        request = new DeliveryRequest(
                "Test Delivery",
                "Test Product",
                "123 Test St, Test City",
                "456 Pickup St, Test City",
                "Test Customer",
                "555-1234");
    }

    @Test
    public void testRegisterAndNotifyObservers() {
        shop.registerObserver(driver1);
        shop.registerObserver(driver2);
        shop.newDeliveryRequest(request);
    }

    @Test
    public void testRemoveObserver() {
        shop.registerObserver(driver1);
        shop.registerObserver(driver2);
        // Remove one driver
        shop.removeObserver(driver1);
        shop.newDeliveryRequest(request);
    }
}

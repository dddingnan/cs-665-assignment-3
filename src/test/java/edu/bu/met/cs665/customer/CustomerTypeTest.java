package edu.bu.met.cs665.customer;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTypeTest {

    @Test
    public void testCustomerTypes() {
        // Check if the enum contains the expected number of constants
        assertEquals(5, CustomerType.values().length);

        // Test each enum constant to ensure they exist
        assertNotNull(CustomerType.VIP);
        assertNotNull(CustomerType.BUSINESS);
        assertNotNull(CustomerType.RETURNING);
        assertNotNull(CustomerType.FREQUENT);
        assertNotNull(CustomerType.NEW);
    }
}

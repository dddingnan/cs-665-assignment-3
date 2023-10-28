package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.customer.*;
import edu.bu.met.cs665.email.EmailTemplate;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerFactoryTest {

    private final EmailTemplate vipTemplate = new EmailTemplate("VIP", "This is a vip template.");
    private final EmailTemplate dummyTemplate = new EmailTemplate("DUMMY", "This is a dummy template.");

    @Test
    public void testCreateVIPCustomer() {
        Customer customer = CustomerFactory.createCustomer(CustomerType.VIP, vipTemplate);
        assertTrue(customer instanceof VIPCustomer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateUnknownCustomer() {
        // To test the default case in the not exist customer.
        CustomerFactory.createCustomer(null, dummyTemplate);
    }
}

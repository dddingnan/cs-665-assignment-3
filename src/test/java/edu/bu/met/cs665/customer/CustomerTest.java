import edu.bu.met.cs665.customer.Customer;
import edu.bu.met.cs665.customer.CustomerType;
import edu.bu.met.cs665.email.EmailTemplate;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    // Mock subclass of Customer for testing
    private class MockCustomer extends Customer {
        
        public MockCustomer(EmailTemplate template) {
            super(template);
        }

        @Override
        public CustomerType getType() {
            return CustomerType.BUSINESS;  // just a mock return for the test
        }
    }

    @Test
    public void testConstructorAndGetters() {
        EmailTemplate template = new EmailTemplate(CustomerType.BUSINESS.toString(), "Mock Business Welcome Email");
        
        Customer mockCustomer = new MockCustomer(template);
        
        assertEquals("Mock Business Welcome Email", mockCustomer.getEmailMessage());
    }

    @Test
    public void testGetType() {
        EmailTemplate template = new EmailTemplate(CustomerType.BUSINESS.toString(), "Mock Business Welcome Email");
        
        Customer mockCustomer = new MockCustomer(template);
        
        assertEquals(CustomerType.BUSINESS, mockCustomer.getType());
    }
}

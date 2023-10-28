/**
 * Name: Dingnan Hsu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/28/2023
 * File Name: CustomerFactory.java
 * 
 * Description:
 * Factory class responsible for creating and returning instances of different customer types.
 */
package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.customer.*;
import edu.bu.met.cs665.email.EmailTemplate;

public class CustomerFactory {

    /**
     * Creates a customer of the specified type, initialized with the given email
     * template.
     *
     * @param type     The type of customer to create.
     * @param template The email template associated with the customer.
     * @return A new instance of the specified customer type.
     * @throws IllegalArgumentException If the provided customer type is unknown.
     */
    public static Customer createCustomer(CustomerType type, EmailTemplate template) {
        if (type == null) {
            throw new IllegalArgumentException("Customer type cannot be null");
        }
        switch (type) {
            case VIP:
                return new VIPCustomer(template);
            case BUSINESS:
                return new BusinessCustomer(template);
            case RETURNING:
                return new ReturningCustomer(template);
            case FREQUENT:
                return new FrequentCustomer(template);
            case NEW:
                return new NewCustomer(template);
            default:
                throw new IllegalArgumentException("Unknown customer type: " + type);
        }
    }
}
